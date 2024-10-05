package defpackage;

import android.widget.SeekBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bob extends ji {
    final /* synthetic */ bof a;

    public bob(bof bofVar) {
        this.a = bofVar;
    }

    @Override // defpackage.ji
    public final void k(bpv bpvVar) {
        this.a.o(true);
    }

    @Override // defpackage.ji
    public final void m() {
        this.a.o(false);
    }

    @Override // defpackage.ji
    public final void n(bpv bpvVar) {
        SeekBar seekBar = (SeekBar) this.a.B.get(bpvVar);
        int i = bpvVar.n;
        if (seekBar == null || this.a.w == bpvVar) {
            return;
        }
        seekBar.setProgress(i);
    }
}
