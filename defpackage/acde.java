package defpackage;

import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acde implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ acdn a;

    public acde(acdn acdnVar) {
        this.a = acdnVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (zev.e(this.a.f)) {
            this.a.m(i / seekBar.getMax());
        }
        this.a.j();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.m(seekBar.getProgress() / seekBar.getMax());
    }
}
