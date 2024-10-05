package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qes implements qqu {
    private final /* synthetic */ int c;
    public static final /* synthetic */ qes b = new qes(2);
    public static final /* synthetic */ qes a = new qes(0);

    public /* synthetic */ qes(int i) {
        this.c = i;
    }

    @Override // defpackage.qqu
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            qkw qkwVar = qfe.a;
            qkr qkrVar = (qkr) ((qkn) obj).D();
            qkrVar.pq(19, qkrVar.pn());
            ((rpv) obj2).b(true);
            return;
        }
        if (i == 1) {
            qed qedVar = new qed((rpv) obj2);
            qec qecVar = (qec) ((qea) obj).D();
            Parcel pn = qecVar.pn();
            ecr.i(pn, qedVar);
            qecVar.pp(3, pn);
            return;
        }
        if (i == 2) {
            qkw qkwVar2 = qfe.a;
            ((qkr) ((qkn) obj).D()).a();
            ((rpv) obj2).b(null);
            return;
        }
        if (i == 3) {
            qdm qdmVar = new qdm((rpv) obj2, 5, (boolean[]) null);
            qfo qfoVar = (qfo) ((qfn) obj).D();
            Parcel pn2 = qfoVar.pn();
            ecr.i(pn2, qdmVar);
            qfoVar.pq(2, pn2);
            return;
        }
        if (i == 4) {
            qyp qypVar = new qyp((rpv) obj2);
            qyd qydVar = (qyd) ((qyn) obj).D();
            Parcel pn3 = qydVar.pn();
            ecr.i(pn3, qypVar);
            qydVar.pp(1, pn3);
            return;
        }
        rqb rqbVar = new rqb((rpv) obj2);
        rqh rqhVar = (rqh) ((rqk) obj).D();
        Parcel pn4 = rqhVar.pn();
        ecr.i(pn4, rqbVar);
        rqhVar.pp(2, pn4);
    }
}
