package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aknt {
    public final agzu a;
    public final agzt b;
    private final afyf c;

    public aknt() {
    }

    public aknt(agzu agzuVar, afyf afyfVar, agzt agztVar, byte[] bArr) {
        this.a = agzuVar;
        this.c = afyfVar;
        this.b = agztVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aknt) {
            aknt akntVar = (aknt) obj;
            if (this.a.equals(akntVar.a) && this.c.equals(akntVar.c) && this.b.equals(akntVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + "null".length());
        sb.append("CachePolicy{expiryGenerator=");
        sb.append(valueOf);
        sb.append(", keyConverter=");
        sb.append(valueOf2);
        sb.append(", costGenerator=");
        sb.append(valueOf3);
        sb.append(", cacheMissFetcher=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
