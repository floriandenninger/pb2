package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyx extends LinearLayoutManager {
    final /* synthetic */ gzd a;

    public gyx(gzd gzdVar) {
        this.a = gzdVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final void o(ws wsVar) {
        gzd gzdVar = this.a;
        Runnable runnable = gzdVar.ab;
        if (runnable != null) {
            gzdVar.ab = null;
        } else {
            runnable = null;
        }
        super.o(wsVar);
        if (runnable != null) {
            runnable.run();
        }
    }
}
