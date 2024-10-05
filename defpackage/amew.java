package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amew implements Runnable {
    public final /* synthetic */ anhy a;
    private final /* synthetic */ int b;

    public /* synthetic */ amew(anhy anhyVar, int i) {
        this.b = i;
        this.a = anhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            amex.b(this.a);
            return;
        }
        if (i == 1) {
            try {
                anaf.W(this.a);
                return;
            } catch (ExecutionException e) {
                uqq.l(new Runnable() { // from class: uwp
                    @Override // java.lang.Runnable
                    public final void run() {
                        throw new RuntimeException(e.getCause());
                    }
                });
                return;
            }
        }
        if (i == 2) {
            amex.b(this.a);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                amgd.i(this.a);
                return;
            } else {
                amgd.k(this.a);
                return;
            }
        }
        try {
            anaf.W(this.a);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof alzj) {
                ((amxh) ((amxh) ((amxh) amex.a.f()).h(e2)).i("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "lambda$crashOnException$4", (char) 269, "IntentFilterAcledReceiver.java")).q("Got unexpected accountId. Was the account removed?");
            } else {
                if (e2.getCause() instanceof TimeoutException) {
                    throw amjq.a(e2.getCause());
                }
                amjq.d(e2.getCause());
            }
        } catch (Throwable th) {
            amjq.d(th);
        }
    }
}
