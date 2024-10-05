package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anbm extends anbo {
    private anbm(anbk anbkVar, Character ch) {
        super(anbkVar, ch);
        amkq.E(anbkVar.b.length == 64);
    }

    @Override // defpackage.anbo, defpackage.anbp
    public final int a(byte[] bArr, CharSequence charSequence) {
        bArr.getClass();
        CharSequence g = g(charSequence);
        if (this.b.c(g.length())) {
            int i = 0;
            int i2 = 0;
            while (i < g.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int b = (this.b.b(g.charAt(i)) << 18) | (this.b.b(g.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (b >>> 16);
                if (i4 < g.length()) {
                    int i6 = i4 + 1;
                    int b2 = b | (this.b.b(g.charAt(i4)) << 6);
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((b2 >>> 8) & PrivateKeyType.INVALID);
                    if (i6 < g.length()) {
                        bArr[i7] = (byte) ((b2 | this.b.b(g.charAt(i6))) & PrivateKeyType.INVALID);
                        i = i6 + 1;
                        i2 = i7 + 1;
                    } else {
                        i = i6;
                        i2 = i7;
                    }
                } else {
                    i2 = i5;
                    i = i4;
                }
            }
            return i2;
        }
        int length = g.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new anbn(sb.toString());
    }

    @Override // defpackage.anbo
    public final anbp b(anbk anbkVar, Character ch) {
        return new anbm(anbkVar, ch);
    }

    @Override // defpackage.anbo, defpackage.anbp
    public final void c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        amkq.M(0, i, bArr.length);
        int i3 = i;
        while (i3 >= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            appendable.append(this.b.a(i6 >>> 18));
            appendable.append(this.b.a((i6 >>> 12) & 63));
            appendable.append(this.b.a((i6 >>> 6) & 63));
            appendable.append(this.b.a(i6 & 63));
            i3 -= 3;
            i2 = i5 + 1;
        }
        if (i2 < i) {
            h(appendable, bArr, i2, i - i2);
        }
    }

    public anbm(String str, String str2, Character ch) {
        this(new anbk(str, str2.toCharArray()), ch);
    }
}
