package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alpg extends alpq {
    final /* synthetic */ alsf a;
    final /* synthetic */ alph b;
    final /* synthetic */ vak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpg(alph alphVar, alsf alsfVar, vak vakVar, alsf alsfVar2, byte[] bArr) {
        super(alsfVar);
        this.b = alphVar;
        this.c = vakVar;
        this.a = alsfVar2;
    }

    @Override // defpackage.alpq
    protected final void a() {
        try {
            alph alphVar = this.b;
            alpi alpiVar = (alpi) alphVar.a.k;
            String str = alphVar.b;
            vak vakVar = this.c;
            ArrayList arrayList = new ArrayList();
            for (String str2 : new ArrayList(vakVar.a)) {
                Bundle bundle = new Bundle();
                bundle.putString("url", str2);
                arrayList.add(bundle);
            }
            Bundle bundle2 = new Bundle();
            alpj alpjVar = new alpj(this.b);
            Parcel pn = alpiVar.pn();
            pn.writeString(str);
            pn.writeTypedList(arrayList);
            ecr.g(pn, bundle2);
            ecr.i(pn, alpjVar);
            alpiVar.pq(1, pn);
        } catch (RemoteException e) {
            alph.c.l(e, "prewarm(%s)", this.b.b);
            this.a.a(new RuntimeException(e));
        }
    }
}
