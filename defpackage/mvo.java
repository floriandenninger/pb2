package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvo {
    public final int a;
    public final int b;
    private final int c;
    private final int d;

    public mvo() {
    }

    public mvo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvo) {
            mvo mvoVar = (mvo) obj;
            if (this.a == mvoVar.a && this.b == mvoVar.b && this.c == mvoVar.c && this.d == mvoVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(176);
        sb.append("SlimMetadataToggleButtonColorConfiguration{defaultIconColorRes=");
        sb.append(i);
        sb.append(", selectedIconColorRes=");
        sb.append(i2);
        sb.append(", defaultTextColorRes=");
        sb.append(i3);
        sb.append(", selectedTextColorRes=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
