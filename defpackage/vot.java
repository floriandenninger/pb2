package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vot extends vnj {
    public final aov a;
    public final vmq b;

    public vot(vmq vmqVar) {
        aov aovVar = new aov();
        this.a = aovVar;
        this.b = vmqVar;
        aovVar.n(vmqVar.e, new aox() { // from class: vos
            @Override // defpackage.aox
            public final void a(Object obj) {
                vot.this.a.j((vmr) obj);
            }
        });
    }

    @Override // defpackage.vnj
    public final void a(int i) {
        this.b.a(i);
    }
}
