package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcc extends aaru {
    public String a;
    public String b;
    public boolean c;

    public abcc(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("suggest", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        aone createBuilder = asab.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            asab asabVar = (asab) createBuilder.instance;
            asabVar.b |= 2;
            asabVar.d = str;
        }
        boolean z = this.c;
        createBuilder.copyOnWrite();
        asab asabVar2 = (asab) createBuilder.instance;
        asabVar2.b |= 16;
        asabVar2.f = z;
        if (TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(this.b)) {
                String str2 = this.b;
                createBuilder.copyOnWrite();
                asab asabVar3 = (asab) createBuilder.instance;
                str2.getClass();
                asabVar3.b |= 8;
                asabVar3.e = str2;
            }
            return createBuilder;
        }
        createBuilder.copyOnWrite();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        String str = this.a;
        str.getClass();
        boolean z = true;
        if (this.c && !TextUtils.isEmpty(str)) {
            z = false;
        }
        amkq.E(z);
    }
}
