package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vqq extends vnl {
    private final aov a;
    private final vna b;

    public vqq(vna vnaVar) {
        final aov aovVar = new aov();
        this.a = aovVar;
        this.b = vnaVar;
        aovVar.n(vnaVar.a(), new aox() { // from class: vqp
            @Override // defpackage.aox
            public final void a(Object obj) {
                aov.this.j((vnb) obj);
            }
        });
    }

    @Override // defpackage.vnl
    public final aot a() {
        return this.a;
    }

    @Override // defpackage.vnl
    public final void b(int i) {
        this.b.b(i);
    }

    @Override // defpackage.vnl
    public final void c() {
        this.b.a.c();
    }
}
