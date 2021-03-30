package com.pouyaheydari.training.android.basic.bootcamp00;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class TestCustomTextView extends AppCompatTextView {

    public TestCustomTextView(Context context) {
        super(context);
    }

    public TestCustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        Typeface vazir = Typeface.createFromAsset(context.getAssets(), "vazir.ttf");
        setTypeface(vazir);
    }
}
