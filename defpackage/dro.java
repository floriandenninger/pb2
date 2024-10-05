package defpackage;

import android.view.ViewTreeObserver;
import com.facebook.litho.widget.LithoScrollView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dro implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ LithoScrollView a;
    final /* synthetic */ ajbh b;

    public dro(LithoScrollView lithoScrollView, ajbh ajbhVar, byte[] bArr, byte[] bArr2) {
        this.a = lithoScrollView;
        this.b = ajbhVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.setScrollY(this.b.i);
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
