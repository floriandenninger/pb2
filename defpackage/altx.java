package defpackage;

import android.os.Build;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class altx implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ alty b;

    public altx(alty altyVar, TextView textView) {
        this.b = altyVar;
        this.a = textView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int lineCount = this.a.getLineCount();
        alty altyVar = this.b;
        if (lineCount <= altyVar.e) {
            return true;
        }
        this.a.setTextSize(0, altyVar.c);
        if (Build.VERSION.SDK_INT >= 28) {
            TextView textView = this.a;
            alty altyVar2 = this.b;
            textView.setLineHeight(Math.round(altyVar2.d + altyVar2.c));
        }
        this.a.invalidate();
        return false;
    }
}
