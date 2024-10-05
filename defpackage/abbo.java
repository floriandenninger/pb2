package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abbo extends aaru {
    public String a;

    public abbo(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("flag/get_form", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arzp.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            arzp arzpVar = (arzp) createBuilder.instance;
            str.getClass();
            arzpVar.b |= 2;
            arzpVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        if (ammx.e(this.a)) {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 62 + "null".length());
            sb.append("Exactly one of params (");
            sb.append(str);
            sb.append(") or clientSideParams (");
            sb.append("null");
            sb.append(") has to be set.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
