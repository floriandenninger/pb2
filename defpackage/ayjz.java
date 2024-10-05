package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayjz implements Executor {
    final /* synthetic */ aykx a;

    public ayjz(aykx aykxVar) {
        this.a = aykxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.m.a().execute(runnable);
    }
}
