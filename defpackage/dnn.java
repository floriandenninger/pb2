package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dnn {
    public final dno a;
    public final float b;

    public dnn(dno dnoVar, float f) {
        this.a = dnoVar;
        this.b = f;
    }

    public final dmi a() {
        return this.a.a;
    }

    public final dng b() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dnn dnnVar = (dnn) obj;
            if (Float.compare(dnnVar.b, this.b) == 0 && this.a.equals(dnnVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        float f = this.b;
        return hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        float f = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
        sb.append("PropertyAnimation{ PropertyHandle=");
        sb.append(valueOf);
        sb.append(", TargetValue=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
