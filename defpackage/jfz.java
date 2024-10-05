package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jfz {
    public final float a;

    public jfz() {
    }

    public jfz(float f) {
        this.a = f;
    }

    public final boolean a() {
        return this.a == 1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof jfz) && Float.floatToIntBits(this.a) == Float.floatToIntBits(((jfz) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a) ^ 1000003;
    }

    public final String toString() {
        float f = this.a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("MdxWatchDrawerState{openRatio=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
