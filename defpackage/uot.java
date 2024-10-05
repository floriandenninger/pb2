package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uot implements uoo {
    public final uor a;
    private final int b;

    public uot() {
    }

    public uot(int i, uor uorVar) {
        this.b = i;
        this.a = uorVar;
    }

    public static final uos c() {
        uos uosVar = new uos();
        uosVar.b = uor.a;
        uosVar.a = 1;
        return uosVar;
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
        if (!(obj instanceof uot)) {
            return false;
        }
        uot uotVar = (uot) obj;
        int i = this.b;
        int i2 = uotVar.b;
        if (i != 0) {
            return i == i2 && this.a.equals(uotVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        uop.b(i);
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String a = uop.a(this.b);
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(a.length() + 60 + String.valueOf(valueOf).length());
        sb.append("BatteryConfigurations{enablement=");
        sb.append(a);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
