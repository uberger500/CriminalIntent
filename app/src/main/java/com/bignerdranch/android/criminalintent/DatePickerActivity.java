package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.Date;
import java.util.List;
import java.util.UUID;

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
