package defpackage;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gnv implements fwn {
    public final fwo a;
    public asjh b;
    private final gnx c;
    private final fgo d;
    private final acqz e;
    private final aahd f;
    private final akcy g;
    private final ajun h;

    public gnv(fwo fwoVar, gnx gnxVar, fgo fgoVar, acqz acqzVar, aahd aahdVar, nnb nnbVar, ajun ajunVar, akcy akcyVar, byte[] bArr, byte[] bArr2) {
        this.a = fwoVar;
        this.c = gnxVar;
        this.d = fgoVar;
        this.e = acqzVar;
        this.f = aahdVar;
        this.h = ajunVar;
        this.g = akcyVar;
        gnxVar.b = nnbVar;
    }

    private final boolean g() {
        asjh asjhVar = this.b;
        return (asjhVar == null || asjhVar.p) ? false : true;
    }

    public final void a(asjh asjhVar) {
        this.b = asjhVar;
        if (asjhVar == null) {
            this.c.a();
        }
    }

    public final boolean b() {
        return this.c.d();
    }

    @Override // defpackage.fwk
    public final int c() {
        return 6000;
    }

    @Override // defpackage.fwk
    public final void d() {
        a(null);
    }

    @Override // defpackage.fwk
    public final void e() {
        apmg apmgVar;
        apmg apmgVar2;
        asjh asjhVar = this.b;
        if (asjhVar == null) {
            return;
        }
        if (!b() && !g()) {
            this.c.b(asjhVar, new Pair("overlay_controller_param", new ajyc() { // from class: gnu
                @Override // defpackage.ajyc
                public final void oC(aong aongVar) {
                    gnv gnvVar = gnv.this;
                    gnvVar.a.f(gnvVar);
                    gnvVar.b = null;
                }
            }));
        }
        if (g()) {
            asjh asjhVar2 = this.b;
            asjhVar2.getClass();
            if (!this.h.m(asjhVar2)) {
                this.h.l(asjhVar2);
                asjh asjhVar3 = this.b;
                asjhVar3.getClass();
                for (apxf apxfVar : asjhVar3.o) {
                    if (apxfVar != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", asjhVar3);
                        this.f.c(apxfVar, hashMap);
                    }
                }
            }
            acra mM = this.e.mM();
            mM.u(new acqx(asjhVar2.n), null);
            apmh apmhVar = asjhVar2.k;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((apmhVar.b & 1) != 0) {
                apmh apmhVar2 = asjhVar2.k;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmgVar = apmhVar2.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            } else {
                apmgVar = null;
            }
            apmh apmhVar3 = asjhVar2.m;
            if (apmhVar3 == null) {
                apmhVar3 = apmh.a;
            }
            if ((apmhVar3.b & 1) != 0) {
                apmh apmhVar4 = asjhVar2.m;
                if (apmhVar4 == null) {
                    apmhVar4 = apmh.a;
                }
                apmgVar2 = apmhVar4.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
            } else {
                apmgVar2 = null;
            }
            if (apmgVar != null && (apmgVar.b & 1048576) != 0) {
                mM.u(new acqx(apmgVar.t.I()), null);
            }
            if (apmgVar2 != null && (apmgVar2.b & 1048576) != 0) {
                mM.u(new acqx(apmgVar2.t), null);
            }
            this.b = null;
        }
    }

    @Override // defpackage.fwn
    public final boolean f() {
        return (this.d.k() || this.g.j()) ? false : true;
    }
}
