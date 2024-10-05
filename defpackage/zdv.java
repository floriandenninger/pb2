package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zdv implements zdj {
    public final ykr a;
    private final amml b;
    private final vgz c;

    public zdv(vgz vgzVar, ykr ykrVar, amml ammlVar) {
        vgzVar.getClass();
        this.c = vgzVar;
        ykrVar.getClass();
        this.a = ykrVar;
        ammlVar.getClass();
        this.b = ammlVar;
    }

    @Override // defpackage.zdj
    public final anhy a() {
        return anfq.h(this.c.a(), new zef(this.b, 1), angq.a);
    }

    @Override // defpackage.zdj
    public final anhy b(final Object obj) {
        return this.c.b(new amml() { // from class: zdu
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                zdv zdvVar = zdv.this;
                Object obj3 = obj;
                return (aooy) zdvVar.a.a((aooy) obj2, obj3);
            }
        }, angq.a);
    }
}
