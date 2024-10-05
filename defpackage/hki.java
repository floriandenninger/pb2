package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hki extends ajmx {
    private final hkg a;

    public hki(hkg hkgVar, yqw yqwVar) {
        this.a = hkgVar;
        hkgVar.b().p(wbs.K(yqwVar.a())).ab(ayqr.a()).ax(new ayrs() { // from class: hkh
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                hki hkiVar = hki.this;
                int i = ((dsm) obj).c;
                hkiVar.v();
            }
        });
    }

    @Override // defpackage.ajng
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.ajng
    public final long b(int i) {
        return c(i).a();
    }

    @Override // defpackage.ajng
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.ajng
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final hke c(int i) {
        return (hke) this.a.b.get(i);
    }

    @Override // defpackage.ajng
    public final boolean isEmpty() {
        return this.a.a() == 0;
    }
}
