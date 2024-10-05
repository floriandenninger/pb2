package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ghj extends gic {
    private final int a;
    private final int b;

    public ghj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.gic
    public int a() {
        return this.b;
    }

    @Override // defpackage.gic
    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gic) {
            gic gicVar = (gic) obj;
            if (this.a == gicVar.b() && this.b == gicVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(76);
        sb.append("ActivePaneChangedEvent{previousPane=");
        sb.append(i);
        sb.append(", navigationType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
