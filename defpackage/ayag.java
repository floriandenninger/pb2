package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayag {
    static final ayah a;

    static {
        ayah aydiVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            aydiVar = (ayah) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(ayah.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            aydiVar = new aydi();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = aydiVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            ayai.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
