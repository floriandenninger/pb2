package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymw {
    private final AtomicLong a = new AtomicLong();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j) {
        return this.a.addAndGet(j);
    }
}
