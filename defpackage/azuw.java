package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azuw extends azuv {
    public static final azuw d = new azuw(1, 0);

    public azuw(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.azuv
    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.azuv
    public final boolean equals(Object obj) {
        if (obj instanceof azuw) {
            if (b() && ((azuw) obj).b()) {
                return true;
            }
            azuw azuwVar = (azuw) obj;
            if (this.a == azuwVar.a && this.b == azuwVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.azuv
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.azuv
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
