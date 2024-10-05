package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.widget.LithoScrollView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dug extends dha {

    @dnt(a = 14)
    private duf A;

    @dnt(a = 10)
    public dha a;

    @dnt(a = 3)
    public boolean b;

    @dnt(a = 3)
    public boolean c;

    @dnt(a = 3)
    public boolean d;

    @dnt(a = 3)
    public int e;

    @dnt(a = 3)
    public boolean f;

    @dnt(a = 13)
    public ln g;

    @dnt(a = 3)
    public int v;

    @dnt(a = 13)
    public dtg w;

    @dnt(a = 3)
    public boolean x;
    Integer y;
    Integer z;

    public dug() {
        super("VerticalScroll");
        this.v = 1;
        this.x = true;
        this.A = new duf();
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return (LithoScrollView) LayoutInflater.from(context).inflate(R.layout.litho_scroll_view, (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        dha dhaVar = this.a;
        int i = this.e;
        boolean z = this.d;
        ajbh ajbhVar = new ajbh((short[]) null, (byte[]) null);
        ajbhVar.i = i;
        baqlVar.a = ajbhVar;
        dho c = ComponentTree.c(new dhe(dheVar.b, dheVar.c, dheVar.l, dheVar.n(), (byte[]) null, (byte[]) null, (byte[]) null), dhaVar);
        c.d = z;
        baqlVar2.a = c.a();
        duf dufVar = this.A;
        dufVar.b = (ajbh) baqlVar.a;
        dufVar.a = (ComponentTree) baqlVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void Q(dhe dheVar, dhi dhiVar) {
        boolean z;
        dha dhaVar = this.a;
        boolean z2 = this.c;
        boolean z3 = this.b;
        ComponentTree componentTree = this.A.a;
        Integer num = this.z;
        Integer num2 = this.y;
        int H = (dhiVar.H() - dhiVar.E()) - dhiVar.F();
        int C = (dhiVar.C() - dhiVar.G()) - dhiVar.D();
        if (num == null || num.intValue() != H) {
            z = z2;
        } else {
            if (!z2) {
                return;
            }
            if (num2 != null && num2.intValue() == C) {
                return;
            } else {
                z = true;
            }
        }
        esv.U(dheVar, View.MeasureSpec.makeMeasureSpec(dhiVar.H(), 1073741824), View.MeasureSpec.makeMeasureSpec(dhiVar.C(), 1073741824), new dlo(), componentTree, dhaVar, z, z3);
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        esv.U(dheVar, i, i2, dloVar, this.A.a, this.a, this.c, this.b);
        baqlVar.a = Integer.valueOf(dloVar.a);
        baqlVar2.a = Integer.valueOf(dloVar.b);
        this.z = (Integer) baqlVar.a;
        this.y = (Integer) baqlVar2.a;
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        boolean z = this.x;
        boolean z2 = this.f;
        boolean z3 = this.d;
        ln lnVar = this.g;
        dtg dtgVar = this.w;
        int i = this.v;
        duf dufVar = this.A;
        ComponentTree componentTree = dufVar.a;
        ajbh ajbhVar = dufVar.b;
        lithoScrollView.d.G(componentTree);
        lithoScrollView.f = z3;
        lithoScrollView.h = ajbhVar;
        dro droVar = new dro(lithoScrollView, ajbhVar, null, null);
        lithoScrollView.getViewTreeObserver().addOnPreDrawListener(droVar);
        lithoScrollView.e = droVar;
        if (dtgVar != null) {
            lithoScrollView.g = new dqz();
            lithoScrollView.g.a = dtgVar;
        }
        lithoScrollView.setScrollbarFadingEnabled(true);
        lithoScrollView.setNestedScrollingEnabled(z2);
        lithoScrollView.setVerticalFadingEdgeEnabled(false);
        lithoScrollView.setFadingEdgeLength(0);
        lithoScrollView.setVerticalScrollBarEnabled(z);
        lithoScrollView.c = lnVar;
        lithoScrollView.setOverScrollMode(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        lithoScrollView.c = null;
        lithoScrollView.d.J();
        lithoScrollView.d.G(null);
        lithoScrollView.h = null;
        lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.e);
        lithoScrollView.e = null;
        dqz dqzVar = lithoScrollView.g;
        if (dqzVar != null) {
            dqzVar.a = null;
            lithoScrollView.g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        duf dufVar = (duf) dlqVar;
        duf dufVar2 = (duf) dlqVar2;
        dufVar2.a = dufVar.a;
        dufVar2.b = dufVar.b;
    }

    @Override // defpackage.dhk
    public final boolean Y() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ab() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        dug dugVar = (dug) dhaVar;
        dug dugVar2 = (dug) dhaVar2;
        dim dimVar = new dim(dugVar.a, dugVar2 == null ? null : dugVar2.a);
        dim dimVar2 = new dim(Boolean.valueOf(dugVar.x), dugVar2 == null ? null : Boolean.valueOf(dugVar2.x));
        dim dimVar3 = new dim(true, dugVar2 == null ? null : true);
        dim dimVar4 = new dim(Boolean.valueOf(dugVar.c), dugVar2 == null ? null : Boolean.valueOf(dugVar2.c));
        dim dimVar5 = new dim(Boolean.valueOf(dugVar.f), dugVar2 == null ? null : Boolean.valueOf(dugVar2.f));
        dim dimVar6 = new dim(Boolean.valueOf(dugVar.d), dugVar2 != null ? Boolean.valueOf(dugVar2.d) : null);
        return (((dha) dimVar.a).f((dha) dimVar.b) && ((Boolean) dimVar2.a).equals(dimVar2.b) && ((Boolean) dimVar3.a).equals(dimVar3.b) && ((Boolean) dimVar4.a).equals(dimVar4.b) && ((Boolean) dimVar5.a).equals(dimVar5.b) && ((Boolean) dimVar6.a).equals(dimVar6.b)) ? false : true;
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        dug dugVar = (dug) dhaVar;
        if (this.k == dugVar.k) {
            return true;
        }
        dha dhaVar2 = this.a;
        if (dhaVar2 == null ? dugVar.a != null : !dhaVar2.f(dugVar.a)) {
            return false;
        }
        if (this.b != dugVar.b || this.c != dugVar.c || this.d != dugVar.d || this.e != dugVar.e || this.f != dugVar.f) {
            return false;
        }
        ln lnVar = this.g;
        if (lnVar == null ? dugVar.g != null : !lnVar.equals(dugVar.g)) {
            return false;
        }
        if (this.v != dugVar.v) {
            return false;
        }
        dtg dtgVar = this.w;
        if (dtgVar == null ? dugVar.w != null : !dtgVar.equals(dugVar.w)) {
            return false;
        }
        if (this.x != dugVar.x) {
            return false;
        }
        ComponentTree componentTree = this.A.a;
        if (componentTree == null ? dugVar.A.a != null : !componentTree.equals(dugVar.A.a)) {
            return false;
        }
        ajbh ajbhVar = this.A.b;
        ajbh ajbhVar2 = dugVar.A.b;
        return ajbhVar == null ? ajbhVar2 == null : ajbhVar.equals(ajbhVar2);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        dug dugVar = (dug) super.j();
        dha dhaVar = dugVar.a;
        dugVar.a = dhaVar != null ? dhaVar.j() : null;
        dugVar.y = null;
        dugVar.z = null;
        dugVar.A = new duf();
        return dugVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        dug dugVar = (dug) dhaVar;
        this.y = dugVar.y;
        this.z = dugVar.z;
    }
}
