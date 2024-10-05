package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qjy implements qqu {
    public final /* synthetic */ String[] a;
    private final /* synthetic */ int b;

    public /* synthetic */ qjy(String[] strArr, int i) {
        this.b = i;
        this.a = strArr;
    }

    @Override // defpackage.qqu
    public final void a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            String[] strArr = this.a;
            qkc qkcVar = new qkc((rpv) obj2);
            qku qkuVar = (qku) ((qke) obj).D();
            Parcel pn = qkuVar.pn();
            ecr.i(pn, qkcVar);
            pn.writeStringArray(strArr);
            qkuVar.pq(7, pn);
            return;
        }
        if (i == 1) {
            String[] strArr2 = this.a;
            qka qkaVar = new qka((rpv) obj2);
            qku qkuVar2 = (qku) ((qke) obj).D();
            Parcel pn2 = qkuVar2.pn();
            ecr.i(pn2, qkaVar);
            pn2.writeStringArray(strArr2);
            qkuVar2.pq(5, pn2);
            return;
        }
        String[] strArr3 = this.a;
        qkb qkbVar = new qkb((rpv) obj2);
        qku qkuVar3 = (qku) ((qke) obj).D();
        Parcel pn3 = qkuVar3.pn();
        ecr.i(pn3, qkbVar);
        pn3.writeStringArray(strArr3);
        qkuVar3.pq(6, pn3);
    }
}
