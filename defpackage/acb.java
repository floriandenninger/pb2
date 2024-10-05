package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acb extends abf {
    public final WeakReference a;

    public acb(acd acdVar) {
        this.a = new WeakReference(acdVar);
    }

    @Override // defpackage.abf
    public final void a(int i, CharSequence charSequence) {
        if (this.a.get() == null || ((acd) this.a.get()).i || !((acd) this.a.get()).h) {
            return;
        }
        ((acd) this.a.get()).i(new abh(i, charSequence));
    }

    @Override // defpackage.abf
    public final void b() {
        if (this.a.get() == null || !((acd) this.a.get()).h) {
            return;
        }
        ((acd) this.a.get()).j(true);
    }

    @Override // defpackage.abf
    public final void c(abw abwVar) {
        if (this.a.get() == null || !((acd) this.a.get()).h) {
            return;
        }
        int i = -1;
        if (abwVar.b == -1) {
            abx abxVar = abwVar.a;
            int a = ((acd) this.a.get()).a();
            if ((a & 32767) != 0 && !abd.d(a)) {
                i = 2;
            }
            abwVar = new abw(abxVar, i);
        }
        ((acd) this.a.get()).k(abwVar);
    }
}
