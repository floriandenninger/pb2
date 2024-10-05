package com.google.android.libraries.youtube.edit.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import com.google.android.youtube.R;
import defpackage.hqv;
import defpackage.vsy;
import defpackage.vwl;
import defpackage.zga;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TrimVideoControllerView extends vwl {
    public ImageView f;
    public final View g;
    public boolean h;
    public hqv i;

    public TrimVideoControllerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.video_progress_view, (ViewGroup) this, true);
        SeekBar seekBar = (SeekBar) findViewById(R.id.play_progress_bar);
        h((TextView) findViewById(R.id.play_position_text), (TextView) findViewById(R.id.video_duration_text), seekBar);
        this.g = findViewById(R.id.video_progress_container);
        seekBar.setOnTouchListener(new View.OnTouchListener() { // from class: zyb
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                TrimVideoControllerView trimVideoControllerView = TrimVideoControllerView.this;
                if (trimVideoControllerView.i == null || motionEvent.getAction() != 1) {
                    return false;
                }
                trimVideoControllerView.i.a.aF.a(acsb.c(110246)).f();
                return false;
            }
        });
    }

    @Override // defpackage.vwl, defpackage.vsz
    public final void a(vsy vsyVar, Set set) {
        super.a(vsyVar, set);
        v();
    }

    @Override // defpackage.vwl, defpackage.vsz
    public final void c(vsy vsyVar, Set set) {
        super.c(vsyVar, set);
        if (u()) {
            return;
        }
        w();
    }

    @Override // defpackage.vwl, android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        super.onStartTrackingTouch(seekBar);
        this.h = true;
    }

    @Override // defpackage.vwl, android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        super.onStopTrackingTouch(seekBar);
        this.h = false;
    }

    @Override // defpackage.vwl
    public final void p() {
        super.p();
        if (u() || t()) {
            v();
        } else {
            w();
        }
    }

    @Override // defpackage.vwl
    public final void q() {
    }

    final void v() {
        ImageView imageView = this.f;
        if (imageView == null) {
            zga.b("PlayButton is null");
        } else {
            imageView.setVisibility(4);
        }
    }

    final void w() {
        ImageView imageView = this.f;
        if (imageView == null) {
            zga.b("PlayButton is null");
        } else {
            imageView.setVisibility(0);
        }
    }
}
