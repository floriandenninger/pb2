package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uag {
    public final aooy a;
    public final aooy b;
    public final Throwable c;
    public final boolean d;

    public uag() {
    }

    public uag(aooy aooyVar, aooy aooyVar2, Throwable th, boolean z) {
        this.a = aooyVar;
        this.b = aooyVar2;
        this.c = th;
        this.d = z;
    }

    public static uag a(aooy aooyVar, udn udnVar) {
        uaf c = c();
        c.a = aooyVar;
        c.b = udnVar.a;
        c.c = udnVar.b;
        c.b(udnVar.c);
        return c.a();
    }

    public static uaf c() {
        uaf uafVar = new uaf();
        uafVar.b(true);
        return uafVar;
    }

    public final boolean b() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uag) {
            uag uagVar = (uag) obj;
            aooy aooyVar = this.a;
            if (aooyVar != null ? aooyVar.equals(uagVar.a) : uagVar.a == null) {
                aooy aooyVar2 = this.b;
                if (aooyVar2 != null ? aooyVar2.equals(uagVar.b) : uagVar.b == null) {
                    Throwable th = this.c;
                    if (th != null ? th.equals(uagVar.c) : uagVar.c == null) {
                        if (this.d == uagVar.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChimeRpc{request=");
        sb.append(valueOf);
        sb.append(", response=");
        sb.append(valueOf2);
        sb.append(", error=");
        sb.append(valueOf3);
        sb.append(", isRetryableError=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        aooy aooyVar = this.a;
        int hashCode = ((aooyVar == null ? 0 : aooyVar.hashCode()) ^ 1000003) * 1000003;
        aooy aooyVar2 = this.b;
        int hashCode2 = (hashCode ^ (aooyVar2 == null ? 0 : aooyVar2.hashCode())) * 1000003;
        Throwable th = this.c;
        return ((hashCode2 ^ (th != null ? th.hashCode() : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }
}
