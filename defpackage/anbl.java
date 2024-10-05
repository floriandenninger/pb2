package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anbl extends anbo {
    final char[] a;

    public anbl(anbk anbkVar) {
        super(anbkVar, null);
        this.a = new char[512];
        amkq.E(anbkVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = anbkVar.a(i >>> 4);
            this.a[i | 256] = anbkVar.a(i & 15);
        }
    }

    @Override // defpackage.anbo, defpackage.anbp
    public final int a(byte[] bArr, CharSequence charSequence) {
        bArr.getClass();
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.b.b(charSequence.charAt(i)) << 4) | this.b.b(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new anbn(sb.toString());
    }

    @Override // defpackage.anbo
    public final anbp b(anbk anbkVar, Character ch) {
        return new anbl(anbkVar);
    }

    @Override // defpackage.anbo, defpackage.anbp
    public final void c(Appendable appendable, byte[] bArr, int i) {
        amkq.M(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.a[i3]);
            appendable.append(this.a[i3 | 256]);
        }
    }
}
