package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wjk implements aftn, ypd {
    public final wiz a;
    public final ypa b;
    public boolean c;
    private final wdd d;
    private final wkk e;
    private final aatg f;

    public wjk(wiz wizVar, wdd wddVar, wkk wkkVar, aatg aatgVar, ypa ypaVar) {
        this.a = wizVar;
        this.d = wddVar;
        this.e = wkkVar;
        this.f = aatgVar;
        this.b = ypaVar;
        ypaVar.g(this);
    }

    @Override // defpackage.aftn
    public final void b(Activity activity, apxf apxfVar, @Deprecated aftl aftlVar) {
        apxf g = whu.g(apxfVar);
        if (aftlVar != null) {
            String name = getClass().getName();
            String name2 = wjc.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 46 + String.valueOf(name2).length());
            sb.append(name);
            sb.append(" does not support SignInCallback. use ");
            sb.append(name2);
            sb.append(" instead");
            throw new IllegalStateException(sb.toString());
        }
        if (!(activity instanceof ci)) {
            String name3 = getClass().getName();
            String name4 = ci.class.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name3).length() + 15 + String.valueOf(name4).length());
            sb2.append(name3);
            sb2.append(" only supports ");
            sb2.append(name4);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.d.t()) {
            this.b.d(new wjc(wjb.FINISHED, true));
            return;
        }
        if (this.d.s()) {
            this.b.d(new wjc(wjb.CANCELLED, true));
            return;
        }
        try {
            Account[] h = this.e.h();
            if (h != null && h.length != 0) {
                whl.c(this.f, h[0].name, new wjj(this, activity, g));
                return;
            }
            this.b.d(new wjc(wjb.CANCELLED, true));
        } catch (RemoteException | qnk | qnl unused) {
            this.b.d(new wjc(wjb.CANCELLED, true));
        }
    }

    @Override // defpackage.aftn
    public final void c(Activity activity, byte[] bArr, @Deprecated aftl aftlVar) {
        b(activity, wjn.g(bArr), aftlVar);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wjc.class};
        }
        if (i == 0) {
            wjc wjcVar = (wjc) obj;
            wjb wjbVar = wjb.STARTED;
            int ordinal = wjcVar.a().ordinal();
            if (ordinal == 0) {
                return null;
            }
            if (ordinal == 2 && this.c && !wjcVar.c()) {
                this.b.d(new wjc(wjb.CANCELLED, true));
            }
            this.c = false;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aftn
    public final void qj(String str) {
        this.a.k(str);
    }
}
