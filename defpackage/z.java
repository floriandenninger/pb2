package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class z {
    public final int a;
    public final char b;
    public short c;
    public int d;
    public final int e;

    public z(int i, int i2, int i3, int i4) {
        this.e = i;
        this.a = i2;
        this.b = (char) i3;
        this.c = (short) i4;
    }

    public final int a() {
        return this.a + this.b;
    }

    public final int b() {
        int i = this.e;
        if (i == 6 || i == 7) {
            return aa.e[this.c];
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            z zVar = (z) obj;
            if (this.e == zVar.e && this.a == zVar.a && this.b == zVar.b && this.c == zVar.c && this.d == zVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.e * 37) + this.a) * 37) + this.b) * 37) + this.c;
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.e;
        if (i == 6 || i == 7) {
            int b = b();
            String a = d.a(b);
            if (b == 0) {
                throw null;
            }
            str = a;
        } else {
            str = Integer.toString(this.c);
        }
        switch (this.e) {
            case 1:
                str2 = "MSG_START";
                break;
            case 2:
                str2 = "MSG_LIMIT";
                break;
            case 3:
                str2 = "SKIP_SYNTAX";
                break;
            case 4:
                str2 = "INSERT_CHAR";
                break;
            case 5:
                str2 = "REPLACE_NUMBER";
                break;
            case 6:
                str2 = "ARG_START";
                break;
            case 7:
                str2 = "ARG_LIMIT";
                break;
            case 8:
                str2 = "ARG_NUMBER";
                break;
            case 9:
                str2 = "ARG_NAME";
                break;
            case 10:
                str2 = "ARG_TYPE";
                break;
            case 11:
                str2 = "ARG_STYLE";
                break;
            case 12:
                str2 = "ARG_SELECTOR";
                break;
            case 13:
                str2 = "ARG_INT";
                break;
            default:
                str2 = "ARG_DOUBLE";
                break;
        }
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(str2.length() + 14 + String.valueOf(str).length());
        sb.append(str2);
        sb.append("(");
        sb.append(str);
        sb.append(")@");
        sb.append(i2);
        return sb.toString();
    }
}
