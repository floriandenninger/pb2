package defpackage;

import android.widget.SeekBar;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hod implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ hoj a;
    private int b;

    public hod(hoj hojVar) {
        this.a = hojVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.a.s(i);
            this.b++;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        hnf hnfVar;
        this.a.j.removeCallbacksAndMessages(null);
        hoj hojVar = this.a;
        hojVar.z.d = null;
        if (!hojVar.p || (hnfVar = hojVar.o) == null) {
            return;
        }
        hnfVar.e();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        hoj hojVar = this.a;
        ammv a = hojVar.z.a(hojVar.t);
        if (a.h()) {
            hfq a2 = this.a.D.a(acsb.c(131968));
            a2.a = hoj.v(((Long) a.c()).longValue());
            a2.b();
            this.a.r(((Long) a.c()).longValue());
            this.a.s(((Long) a.c()).longValue());
            this.a.l(((Long) a.c()).longValue());
            this.a.z.d = (Long) a.c();
            if (this.a.z.b().h()) {
                this.a.r.setImageResource(R.drawable.shorts_music_waveform_selected_dsp_area);
            }
            hfq a3 = this.a.D.a(acsb.c(107600));
            a3.a = hoj.v(((Long) a.c()).longValue());
            a3.c();
        } else {
            hoj hojVar2 = this.a;
            hojVar2.l(hojVar2.t);
            hoj hojVar3 = this.a;
            long j = hojVar3.t;
            if (this.b > 1) {
                hfq a4 = hojVar3.D.a(acsb.c(107600));
                a4.a = hoj.v(j);
                a4.f();
            } else {
                hfq a5 = hojVar3.D.a(acsb.c(107600));
                a5.a = hoj.v(j);
                a5.b();
            }
            this.b = 0;
            this.a.r.setImageResource(R.drawable.shorts_music_waveform_area);
        }
        this.a.b.execute(new Runnable() { // from class: hoc
            @Override // java.lang.Runnable
            public final void run() {
                hod.this.a.u();
            }
        });
    }
}
