package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abaq extends aaru {
    public String a;

    public abaq(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("playlist/delete", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arzh.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arzh arzhVar = (arzh) createBuilder.instance;
        str.getClass();
        arzhVar.b |= 2;
        arzhVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(!TextUtils.isEmpty(this.a));
    }
}
