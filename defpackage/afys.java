package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afys {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public afys() {
    }

    public afys(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afys) {
            afys afysVar = (afys) obj;
            if (this.a == afysVar.a && this.b == afysVar.b && this.c == afysVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        StringBuilder sb = new StringBuilder(94);
        sb.append("NotificationSettings{appLevelEnabled=");
        sb.append(z);
        sb.append(", osLevelEnabled=");
        sb.append(z2);
        sb.append(", osChannelLevelEnabled=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
