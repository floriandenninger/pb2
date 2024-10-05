package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acds implements ajvb {
    final /* synthetic */ acdw a;
    private final ajos b = new ajnq();

    public acds(acdw acdwVar) {
        this.a = acdwVar;
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        if (asra.class.isAssignableFrom(cls)) {
            this.b.f(asps.class, new ajou(this.a.a));
            this.b.f(aspm.class, new ajou(this.a.b));
            this.b.f(aspo.class, new acdr(this, 1));
            this.b.f(asqj.class, new acdr(this, 0));
        }
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.b;
    }
}
