package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvv extends pvx {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ pzu c;
    final /* synthetic */ pvw d;

    public pvv(pvw pvwVar, Context context, String str, pzu pzuVar) {
        this.d = pvwVar;
        this.a = context;
        this.b = str;
        this.c = pzuVar;
    }

    @Override // defpackage.pvx
    protected final /* synthetic */ Object a() {
        pvw.a(this.a, "native_ad");
        return new pwo();
    }

    @Override // defpackage.pvx
    public final /* bridge */ /* synthetic */ Object b() {
        Object pwnVar;
        pyi.b(this.a);
        if (((Boolean) pyi.y.e()).booleanValue()) {
            try {
                IBinder a = ((pwq) qar.c(this.a, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", pvq.c)).a(qve.a(this.a), this.b, this.c);
                if (a == null) {
                    return null;
                }
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof pwp) {
                    pwnVar = (pwp) queryLocalInterface;
                } else {
                    pwnVar = new pwn(a);
                }
            } catch (RemoteException | NullPointerException | qbk e) {
                this.d.c = qaz.a(this.a);
                this.d.c.b(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        } else {
            pvm pvmVar = this.d.b;
            Context context = this.a;
            String str = this.b;
            pzu pzuVar = this.c;
            try {
                IBinder a2 = ((pwq) pvmVar.d(context)).a(qve.a(context), str, pzuVar);
                if (a2 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = a2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface2 instanceof pwp) {
                    pwnVar = (pwp) queryLocalInterface2;
                } else {
                    pwnVar = new pwn(a2);
                }
            } catch (RemoteException | qvg e2) {
                qbi.g("Could not create remote builder for AdLoader.", e2);
                return null;
            }
        }
        return pwnVar;
    }

    @Override // defpackage.pvx
    public final /* bridge */ /* synthetic */ Object c(pwz pwzVar) {
        pwp pwnVar;
        qvf a = qve.a(this.a);
        String str = this.b;
        pzu pzuVar = this.c;
        Parcel pn = pwzVar.pn();
        ecr.i(pn, a);
        pn.writeString(str);
        ecr.i(pn, pzuVar);
        pn.writeInt(213880000);
        Parcel po = pwzVar.po(3, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            pwnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof pwp) {
                pwnVar = (pwp) queryLocalInterface;
            } else {
                pwnVar = new pwn(readStrongBinder);
            }
        }
        po.recycle();
        return pwnVar;
    }
}
