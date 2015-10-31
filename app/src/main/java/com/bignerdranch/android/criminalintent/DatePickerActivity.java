package com.bignerdranch.android.criminalintent;


import android.support.v4.app.Fragment;


import java.util.Date;


/**
 * Created by ursberger1 on 10/20/15.
 */
public class DatePickerActivity extends SingleFragmentActivity {
    private static final String EXTRA_DATE_ID =
            "com.bignerdranch.anroid.criminalintent.crime_id";
    @Override
    protected Fragment createFragment(){
        Date date = (Date)getIntent().getSerializableExtra(EXTRA_DATE_ID);
        return DatePickerFragment.newInstance(date);
    }
}
