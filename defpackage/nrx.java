package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nrx implements nqb {
    private TextView A;
    private CharSequence C;
    private CharSequence D;
    private arfm E;
    private atdu F;
    private CharSequence G;
    private auwh H;
    private atdc I;

    /* renamed from: J, reason: collision with root package name */
    private xqg f245J;
    private Integer K;
    private ImageView M;
    private avgg N;
    private apxf O;
    private View P;
    private ViewStub Q;
    private yha R;
    private gaf S;
    private ayqx T;
    private nqr U;
    private final ajoy V;
    private final akht W;
    private final ajun X;
    private final ajoy Y;
    public final aahd a;
    public ImageView b;
    public ImageView c;
    public apmg d;
    public apmg e;
    public nqc f;
    public nqe g;
    public acra h;
    private final Context i;
    private final ajvb j;
    private final ajdw k;
    private final axpg l;
    private final ajuw m;
    private final ajut n;
    private final ajjz o;
    private final akbu p;
    private final ypa q;
    private final akcp r;
    private final nrk s;
    private final nwx t;
    private final boolean u;
    private View v;
    private ImageView w;
    private TextView x;
    private TextView y;
    private View z;
    private Optional B = Optional.empty();
    private boolean L = true;

    public nrx(Context context, ajvb ajvbVar, ajdw ajdwVar, axpg axpgVar, ajoy ajoyVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar, ajjz ajjzVar, akbu akbuVar, acra acraVar, ajun ajunVar, akht akhtVar, ajoy ajoyVar2, ypa ypaVar, akcp akcpVar, nrk nrkVar, nwx nwxVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.i = context;
        this.j = ajvbVar;
        this.k = ajdwVar;
        this.l = axpgVar;
        this.V = ajoyVar;
        this.a = aahdVar;
        this.m = ajuwVar;
        this.n = ajutVar;
        this.o = ajjzVar;
        this.p = akbuVar;
        this.h = acraVar;
        this.X = ajunVar;
        this.W = akhtVar;
        this.Y = ajoyVar2;
        this.q = ypaVar;
        this.r = akcpVar;
        this.s = nrkVar;
        this.t = nwxVar;
        this.u = axzfVar.e().booleanValue();
    }

    private final void A() {
        String charSequence;
        String str;
        CharSequence charSequence2 = this.C;
        if (charSequence2 == null || charSequence2.toString().isEmpty()) {
            CharSequence charSequence3 = this.G;
            charSequence = charSequence3 != null ? charSequence3.toString() : null;
        } else {
            String valueOf = String.valueOf(this.C);
            CharSequence charSequence4 = this.D;
            String str2 = "";
            if (charSequence4 != null) {
                String valueOf2 = String.valueOf(charSequence4);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 2);
                sb.append(". ");
                sb.append(valueOf2);
                str = sb.toString();
            } else {
                str = "";
            }
            CharSequence charSequence5 = this.G;
            if (charSequence5 != null) {
                String valueOf3 = String.valueOf(charSequence5);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 2);
                sb2.append(". ");
                sb2.append(valueOf3);
                str2 = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length() + String.valueOf(str2).length());
            sb3.append(valueOf);
            sb3.append(str);
            sb3.append(str2);
            charSequence = sb3.toString();
        }
        View view = this.v;
        if (view != null) {
            view.setContentDescription(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void B(ayqx ayqxVar) {
        if (ayqxVar == 0 || ayqxVar.e()) {
            return;
        }
        azqb.f((AtomicReference) ayqxVar);
    }

    private final void t(ImageView imageView, final apmg apmgVar) {
        aots aotsVar;
        if (apmgVar != null) {
            whu.I(imageView, true);
            aott aottVar = apmgVar.s;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            if ((aottVar.b & 1) != 0) {
                aott aottVar2 = apmgVar.s;
                if (aottVar2 == null) {
                    aottVar2 = aott.a;
                }
                aotsVar = aottVar2.c;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
            } else {
                aotsVar = apmgVar.r;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
            }
            if (aotsVar != null && (aotsVar.b & 2) != 0) {
                imageView.setContentDescription(aotsVar.c);
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: nrs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    apxf apxfVar;
                    nrx nrxVar = nrx.this;
                    apmg apmgVar2 = apmgVar;
                    apxf apxfVar2 = null;
                    if ((apmgVar2.b & 16384) != 0) {
                        apxfVar = apmgVar2.o;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                    } else {
                        apxfVar = null;
                    }
                    if (apxfVar == null) {
                        if ((apmgVar2.b & 8192) != 0) {
                            apxfVar = apmgVar2.n;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                        } else {
                            apxfVar = null;
                        }
                    }
                    if (apxfVar != null) {
                        apxfVar2 = apxfVar;
                    } else if ((apmgVar2.b & 32768) != 0 && (apxfVar2 = apmgVar2.p) == null) {
                        apxfVar2 = apxf.a;
                    }
                    if (apxfVar2 != null) {
                        nrxVar.a.a(apxfVar2);
                    }
                }
            });
            arfs arfsVar = apmgVar.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            if ((1 & arfsVar.b) != 0) {
                ajut ajutVar = this.n;
                arfs arfsVar2 = apmgVar.g;
                if (arfsVar2 == null) {
                    arfsVar2 = arfs.a;
                }
                arfr b = arfr.b(arfsVar2.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                imageView.setImageResource(ajutVar.a(b));
                return;
            }
            return;
        }
        whu.I(imageView, false);
    }

    private final void u(View view) {
        arfm arfmVar = this.E;
        if (arfmVar == null) {
            yha yhaVar = this.R;
            if (yhaVar != null) {
                yhaVar.g();
                return;
            }
            return;
        }
        if (this.R == null) {
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.icon_badge);
            this.R = this.W.b(viewStub);
            if ((arfmVar.b & 64) != 0) {
                aots aotsVar = arfmVar.i;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                viewStub.setContentDescription(aotsVar.c);
            }
        }
        ajok ajokVar = new ajok();
        ajokVar.a(this.h);
        this.R.oB(ajokVar, arfmVar);
    }

    private final void v(aqtu aqtuVar) {
        arfm arfmVar = null;
        if (aqtuVar != null) {
            aulq aulqVar = aqtuVar.h;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(IconBadgeRendererOuterClass.iconBadgeRenderer)) {
                aulq aulqVar2 = aqtuVar.h;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                arfmVar = (arfm) aulqVar2.pX(IconBadgeRendererOuterClass.iconBadgeRenderer);
            }
        }
        this.E = arfmVar;
        View view = this.v;
        if (view != null) {
            u(view);
        }
    }

    private final void w(avgg avggVar, final apxf apxfVar) {
        this.N = avggVar;
        this.O = apxfVar;
        ImageView imageView = this.M;
        if (imageView != null) {
            if (avggVar != null) {
                ImageView imageView2 = (ImageView) this.v.findViewById(R.id.thumbnail);
                this.M = imageView2;
                imageView2.setVisibility(0);
                this.o.h(this.M, avggVar);
                if (apxfVar != null) {
                    this.M.setOnClickListener(new View.OnClickListener() { // from class: nrt
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            nrx nrxVar = nrx.this;
                            nrxVar.a.a(apxfVar);
                        }
                    });
                    return;
                }
                return;
            }
            imageView.setVisibility(8);
            this.o.e(this.M);
        }
    }

    private final void x(aqtu aqtuVar) {
        atdu atduVar = null;
        if (aqtuVar != null) {
            aulq aulqVar = aqtuVar.j;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                aulq aulqVar2 = aqtuVar.j;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                atduVar = (atdu) aulqVar2.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
            }
        }
        this.F = atduVar;
    }

    private final void y() {
        if (this.w == null) {
            return;
        }
        if (this.B.isPresent()) {
            t(this.w, (apmg) this.B.get());
            whu.I(this.w, true);
            return;
        }
        this.w.setOnClickListener(new View.OnClickListener() { // from class: nrr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nrx nrxVar = nrx.this;
                acra acraVar = nrxVar.h;
                if (acraVar != null) {
                    acraVar.I(3, new acqx(acsb.c(33917)), null);
                }
                nqc nqcVar = nrxVar.f;
                if (nqcVar != null) {
                    nqcVar.a();
                }
            }
        });
        ImageView imageView = this.w;
        int i = 8;
        if (this.s.f() && this.f != null) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    private final void z(apmg apmgVar) {
        if (apmgVar == null || (apmgVar.b & 2048) == 0) {
            return;
        }
        this.r.g(apmgVar.k);
    }

    @Override // defpackage.nqb
    public final View a() {
        return this.P;
    }

    @Override // defpackage.nqb
    public final View b() {
        if (this.v == null) {
            View inflate = LayoutInflater.from(this.i).inflate(true != this.u ? R.layout.engagement_panel_title_header : R.layout.new_engagement_panel_title_header, (ViewGroup) null, false);
            this.v = inflate;
            this.M = (ImageView) inflate.findViewById(R.id.thumbnail);
            this.x = (TextView) this.v.findViewById(R.id.title);
            this.y = (TextView) this.v.findViewById(R.id.subtitle);
            this.b = (ImageView) this.v.findViewById(R.id.information_button);
            this.c = (ImageView) this.v.findViewById(R.id.action_button);
            this.z = this.v.findViewById(R.id.overflow_menu_anchor);
            this.A = (TextView) this.v.findViewById(R.id.contextual_info);
            this.w = (ImageView) this.v.findViewById(R.id.back_button);
            xqg xqgVar = new xqg(this.i, this.j, this.V, this.v.findViewById(R.id.sort_menu_anchor), this.p, this.h, this.X, this.q, null, null, null);
            this.f245J = xqgVar;
            if (this.g != null) {
                xqgVar.d = new xqf() { // from class: nrv
                    @Override // defpackage.xqf
                    public final void a(ajce ajceVar) {
                        nrx.this.g.E(ajceVar);
                    }
                };
            }
            ViewStub viewStub = (ViewStub) this.v.findViewById(R.id.title_badge);
            this.Q = viewStub;
            this.S = this.Y.J(this.i, viewStub);
        }
        w(this.N, this.O);
        y();
        this.x.setText(this.C);
        this.x.setVisibility(this.C == null ? 8 : 0);
        this.y.setText(this.D);
        this.y.setVisibility(this.D == null ? 8 : 0);
        atdu atduVar = this.F;
        if (atduVar != null) {
            if (this.S == null) {
                this.S = this.Y.J(this.i, this.Q);
            }
            if ((atduVar.b & 128) != 0) {
                ViewStub viewStub2 = this.Q;
                aots aotsVar = atduVar.g;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                viewStub2.setContentDescription(aotsVar.c);
            }
            this.S.f(atduVar);
        }
        t(this.b, this.d);
        t(this.c, this.e);
        u(this.v);
        p(this.G);
        xqg xqgVar2 = this.f245J;
        if (xqgVar2 != null) {
            xqgVar2.a(this.H);
        }
        if (this.z != null) {
            r(this.I);
        }
        Integer num = this.K;
        if (num != null) {
            int intValue = num.intValue();
            this.K = Integer.valueOf(intValue);
            TextView textView = this.A;
            if (textView != null) {
                yny.z(textView, yny.r(intValue), ViewGroup.MarginLayoutParams.class);
            }
        }
        return this.v;
    }

    @Override // defpackage.nqb
    public final void c() {
        B(this.T);
        z(this.d);
        z(this.e);
    }

    @Override // defpackage.nqb
    public final void d() {
        ImageView imageView = this.w;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.h.n(new acqx(acsb.c(33917)));
        }
        B(this.T);
        this.T = this.t.j.s(niy.g).X(new ayrs() { // from class: nrw
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                nrx nrxVar = nrx.this;
                nrxVar.n(nrxVar.b, nrxVar.d);
                nrxVar.n(nrxVar.c, nrxVar.e);
            }
        });
    }

    @Override // defpackage.nqb
    public final void e(boolean z) {
        whu.I(this.w, z);
    }

    @Override // defpackage.nqb
    public final void f(boolean z) {
        if (this.L == z) {
            return;
        }
        this.L = z;
        nqr nqrVar = this.U;
        if (nqrVar == null) {
            return;
        }
        nqrVar.a(z);
    }

    @Override // defpackage.nqb
    public final void g(auwh auwhVar) {
        this.H = auwhVar;
        xqg xqgVar = this.f245J;
        if (xqgVar != null) {
            xqgVar.a(auwhVar);
        }
    }

    @Override // defpackage.nqb
    public final void h(final nqe nqeVar) {
        if (this.g == nqeVar) {
            return;
        }
        this.g = nqeVar;
        xqg xqgVar = this.f245J;
        if (xqgVar != null) {
            xqgVar.d = new xqf() { // from class: nru
                @Override // defpackage.xqf
                public final void a(ajce ajceVar) {
                    nqe.this.E(ajceVar);
                }
            };
        }
    }

    @Override // defpackage.nqb
    public final void i(nqc nqcVar) {
        this.f = nqcVar;
    }

    @Override // defpackage.nqb
    public final void j(CharSequence charSequence) {
        this.D = charSequence;
        TextView textView = this.y;
        if (textView != null) {
            textView.setText(charSequence);
            this.y.setVisibility(charSequence != null ? 0 : 8);
            A();
        }
    }

    @Override // defpackage.nqb
    public final void k(CharSequence charSequence) {
        this.C = charSequence;
        TextView textView = this.x;
        if (textView != null) {
            textView.setText(charSequence);
            this.x.setVisibility(charSequence != null ? 0 : 8);
            A();
        }
    }

    @Override // defpackage.nqb
    public final boolean l() {
        return this.L;
    }

    @Override // defpackage.nqb
    public final void m(nqr nqrVar) {
        if (this.U == nqrVar) {
            return;
        }
        this.U = nqrVar;
    }

    public final void n(ImageView imageView, apmg apmgVar) {
        if (imageView == null || apmgVar == null || (apmgVar.b & 2048) == 0) {
            return;
        }
        this.r.d(apmgVar.k, imageView);
    }

    public final void o(aqtu aqtuVar) {
        apmg apmgVar;
        aulq aulqVar = aqtuVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = aqtuVar.h;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        this.e = apmgVar;
        ImageView imageView = this.c;
        if (imageView != null) {
            t(imageView, apmgVar);
        }
    }

    public final void p(CharSequence charSequence) {
        this.G = charSequence;
        TextView textView = this.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
        A();
    }

    public final void q(aqtu aqtuVar) {
        avgg avggVar;
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        apmg apmgVar = null;
        if (aqtuVar == null) {
            k(null);
            s(null);
            x(null);
            p(null);
            g(null);
            r(null);
            v(null);
            this.d = null;
            this.B = Optional.empty();
            y();
            return;
        }
        if ((aqtuVar.b & 1024) != 0) {
            avggVar = aqtuVar.k;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        if ((aqtuVar.b & 4096) != 0) {
            apxfVar = aqtuVar.l;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        w(avggVar, apxfVar);
        if ((aqtuVar.b & 1) != 0) {
            aqygVar = aqtuVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        k(ajcq.b(aqygVar));
        if ((aqtuVar.b & 16) != 0) {
            aqygVar2 = aqtuVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        j(ajcq.b(aqygVar2));
        aulq aulqVar = aqtuVar.m;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        s(aulqVar);
        x(aqtuVar);
        if ((aqtuVar.b & 4) != 0) {
            aqygVar3 = aqtuVar.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        p(ajcq.b(aqygVar3));
        if ((aqtuVar.b & 8) != 0) {
            aqtv aqtvVar = aqtuVar.f;
            if (aqtvVar == null) {
                aqtvVar = aqtv.a;
            }
            g(aqtvVar.b == 76818770 ? (auwh) aqtvVar.c : null);
            r(aqtvVar.b == 66439850 ? (atdc) aqtvVar.c : null);
        } else {
            g(null);
            r(null);
        }
        aulq aulqVar2 = aqtuVar.d;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar3 = aqtuVar.d;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            apmgVar = (apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer);
        }
        this.d = apmgVar;
        o(aqtuVar);
        v(aqtuVar);
        if ((aqtuVar.b & 524288) != 0) {
            aulq aulqVar4 = aqtuVar.n;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            this.B = Optional.of((apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer));
        } else {
            this.B = Optional.empty();
        }
        y();
        if ((aqtuVar.b & 128) != 0) {
            f(!aqtuVar.i);
        }
    }

    public final void r(atdc atdcVar) {
        String str;
        this.I = atdcVar;
        View view = this.z;
        if (view != null) {
            whu.I(view, atdcVar != null);
            this.m.d(this.z, atdcVar, atdcVar, this.h);
            if (atdcVar != null) {
                aott aottVar = atdcVar.i;
                if (aottVar == null) {
                    aottVar = aott.a;
                }
                if ((aottVar.b & 1) != 0) {
                    aott aottVar2 = atdcVar.i;
                    if (aottVar2 == null) {
                        aottVar2 = aott.a;
                    }
                    aots aotsVar = aottVar2.c;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                    str = aotsVar.c;
                } else {
                    str = null;
                }
                this.z.setContentDescription(str);
            }
        }
    }

    public final void s(aulq aulqVar) {
        View view;
        if (aulqVar == null || !aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
            view = null;
        } else {
            aqrf aqrfVar = (aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer);
            ajds a = ajds.a(aqrfVar);
            this.k.oB(new ajok(), a);
            view = this.k.a();
        }
        this.P = view;
    }
}
