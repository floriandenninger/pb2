package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddr implements hy {
    private final ddq a;
    private final ddt b;
    private final hy c;

    public ddr(hy hyVar, ddq ddqVar, ddt ddtVar) {
        this.c = hyVar;
        this.a = ddqVar;
        this.b = ddtVar;
    }

    @Override // defpackage.hy
    public final Object a() {
        Object a = this.c.a();
        if (a == null) {
            a = this.a.a();
        }
        if (a instanceof dds) {
            ((dds) a).f().a = false;
        }
        return a;
    }

    @Override // defpackage.hy
    public final boolean b(Object obj) {
        if (obj instanceof dds) {
            ((dds) obj).f().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
