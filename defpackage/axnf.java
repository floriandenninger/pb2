package defpackage;

import android.os.Looper;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axnf extends aypy {
    private final View a;

    public axnf(View view) {
        this.a = view;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ayqdVar.se(aynu.d());
            ayqdVar.b(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
            return;
        }
        axne axneVar = new axne(this.a, ayqdVar);
        ayqdVar.se(axneVar);
        this.a.setOnClickListener(axneVar);
    }
}
