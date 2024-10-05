package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aso implements plg {
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        new aso(0, 0);
    }

    public aso(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public aso(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = 0;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aso) {
            aso asoVar = (aso) obj;
            if (this.a == asoVar.a && this.b == asoVar.b) {
                int i = asoVar.c;
                if (this.d == asoVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 217) * 31) + this.b) * 961) + Float.floatToRawIntBits(this.d);
    }
}
