package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahpe implements ahqr, aioa {
    public static final ahqq a = new ahpf(amru.r(acsb.c(22156)), amru.u(acsb.c(28239), acsb.c(28240), acsb.c(123454), acsb.c(123453)));
    public final boolean b;
    public final ahqn c;
    public ahqe d;
    public acra e;
    public String f;
    public apxf g;
    public ahqo h;
    public boolean i;
    private final aaea j;
    private final Set k = new HashSet();
    private final ayqw l;
    private final azrw m;
    private final azrw n;
    private final ahqd o;
    private ahqt p;
    private ahqq q;
    private final ahzx r;
    private final ajyw s;

    public ahpe(ahzx ahzxVar, azrw azrwVar, ahqn ahqnVar, axzg axzgVar, aaea aaeaVar, azrw azrwVar2, ahqd ahqdVar, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.r = ahzxVar;
        this.n = azrwVar;
        this.c = ahqnVar;
        this.j = aaeaVar;
        this.m = azrwVar2;
        this.o = ahqdVar;
        this.s = ajywVar;
        s((acra) azrwVar2.get());
        this.q = a;
        this.b = axzgVar.t().booleanValue();
        this.l = new ayqw();
    }

    public static apxf g(apxf apxfVar) {
        aone createBuilder;
        if (apxfVar == null) {
            return null;
        }
        aone createBuilder2 = awav.a.createBuilder();
        aomf aomfVar = apxfVar.c;
        createBuilder2.copyOnWrite();
        awav awavVar = (awav) createBuilder2.instance;
        aomfVar.getClass();
        awavVar.b |= 1;
        awavVar.c = aomfVar;
        awav awavVar2 = (awav) createBuilder2.build();
        if (apxfVar.pY(atmb.b)) {
            createBuilder = ((atmc) apxfVar.pX(atmb.b)).toBuilder();
        } else {
            createBuilder = atmc.a.createBuilder();
        }
        aong aongVar = (aong) apxfVar.toBuilder();
        aonk aonkVar = atmb.b;
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        awavVar2.getClass();
        atmcVar.h = awavVar2;
        atmcVar.b |= 1024;
        aongVar.e(aonkVar, (atmc) createBuilder.build());
        return (apxf) aongVar.build();
    }

    private static ammv w(apxf apxfVar) {
        return !apxfVar.pY(WatchEndpointOuterClass.watchEndpoint) ? amlr.a : ammv.j(((awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint)).d);
    }

    private final void x() {
        p(false);
    }

    private final void y(acra acraVar) {
        if (this.e != acraVar) {
            x();
            this.e = acraVar;
            this.c.c(acraVar);
        }
    }

    private final void z() {
        this.l.c();
    }

    @Override // defpackage.ahqr
    public final acra a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final acsl b(apxf apxfVar) {
        acsl acslVar;
        if (this.i) {
            acslVar = this.e;
        } else {
            InteractionLoggingScreen a2 = this.q.a(this.e, apxfVar, this.p);
            q(ahqo.LOGGED_NEW_SCREEN);
            ajyw ajywVar = this.s;
            acre acreVar = (acre) ajywVar.a.get();
            acreVar.getClass();
            ajoy ajoyVar = (ajoy) ajywVar.b.get();
            ajoyVar.getClass();
            ajun ajunVar = (ajun) ajywVar.c.get();
            ajunVar.getClass();
            a2.getClass();
            acslVar = new acsi(acreVar, ajoyVar, ajunVar, a2, null, null);
        }
        this.g = apxfVar;
        this.p = null;
        return acslVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final acsm c(acsl acslVar, PlayerResponseModel playerResponseModel) {
        apxf g = this.i ? g(this.g) : null;
        ahqn ahqnVar = this.c;
        ahpd ahpdVar = new ahpd(this, 1);
        String str = this.f;
        ahqnVar.b = ahqn.a(g);
        acsm d = ahqn.d(acslVar, ahpdVar, new acqx(ByteBuffer.wrap(playerResponseModel.G()).array()), g);
        if (str != null) {
            ahqn.b(ahqnVar.e, ahqnVar.b, str);
        }
        ahqnVar.c = playerResponseModel.G();
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final acsm d(final acsl acslVar, WatchNextResponseModel watchNextResponseModel) {
        acsm d;
        apxf g = this.i ? g(this.g) : null;
        ahqn ahqnVar = this.c;
        ahpd ahpdVar = new ahpd(this, 0);
        String str = this.f;
        ahqnVar.b = ahqn.a(g);
        apxf apxfVar = watchNextResponseModel.c;
        if (apxfVar == null || !apxfVar.pY(atrs.a)) {
            d = ahqn.d(acslVar, ahpdVar, new acqx(ByteBuffer.wrap(watchNextResponseModel.d()).array()), g);
        } else {
            d = ahqn.d(acslVar, ahpdVar, new acqx(acsb.c(13187)), g);
        }
        if (str != null) {
            ahqn.b(ahqnVar.e, ahqnVar.b, str);
        }
        ahqnVar.d = watchNextResponseModel.d();
        if (watchNextResponseModel.h != null) {
            amml ammlVar = new amml() { // from class: ahqm
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    acsl acslVar2 = acsl.this;
                    apxf apxfVar2 = (apxf) obj;
                    if (apxfVar2 == null) {
                        return null;
                    }
                    return acslVar2.h(apxfVar2);
                }
            };
            aama aamaVar = watchNextResponseModel.h;
            if (aamaVar != null) {
                aalx aalxVar = aamaVar.a;
                if (aalxVar != null) {
                    aalxVar.e(ammlVar);
                }
                aalx aalxVar2 = aamaVar.b;
                if (aalxVar2 != null) {
                    aalxVar2.e(ammlVar);
                }
                aalx aalxVar3 = aamaVar.c;
                if (aalxVar3 != null) {
                    aalxVar3.e(ammlVar);
                }
                aalx aalxVar4 = aamaVar.d;
                if (aalxVar4 != null) {
                    aalxVar4.e(ammlVar);
                }
                aalx aalxVar5 = aamaVar.e;
                if (aalxVar5 != null) {
                    aalxVar5.e(ammlVar);
                }
                aalx aalxVar6 = aamaVar.f;
                if (aalxVar6 != null) {
                    aalxVar6.e(ammlVar);
                }
                aalx aalxVar7 = aamaVar.g;
                if (aalxVar7 != null) {
                    aalxVar7.e(ammlVar);
                }
                aalx aalxVar8 = aamaVar.h;
                if (aalxVar8 != null) {
                    aalxVar8.e(ammlVar);
                }
                aalx aalxVar9 = aamaVar.i;
                if (aalxVar9 != null) {
                    aalxVar9.e(ammlVar);
                }
            }
        }
        return d;
    }

    public final ahqs f(ahdv ahdvVar) {
        ahqe ahqeVar = this.d;
        return ahqeVar != null ? ahqeVar.a(ahdvVar) : ahqs.a;
    }

    @Override // defpackage.ahqr
    public final void h(ahqp ahqpVar) {
        this.k.add(ahqpVar);
    }

    @Override // defpackage.ahqr
    public final void i() {
        z();
        if (this.d == null) {
            this.d = this.o.a(this);
        }
        this.l.g(kI(this.r.a));
    }

    @Override // defpackage.ahqr
    public final void j(acra acraVar, apxf apxfVar) {
        if (this.e == acraVar || this.h == ahqo.NEW) {
            return;
        }
        this.e = acraVar;
        this.c.c(acraVar);
        this.i = false;
        b(apxfVar);
        ahqn ahqnVar = this.c;
        String str = this.f;
        byte[] bArr = ahqnVar.c;
        if (bArr != null) {
            ahqnVar.e.D(new acqx(bArr));
            ahqnVar.e.r(str);
        }
        byte[] bArr2 = ahqnVar.d;
        if (bArr2 != null) {
            ahqnVar.e.D(new acqx(bArr2));
            ahqnVar.e.r(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(apxf apxfVar) {
        acra acraVar = this.e;
        if (acraVar == null) {
            return;
        }
        l(acraVar, this.g, apxfVar);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 2;
        final int i3 = 0;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 512L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahpc
            public final /* synthetic */ ahpe a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    ahpe ahpeVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahpeVar.b) {
                        return;
                    }
                    ahpeVar.f(ahdvVar);
                    return;
                }
                if (i4 == 1) {
                    ahqe ahqeVar = this.a.d;
                    if (ahqeVar != null) {
                        ahqeVar.b();
                        return;
                    }
                    return;
                }
                ahpe ahpeVar2 = this.a;
                ahef ahefVar = (ahef) obj;
                ahpeVar2.f = ahefVar.e();
                if (!TextUtils.isEmpty(ahpeVar2.f)) {
                    ahqn ahqnVar = ahpeVar2.c;
                    ahqn.b(ahqnVar.e, ahqnVar.b, ahpeVar2.f);
                }
                if (ahpeVar2.h != ahqo.NEW) {
                    ahqn ahqnVar2 = ahpeVar2.c;
                    PlayerResponseModel a2 = ahefVar.a();
                    String k = ahefVar.k();
                    apxf g = ahpeVar2.i ? ahpe.g(ahpeVar2.g) : null;
                    if (a2 == null || TextUtils.isEmpty(k)) {
                        return;
                    }
                    if (ahqnVar2.a.contains(ByteBuffer.wrap(a2.G()))) {
                        return;
                    }
                    byte[] G = a2.G();
                    acsa a3 = ahqn.a(g);
                    if (a3 != null) {
                        ahqnVar2.e.F(new acqx(G), a3);
                        ahqnVar2.e.s(a3, k);
                    } else {
                        ahqnVar2.e.D(new acqx(G));
                        ahqnVar2.e.r(k);
                    }
                    ahqnVar2.a.add(ByteBuffer.wrap(a2.G()));
                }
            }
        }, ahfo.h), aiocVar.ao().h(ahbw.g(aiocVar.aC(), 512L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahpc
            public final /* synthetic */ ahpe a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    ahpe ahpeVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahpeVar.b) {
                        return;
                    }
                    ahpeVar.f(ahdvVar);
                    return;
                }
                if (i4 == 1) {
                    ahqe ahqeVar = this.a.d;
                    if (ahqeVar != null) {
                        ahqeVar.b();
                        return;
                    }
                    return;
                }
                ahpe ahpeVar2 = this.a;
                ahef ahefVar = (ahef) obj;
                ahpeVar2.f = ahefVar.e();
                if (!TextUtils.isEmpty(ahpeVar2.f)) {
                    ahqn ahqnVar = ahpeVar2.c;
                    ahqn.b(ahqnVar.e, ahqnVar.b, ahpeVar2.f);
                }
                if (ahpeVar2.h != ahqo.NEW) {
                    ahqn ahqnVar2 = ahpeVar2.c;
                    PlayerResponseModel a2 = ahefVar.a();
                    String k = ahefVar.k();
                    apxf g = ahpeVar2.i ? ahpe.g(ahpeVar2.g) : null;
                    if (a2 == null || TextUtils.isEmpty(k)) {
                        return;
                    }
                    if (ahqnVar2.a.contains(ByteBuffer.wrap(a2.G()))) {
                        return;
                    }
                    byte[] G = a2.G();
                    acsa a3 = ahqn.a(g);
                    if (a3 != null) {
                        ahqnVar2.e.F(new acqx(G), a3);
                        ahqnVar2.e.s(a3, k);
                    } else {
                        ahqnVar2.e.D(new acqx(G));
                        ahqnVar2.e.r(k);
                    }
                    ahqnVar2.a.add(ByteBuffer.wrap(a2.G()));
                }
            }
        }, ahfo.h), aiocVar.al().h(ahbw.g(aiocVar.aC(), 512L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahpc
            public final /* synthetic */ ahpe a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    ahpe ahpeVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahpeVar.b) {
                        return;
                    }
                    ahpeVar.f(ahdvVar);
                    return;
                }
                if (i4 == 1) {
                    ahqe ahqeVar = this.a.d;
                    if (ahqeVar != null) {
                        ahqeVar.b();
                        return;
                    }
                    return;
                }
                ahpe ahpeVar2 = this.a;
                ahef ahefVar = (ahef) obj;
                ahpeVar2.f = ahefVar.e();
                if (!TextUtils.isEmpty(ahpeVar2.f)) {
                    ahqn ahqnVar = ahpeVar2.c;
                    ahqn.b(ahqnVar.e, ahqnVar.b, ahpeVar2.f);
                }
                if (ahpeVar2.h != ahqo.NEW) {
                    ahqn ahqnVar2 = ahpeVar2.c;
                    PlayerResponseModel a2 = ahefVar.a();
                    String k = ahefVar.k();
                    apxf g = ahpeVar2.i ? ahpe.g(ahpeVar2.g) : null;
                    if (a2 == null || TextUtils.isEmpty(k)) {
                        return;
                    }
                    if (ahqnVar2.a.contains(ByteBuffer.wrap(a2.G()))) {
                        return;
                    }
                    byte[] G = a2.G();
                    acsa a3 = ahqn.a(g);
                    if (a3 != null) {
                        ahqnVar2.e.F(new acqx(G), a3);
                        ahqnVar2.e.s(a3, k);
                    } else {
                        ahqnVar2.e.D(new acqx(G));
                        ahqnVar2.e.r(k);
                    }
                    ahqnVar2.a.add(ByteBuffer.wrap(a2.G()));
                }
            }
        }, ahfo.h)};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(acsl acslVar, apxf apxfVar, apxf apxfVar2) {
        if (amkq.b(apxfVar, apxfVar2) || this.i) {
            return;
        }
        if (apxfVar2 == null) {
            ainy ainyVar = (ainy) this.n.get();
            apxfVar2 = aigp.f(ainyVar.q(), ainyVar.p(), ainyVar.g(), 0.0f);
        }
        if (aigb.d(apxfVar, apxfVar2)) {
            return;
        }
        acslVar.t();
    }

    @Override // defpackage.ahqr
    public final void m() {
        acra acraVar = this.c.e;
        this.p = new ahqt(acraVar != null ? acraVar.k() : null, acsb.c(22156));
    }

    @Override // defpackage.ahqr
    public final void n() {
        z();
        x();
        this.k.clear();
        y((acra) this.m.get());
        this.i = false;
    }

    @Override // defpackage.ahqr
    public final void o(ahqp ahqpVar) {
        this.k.remove(ahqpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(boolean z) {
        aujs aujsVar;
        aujz aujzVar;
        if (!z) {
            this.g = null;
            arfd a2 = this.j.a();
            if (a2 == null || (a2.b & 1073741824) == 0) {
                aujsVar = null;
            } else {
                aujsVar = a2.u;
                if (aujsVar == null) {
                    aujsVar = aujs.a;
                }
            }
            if (aujsVar == null || (aujsVar.b & 512) == 0) {
                aujzVar = null;
            } else {
                aujzVar = aujsVar.d;
                if (aujzVar == null) {
                    aujzVar = aujz.a;
                }
            }
            if (aujzVar != null && aujzVar.g) {
                this.f = null;
            }
        }
        if (!this.i && this.e != null) {
            ahqn ahqnVar = this.c;
            ahqnVar.a.clear();
            ahqnVar.b = null;
            ahqnVar.c = null;
            ahqnVar.d = null;
            this.e.y();
        }
        q(ahqo.NEW);
    }

    public final void q(ahqo ahqoVar) {
        this.h = ahqoVar;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ahqp) it.next()).a(ahqoVar);
        }
    }

    @Override // defpackage.ahqr
    public final void r(ahqq ahqqVar) {
        ahqqVar.getClass();
        this.q = ahqqVar;
    }

    @Override // defpackage.ahqr
    public final void s(acra acraVar) {
        y(acraVar);
        this.i = false;
    }

    @Override // defpackage.ahqr
    public final void t(acra acraVar) {
        y(acraVar);
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u(apxf apxfVar) {
        apxf apxfVar2;
        return this.h == ahqo.NEW || (apxfVar2 = this.g) == null || !apxfVar2.equals(apxfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v(apxf apxfVar) {
        apxf apxfVar2 = this.g;
        if (apxfVar2 != null && apxfVar != null) {
            ammv w = w(apxfVar2);
            ammv w2 = w(apxfVar);
            if (w.h() && w2.h() && ((String) w.c()).equals(w2.c())) {
                return true;
            }
        }
        return false;
    }
}
