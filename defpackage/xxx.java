package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xxx implements View.OnFocusChangeListener {
    final /* synthetic */ xxz a;

    public xxx(xxz xxzVar) {
        this.a = xxzVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        xzt xztVar;
        if (z || (xztVar = this.a.am) == null) {
            return;
        }
        xztVar.c();
    }
}
