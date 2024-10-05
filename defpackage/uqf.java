package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqf implements uoo {
    public final float a;
    private final int b;

    public uqf() {
    }

    public uqf(int i, float f) {
        this.b = i;
        this.a = f;
    }

    public static final uts c() {
        uts utsVar = new uts();
        utsVar.d(100.0f);
        utsVar.b = 1;
        return utsVar;
    }

    @Override // defpackage.uoo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uqf)) {
            return false;
        }
        uqf uqfVar = (uqf) obj;
        int i = this.b;
        int i2 = uqfVar.b;
        if (i != 0) {
            return i == i2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(uqfVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        uop.b(i);
        return (((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003;
    }

    public final String toString() {
        String a = uop.a(this.b);
        float f = this.a;
        StringBuilder sb = new StringBuilder(a.length() + 99 + "null".length());
        sb.append("CrashConfigurations{enablement=");
        sb.append(a);
        sb.append(", startupSamplePercentage=");
        sb.append(f);
        sb.append(", metricExtensionProvider=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
