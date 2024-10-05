package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iie implements ajvb {
    final /* synthetic */ ajos a;
    final /* synthetic */ ajoq b;

    public iie(ajos ajosVar, ajoq ajoqVar) {
        this.a = ajosVar;
        this.b = ajoqVar;
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        if (atda.class.isAssignableFrom(cls)) {
            this.a.f(atda.class, this.b);
        }
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.a;
    }
}
