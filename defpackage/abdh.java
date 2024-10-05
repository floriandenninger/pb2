package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdh extends aaru {
    public String a;
    public String b;
    public int c;

    public abdh(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("thumbnails", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = ascj.a.createBuilder();
        int i = this.c;
        createBuilder.copyOnWrite();
        ascj ascjVar = (ascj) createBuilder.instance;
        ascjVar.b |= 8;
        ascjVar.f = i;
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            ascj ascjVar2 = (ascj) createBuilder.instance;
            ascjVar2.b |= 2;
            ascjVar2.d = str;
        } else {
            String str2 = this.b;
            if (str2 != null) {
                createBuilder.copyOnWrite();
                ascj ascjVar3 = (ascj) createBuilder.instance;
                ascjVar3.b |= 4;
                ascjVar3.e = str2;
            }
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N((!TextUtils.isEmpty(this.a)) ^ (!TextUtils.isEmpty(this.b)));
    }
}
