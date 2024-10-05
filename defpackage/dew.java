package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dew {
    public final int a;

    public dew(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((dew) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(122);
        sb.append("Entry{reserved=");
        sb.append(i >> 6);
        sb.append(", sampleDependsOn=");
        sb.append((i >> 4) & 3);
        sb.append(", sampleIsDependentOn=");
        sb.append((i >> 2) & 3);
        sb.append(", sampleHasRedundancy=");
        sb.append(i & 3);
        sb.append("}");
        return sb.toString();
    }
}
