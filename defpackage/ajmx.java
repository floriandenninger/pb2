package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajmx implements ajng {
    private final ajmw a = new ajmw();
    public final yot c = new yot();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(int i, int i2) {
        yjk.f();
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            ((yoq) it.next()).e(i, i2);
        }
    }

    @Override // defpackage.ajng
    public final void lX(ajnf ajnfVar) {
        this.c.e(ajnfVar);
    }

    @Override // defpackage.ajng
    public void mK(ajol ajolVar) {
        this.a.b(ajolVar);
    }

    @Override // defpackage.ajng
    public void mL(ajok ajokVar, int i) {
        this.a.a(ajokVar, this, i);
    }

    @Override // defpackage.ajng
    public final void pf(ajnf ajnfVar) {
        this.c.f(ajnfVar);
    }

    public final void v() {
        yjk.f();
        this.c.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(int i) {
        x(i, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i, int i2) {
        yjk.f();
        this.c.a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(int i, int i2) {
        yjk.f();
        this.c.b(i, i2);
    }

    public final void z(int i, int i2) {
        yjk.f();
        this.c.c(i, i2);
    }
}
