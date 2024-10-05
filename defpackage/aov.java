package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aov extends aow {
    private final aba e = new aba();

    @Override // defpackage.aot
    protected final void h() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((aou) ((aaw) ((aay) it).next()).b).b();
        }
    }

    @Override // defpackage.aot
    protected final void i() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((aou) ((aaw) ((aay) it).next()).b).c();
        }
    }

    public final void n(aot aotVar, aox aoxVar) {
        aou aouVar = new aou(aotVar, aoxVar);
        aou aouVar2 = (aou) this.e.b(aotVar, aouVar);
        if (aouVar2 == null || aouVar2.b == aoxVar) {
            if (aouVar2 == null && m()) {
                aouVar.b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }

    public final void o(aot aotVar) {
        aou aouVar = (aou) this.e.c(aotVar);
        if (aouVar != null) {
            aouVar.c();
        }
    }
}
