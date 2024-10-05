package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class urd implements uoo {
    private final int a;
    private final int b;

    public urd() {
    }

    public urd(int i) {
        this.b = 2;
        this.a = i;
    }

    @Override // defpackage.uoo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof urd)) {
            return false;
        }
        urd urdVar = (urd) obj;
        int i = this.b;
        int i2 = urdVar.b;
        if (i != 0) {
            return i == i2 && this.a == urdVar.a;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        uop.b(i);
        return ((i ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        String a = uop.a(this.b);
        int i = this.a;
        StringBuilder sb = new StringBuilder(a.length() + 63);
        sb.append("JankConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
