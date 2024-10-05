package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qaf implements qbq, qbs, qbu {
    public qby a;
    public pyy b;
    private final pzz c;

    public qaf(pzz pzzVar) {
        this.c = pzzVar;
    }

    @Override // defpackage.qbu
    public final void a(qbt qbtVar, qby qbyVar) {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdLoaded.");
        this.a = qbyVar;
        if (!(qbtVar instanceof AdMobAdapter)) {
            new pup().b(new pxm(null));
        }
        try {
            this.c.j();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbq
    public final void b() {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdClicked.");
        try {
            this.c.a();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbu
    public final void c() {
        qip.as("#008 Must be called on the main UI thread.");
        qby qbyVar = this.a;
        if (this.b == null) {
            if (qbyVar == null) {
                qbi.h("#007 Could not call remote method.");
                return;
            } else if (!qbyVar.n) {
                qbi.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        qbi.b("Adapter called onAdClicked.");
        try {
            this.c.a();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbq
    public final void d() {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdClosed.");
        try {
            this.c.f();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbs
    public final void e() {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdClosed.");
        try {
            this.c.f();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbu
    public final void f() {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdClosed.");
        try {
            this.c.f();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbq
    public final void g(puc pucVar) {
        qip.as("#008 Must be called on the main UI thread.");
        int i = pucVar.a;
        String str = pucVar.b;
        String str2 = pucVar.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        qbi.b(sb.toString());
        try {
            this.c.h(pucVar.a());
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbs
    public final void h(puc pucVar) {
        qip.as("#008 Must be called on the main UI thread.");
        int i = pucVar.a;
        String str = pucVar.b;
        String str2 = pucVar.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        qbi.b(sb.toString());
        try {
            this.c.h(pucVar.a());
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbu
    public final void i(puc pucVar) {
        qip.as("#008 Must be called on the main UI thread.");
        int i = pucVar.a;
        String str = pucVar.b;
        String str2 = pucVar.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        qbi.b(sb.toString());
        try {
            this.c.h(pucVar.a());
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbu
    public final void j() {
        qip.as("#008 Must be called on the main UI thread.");
        qby qbyVar = this.a;
        if (this.b == null) {
            if (qbyVar == null) {
                qbi.h("#007 Could not call remote method.");
                return;
            } else if (!qbyVar.m) {
                qbi.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        qbi.b("Adapter called onAdImpression.");
        try {
            this.c.i();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbq
    public final void k() {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdLoaded.");
        try {
            this.c.j();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbs
    public final void l() {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdLoaded.");
        try {
            this.c.j();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbu
    public final void m(pyy pyyVar) {
        String str;
        qip.as("#008 Must be called on the main UI thread.");
        try {
            pyx pyxVar = pyyVar.a;
            Parcel po = pyxVar.po(4, pyxVar.pn());
            str = po.readString();
            po.recycle();
        } catch (RemoteException e) {
            qbi.d(e);
            str = null;
        }
        String valueOf = String.valueOf(str);
        qbi.b(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.b = pyyVar;
        try {
            this.c.j();
        } catch (RemoteException e2) {
            qbi.i("#007 Could not call remote method.", e2);
        }
    }

    @Override // defpackage.qbq
    public final void n() {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdOpened.");
        try {
            this.c.k();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbs
    public final void o() {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdOpened.");
        try {
            this.c.k();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbu
    public final void p() {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAdOpened.");
        try {
            this.c.k();
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbq
    public final void q(String str, String str2) {
        qip.as("#008 Must be called on the main UI thread.");
        qbi.b("Adapter called onAppEvent.");
        try {
            this.c.l(str, str2);
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qbu
    public final void r(pyy pyyVar, String str) {
        try {
            this.c.m(pyyVar.a, str);
        } catch (RemoteException e) {
            qbi.i("#007 Could not call remote method.", e);
        }
    }
}
