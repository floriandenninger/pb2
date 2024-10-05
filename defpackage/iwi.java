package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iwi implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ iwn a;

    public iwi(iwn iwnVar) {
        this.a = iwnVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.ag = windowInsets.getSystemWindowInsetTop();
        return windowInsets;
    }
}
