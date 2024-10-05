package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qex implements qqu {
    public final /* synthetic */ qfe a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    private final /* synthetic */ int d;

    public /* synthetic */ qex(qfe qfeVar, String str, String str2, int i) {
        this.d = i;
        this.a = qfeVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.qqu
    public final void a(Object obj, Object obj2) {
        if (this.d == 0) {
            qfe qfeVar = this.a;
            String str = this.b;
            String str2 = this.c;
            qkn qknVar = (qkn) obj;
            long incrementAndGet = qfeVar.g.incrementAndGet();
            qfeVar.g();
            try {
                qfeVar.r.put(Long.valueOf(incrementAndGet), obj2);
                qkr qkrVar = (qkr) qknVar.D();
                Parcel pn = qkrVar.pn();
                pn.writeString(str);
                pn.writeString(str2);
                pn.writeLong(incrementAndGet);
                qkrVar.pq(9, pn);
                return;
            } catch (RemoteException e) {
                qfeVar.r.remove(Long.valueOf(incrementAndGet));
                ((rpv) obj2).a(e);
                return;
            }
        }
        qfe qfeVar2 = this.a;
        String str3 = this.b;
        String str4 = this.c;
        qfeVar2.g();
        qkr qkrVar2 = (qkr) ((qkn) obj).D();
        Parcel pn2 = qkrVar2.pn();
        pn2.writeString(str3);
        pn2.writeString(str4);
        ecr.g(pn2, null);
        qkrVar2.pq(14, pn2);
        qfeVar2.i((rpv) obj2);
    }
}
