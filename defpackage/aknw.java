package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aknw extends aef {
    final /* synthetic */ akny a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aknw(akny aknyVar) {
        super(50);
        this.a = aknyVar;
    }

    @Override // defpackage.aef
    protected final /* bridge */ /* synthetic */ void h(Object obj, Object obj2) {
        this.a.e.addAndGet(-((aknx) obj).c);
    }
}
