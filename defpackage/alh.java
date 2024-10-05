package defpackage;

import android.util.AndroidRuntimeException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alh extends alf {
    public ali n;
    private float o;
    private boolean p;

    public alh(hiq hiqVar, byte[] bArr) {
        super(hiqVar, (byte[]) null);
        this.n = null;
        this.o = Float.MAX_VALUE;
        this.p = false;
    }

    @Override // defpackage.alf
    public final boolean e(long j) {
        float f;
        if (this.p) {
            float f2 = this.o;
            if (f2 != Float.MAX_VALUE) {
                this.n.d(f2);
                this.o = Float.MAX_VALUE;
            }
            this.h = this.n.a();
            this.g = 0.0f;
            this.p = false;
            return true;
        }
        if (this.o != Float.MAX_VALUE) {
            long j2 = j / 2;
            alb b = this.n.b(this.h, this.g, j2);
            this.n.d(this.o);
            this.o = Float.MAX_VALUE;
            alb b2 = this.n.b(b.a, b.b, j2);
            f = b2.a;
            this.h = f;
            this.g = b2.b;
        } else {
            alb b3 = this.n.b(this.h, this.g, j);
            f = b3.a;
            this.h = f;
            this.g = b3.b;
        }
        float max = Math.max(f, -3.4028235E38f);
        this.h = max;
        this.h = Math.min(max, Float.MAX_VALUE);
        float f3 = this.g;
        ali aliVar = this.n;
        if (Math.abs(f3) >= aliVar.d || Math.abs(r1 - aliVar.a()) >= aliVar.c) {
            return false;
        }
        this.h = this.n.a();
        this.g = 0.0f;
        return true;
    }

    public final void i(float f) {
        if (this.l) {
            this.o = f;
            return;
        }
        if (this.n == null) {
            this.n = new ali(f);
        }
        this.n.d(f);
        ali aliVar = this.n;
        if (aliVar != null) {
            double a = aliVar.a();
            if (a > 3.4028234663852886E38d) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            }
            if (a >= -3.4028234663852886E38d) {
                ali aliVar2 = this.n;
                double abs = Math.abs(this.m * 0.75f);
                aliVar2.c = abs;
                aliVar2.d = abs * 62.5d;
                if (b().a()) {
                    if (this.l) {
                        return;
                    }
                    this.l = true;
                    if (!this.i) {
                        this.h = this.k.a(this.j);
                    }
                    float f2 = this.h;
                    if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    akt b = b();
                    if (b.c.size() == 0) {
                        b.h.a(b.e);
                    }
                    if (b.c.contains(this)) {
                        return;
                    }
                    b.c.add(this);
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public final void j() {
        if (b().a()) {
            if (this.l) {
                super.c(true);
            }
            float f = this.o;
            if (f != Float.MAX_VALUE) {
                ali aliVar = this.n;
                if (aliVar == null) {
                    this.n = new ali(f);
                } else {
                    aliVar.d(f);
                }
                this.o = Float.MAX_VALUE;
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
    }

    public final void k() {
        if (this.n.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (b().a()) {
            if (this.l) {
                this.p = true;
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    }

    public alh(Object obj, alg algVar) {
        super(obj, algVar);
        this.n = null;
        this.o = Float.MAX_VALUE;
        this.p = false;
    }
}
