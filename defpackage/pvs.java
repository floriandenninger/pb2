package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvs extends pvx {
    final /* synthetic */ Context a;
    final /* synthetic */ AdSizeParcel b;
    final /* synthetic */ String c;
    final /* synthetic */ pzu d;
    final /* synthetic */ pvw e;

    public pvs(pvw pvwVar, Context context, AdSizeParcel adSizeParcel, String str, pzu pzuVar) {
        this.e = pvwVar;
        this.a = context;
        this.b = adSizeParcel;
        this.c = str;
        this.d = pzuVar;
    }

    @Override // defpackage.pvx
    public final /* synthetic */ Object a() {
        pvw.a(this.a, "banner");
        return new pws();
    }

    @Override // defpackage.pvx
    public final /* bridge */ /* synthetic */ Object b() {
        return this.e.a.a(this.a, this.b, this.c, this.d, 1);
    }

    @Override // defpackage.pvx
    public final /* bridge */ /* synthetic */ Object c(pwz pwzVar) {
        pwt pwrVar;
        qvf a = qve.a(this.a);
        AdSizeParcel adSizeParcel = this.b;
        String str = this.c;
        pzu pzuVar = this.d;
        Parcel pn = pwzVar.pn();
        ecr.i(pn, a);
        ecr.g(pn, adSizeParcel);
        pn.writeString(str);
        ecr.i(pn, pzuVar);
        pn.writeInt(213880000);
        Parcel po = pwzVar.po(1, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            pwrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof pwt) {
                pwrVar = (pwt) queryLocalInterface;
            } else {
                pwrVar = new pwr(readStrongBinder);
            }
        }
        po.recycle();
        return pwrVar;
    }
}
