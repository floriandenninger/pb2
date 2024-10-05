package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdy extends aaru {
    public String a;

    public abdy(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/get_fix_instrument_params", ajoyVar, afsxVar, null, null, null);
        this.a = "";
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arro.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arro arroVar = (arro) createBuilder.instance;
        str.getClass();
        arroVar.b |= 2;
        arroVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(!TextUtils.isEmpty(this.a));
    }
}
