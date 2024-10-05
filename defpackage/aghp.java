package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghp {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    private final boolean d;

    public aghp() {
    }

    public aghp(boolean z, boolean z2, boolean z3, boolean z4) {
        this.d = z;
        this.a = z2;
        this.b = z3;
        this.c = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aghp) {
            aghp aghpVar = (aghp) obj;
            if (this.d == aghpVar.d && this.a == aghpVar.a && this.b == aghpVar.b && this.c == aghpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.d;
        boolean z2 = this.a;
        boolean z3 = this.b;
        boolean z4 = this.c;
        StringBuilder sb = new StringBuilder(156);
        sb.append("AutoOfflineConfig{channelAutoOfflineEnabled=");
        sb.append(z);
        sb.append(", videoListAutoOfflineEnabled=");
        sb.append(z2);
        sb.append(", offlineCandidatesEnabled=");
        sb.append(z3);
        sb.append(", offlineSubscriptionsSyncEnabled=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
