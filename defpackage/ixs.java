package defpackage;

import android.app.Dialog;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ixs implements aftl {
    final /* synthetic */ ixu a;

    public ixs(ixu ixuVar) {
        this.a = ixuVar;
    }

    @Override // defpackage.aftl
    public final void a() {
        this.a.kv();
    }

    @Override // defpackage.aftl
    public final void b() {
        Dialog dialog = this.a.d;
        if (dialog != null) {
            dialog.show();
            this.a.aJ();
        }
    }

    @Override // defpackage.aftl
    public final void c(Exception exc) {
        this.a.aj.e(exc);
        this.a.kv();
    }
}
