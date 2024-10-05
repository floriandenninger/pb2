package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mgn extends ajpd {
    private int a;

    public mgn(int i) {
        f(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        if (i <= 0) {
            if (isEmpty()) {
                return;
            }
            clear();
        } else if (isEmpty()) {
            add(frd.a(i));
        } else {
            n(0, frd.a(i));
        }
    }

    @Override // defpackage.ajpd, defpackage.ajng
    public final /* bridge */ /* synthetic */ void lX(ajnf ajnfVar) {
        super.i(ajnfVar);
    }

    @Override // defpackage.ajpd, defpackage.ajng
    public final /* bridge */ /* synthetic */ void pf(ajnf ajnfVar) {
        super.j(ajnfVar);
    }
}
