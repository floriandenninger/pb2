package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utl implements uoo {
    public final int a;
    public final float b;
    private final ammv c;
    private final int d;

    public utl() {
    }

    public utl(int i, int i2, float f, ammv ammvVar) {
        this.d = i;
        this.a = i2;
        this.b = f;
        this.c = ammvVar;
    }

    public static final utk c() {
        utk utkVar = new utk(null);
        utkVar.a = 10;
        utkVar.b = Float.valueOf(1.0f);
        utkVar.c = amlr.a;
        utkVar.d = 1;
        return utkVar;
    }

    @Override // defpackage.uoo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof utl)) {
            return false;
        }
        utl utlVar = (utl) obj;
        int i = this.d;
        int i2 = utlVar.d;
        if (i != 0) {
            return i == i2 && this.a == utlVar.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(utlVar.b) && this.c.equals(utlVar.c);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        uop.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String a = uop.a(this.d);
        int i = this.a;
        float f = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(a.length() + 130 + String.valueOf(valueOf).length());
        sb.append("TimerConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", samplingProbability=");
        sb.append(f);
        sb.append(", perEventConfigurationFlags=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
