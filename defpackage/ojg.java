package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ojg implements fgm, flm, flk, aioa, ypd {
    public ojf a;
    public acsx b;
    public final ajoy c;
    private final ypa d;
    private final aioc e;
    private final azrw g;
    private final boolean j;
    private final boolean k;
    private fhf l;
    private avgg m;
    private final ayqw f = new ayqw();
    private final Set h = new CopyOnWriteArraySet();
    private final Set i = new CopyOnWriteArraySet();

    public ojg(ypa ypaVar, aioc aiocVar, azrw azrwVar, axzg axzgVar, aadw aadwVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.d = ypaVar;
        this.e = aiocVar;
        this.c = ajoyVar;
        this.g = azrwVar;
        this.j = axzgVar.t().booleanValue();
        atyg atygVar = aadwVar.b().v;
        this.k = (atygVar == null ? atyg.a : atygVar).f;
    }

    private final synchronized void p() {
        if (this.l == null) {
            return;
        }
        t(null, null);
    }

    private final synchronized void q() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fgk) it.next()).g(this.l);
        }
    }

    private final synchronized void r() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((fgl) it.next()).a(this.l, this.m);
        }
    }

    private final void s(apxf apxfVar, avgg avggVar) {
        fhf fhfVar = this.l;
        if (fhfVar == null || !fhfVar.f(apxfVar)) {
            fhfVar = new fhf(apxfVar);
        } else {
            fhfVar.d(apxfVar);
        }
        t(fhfVar, avggVar);
        gfw.b();
    }

    private final void t(fhf fhfVar, avgg avggVar) {
        ojf ojfVar;
        WatchNextResponseModel b;
        fhf fhfVar2 = this.l;
        if (fhfVar2 == null || fhfVar == null || !fhfVar2.f(fhfVar.a())) {
            this.l = fhfVar;
        } else {
            fhf fhfVar3 = this.l;
            if (fhfVar3 != null) {
                fhfVar3.d(fhfVar.a());
            }
        }
        gfw.b();
        if (fhfVar2 != this.l) {
            q();
        }
        avgg avggVar2 = this.m;
        if (avggVar == null && (ojfVar = this.a) != null) {
            ofa ofaVar = ((oje) ojfVar).a.c;
            if (ofaVar != null) {
                if (ofaVar.d == null && (b = ofaVar.b()) != null) {
                    asfc asfcVar = b.a;
                    if ((asfcVar.b & 8192) != 0) {
                        avgg avggVar3 = asfcVar.o;
                        if (avggVar3 == null) {
                            avggVar3 = avgg.a;
                        }
                        ofaVar.d = avggVar3;
                    }
                }
                avggVar = ofaVar.d;
            } else {
                avggVar = null;
            }
        }
        if (fhfVar2 == this.l && amkq.b(avggVar2, avggVar)) {
            return;
        }
        this.m = avggVar;
        r();
        ojf ojfVar2 = this.a;
        if (ojfVar2 != null) {
            avgg avggVar4 = this.m;
            ofa ofaVar2 = ((oje) ojfVar2).a.c;
            if (ofaVar2 == null || avggVar4 == null || amkq.b(ofaVar2.d, avggVar4)) {
                return;
            }
            ofaVar2.d = avggVar4;
            ofaVar2.e(4);
        }
    }

    @Override // defpackage.fgm
    public final synchronized fhf a() {
        return this.l;
    }

    @Override // defpackage.fgm
    public final void d(fgk fgkVar) {
        this.h.add(fgkVar);
    }

    @Override // defpackage.fgm
    public final void g(fgl fglVar) {
        this.i.add(fglVar);
    }

    @Override // defpackage.fgm
    public final void h(fgk fgkVar) {
        this.h.remove(fgkVar);
    }

    @Override // defpackage.flk
    public final void i() {
        p();
    }

    @Override // defpackage.flk
    public final synchronized void j(apxf apxfVar, avgg avggVar) {
        s(apxfVar, avggVar);
        gfw.b();
    }

    public final void k(ahdv ahdvVar) {
        if (this.j) {
            return;
        }
        m(ahdvVar, null);
    }

    @Override // defpackage.flm
    public final void kG() {
        this.f.c();
        if (this.k) {
            return;
        }
        this.d.m(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        if (this.k) {
            this.f.g(kI(this.e));
        } else {
            this.d.g(this);
        }
        this.f.d(this.e.V().A(ohs.c).Y(new ojd(this, 1), nua.s));
        if (fkc.c((ainy) this.g.get())) {
            return;
        }
        p();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.ao().G().E(ayqr.a()).Y(new ojd(this, 2), nua.s), aiocVar.ah().G().E(ayqr.a()).Y(new ojd(this, 0), nua.s), aiocVar.G().h.Y(new ojd(this, 3), nua.s)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdr.class, ahdv.class, aigr.class};
        }
        if (i == 0) {
            o();
            return null;
        }
        if (i == 1) {
            k((ahdv) obj);
            return null;
        }
        if (i == 2) {
            l((aigr) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(aigr aigrVar) {
        ojf ojfVar = this.a;
        if (ojfVar != null) {
            ojfVar.a(aigrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(ahdv ahdvVar, acsm acsmVar) {
        avgg avggVar;
        if (ahdvVar.c().b(aigk.VIDEO_LOADING)) {
            apxf d = ahdvVar.d();
            if (d == null) {
                ainy ainyVar = (ainy) this.g.get();
                d = aigp.f(ainyVar.q(), ainyVar.p(), ainyVar.g(), 0.0f);
            }
            PlayerResponseModel b = ahdvVar.b();
            if (b != null) {
                b.b();
                avggVar = b.b().e();
            } else {
                avggVar = null;
            }
            s(d, avggVar);
            ojf ojfVar = this.a;
            if (ojfVar != null) {
                if (b != null) {
                    String x = b.x();
                    String w = b.w();
                    ofa ofaVar = ((oje) ojfVar).a.c;
                    if (ofaVar != null && (!TextUtils.equals(ofaVar.b, x) || !TextUtils.equals(ofaVar.c, w))) {
                        ofaVar.b = x;
                        ofaVar.c = w;
                        ofaVar.e(2);
                    }
                }
                if (ahdvVar.c() == aigk.VIDEO_WATCH_LOADED) {
                    acsx acsxVar = this.b;
                    if (acsxVar != null) {
                        acsxVar.c("wnls");
                    }
                    ojf ojfVar2 = this.a;
                    WatchNextResponseModel a = ahdvVar.a();
                    ofa ofaVar2 = ((oje) ojfVar2).a.c;
                    if (ofaVar2 == null) {
                        return;
                    }
                    if (ofaVar2.f != null) {
                        a = null;
                    }
                    if (a == null) {
                        ofaVar2.i(null);
                    }
                    ofaVar2.e(ofaVar2.a(a, acsmVar));
                    return;
                }
                if (ahdvVar.c() != aigk.VIDEO_PLAYBACK_ERROR) {
                    this.a.a(null);
                }
            }
        }
    }

    public final oew n() {
        ojf ojfVar = this.a;
        if (ojfVar == null) {
            return null;
        }
        return ((oje) ojfVar).a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        ojf ojfVar = this.a;
        if (ojfVar != null) {
            ojfVar.a(null);
        }
    }
}
