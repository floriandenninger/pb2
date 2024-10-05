package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xur extends xuu {
    private final ammv a;

    public xur(ammv ammvVar) {
        this.a = ammvVar;
    }

    @Override // defpackage.xuu
    public ammv a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xuu) {
            return this.a.equals(((xuu) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("FooterSetEvent{renderer=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
