package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aava extends aaru {
    private final afsy a;
    public String c;

    /* JADX INFO: Access modifiers changed from: protected */
    public aava(ajoy ajoyVar, afsy afsyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("channel_edit/update_channel_page_settings", ajoyVar, afsyVar.c(), null, null, null);
        this.a = afsyVar;
        k();
    }

    @Override // defpackage.aaru
    public /* bridge */ /* synthetic */ aoox a() {
        throw null;
    }

    @Override // defpackage.aaqh
    public void c() {
        amkq.N(this.a.t());
        zhq.m(this.c);
    }

    public final aone d() {
        aone createBuilder = ascw.a.createBuilder();
        String str = this.c;
        createBuilder.copyOnWrite();
        ascw ascwVar = (ascw) createBuilder.instance;
        str.getClass();
        ascwVar.b |= 2;
        ascwVar.d = str;
        return createBuilder;
    }
}
