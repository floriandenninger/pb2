package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatw extends aaru {
    public final List a;
    public int b;

    public aatw(ajoy ajoyVar, afsx afsxVar, String str, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("att/get", ajoyVar, afsxVar, 1, false, str, Boolean.valueOf(z), null, null, null);
        this.a = new ArrayList();
        this.b = 1;
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arjc.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        arjc arjcVar = (arjc) createBuilder.instance;
        aony aonyVar = arjcVar.e;
        if (!aonyVar.c()) {
            arjcVar.e = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) arjcVar.e);
        int i = this.b;
        createBuilder.copyOnWrite();
        arjc arjcVar2 = (arjc) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        arjcVar2.d = i2;
        arjcVar2.b |= 2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(!d());
    }

    public final boolean d() {
        return this.a.isEmpty() || this.b == 1;
    }
}
