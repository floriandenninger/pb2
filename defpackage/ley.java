package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ley implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ lfa b;

    public ley(lfa lfaVar, TextView textView) {
        this.b = lfaVar;
        this.a = textView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int lineCount = this.a.getLineCount();
        lfa lfaVar = this.b;
        if (lineCount != lfaVar.z || !lfaVar.f) {
            return true;
        }
        lfaVar.e.b();
        return true;
    }
}
