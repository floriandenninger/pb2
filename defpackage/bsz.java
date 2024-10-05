package defpackage;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsz implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ SeekBarPreference a;

    public bsz(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.c = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.c = false;
        int progress = seekBar.getProgress();
        SeekBarPreference seekBarPreference = this.a;
        if (progress + seekBarPreference.b != seekBarPreference.a) {
            seekBarPreference.l(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.a;
            if (seekBarPreference.f || !seekBarPreference.c) {
                seekBarPreference.l(seekBar);
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = this.a;
        seekBarPreference2.o(i + seekBarPreference2.b);
    }
}
