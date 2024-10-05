package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nnl extends ej implements fxi {
    private final dd a;
    private uyt b = null;

    public nnl(dd ddVar) {
        this.a = ddVar;
    }

    private final void s() {
        uyt uytVar = this.b;
        if (uytVar == null || !uytVar.av()) {
            return;
        }
        this.b.kv();
    }

    @Override // defpackage.fxi
    public final void a() {
        s();
        this.b = null;
        cs csVar = this.a.j;
        synchronized (csVar.a) {
            int size = csVar.a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((cr) csVar.a.get(i)).b == this) {
                    csVar.a.remove(i);
                    break;
                }
                i++;
            }
        }
    }

    @Override // defpackage.fxi
    public final void b() {
        this.a.ai(this, true);
    }

    @Override // defpackage.ej
    public final void g(ce ceVar) {
        if (ceVar instanceof uyt) {
            s();
            this.b = (uyt) ceVar;
        }
    }
}
