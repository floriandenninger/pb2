package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class opj implements akbl {
    final /* synthetic */ opk a;
    private final /* synthetic */ int b;

    public opj(opk opkVar, int i) {
        this.b = i;
        this.a = opkVar;
    }

    @Override // defpackage.akbl
    public final /* synthetic */ void li(Object obj, int i) {
        if (this.b != 0) {
        }
    }

    @Override // defpackage.akbl
    public final /* synthetic */ void lj(Object obj) {
        if (this.b == 0) {
            opk opkVar = this.a;
            ynm.n(opkVar.c, ((ywr) opkVar.b.get()).b(new amml() { // from class: opi
                @Override // defpackage.amml
                public final Object apply(Object obj2) {
                    opj opjVar = opj.this;
                    aone builder = ((opo) obj2).toBuilder();
                    long c = opjVar.a.a.c();
                    builder.copyOnWrite();
                    opo opoVar = (opo) builder.instance;
                    opoVar.b |= 4;
                    opoVar.e = c;
                    return (opo) builder.build();
                }
            }), oph.f, ynm.b);
        } else {
            opk opkVar2 = this.a;
            ynm.n(opkVar2.c, ((ywr) opkVar2.b.get()).b(mjy.k), oph.e, ynm.b);
        }
    }
}
