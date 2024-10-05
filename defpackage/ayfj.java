package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfj implements ayjt {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.ayjt
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
