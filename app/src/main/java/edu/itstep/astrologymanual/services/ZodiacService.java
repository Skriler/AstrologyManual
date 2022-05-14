package edu.itstep.astrologymanual.services;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.itstep.astrologymanual.R;
import edu.itstep.astrologymanual.entities.ZodiacSign;

@RequiresApi(api = Build.VERSION_CODES.N)
public class ZodiacService {

    public static ArrayList<String> getZodiacTitles() {
        List<String> zodiacSignTitles = getZodiacSignList()
                .stream()
                .map(ZodiacSign::getTitle)
                .collect(Collectors.toList());

        return (ArrayList<String>) zodiacSignTitles;
    }

    public static ArrayList<Integer> getZodiacImages() {
        List<Integer> zodiacSignTitles = getZodiacSignList()
                .stream()
                .map(ZodiacSign::getImage)
                .collect(Collectors.toList());

        return (ArrayList<Integer>) zodiacSignTitles;
    }

    public static ArrayList<ZodiacSign> getZodiacSignList() {
        ArrayList<ZodiacSign> zodiacSigns = new ArrayList<>();

        zodiacSigns.add(new ZodiacSign(
                "Pisces",
                R.drawable.pisces,
                "February 19 – March 20",
                "Aries loves to be number one. Naturally, this dynamic fire sign is no stranger to competition."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Aries",
                R.drawable.aries,
                "March 21 – April 19",
                "Pisces is the most intuitive, sensitive, and empathetic sign of the entire zodiac."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Taurus",
                R.drawable.taurus,
                "April 20 – May 20",
                "Taureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Gemini",
                R.drawable.gemini,
                "May 21 – June 20",
                "Spontaneous, playful, and adorably erratic, Gemini is driven by its insatiable curiosity."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Cancer",
                R.drawable.cancer,
                "June 21 – July 22",
                "Cancers are highly intuitive and their psychic abilities manifest in tangible spaces."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Leo",
                R.drawable.leo,
                "July 23 – August 22",
                "Leos delighted to embrace their royal status: Vivacious, theatrical, and fiery, Leos love to bask in the spotlight and celebrate."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Virgo",
                R.drawable.virgo,
                "August 23 – September 22",
                "Virgos are logical, practical, and systematic in their approach to life."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Libra",
                R.drawable.libra,
                "September 23 – October 22",
                "Balance, harmony, and justice define Libra energy. Libra is obsessed with symmetry and strives to create equilibrium in all areas of life."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Scorpio",
                R.drawable.scorpio,
                "October 23 – November 21",
                "Scorpio derives its extraordinary courage from its psychic abilities, which is what makes this sign one of the most complicated, dynamic signs of the zodiac."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Sagittarius",
                R.drawable.sagittarius,
                "November 22 – December 21",
                "Represented by the archer, Sagittarians are always on a quest for knowledge."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Capricorn",
                R.drawable.capricorn,
                "December 22 – January 19",
                "What is the most valuable resource? For Capricorn, the answer is clear: Time. Capricorns are skilled at navigating both the material and emotional realms."
        ));

        zodiacSigns.add(new ZodiacSign(
                "Aquarius",
                R.drawable.aquarius,
                "January 20 – February 18",
                "Aquarius is the most humanitarian astrological sign. At the end of the day, Aquarius is dedicated to making the world a better place."
        ));

        return zodiacSigns;
    }
}
