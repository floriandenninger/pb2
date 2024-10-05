package defpackage;

import j$.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajti {
    public static final ajti a = new ajti(ghx.o);
    public final azqw b = azqv.aq(0).av();
    private final Supplier c;

    public ajti(Supplier supplier) {
        this.c = supplier;
        b();
    }

    public final int a() {
        return ((Integer) this.c.get()).intValue();
    }

    public final void b() {
        this.b.c((Integer) this.c.get());
    }
}
