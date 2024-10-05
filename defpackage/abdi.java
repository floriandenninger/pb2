package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdi extends aaru {
    private final ascn a;

    public abdi(ajoy ajoyVar, afsx afsxVar, ascn ascnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("get_transcript", ajoyVar, afsxVar, null, null, null);
        this.a = ascnVar;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        return this.a.toBuilder();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(!this.a.d.isEmpty());
    }
}
