package defpackage;

import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class etk implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ aqbj a;
    final /* synthetic */ TextView b;
    final /* synthetic */ zbx c;

    public etk(aqbj aqbjVar, TextView textView, zbx zbxVar) {
        this.a = aqbjVar;
        this.b = textView;
        this.c = zbxVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (etl.r(this.a) == null) {
            return true;
        }
        this.b.setBackground(null);
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        int K = yjk.K(displayMetrics, 2);
        this.c.b(yjk.K(displayMetrics, 6), K, zbx.a(this.b.getTextSize() * this.b.getLineCount(), K) + yjk.K(displayMetrics, 4), K);
        this.b.setBackground(this.c);
        return true;
    }
}
