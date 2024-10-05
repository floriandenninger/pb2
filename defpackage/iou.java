package defpackage;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iou implements SpanWatcher {
    final /* synthetic */ iox a;

    public iou(iox ioxVar) {
        this.a = ioxVar;
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        iox ioxVar = this.a;
        if (ioxVar.l != null) {
            Editable text = ioxVar.b.getText();
            int spanStart = text.getSpanStart(this.a.l);
            int spanEnd = text.getSpanEnd(this.a.l);
            int selectionStart = this.a.b.getSelectionStart();
            int selectionEnd = this.a.b.getSelectionEnd();
            if (selectionStart < spanStart || selectionEnd < spanStart || selectionStart > spanEnd || selectionEnd > spanEnd) {
                this.a.b();
            }
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }
}
