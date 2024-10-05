package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayq extends aaru {
    public String a;
    public avwv b;

    public aayq(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live/get_confirm_broadcast_setup", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arrm.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            arrm arrmVar = (arrm) createBuilder.instance;
            str.getClass();
            arrmVar.b |= 4;
            arrmVar.e = str;
        }
        avwv avwvVar = this.b;
        if (avwvVar != null) {
            createBuilder.copyOnWrite();
            arrm arrmVar2 = (arrm) createBuilder.instance;
            arrmVar2.d = avwvVar;
            arrmVar2.b |= 2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
