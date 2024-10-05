package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udy {
    public final boolean a;
    private final int b;

    public udy() {
    }

    public udy(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udy) {
            udy udyVar = (udy) obj;
            if (this.a == udyVar.a) {
                int i = this.b;
                int i2 = udyVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int i2 = this.b;
        tyo.aj(i2);
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        boolean z = this.a;
        String ai = tyo.ai(this.b);
        StringBuilder sb = new StringBuilder(ai.length() + 47);
        sb.append("GaiaAccountData{isG1User=");
        sb.append(z);
        sb.append(", isUnicornUser=");
        sb.append(ai);
        sb.append("}");
        return sb.toString();
    }
}
