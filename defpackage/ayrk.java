package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayrk extends aypn {
    public abstract void ap(ayrs ayrsVar);

    public final aypn b(int i) {
        ayrs ayrsVar = aysu.d;
        if (i <= 0) {
            ap(ayrsVar);
            ayrv ayrvVar = aynu.k;
            return this;
        }
        ayvt ayvtVar = new ayvt(this, ayrsVar);
        ayrv ayrvVar2 = aynu.j;
        return ayvtVar;
    }

    public final aypn c() {
        ayrk ayrkVar;
        if (this instanceof ayzs) {
            ayzs ayzsVar = (ayzs) this;
            ayrkVar = new ayzv(ayzsVar.b, ayzsVar.d);
            ayrv ayrvVar = aynu.k;
        } else {
            ayrkVar = this;
        }
        ayzy ayzyVar = new ayzy(ayrkVar);
        ayrv ayrvVar2 = aynu.j;
        return ayzyVar;
    }

    public final aypn sk() {
        return b(1);
    }
}
