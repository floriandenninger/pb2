package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfw {
    public final apah a;
    public final int b;
    public final amru c;

    public xfw(apah apahVar, int i, amru amruVar) {
        this.a = apahVar;
        this.b = i;
        if (amruVar == null) {
            throw new NullPointerException("Null dispatchedPings");
        }
        this.c = amruVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xfw) {
            xfw xfwVar = (xfw) obj;
            if (this.a.equals(xfwVar.a) && this.b == xfwVar.b && amkq.aV(this.c, xfwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78 + String.valueOf(valueOf2).length());
        sb.append("PingDispatchLoggingData{triggerType=");
        sb.append(valueOf);
        sb.append(", pingCount=");
        sb.append(i);
        sb.append(", dispatchedPings=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public xfw() {
    }
}
