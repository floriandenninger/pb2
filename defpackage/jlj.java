package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jlj {
    public final agzj a;
    public final azrw b;
    public final azrw c;
    public final Context d;
    public final Executor e;
    public final Executor f;

    public jlj(agzj agzjVar, azrw azrwVar, azrw azrwVar2, Executor executor, Executor executor2, Context context) {
        this.a = agzjVar;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = context;
        this.e = executor;
        this.f = executor2;
    }

    public static /* synthetic */ void a(Throwable th) {
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Failed to handle the error state.");
        sb.append(valueOf);
        zga.b(sb.toString());
    }

    public final boolean b(agnv agnvVar) {
        try {
            return ((Boolean) ((agpr) this.b.get()).c(agnvVar).get(4L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zga.d("Unable to retrieve if a failed download is retryable.", e);
            if (!(e instanceof InterruptedException)) {
                return false;
            }
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
