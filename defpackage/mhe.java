package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhe implements aijo {
    public boolean a;

    public final void b(boolean z) {
        this.a = !z;
    }

    @Override // defpackage.aijo
    public final void qZ(aijr aijrVar) {
        if (this.a) {
            aijrVar.T = true;
            aijrVar.d(new aijq() { // from class: mhd
                @Override // defpackage.aijq
                public final void a(afpi afpiVar) {
                    afpiVar.d("overrideMutedAtStart", mhe.this.a);
                }
            });
        }
    }
}
