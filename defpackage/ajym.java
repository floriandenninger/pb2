package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajym implements ajsg {
    final /* synthetic */ ajyo a;

    public ajym(ajyo ajyoVar) {
        this.a = ajyoVar;
    }

    @Override // defpackage.ajsg
    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        int indexOf;
        if (this.a.g != null) {
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            String obj = this.a.g.getText().toString();
            Editable editableText = this.a.g.getEditableText();
            int i2 = 0;
            while (i2 < obj.length() && (indexOf = obj.indexOf(spannableStringBuilder2, i2)) >= 0) {
                int length = spannableStringBuilder2.length() + indexOf;
                if (((ImageSpan[]) editableText.getSpans(indexOf, length, ImageSpan.class)).length == 0) {
                    editableText.replace(indexOf, length, spannableStringBuilder);
                }
                i2 = indexOf + 1;
            }
        }
    }
}
