package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afvu implements ykl {
    final /* synthetic */ afvv a;
    private final ykl b;

    public afvu(afvv afvvVar, ykl yklVar) {
        this.a = afvvVar;
        this.b = yklVar;
    }

    @Override // defpackage.ykl
    public final void a(Object obj, Exception exc) {
        this.b.a(obj, exc);
    }

    @Override // defpackage.ykl
    public final void b(Object obj, Object obj2) {
        afvv afvvVar = this.a;
        afvvVar.a.d(obj, new afpz(obj2, afvvVar.b.c()));
        this.b.b(obj, obj2);
    }
}
