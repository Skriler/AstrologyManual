package edu.itstep.astrologymanual.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import edu.itstep.astrologymanual.R;
import edu.itstep.astrologymanual.adapters.ZodiacListAdapter;
import edu.itstep.astrologymanual.entities.ZodiacSign;
import edu.itstep.astrologymanual.fragments.ZodiacInfoFragment;
import edu.itstep.astrologymanual.services.ZodiacService;

@RequiresApi(api = Build.VERSION_CODES.N)
public class MainActivity extends AppCompatActivity {
    public static final String ZODIAC_SIGN_LIST_TAG = "zodiacSignList";

    private ArrayList<ZodiacSign> zodiacSigns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zodiacSigns = ZodiacService.getZodiacSignList();

        initializeZodiacGridView();
    }

    private void initializeZodiacGridView() {
        ZodiacListAdapter adapterZodiac = new ZodiacListAdapter(
                this,
                ZodiacService.getZodiacTitles(),
                ZodiacService.getZodiacImages()
        );
        GridView gridViewZodiacList = findViewById(R.id.gridViewZodiacList);
        gridViewZodiacList.setAdapter(adapterZodiac);

        gridViewZodiacList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showZodiacInfoFragment(zodiacSigns.get(position));
            }
        });
    }

    private void showZodiacInfoFragment(ZodiacSign selectedZodiacSign) {
        Bundle args = new Bundle();
        args.putSerializable(ZODIAC_SIGN_LIST_TAG, selectedZodiacSign);
        ZodiacInfoFragment zodiacInfoFragment = new ZodiacInfoFragment();
        zodiacInfoFragment.setArguments(args);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frgContainerView, zodiacInfoFragment)
                .commit();
    }


}