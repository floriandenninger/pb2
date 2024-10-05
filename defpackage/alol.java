package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alol extends alpq {
    final /* synthetic */ String a;
    final /* synthetic */ alsf b;
    final /* synthetic */ alop c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alol(alop alopVar, alsf alsfVar, String str, alsf alsfVar2) {
        super(alsfVar);
        this.c = alopVar;
        this.a = str;
        this.b = alsfVar2;
    }

    @Override // defpackage.alpq
    protected final void a() {
        Integer num;
        try {
            alop alopVar = this.c;
            alos alosVar = (alos) alopVar.a.k;
            String str = alopVar.b;
            String str2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putAll(alop.b());
            bundle.putString("package.name", str2);
            try {
                num = Integer.valueOf(alopVar.c.getPackageManager().getPackageInfo(alopVar.c.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                alop.e.k("The current version of the app could not be retrieved", new Object[0]);
                num = null;
            }
            if (num != null) {
                bundle.putInt("app.version.code", num.intValue());
            }
            aloo alooVar = new aloo(this.c, this.b);
            Parcel pn = alosVar.pn();
            pn.writeString(str);
            ecr.g(pn, bundle);
            ecr.i(pn, alooVar);
            alosVar.pq(2, pn);
        } catch (RemoteException e) {
            alop.e.l(e, "requestUpdateInfo(%s)", this.a);
            this.b.a(new RuntimeException(e));
        }
    }
}
