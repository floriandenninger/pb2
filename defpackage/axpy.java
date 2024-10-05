package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axpy implements axqk {
    private volatile Object a;
    private final Object b = new Object();
    private final ega c;

    public axpy(ega egaVar) {
        this.c = egaVar;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    ega egaVar = this.c;
                    eee m = efz.m();
                    m.a = new axqi(egaVar.a);
                    ayaw.j(m.a, axqi.class);
                    if (m.i == null) {
                        m.i = new aear();
                    }
                    if (m.b == null) {
                        m.b = new etx();
                    }
                    if (m.j == null) {
                        m.j = new adyu();
                    }
                    if (m.h == null) {
                        m.h = new whl();
                    }
                    if (m.k == null) {
                        m.k = new adyu();
                    }
                    if (m.f == null) {
                        m.f = new wbs();
                    }
                    if (m.g == null) {
                        m.g = new aedn();
                    }
                    if (m.d == null) {
                        m.d = new yny();
                    }
                    if (m.c == null) {
                        m.c = new ahbn();
                    }
                    if (m.e == null) {
                        m.e = new wbs();
                    }
                    this.a = new efz(m.a);
                }
            }
        }
        return this.a;
    }
}
