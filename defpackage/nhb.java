package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhb extends nck {
    public Handler l;
    public final ypa m;
    protected final ngy n;
    protected final View o;
    protected final View.OnClickListener p;
    protected final ngx q;
    protected final nha r;
    protected final ftw s;
    public ngz t;
    private final Map u;
    private final Map v;
    private final xbu w;
    private final xbw x;
    private apln y;

    public nhb(Context context, aahd aahdVar, wzq wzqVar, wyz wyzVar, tdv tdvVar, euv euvVar, ypa ypaVar, View view, View view2, View view3, View view4, View view5, View view6, View view7, View.OnClickListener onClickListener, ngx ngxVar, nha nhaVar, ngy ngyVar) {
        this(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, ypaVar, view, view2, view3, view4, view5, view6, view7, null, onClickListener, ngxVar, nhaVar, ngyVar, false);
    }

    private static int M(aplm aplmVar, int i, float f) {
        if (aplmVar == null) {
            return 0;
        }
        if (i <= 0) {
            i = 1000;
        }
        return (int) ((aplmVar.c * i) + (aplmVar.b * f));
    }

    private final Object N(augq augqVar) {
        if (augqVar == augq.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN) {
            return this.n.g();
        }
        return this.n.d(A(augqVar));
    }

    private final boolean O(List list) {
        ftw ftwVar = this.s;
        return ftwVar != null && list.contains(ftwVar.a);
    }

    private static final boolean P(aplm aplmVar) {
        return aplmVar == null || (aplmVar.b == 0 && aplmVar.c == 0.0f);
    }

    protected final Object A(augq augqVar) {
        return this.v.get(augqVar);
    }

    public final void B(View view, augq augqVar) {
        C(view, augqVar, false);
    }

    public final void C(View view, augq augqVar, boolean z) {
        view.getClass();
        this.u.put(view, augqVar);
        this.e.b(view, z);
    }

    protected final void D(Object obj, boolean z) {
        ngw w = w(obj, z);
        if (w.a) {
            w.c.run();
        } else {
            afsi.b(2, 1, "Sparkles ad attempted default click behavior, but failed.");
        }
        ngx ngxVar = this.q;
        if (ngxVar != null) {
            ngxVar.a(w.b);
        }
    }

    public final void E(acra acraVar, Object obj, String str, augh aughVar, Object[] objArr, aoxy aoxyVar, byte[] bArr) {
        aony aonyVar = aughVar.k;
        apln aplnVar = aughVar.o;
        if (aplnVar == null) {
            aplnVar = apln.a;
        }
        I(acraVar, obj, str, aonyVar, objArr, aplnVar, aughVar.n, aoxyVar, bArr);
    }

    public final void F(acra acraVar, Object obj, String str, augy augyVar, Object[] objArr, aoxy aoxyVar, byte[] bArr) {
        aony aonyVar = augyVar.o;
        apln aplnVar = augyVar.r;
        if (aplnVar == null) {
            aplnVar = apln.a;
        }
        I(acraVar, obj, str, aonyVar, objArr, aplnVar, augyVar.q, aoxyVar, bArr);
    }

    public final void G(acra acraVar, Object obj, String str, augz augzVar, Object[] objArr, aoxy aoxyVar, byte[] bArr) {
        aony aonyVar = augzVar.r;
        apln aplnVar = augzVar.u;
        if (aplnVar == null) {
            aplnVar = apln.a;
        }
        I(acraVar, obj, str, aonyVar, objArr, aplnVar, augzVar.t, aoxyVar, bArr);
    }

    public final void H(acra acraVar, Object obj, String str, auhm auhmVar, Object[] objArr, aoxy aoxyVar, byte[] bArr) {
        aony aonyVar = auhmVar.m;
        apln aplnVar = auhmVar.p;
        if (aplnVar == null) {
            aplnVar = apln.a;
        }
        I(acraVar, obj, str, aonyVar, objArr, aplnVar, auhmVar.o, aoxyVar, bArr);
    }

    public final void I(acra acraVar, Object obj, String str, List list, Object[] objArr, apln aplnVar, long j, aoxy aoxyVar, byte[] bArr) {
        this.t = null;
        this.w.c();
        this.x.c();
        this.y = aplnVar;
        this.v.clear();
        this.n.h(this.v, objArr);
        super.p(acraVar, obj, str, list, j, aoxyVar, bArr);
    }

    protected final void J(View view, MotionEvent motionEvent, boolean z, View view2) {
        Integer num;
        if (z) {
            num = y(augq.PROMOTED_SPARKLES_CLICK_LOCATION_BORDER);
        } else if (view2 == null || x(view2) == null) {
            afsi.b(2, 1, "Sparkles ad received click, but did not have a mappable 'lastTouchedView'.");
            num = null;
        } else {
            num = y(x(view2));
        }
        if (num != null) {
            this.w.d(num.intValue());
        } else {
            this.w.c();
        }
        float f = view.getResources().getDisplayMetrics().density;
        this.x.d((int) (motionEvent.getX() / f), (int) (motionEvent.getY() / f));
    }

    public final void K(boolean z) {
        i().c = z;
    }

    public final boolean L() {
        return i().c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nbp
    public final afxe[] f() {
        return (afxe[]) yjj.y(super.f(), this.w, this.x);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nck
    public final void k(View view, View view2) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.y != null) {
            float f = this.f.getResources().getDisplayMetrics().density;
            aplm aplmVar = this.y.b;
            if (aplmVar == null) {
                aplmVar = aplm.a;
            }
            i4 = M(aplmVar, view2.getMeasuredWidth(), f);
            aplm aplmVar2 = this.y.c;
            if (aplmVar2 == null) {
                aplmVar2 = aplm.a;
            }
            i2 = M(aplmVar2, view2.getMeasuredWidth(), f);
            aplm aplmVar3 = this.y.d;
            if (aplmVar3 == null) {
                aplmVar3 = aplm.a;
            }
            i3 = M(aplmVar3, view2.getMeasuredHeight(), f);
            aplm aplmVar4 = this.y.e;
            if (aplmVar4 == null) {
                aplmVar4 = aplm.a;
            }
            i = M(aplmVar4, view2.getMeasuredHeight(), f);
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = ((view2.getMeasuredWidth() - i4) - i2) - 1;
        marginLayoutParams.height = ((view2.getMeasuredHeight() - i3) - i) - 1;
        marginLayoutParams.leftMargin = i4;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.bottomMargin = i;
        view.requestLayout();
    }

    @Override // defpackage.nck
    public final void l(View view, MotionEvent motionEvent, List list, boolean z) {
        augq x;
        View view2 = !list.isEmpty() ? (View) list.get(0) : null;
        if (z) {
            x = augq.PROMOTED_SPARKLES_CLICK_LOCATION_TALKBACK_ACTIVATED;
            if (view2 != null && x(view2) != null && x(view2) == augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL) {
                x = augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL_TALKBACK_ACTIVATED;
            }
            Integer y = y(x);
            if (y != null) {
                this.w.d(y.intValue());
            } else {
                this.w.c();
            }
            double d = view.getResources().getDisplayMetrics().density;
            xbw xbwVar = this.x;
            double width = view.getWidth();
            Double.isNaN(width);
            Double.isNaN(d);
            double height = view.getHeight();
            Double.isNaN(height);
            Double.isNaN(d);
            xbwVar.d((int) ((width / 2.0d) / d), (int) ((height / 2.0d) / d));
        } else {
            J(view, motionEvent, false, view2);
            x = x(view2);
        }
        if (x != null) {
            D(N(x), true);
        } else {
            this.n.i();
        }
    }

    @Override // defpackage.nck
    public final void m(View view, MotionEvent motionEvent, List list) {
        J(view, motionEvent, true, !list.isEmpty() ? (View) list.get(0) : null);
        D(z(), false);
    }

    @Override // defpackage.nck
    public final void n(List list) {
        augq x;
        if (this.r == null || (x = x((View) amkq.bi(list, null))) == null) {
            return;
        }
        this.r.a(w(N(x), true).b, false);
    }

    @Override // defpackage.nck
    public final void o() {
        if (this.r == null) {
            return;
        }
        this.r.a(w(z(), false).b, false);
    }

    @Override // defpackage.nck
    protected final boolean s() {
        apln aplnVar = this.y;
        if (aplnVar == null) {
            return true;
        }
        aplm aplmVar = aplnVar.b;
        if (aplmVar == null) {
            aplmVar = aplm.a;
        }
        if (!P(aplmVar)) {
            return false;
        }
        aplm aplmVar2 = this.y.c;
        if (aplmVar2 == null) {
            aplmVar2 = aplm.a;
        }
        if (!P(aplmVar2)) {
            return false;
        }
        aplm aplmVar3 = this.y.d;
        if (aplmVar3 == null) {
            aplmVar3 = aplm.a;
        }
        if (!P(aplmVar3)) {
            return false;
        }
        aplm aplmVar4 = this.y.e;
        if (aplmVar4 == null) {
            aplmVar4 = aplm.a;
        }
        return P(aplmVar4);
    }

    @Override // defpackage.nck
    public final boolean u(View view, List list) {
        if (list.contains(this.o)) {
            this.p.onClick(this.o);
            return true;
        }
        if (O(list)) {
            ftw ftwVar = this.s;
            ftwVar.onClick(ftwVar.a);
            ngx ngxVar = this.q;
            if (ngxVar != null) {
                ngxVar.a(false);
            }
            return true;
        }
        return super.u(view, list);
    }

    @Override // defpackage.nck
    public final boolean v(List list) {
        if (r(list)) {
            this.r.a(true, true);
            return true;
        }
        if (!O(list)) {
            return false;
        }
        this.r.a(false, true);
        return true;
    }

    protected final ngw w(Object obj, boolean z) {
        Object e;
        ngw b = this.n.b(obj);
        if (b.a) {
            return b;
        }
        if (z) {
            e = this.n.f();
        } else {
            e = this.n.e();
        }
        return this.n.b(e);
    }

    protected final augq x(View view) {
        return (augq) this.u.get(view);
    }

    protected final Integer y(augq augqVar) {
        if (augqVar == null || augqVar == augq.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN) {
            return null;
        }
        return this.n.c(A(augqVar));
    }

    protected final Object z() {
        return N(augq.PROMOTED_SPARKLES_CLICK_LOCATION_BORDER);
    }

    public nhb(Context context, aahd aahdVar, wzq wzqVar, wyz wyzVar, tdv tdvVar, euv euvVar, ypa ypaVar, View view, View view2, View view3, View view4, View view5, View view6, View view7, View.OnClickListener onClickListener, ngx ngxVar, nha nhaVar, ngy ngyVar, boolean z) {
        this(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, ypaVar, view, view2, view3, view4, view5, view6, view7, null, onClickListener, ngxVar, nhaVar, ngyVar, z);
    }

    public nhb(Context context, aahd aahdVar, wzq wzqVar, wyz wyzVar, tdv tdvVar, euv euvVar, ypa ypaVar, View view, View view2, View view3, View view4, View view5, View view6, View view7, ftw ftwVar, View.OnClickListener onClickListener, ngx ngxVar, nha nhaVar, ngy ngyVar, boolean z) {
        super(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, view, view2, view3, view4, view6, view7, z);
        this.l = new Handler(context.getMainLooper());
        this.m = ypaVar;
        this.o = view5;
        this.p = onClickListener;
        this.q = ngxVar;
        this.r = nhaVar;
        this.n = ngyVar;
        this.s = ftwVar;
        ngyVar.j(this);
        this.u = new HashMap();
        this.v = new HashMap();
        this.w = new xbu();
        this.x = new xbw(view);
        this.e.b(view5, true);
        if (ftwVar != null) {
            this.e.b(ftwVar.a, true);
        }
    }
}
