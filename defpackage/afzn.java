package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzn {
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;

    public afzn() {
    }

    public afzn(String str, boolean z, int i, int i2) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public static afzm a() {
        afzm afzmVar = new afzm();
        afzmVar.a = null;
        afzmVar.c(false);
        afzmVar.b(0);
        afzmVar.d(0);
        return afzmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afzn) {
            afzn afznVar = (afzn) obj;
            String str = this.a;
            if (str != null ? str.equals(afznVar.a) : afznVar.a == null) {
                if (this.b == afznVar.b && this.c == afznVar.c && this.d == afznVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        int i = this.c;
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 113);
        sb.append("BrowseTabNewContent{tabIdentifier=");
        sb.append(str);
        sb.append(", newContent=");
        sb.append(z);
        sb.append(", deliveryTimestamp=");
        sb.append(i);
        sb.append(", unseenItemCount=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
