package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yrm {
    public final boolean a;
    public final boolean b;
    public final int c;
    private final boolean d;
    private final boolean e;

    public yrm() {
    }

    public yrm(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.d = z;
        this.a = z2;
        this.b = z3;
        this.e = z4;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yrm) {
            yrm yrmVar = (yrm) obj;
            if (this.d == yrmVar.d && this.a == yrmVar.a && this.b == yrmVar.b && this.e == yrmVar.e && this.c == yrmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.c;
    }

    public final String toString() {
        boolean z = this.d;
        boolean z2 = this.a;
        boolean z3 = this.b;
        boolean z4 = this.e;
        int i = this.c;
        StringBuilder sb = new StringBuilder(138);
        sb.append("ConnectivityStatus{connectedOrConnecting=");
        sb.append(z);
        sb.append(", connected=");
        sb.append(z2);
        sb.append(", temporarilyUnmetered=");
        sb.append(z3);
        sb.append(", chargeable=");
        sb.append(z4);
        sb.append(", connectionType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
