package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akec {
    public String a;
    public List b;

    public static final void b(SpannableStringBuilder spannableStringBuilder, String str, boolean z) {
        if (str.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (z) {
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        }
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }
}
