package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahkp {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ahkp(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahkp)) {
            return false;
        }
        ahkp ahkpVar = (ahkp) obj;
        return this.a == ahkpVar.a && this.c == ahkpVar.c && this.d == ahkpVar.d && this.b == ahkpVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }
}
