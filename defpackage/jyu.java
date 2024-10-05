package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jyu {
    public final fis a;
    public final ysy b;

    public jyu(fis fisVar, ysy ysyVar) {
        this.a = fisVar;
        this.b = ysyVar;
    }

    public final ayqj a() {
        return this.a.a(fir.a).x(new ayrv() { // from class: jyt
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                aqnj aqnjVar = (aqnj) obj;
                return Boolean.valueOf(jyu.this.b.p() ? aqnjVar.c : aqnjVar.d);
            }
        }).S(false);
    }
}
