package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vqh extends vnl {
    public final aov a;
    private final vms b;

    public vqh(vms vmsVar) {
        aov aovVar = new aov();
        this.a = aovVar;
        this.b = vmsVar;
        aovVar.n(vmsVar.a(), new aox() { // from class: vqg
            @Override // defpackage.aox
            public final void a(Object obj) {
                vqh.this.a.j((vnb) obj);
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
