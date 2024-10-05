package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmn extends ajpc implements lua, ygx {
    public final acra a;
    public luc b;
    public ajok c;
    public aqbs d;
    public apxf e;
    public byte[] f;
    private final Context g;
    private final ajop h;
    private final ajjz i;
    private final akbu j;
    private final fhz k;
    private final akbd l;
    private final View m;
    private final TextView n;
    private final ajut o;
    private final ColorStateList p;
    private final zce q;
    private TextView r;
    private TintableImageView s;
    private apxf t;
    private yha u;
    private arfm v;
    private final akht x;

    public mmn(Context context, ajjz ajjzVar, ajut ajutVar, final aahd aahdVar, gma gmaVar, akbu akbuVar, fhz fhzVar, akbd akbdVar, akht akhtVar, acqz acqzVar, byte[] bArr) {
        this.g = context;
        this.h = gmaVar;
        ajutVar.getClass();
        this.o = ajutVar;
        aahdVar.getClass();
        ajjzVar.getClass();
        this.i = ajjzVar;
        this.j = akbuVar;
        this.k = fhzVar;
        this.l = akbdVar;
        this.x = akhtVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_link, (ViewGroup) null);
        this.m = inflate;
        this.n = (TextView) inflate.findViewById(R.id.title);
        this.q = zce.b((ViewStub) inflate.findViewById(R.id.thumbnail), TintableImageView.class);
        this.p = wbs.S(context, R.attr.ytTextPrimary);
        this.a = acqzVar.mM();
        gmaVar.c(inflate);
        gmaVar.d(new View.OnClickListener() { // from class: mmm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acra acraVar;
                mmn mmnVar = mmn.this;
                aahd aahdVar2 = aahdVar;
                luc lucVar = mmnVar.b;
                if (lucVar != null) {
                    lucVar.b(mmnVar, mmnVar.d);
                }
                byte[] bArr2 = mmnVar.f;
                if (bArr2.length > 0 && (acraVar = mmnVar.a) != null) {
                    acraVar.I(3, new acqx(bArr2), null);
                }
                if (mmnVar.e != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.rendering.presenter.PresentContext", mmnVar.c);
                    if (mmnVar.e.pY(SignInEndpointOuterClass.signInEndpoint)) {
                        hashMap.put("FromTopBarMenu", true);
                    }
                    aahdVar2.c(mmnVar.e, hashMap);
                }
            }
        });
    }

    private final void f(boolean z) {
        if (z) {
            this.u.oB(this.c, this.v);
            yny.B(this.m, -1, -2);
            this.m.setVisibility(0);
        } else {
            yny.B(this.m, 0, 0);
            this.m.setVisibility(8);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.h).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.k.d(this);
        luc lucVar = this.b;
        if (lucVar != null) {
            lucVar.d(this);
        }
        yha yhaVar = this.u;
        if (yhaVar != null) {
            yhaVar.b(ajosVar);
            this.u.m(this);
        }
    }

    @Override // defpackage.lua
    public final void c(boolean z) {
        etx.p(this.g, this.c, this.h, z);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        yha yhaVar;
        int i;
        apxf apxfVar;
        acra acraVar;
        View view;
        arej arejVar;
        arfs arfsVar;
        aqbs aqbsVar = (aqbs) obj;
        this.c = ajokVar;
        this.d = aqbsVar;
        ammv a = luc.a(ajokVar);
        if (a.h()) {
            luc lucVar = (luc) a.c();
            this.b = lucVar;
            lucVar.c(this, aqbsVar);
        } else {
            this.b = null;
        }
        TextView textView = this.n;
        if ((aqbsVar.b & 16) != 0) {
            aqygVar = aqbsVar.j;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        if ((aqbsVar.b & 32) != 0) {
            aqygVar2 = aqbsVar.k;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b = ajcq.b(aqygVar2);
        if (!TextUtils.isEmpty(b) && this.r == null) {
            this.r = (TextView) ((ViewStub) this.m.findViewById(R.id.subtitle)).inflate().findViewById(R.id.subtitle);
        }
        TextView textView2 = this.r;
        if (textView2 != null) {
            whu.G(textView2, b);
        }
        int i2 = aqbsVar.b;
        if ((i2 & 2) != 0) {
            aulq aulqVar = aqbsVar.h;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            arfm arfmVar = (arfm) ahbj.n(aulqVar, IconBadgeRendererOuterClass.iconBadgeRenderer);
            this.v = arfmVar;
            if (arfmVar != null) {
                if (this.u == null) {
                    this.u = this.x.b((ViewStub) this.m.findViewById(R.id.icon_badge));
                }
                this.u.h(this.v);
                if (!this.v.c.isEmpty()) {
                    this.u.j(this);
                }
                f(this.v.f);
            }
        } else if ((i2 & 1) != 0) {
            ajut ajutVar = this.o;
            arfs arfsVar2 = aqbsVar.g;
            if (arfsVar2 == null) {
                arfsVar2 = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar2.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            int a2 = ajutVar.a(b2);
            this.i.e((ImageView) this.q.a());
            if (!this.q.c() || a2 != 0) {
                ((TintableImageView) this.q.a()).setImageResource(a2);
                ((TintableImageView) this.q.a()).setVisibility(0);
                ((TintableImageView) this.q.a()).a(aqbsVar.o ? this.p : null);
            } else {
                ((TintableImageView) this.q.a()).setImageDrawable(null);
                ((TintableImageView) this.q.a()).setVisibility(8);
                ((TintableImageView) this.q.a()).a(null);
            }
        } else if ((i2 & 4) != 0) {
            ajjz ajjzVar = this.i;
            ImageView imageView = (ImageView) this.q.a();
            avgg avggVar = aqbsVar.i;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            ((TintableImageView) this.q.a()).setImageTintList(null);
            ((TintableImageView) this.q.a()).setVisibility(0);
        }
        if ((aqbsVar.b & 2) != 0 && this.q.c()) {
            ((TintableImageView) this.q.a()).setVisibility(8);
        } else if ((aqbsVar.b & 2) == 0 && (yhaVar = this.u) != null) {
            yhaVar.g();
        }
        if (aqbsVar.c != 7) {
            TintableImageView tintableImageView = this.s;
            if (tintableImageView != null) {
                tintableImageView.setVisibility(8);
            }
        } else {
            if (this.s == null) {
                this.s = (TintableImageView) ((ViewStub) this.m.findViewById(R.id.secondary_icon)).inflate().findViewById(R.id.secondary_icon);
            }
            ajut ajutVar2 = this.o;
            if (aqbsVar.c == 7) {
                arfsVar = (arfs) aqbsVar.d;
            } else {
                arfsVar = arfs.a;
            }
            arfr b3 = arfr.b(arfsVar.c);
            if (b3 == null) {
                b3 = arfr.UNKNOWN;
            }
            int a3 = ajutVar2.a(b3);
            if (a3 == 0) {
                this.s.setImageDrawable(null);
                this.s.setVisibility(8);
                this.s.a(null);
            } else {
                this.s.setImageResource(a3);
                this.s.setVisibility(0);
                this.s.a(this.p);
            }
        }
        aqbr aqbrVar = aqbsVar.m;
        if (aqbrVar == null) {
            aqbrVar = aqbr.a;
        }
        if (aqbrVar.b == 102716411) {
            if (!this.q.c() || ((TintableImageView) this.q.a()).getVisibility() != 0) {
                if (this.n.getVisibility() == 0) {
                    view = this.n;
                } else {
                    TextView textView3 = this.r;
                    view = (textView3 == null || textView3.getVisibility() != 0) ? this.m : this.r;
                }
            } else {
                view = this.q.a();
            }
            akbu akbuVar = this.j;
            aqbr aqbrVar2 = aqbsVar.m;
            if (aqbrVar2 == null) {
                aqbrVar2 = aqbr.a;
            }
            if (aqbrVar2.b == 102716411) {
                arejVar = (arej) aqbrVar2.c;
            } else {
                arejVar = arej.a;
            }
            akbuVar.b(arejVar, view, aqbsVar, this.a);
        }
        int i3 = aqbsVar.e;
        if (i3 == 4) {
            apxfVar = (apxf) aqbsVar.f;
            i = 4;
        } else {
            i = i3;
            apxfVar = null;
        }
        this.e = apxfVar;
        this.t = i == 9 ? (apxf) aqbsVar.f : null;
        byte[] I = aqbsVar.n.I();
        this.f = I;
        if (I.length > 0 && (acraVar = this.a) != null) {
            acraVar.u(new acqx(I), null);
        }
        this.h.b((this.e == null && this.t == null) ? false : true);
        this.k.c(this, aqbsVar.e == 4 ? (apxf) aqbsVar.f : null);
        this.h.e(ajokVar);
        this.l.b(a(), this.l.a(a(), null));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqbs) obj).n.I();
    }

    @Override // defpackage.ygx
    public final void ou(arfk arfkVar) {
        yha yhaVar;
        if (this.v == null || (yhaVar = this.u) == null || !yhaVar.n(arfkVar)) {
            return;
        }
        f(arfkVar.getIsVisible().booleanValue());
    }
}
