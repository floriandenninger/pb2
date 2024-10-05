package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawo extends aaru {
    public List a;

    public aawo(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("dismissal/dismiss", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = aroz.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        aroz arozVar = (aroz) createBuilder.instance;
        aony aonyVar = arozVar.d;
        if (!aonyVar.c()) {
            arozVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) arozVar.d);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
    }
}
