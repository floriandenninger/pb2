package defpackage;

import android.content.ContextWrapper;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class altv extends ClickableSpan {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        altt alttVar;
        if (view instanceof altu) {
            ((altu) view).a();
        }
        Object context = view.getContext();
        while (true) {
            if (!(context instanceof altt)) {
                if (!(context instanceof ContextWrapper)) {
                    alttVar = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                alttVar = (altt) context;
                break;
            }
        }
        if (alttVar == null) {
            Log.w("LinkSpan", "Dropping click event. No listener attached.");
        } else {
            alttVar.a();
            view.cancelPendingInputEvents();
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text instanceof Spannable) {
                Selection.setSelection((Spannable) text, 0);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
