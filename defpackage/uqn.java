package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqn implements uoo {
    private final int a;

    public uqn() {
    }

    public uqn(byte[] bArr) {
        this.a = 1;
    }

    @Override // defpackage.uoo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return this.a == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uqn)) {
            return false;
        }
        int i = this.a;
        boolean z = i == ((uqn) obj).a;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        uop.b(this.a);
        return 1000002;
    }

    public final String toString() {
        String a = uop.a(this.a);
        StringBuilder sb = new StringBuilder(a.length() + 42);
        sb.append("ApplicationExitConfigurations{enablement=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
