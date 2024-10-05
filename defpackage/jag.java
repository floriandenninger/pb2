package defpackage;

import android.content.res.Resources;
import com.google.android.apps.youtube.app.innertube.guide.impl.GuideControllerImpl$WatchWhileLifecycleObserver;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jag implements izu, ypd {
    public final aaxl a;
    public final fap b;
    public final Resources c;
    public final eoi d;
    public final afsy e;
    public final ayqi g;
    public final boolean h;
    public aypy i;
    public final aadw j;
    public final aoae k;
    private final ypa l;
    private final azrw n;
    private final GuideControllerImpl$WatchWhileLifecycleObserver o;
    private final eni p;
    private final azrs m = azrl.e().aT();
    public final azrs f = azrl.e().aT();

    /* JADX WARN: Multi-variable type inference failed */
    public jag(aaxl aaxlVar, ypa ypaVar, ayqi ayqiVar, fap fapVar, Resources resources, afsy afsyVar, eoi eoiVar, aadw aadwVar, aoae aoaeVar, azrw azrwVar, GuideControllerImpl$WatchWhileLifecycleObserver guideControllerImpl$WatchWhileLifecycleObserver, eni eniVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Boolean bool;
        aaxlVar.getClass();
        this.a = aaxlVar;
        this.l = ypaVar;
        fapVar.getClass();
        this.b = fapVar;
        this.c = resources;
        this.d = eoiVar;
        this.e = afsyVar;
        this.g = ayqiVar;
        this.j = aadwVar;
        this.k = aoaeVar;
        this.n = azrwVar;
        this.o = guideControllerImpl$WatchWhileLifecycleObserver;
        this.p = eniVar;
        aqvj aqvjVar = axzfVar.a.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45355325L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45355325L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45355325L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        this.h = booleanValue;
        if (booleanValue) {
            return;
        }
        this.i = d();
    }

    public static atvz c(String str, String str2, arfr arfrVar) {
        aone createBuilder = atvz.a.createBuilder();
        aone createBuilder2 = atvw.a.createBuilder();
        createBuilder2.copyOnWrite();
        atvw atvwVar = (atvw) createBuilder2.instance;
        atvwVar.b |= 1;
        atvwVar.c = str;
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = BrowseEndpointOuterClass.browseEndpoint;
        aone createBuilder3 = aplt.a.createBuilder();
        createBuilder3.copyOnWrite();
        aplt apltVar = (aplt) createBuilder3.instance;
        apltVar.b |= 1;
        apltVar.c = str;
        aongVar.e(aonkVar, (aplt) createBuilder3.build());
        createBuilder2.copyOnWrite();
        atvw atvwVar2 = (atvw) createBuilder2.instance;
        apxf apxfVar = (apxf) aongVar.build();
        apxfVar.getClass();
        atvwVar2.e = apxfVar;
        atvwVar2.b |= 4;
        aong aongVar2 = (aong) arfs.a.createBuilder();
        aongVar2.copyOnWrite();
        arfs arfsVar = (arfs) aongVar2.instance;
        arfsVar.c = arfrVar.pV;
        arfsVar.b |= 1;
        createBuilder2.copyOnWrite();
        atvw atvwVar3 = (atvw) createBuilder2.instance;
        arfs arfsVar2 = (arfs) aongVar2.build();
        arfsVar2.getClass();
        atvwVar3.g = arfsVar2;
        atvwVar3.b |= 64;
        aqyg g = ajcq.g(str2);
        createBuilder2.copyOnWrite();
        atvw atvwVar4 = (atvw) createBuilder2.instance;
        g.getClass();
        atvwVar4.f = g;
        atvwVar4.b |= 16;
        createBuilder.copyOnWrite();
        atvz atvzVar = (atvz) createBuilder.instance;
        atvw atvwVar5 = (atvw) createBuilder2.build();
        atvwVar5.getClass();
        atvzVar.c = atvwVar5;
        atvzVar.b = 117501096;
        return (atvz) createBuilder.build();
    }

    @Override // defpackage.izt
    public final aypy a() {
        aypy aypyVar = this.i;
        aypyVar.getClass();
        return aypyVar.U();
    }

    @Override // defpackage.izu
    public final ayps b() {
        ayqj e = e();
        this.m.c(e);
        return e.j().A();
    }

    public final aypy d() {
        aypy U;
        ayph b = this.p.b();
        GuideControllerImpl$WatchWhileLifecycleObserver guideControllerImpl$WatchWhileLifecycleObserver = this.o;
        azrw azrwVar = this.n;
        avdj avdjVar = this.j.b().u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        apev apevVar = avdjVar.g;
        if (apevVar == null) {
            apevVar = apev.a;
        }
        int ba = anaf.ba(apevVar.j);
        final int i = 1;
        if (ba == 0 || ba == 1) {
            U = guideControllerImpl$WatchWhileLifecycleObserver.a.U();
        } else {
            U = ((aacu) azrwVar.get()).a().G(ivh.m).l();
        }
        epf epfVar = (epf) this.d;
        final int i2 = 0;
        final int i3 = 2;
        aypy aI = aypy.Q(U, aypy.m(epfVar.c, epfVar.d, epc.m).B().L(iub.e).Y(ivh.h), this.f.U(), aypy.v(new ayqa() { // from class: izy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ayqa
            public final void a(aypz aypzVar) {
                final jag jagVar = jag.this;
                final jaf jafVar = new jaf(aypzVar);
                jagVar.k.o(jafVar);
                ayrz.f((AtomicReference) aypzVar, aynu.e(new ayrm() { // from class: jab
                    @Override // defpackage.ayrm
                    public final void a() {
                        jag jagVar2 = jag.this;
                        jagVar2.k.p(jafVar);
                    }
                }));
            }
        }).ae()).aI(aysu.a, 4);
        if (this.h) {
            aI = aypy.m(aI, b.P(zjf.a).l(), epc.l).ae();
        }
        aypy Y = aI.Y(new ayrv() { // from class: izx
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return jag.this.e();
            }
        });
        if (this.h) {
            Y = Y.ae();
        }
        aypy aa = aypy.aa(Y, this.m);
        aypy d = ayps.u(new Callable(this) { // from class: izz
            public final /* synthetic */ jag a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (i2 == 0) {
                    return ammv.i((aaxh) this.a.b.a().c());
                }
                Resources resources = this.a.c;
                aone createBuilder = arss.a.createBuilder();
                aone createBuilder2 = arst.a.createBuilder();
                aone createBuilder3 = atvy.a.createBuilder();
                createBuilder3.aI(jag.c("FEwhat_to_watch", resources.getString(R.string.home), arfr.PIVOT_HOME));
                createBuilder3.aI(jag.c("FEexplore", resources.getString(R.string.explore), arfr.TAB_EXPLORE));
                createBuilder3.aI(jag.c("FEsubscriptions", resources.getString(R.string.subscriptions), arfr.PIVOT_SUBSCRIPTIONS));
                createBuilder3.aI(jag.c("FElibrary", resources.getString(R.string.library), arfr.PIVOT_LIBRARY));
                createBuilder2.copyOnWrite();
                arst arstVar = (arst) createBuilder2.instance;
                atvy atvyVar = (atvy) createBuilder3.build();
                atvyVar.getClass();
                arstVar.c = atvyVar;
                arstVar.b = 117866661;
                arst arstVar2 = (arst) createBuilder2.build();
                createBuilder.copyOnWrite();
                arss arssVar = (arss) createBuilder.instance;
                arstVar2.getClass();
                aony aonyVar = arssVar.d;
                if (!aonyVar.c()) {
                    arssVar.d = aonm.mutableCopy(aonyVar);
                }
                arssVar.d.add(arstVar2);
                return new aaxh((arss) createBuilder.build());
            }
        }).h(new aypw() { // from class: izv
            @Override // defpackage.aypw
            public final aypv a(ayps aypsVar) {
                jag jagVar = jag.this;
                asvu asvuVar = jagVar.j.b().e;
                if (asvuVar == null) {
                    asvuVar = asvu.a;
                }
                return asvuVar.bF ? aypsVar.G(jagVar.g) : aypsVar;
            }
        }).m(izw.a).A().r(iub.d).x(ivh.g).r(iub.c).Q(ayqj.C(new Callable(this) { // from class: izz
            public final /* synthetic */ jag a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (i == 0) {
                    return ammv.i((aaxh) this.a.b.a().c());
                }
                Resources resources = this.a.c;
                aone createBuilder = arss.a.createBuilder();
                aone createBuilder2 = arst.a.createBuilder();
                aone createBuilder3 = atvy.a.createBuilder();
                createBuilder3.aI(jag.c("FEwhat_to_watch", resources.getString(R.string.home), arfr.PIVOT_HOME));
                createBuilder3.aI(jag.c("FEexplore", resources.getString(R.string.explore), arfr.TAB_EXPLORE));
                createBuilder3.aI(jag.c("FEsubscriptions", resources.getString(R.string.subscriptions), arfr.PIVOT_SUBSCRIPTIONS));
                createBuilder3.aI(jag.c("FElibrary", resources.getString(R.string.library), arfr.PIVOT_LIBRARY));
                createBuilder2.copyOnWrite();
                arst arstVar = (arst) createBuilder2.instance;
                atvy atvyVar = (atvy) createBuilder3.build();
                atvyVar.getClass();
                arstVar.c = atvyVar;
                arstVar.b = 117866661;
                arst arstVar2 = (arst) createBuilder2.build();
                createBuilder.copyOnWrite();
                arss arssVar = (arss) createBuilder.instance;
                arstVar2.getClass();
                aony aonyVar = arssVar.d;
                if (!aonyVar.c()) {
                    arssVar.d = aonm.mutableCopy(aonyVar);
                }
                arssVar.d.add(arstVar2);
                return new aaxh((arss) createBuilder.build());
            }
        })).l().u(aa.t(ivh.k).aJ().e(0)).aJ().d();
        aypy O = aa.O(ivh.l);
        aypy Y2 = aa.O(ivh.i).Y(ivh.o);
        final ypa ypaVar = this.l;
        ypaVar.getClass();
        aypy Y3 = O.Y(ivh.e);
        final ypa ypaVar2 = this.l;
        ypaVar2.getClass();
        aypy ab = O.ab(this.g);
        final fap fapVar = this.b;
        aypy Y4 = aa.Y(ivh.j);
        final ypa ypaVar3 = this.l;
        ypaVar3.getClass();
        new ayqw(Y2.ax(new ayrs() { // from class: jad
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    ypaVar.d((fdx) obj);
                } else if (i4 != 1) {
                    ypaVar.d((fdy) obj);
                } else {
                    ypaVar.d((fdw) obj);
                }
            }
        }), Y3.ax(new ayrs() { // from class: jad
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    ypaVar2.d((fdx) obj);
                } else if (i4 != 1) {
                    ypaVar2.d((fdy) obj);
                } else {
                    ypaVar2.d((fdw) obj);
                }
            }
        }), ab.ax(new ayrs() { // from class: jac
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                fap fapVar2 = fap.this;
                aaxh aaxhVar = (aaxh) obj;
                aaxhVar.getClass();
                fapVar2.a().e(aaxhVar);
            }
        }), Y4.ax(new ayrs() { // from class: jad
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    ypaVar3.d((fdx) obj);
                } else if (i4 != 1) {
                    ypaVar3.d((fdy) obj);
                } else {
                    ypaVar3.d((fdw) obj);
                }
            }
        }));
        return d;
    }

    public final ayqj e() {
        return ayqj.p(new ayql() { // from class: jaa
            @Override // defpackage.ayql
            public final void a(azmi azmiVar) {
                jag jagVar = jag.this;
                jae jaeVar = new jae(azmiVar, 0);
                AccountIdentity accountIdentity = jagVar.e.c() instanceof AccountIdentity ? (AccountIdentity) jagVar.e.c() : null;
                boolean z = wbs.c(accountIdentity) && accountIdentity.l() == 3;
                aaxl aaxlVar = jagVar.a;
                epf epfVar = (epf) jagVar.d;
                aaxk aaxkVar = new aaxk(aaxlVar.f, aaxlVar.a.c(), aaxlVar.c, evr.K(epfVar.b) && ((eow) epfVar.a.get()).j(), ((eow) ((epf) jagVar.d).a.get()).l(), z, null, null, null);
                aaxkVar.s(2);
                jagVar.a.b.i(aaxkVar, jaeVar);
            }
        }).G(ivh.f).m();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wap.class};
        }
        if (i == 0) {
            this.f.c(zjf.a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
