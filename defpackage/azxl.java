package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azxl extends azxk {
    private final azxo a;
    private final azxm e;
    private final azvy f;
    private final Object g;

    public azxl(azxo azxoVar, azxm azxmVar, azvy azvyVar, Object obj) {
        azxmVar.getClass();
        azvyVar.getClass();
        this.a = azxoVar;
        this.e = azxmVar;
        this.f = azvyVar;
        this.g = obj;
    }

    @Override // defpackage.aztu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return azsf.a;
    }

    @Override // defpackage.azwe
    public final void b(Throwable th) {
        azxo azxoVar = this.a;
        azxm azxmVar = this.e;
        azvy azvyVar = this.f;
        Object obj = this.g;
        boolean z = azwq.a;
        azvy A = azxo.A(azvyVar);
        if (A == null || !azxoVar.y(azxmVar, A, obj)) {
            azxoVar.o(azxmVar, obj);
            azxoVar.g();
        }
    }
}
