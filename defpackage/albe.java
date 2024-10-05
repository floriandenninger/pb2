package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class albe extends alct {
    public final aseb a;
    public final akxh b;
    private final Context c;
    private final afsy e;
    private final wco f;
    private final axar g;
    private final alej h;
    private final aleo i;
    private final akyg k;
    private final akwg l;
    private final axze m;

    public albe(Context context, shf shfVar, aaea aaeaVar, aseb asebVar, afsy afsyVar, wco wcoVar, akxh akxhVar, akyo akyoVar, aleh alehVar, axze axzeVar, alej alejVar, aleo aleoVar, akwg akwgVar, akyb akybVar, albx albxVar, alaj alajVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(avtr.UPLOAD_PROCESSOR_TYPE_CREATE_TRANSFER, shfVar, aaeaVar, axzeVar, akybVar, albxVar, alajVar, alepVar, null, null, null);
        this.c = context;
        this.a = asebVar;
        this.e = afsyVar;
        this.f = wcoVar;
        this.b = akxhVar;
        this.m = axzeVar;
        this.h = alejVar;
        this.i = aleoVar;
        this.l = akwgVar;
        this.k = new akyg(alehVar, akyoVar);
        axaq a = axar.a();
        a.a = 0L;
        this.g = a.a();
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return this.k;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.K;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r1 == 0) goto L9;
     */
    @Override // defpackage.albk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy c(java.lang.String r11, defpackage.akwm r12, defpackage.akzs r13) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albe.c(java.lang.String, akwm, akzs):anhy");
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return agbc.s;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "CreateScottyHandleTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        int i = akzsVar.b;
        return ((i & 1) == 0 || (i & 2) == 0 || (i & 64) == 0) ? false : true;
    }
}
