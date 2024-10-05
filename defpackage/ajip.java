package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ajip {
    private final AtomicReference a;

    public ajip(ayue ayueVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        atomicReference.set(ayueVar);
    }

    public final boolean a() {
        return this.a.get() == null;
    }

    public final ayue b() {
        ayue ayueVar = (ayue) this.a.getAndSet(null);
        if (ayueVar != null) {
            return ayueVar;
        }
        throw new syf("ElementCallback was already consumed");
    }
}
