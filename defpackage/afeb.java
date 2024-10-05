package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afeb {
    public final long a;
    public final aerv b;

    public afeb(aerv aervVar, long j) {
        this.b = aervVar;
        this.a = j;
    }

    public final afeb a(aeru aeruVar) {
        aerv aervVar = new aerv(this.b);
        aervVar.g = aeruVar;
        aervVar.a = this.b.a.a(aeruVar);
        return new afeb(aervVar, this.a);
    }

    public final String toString() {
        aerv aervVar = this.b;
        String str = aervVar.d;
        String valueOf = String.valueOf(aervVar.c);
        String valueOf2 = String.valueOf(this.b.b);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 28 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("QueuedVideo(cpn=");
        sb.append(str);
        sb.append(" position=");
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
