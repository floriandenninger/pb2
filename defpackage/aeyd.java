package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeyd implements bik, bjc, piv {
    final ajcb a;
    public final piu b;
    public int d;
    final /* synthetic */ aeye h;
    private final ovw i;
    private pms j;
    public long c = -1;
    long e = -9223372036854775807L;
    long f = -9223372036854775807L;
    long g = 0;

    public aeyd(aeye aeyeVar, ajcb ajcbVar, String str) {
        this.h = aeyeVar;
        this.a = ajcbVar;
        if (aaov.e(str)) {
            pjc pjcVar = new pjc(0);
            pjcVar.f = this;
            this.b = pjcVar;
        } else if (aaov.b(str).endsWith("mp4")) {
            pjm pjmVar = new pjm(Collections.emptyList());
            pjmVar.a = this;
            this.b = pjmVar;
        } else {
            afes afesVar = new afes(1);
            int i = ajcbVar.c;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Error choosing extractor for itag ");
            sb.append(i);
            afesVar.b = sb.toString();
            afesVar.b("c", "unkmime");
            afesVar.c(ajcbVar.c);
            throw afesVar.a();
        }
        if (aaov.d(str)) {
            this.i = ovw.TRACK_TYPE_VIDEO;
        } else if (aaov.c(str)) {
            this.i = ovw.TRACK_TYPE_AUDIO;
        } else {
            afes afesVar2 = new afes(2);
            int i2 = ajcbVar.c;
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Error with track type of itag ");
            sb2.append(i2);
            afesVar2.b = sb2.toString();
            afesVar2.c(ajcbVar.c);
            throw afesVar2.a();
        }
        this.b.d(this);
    }

    @Override // defpackage.bjc
    public final int B(atc atcVar, int i, boolean z) {
        return this.h.a.b(this.i, this.j).B(atcVar, i, z);
    }

    @Override // defpackage.piv
    public final void a(long j, long j2) {
        int i;
        this.g += j2;
        long j3 = this.e;
        if (j3 == -9223372036854775807L || j < j3) {
            this.e = j;
        }
        long j4 = this.f;
        if (j4 == -9223372036854775807L || j > j4) {
            this.f = j;
        }
        aeyh aeyhVar = this.h.a;
        ajcb ajcbVar = this.a;
        ovw ovwVar = this.i;
        int i2 = this.d;
        aeyg c = aeyhVar.c(ovwVar);
        aeyf aeyfVar = c.c.isEmpty() ? null : (aeyf) amkq.bj(c.c);
        boolean z = true;
        if (aeyfVar != null && i2 != (i = aeyfVar.b) && i2 != i + 1) {
            z = false;
        }
        amkq.E(z);
        if (aeyfVar == null || aeyfVar.b != i2) {
            c.c.add(new aeyf(ajcbVar, i2, j, j2));
            return;
        }
        aeyfVar.e += j2;
        if (j < aeyfVar.c) {
            aeyfVar.c = j;
        }
        if (j > aeyfVar.d) {
            aeyfVar.d = j;
        }
    }

    @Override // defpackage.bjc
    public final /* synthetic */ int e(atc atcVar, int i, boolean z) {
        return hp.d(this, atcVar, i, z);
    }

    @Override // defpackage.bik
    public final bjc n(int i, int i2) {
        return this;
    }

    @Override // defpackage.bik
    public final void q() {
    }

    @Override // defpackage.bjc
    public final void rp(pms pmsVar) {
        ajcb ajcbVar = this.a;
        String b = ozv.b(ajcbVar.c, ajcbVar.e);
        pmr b2 = pmsVar.b();
        b2.a = b;
        this.j = b2.a();
    }

    @Override // defpackage.bjc
    public final /* synthetic */ void t(pth pthVar, int i) {
        hp.e(this, pthVar, i);
    }

    @Override // defpackage.bjc
    public final void u(pth pthVar, int i, int i2) {
        this.h.a.b(this.i, this.j).u(pthVar, i, i2);
    }

    @Override // defpackage.bjc
    public final void v(long j, int i, int i2, int i3, bjb bjbVar) {
        aeyh aeyhVar = this.h.a;
        pms pmsVar = this.j;
        ovw ovwVar = this.i;
        int i4 = this.d;
        bcx b = aeyhVar.b(ovwVar, pmsVar);
        b.e = i4;
        b.v(j, i, i2, i3, bjbVar);
    }

    @Override // defpackage.bik
    public final void w(biz bizVar) {
    }
}
