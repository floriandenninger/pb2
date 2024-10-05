package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almw implements View.OnFocusChangeListener {
    final /* synthetic */ alnf a;

    public almw(alnf alnfVar) {
        this.a = alnfVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.k.l.setActivated(z);
        if (z) {
            return;
        }
        this.a.d(false);
        this.a.d = false;
    }
}
