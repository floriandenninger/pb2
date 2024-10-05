package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzv {
    public final boolean a;
    public final int b;
    public final boolean c;

    public afzv() {
    }

    public afzv(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public static afzv a(boolean z, int i, boolean z2) {
        return new afzv(z, i, z2);
    }

    public static afzv b() {
        return new afzv(false, 0, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afzv) {
            afzv afzvVar = (afzv) obj;
            if (this.a == afzvVar.a && this.b == afzvVar.b && this.c == afzvVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(82);
        sb.append("NewContentSignal{isNewContent=");
        sb.append(z);
        sb.append(", unseenItemCount=");
        sb.append(i);
        sb.append(", isCleared=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
