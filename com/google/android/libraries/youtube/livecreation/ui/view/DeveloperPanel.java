package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aclf;
import defpackage.aclg;
import defpackage.aclh;
import defpackage.acli;
import defpackage.amkq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeveloperPanel extends RelativeLayout {
    public SwitchCompat a;
    public Runnable b;
    public SeekBar c;
    public SeekBar d;
    private SwitchCompat e;

    public DeveloperPanel(Context context) {
        super(context);
        b(context);
    }

    private final void b(Context context) {
        inflate(context, R.layout.lc_developer_panel, this);
        setSaveEnabled(true);
        ((ImageButton) findViewById(R.id.dismiss_developer_button)).setOnClickListener(new aclf(this));
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.stats_for_nerds_toggle);
        this.a = switchCompat;
        switchCompat.setOnCheckedChangeListener(new aclg(1));
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R.id.enable_abr_setting_toggle);
        this.e = switchCompat2;
        switchCompat2.setOnCheckedChangeListener(new aclg(0));
        TextView textView = (TextView) findViewById(R.id.frame_rate_value);
        SeekBar seekBar = (SeekBar) findViewById(R.id.frame_rate_slider);
        this.c = seekBar;
        seekBar.setOnSeekBarChangeListener(new aclh(this, textView, 1));
        TextView textView2 = (TextView) findViewById(R.id.bitrate_value);
        SeekBar seekBar2 = (SeekBar) findViewById(R.id.bitrate_slider);
        this.d = seekBar2;
        seekBar2.setOnSeekBarChangeListener(new aclh(this, textView2, 0));
        a();
    }

    private static final int c(int i) {
        return ((i - 50000) / 1000) / 50;
    }

    private static final int d() {
        amkq.E(true);
        return 1;
    }

    public final void a() {
        this.a.setEnabled(false);
        if (!this.a.isChecked()) {
            Runnable runnable = this.b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.b = null;
            }
        } else if (this.b == null) {
            acli acliVar = new acli(this);
            this.b = acliVar;
            post(acliVar);
        }
        this.e.setEnabled(false);
        this.e.setChecked(false);
        this.c.setEnabled(false);
        SeekBar seekBar = this.c;
        d();
        seekBar.setMax(1);
        SeekBar seekBar2 = this.c;
        d();
        seekBar2.setProgress(1);
        this.d.setEnabled(false);
        this.d.setMax(c(2500000));
        this.d.setProgress(c(50000));
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            a();
        }
    }

    public DeveloperPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public DeveloperPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }
}
