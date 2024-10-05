package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvt extends pvx {
    final /* synthetic */ Context a;
    final /* synthetic */ AdSizeParcel b;
    final /* synthetic */ String c;
    final /* synthetic */ pvw d;

    public pvt(pvw pvwVar, Context context, AdSizeParcel adSizeParcel, String str) {
        this.d = pvwVar;
        this.a = context;
        this.b = adSizeParcel;
        this.c = str;
    }

    @Override // defpackage.pvx
    public final /* synthetic */ Object a() {
        pvw.a(this.a, "search");
        return new pws();
    }

    @Override // defpackage.pvx
    public final /* bridge */ /* synthetic */ Object b() {
        return this.d.a.a(this.a, this.b, this.c, null, 3);
    }

    @Override // defpackage.pvx
    public final /* bridge */ /* synthetic */ Object c(pwz pwzVar) {
        pwt pwrVar;
        qvf a = qve.a(this.a);
        AdSizeParcel adSizeParcel = this.b;
        String str = this.c;
        Parcel pn = pwzVar.pn();
        ecr.i(pn, a);
        ecr.g(pn, adSizeParcel);
        pn.writeString(str);
        pn.writeInt(213880000);
        Parcel po = pwzVar.po(10, pn);
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
