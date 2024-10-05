package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azmg extends AtomicBoolean implements ayqx {
    private static final long serialVersionUID = 7514387411091976596L;
    final ayqk a;
    final azmh b;

    public azmg(ayqk ayqkVar, azmh azmhVar) {
        this.a = ayqkVar;
        this.b = azmhVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (compareAndSet(false, true)) {
            this.b.ab(this);
        }
    }
}
