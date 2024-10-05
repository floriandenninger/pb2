package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaye extends aayc {
    /* JADX INFO: Access modifiers changed from: protected */
    public aaye(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("like/like", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arts.a.createBuilder();
        asnp asnpVar = ((aayc) this).a;
        createBuilder.copyOnWrite();
        arts artsVar = (arts) createBuilder.instance;
        asnpVar.getClass();
        artsVar.d = asnpVar;
        artsVar.b |= 2;
        if (!TextUtils.isEmpty(((aayc) this).b)) {
            String str = ((aayc) this).b;
            createBuilder.copyOnWrite();
            arts artsVar2 = (arts) createBuilder.instance;
            str.getClass();
            artsVar2.b |= 4;
            artsVar2.e = str;
        }
        return createBuilder;
    }
}
