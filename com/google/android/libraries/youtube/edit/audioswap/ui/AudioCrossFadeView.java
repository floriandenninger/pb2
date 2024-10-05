package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import defpackage.vsy;
import defpackage.vsz;
import defpackage.yny;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AudioCrossFadeView extends FrameLayout implements SeekBar.OnSeekBarChangeListener, vsz {
    public final YouTubeTextView a;
    public final YouTubeTextView b;
    public final SeekBar c;
    public vsy d;
    public int e;

    public AudioCrossFadeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 1308622847;
        View inflate = LayoutInflater.from(context).inflate(R.layout.audio_swap_audio_cross_fade_view, (ViewGroup) this, true);
        this.a = (YouTubeTextView) inflate.findViewById(R.id.audio_swap_cross_fade_view_original_audio_text);
        this.b = (YouTubeTextView) inflate.findViewById(R.id.audio_swap_cross_fade_view_music_track_text);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.audio_swap_cross_fade_view_slider);
        this.c = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override // defpackage.vsz
    public final void a(vsy vsyVar, Set set) {
    }

    @Override // defpackage.vsz
    public final void b(vsy vsyVar, int i) {
        this.c.setProgress(Math.round(this.d.e() * 100.0f));
    }

    @Override // defpackage.vsz
    public final void c(vsy vsyVar, Set set) {
    }

    public final void d(View view, int i, int i2) {
        yny.z(view, yny.s(i, 0, i2, 0), ViewGroup.MarginLayoutParams.class);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float progress = seekBar.getProgress() / 100.0f;
        vsy vsyVar = this.d;
        if (vsyVar != null) {
            vsyVar.y(progress);
        }
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        this.a.setTextColor(((Integer) argbEvaluator.evaluate(1.0f - progress, Integer.valueOf(this.e), -1)).intValue());
        this.b.setTextColor(((Integer) argbEvaluator.evaluate(progress, Integer.valueOf(this.e), -1)).intValue());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
