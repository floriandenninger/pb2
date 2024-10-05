package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahla {
    public final float a;
    public final float b;
    private final ahkz c;

    public ahla() {
        ahkz ahkzVar = ahkz.DISABLED;
        throw null;
    }

    public ahla(ahkz ahkzVar, float f, float f2) {
        this.c = ahkzVar;
        this.a = f;
        this.b = f2;
    }

    public final boolean a() {
        return this.c == ahkz.ENABLED || this.c == ahkz.PAUSED;
    }

    public final boolean b() {
        return this.c == ahkz.PAUSED;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahla) {
            ahla ahlaVar = (ahla) obj;
            if (this.c == ahlaVar.c && this.a == ahlaVar.a && this.b == ahlaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Float.valueOf(this.a), Float.valueOf(this.b)});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("state", this.c);
        Y.d("scale", this.a);
        Y.d("offset", this.b);
        return Y.toString();
    }
}
