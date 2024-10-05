package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bahu {
    final bair a;
    final Executor b;
    final Executor c;
    final /* synthetic */ bahx d;

    public bahu(bahx bahxVar, UrlRequest.Callback callback, Executor executor) {
        this.d = bahxVar;
        this.a = new bair(callback);
        if (bahxVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new baia(executor);
            this.c = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bahy bahyVar) {
        try {
            this.b.execute(new bahn(this.d, bahyVar, 2));
        } catch (RejectedExecutionException e) {
            this.d.e(new bagf("Exception posting task to executor", e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        a(new bahq(this));
    }
}
