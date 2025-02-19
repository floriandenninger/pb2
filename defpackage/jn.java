package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.media.MediaRouter;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jn {
    public jn() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }

    public static final ik b(View view, ik ikVar) {
        CharSequence coerceToStyledText;
        if (ikVar.a.b() == 2) {
            return ikVar;
        }
        ClipData c = ikVar.a.c();
        int a = ikVar.a.a();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < c.getItemCount(); i++) {
            ClipData.Item itemAt = c.getItemAt(i);
            if ((a & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
                z = true;
            }
        }
        return null;
    }

    public static void c(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    public static Object d(Object obj) {
        return ((MediaRouter) obj).getSelectedRoute(8388611);
    }

    public jn(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
