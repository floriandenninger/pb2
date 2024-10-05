package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hex {
    public final float a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public hex() {
    }

    public hex(float f, String str, String str2, int i, String str3) {
        this.a = f;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hew a() {
        return new hew();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hex) {
            hex hexVar = (hex) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(hexVar.a) && this.b.equals(hexVar.b) && this.c.equals(hexVar.c) && this.d == hexVar.d && this.e.equals(hexVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        float f = this.a;
        String str = this.b;
        String str2 = this.c;
        int i = this.d;
        String str3 = this.e;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 98 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("SpeedElement{speed=");
        sb.append(f);
        sb.append(", animationTitle=");
        sb.append(str);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(i);
        sb.append(", contentDescription=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
