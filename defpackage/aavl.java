package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavl extends aaru {
    public String a;

    public aavl(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("connections/get_contact_menu", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = armq.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        armq armqVar = (armq) createBuilder.instance;
        str.getClass();
        armqVar.b |= 2;
        armqVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(!TextUtils.isEmpty(this.a));
    }
}
