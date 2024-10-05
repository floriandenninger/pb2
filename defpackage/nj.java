package defpackage;

import android.view.Menu;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nj implements Runnable {
    final /* synthetic */ no a;

    public nj(no noVar) {
        this.a = noVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        no noVar = this.a;
        Menu D = noVar.D();
        Menu menu = true != (D instanceof qq) ? null : D;
        if (menu != null) {
            ((qq) menu).s();
        }
        try {
            D.clear();
            if (!noVar.c.onCreatePanelMenu(0, D) || !noVar.c.onPreparePanel(0, null, D)) {
                D.clear();
            }
            if (menu != null) {
                ((qq) menu).r();
            }
        } catch (Throwable th) {
            if (menu != null) {
                ((qq) menu).r();
            }
            throw th;
        }
    }
}
