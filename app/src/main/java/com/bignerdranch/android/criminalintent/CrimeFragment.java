package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.text.format.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by ursberger1 on 10/6/15.
 */
public class CrimeFragment extends Fragment {

    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckbox;
  //  private DateFormat mDateFormat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, container, false);
        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mCrime.setTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        mDateButton = (Button)v.findViewById(R.id.crime_date);
       // mDateButton.setText(mCrime.getDate().toString());
   //     Date now = new Date();
      //  SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, MMM d, yyyy");
      //  mDateFormat = (DateFormat) dateFormatter.format(now);
        //mDateButton.setText(dateFormatter.format(now));
     //   mDateFormat = new android.text.format.DateFormat.format(now);
        // mDateFormat = DateFormat.getDateFormat(getContext());
       // mDateFormat = (DateFormat) DateFormat.getLongDateFormat(this.getActivity());
        //DateFormat dateFormat = android.text.format.DateFormat.getDateFormat();
        mDateButton.setText(android.text.format.DateFormat.format("EEEE, MMM dd, yyyy", new Date()));
        mDateButton.setEnabled(false);

        mSolvedCheckbox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setSolved(isChecked);
            }
        });
        return v;
    }
}