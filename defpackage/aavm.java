package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavm extends aaru {
    public String a;

    public aavm(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("conversation/get", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arkx.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            arkx arkxVar = (arkx) createBuilder.instance;
            arkxVar.b |= 16;
            arkxVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        boolean z = true;
        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(this.a)) {
            z = false;
        }
        amkq.N(z);
    }
}
