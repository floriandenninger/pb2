package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnu implements plg {
    public static final pnu a = new pnu(1.0f);
    public final float b;
    public final float c;
    public final int d;

    public pnu(float f) {
        this(f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pnu pnuVar = (pnu) obj;
            if (this.b == pnuVar.b && this.c == pnuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c);
    }

    public final String toString() {
        return pts.D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(this.c));
    }

    public pnu(float f, float f2) {
        pse.e(f > 0.0f);
        pse.e(f2 > 0.0f);
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }
}
