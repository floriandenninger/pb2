package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class url implements uoo {
    public final boolean a;
    public final ammv b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    private final int g;

    public url() {
    }

    public url(int i, boolean z, ammv ammvVar, boolean z2, boolean z3, boolean z4) {
        this.f = 2;
        this.g = i;
        this.a = z;
        this.b = ammvVar;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // defpackage.uoo
    public final int a() {
        return this.g;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof url)) {
            return false;
        }
        url urlVar = (url) obj;
        int i = this.f;
        int i2 = urlVar.f;
        if (i != 0) {
            return i == i2 && this.g == urlVar.g && this.a == urlVar.a && this.b.equals(urlVar.b) && this.c == urlVar.c && this.d == urlVar.d && this.e == urlVar.e;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f;
        uop.b(i);
        return ((((((((((((i ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        String a = uop.a(this.f);
        int i = this.g;
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        StringBuilder sb = new StringBuilder(a.length() + 206 + String.valueOf(valueOf).length());
        sb.append("MemoryConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", recordMetricPerProcess=");
        sb.append(z);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append(", forceGcBeforeRecordMemory=");
        sb.append(z2);
        sb.append(", captureDebugMetrics=");
        sb.append(z3);
        sb.append(", captureMemoryInfo=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
