package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaym extends aaru {
    public String a;

    public aaym(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live/get_broadcast_participant_setup", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arqn.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            arqn arqnVar = (arqn) createBuilder.instance;
            arqnVar.b |= 2;
            arqnVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
