package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class albm extends albk {
    public final aaxn a;
    private final aseb b;
    private final akyo c;
    private final axze e;

    public albm(aaea aaeaVar, aseb asebVar, aaxn aaxnVar, akyo akyoVar, axze axzeVar, akyb akybVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_CANCELLATION, akybVar, axzeVar, alepVar, null, null, null);
        this.b = asebVar;
        this.a = aaxnVar;
        this.e = axzeVar;
        this.c = akyoVar;
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return null;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.ai;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        return anaf.O(t(this.d.d(), true));
    }

    @Override // defpackage.aldq
    public final anhy d(final String str, final akwm akwmVar) {
        return anaf.T(new anfy() { // from class: albl
            @Override // defpackage.anfy
            public final anhy a() {
                albm albmVar = albm.this;
                akzs o = albmVar.o(str, akwmVar, false);
                abdm k = albmVar.a.k(o.e);
                k.k();
                k.a = o.Y;
                if (!albmVar.a.m(k).c) {
                    throw new aasx("Video deletion failed");
                }
                return anaf.O(albmVar.t(albmVar.d.d(), false));
            }
        }, angq.a);
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return agbc.u;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "DeleteVideoOnCancellationTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return false;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        return ((akzsVar.b & 1) == 0 || (akzsVar.c & 524288) == 0) ? false : true;
    }

    @Override // defpackage.aldq
    public final boolean j() {
        return true;
    }

    @Override // defpackage.albk
    public final akwp k(Throwable th, akzs akzsVar, boolean z) {
        if (th instanceof aasx) {
            alep alepVar = this.d;
            avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            akzp akzpVar = akzsVar.ai;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            akzpVar.getClass();
            return t(alepVar.o(avtqVar, akzpVar, this.b.g, this.e), z);
        }
        return super.k(th, akzsVar, z);
    }

    @Override // defpackage.aldq
    public final akyq l() {
        return this.c;
    }
}
