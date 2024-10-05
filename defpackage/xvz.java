package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xvz implements ajom, xpd {
    private final xvy a;
    private final ypa b;
    private final View c;
    private final LinearLayout d;
    private final yap e;
    private xpa f;
    private apzx g;
    private ajok h;
    private final ImageView i;
    private View j;
    private View k;
    private final aadw l;
    private final yaq m;
    private final yaq n;

    /* JADX WARN: Type inference failed for: r3v1, types: [ajos, java.lang.Object] */
    public xvz(Context context, ypa ypaVar, ajjz ajjzVar, ajvb ajvbVar, yaq yaqVar, yaq yaqVar2, yap yapVar, aadw aadwVar, byte[] bArr, byte[] bArr2) {
        context.getClass();
        ypaVar.getClass();
        this.b = ypaVar;
        ajjzVar.getClass();
        this.a = new xvy(context, ajvbVar.get());
        yaqVar.getClass();
        this.n = yaqVar;
        yaqVar2.getClass();
        this.m = yaqVar2;
        yapVar.getClass();
        this.e = yapVar;
        this.l = aadwVar;
        View inflate = View.inflate(context, R.layout.comment_thread, null);
        this.c = inflate;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.d = (LinearLayout) inflate.findViewById(R.id.comment_thread);
        this.i = (ImageView) inflate.findViewById(R.id.comment_divider);
    }

    private final void d(ajok ajokVar) {
        xvy xvyVar = this.a;
        xpa xpaVar = this.f;
        ajok d = xvyVar.d(ajokVar);
        d.f("commentThreadMutator", xpaVar);
        apzp apzpVar = ((xqc) xpaVar).b.f;
        if (apzpVar == null) {
            apzpVar = apzp.a;
        }
        apzn apznVar = apzpVar.c;
        if (apznVar == null) {
            apznVar = apzn.a;
        }
        View c = xvyVar.c(d, apznVar);
        this.k = ((ViewGroup) c).getChildAt(0);
        this.d.addView(c);
    }

    private final void e() {
        Iterator it = this.n.b.entrySet().iterator();
        while (it.hasNext()) {
            Set set = (Set) ((Map.Entry) it.next()).getValue();
            if (set != null) {
                set.remove(this);
                if (set.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    private final void f(ajok ajokVar) {
        apyv apyvVar;
        View view = this.j;
        int indexOfChild = view != null ? this.d.indexOfChild(view) : -1;
        if (indexOfChild >= 0) {
            this.d.removeViewAt(indexOfChild);
        }
        xvy xvyVar = this.a;
        xpa xpaVar = this.f;
        apyx apyxVar = ((xqc) xpaVar).b.c;
        if (apyxVar == null) {
            apyxVar = apyx.a;
        }
        if (apyxVar.b == 62285947) {
            apyx apyxVar2 = ((xqc) this.f).b.c;
            if (apyxVar2 == null) {
                apyxVar2 = apyx.a;
            }
            if (apyxVar2.b == 62285947) {
                apyvVar = (apyv) apyxVar2.c;
            } else {
                apyvVar = apyv.a;
            }
        } else {
            apyvVar = null;
        }
        ajok d = xvyVar.d(ajokVar);
        d.f("commentThreadMutator", xpaVar);
        View c = xvyVar.c(d, apyvVar);
        this.j = c;
        this.d.addView(c, indexOfChild);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        apzx apzxVar = this.g;
        if (apzxVar != null && apzxVar.l) {
            this.h.a.q(new acqx(apzxVar.h), null);
        }
        apxs apxsVar = this.l.b().z;
        if (apxsVar == null) {
            apxsVar = apxs.a;
        }
        if (apxsVar.b) {
            e();
        } else {
            this.n.e(this.g, this);
        }
        this.a.e(this.d);
        this.d.removeAllViews();
        this.j = null;
        this.k = null;
        this.h = null;
    }

    @Override // defpackage.xpd
    public final void k(apyv apyvVar) {
        View view = this.k;
        if (view != null) {
            ((xvw) ahbw.q(view)).g(apyvVar);
        } else {
            d(this.h);
        }
    }

    @Override // defpackage.xpd
    public final void l(apyv apyvVar) {
        View view = this.k;
        if (view != null) {
            xvw xvwVar = (xvw) ahbw.q(view);
            int f = xvwVar.f(apyvVar);
            if (f >= 0) {
                xvwVar.c.removeViewAt(f);
            }
            xvwVar.h();
        }
    }

    @Override // defpackage.xpd
    public final void m() {
        this.b.d(aacl.b(((xqc) this.f).b));
    }

    @Override // defpackage.xpd
    public final void n(apyv apyvVar, apyv apyvVar2) {
        f(this.h);
    }

    @Override // defpackage.xpd
    public final void o(apyv apyvVar, apyv apyvVar2) {
        xvw xvwVar;
        int f;
        View view = this.k;
        if (view == null || (f = (xvwVar = (xvw) ahbw.q(view)).f(apyvVar)) < 0) {
            return;
        }
        xvwVar.c.removeViewAt(f);
        xvwVar.c.addView(xvwVar.b.b(xvwVar.d, apyvVar2, f), f);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apzx apzxVar = (apzx) obj;
        apzxVar.getClass();
        this.g = apzxVar;
        ajokVar.getClass();
        this.h = ajokVar;
        apxs apxsVar = this.l.b().z;
        if (apxsVar == null) {
            apxsVar = apxs.a;
        }
        if (apxsVar.b) {
            e();
        }
        apyx apyxVar = apzxVar.c;
        if (apyxVar == null) {
            apyxVar = apyx.a;
        }
        if (apyxVar.b != 62285947) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        if (apzxVar.j) {
            this.i.setVisibility(8);
        }
        if (!apzxVar.l) {
            ajokVar.a.H(apzxVar, apzxVar.h, this.c);
        } else {
            ajokVar.a.u(new acqx(apzxVar.h), null);
        }
        this.f = new xqc(this.n, (ajvc) ajokVar.c("sectionController"), apzxVar, this.m, this.e, this.l, null, null);
        if (!apzxVar.j) {
            this.i.setVisibility(0);
        }
        ajokVar.f("com.google.android.libraries.youtube.comment.comment_thread_has_replies_key", Boolean.valueOf((apzxVar.b & 32) != 0));
        f(ajokVar);
        apzp apzpVar = apzxVar.f;
        if (apzpVar == null) {
            apzpVar = apzp.a;
        }
        if ((apzpVar.b & 1) != 0) {
            d(ajokVar);
        }
        this.n.d(apzxVar, this);
    }
}
