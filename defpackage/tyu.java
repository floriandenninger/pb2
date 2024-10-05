package defpackage;

import android.content.BroadcastReceiver;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface tyu {
    Future a(Callable callable);

    void b(Runnable runnable);

    void c(BroadcastReceiver.PendingResult pendingResult, boolean z, Runnable runnable, twd twdVar);

    void d(Runnable runnable);
}
