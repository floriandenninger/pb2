package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ntb extends nop implements nqe, abpe, abhs, abgh, flm, fyw, fgk, fgp {
    private abid A;
    private nrx B;
    private ViewGroup C;
    private boolean D;
    private boolean E;
    private boolean F;
    public final fln d;
    public final fgm e;
    public final aaea f;
    public final azrh g;
    public ayqx h;
    public CharSequence i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ayqx m;
    private final ypa n;
    private final Context o;
    private final abie p;
    private final abht q;
    private final abic r;
    private final azrw s;
    private final fgq t;
    private final fyx u;
    private final akcy v;
    private final nsm w;
    private String x;
    private asra y;
    private CharSequence z;

    public ntb(ypa ypaVar, Context context, abie abieVar, abht abhtVar, abic abicVar, azrw azrwVar, fln flnVar, fgm fgmVar, fgq fgqVar, fyx fyxVar, aaea aaeaVar, akcy akcyVar, c cVar, byte[] bArr, byte[] bArr2) {
        super(abhtVar.p, aaeaVar);
        this.D = false;
        this.l = false;
        this.n = ypaVar;
        this.o = context;
        this.p = abieVar;
        this.q = abhtVar;
        this.r = abicVar;
        this.s = azrwVar;
        this.d = flnVar;
        this.e = fgmVar;
        this.t = fgqVar;
        this.u = fyxVar;
        this.f = aaeaVar;
        this.v = akcyVar;
        this.w = cVar.b(abhtVar.p);
        this.g = azrh.e();
    }

    private final void G(boolean z) {
        aone createBuilder = ToggleConversationActionOuterClass$ToggleConversationAction.a.createBuilder();
        createBuilder.copyOnWrite();
        ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction = (ToggleConversationActionOuterClass$ToggleConversationAction) createBuilder.instance;
        toggleConversationActionOuterClass$ToggleConversationAction.b |= 2;
        toggleConversationActionOuterClass$ToggleConversationAction.c = z;
        this.n.d(abix.a(ammv.j("tag"), (ToggleConversationActionOuterClass$ToggleConversationAction) createBuilder.build()));
    }

    private final void H(fhf fhfVar) {
        if (fhfVar == null) {
            this.x = null;
            return;
        }
        if (TextUtils.equals(this.x, fhfVar.c())) {
            return;
        }
        String c = fhfVar.c();
        this.g.c(c);
        this.x = c;
        if (I()) {
            this.u.b(c, this);
        }
    }

    private final boolean I() {
        aspg aspgVar = this.f.a().d;
        if (aspgVar == null) {
            aspgVar = aspg.a;
        }
        return aspgVar.c;
    }

    @Override // defpackage.nqg
    public final void B() {
        this.q.q();
        this.d.b(this);
        Object obj = this.m;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        Object obj2 = this.h;
        if (obj2 != null) {
            ayrz.c((AtomicReference) obj2);
        }
        this.w.c();
    }

    @Override // defpackage.nqg
    public final void C() {
        this.w.d();
        this.E = true;
    }

    @Override // defpackage.nqg
    public final void D(apxf apxfVar) {
        this.w.e(apxfVar);
        this.e.d(this);
        this.t.i(this);
        aspg aspgVar = this.f.a().d;
        if (aspgVar == null) {
            aspgVar = aspg.a;
        }
        if (aspgVar.f) {
            p();
        }
        this.E = false;
        this.v.f();
        i();
        this.q.p.u(new acqx(this.y.j), null);
    }

    @Override // defpackage.nqe
    public final void E(ajce ajceVar) {
        this.q.m(ajceVar);
    }

    @Override // defpackage.nqg
    public final void F(nqd nqdVar) {
    }

    @Override // defpackage.nqg
    public final nqb b() {
        nrx nrxVar = this.B;
        if (nrxVar != null) {
            return nrxVar;
        }
        nrx nrxVar2 = (nrx) this.s.get();
        this.B = nrxVar2;
        nrxVar2.h(this);
        nrx nrxVar3 = this.B;
        nrxVar3.h = this.a;
        return nrxVar3;
    }

    @Override // defpackage.fyw
    public final void d(String str, awaj awajVar) {
        if (!TextUtils.equals(this.x, str) || (awajVar.b & 4) == 0) {
            return;
        }
        aqyg aqygVar = awajVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        this.i = ajcq.b(aqygVar);
        f();
    }

    @Override // defpackage.abgh
    public final void e() {
        throw null;
    }

    public final void f() {
        if (!TextUtils.isEmpty(this.z) || !TextUtils.isEmpty(this.i)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(this.z)) {
                spannableStringBuilder.append(this.z);
                if (!TextUtils.isEmpty(this.i)) {
                    spannableStringBuilder.append((char) 160);
                    spannableStringBuilder.append((char) 160);
                }
            }
            if (!TextUtils.isEmpty(this.i)) {
                Drawable drawable = this.o.getResources().getDrawable(R.drawable.artboard);
                int dimensionPixelSize = this.o.getResources().getDimensionPixelSize(R.dimen.engagement_panel_header_icon_size);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.setTint(wbs.W(this.o, R.attr.ytIcon1).orElse(0));
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append(' ');
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append(this.i);
            }
            b().j(spannableStringBuilder);
            return;
        }
        b().j(null);
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        H(fhfVar);
    }

    @Override // defpackage.abpe
    public final void h(asqy asqyVar) {
        if (asqyVar == null || asqyVar.b != 130028801) {
            return;
        }
        aspe aspeVar = (aspe) asqyVar.c;
        nqb b = b();
        if (b == null) {
            return;
        }
        Spanned b2 = ajcq.b(aspeVar.b == 1 ? (aqyg) aspeVar.c : null);
        if (!TextUtils.isEmpty(b2)) {
            this.z = b2;
            f();
            b.g(null);
        } else if (aspeVar.b == 5) {
            auwh auwhVar = (auwh) ((aulq) aspeVar.c).pX(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
            if (auwhVar.c.size() != 0) {
                Iterator it = auwhVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    auwg auwgVar = (auwg) it.next();
                    if (auwgVar.g) {
                        this.z = auwgVar.e;
                        f();
                        break;
                    }
                }
            }
            b.g(auwhVar);
        }
    }

    public final void i() {
        nqb b = b();
        if (b == null || this.E) {
            return;
        }
        boolean z = false;
        if (!this.j && !this.k) {
            z = true;
        }
        b.f(z);
    }

    @Override // defpackage.flm
    public final void kG() {
        if (this.C == null) {
            return;
        }
        this.r.c();
    }

    @Override // defpackage.flm
    public final void kH() {
        if (this.C == null || !this.D) {
            return;
        }
        this.r.e(this.y);
    }

    @Override // defpackage.nqg
    public final void n() {
        this.D = false;
        this.r.c();
        G(false);
        this.e.h(this);
        this.t.j(this);
        this.q.p.q(new acqx(this.y.j), null);
    }

    @Override // defpackage.nqg
    public final void o(apxf apxfVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.o).inflate(R.layout.live_chat_content, (ViewGroup) null, false);
        this.C = viewGroup;
        abie abieVar = this.p;
        acra acraVar = this.a;
        agcd agcdVar = (agcd) abieVar.b.get();
        ajoy ajoyVar = (ajoy) abieVar.c.get();
        aeqh aeqhVar = (aeqh) abieVar.d.get();
        aeqhVar.getClass();
        agcd agcdVar2 = (agcd) abieVar.e.get();
        aiqn aiqnVar = (aiqn) abieVar.f.get();
        aiqnVar.getClass();
        viewGroup.getClass();
        acraVar.getClass();
        abid abidVar = new abid(agcdVar, ajoyVar, aeqhVar, agcdVar2, aiqnVar, viewGroup, acraVar, null, null, null, null);
        this.A = abidVar;
        abic abicVar = this.r;
        if (abicVar.e != abidVar) {
            abicVar.e = abidVar;
            ViewGroup viewGroup2 = abicVar.e.a;
            abicVar.f = new abpb(viewGroup2.getContext());
            abicVar.f.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            abpb abpbVar = abicVar.f;
            abpbVar.a = abicVar;
            viewGroup2.addView(abpbVar);
            abicVar.a();
        }
        this.A.b().y();
        this.q.x(this);
        abht abhtVar = this.q;
        abhtVar.i = this;
        abhtVar.k.c = this;
        this.w.b();
    }

    @Override // defpackage.nqg
    public final View oO() {
        return this.C;
    }

    @Override // defpackage.nqg
    public final void oP(ajol ajolVar) {
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (!this.l) {
            nqb b = b();
            boolean z = !fhgVar.b();
            nrx nrxVar = (nrx) b;
            ImageView imageView = nrxVar.c;
            if (imageView != null && nrxVar.e != null) {
                whu.I(imageView, z);
            }
        }
        aspg aspgVar = this.f.a().d;
        if (aspgVar == null) {
            aspgVar = aspg.a;
        }
        if (!aspgVar.i && this.y != null && !this.E) {
            if (!this.F && fhgVar.b()) {
                this.q.p.q(new acqx(this.y.j), null);
            }
            if (this.F && !fhgVar.b()) {
                this.q.p.u(new acqx(this.y.j), null);
            }
        }
        this.F = fhgVar.b();
        if (fhgVar.h()) {
            return;
        }
        this.r.c();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void p() {
        this.D = true;
        this.r.e(this.y);
        G(true);
        oQ(this.t.g());
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void q(aqts aqtsVar, asht ashtVar) {
        jbp bV;
        Spanned spanned;
        aqyg aqygVar;
        aqyg aqygVar2;
        super.q(aqtsVar, ashtVar);
        if (aqtsVar == null || (bV = evr.bV(aqtsVar)) == null) {
            return;
        }
        this.w.g(this.b, this.c);
        H(this.e.a());
        this.y = bV.b;
        nqb b = b();
        if (b == null) {
            return;
        }
        aqtu aqtuVar = bV.a;
        if (aqtuVar == null || (aqtuVar.b & 1) == 0) {
            b.k(this.o.getString(R.string.live_chat_header_title));
        } else {
            aqyg aqygVar3 = aqtuVar.c;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            b.k(ajcq.b(aqygVar3));
        }
        auwh auwhVar = null;
        if (aqtuVar != null) {
            if ((aqtuVar.b & 16) != 0) {
                aqygVar2 = aqtuVar.g;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            spanned = ajcq.b(aqygVar2);
        } else {
            spanned = null;
        }
        this.z = spanned;
        if (aqtuVar != null && I()) {
            if ((aqtuVar.b & 4) != 0) {
                aqygVar = aqtuVar.e;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            this.i = ajcq.b(aqygVar);
        }
        f();
        if (aqtuVar != null && (aqtuVar.b & 8) != 0) {
            aqtv aqtvVar = aqtuVar.f;
            if (aqtvVar == null) {
                aqtvVar = aqtv.a;
            }
            if (aqtvVar.b == 76818770) {
                auwhVar = (auwh) aqtvVar.c;
            } else {
                auwhVar = auwh.a;
            }
        }
        b.g(auwhVar);
        ((nrx) b).o(bV.a);
    }

    @Override // defpackage.nop, defpackage.nqg
    public final boolean u() {
        return true;
    }
}
