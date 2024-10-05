package defpackage;

import com.google.android.apps.youtube.app.ui.WatchUpsellDialogController;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lyt implements agzm {
    final /* synthetic */ lyu a;

    public lyt(lyu lyuVar) {
        this.a = lyuVar;
    }

    @Override // defpackage.agzm
    public final void a() {
        lyu lyuVar = this.a;
        WatchUpsellDialogController watchUpsellDialogController = lyuVar.b;
        if (!watchUpsellDialogController.b) {
            watchUpsellDialogController.a.b();
        } else {
            lyuVar.a.b(watchUpsellDialogController.c);
            this.a.b.c = null;
        }
    }

    @Override // defpackage.agzm
    public final void b() {
    }
}
