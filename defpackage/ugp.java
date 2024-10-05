package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugp {
    public final int a;
    public final int b;
    private final int c;
    private final int d;

    public ugp() {
    }

    public ugp(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ugp) {
            ugp ugpVar = (ugp) obj;
            if (this.a == ugpVar.a && this.b == ugpVar.b && this.c == ugpVar.c && this.d == ugpVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ 1231;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(179);
        sb.append("ActionViewHolderAttributes{iconColor=");
        sb.append(i);
        sb.append(", actionTextColor=");
        sb.append(i2);
        sb.append(", highlightChipBackgroundColor=");
        sb.append(i3);
        sb.append(", highlightChipTextColor=");
        sb.append(i4);
        sb.append(", isEnlargedDiscs=true}");
        return sb.toString();
    }
}
