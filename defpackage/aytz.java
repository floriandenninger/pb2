package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytz extends AtomicBoolean implements ayqx {
    private static final long serialVersionUID = 8943152917179642732L;
    final aypi a;
    final /* synthetic */ ayua b;

    public aytz(ayua ayuaVar, aypi aypiVar) {
        this.b = ayuaVar;
        this.a = aypiVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (compareAndSet(false, true)) {
            this.b.W(this);
        }
    }
}
