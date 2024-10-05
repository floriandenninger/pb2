package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaya extends aaru {
    public List a;
    public String b;

    public aaya(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("kids/update_blacklist", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = artl.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        artl artlVar = (artl) createBuilder.instance;
        aony aonyVar = artlVar.d;
        if (!aonyVar.c()) {
            artlVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) artlVar.d);
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            artl artlVar2 = (artl) createBuilder.instance;
            artlVar2.b |= 2;
            artlVar2.e = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
        amkq.E(!r0.isEmpty());
    }
}
