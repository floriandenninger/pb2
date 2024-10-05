package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class chk {
    public clu d;
    private final chh e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public chk(List list) {
        chh chiVar;
        chh chhVar;
        if (list.isEmpty()) {
            chhVar = new chg();
        } else {
            if (list.size() == 1) {
                chiVar = new chj(list);
            } else {
                chiVar = new chi(list);
            }
            chhVar = chiVar;
        }
        this.e = chhVar;
    }

    private final float k() {
        float f = this.g;
        if (f != -1.0f) {
            return f;
        }
        float b = this.e.b();
        this.g = b;
        return b;
    }

    public float a() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float a = this.e.a();
        this.h = a;
        return a;
    }

    public final float b() {
        clt d = d();
        if (d.e()) {
            return 0.0f;
        }
        return d.d.getInterpolation(c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        if (this.b) {
            return 0.0f;
        }
        clt d = d();
        if (d.e()) {
            return 0.0f;
        }
        return (this.c - d.c()) / (d.b() - d.c());
    }

    public final clt d() {
        clt c = this.e.c();
        cfd.a();
        return c;
    }

    public Object e() {
        Object f;
        float c = c();
        if (this.d != null || !this.e.d(c)) {
            clt d = d();
            Interpolator interpolator = d.e;
            if (interpolator == null || d.f == null) {
                f = f(d, b());
            } else {
                f = j(d, interpolator.getInterpolation(c), d.f.getInterpolation(c));
            }
            this.f = f;
            return f;
        }
        return this.f;
    }

    public abstract Object f(clt cltVar, float f);

    public final void g(chf chfVar) {
        this.a.add(chfVar);
    }

    public void h() {
        for (int i = 0; i < this.a.size(); i++) {
            ((chf) this.a.get(i)).d();
        }
    }

    public void i(float f) {
        if (this.e.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f == this.c) {
            return;
        }
        this.c = f;
        if (this.e.f(f)) {
            h();
        }
    }

    protected Object j(clt cltVar, float f, float f2) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
