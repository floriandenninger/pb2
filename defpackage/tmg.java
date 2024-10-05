package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmg {
    public final boolean a;
    private final boolean b;
    private final boolean c;

    public tmg() {
    }

    public tmg(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.a = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tmg) {
            tmg tmgVar = (tmg) obj;
            if (this.b == tmgVar.b && this.a == tmgVar.a && this.c == tmgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.b;
        boolean z2 = this.a;
        boolean z3 = this.c;
        StringBuilder sb = new StringBuilder(98);
        sb.append("ConstraintOverrides{requiresDeviceIdle=");
        sb.append(z);
        sb.append(", requiresCharging=");
        sb.append(z2);
        sb.append(", requiresBatteryNotLow=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
