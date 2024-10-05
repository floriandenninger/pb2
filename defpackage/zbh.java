package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbh extends akk {
    private final TextView f;
    private final Rect g;

    public zbh(TextView textView) {
        super(textView);
        this.g = new Rect();
        this.f = textView;
    }

    private final ClickableSpan w(int i) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }

    private final CharSequence x(ClickableSpan clickableSpan) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    @Override // defpackage.akk
    protected final int k(float f, float f2) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        Spanned spanned = (Spanned) text;
        TextView textView = this.f;
        int offsetForHorizontal = textView.getLayout() != null ? textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((textView.getHeight() - textView.getTotalPaddingBottom()) - 1, Math.max(0.0f, f2 - textView.getTotalPaddingTop())) + textView.getScrollY())), Math.min((textView.getWidth() - textView.getTotalPaddingRight()) - 1, Math.max(0.0f, f - textView.getTotalPaddingLeft())) + textView.getScrollX()) : -1;
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        return clickableSpanArr.length == 1 ? spanned.getSpanStart(clickableSpanArr[0]) : CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    @Override // defpackage.akk
    protected final void m(List list) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.akk
    protected final void p(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan w = w(i);
        if (w != null) {
            accessibilityEvent.setContentDescription(x(w));
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        accessibilityEvent.setContentDescription(this.f.getText());
    }

    @Override // defpackage.akk
    protected final void q(int i, ks ksVar) {
        Layout layout;
        ClickableSpan w = w(i);
        if (w != null) {
            ksVar.v(x(w));
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("LinkSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            ksVar.v(this.f.getText());
        }
        ksVar.y(true);
        ksVar.s(true);
        Rect rect = this.g;
        CharSequence text = this.f.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = this.f.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(w);
            int spanEnd = spanned.getSpanEnd(w);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 == lineForOffset) {
                rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
            } else if (layout.getParagraphDirection(lineForOffset) == -1) {
                rect.right = (int) primaryHorizontal;
            } else {
                rect.left = (int) primaryHorizontal;
            }
            rect.offset(this.f.getTotalPaddingLeft(), this.f.getTotalPaddingTop());
        }
        if (this.g.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("LinkSpan bounds is empty for: ");
            sb2.append(i);
            Log.e("LinkAccessibilityHelper", sb2.toString());
            this.g.set(0, 0, 1, 1);
        }
        ksVar.n(this.g);
        ksVar.h(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akk
    public final boolean u(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ClickableSpan w = w(i);
        if (w != null) {
            w.onClick(this.f);
            return true;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        return false;
    }
}
