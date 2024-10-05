package defpackage;

import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fis {
    public static final amrz a = amrz.k(fir.a, evy.d);
    public final shf b;
    private final aais c;
    private final afsy d;

    public fis(aais aaisVar, afsy afsyVar, shf shfVar) {
        this.c = aaisVar;
        this.d = afsyVar;
        this.b = shfVar;
    }

    public final ayps a(final fir firVar) {
        if (!a.containsKey(firVar)) {
            return ayps.p();
        }
        return this.c.a(this.d.c()).f(fhe.n(aqor.b, "")).g(aqoq.class).x(new ayrv() { // from class: fip
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                Function function = (Function) fis.a.get(fir.this);
                function.getClass();
                return (aqnj) function.apply((aqoq) obj);
            }
        }).r(new ayrw() { // from class: fiq
            @Override // defpackage.ayrw
            public final boolean a(Object obj) {
                return fis.this.b.c() < ((aqnj) obj).b;
            }
        });
    }
}
