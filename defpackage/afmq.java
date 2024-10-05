package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afmq implements ajsg {
    final /* synthetic */ afmr a;

    public afmq(afmr afmrVar) {
        this.a = afmrVar;
    }

    @Override // defpackage.ajsg
    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        int indexOf;
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        String obj = this.a.getText().toString();
        int i2 = 0;
        while (i2 < obj.length() && (indexOf = obj.indexOf(spannableStringBuilder2, i2)) >= 0) {
            int length = spannableStringBuilder2.length() + indexOf;
            if (((ImageSpan[]) this.a.getEditableText().getSpans(indexOf, length, ImageSpan.class)).length == 0) {
                this.a.getEditableText().replace(indexOf, length, spannableStringBuilder);
            }
            i2 = indexOf + 1;
        }
    }
}
