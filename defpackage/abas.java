package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abas extends aaru {
    private String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public abas(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("playlist/get_settings_editor", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arzm.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arzm arzmVar = (arzm) createBuilder.instance;
        str.getClass();
        arzmVar.b |= 2;
        arzmVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(!TextUtils.isEmpty(this.a));
    }

    public final void d(String str) {
        this.a = i(str);
    }
}
