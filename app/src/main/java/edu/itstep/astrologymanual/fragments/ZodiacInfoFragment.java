package edu.itstep.astrologymanual.fragments;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import edu.itstep.astrologymanual.R;
import edu.itstep.astrologymanual.activities.MainActivity;
import edu.itstep.astrologymanual.entities.ZodiacSign;

@RequiresApi(api = Build.VERSION_CODES.N)
public class ZodiacInfoFragment extends Fragment {
    private ZodiacSign zodiacSign;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zodiac_info , null);

        if (getArguments() != null) {
            zodiacSign = (ZodiacSign) getArguments().getSerializable(MainActivity.ZODIAC_SIGN_LIST_TAG);
        }

        TextView tvZodiacTitle = view.findViewById(R.id.tvZodiacTitle);
        TextView tvZodiacDates = view.findViewById(R.id.tvZodiacDates);
        TextView tvZodiacDescription = view.findViewById(R.id.tvZodiacDescription);

        if (zodiacSign != null) {
            tvZodiacTitle.setText(zodiacSign.getTitle());
            tvZodiacDates.setText(zodiacSign.getDates());
            tvZodiacDescription.setText(zodiacSign.getDescription());
        }

        return view;
    }
}