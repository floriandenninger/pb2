package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaun extends aaru {
    public byte[] a;
    public boolean b;
    public int c;

    public aaun(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("channel/get_channel_creation_form", ajoyVar, afsxVar, null, null, null);
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N((((arkv) a().instance).b & 2) != 0);
    }

    @Override // defpackage.aaru
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = arkv.a.createBuilder();
        int i = this.c;
        createBuilder.copyOnWrite();
        arkv arkvVar = (arkv) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            arkvVar.e = i2;
            arkvVar.b |= 4;
            byte[] bArr = this.a;
            if (bArr != null) {
                aomf x = aomf.x(bArr);
                createBuilder.copyOnWrite();
                arkv arkvVar2 = (arkv) createBuilder.instance;
                arkvVar2.b |= 2;
                arkvVar2.d = x;
            }
            boolean z = this.b;
            createBuilder.copyOnWrite();
            arkv arkvVar3 = (arkv) createBuilder.instance;
            arkvVar3.b |= 32;
            arkvVar3.f = z;
            return createBuilder;
        }
        throw null;
    }
}
