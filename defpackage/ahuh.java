package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahuh {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public ahuh() {
    }

    public ahuh(boolean z, boolean z2, boolean z3, long j) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
    }

    public static ahug a() {
        ahug ahugVar = new ahug();
        ahugVar.e(false);
        return ahugVar;
    }

    public static ahuh b(boolean z) {
        ahug a = a();
        a.d(z);
        a.e(false);
        a.b(!z);
        a.c(0L);
        return a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahuh) {
            ahuh ahuhVar = (ahuh) obj;
            if (this.a == ahuhVar.a && this.b == ahuhVar.b && this.c == ahuhVar.c && this.d == ahuhVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        int i2 = true == this.c ? 1231 : 1237;
        long j = this.d;
        return ((i ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        long j = this.d;
        StringBuilder sb = new StringBuilder(148);
        sb.append("AccessibilityState{isAccessibilityPlayerEnabled=");
        sb.append(z);
        sb.append(", isTestOnlyState=");
        sb.append(z2);
        sb.append(", canHidePlayerControls=");
        sb.append(z3);
        sb.append(", controlsHideDelayMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
