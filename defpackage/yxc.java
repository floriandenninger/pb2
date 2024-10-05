package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yxc implements yxe {
    private final axpg a;
    private boolean b = false;
    private final yxd c;
    private final yxj d;

    public yxc(axpg axpgVar, yxd yxdVar, yxj yxjVar) {
        this.a = axpgVar;
        this.c = yxdVar;
        this.d = yxjVar;
    }

    public yxc(Iterable iterable, yxd yxdVar, yxj yxjVar) {
        final amsx o = amsx.o(iterable);
        this.a = new axpg() { // from class: yxb
            @Override // defpackage.axpg
            public final Object get() {
                return o;
            }
        };
        this.c = yxdVar;
        this.d = yxjVar;
    }

    @Override // defpackage.yxe
    public final void a() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                this.b = true;
                Iterable iterable = (Iterable) this.a.get();
                iterable.getClass();
                for (Object obj : iterable) {
                    obj.getClass();
                    this.c.a(obj);
                }
            }
        }
    }

    @Override // defpackage.yxe
    public final void b() {
        if (this.b) {
            synchronized (this) {
                if (this.b) {
                    this.b = false;
                    Iterable iterable = (Iterable) this.a.get();
                    iterable.getClass();
                    for (Object obj : iterable) {
                        obj.getClass();
                        this.d.a(obj);
                    }
                }
            }
        }
    }
}
