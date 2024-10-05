package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcb extends aasw implements aasm {
    public final abby a;
    private final afsy b;
    private final boolean c;
    private final Set g;
    private final ypa h;

    public abcb(ajoy ajoyVar, afsy afsyVar, ysl yslVar, aadw aadwVar, Set set, abby abbyVar, ypa ypaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.b = afsyVar;
        set.getClass();
        this.g = set;
        this.a = abbyVar;
        this.c = aaec.b(aadwVar);
        ypaVar.getClass();
        this.h = ypaVar;
    }

    @Override // defpackage.aasm
    public final /* bridge */ /* synthetic */ aaru a(ajce ajceVar) {
        abbz d = d();
        d.a = abbz.i(ajceVar.b());
        d.m(ajceVar.d());
        return d;
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.a.j((abbz) aaruVar, aaslVar, afwxVar);
    }

    public final abbz d() {
        abbz abbzVar = new abbz(this.f, this.b.c(), this.c, null, null, null);
        abbzVar.p = new yqy(this.h, new aaet(), new aaes(), null, null);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((abca) it.next()).b(abbzVar);
        }
        return abbzVar;
    }
}
