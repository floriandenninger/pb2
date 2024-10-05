package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agry extends aaru {
    public final List a;
    public final List b;

    /* JADX INFO: Access modifiers changed from: protected */
    public agry(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("offline", ajoyVar, afsxVar, null, null, null);
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arwz.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        arwz arwzVar = (arwz) createBuilder.instance;
        aony aonyVar = arwzVar.d;
        if (!aonyVar.c()) {
            arwzVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) arwzVar.d);
        List list2 = this.b;
        createBuilder.copyOnWrite();
        arwz arwzVar2 = (arwz) createBuilder.instance;
        aony aonyVar2 = arwzVar2.e;
        if (!aonyVar2.c()) {
            arwzVar2.e = aonm.mutableCopy(aonyVar2);
        }
        aolo.addAll((Iterable) list2, (List) arwzVar2.e);
        createBuilder.copyOnWrite();
        arwz arwzVar3 = (arwz) createBuilder.instance;
        arwzVar3.b |= 2;
        arwzVar3.f = false;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(this.a.size() > 0 || this.b.size() > 0);
        amkq.N(true);
    }
}
