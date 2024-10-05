package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fag extends fan {
    final /* synthetic */ fap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fag(fap fapVar, fao faoVar) {
        super(fapVar, faoVar);
        this.a = fapVar;
    }

    @Override // defpackage.fan
    protected final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        aarr aarrVar = this.a.f;
        if (bArr == null) {
            return null;
        }
        return new abci((asay) aarrVar.a(bArr, asay.a));
    }

    @Override // defpackage.fan
    protected final /* synthetic */ byte[] b(Object obj) {
        return ((abci) obj).a.toByteArray();
    }
}
