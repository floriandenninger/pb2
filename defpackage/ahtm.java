package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtm {
    public final long a;
    public final long b;
    public final CharSequence c;
    public final arfr d;
    private final long e;

    public ahtm() {
    }

    public ahtm(long j, long j2, long j3, CharSequence charSequence, arfr arfrVar) {
        this.a = j;
        this.b = j2;
        this.e = j3;
        this.c = charSequence;
        this.d = arfrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahtm) {
            ahtm ahtmVar = (ahtm) obj;
            if (this.a == ahtmVar.a && this.b == ahtmVar.b && this.e == ahtmVar.e && this.c.equals(ahtmVar.c) && this.d.equals(ahtmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.e;
        return this.d.hashCode() ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.e;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 189 + String.valueOf(valueOf2).length());
        sb.append("TimedMarkerDecoratorModel{decorationVisibilityStartMillis=");
        sb.append(j);
        sb.append(", decorationVisibilityEndMillis=");
        sb.append(j2);
        sb.append(", decorationTimeMillis=");
        sb.append(j3);
        sb.append(", label=");
        sb.append(valueOf);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
