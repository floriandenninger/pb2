package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azso extends azum implements azty {
    final /* synthetic */ azsv[] a;
    final /* synthetic */ azun b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azso(azsv[] azsvVarArr, azun azunVar) {
        super(2);
        this.a = azsvVarArr;
        this.b = azunVar;
    }

    @Override // defpackage.azty
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((azsf) obj).getClass();
        azsv[] azsvVarArr = this.a;
        azun azunVar = this.b;
        int i = azunVar.a;
        azunVar.a = i + 1;
        azsvVarArr[i] = (azss) obj2;
        return azsf.a;
    }
}
