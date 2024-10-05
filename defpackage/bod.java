package defpackage;

import android.widget.SeekBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bod implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ bof a;
    private final Runnable b = new boc(this);

    public bod(bof bofVar) {
        this.a = bofVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            bpv bpvVar = (bpv) seekBar.getTag();
            int i2 = bof.X;
            bpvVar.e(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        bof bofVar = this.a;
        if (bofVar.w != null) {
            bofVar.u.removeCallbacks(this.b);
        }
        this.a.w = (bpv) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.u.postDelayed(this.b, 500L);
    }
}
