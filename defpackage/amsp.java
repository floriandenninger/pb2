package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsp extends amtg {
    private static final long serialVersionUID = 0;
    final /* synthetic */ amsr a;

    public amsp(amsr amsrVar) {
        this.a = amsrVar;
    }

    @Override // defpackage.amtg
    public final /* bridge */ /* synthetic */ Object c(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof amux) {
            amux amuxVar = (amux) obj;
            if (amuxVar.a() > 0 && this.a.a(amuxVar.a) == amuxVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amsx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.i().size();
    }

    @Override // defpackage.amsx, defpackage.amrl
    Object writeReplace() {
        return new amsq(this.a);
    }
}
