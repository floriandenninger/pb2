package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavs extends aaru {
    public arlh a;
    public arlf b;

    public aavs(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("share/send_share", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arld.a.createBuilder();
        arlh arlhVar = this.a;
        if (arlhVar != null) {
            createBuilder.copyOnWrite();
            arld arldVar = (arld) createBuilder.instance;
            arldVar.e = arlhVar;
            arldVar.b |= 16;
        }
        arlf arlfVar = this.b;
        if (arlfVar != null) {
            createBuilder.copyOnWrite();
            arld arldVar2 = (arld) createBuilder.instance;
            arldVar2.d = arlfVar;
            arldVar2.b |= 2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.O(this.a != null, "Only ShareToContacts is allowed to have a missing SharedObjectParams!");
        amkq.N(this.b != null);
    }
}
