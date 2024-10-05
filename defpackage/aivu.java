package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aivu implements ypd {
    public final aivo a;
    final aivs b;
    public aivq c;
    public boolean d;
    public ahdu e;
    private final aifv f;
    private final ypa g;
    private aivx h;
    private aivw i;

    public aivu(aivo aivoVar, aifv aifvVar, aivs aivsVar, ypa ypaVar) {
        this.a = aivoVar;
        this.f = aifvVar;
        this.b = aivsVar;
        this.g = ypaVar;
    }

    public final void a() {
        this.g.g(this);
        this.f.c.X(new ayrs() { // from class: aivt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aivq aivqVar = aivu.this.c;
                owg a = ((ahcg) obj).a();
                if (aivqVar.q != a) {
                    aivqVar.q = a;
                    aivqVar.b(2048);
                }
            }
        });
    }

    public final void b(aivw aivwVar) {
        this.i = aivwVar;
        this.a.d = aivwVar;
        d();
    }

    public final void c(aivx aivxVar) {
        this.h = aivxVar;
        this.a.c = aivxVar;
        d();
    }

    public final void d() {
        ahdu ahduVar = this.e;
        boolean z = true;
        boolean z2 = ahduVar != null && ahduVar.c();
        aivq aivqVar = this.c;
        aivx aivxVar = this.h;
        if (aivxVar != null) {
            z2 = aivxVar.d();
        }
        aivw aivwVar = this.i;
        if (aivwVar != null) {
            z = aivwVar.c();
        } else {
            ahdu ahduVar2 = this.e;
            if (ahduVar2 == null || !ahduVar2.b()) {
                z = false;
            }
        }
        aivqVar.h(z2, z);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        WatchNextResponseModel a;
        aseu aseuVar;
        asua asuaVar;
        aseu aseuVar2;
        aqyg aqygVar;
        CharSequence b;
        aqyg aqygVar2;
        Spanned b2;
        PlayerResponseModel b3;
        switch (i) {
            case -1:
                return new Class[]{aeqq.class, ahcr.class, ahdu.class, ahdv.class, ahef.class, aheg.class, ahej.class, aigr.class};
            case 0:
                FormatStreamModel f = ((aeqq) obj).f();
                if (f == null) {
                    return null;
                }
                aivq aivqVar = this.c;
                int d = f.d();
                int i2 = f.i();
                aivqVar.i = d;
                aivqVar.j = i2;
                aivqVar.b(65536);
                return null;
            case 1:
                aivq aivqVar2 = this.c;
                float a2 = ((ahcr) obj).a();
                if (aivqVar2.k == a2) {
                    return null;
                }
                aivqVar2.k = a2;
                aivqVar2.b(16384);
                return null;
            case 2:
                this.e = (ahdu) obj;
                d();
                return null;
            case 3:
                ahdv ahdvVar = (ahdv) obj;
                if (ahdvVar.c() != aigk.VIDEO_WATCH_LOADED || (a = ahdvVar.a()) == null || TextUtils.isEmpty(a.b)) {
                    return null;
                }
                asfc asfcVar = a.a;
                if ((16384 & asfcVar.b) != 0) {
                    asez asezVar = asfcVar.p;
                    if (asezVar == null) {
                        asezVar = asez.a;
                    }
                    if (asezVar.b == 61479009) {
                        asuaVar = (asua) asezVar.c;
                    } else {
                        asuaVar = asua.a;
                    }
                } else {
                    asfd asfdVar = asfcVar.d;
                    if (asfdVar == null) {
                        asfdVar = asfd.a;
                    }
                    if (asfdVar.b == 51779735) {
                        aseuVar = (aseu) asfdVar.c;
                    } else {
                        aseuVar = aseu.a;
                    }
                    if ((aseuVar.b & 8) != 0) {
                        asfd asfdVar2 = asfcVar.d;
                        if (asfdVar2 == null) {
                            asfdVar2 = asfd.a;
                        }
                        if (asfdVar2.b == 51779735) {
                            aseuVar2 = (aseu) asfdVar2.c;
                        } else {
                            aseuVar2 = aseu.a;
                        }
                        aser aserVar = aseuVar2.f;
                        if (aserVar == null) {
                            aserVar = aser.a;
                        }
                        if (aserVar.b == 61479009) {
                            asuaVar = (asua) aserVar.c;
                        } else {
                            asuaVar = asua.a;
                        }
                    } else {
                        asuaVar = null;
                    }
                }
                if (asuaVar == null) {
                    b = null;
                } else {
                    if ((asuaVar.b & 1) != 0) {
                        aqygVar = asuaVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    b = ajcq.b(aqygVar);
                }
                if (asuaVar == null) {
                    b2 = null;
                } else {
                    if ((asuaVar.b & 8) != 0) {
                        aqygVar2 = asuaVar.d;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    b2 = ajcq.b(aqygVar2);
                }
                if (TextUtils.isEmpty(b) && (b3 = ahdvVar.b()) != null) {
                    b = b3.x();
                    b2 = null;
                }
                this.c.m(b, b2);
                return null;
            case 4:
                ahef ahefVar = (ahef) obj;
                this.d = ahefVar.c().c(aign.PLAYBACK_LOADED);
                PlayerResponseModel b4 = ahefVar.b();
                if (ahefVar.c() == aign.NEW) {
                    this.c.d();
                    aivo aivoVar = this.a;
                    aivoVar.c = null;
                    aivoVar.d = null;
                    return null;
                }
                if (ahefVar.c() != aign.PLAYBACK_LOADED || b4 == null) {
                    return null;
                }
                this.c.n();
                if (aapj.a(b4.q(), 0L, null) != null) {
                    this.c.g(Duration.ofSeconds(r9.a.a()).toMillis());
                } else {
                    this.c.g(Duration.ofSeconds(b4.a()).toMillis());
                }
                this.c.f(!ahefVar.l() || b4.D());
                this.c.m(b4.x(), null);
                this.c.l(b4.b());
                this.b.b(b4.b());
                this.c.a();
                return null;
            case 5:
                this.c.j(((aheg) obj).e());
                return null;
            case 6:
                ahej ahejVar = (ahej) obj;
                if (!this.d) {
                    return null;
                }
                this.c.i(ahejVar.a());
                return null;
            case 7:
                this.c.i(8);
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
