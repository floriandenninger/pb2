package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdj extends aaru {
    public String a;
    public String b;

    public abdj(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("updated_metadata", ajoyVar, afsxVar, null, null, null);
        m(aaef.b);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asdc.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asdc asdcVar = (asdc) createBuilder.instance;
        asdcVar.b |= 4;
        asdcVar.e = i(str);
        String str2 = this.b;
        createBuilder.copyOnWrite();
        asdc asdcVar2 = (asdc) createBuilder.instance;
        asdcVar2.b |= 2;
        asdcVar2.d = i(str2);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        if (!TextUtils.isEmpty(this.b)) {
            amkq.N(TextUtils.isEmpty(this.a));
        }
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        amkq.N(TextUtils.isEmpty(this.b));
    }
}
