package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utt implements uoo {
    public final float a;
    private final int b;

    public utt() {
    }

    public utt(int i, float f) {
        this.b = i;
        this.a = f;
    }

    public static final uts c() {
        uts utsVar = new uts();
        utsVar.a = Float.valueOf(0.5f);
        utsVar.b = 1;
        return utsVar;
    }

    @Override // defpackage.uoo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof utt)) {
            return false;
        }
        utt uttVar = (utt) obj;
        int i = this.b;
        int i2 = uttVar.b;
        if (i != 0) {
            return i == i2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(uttVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        uop.b(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        String a = uop.a(this.b);
        float f = this.a;
        StringBuilder sb = new StringBuilder(a.length() + 69);
        sb.append("TraceConfigurations{enablement=");
        sb.append(a);
        sb.append(", samplingProbability=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
