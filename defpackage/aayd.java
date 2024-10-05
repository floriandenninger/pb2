package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayd extends aayc {
    /* JADX INFO: Access modifiers changed from: protected */
    public aayd(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("like/dislike", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = artq.a.createBuilder();
        asnp asnpVar = ((aayc) this).a;
        createBuilder.copyOnWrite();
        artq artqVar = (artq) createBuilder.instance;
        asnpVar.getClass();
        artqVar.d = asnpVar;
        artqVar.b |= 2;
        if (!TextUtils.isEmpty(((aayc) this).b)) {
            String str = ((aayc) this).b;
            createBuilder.copyOnWrite();
            artq artqVar2 = (artq) createBuilder.instance;
            str.getClass();
            artqVar2.b |= 4;
            artqVar2.e = str;
        }
        return createBuilder;
    }
}
