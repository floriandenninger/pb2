package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adqv {
    public final adqz a;
    public final Runnable b;

    public adqv() {
    }

    public adqv(adqz adqzVar, Runnable runnable) {
        this.a = adqzVar;
        this.b = runnable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adqv) {
            adqv adqvVar = (adqv) obj;
            if (this.a.equals(adqvVar.a) && this.b.equals(adqvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
        sb.append("Entry{message=");
        sb.append(valueOf);
        sb.append(", timeoutRunnable=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
