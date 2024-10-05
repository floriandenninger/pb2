package defpackage;

import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbw implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ TextView b;

    public kbw(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Layout layout = this.a.getLayout();
        if (layout == null || layout.getLineCount() == 0 || layout.getEllipsisCount(0) == 0) {
            return;
        }
        String[] split = this.a.getText().toString().split(" • ");
        if (split.length == 2) {
            this.a.setText(split[0]);
            whu.G(this.b, split[1]);
            this.a.requestLayout();
            this.b.requestLayout();
        }
    }
}
