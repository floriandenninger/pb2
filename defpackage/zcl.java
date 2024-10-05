package defpackage;

import android.content.ActivityNotFoundException;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zcl extends LinkMovementMethod {
    private static zcl a;

    private zcl() {
    }

    public static MovementMethod a() {
        if (a == null) {
            a = new zcl();
        }
        return a;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX();
            int scrollY = textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) y) - totalPaddingTop) + scrollY), (((int) x) - totalPaddingLeft) + scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length > 0) {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                YouTubeTextView youTubeTextView = (YouTubeTextView) textView;
                if (youTubeTextView.h && (clickableSpan instanceof zbr)) {
                    zbr zbrVar = (zbr) clickableSpan;
                    if (actionMasked == 0) {
                        zbrVar.b = youTubeTextView.i;
                    } else {
                        zbrVar.b = 0;
                    }
                    youTubeTextView.invalidate();
                }
                if (actionMasked == 0) {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
                } else {
                    Selection.removeSelection(spannable);
                    try {
                        clickableSpan.onClick(youTubeTextView);
                    } catch (ActivityNotFoundException unused) {
                        zga.l("Activity was not found for browser intent.");
                    }
                }
                youTubeTextView.g = true;
                return true;
            }
            Selection.removeSelection(spannable);
            Touch.onTouchEvent(textView, spannable, motionEvent);
            return false;
        }
        return Touch.onTouchEvent(textView, spannable, motionEvent);
    }
}
