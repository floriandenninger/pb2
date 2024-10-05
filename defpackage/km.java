package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class km extends kl {
    static final ko c = ko.q(WindowInsets.CONSUMED);

    public km(ko koVar, WindowInsets windowInsets) {
        super(koVar, windowInsets);
    }

    @Override // defpackage.ki, defpackage.kn
    public final void c(View view) {
    }

    @Override // defpackage.ki, defpackage.kn
    public final boolean g() {
        return this.a.isVisible(hp.c(8));
    }

    @Override // defpackage.ki, defpackage.kn
    public final fn i() {
        return fn.e(this.a.getInsets(hp.c(7)));
    }
}
