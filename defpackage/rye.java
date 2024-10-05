package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rye implements Iterable {
    final /* synthetic */ ryg a;
    private final ryv b;

    public rye(ryg rygVar, ryv ryvVar) {
        this.a = rygVar;
        this.b = ryvVar;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ryf iterator() {
        ryf ryfVar = new ryf(this.a, ((Double) this.b.a).longValue(), ((Double) this.b.b).longValue());
        ryfVar.b(1);
        return ryfVar;
    }
}
