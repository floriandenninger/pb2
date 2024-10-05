package defpackage;

import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nl implements rd {
    final /* synthetic */ no a;
    private boolean b;

    public nl(no noVar) {
        this.a = noVar;
    }

    @Override // defpackage.rd
    public final void a(qq qqVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a.g();
        Window.Callback callback = this.a.c;
        if (callback != null) {
            callback.onPanelClosed(108, qqVar);
        }
        this.b = false;
    }

    @Override // defpackage.rd
    public final boolean b(qq qqVar) {
        Window.Callback callback = this.a.c;
        if (callback == null) {
            return false;
        }
        callback.onMenuOpened(108, qqVar);
        return true;
    }
}
