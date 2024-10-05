package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmm {
    public static final tmm a;
    public static final tmm b;
    public static final tmm c;
    private final boolean d;
    private final amsx e;

    static {
        tmk a2 = a();
        a2.c(EnumSet.noneOf(tml.class));
        a2.b(false);
        a = a2.a();
        tmk a3 = a();
        a3.c(EnumSet.of(tml.ANY));
        a3.b(true);
        b = a3.a();
        tmk a4 = a();
        a4.c(EnumSet.of(tml.ANY));
        a4.b(false);
        c = a4.a();
    }

    public tmm() {
    }

    public tmm(boolean z, amsx amsxVar) {
        this.d = z;
        this.e = amsxVar;
    }

    public static tmk a() {
        tmk tmkVar = new tmk();
        tmkVar.b(false);
        return tmkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tmm) {
            tmm tmmVar = (tmm) obj;
            if (this.d == tmmVar.d && this.e.equals(tmmVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        boolean z = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
        sb.append("DownloadConstraints{requireUnmeteredNetwork=");
        sb.append(z);
        sb.append(", requiredNetworkTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
