package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajsi implements InputFilter {
    private final TextView a;
    private final float b;
    private final int c;

    public ajsi(TextView textView, float f, int i) {
        this.a = textView;
        this.b = f;
        this.c = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode() || charSequence == null || i == i2) {
            return null;
        }
        if (i == 0) {
            if (i2 != charSequence.length()) {
                i = 0;
            }
            return ajsm.a(charSequence, 0, charSequence.length(), this.b, this.c);
        }
        charSequence = charSequence.subSequence(i, i2);
        return ajsm.a(charSequence, 0, charSequence.length(), this.b, this.c);
    }
}
