package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alcg extends albk {
    private final afsy a;
    private final aseb b;
    private final akxy c;
    private final akyo e;
    private final axze f;

    public alcg(aaea aaeaVar, afsy afsyVar, aseb asebVar, akxy akxyVar, akyo akyoVar, axze axzeVar, akyb akybVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_REGISTER_VIDEO, akybVar, axzeVar, alepVar, null, null, null);
        this.a = afsyVar;
        this.b = asebVar;
        this.c = akxyVar;
        this.f = axzeVar;
        this.e = akyoVar;
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return this.e;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.N;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb  */
    @Override // defpackage.albk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy c(java.lang.String r12, defpackage.akwm r13, defpackage.akzs r14) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alcg.c(java.lang.String, akwm, akzs):anhy");
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return albr.d;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "RegisterVideoTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        return (akzsVar.b & 1) != 0;
    }

    @Override // defpackage.albk
    public final akwp k(Throwable th, akzs akzsVar, boolean z) {
        if (th instanceof aasx) {
            alep alepVar = this.d;
            avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            akzp akzpVar = akzsVar.N;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            akzpVar.getClass();
            return t(alepVar.o(avtqVar, akzpVar, this.b.f, this.f), z);
        }
        return super.k(th, akzsVar, z);
    }
}
