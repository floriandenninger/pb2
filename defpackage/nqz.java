package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nqz {
    public final AtomicReference a = new AtomicReference();

    public final void a(nqp nqpVar) {
        this.a.set(new WeakReference(nqpVar));
    }
}
