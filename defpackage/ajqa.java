package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajqa {
    public final ajom a;
    public final long b;
    public final Runnable c;
    public final Runnable d;

    public ajqa() {
    }

    public ajqa(ajom ajomVar, long j, Runnable runnable, Runnable runnable2) {
        this.a = ajomVar;
        this.b = j;
        this.c = runnable;
        this.d = runnable2;
    }

    public static ajpz a() {
        return new ajpz();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajqa) {
            ajqa ajqaVar = (ajqa) obj;
            if (this.a.equals(ajqaVar.a) && this.b == ajqaVar.b && this.c.equals(ajqaVar.c) && this.d.equals(ajqaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RemoveParameters{presenter=");
        sb.append(valueOf);
        sb.append(", duration=");
        sb.append(j);
        sb.append(", onStart=");
        sb.append(valueOf2);
        sb.append(", onEnd=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
