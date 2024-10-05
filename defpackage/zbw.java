package defpackage;

import java.util.Observable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbw extends Observable {
    private long a = -1;
    private final shf b;

    public zbw(shf shfVar) {
        this.b = shfVar;
    }

    public final long a() {
        if (this.a == -1) {
            return -1L;
        }
        return this.b.d() - this.a;
    }

    public final void b() {
        this.a = this.b.d();
        setChanged();
        notifyObservers(Long.valueOf(this.a));
    }
}
