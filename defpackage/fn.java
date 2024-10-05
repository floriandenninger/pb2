package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fn {
    public static final fn a = new fn(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private fn(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static fn b(fn fnVar, fn fnVar2) {
        return d(Math.max(fnVar.b, fnVar2.b), Math.max(fnVar.c, fnVar2.c), Math.max(fnVar.d, fnVar2.d), Math.max(fnVar.e, fnVar2.e));
    }

    public static fn c(Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static fn d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i2 != 0) {
                i = 0;
            } else if (i3 != 0) {
                i = 0;
                i2 = 0;
            } else {
                if (i4 == 0) {
                    return a;
                }
                i = 0;
                i2 = 0;
                i3 = 0;
            }
        }
        return new fn(i, i2, i3, i4);
    }

    public static fn e(Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fn fnVar = (fn) obj;
        return this.e == fnVar.e && this.b == fnVar.b && this.d == fnVar.d && this.c == fnVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
