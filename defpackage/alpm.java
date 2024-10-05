package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alpm extends alpq {
    final /* synthetic */ alsf a;
    final /* synthetic */ alpo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpm(alpo alpoVar, alsf alsfVar, alsf alsfVar2) {
        super(alsfVar);
        this.b = alpoVar;
        this.a = alsfVar2;
    }

    @Override // defpackage.alpq
    protected final void a() {
        try {
            alpo alpoVar = this.b;
            alov alovVar = (alov) alpoVar.a.k;
            String str = alpoVar.b;
            Bundle a = alou.a("review");
            alpn alpnVar = new alpn(this.b, this.a);
            Parcel pn = alovVar.pn();
            pn.writeString(str);
            ecr.g(pn, a);
            ecr.i(pn, alpnVar);
            alovVar.pq(2, pn);
        } catch (RemoteException e) {
            alpo.c.l(e, "error requesting in-app review for %s", this.b.b);
            this.a.a(new RuntimeException(e));
        }
    }
}
