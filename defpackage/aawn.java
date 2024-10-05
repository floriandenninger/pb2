package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawn extends aaru {
    public List a;

    public aawn(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("datasync/get", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = aroq.a.createBuilder();
        List list = this.a;
        if (list != null) {
            createBuilder.copyOnWrite();
            aroq aroqVar = (aroq) createBuilder.instance;
            aony aonyVar = aroqVar.d;
            if (!aonyVar.c()) {
                aroqVar.d = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list, (List) aroqVar.d);
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        List list = this.a;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        amkq.E(z);
    }
}
