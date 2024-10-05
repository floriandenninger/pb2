package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alcc extends albk {
    private final afsy a;
    private final akxy b;
    private final akyo c;
    private final alaj e;
    private final alah f;
    private final aseb g;
    private final axze h;

    public alcc(aaea aaeaVar, afsy afsyVar, akxy akxyVar, akyo akyoVar, axze axzeVar, alaj alajVar, alah alahVar, aseb asebVar, akyb akybVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_PROCESS_VIDEO, akybVar, axzeVar, alepVar, null, null, null);
        this.a = afsyVar;
        this.b = akxyVar;
        this.h = axzeVar;
        this.c = akyoVar;
        this.e = alajVar;
        this.f = alahVar;
        this.g = asebVar;
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return this.c;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.ak;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        akzo akzoVar;
        avuc g;
        afsx d = this.a.d(akzsVar.e);
        if (d == null) {
            throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_IDENTITY_NOT_FOUND);
        }
        aone createBuilder = asdk.a.createBuilder();
        String str2 = akzsVar.k;
        createBuilder.copyOnWrite();
        asdk asdkVar = (asdk) createBuilder.instance;
        str2.getClass();
        asdkVar.b |= 2;
        asdkVar.d = str2;
        String str3 = akzsVar.Y;
        createBuilder.copyOnWrite();
        asdk asdkVar2 = (asdk) createBuilder.instance;
        str3.getClass();
        asdkVar2.b |= 4;
        asdkVar2.e = str3;
        if ((akzsVar.d & 32) != 0) {
            akzoVar = akzsVar.ap;
            if (akzoVar == null) {
                akzoVar = akzo.a;
            }
        } else {
            akzoVar = null;
        }
        apvb a = akzk.a(akzoVar);
        if (a != null) {
            createBuilder.copyOnWrite();
            asdk asdkVar3 = (asdk) createBuilder.instance;
            asdkVar3.g = a;
            asdkVar3.b |= 32;
        }
        Uri parse = Uri.parse(akzsVar.f);
        if (this.f.c(parse)) {
            g = this.f.a(parse, akzsVar.H, akzsVar.al);
        } else {
            alaj alajVar = this.e;
            int m = akwg.m(akzsVar.s);
            if (m == 0) {
                m = 1;
            }
            g = alajVar.d(m, parse, null).g(akzsVar.H, akzsVar.al);
        }
        createBuilder.copyOnWrite();
        asdk asdkVar4 = (asdk) createBuilder.instance;
        g.getClass();
        asdkVar4.f = g;
        asdkVar4.b |= 8;
        akxy akxyVar = this.b;
        asdk asdkVar5 = (asdk) createBuilder.build();
        aasp aaspVar = akxyVar.i;
        akxm akxmVar = new akxm(akxyVar.f, d, asdkVar5.toBuilder(), null, null, null);
        akxmVar.i = aaec.b(akxyVar.j);
        akxmVar.k();
        int dp = amkq.dp(((asdl) aaspVar.d(akxmVar)).c);
        if (dp == 0) {
            dp = 1;
        }
        int i = dp - 1;
        if (i == 1) {
            return anaf.O(t(this.d.d(), true));
        }
        if (i == 2) {
            return anaf.O(t(this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED), true));
        }
        if (i == 3) {
            alep alepVar = this.d;
            avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            akzp akzpVar = akzsVar.ak;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            akzpVar.getClass();
            return anaf.O(t(alepVar.o(avtqVar, akzpVar, this.g.m, this.h), true));
        }
        this.h.d("ProcessVideoTaskUnknown processVideo response status.");
        return anaf.O(t(this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN), true));
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return albr.c;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "ProcessVideoTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        int i = akzsVar.c;
        if ((524288 & i) != 0 && (i & 32) != 0 && (i & 16) != 0) {
            akzq a = akzq.a(akzsVar.l);
            if (a == null) {
                a = akzq.UNKNOWN_UPLOAD;
            }
            if (a != akzq.REELS_UPLOAD) {
                return true;
            }
            akzp akzpVar = akzsVar.O;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            int l = akwg.l(akzpVar.c);
            if (l != 0 && l == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.albk
    public final akwp k(Throwable th, akzs akzsVar, boolean z) {
        if (th instanceof aasx) {
            alep alepVar = this.d;
            avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            akzp akzpVar = akzsVar.ak;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            akzpVar.getClass();
            return t(alepVar.o(avtqVar, akzpVar, this.g.m, this.h), z);
        }
        return super.k(th, akzsVar, z);
    }
}
