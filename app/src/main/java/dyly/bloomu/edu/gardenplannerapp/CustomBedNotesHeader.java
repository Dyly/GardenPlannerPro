package dyly.bloomu.edu.gardenplannerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by EVANDESKTOP on 11/5/2015.
 */
public class CustomBedNotesHeader extends LinearLayout
{

    public CustomBedNotesHeader(Context context)
    {
        super(context, null);

        final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.custom_bed_notes_header, this);
    }
}
