package defpackage;

import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kci implements flo {
    private final ahnc A;
    private final kkf B;
    private final ahmy C;
    private final kea D;
    private final MdxOverlaysPresenter E;
    private final SuggestedActionsMainController F;
    private final ekl G;
    private final kda H;
    private final YouTubeControlsOverlay I;

    /* renamed from: J, reason: collision with root package name */
    private final kow f228J;
    private final ahvb K;
    private final ahvb L;
    private final ahvb M;
    private final aioc N;
    private final aadw O;
    private final aoae P;
    private final YouTubePlayerOverlaysLayout a;
    private final ahhc b;
    private final xjl c;
    private final wwn d;
    private final kex e;
    private final flu f;
    private final ayqw g = new ayqw();
    private final ahff h;
    private final ahnh i;
    private final ahnj j;
    private final nmy k;
    private final ahzg l;
    private final zdf m;
    private final kra n;
    private final ahvm o;
    private final xhz p;
    private final xji q;
    private final xiu r;
    private final xik s;
    private final CreatorEndscreenOverlayPresenter t;
    private final ahmg u;
    private final ahwu v;
    private final ahmx w;
    private final kec x;
    private final kgk y;
    private final xmx z;

    public kci(YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout, ahhc ahhcVar, xjl xjlVar, wwn wwnVar, kex kexVar, fln flnVar, flu fluVar, ahvb ahvbVar, kda kdaVar, YouTubeControlsOverlay youTubeControlsOverlay, kow kowVar, ahmy ahmyVar, ahnc ahncVar, ahvq ahvqVar, ahvq ahvqVar2, xmx xmxVar, kea keaVar, ahnh ahnhVar, ahnj ahnjVar, nmy nmyVar, kkf kkfVar, xhz xhzVar, ahvm ahvmVar, xji xjiVar, xiu xiuVar, xik xikVar, kra kraVar, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, ahzg ahzgVar, ahwu ahwuVar, ahmg ahmgVar, ahmx ahmxVar, kec kecVar, kgk kgkVar, aadw aadwVar, aioc aiocVar, ahff ahffVar, zdf zdfVar, MdxOverlaysPresenter mdxOverlaysPresenter, SuggestedActionsMainController suggestedActionsMainController, aoae aoaeVar, ekl eklVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = youTubePlayerOverlaysLayout;
        this.b = ahhcVar;
        this.c = xjlVar;
        this.d = wwnVar;
        this.e = kexVar;
        this.f = fluVar;
        this.K = ahvbVar;
        this.H = kdaVar;
        this.I = youTubeControlsOverlay;
        this.f228J = kowVar;
        this.C = ahmyVar;
        this.M = ahvqVar;
        this.L = ahvqVar2;
        this.z = xmxVar;
        this.A = ahncVar;
        this.D = keaVar;
        this.i = ahnhVar;
        this.j = ahnjVar;
        this.k = nmyVar;
        this.B = kkfVar;
        this.p = xhzVar;
        this.o = ahvmVar;
        this.q = xjiVar;
        this.r = xiuVar;
        this.s = xikVar;
        this.n = kraVar;
        this.t = creatorEndscreenOverlayPresenter;
        this.v = ahwuVar;
        this.u = ahmgVar;
        this.w = ahmxVar;
        this.x = kecVar;
        this.y = kgkVar;
        this.O = aadwVar;
        this.N = aiocVar;
        this.h = ahffVar;
        this.l = ahzgVar;
        this.m = zdfVar;
        this.E = mdxOverlaysPresenter;
        this.F = suggestedActionsMainController;
        this.P = aoaeVar;
        this.G = eklVar;
        youTubeControlsOverlay.s = creatorEndscreenOverlayPresenter;
        youTubeControlsOverlay.h(ahvbVar);
        ahmyVar.h(ahvbVar);
        Set set = ahnhVar.a;
        kecVar.getClass();
        set.add(kecVar);
        zdfVar.b(kkfVar);
        ahmgVar.a(fluVar);
        if (kkfVar != null) {
            fls flsVar = fluVar.a[1];
            flsVar.a.add(kkfVar);
            kkfVar.f = flsVar.b;
            fluVar.b();
        }
        ahhcVar.b(ahncVar);
        ahhcVar.b(ahmyVar);
        ahhcVar.b(xmxVar);
        ahhcVar.b(ahnhVar);
        ahhcVar.b(ahnjVar);
        ahhcVar.b(nmyVar);
        youTubeControlsOverlay.getClass();
        youTubePlayerOverlaysLayout.o = new kpc(youTubeControlsOverlay, 1);
        kexVar.c = ahwuVar;
        keaVar.j(kecVar);
        keaVar.j(ahffVar);
        kecVar.r(youTubeControlsOverlay);
        kecVar.e.add(youTubeControlsOverlay);
        kecVar.r(suggestedActionsMainController);
        mdxOverlaysPresenter.d.f.add(youTubeControlsOverlay);
        mdxOverlaysPresenter.d.e.add(youTubeControlsOverlay);
        flnVar.a(this);
    }

    private static final int e(fhg fhgVar) {
        if (fhgVar.b()) {
            return 2;
        }
        return fhgVar.i() ? 1 : 0;
    }

    @Override // defpackage.flo
    public final void a() {
        this.I.nf();
    }

    @Override // defpackage.flo
    public final void d() {
        this.I.R();
    }

    @Override // defpackage.flm
    public final void kG() {
        this.g.c();
        this.c.d();
        this.d.d(this.q);
        this.d.d(this.r);
        this.d.d(this.s);
        this.d.d(this.n);
        xji xjiVar = this.q;
        if (xjiVar.e != null && xjiVar.h != null) {
            xjiVar.f();
        }
        xiu xiuVar = this.r;
        if (xiuVar.d != null && xiuVar.g != null) {
            xiuVar.f();
        }
        xik xikVar = this.s;
        if (xikVar.e != null) {
            xikVar.f();
        }
        kra kraVar = this.n;
        if (kraVar.e) {
            kraVar.b();
        }
        kec kecVar = this.x;
        if (kecVar.f == 2) {
            kecVar.f = 3;
            kecVar.y();
        }
        ahvm ahvmVar = this.o;
        ahvmVar.c();
        ahvmVar.N.a();
        ahmx ahmxVar = this.w;
        ((ahnb) ahmxVar.a).a = null;
        ((kfy) ahmxVar.b).c = null;
        ((ahos) ahmxVar.c.get()).e = null;
        this.a.removeOnLayoutChangeListener(this.y);
        this.P.N();
    }

    @Override // defpackage.flm
    public final void kH() {
        asvu asvuVar = this.O.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.S) {
            this.g.g(this.j.kI(this.N));
        }
        this.g.g(this.o.Q.kI(this.N));
        ayqw ayqwVar = this.g;
        final ahzg ahzgVar = this.l;
        ayqwVar.d(this.N.V().X(new ayrs() { // from class: ahzc
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahzg ahzgVar2 = ahzg.this;
                ahel ahelVar = (ahel) obj;
                if (ahelVar.a().c() != null) {
                    ahzgVar2.g |= ahelVar.a().c().d.d("PLAYER_IS_CONTENT_INTERSTITIAL_KEY");
                    ahzgVar2.a(ahelVar.a().c().a);
                } else {
                    ahzgVar2.c.a(false);
                }
            }
        }));
        this.g.g(this.v.u.kI(this.N));
        this.c.m(this.p);
        this.d.a(this.q);
        this.d.a(this.r);
        this.d.a(this.s);
        this.d.a(this.n);
        xik xikVar = this.s;
        if (xikVar.e != null) {
            xikVar.h(xikVar.i);
        }
        kra kraVar = this.n;
        if (kraVar.e) {
            kraVar.d();
        }
        this.x.y();
        ahvm ahvmVar = this.o;
        ahvmVar.b();
        ahvmVar.N.b();
        ahmx ahmxVar = this.w;
        ((ahnb) ahmxVar.a).a = ahmxVar;
        ((kfy) ahmxVar.b).c = ahmxVar;
        ((ahos) ahmxVar.c.get()).e = ahmxVar;
        this.a.addOnLayoutChangeListener(this.y);
        this.P.O(this.G);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        ahsd ahsdVar;
        kow kowVar = this.f228J;
        if (kowVar.i) {
            kowVar.z(fhgVar2);
        } else {
            int e = e(fhgVar);
            int e2 = e(fhgVar2);
            if (e != e2) {
                kow kowVar2 = this.f228J;
                amkq.O(!kowVar2.i, "wrong arm");
                InlineTimeBarWrapper inlineTimeBarWrapper = kowVar2.j;
                if (e == 2) {
                    YouTubeControlsOverlay youTubeControlsOverlay = this.I;
                    if (youTubeControlsOverlay.C) {
                        youTubeControlsOverlay.l.removeView(inlineTimeBarWrapper);
                    } else {
                        youTubeControlsOverlay.N.remove(inlineTimeBarWrapper);
                    }
                } else if (e == 1) {
                    this.H.d[0].d(inlineTimeBarWrapper);
                }
                if (e2 == 2) {
                    YouTubeControlsOverlay youTubeControlsOverlay2 = this.I;
                    if (youTubeControlsOverlay2.C) {
                        youTubeControlsOverlay2.l.addView(inlineTimeBarWrapper);
                        youTubeControlsOverlay2.h.bringToFront();
                    } else {
                        youTubeControlsOverlay2.N.add(inlineTimeBarWrapper);
                    }
                } else if (e2 == 1) {
                    this.H.d[0].a(inlineTimeBarWrapper);
                }
            }
        }
        YouTubeControlsOverlay youTubeControlsOverlay3 = this.I;
        ahvb ahvbVar = this.L;
        if (!youTubeControlsOverlay3.mY(fhgVar2)) {
            ahvbVar = this.K;
        }
        youTubeControlsOverlay3.h(ahvbVar);
        this.C.h(fhgVar2.g() ? this.M : this.K);
        CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.t;
        boolean z = (fhgVar2.k() || fhgVar2.e()) || fhgVar2.m();
        if (creatorEndscreenOverlayPresenter.j == z) {
            return;
        }
        creatorEndscreenOverlayPresenter.j = z;
        if (z && (ahsdVar = creatorEndscreenOverlayPresenter.l) != null) {
            ahsdVar.a(true);
        }
        if (creatorEndscreenOverlayPresenter.i) {
            creatorEndscreenOverlayPresenter.s();
        }
    }
}
