package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyy implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Context b;

    public tyy(Runnable runnable, Context context) {
        this.a = runnable;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChimeExecutorApiService.a.add(this.a);
        Intent intent = new Intent(this.b, (Class<?>) ChimeExecutorApiService.class);
        intent.setAction("ACTION_NEW_TASK");
        this.b.startService(intent);
    }
}
