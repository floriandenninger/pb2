package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udn {
    public final aooy a;
    public final Throwable b;
    public final boolean c;

    public udn() {
    }

    public udn(aooy aooyVar, Throwable th, boolean z) {
        this.a = aooyVar;
        this.b = th;
        this.c = z;
    }

    public static udl a() {
        udl udlVar = new udl();
        udlVar.b(true);
        return udlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udn) {
            udn udnVar = (udn) obj;
            aooy aooyVar = this.a;
            if (aooyVar != null ? aooyVar.equals(udnVar.a) : udnVar.a == null) {
                Throwable th = this.b;
                if (th != null ? th.equals(udnVar.b) : udnVar.b == null) {
                    if (this.c == udnVar.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length());
        sb.append("ChimeRpcResponse{response=");
        sb.append(valueOf);
        sb.append(", error=");
        sb.append(valueOf2);
        sb.append(", isRetryableError=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        aooy aooyVar = this.a;
        int hashCode = ((aooyVar == null ? 0 : aooyVar.hashCode()) ^ 1000003) * 1000003;
        Throwable th = this.b;
        return ((hashCode ^ (th != null ? th.hashCode() : 0)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }
}
