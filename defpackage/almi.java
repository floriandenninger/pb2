package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almi implements View.OnFocusChangeListener {
    final /* synthetic */ almq a;

    public almi(almq almqVar) {
        this.a = almqVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        almq almqVar = this.a;
        almqVar.a(almqVar.d());
    }
}
