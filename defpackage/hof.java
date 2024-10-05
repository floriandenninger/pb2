package defpackage;

import android.widget.SeekBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hof implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ hoj a;

    public hof(hoj hojVar) {
        this.a = hojVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.a.D.a(acsb.c(107600)).f();
            this.a.s(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        hnf hnfVar;
        this.a.j.removeCallbacksAndMessages(null);
        hoj hojVar = this.a;
        if (!hojVar.p || (hnfVar = hojVar.o) == null) {
            return;
        }
        hnfVar.e();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        hoj hojVar = this.a;
        hojVar.l(hojVar.t);
        this.a.b.execute(new Runnable() { // from class: hoe
            @Override // java.lang.Runnable
            public final void run() {
                hof.this.a.u();
            }
        });
    }
}
