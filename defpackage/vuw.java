package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vuw {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public vuw() {
    }

    public vuw(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static vuv a() {
        vuv vuvVar = new vuv();
        vuvVar.c(false);
        vuvVar.b(false);
        vuvVar.a = false;
        vuvVar.d(false);
        return vuvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vuw) {
            vuw vuwVar = (vuw) obj;
            if (this.a == vuwVar.a && this.b == vuwVar.b && this.c == vuwVar.c && this.d == vuwVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        StringBuilder sb = new StringBuilder(134);
        sb.append("Options{enableExtractorValidation=");
        sb.append(z);
        sb.append(", allowMetadataTracks=");
        sb.append(z2);
        sb.append(", allowMultipleVideoTracks=");
        sb.append(z3);
        sb.append(", useShortestTrackForDuration=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
