package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class anbo extends anbp {
    private transient anbp a;
    public final anbk b;
    public final Character c;

    public anbo(anbk anbkVar, Character ch) {
        char charValue;
        this.b = anbkVar;
        boolean z = true;
        if (ch != null && (charValue = ch.charValue()) < 128 && anbkVar.g[charValue] != -1) {
            z = false;
        }
        amkq.J(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.anbp
    public int a(byte[] bArr, CharSequence charSequence) {
        anbk anbkVar;
        bArr.getClass();
        CharSequence g = g(charSequence);
        if (this.b.c(g.length())) {
            int i = 0;
            int i2 = 0;
            while (i < g.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    anbkVar = this.b;
                    if (i3 >= anbkVar.e) {
                        break;
                    }
                    j <<= anbkVar.d;
                    if (i + i3 < g.length()) {
                        j |= this.b.b(g.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = anbkVar.f;
                int i6 = (i5 * 8) - (i4 * anbkVar.d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.b.e;
            }
            return i2;
        }
        int length = g.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new anbn(sb.toString());
    }

    public anbp b(anbk anbkVar, Character ch) {
        return new anbo(anbkVar, ch);
    }

    @Override // defpackage.anbp
    public void c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        amkq.M(0, i, bArr.length);
        while (i2 < i) {
            h(appendable, bArr, i2, Math.min(this.b.f, i - i2));
            i2 += this.b.f;
        }
    }

    @Override // defpackage.anbp
    public final int d(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.anbp
    public final int e(int i) {
        anbk anbkVar = this.b;
        return anbkVar.e * anaf.at(i, anbkVar.f, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anbo) {
            anbo anboVar = (anbo) obj;
            if (this.b.equals(anboVar.b) && amkq.b(this.c, anboVar.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.anbp
    public final anbp f() {
        boolean z;
        anbp anbpVar = this.a;
        if (anbpVar == null) {
            anbk anbkVar = this.b;
            char[] cArr = anbkVar.b;
            int length = cArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (amkq.g(cArr[i2])) {
                    char[] cArr2 = anbkVar.b;
                    int length2 = cArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            z = false;
                            break;
                        }
                        if (amkq.f(cArr2[i3])) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    amkq.O(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr3 = new char[anbkVar.b.length];
                    while (true) {
                        char[] cArr4 = anbkVar.b;
                        if (i >= cArr4.length) {
                            break;
                        }
                        char c = cArr4[i];
                        if (amkq.g(c)) {
                            c ^= 32;
                        }
                        cArr3[i] = (char) c;
                        i++;
                    }
                    anbkVar = new anbk(anbkVar.a.concat(".lowerCase()"), cArr3);
                } else {
                    i2++;
                }
            }
            anbpVar = anbkVar == this.b ? this : b(anbkVar, this.c);
            this.a = anbpVar;
        }
        return anbpVar;
    }

    @Override // defpackage.anbp
    public final CharSequence g(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == charValue);
        return charSequence.subSequence(0, length + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Appendable appendable, byte[] bArr, int i, int i2) {
        amkq.M(i, i + i2, bArr.length);
        int i3 = 0;
        amkq.E(i2 <= this.b.f);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.b.d;
        while (i3 < i2 * 8) {
            anbk anbkVar = this.b;
            appendable.append(anbkVar.a(((int) (j >>> (i5 - i3))) & anbkVar.c));
            i3 += this.b.d;
        }
        if (this.c != null) {
            while (i3 < this.b.f * 8) {
                appendable.append(this.c.charValue());
                i3 += this.b.d;
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Arrays.hashCode(new Object[]{this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b.a);
        if (8 % this.b.d != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public anbo(String str, String str2, Character ch) {
        this(new anbk(str, str2.toCharArray()), ch);
    }
}
