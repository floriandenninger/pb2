package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zeg implements zdj {
    public final ykr a;
    private final ywr b;
    private final amml c;

    public zeg(ywr ywrVar, ykr ykrVar, amml ammlVar) {
        ywrVar.getClass();
        this.b = ywrVar;
        ykrVar.getClass();
        this.a = ykrVar;
        ammlVar.getClass();
        this.c = ammlVar;
    }

    @Override // defpackage.zdj
    public final anhy a() {
        return anfq.h(this.b.a(), new zef(this.c, 0), angq.a);
    }

    @Override // defpackage.zdj
    public final anhy b(final Object obj) {
        return this.b.b(new amml() { // from class: zee
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                zeg zegVar = zeg.this;
                Object obj3 = obj;
                return (aooy) zegVar.a.a((aooy) obj2, obj3);
            }
        });
    }
}
