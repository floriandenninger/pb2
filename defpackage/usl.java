package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class usl implements uoo {
    public final ammv a;
    public final ammv b;
    private final int c;

    public usl() {
    }

    public usl(ammv ammvVar, ammv ammvVar2) {
        this.c = 1;
        this.a = ammvVar;
        this.b = ammvVar2;
    }

    @Override // defpackage.uoo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return this.c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof usl)) {
            return false;
        }
        usl uslVar = (usl) obj;
        int i = this.c;
        int i2 = uslVar.c;
        if (i != 0) {
            return i2 == 1 && this.a.equals(uslVar.a) && this.b.equals(uslVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        uop.b(this.c);
        return 395873938;
    }

    public final String toString() {
        String a = uop.a(this.c);
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + 86 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("StartupConfigurations{enablement=");
        sb.append(a);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append(", customTimestampProvider=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
