package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayf extends aayc {
    /* JADX INFO: Access modifiers changed from: protected */
    public aayf(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("like/removelike", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = artu.a.createBuilder();
        asnp asnpVar = ((aayc) this).a;
        createBuilder.copyOnWrite();
        artu artuVar = (artu) createBuilder.instance;
        asnpVar.getClass();
        artuVar.d = asnpVar;
        artuVar.b |= 2;
        if (!TextUtils.isEmpty(((aayc) this).b)) {
            String str = ((aayc) this).b;
            createBuilder.copyOnWrite();
            artu artuVar2 = (artu) createBuilder.instance;
            str.getClass();
            artuVar2.b |= 4;
            artuVar2.e = str;
        }
        return createBuilder;
    }
}
