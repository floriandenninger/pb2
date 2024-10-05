package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azom implements Future {
    final ayqx a;

    public azom(ayqx ayqxVar) {
        this.a = ayqxVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.a.qc();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }
}
