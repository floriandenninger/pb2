package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.ui.MultiPageMenuDialogFragmentController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdm implements lza {
    public final aoae A;
    private final gad B;
    private final gje C;
    private final fzj D;
    private final aaea E;
    private final agqo G;
    private final lkb H;
    private final lkb I;

    /* renamed from: J, reason: collision with root package name */
    private final akht f235J;
    public final Activity a;
    public final acqz b;
    public final gji c;
    public final gad d;
    public final azrw e;
    public final mak f;
    public final azrw g;
    public final mda h;
    public final aahd i;
    public final boolean j;
    public final boolean k;
    public final lzp l;
    gad m;
    lzy o;
    public lzx p;
    public apxf q;
    public byte[] r;
    public boolean t;
    public String u;
    public String v;
    public lij w;
    public final aadw x;
    public final nrp y;
    public final ohg z;
    public amsx n = amvs.a;
    public boolean s = false;
    private int F = 2;

    public mdm(Activity activity, aadw aadwVar, aaea aaeaVar, final ayqi ayqiVar, gad gadVar, gad gadVar2, acqz acqzVar, gji gjiVar, ohg ohgVar, nrp nrpVar, azrw azrwVar, gje gjeVar, fzj fzjVar, mak makVar, azrw azrwVar2, akht akhtVar, agqo agqoVar, mda mdaVar, lkb lkbVar, lkb lkbVar2, final lzp lzpVar, yqw yqwVar, final izt iztVar, final aypy aypyVar, aoae aoaeVar, aahd aahdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = activity;
        this.x = aadwVar;
        this.E = aaeaVar;
        this.d = gadVar;
        this.B = gadVar2;
        this.b = acqzVar;
        this.c = gjiVar;
        this.C = gjeVar;
        this.z = ohgVar;
        this.y = nrpVar;
        this.e = azrwVar;
        this.D = fzjVar;
        this.f = makVar;
        this.g = azrwVar2;
        this.I = lkbVar;
        this.H = lkbVar2;
        this.f235J = akhtVar;
        this.G = agqoVar;
        this.h = mdaVar;
        this.A = aoaeVar;
        this.i = aahdVar;
        this.l = lzpVar;
        this.j = evr.ba(aadwVar);
        this.k = evr.aa(aaeaVar);
        this.t = activity.getResources().getConfiguration().screenWidthDp < 320;
        yqwVar.f(new Callable() { // from class: mdd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final mdm mdmVar = mdm.this;
                izt iztVar2 = iztVar;
                lzp lzpVar2 = lzpVar;
                return aypy.m(iztVar2.a().O(luw.j), lzpVar2.d, knl.g).ab(ayqiVar).ax(new ayrs() { // from class: mdj
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        avhz avhzVar;
                        ammv ammvVar;
                        avhz avhzVar2;
                        ammv ammvVar2;
                        final mdm mdmVar2 = mdm.this;
                        Pair pair = (Pair) obj;
                        final atgn atgnVar = (atgn) pair.first;
                        final ammv ammvVar3 = (ammv) pair.second;
                        if (atgnVar == null) {
                            mdmVar2.f();
                            return;
                        }
                        mdmVar2.r = atgnVar.c.I();
                        mdmVar2.h.a();
                        final amsv i = amsx.i();
                        if (!atgnVar.e) {
                            i.c((fze) mdmVar2.e.get());
                        }
                        for (atgm atgmVar : atgnVar.d) {
                            if (atgmVar.b == 330817827) {
                                i.c((fze) mdmVar2.e.get());
                            }
                            int i2 = atgmVar.b;
                            if (i2 == 65153809) {
                                ammvVar = ammv.j((apmg) atgmVar.c);
                            } else {
                                if (i2 == 322055134) {
                                    avhzVar = (avhz) atgmVar.c;
                                } else {
                                    avhzVar = avhz.a;
                                }
                                aulq aulqVar = avhzVar.b;
                                if (aulqVar == null) {
                                    aulqVar = aulq.a;
                                }
                                if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                                    if (atgmVar.b == 322055134) {
                                        avhzVar2 = (avhz) atgmVar.c;
                                    } else {
                                        avhzVar2 = avhz.a;
                                    }
                                    aulq aulqVar2 = avhzVar2.b;
                                    if (aulqVar2 == null) {
                                        aulqVar2 = aulq.a;
                                    }
                                    ammvVar = ammv.j((apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer));
                                } else {
                                    ammvVar = amlr.a;
                                }
                            }
                            if (ammvVar.h()) {
                                ohg ohgVar2 = mdmVar2.z;
                                acra mM = mdmVar2.b.mM();
                                apmg apmgVar = (apmg) ammvVar.c();
                                if (atgmVar.b == 322055134) {
                                    ammvVar2 = ammv.j(amru.o(((avhz) atgmVar.c).c));
                                } else {
                                    ammvVar2 = amlr.a;
                                }
                                lzy a = ohgVar2.a(mM, apmgVar, (List) ammvVar2.e(amru.q()));
                                apxf apxfVar = ((apmg) ammvVar.c()).o;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                if (apxfVar.pY(SearchEndpointOuterClass.searchEndpoint)) {
                                    if (mdmVar2.k) {
                                        aunn aunnVar = (aunn) apxfVar.pX(SearchEndpointOuterClass.searchEndpoint);
                                        mdmVar2.u = aunnVar.d;
                                        mdmVar2.v = aunnVar.f;
                                        if (mdmVar2.w != null && a.a == null) {
                                            a.a = new mdg(mdmVar2, 1);
                                        }
                                    }
                                    mdmVar2.o = a;
                                    mdmVar2.q = apxfVar;
                                    if (!mdmVar2.j) {
                                    }
                                }
                                i.c(a);
                            }
                            if (atgmVar.b == 120823052) {
                                aths athsVar = (aths) atgmVar.c;
                                nrp nrpVar2 = mdmVar2.y;
                                LayoutInflater layoutInflater = mdmVar2.a.getLayoutInflater();
                                Resources resources = mdmVar2.a.getResources();
                                acra mM2 = mdmVar2.b.mM();
                                ci ciVar = (ci) nrpVar2.b.get();
                                ciVar.getClass();
                                ajjz ajjzVar = (ajjz) nrpVar2.f.get();
                                ajjzVar.getClass();
                                MultiPageMenuDialogFragmentController multiPageMenuDialogFragmentController = (MultiPageMenuDialogFragmentController) nrpVar2.a.get();
                                multiPageMenuDialogFragmentController.getClass();
                                aftn aftnVar = (aftn) nrpVar2.g.get();
                                aftnVar.getClass();
                                azrw azrwVar3 = nrpVar2.d;
                                ajut ajutVar = (ajut) nrpVar2.e.get();
                                ajutVar.getClass();
                                axpg axpgVar = ((axqv) nrpVar2.c).get();
                                axpgVar.getClass();
                                mda mdaVar2 = (mda) nrpVar2.h.get();
                                mdaVar2.getClass();
                                layoutInflater.getClass();
                                resources.getClass();
                                mM2.getClass();
                                athsVar.getClass();
                                mdmVar2.p = new lzx(ciVar, ajjzVar, multiPageMenuDialogFragmentController, aftnVar, azrwVar3, ajutVar, axpgVar, mdaVar2, layoutInflater, resources, mM2, athsVar);
                                i.c(mdmVar2.p);
                                mdmVar2.s = athsVar.i;
                            }
                        }
                        gac a2 = mdmVar2.d.a();
                        a2.e(gfw.k(R.attr.ytBrandRed));
                        a2.m(new amml() { // from class: mdi
                            @Override // defpackage.amml
                            public final Object apply(Object obj2) {
                                mdm mdmVar3 = mdm.this;
                                atgn atgnVar2 = atgnVar;
                                ammv ammvVar4 = ammvVar3;
                                amsv amsvVar = i;
                                fzf fzfVar = (fzf) obj2;
                                fzfVar.b = mdmVar3.i(atgnVar2, ammvVar4);
                                fzfVar.d(amsvVar.g());
                                return fzfVar;
                            }
                        });
                        mdmVar2.m = a2.a();
                        ((fzb) mdmVar2.g.get()).j();
                        if (mdmVar2.c.l() == null || mdmVar2.c.l().mM() == null || mdmVar2.r == null) {
                            return;
                        }
                        mdmVar2.c.l().mM().n(new acqx(mdmVar2.r));
                    }
                });
            }
        });
        yqwVar.f(new Callable() { // from class: mde
            @Override // java.util.concurrent.Callable
            public final Object call() {
                mdm mdmVar = mdm.this;
                izt iztVar2 = iztVar;
                return iztVar2.a().ab(ayqiVar).P(luw.k).ax(new mdk(mdmVar, 0));
            }
        });
        yqwVar.f(new Callable() { // from class: mdf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aypyVar.ax(new mdk(mdm.this, 1));
            }
        });
    }

    private final gir k() {
        gir f = this.C.f();
        if (f == null) {
            return null;
        }
        if (evr.bA()) {
            if (!f.av()) {
                return null;
            }
        } else if (!f.at()) {
            return null;
        }
        return f;
    }

    private final void l(PaneDescriptor paneDescriptor) {
        final apxf e = paneDescriptor != null ? paneDescriptor.e() : null;
        Class cls = paneDescriptor != null ? paneDescriptor.a : null;
        gir k = k();
        if ((k == null || !k.bb()) && ((!etx.y(e) && !((Boolean) aypy.T(this.n).Y(new ayrv() { // from class: mdl
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                mdm mdmVar = mdm.this;
                apxf apxfVar = e;
                return Boolean.valueOf(mdmVar.A.g((apxf) obj, apxfVar));
            }
        }).L(khf.n).aC(false)).booleanValue()) || (e != null && e.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)))) {
            String x = etx.x(e);
            if ((x != null && ("FEhistory".equals(x) || "FEmy_videos".equals(x) || "FEpurchases".equals(x) || x.startsWith("VL"))) || cls == this.H.a || cls == this.I.a) {
                this.F = 3;
                return;
            } else {
                this.F = 2;
                return;
            }
        }
        this.F = 1;
    }

    private final void m(ImageView imageView) {
        String C = evr.C(this.E, this.a);
        if (this.s) {
            imageView.setContentDescription(C);
        }
    }

    @Override // defpackage.lza
    public final fzs a() {
        if (h() != 1) {
            return this.D;
        }
        if (this.j) {
            return this.f;
        }
        if (this.k) {
            this.w = this.G.b(this.C.f(), this.f235J.g(this.u, this.v), this.u, this.b.mM());
            this.b.mM().n(new acqx(acsb.c(64833)));
            lzy lzyVar = this.o;
            if (lzyVar != null) {
                lzyVar.a = new mdg(this, 0);
            }
        }
        return this.o;
    }

    @Override // defpackage.gjd
    public final void aJ(gjf gjfVar) {
        l(this.C.d());
    }

    @Override // defpackage.lza
    public final gad b() {
        gad c;
        this.h.a();
        if (h() == 1) {
            if (this.m == null) {
                return c();
            }
            gir k = k();
            return k != null ? k.aM(this.m) : this.m;
        }
        gir k2 = k();
        if (k2 != null) {
            c = k2.lv();
        } else {
            c = c();
        }
        if (c == null) {
            return c();
        }
        if (this.F != 1) {
            return c;
        }
        gac a = c.a();
        a.m(new amml() { // from class: mdh
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                mdm mdmVar = mdm.this;
                fzf fzfVar = (fzf) obj;
                fzfVar.b = mdmVar.i(atgn.a, (ammv) mdmVar.l.d.aB());
                return fzfVar;
            }
        });
        return a.a();
    }

    @Override // defpackage.lza
    public final gad c() {
        return h() == 3 ? this.B : this.d;
    }

    @Override // defpackage.lza
    public final PaneDescriptor d() {
        gir k = k();
        if (k == null) {
            return null;
        }
        return PaneDescriptor.b(k);
    }

    @Override // defpackage.lza
    public final lij e() {
        return this.w;
    }

    @Override // defpackage.lza
    public final void f() {
        this.p = null;
        this.m = null;
        this.r = null;
        this.o = null;
        ((fzb) this.g.get()).j();
    }

    @Override // defpackage.gjb
    public final void g(gir girVar) {
        if (girVar.G) {
            return;
        }
        l(PaneDescriptor.b(girVar));
    }

    @Override // defpackage.lza
    public final int h() {
        int i = this.F;
        return i == 1 ? this.m != null ? 1 : 2 : i;
    }

    public final View i(atgn atgnVar, ammv ammvVar) {
        LayoutInflater from = LayoutInflater.from(this.a);
        this.f.h(false);
        final aqjt aqjtVar = atgnVar.f;
        if (aqjtVar == null) {
            aqjtVar = aqjt.a;
        }
        if (evr.ba(this.x)) {
            View b = this.f.b(from);
            this.f.g(b, this.q, this.s, this.t);
            this.f.h(true);
            return b;
        }
        if (!ammvVar.h() || this.t) {
            View inflate = from.inflate(R.layout.action_bar_ringo, (ViewGroup) null);
            j((ImageView) inflate.findViewById(R.id.youtube_logo));
            ImageView imageView = (ImageView) inflate.findViewById(R.id.youtube_logo);
            aqjs aqjsVar = aqjtVar.b;
            if (aqjsVar == null) {
                aqjsVar = aqjs.a;
            }
            if ((aqjsVar.b & 32) == 0) {
                imageView.setClickable(false);
                return inflate;
            }
            imageView.setClickable(true);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: mdc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mdm mdmVar = mdm.this;
                    aqjt aqjtVar2 = aqjtVar;
                    aahd aahdVar = mdmVar.i;
                    aqjs aqjsVar2 = aqjtVar2.b;
                    if (aqjsVar2 == null) {
                        aqjsVar2 = aqjs.a;
                    }
                    apxf apxfVar = aqjsVar2.c;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.a(apxfVar);
                }
            });
            return inflate;
        }
        lzq lzqVar = (lzq) ammvVar.c();
        View inflate2 = from.inflate(R.layout.action_bar_ringo, (ViewGroup) null);
        ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.youtube_logo);
        imageView2.setImageDrawable(lzqVar.a());
        lzqVar.c(imageView2, this.i);
        lzqVar.b();
        m(imageView2);
        return inflate2;
    }

    public final void j(ImageView imageView) {
        Drawable T;
        if (evr.ba(this.x)) {
            return;
        }
        if (this.t) {
            T = aii.a(this.a, R.drawable.yt_icon_header);
        } else if (this.s) {
            T = wbs.T(this.a, R.attr.ytPremiumWordmarkHeader);
        } else {
            T = wbs.T(this.a, R.attr.ytWordmarkHeader);
        }
        imageView.setImageDrawable(T);
        m(imageView);
    }
}
