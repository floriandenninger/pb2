package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddd extends adz {
    private int k;

    @Override // defpackage.aeg, java.util.Map, j$.util.Map
    public final void clear() {
        this.k = 0;
        super.clear();
    }

    @Override // defpackage.aeg
    public final Object g(int i) {
        this.k = 0;
        return super.g(i);
    }

    @Override // defpackage.aeg
    public final Object h(int i, Object obj) {
        this.k = 0;
        return super.h(i, obj);
    }

    @Override // defpackage.aeg, java.util.Map, j$.util.Map
    public final int hashCode() {
        int i = this.k;
        if (i != 0) {
            return i;
        }
        int hashCode = super.hashCode();
        this.k = hashCode;
        return hashCode;
    }

    @Override // defpackage.aeg
    public final void k(aeg aegVar) {
        this.k = 0;
        super.k(aegVar);
    }

    @Override // defpackage.aeg, java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        this.k = 0;
        return super.put(obj, obj2);
    }
}
