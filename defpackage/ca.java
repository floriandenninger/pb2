package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ca extends aae {
    final /* synthetic */ AtomicReference a;

    public ca(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.aae
    public final void a() {
        throw null;
    }

    @Override // defpackage.aae
    public final void b(Object obj) {
        aae aaeVar = (aae) this.a.get();
        if (aaeVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        aaeVar.b(obj);
    }
}
