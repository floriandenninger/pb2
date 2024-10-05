package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class albh extends albk {
    public final aaxn a;
    private final afsy b;
    private final aseb c;
    private final akxy e;
    private final alaj f;
    private final alah g;
    private final akyo h;
    private final axze i;

    public albh(aaea aaeaVar, afsy afsyVar, aseb asebVar, akxy akxyVar, aaxn aaxnVar, alaj alajVar, alah alahVar, akyo akyoVar, axze axzeVar, akyb akybVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_CREATE_VIDEO, akybVar, axzeVar, alepVar, null, null, null);
        this.b = afsyVar;
        this.c = asebVar;
        this.e = akxyVar;
        this.a = aaxnVar;
        this.f = alajVar;
        this.g = alahVar;
        this.i = axzeVar;
        this.h = akyoVar;
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return this.h;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.M;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        akzo akzoVar;
        avuc g;
        avtu avtuVar;
        akzp c;
        afsx d = this.b.d(akzsVar.e);
        if (d == null) {
            throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_IDENTITY_NOT_FOUND);
        }
        aone createBuilder = asdf.a.createBuilder();
        String str2 = akzsVar.k;
        createBuilder.copyOnWrite();
        asdf asdfVar = (asdf) createBuilder.instance;
        str2.getClass();
        asdfVar.b |= 4;
        asdfVar.e = str2;
        final avuh avuhVar = null;
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
            asdf asdfVar2 = (asdf) createBuilder.instance;
            asdfVar2.g = a;
            asdfVar2.b |= 16;
        }
        aone createBuilder2 = asdj.a.createBuilder();
        aone createBuilder3 = asdi.a.createBuilder();
        createBuilder3.copyOnWrite();
        asdi asdiVar = (asdi) createBuilder3.instance;
        asdiVar.b |= 1;
        asdiVar.c = true;
        createBuilder2.copyOnWrite();
        asdj asdjVar = (asdj) createBuilder2.instance;
        asdi asdiVar2 = (asdi) createBuilder3.build();
        asdiVar2.getClass();
        asdjVar.d = asdiVar2;
        asdjVar.b |= 32;
        aone createBuilder4 = arvi.a.createBuilder();
        createBuilder4.copyOnWrite();
        arvi arviVar = (arvi) createBuilder4.instance;
        arviVar.c = 0;
        arviVar.b |= 1;
        createBuilder2.copyOnWrite();
        asdj asdjVar2 = (asdj) createBuilder2.instance;
        arvi arviVar2 = (arvi) createBuilder4.build();
        arviVar2.getClass();
        asdjVar2.c = arviVar2;
        asdjVar2.b |= 4;
        createBuilder.copyOnWrite();
        asdf asdfVar3 = (asdf) createBuilder.instance;
        asdj asdjVar3 = (asdj) createBuilder2.build();
        asdjVar3.getClass();
        asdfVar3.h = asdjVar3;
        asdfVar3.b |= 128;
        Uri parse = Uri.parse(akzsVar.f);
        if (this.g.c(parse)) {
            g = this.g.a(parse, akzsVar.H, akzsVar.al);
        } else {
            alaj alajVar = this.f;
            int m = akwg.m(akzsVar.s);
            if (m == 0) {
                m = 1;
            }
            g = alajVar.d(m, parse, null).g(akzsVar.H, akzsVar.al);
        }
        createBuilder.copyOnWrite();
        asdf asdfVar4 = (asdf) createBuilder.instance;
        g.getClass();
        asdfVar4.d = g;
        asdfVar4.b |= 2;
        akzq a2 = akzq.a(akzsVar.l);
        if (a2 == null) {
            a2 = akzq.UNKNOWN_UPLOAD;
        }
        int m2 = alep.m(a2);
        createBuilder.copyOnWrite();
        asdf asdfVar5 = (asdf) createBuilder.instance;
        asdfVar5.f = m2 - 1;
        asdfVar5.b |= 8;
        if ((akzsVar.d & 512) != 0) {
            awaf awafVar = akzsVar.as;
            if (awafVar == null) {
                awafVar = awaf.a;
            }
            createBuilder.copyOnWrite();
            asdf asdfVar6 = (asdf) createBuilder.instance;
            awafVar.getClass();
            asdfVar6.i = awafVar;
            asdfVar6.b |= 512;
        }
        akxy akxyVar = this.e;
        akxj akxjVar = new akxj(akxyVar.f, d, ((asdf) createBuilder.build()).toBuilder(), null, null, null);
        akxjVar.k();
        asdg asdgVar = (asdg) akxyVar.b.d(akxjVar);
        asdh asdhVar = asdgVar.d;
        if (asdhVar == null) {
            asdhVar = asdh.a;
        }
        if (asdhVar.b != 64128279) {
            this.i.d("CreateVideoTask UploadFeedbackItem not populated");
            return anaf.O(t(this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_CREATE_VIDEO_RESPONSE_MISSING_FEEDBACK), true));
        }
        asdh asdhVar2 = asdgVar.d;
        if (asdhVar2 == null) {
            asdhVar2 = asdh.a;
        }
        if (asdhVar2.b == 64128279) {
            avtuVar = (avtu) asdhVar2.c;
        } else {
            avtuVar = avtu.a;
        }
        final String str3 = asdgVar.c;
        boolean h = alep.h(avtuVar);
        Iterator it = avtuVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            avtw avtwVar = (avtw) it.next();
            if ((avtwVar.b & 32) != 0) {
                avuhVar = avtwVar.d;
                if (avuhVar == null) {
                    avuhVar = avuh.a;
                }
            }
        }
        final avgs e = alep.e(avtuVar);
        if (e == null || e.d.isEmpty()) {
            this.i.d("CreateVideoTask feedback continuation not populated");
            c = this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_CREATE_VIDEO_RESPONSE_MISSING_CONTINUATION);
        } else if (TextUtils.isEmpty(str3)) {
            this.i.d("CreateVideoTask video id not populated");
            c = this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_CREATE_VIDEO_RESPONSE_MISSING_VIDEO_ID);
        } else if (!h) {
            this.i.d("CreateVideoTask video registration failed");
            c = this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_CREATE_VIDEO_RESPONSE_REGISTRATION_FAILED);
        } else {
            c = this.d.d();
        }
        return anaf.O(u(c, true, new ayrs() { // from class: albg
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                albh albhVar = albh.this;
                avgs avgsVar = e;
                String str4 = str3;
                avuh avuhVar2 = avuhVar;
                aone aoneVar = (aone) obj;
                if (avgsVar != null) {
                    String str5 = avgsVar.d;
                    aoneVar.copyOnWrite();
                    akzs akzsVar2 = (akzs) aoneVar.instance;
                    akzs akzsVar3 = akzs.a;
                    str5.getClass();
                    akzsVar2.c |= 262144;
                    akzsVar2.X = str5;
                    akzp b = albhVar.d.b(avgsVar.c);
                    aoneVar.copyOnWrite();
                    akzs akzsVar4 = (akzs) aoneVar.instance;
                    b.getClass();
                    akzsVar4.aa = b;
                    akzsVar4.c |= 2097152;
                }
                if (!TextUtils.isEmpty(str4)) {
                    aoneVar.copyOnWrite();
                    akzs akzsVar5 = (akzs) aoneVar.instance;
                    akzs akzsVar6 = akzs.a;
                    str4.getClass();
                    akzsVar5.c |= 524288;
                    akzsVar5.Y = str4;
                }
                if (avuhVar2 != null) {
                    aoneVar.copyOnWrite();
                    akzs akzsVar7 = (akzs) aoneVar.instance;
                    akzs akzsVar8 = akzs.a;
                    akzsVar7.ab = avuhVar2;
                    akzsVar7.c |= 4194304;
                }
            }
        }));
    }

    @Override // defpackage.aldq
    public final anhy d(final String str, final akwm akwmVar) {
        return anaf.T(new anfy() { // from class: albf
            @Override // defpackage.anfy
            public final anhy a() {
                albh albhVar = albh.this;
                akzs o = albhVar.o(str, akwmVar, false);
                if ((o.c & 524288) == 0) {
                    throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_JOB_STATE);
                }
                abdm k = albhVar.a.k(o.e);
                k.k();
                k.a = o.Y;
                if (!albhVar.a.m(k).c) {
                    throw new aasx("Video deletion failed");
                }
                return anaf.O(albhVar.t(albhVar.d.d(), false));
            }
        }, angq.a);
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return agbc.t;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "CreateVideoTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        int i = akzsVar.b;
        return ((i & 1) == 0 || (i & 64) == 0 || (akzsVar.c & 32) == 0) ? false : true;
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
            akzp akzpVar = akzsVar.M;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            akzpVar.getClass();
            return t(alepVar.o(avtqVar, akzpVar, this.c.g, this.i), z);
        }
        return super.k(th, akzsVar, z);
    }

    @Override // defpackage.aldq
    public final akyq l() {
        return this.h;
    }
}
