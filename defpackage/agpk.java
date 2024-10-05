package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpk {
    public final amru a;
    public final Integer b;
    public final Integer c;

    public agpk(amru amruVar, Integer num, Integer num2) {
        if (amruVar == null) {
            throw new NullPointerException("Null shuffleOrder");
        }
        this.a = amruVar;
        this.b = num;
        this.c = num2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static agpk a(amru amruVar, Integer num, Integer num2) {
        return new agpk(amruVar, num, num2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agpk) {
            agpk agpkVar = (agpk) obj;
            if (amkq.aV(this.a, agpkVar.a) && this.b.equals(agpkVar.b) && this.c.equals(agpkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ShuffleInfo{shuffleOrder=");
        sb.append(valueOf);
        sb.append(", shuffleIndex=");
        sb.append(valueOf2);
        sb.append(", loopShuffleFlags=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public agpk() {
    }
}
