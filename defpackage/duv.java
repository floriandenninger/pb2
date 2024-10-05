package defpackage;

import com.facebook.yoga.YogaUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class duv {
    public final float a;
    public final YogaUnit b;

    static {
        new duv(Float.NaN, YogaUnit.UNDEFINED);
        new duv(0.0f, YogaUnit.POINT);
        new duv(Float.NaN, YogaUnit.AUTO);
    }

    public duv(float f, YogaUnit yogaUnit) {
        this.a = f;
        this.b = yogaUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duv) {
            duv duvVar = (duv) obj;
            YogaUnit yogaUnit = this.b;
            if (yogaUnit == duvVar.b) {
                return yogaUnit == YogaUnit.UNDEFINED || this.b == YogaUnit.AUTO || Float.compare(this.a, duvVar.a) == 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a) + this.b.e;
    }

    public final String toString() {
        YogaUnit yogaUnit = YogaUnit.UNDEFINED;
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            return "undefined";
        }
        if (ordinal == 1) {
            return Float.toString(this.a);
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        float f = this.a;
        StringBuilder sb = new StringBuilder(16);
        sb.append(f);
        sb.append("%");
        return sb.toString();
    }
}
