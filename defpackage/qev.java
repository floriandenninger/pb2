package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qev implements qqu {
    public final /* synthetic */ qfe a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qen c;
    private final /* synthetic */ int d;

    public /* synthetic */ qev(qfe qfeVar, String str, qen qenVar, int i) {
        this.d = i;
        this.a = qfeVar;
        this.b = str;
        this.c = qenVar;
    }

    public /* synthetic */ qev(qfe qfeVar, qen qenVar, String str, int i) {
        this.d = i;
        this.a = qfeVar;
        this.c = qenVar;
        this.b = str;
    }

    @Override // defpackage.qqu
    public final void a(Object obj, Object obj2) {
        if (this.d == 0) {
            qfe qfeVar = this.a;
            String str = this.b;
            qen qenVar = this.c;
            qkn qknVar = (qkn) obj;
            qfeVar.m();
            ((qkr) qknVar.D()).f(str);
            if (qenVar != null) {
                qkr qkrVar = (qkr) qknVar.D();
                Parcel pn = qkrVar.pn();
                pn.writeString(str);
                qkrVar.pq(11, pn);
            }
            ((rpv) obj2).b(null);
            return;
        }
        qfe qfeVar2 = this.a;
        qen qenVar2 = this.c;
        String str2 = this.b;
        qkn qknVar2 = (qkn) obj;
        qfeVar2.m();
        if (qenVar2 != null) {
            ((qkr) qknVar2.D()).f(str2);
        }
        ((rpv) obj2).b(null);
    }
}
