package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class clt {
    private final cfj a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public PointF m;
    public PointF n;
    private float o;
    private float p;

    public clt(cfj cfjVar, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = cfjVar;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public clt(cfj cfjVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = cfjVar;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public clt(cfj cfjVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = cfjVar;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public clt(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public final float b() {
        if (this.a == null) {
            return 1.0f;
        }
        float f = this.p;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.h == null) {
            this.p = 1.0f;
            return 1.0f;
        }
        float floatValue = ((this.h.floatValue() - this.g) / this.a.b()) + c();
        this.p = floatValue;
        return floatValue;
    }

    public final float c() {
        cfj cfjVar = this.a;
        if (cfjVar == null) {
            return 0.0f;
        }
        float f = this.o;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float b = (this.g - cfjVar.h) / cfjVar.b();
        this.o = b;
        return b;
    }

    public final boolean d(float f) {
        return f >= c() && f < b();
    }

    public final boolean e() {
        return this.d == null && this.e == null && this.f == null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        float f = this.g;
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 86 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Keyframe{startValue=");
        sb.append(valueOf);
        sb.append(", endValue=");
        sb.append(valueOf2);
        sb.append(", startFrame=");
        sb.append(f);
        sb.append(", endFrame=");
        sb.append(valueOf3);
        sb.append(", interpolator=");
        sb.append(valueOf4);
        sb.append('}');
        return sb.toString();
    }
}
