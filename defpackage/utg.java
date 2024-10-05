package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utg implements uoo {
    public final boolean a;
    public final ammv b;
    private final int c;

    public utg() {
    }

    public utg(int i, boolean z, ammv ammvVar) {
        this.c = i;
        this.a = z;
        this.b = ammvVar;
    }

    public static final utf c() {
        utf utfVar = new utf(null);
        utfVar.a = false;
        utfVar.b = amlr.a;
        utfVar.c = 1;
        return utfVar;
    }

    @Override // defpackage.uoo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return this.c == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof utg)) {
            return false;
        }
        utg utgVar = (utg) obj;
        int i = this.c;
        int i2 = utgVar.c;
        if (i != 0) {
            return i == i2 && this.a == utgVar.a && this.b.equals(utgVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        uop.b(i);
        return ((((i ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String a = uop.a(this.c);
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 80 + String.valueOf(valueOf).length());
        sb.append("StorageConfigurations{enablement=");
        sb.append(a);
        sb.append(", manualCapture=");
        sb.append(z);
        sb.append(", dirStatsConfigurations=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
