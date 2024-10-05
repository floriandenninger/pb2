package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bde extends bar {
    public static final pms d;
    public static final byte[] e;
    private static final pnd f;
    private final long g;
    private final pnd h;

    static {
        pmr pmrVar = new pmr();
        pmrVar.k = "audio/raw";
        pmrVar.x = 2;
        pmrVar.y = 44100;
        pmrVar.z = 2;
        pms a = pmrVar.a();
        d = a;
        pmx pmxVar = new pmx();
        pmxVar.b("SilenceMediaSource");
        pmxVar.a = Uri.EMPTY;
        pmxVar.b = a.n;
        f = pmxVar.a();
        e = new byte[pts.j(2, 2) * 1024];
    }

    public bde(long j) {
        pnd pndVar = f;
        pse.e(j >= 0);
        this.g = j;
        this.h = pndVar;
    }

    public static long t(long j) {
        return pts.j(2, 2) * ((j * 44100) / 1000000);
    }

    @Override // defpackage.bar
    protected final void k() {
    }

    @Override // defpackage.bbr
    public final pnd r() {
        return this.h;
    }

    @Override // defpackage.bar
    protected final void rq(att attVar) {
        rw(new bdf(this.g, true, false, this.h));
    }

    @Override // defpackage.bbr
    public final void s() {
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
    }

    @Override // defpackage.bbr
    public final bbp v(ash ashVar, bfg bfgVar, long j) {
        return new bdc(this.g);
    }
}
