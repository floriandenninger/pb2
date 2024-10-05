package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gel extends Handler {
    final /* synthetic */ gem a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gel(gem gemVar, Looper looper) {
        super(looper);
        this.a = gemVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        gem gemVar;
        gen genVar;
        if (message.what != 153535 || (genVar = (gemVar = this.a).c) == null) {
            return;
        }
        ActiveStateLifecycleController activeStateLifecycleController = genVar.a;
        gem gemVar2 = genVar.c;
        get getVar = genVar.b;
        if (activeStateLifecycleController.b.contains(gemVar2)) {
            activeStateLifecycleController.j(gemVar2);
            String valueOf = String.valueOf(gemVar2);
            String valueOf2 = String.valueOf(getVar);
            String.valueOf(valueOf).length();
            String.valueOf(valueOf2).length();
            if (!activeStateLifecycleController.i()) {
                ynm.n(activeStateLifecycleController.d, anaf.T(new gep(activeStateLifecycleController, getVar, 1), activeStateLifecycleController.a), ept.h, ynm.b);
            }
        }
        gemVar.c = null;
    }
}
