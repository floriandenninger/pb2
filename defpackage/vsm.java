package defpackage;

import android.animation.ObjectAnimator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsm {
    public static final vsm a = new vsm(1, 1);
    private static final vsk h = new vsk();
    public final long b;
    public boolean c;
    public vsh d;
    public ObjectAnimator e;
    public final List f = new CopyOnWriteArrayList();
    public boolean g;

    public vsm(long j, long j2) {
        this.b = j2;
        this.d = new vsi(0L, j);
    }

    public static double a(double d, double d2, float f) {
        double d3 = f;
        Double.isNaN(d3);
        return d + ((d2 - d) * d3);
    }

    public final float b(long j) {
        return this.d.a(j);
    }

    public final float c(long j) {
        amkq.N(this.c);
        amkq.N(!j());
        amkq.N(this.d instanceof vsi);
        vsi vsiVar = (vsi) this.d;
        long j2 = vsiVar.a;
        long j3 = j2 + j;
        long j4 = vsiVar.b + j;
        long j5 = 0;
        if (j3 < 0) {
            j5 = -j3;
        } else {
            long j6 = this.b;
            if (j4 > j6) {
                j5 = j6 - j4;
            }
        }
        vsi vsiVar2 = new vsi(j3 + j5, j4 + j5);
        this.d = vsiVar2;
        float a2 = vsiVar2.a(j2);
        g();
        return a2;
    }

    public final long d(float f) {
        return this.d.b(f);
    }

    public final long e(float f) {
        return this.d.c(f);
    }

    public final void f(vsj vsjVar) {
        this.f.add(vsjVar);
    }

    public final void g() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((vsj) it.next()).r(this);
        }
    }

    public final void h(vsj vsjVar) {
        this.f.remove(vsjVar);
    }

    public final void i(long j, long j2, boolean z, boolean z2) {
        amkq.E(j < j2);
        vsi vsiVar = new vsi(j, j2);
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.e = null;
        }
        amkq.N(this.d instanceof vsi);
        if (z) {
            vsi vsiVar2 = (vsi) this.d;
            vsi vsiVar3 = true != z2 ? vsiVar : vsiVar2;
            if (true == z2) {
                vsiVar2 = vsiVar;
            }
            vsg vsgVar = new vsg(this, vsiVar3, vsiVar2, vsiVar);
            float f = true != z2 ? 1.0f : 0.0f;
            float f2 = true != z2 ? 0.0f : 1.0f;
            vsgVar.d(f);
            ObjectAnimator objectAnimator2 = new ObjectAnimator();
            this.e = objectAnimator2;
            objectAnimator2.setTarget(vsgVar);
            ObjectAnimator objectAnimator3 = this.e;
            vsk vskVar = h;
            objectAnimator3.setProperty(vskVar);
            this.e.setPropertyName(vskVar.getName());
            this.e.setFloatValues(f2);
            this.e.addListener(new vsl(this, vsiVar));
            this.e.setDuration(150L);
            this.e.start();
            this.d = vsgVar;
        } else {
            this.d = vsiVar;
            g();
        }
        boolean z3 = this.c;
        this.c = z2;
        if (z3 != z2) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((vsj) it.next()).J();
            }
        }
    }

    public final boolean j() {
        ObjectAnimator objectAnimator = this.e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final void k(long j, long j2) {
        amkq.N(this.c);
        i(j, j2, true, false);
    }

    public final void l(long j, long j2) {
        amkq.N(!this.c);
        i(j, j2, true, true);
    }
}
