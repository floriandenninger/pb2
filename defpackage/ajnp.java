package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajnp extends ajmx {
    public final ajng a;
    public final ammy b;
    public final ArrayList d;
    private final ajno e;

    public ajnp(ajng ajngVar, ammy ammyVar) {
        ajngVar.getClass();
        this.a = ajngVar;
        ammyVar.getClass();
        this.b = ammyVar;
        this.d = new ArrayList();
        ajno ajnoVar = new ajno(this);
        this.e = ajnoVar;
        ajngVar.lX(ajnoVar);
    }

    @Override // defpackage.ajng
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.ajng
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.ajng
    public final Object c(int i) {
        return this.a.c(((Integer) this.d.get(i)).intValue());
    }

    @Override // defpackage.ajng
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.ajng
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // defpackage.ajmx, defpackage.ajng
    public final void mK(ajol ajolVar) {
        this.a.mK(ajolVar);
    }

    @Override // defpackage.ajmx, defpackage.ajng
    public final void mL(ajok ajokVar, int i) {
        this.a.mL(ajokVar, yjk.A(i, 0, a()) ? ((Integer) this.d.get(i)).intValue() : -1);
    }
}
