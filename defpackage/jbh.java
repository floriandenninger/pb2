package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jbh implements ypd {
    final /* synthetic */ jbj a;

    public jbh(jbj jbjVar) {
        this.a = jbjVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        asra asraVar;
        asra asraVar2;
        boolean z = false;
        if (i == -1) {
            return new Class[]{abix.class, ahcx.class, ahee.class, ahef.class};
        }
        if (i == 0) {
            abix abixVar = (abix) obj;
            boolean b = abixVar.b();
            Object f = ((ammv) abixVar.h()).f();
            jbj jbjVar = this.a;
            if (f == jbjVar) {
                jbe jbeVar = jbjVar.a;
                if (b && !jbjVar.i) {
                    z = true;
                }
                jbeVar.f(z);
                asra asraVar3 = this.a.f;
                if (asraVar3 != null) {
                    acqx acqxVar = new acqx(asraVar3.j);
                    if (b) {
                        this.a.e.u(acqxVar, null);
                    } else {
                        this.a.e.q(acqxVar, null);
                    }
                }
            } else {
                jbe jbeVar2 = jbjVar.a;
                if (b && !jbjVar.i) {
                    z = true;
                }
                jbeVar2.j(z);
            }
            this.a.b.d(true == b ? 1 : 2);
            if (!((ammv) abixVar.h()).h()) {
                return null;
            }
            jbj jbjVar2 = this.a;
            jbjVar2.d.b(jbjVar2, b);
            return null;
        }
        if (i == 1) {
            if (!((ahcx) obj).c().equals(aigf.FULLSCREEN)) {
                jbj jbjVar3 = this.a;
                if (jbjVar3.h && jbjVar3.a.k() && (asraVar2 = this.a.f) != null) {
                    this.a.e.q(new acqx(asraVar2.j), null);
                }
                this.a.h = false;
                return null;
            }
            jbj jbjVar4 = this.a;
            if (jbjVar4.h) {
                return null;
            }
            jbjVar4.h = true;
            if (!jbjVar4.a.k() || (asraVar = this.a.f) == null) {
                return null;
            }
            this.a.e.u(new acqx(asraVar.j), null);
            return null;
        }
        if (i == 2) {
            jbe jbeVar3 = this.a.a;
            boolean z2 = ((ahee) obj).a;
            if (!jbeVar3.f) {
                return null;
            }
            jbeVar3.g = z2;
            jbeVar3.i();
            return null;
        }
        if (i == 3) {
            this.a.i = ((ahef) obj).c().a(aign.PLAYBACK_INTERRUPTED, aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING, aign.ENDED);
            jbj jbjVar5 = this.a;
            if (!jbjVar5.i) {
                return null;
            }
            jbjVar5.a.f(false);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
