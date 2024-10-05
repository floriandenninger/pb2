package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pur extends qbl {
    public final Context a;
    public final pvp b;
    public final pwt c;
    public final pzs d;

    public pur() {
    }

    public pur(Context context, String str) {
        pzs pzsVar = new pzs();
        this.d = pzsVar;
        this.a = context;
        this.b = pvp.a;
        this.c = (pwt) new pvu(pvy.a(), context, new AdSizeParcel("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false), str, pzsVar).d(context);
    }

    @Override // defpackage.qbl
    public final void a(pul pulVar) {
        try {
            pwt pwtVar = this.c;
            if (pwtVar != null) {
                pwtVar.p(new pxc(pulVar));
            }
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbl
    public final void b(boolean z) {
        try {
            pwt pwtVar = this.c;
            if (pwtVar != null) {
                pwtVar.q(z);
            }
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbl
    public final void c() {
        qbi.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        try {
            pwt pwtVar = this.c;
            if (pwtVar != null) {
                pwtVar.s(qve.a(null));
            }
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }
}
