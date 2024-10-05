package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dam implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ dan b;

    public dam(dan danVar, View view) {
        this.b = danVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ddn.k(new dal(this, this));
    }
}
