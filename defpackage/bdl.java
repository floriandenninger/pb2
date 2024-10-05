package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdl implements bjc {
    public pms a;
    private final int b;
    private final int c;
    private final pms d;
    private final big e = new big();
    private bjc f;
    private long g;

    public bdl(int i, int i2, pms pmsVar) {
        this.b = i;
        this.c = i2;
        this.d = pmsVar;
    }

    @Override // defpackage.bjc
    public final int B(atc atcVar, int i, boolean z) {
        bjc bjcVar = this.f;
        int i2 = pts.a;
        return bjcVar.e(atcVar, i, z);
    }

    public final void a(bdo bdoVar, long j) {
        if (bdoVar == null) {
            this.f = this.e;
            return;
        }
        this.g = j;
        bjc a = bdoVar.a(this.b, this.c);
        this.f = a;
        pms pmsVar = this.a;
        if (pmsVar != null) {
            a.rp(pmsVar);
        }
    }

    @Override // defpackage.bjc
    public final /* synthetic */ int e(atc atcVar, int i, boolean z) {
        return hp.d(this, atcVar, i, z);
    }

    @Override // defpackage.bjc
    public final /* synthetic */ void t(pth pthVar, int i) {
        hp.e(this, pthVar, i);
    }

    @Override // defpackage.bjc
    public final void u(pth pthVar, int i, int i2) {
        bjc bjcVar = this.f;
        int i3 = pts.a;
        bjcVar.t(pthVar, i);
    }

    @Override // defpackage.bjc
    public final void v(long j, int i, int i2, int i3, bjb bjbVar) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f = this.e;
        }
        bjc bjcVar = this.f;
        int i4 = pts.a;
        bjcVar.v(j, i, i2, i3, bjbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0085  */
    @Override // defpackage.bjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rp(defpackage.pms r22) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdl.rp(pms):void");
    }
}
