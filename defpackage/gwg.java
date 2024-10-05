package defpackage;

import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwg {
    public final afsy a;
    public final Executor b;
    public SettableFuture c;
    public boolean d;
    public final wcf e;

    public gwg(afsy afsyVar, wcf wcfVar, Executor executor) {
        this.a = afsyVar;
        this.e = wcfVar;
        this.b = executor;
    }

    public final void a(GalFlowActivity galFlowActivity, gwf gwfVar) {
        if (gwfVar == gwf.PENDING) {
            return;
        }
        galFlowActivity.finish();
        this.c.o(gwfVar);
        this.c = null;
        this.d = false;
    }
}
