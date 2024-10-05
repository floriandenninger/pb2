package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbq implements akbl {
    final /* synthetic */ mbr a;

    public mbq(mbr mbrVar) {
        this.a = mbrVar;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        mbr mbrVar = this.a;
        ynm.n(mbrVar.e, mbrVar.d.b(new amml() { // from class: mbp
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                mbq mbqVar = mbq.this;
                mcz mczVar = (mcz) obj2;
                long j = mbr.a;
                int i = mczVar.d;
                aone builder = mczVar.toBuilder();
                long c = mbqVar.a.f.c();
                builder.copyOnWrite();
                mcz mczVar2 = (mcz) builder.instance;
                mczVar2.b |= 1;
                mczVar2.c = c;
                builder.copyOnWrite();
                mcz mczVar3 = (mcz) builder.instance;
                mczVar3.b |= 2;
                mczVar3.d = i + 1;
                return (mcz) builder.build();
            }
        }), llq.o, ynm.b);
    }
}
