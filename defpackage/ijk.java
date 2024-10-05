package defpackage;

import com.google.android.youtube.R;
import j$.util.Comparator$CC;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ijk implements ypd {
    aujo a = null;
    final /* synthetic */ ijo b;

    public ijk(ijo ijoVar) {
        this.b = ijoVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        ihm G;
        int binarySearch;
        if (i == -1) {
            return new Class[]{ghg.class, izi.class, wjc.class, aaxb.class};
        }
        if (i == 0) {
            final ghg ghgVar = (ghg) obj;
            this.b.C().runOnUiThread(new Runnable() { // from class: ijj
                @Override // java.lang.Runnable
                public final void run() {
                    ijk ijkVar = ijk.this;
                    ghg ghgVar2 = ghgVar;
                    asno a = ghgVar2.a();
                    if (ijkVar.b.qR() != null) {
                        aukf aK = ijkVar.b.aK();
                        asno asnoVar = null;
                        if (aK != null) {
                            int i2 = aK.b & 1;
                            if (i2 != 0) {
                                asnj asnjVar = aK.c;
                                if (asnjVar == null) {
                                    asnjVar = asnj.a;
                                }
                                asnoVar = asno.b(ijkVar.b.bA.n(etx.W(1 == i2, asnjVar)).d);
                                if (asnoVar == null) {
                                    asnoVar = asno.LIKE;
                                }
                            }
                        }
                        if (a == asno.INDIFFERENT && asnoVar == asno.DISLIKE) {
                            zev.c(ijkVar.b.qR(), ijkVar.b.bc, ijkVar.b.qR().getString(R.string.reel_accessibility_undislike_announcement));
                        } else if (a == asno.INDIFFERENT) {
                            zev.c(ijkVar.b.qR(), ijkVar.b.bc, ijkVar.b.qR().getString(R.string.reel_accessibility_unlike_announcement));
                        } else if (a == asno.LIKE) {
                            zev.c(ijkVar.b.qR(), ijkVar.b.bc, ijkVar.b.qR().getString(R.string.reel_accessibility_like_announcement));
                        } else if (a == asno.DISLIKE) {
                            zev.c(ijkVar.b.qR(), ijkVar.b.bc, ijkVar.b.qR().getString(R.string.reel_accessibility_dislike_announcement));
                        }
                    }
                    ijkVar.b.bA.a.put(ghgVar2.b(), ghgVar2.a());
                }
            });
            return null;
        }
        if (i == 1) {
            ammv g = ((izi) obj).g();
            if (!g.h()) {
                return null;
            }
            this.a = (aujo) g.c();
            ihl ihlVar = this.b.ae;
            aujo aujoVar = this.a;
            aujoVar.getClass();
            int i2 = ihlVar.y;
            if (i2 != -1 && (G = ihlVar.n.G(i2 + 1)) != null && G.b) {
                ihlVar.d.d(G);
            }
            if (ihlVar.t(new ihk(4, (aujoVar.b & 2) != 0 ? aujoVar.d : null, aujoVar)) != 1) {
                return null;
            }
            this.b.aM();
            if (zev.e(this.b.qR())) {
                return null;
            }
            this.b.aN(37419);
            return null;
        }
        if (i == 2) {
            wjb wjbVar = wjb.STARTED;
            int ordinal = ((wjc) obj).a().ordinal();
            if ((ordinal != 1 && ordinal != 2) || !this.b.ay.t()) {
                return null;
            }
            this.b.aq.Y();
            this.b.af.lo();
            return null;
        }
        if (i == 3) {
            aaxb aaxbVar = (aaxb) obj;
            if (!(aaxbVar.c() instanceof aujo) || !aaxbVar.c().equals(this.a)) {
                return null;
            }
            ihl ihlVar2 = this.b.ae;
            long f = ihlVar2.f();
            igu iguVar = ihlVar2.n;
            ihm ihmVar = iguVar.e;
            if (ihmVar != null && iguVar.B(ihmVar.a) == -1) {
                synchronized (iguVar.d) {
                    binarySearch = Collections.binarySearch(iguVar.d, iguVar.e, Comparator$CC.comparing(ham.k));
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 1);
                    }
                    iguVar.d.add(binarySearch, iguVar.e);
                    iguVar.e = null;
                }
                iguVar.od(iguVar.A(binarySearch));
            }
            int B = ihlVar2.n.B(f);
            if (B != -1) {
                ihlVar2.y = B;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
