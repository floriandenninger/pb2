package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class by implements abb {
    final /* synthetic */ ce a;

    public by(ce ceVar) {
        this.a = ceVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aak, co] */
    @Override // defpackage.abb
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ce ceVar = this.a;
        ?? r0 = ceVar.A;
        if (r0 instanceof aak) {
            return r0.getActivityResultRegistry();
        }
        return ceVar.D().getActivityResultRegistry();
    }
}
