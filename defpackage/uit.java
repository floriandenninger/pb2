package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uit {
    private final tyo a;

    public uit() {
    }

    public uit(tyo tyoVar, byte[] bArr, byte[] bArr2) {
        this.a = tyoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uit) {
            return this.a.equals(((uit) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("LogoViewFeature{logoViewInflater=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
