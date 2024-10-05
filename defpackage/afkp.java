package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afkp extends afla implements afky {
    public static final aflb a = aflb.SURFACE;
    public afky b;
    private final List c;
    private boolean d;
    private boolean e;
    private afkx f;
    private aflb g;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private int m;
    private final ahge n;

    public afkp(Context context, ahge ahgeVar) {
        super(context);
        this.c = new ArrayList();
        afki.a(ahgeVar);
        this.n = ahgeVar;
        this.g = a;
    }

    @Override // defpackage.afky
    public final Surface A() {
        if (G()) {
            return this.b.A();
        }
        return null;
    }

    @Override // defpackage.afky
    public final SurfaceHolder B() {
        if (G()) {
            return this.b.B();
        }
        return null;
    }

    @Override // defpackage.afky
    public final aflb C() {
        afky afkyVar = this.b;
        return afkyVar != null ? afkyVar.C() : aflb.UNKNOWN;
    }

    @Override // defpackage.afkl
    public final void D() {
        if (G()) {
            this.b.D();
            this.b = null;
        }
    }

    @Override // defpackage.afkl
    public final boolean E() {
        return G() && this.b.E();
    }

    final afky F(aflb aflbVar) {
        aflb aflbVar2 = aflb.UNKNOWN;
        int ordinal = aflbVar.ordinal();
        if (ordinal == 0 || ordinal == 3) {
            return new afkv(getContext());
        }
        if (ordinal == 4) {
            return new afkw(getContext());
        }
        if (ordinal == 5) {
            return new afkt(getContext());
        }
        if (ordinal == 6 || ordinal == 7) {
            ahge ahgeVar = this.n;
            Context context = getContext();
            boolean z = this.i;
            boolean z2 = this.j;
            if (aflbVar == aflb.GL_GVR) {
                return new ahhk(context, ahgeVar.a, z, z2);
            }
            if (aflbVar == aflb.GL_VPX) {
                return new ahka(context);
            }
            return null;
        }
        throw new UnsupportedOperationException("Requested view is not supported.");
    }

    public final boolean G() {
        return this.b != null;
    }

    @Override // defpackage.afkl
    public final int c() {
        afki.e(G(), "MediaView method called before surface created");
        return this.b.c();
    }

    @Override // defpackage.afkl
    public final int e() {
        afki.e(G(), "MediaView method called before surface created");
        return this.b.e();
    }

    @Override // defpackage.afky
    public final SurfaceControl f() {
        if (G()) {
            return this.b.f();
        }
        return null;
    }

    @Override // defpackage.afky
    public final View h() {
        afky afkyVar = this.b;
        if (afkyVar != null) {
            return afkyVar.h();
        }
        return null;
    }

    @Override // defpackage.afky
    public final bgv i() {
        if (G()) {
            return this.b.i();
        }
        return null;
    }

    @Override // defpackage.afky
    public final pkd j() {
        if (G()) {
            return this.b.j();
        }
        return null;
    }

    @Override // defpackage.afky
    public final void k() {
        if (G()) {
            this.b.k();
        }
        this.e = false;
    }

    @Override // defpackage.afkl
    public final void l(Bitmap bitmap, ykl yklVar) {
        if (G()) {
            this.b.l(bitmap, yklVar);
        } else {
            yklVar.a(bitmap, null);
        }
    }

    @Override // defpackage.afky
    public final void m(Object obj) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            afky afkyVar = (afky) it.next();
            if (obj == null || (obj != afkyVar.A() && obj != afkyVar.i())) {
                afkyVar.D();
                removeView(afkyVar.h());
                it.remove();
            }
        }
    }

    @Override // defpackage.afky
    public final void n(int i) {
        if (!G()) {
            this.e = true;
        } else {
            this.e = false;
            this.b.n(i);
        }
    }

    @Override // defpackage.afky
    public final void o() {
        if (G()) {
            this.b.o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        afky afkyVar = this.b;
        if (afkyVar != null) {
            removeView(afkyVar.h());
        }
        afky F = F(this.g);
        this.b = F;
        addView(F.h());
        if (this.d) {
            this.d = false;
            this.b.s(this.f);
            if (this.e) {
                n(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            getChildAt(childCount).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            View childAt = getChildAt(childCount);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // defpackage.afky
    public final void p() {
        t(a);
    }

    @Override // defpackage.afky
    public final void q() {
        afky afkyVar = this.b;
        if (afkyVar != null) {
            afkyVar.q();
        }
    }

    @Override // defpackage.afky
    public final void r(boolean z, byte[] bArr, long j, long j2) {
        if (G()) {
            this.b.r(z, bArr, j, j2);
        }
    }

    @Override // defpackage.afkl
    public final int rF() {
        afki.e(G(), "MediaView method called before surface created");
        int rF = this.b.rF();
        return rF == 0 ? getMeasuredHeight() : rF;
    }

    @Override // defpackage.afkl
    public final int rG() {
        afki.e(G(), "MediaView method called before surface created");
        int rG = this.b.rG();
        return rG == 0 ? getMeasuredWidth() : rG;
    }

    @Override // defpackage.afky
    public final void s(afkx afkxVar) {
        this.f = afkxVar;
        if (!G()) {
            this.d = true;
        } else {
            this.d = false;
            this.b.s(afkxVar);
        }
    }

    @Override // defpackage.afky
    public final void t(aflb aflbVar) {
        if (aflbVar == this.g) {
            if (G()) {
                this.b.y(this.i, this.k, this.l, this.m);
                return;
            }
            return;
        }
        afki.a(this.f);
        this.g = aflbVar;
        afic aficVar = afic.ABR;
        afky afkyVar = this.b;
        if (aflbVar == aflb.GL_GVR) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                afky afkyVar2 = (afky) it.next();
                if (afkyVar2.C() == aflbVar) {
                    it.remove();
                    this.b = afkyVar2;
                    bringChildToFront(afkyVar2.h());
                    this.f.c();
                    break;
                }
            }
        }
        afky F = F(aflbVar);
        this.b = F;
        addView(F.h());
        this.b.s(this.f);
        this.b.y(this.i, this.k, this.l, this.m);
        if (afkyVar != null) {
            afkyVar.s(null);
            this.c.add(afkyVar);
        }
    }

    @Override // android.view.View
    public final String toString() {
        int hashCode = hashCode();
        int left = getLeft();
        int top = getTop();
        int right = getRight();
        int bottom = getBottom();
        StringBuilder sb = new StringBuilder(60);
        sb.append(hashCode);
        sb.append("(");
        sb.append(left);
        sb.append(",");
        sb.append(top);
        sb.append(",");
        sb.append(right);
        sb.append(",");
        sb.append(bottom);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.afky
    public final void u(afld afldVar) {
        if (G()) {
            this.b.u(afldVar);
        }
    }

    @Override // defpackage.afkl
    public final void v(int i, int i2) {
        afki.e(G(), "MediaView method called before surface created");
        this.b.v(i, i2);
    }

    @Override // defpackage.afky
    public final void w(boolean z) {
        this.j = z;
    }

    @Override // defpackage.afkl
    @Deprecated
    public final boolean x() {
        afky afkyVar = this.b;
        return afkyVar != null && afkyVar.x();
    }

    @Override // defpackage.afky
    public final void y(boolean z, float f, float f2, int i) {
        this.i = z;
        this.k = f;
        this.l = f2;
        this.m = i;
    }

    @Override // defpackage.afky
    public final /* synthetic */ void z() {
    }
}
