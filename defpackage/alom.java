package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alom extends alpq {
    final /* synthetic */ alsf a;
    final /* synthetic */ String b;
    final /* synthetic */ alop c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alom(alop alopVar, alsf alsfVar, alsf alsfVar2, String str) {
        super(alsfVar);
        this.c = alopVar;
        this.a = alsfVar2;
        this.b = str;
    }

    @Override // defpackage.alpq
    protected final void a() {
        try {
            alop alopVar = this.c;
            alos alosVar = (alos) alopVar.a.k;
            String str = alopVar.b;
            Bundle b = alop.b();
            alon alonVar = new alon(this.c, this.a);
            Parcel pn = alosVar.pn();
            pn.writeString(str);
            ecr.g(pn, b);
            ecr.i(pn, alonVar);
            alosVar.pq(3, pn);
        } catch (RemoteException e) {
            alop.e.l(e, "completeUpdate(%s)", this.b);
            this.a.a(new RuntimeException(e));
        }
    }
}
