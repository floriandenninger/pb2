package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class imt implements afwx, aeen {
    public final boolean a;
    public final boolean b;
    public final acsw c;
    public final aioc d;
    public final apxf e;
    public final ine f;
    public boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final long n;
    private final shf o;
    private final Executor p;
    private final ing q;
    private final amnv r;
    private final aeeo s;
    private final aaqz t;
    private final afsy u;
    private final long v;
    private aeem w;
    private imt x;
    private final aoae y;

    public imt(long j, apxf apxfVar, ine ineVar, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str, long j2, shf shfVar, Executor executor, acsw acswVar, aioc aiocVar, ing ingVar, aoae aoaeVar, amnv amnvVar, aeeo aeeoVar, aaqz aaqzVar, afsy afsyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        amkq.E(true);
        amkq.E(i2 >= i3);
        this.v = j;
        this.e = apxfVar;
        this.f = ineVar;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = z;
        this.a = z2;
        this.b = z3;
        this.l = z4;
        this.m = str;
        this.n = j2;
        this.o = shfVar;
        this.p = executor;
        this.c = acswVar;
        this.d = aiocVar;
        this.q = ingVar;
        this.y = aoaeVar;
        this.r = amnvVar;
        this.s = aeeoVar;
        this.t = aaqzVar;
        this.u = afsyVar;
    }

    public final void d() {
        this.g = true;
        aeem aeemVar = this.w;
        if (aeemVar != null) {
            aeemVar.a();
            this.w = null;
        }
        imt imtVar = this.x;
        if (imtVar != null) {
            imtVar.d();
            this.x = null;
        }
    }

    @Override // defpackage.aeen
    public final void e() {
        this.w = null;
    }

    @Override // defpackage.aeen
    public final void f() {
        this.w = null;
    }

    @Override // defpackage.aeej
    public final void g(FormatStreamModel formatStreamModel, long j) {
    }

    @Override // defpackage.aeen
    public final void h() {
    }

    @Override // defpackage.aeen
    public final void i(int i) {
        this.w = null;
    }

    @Override // defpackage.aeen
    public final boolean j() {
        return !this.g;
    }

    @Override // defpackage.aeen
    public final void k() {
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0193 A[LOOP:0: B:64:0x0191->B:65:0x0193, LOOP_END] */
    @Override // defpackage.cnl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void kZ(java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imt.kZ(java.lang.Object):void");
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
