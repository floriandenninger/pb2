package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tdo implements Future {
    final /* synthetic */ tdp a;

    public tdo(tdp tdpVar) {
        this.a = tdpVar;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized Integer get() {
        if (this.a.b == null) {
            wait();
        }
        return this.a.b;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Integer get(long j, TimeUnit timeUnit) {
        if (this.a.b == null) {
            wait(timeUnit.toMillis(j));
        }
        return this.a.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.a.b != null;
    }
}
