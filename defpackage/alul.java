package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alul extends LinkMovementMethod {
    public boolean a = false;
    public MotionEvent b;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.b = motionEvent;
        boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.a = Selection.getSelectionStart(spannable) != -1;
        } else {
            this.a = onTouchEvent;
        }
        return onTouchEvent;
    }
}
