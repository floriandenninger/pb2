package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fal extends fan {
    final /* synthetic */ fap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fal(fap fapVar, fao faoVar) {
        super(fapVar, faoVar);
        this.a = fapVar;
    }

    @Override // defpackage.fan
    protected final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return (arjv) this.a.f.a(bArr, arjv.a);
    }

    @Override // defpackage.fan
    protected final /* synthetic */ byte[] b(Object obj) {
        return ((arjv) obj).toByteArray();
    }
}
