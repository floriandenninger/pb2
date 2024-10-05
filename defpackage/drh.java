package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaDirection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class drh extends dha {

    @dnt(a = 14)
    private drg A;

    @dnt(a = 10)
    public dha a;

    @dnt(a = 3)
    public boolean b;

    @dnt(a = 3)
    public int c;

    @dnt(a = 3)
    public int d;

    @dnt(a = 13)
    public dtg e;

    @dnt(a = 3)
    public boolean f;
    Integer g;
    Integer v;
    YogaDirection w;
    Integer x;
    Integer y;

    @dnt(a = 13)
    public sqv z;

    public drh() {
        super("HorizontalScroll");
        this.c = -1;
        this.d = 1;
        this.f = true;
        this.A = new drg();
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new drj(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        dha dhaVar = this.a;
        baqlVar.a = new ajbh(this.c);
        dho c = ComponentTree.c(new dhe(dheVar.b, dheVar.c, dheVar.l, dheVar.n(), (byte[]) null, (byte[]) null, (byte[]) null), dhaVar);
        c.d = false;
        baqlVar2.a = c.a();
        drg drgVar = this.A;
        drgVar.b = (ajbh) baqlVar.a;
        drgVar.a = (ComponentTree) baqlVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void Q(dhe dheVar, dhi dhiVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        dha dhaVar = this.a;
        boolean z = this.b;
        ComponentTree componentTree = this.A.a;
        Integer num = this.y;
        Integer num2 = this.x;
        int H = (dhiVar.H() - dhiVar.E()) - dhiVar.F();
        if (num == null || num2 == null) {
            dlo dloVar = new dlo();
            componentTree.p(dhaVar, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(dhiVar.C(), 1073741824), dloVar);
            int i = dloVar.a;
            if (true != z) {
                H = 0;
            }
            int max = Math.max(i, H);
            int i2 = dloVar.b;
            baqlVar.a = Integer.valueOf(max);
            baqlVar2.a = Integer.valueOf(i2);
        } else {
            int intValue = num.intValue();
            if (true != z) {
                H = 0;
            }
            baqlVar.a = Integer.valueOf(Math.max(intValue, H));
            baqlVar2.a = num2;
        }
        baqlVar3.a = dhiVar.L();
        this.v = (Integer) baqlVar.a;
        this.g = (Integer) baqlVar2.a;
        this.w = (YogaDirection) baqlVar3.a;
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        dha dhaVar = this.a;
        ComponentTree componentTree = this.A.a;
        dlo dloVar2 = new dlo();
        componentTree.p(dhaVar, View.MeasureSpec.makeMeasureSpec(0, 0), i2, dloVar2);
        dhaVar.r(dheVar, View.MeasureSpec.makeMeasureSpec(0, 0), i2, dloVar2);
        int i3 = dloVar2.a;
        int i4 = dloVar2.b;
        baqlVar.a = Integer.valueOf(i3);
        baqlVar2.a = Integer.valueOf(i4);
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.getSize(i);
        }
        dloVar.a = i3;
        dloVar.b = i4;
        this.y = (Integer) baqlVar.a;
        this.x = (Integer) baqlVar2.a;
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        drj drjVar = (drj) obj;
        boolean z = this.f;
        sqv sqvVar = this.z;
        dtg dtgVar = this.e;
        int i = this.d;
        drg drgVar = this.A;
        ajbh ajbhVar = drgVar.b;
        ComponentTree componentTree = drgVar.a;
        int intValue = this.v.intValue();
        int intValue2 = this.g.intValue();
        YogaDirection yogaDirection = this.w;
        drjVar.setHorizontalScrollBarEnabled(z);
        drjVar.setOverScrollMode(i);
        drjVar.a.G(componentTree);
        drjVar.f = ajbhVar;
        drjVar.d = sqvVar;
        drjVar.b = intValue;
        drjVar.c = intValue2;
        if (dtgVar != null) {
            drjVar.e = new dqz();
            drjVar.e.a = dtgVar;
        }
        drjVar.getViewTreeObserver().addOnPreDrawListener(new dri(drjVar, ajbhVar, yogaDirection, null, null, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        drj drjVar = (drj) obj;
        drjVar.a.J();
        drjVar.a.G(null);
        drjVar.b = 0;
        drjVar.c = 0;
        drjVar.f = null;
        drjVar.d = null;
        dqz dqzVar = drjVar.e;
        if (dqzVar != null) {
            dqzVar.a = null;
            drjVar.e = null;
        }
        drjVar.setScrollX(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        drg drgVar = (drg) dlqVar;
        drg drgVar2 = (drg) dlqVar2;
        drgVar2.a = drgVar.a;
        drgVar2.b = drgVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean af() {
        return true;
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
        drh drhVar = (drh) dhaVar;
        if (this.k == drhVar.k) {
            return true;
        }
        dha dhaVar2 = this.a;
        if (dhaVar2 == null ? drhVar.a != null : !dhaVar2.f(drhVar.a)) {
            return false;
        }
        if (this.b != drhVar.b || this.c != drhVar.c) {
            return false;
        }
        sqv sqvVar = this.z;
        if (sqvVar == null ? drhVar.z != null : !sqvVar.equals(drhVar.z)) {
            return false;
        }
        if (this.d != drhVar.d) {
            return false;
        }
        dtg dtgVar = this.e;
        if (dtgVar == null ? drhVar.e != null : !dtgVar.equals(drhVar.e)) {
            return false;
        }
        if (this.f != drhVar.f) {
            return false;
        }
        ComponentTree componentTree = this.A.a;
        if (componentTree == null ? drhVar.A.a != null : !componentTree.equals(drhVar.A.a)) {
            return false;
        }
        ajbh ajbhVar = this.A.b;
        ajbh ajbhVar2 = drhVar.A.b;
        return ajbhVar == null ? ajbhVar2 == null : ajbhVar.equals(ajbhVar2);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        drh drhVar = (drh) super.j();
        dha dhaVar = drhVar.a;
        drhVar.a = dhaVar != null ? dhaVar.j() : null;
        drhVar.g = null;
        drhVar.v = null;
        drhVar.w = null;
        drhVar.x = null;
        drhVar.y = null;
        drhVar.A = new drg();
        return drhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        drh drhVar = (drh) dhaVar;
        this.g = drhVar.g;
        this.v = drhVar.v;
        this.w = drhVar.w;
        this.x = drhVar.x;
        this.y = drhVar.y;
    }
}
