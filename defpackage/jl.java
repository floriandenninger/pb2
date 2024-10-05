package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jl implements View.OnApplyWindowInsetsListener {
    ko a = null;
    final /* synthetic */ View b;
    final /* synthetic */ iw c;

    public jl(View view, iw iwVar) {
        this.b = view;
        this.c = iwVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ko r = ko.r(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            jm.h(windowInsets, this.b);
            if (r.equals(this.a)) {
                return this.c.a(view, r).s();
            }
        }
        this.a = r;
        ko a = this.c.a(view, r);
        if (Build.VERSION.SDK_INT >= 30) {
            return a.s();
        }
        jw.K(view);
        return a.s();
    }
}
