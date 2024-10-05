package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amj extends gp {
    private final Reference a;

    public amj(TextView textView) {
        this.a = new WeakReference(textView);
    }

    @Override // defpackage.gp
    public final void h() {
        TextView textView = (TextView) this.a.get();
        if (textView == null || !textView.isAttachedToWindow()) {
            return;
        }
        CharSequence c = alr.b().c(textView.getText());
        int selectionStart = Selection.getSelectionStart(c);
        int selectionEnd = Selection.getSelectionEnd(c);
        textView.setText(c);
        if (c instanceof Spannable) {
            amk.a((Spannable) c, selectionStart, selectionEnd);
        }
    }
}
