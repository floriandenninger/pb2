package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awzq {
    public int a;
    public int b;

    public awzq(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[1];
        if (b == 3) {
            this.a = 3;
        } else if (b == 4) {
            this.a = 4;
        } else {
            StringBuilder sb = new StringBuilder(46);
            sb.append("The address type is illegal. Value:");
            sb.append((int) b);
            throw new IllegalArgumentException(sb.toString());
        }
        if (b2 == 2) {
            this.b = 2;
            return;
        }
        if (b2 == 3) {
            this.b = 3;
        } else {
            if (b2 == 4) {
                this.b = 4;
                return;
            }
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("The score type is illegal. Value:");
            sb2.append((int) b2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
