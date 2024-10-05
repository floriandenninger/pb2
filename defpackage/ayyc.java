package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayyc extends aypn {
    final Object[] b;

    public ayyc(Object[] objArr) {
        this.b = objArr;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        if (banwVar instanceof aysx) {
            banwVar.f(new ayxz((aysx) banwVar, this.b));
        } else {
            banwVar.f(new ayya(banwVar, this.b));
        }
    }
}
