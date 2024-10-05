package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abec extends aaru {
    public String a;
    public aomf b;

    public abec(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/get_payment_instruments_params", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        this.b = aomf.b;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arru.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            arru arruVar = (arru) createBuilder.instance;
            str.getClass();
            arruVar.b |= 2;
            arruVar.d = str;
        }
        aomf aomfVar = this.b;
        if (aomfVar != null && !aomfVar.H()) {
            aomf aomfVar2 = this.b;
            createBuilder.copyOnWrite();
            arru arruVar2 = (arru) createBuilder.instance;
            aomfVar2.getClass();
            arruVar2.b |= 4;
            arruVar2.e = aomfVar2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(!TextUtils.isEmpty(this.a));
    }
}
