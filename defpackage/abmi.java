package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abmi implements InputFilter {
    private final String a;
    private final char b;
    private final StringBuilder c = new StringBuilder();
    private final int d;
    private final int e;

    public abmi(String str, char c, int i, int i2) {
        this.a = str;
        this.b = c;
        this.d = i;
        this.e = i2;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length;
        int length2;
        String substring;
        if (i == i2) {
            return null;
        }
        this.c.setLength(0);
        StringBuilder sb = this.c;
        sb.append(spanned.subSequence(0, i3));
        sb.append(charSequence.subSequence(i, i2));
        sb.append(spanned.subSequence(i4, spanned.length()));
        int indexOf = this.c.indexOf(this.a);
        if (indexOf == -1) {
            length2 = this.c.length();
            length = 0;
        } else {
            if ((this.e == 0 && this.c.indexOf(this.a) != -1) || this.c.lastIndexOf(this.a) != indexOf) {
                return "";
            }
            length = (this.c.length() - 1) - indexOf;
            length2 = (this.c.length() - 1) - length;
        }
        if (length > this.e || length2 > this.d) {
            return "";
        }
        int indexOf2 = this.c.indexOf(this.a);
        if (indexOf2 == -1) {
            substring = this.c.toString();
        } else {
            substring = this.c.substring(0, indexOf2);
        }
        int length3 = substring.length();
        if (length3 > 1 && substring.charAt(0) == '0' && substring.charAt(1) == '0') {
            return "";
        }
        if (length3 > 1 && substring.charAt(length3 - 2) == this.b && substring.charAt(length3 - 1) == this.b) {
            return "";
        }
        return null;
    }
}
