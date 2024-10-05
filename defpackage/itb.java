package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class itb implements ita {
    public final int a;
    public final int b;
    public final int c;

    public itb() {
    }

    public itb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static itb a(int i, int i2, int i3) {
        return new itb(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof itb) {
            itb itbVar = (itb) obj;
            if (this.a == itbVar.a && this.b == itbVar.b && this.c == itbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(101);
        sb.append("CompleteState{uploadsCompleted=");
        sb.append(i);
        sb.append(", uploadsInProgress=");
        sb.append(i2);
        sb.append(", uploadsFailed=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
