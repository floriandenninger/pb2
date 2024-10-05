package defpackage;

import android.graphics.PathEffect;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dou {
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PathEffect i;
    public float[] j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dou douVar = (dou) obj;
            if (douVar.a == this.a && douVar.b == this.b && douVar.c == this.c && douVar.d == this.d && this.e == douVar.e && this.f == douVar.f && this.g == douVar.g && this.h == douVar.h && did.K(null, null) && Arrays.equals(this.j, douVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((int) this.a) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 961) + Arrays.hashCode(this.j);
    }
}
