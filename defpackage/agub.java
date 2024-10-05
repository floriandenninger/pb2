package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agub implements Executor {
    final /* synthetic */ agud a;
    private final Handler b;

    public agub(agud agudVar) {
        this.a = agudVar;
        this.b = new Handler(agudVar.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
