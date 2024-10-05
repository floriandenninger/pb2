package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rju {
    protected long a;
    protected long b;
    public final res c;
    final /* synthetic */ rjw d;

    public rju(rjw rjwVar) {
        this.d = rjwVar;
        this.c = new rjt(this, rjwVar.w);
        rjwVar.Q();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j) {
        long j2 = this.b;
        this.b = j;
        return j - j2;
    }

    public final boolean b(boolean z, boolean z2, long j) {
        this.d.n();
        this.d.a();
        axuv.b();
        if (!this.d.J().o(rfd.ak)) {
            rfz rfzVar = this.d.M().n;
            this.d.Q();
            rfzVar.b(System.currentTimeMillis());
        } else if (this.d.w.v()) {
            rfz rfzVar2 = this.d.M().n;
            this.d.Q();
            rfzVar2.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = a(j);
            }
            this.d.aF().k.b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            rkm.D(this.d.k().p(!this.d.J().r()), bundle, true);
            if (!this.d.J().o(rfd.U) && z2) {
                bundle.putLong("_fr", 1L);
            }
            if (!this.d.J().o(rfd.U) || !z2) {
                this.d.j().v("auto", "_e", bundle);
            }
            this.a = j;
            this.c.a();
            this.c.c(3600000L);
            return true;
        }
        this.d.aF().k.b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.c.a();
    }
}
