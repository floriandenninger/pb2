package defpackage;

import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsIntensitySliderView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hla implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ LinearLayout.LayoutParams b;
    final /* synthetic */ ShortsIntensitySliderView c;

    public hla(ShortsIntensitySliderView shortsIntensitySliderView, int i, LinearLayout.LayoutParams layoutParams) {
        this.c = shortsIntensitySliderView;
        this.a = i;
        this.b = layoutParams;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.c.a.a(ShortsIntensitySliderView.a(i));
            this.c.b.setText(String.valueOf(i));
            int width = seekBar.getWidth();
            int i2 = this.a;
            this.b.leftMargin = (int) ((width - i2) * ShortsIntensitySliderView.a(i));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.c.b.setVisibility(0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.c.b.setVisibility(4);
    }
}
