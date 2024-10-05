package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nlk extends nky {
    public nlk(Object obj) {
        super(obj);
    }

    @Override // defpackage.nky
    public final amsx a(amsx amsxVar) {
        amsv i = amsx.i();
        amxd listIterator = amsxVar.listIterator();
        while (listIterator.hasNext()) {
            fze fzeVar = (fze) listIterator.next();
            if (!(fzeVar instanceof jcm) && !(fzeVar instanceof fzj)) {
                i.c(fzeVar);
            }
        }
        return i.g();
    }

    @Override // defpackage.nky
    public final boolean i() {
        return true;
    }
}
