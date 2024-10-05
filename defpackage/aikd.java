package defpackage;

import android.app.Notification;
import android.app.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aikd {
    private final azrw a;
    private final azrw b;
    private Service c;
    private Notification d;
    private boolean e;
    private final List f;
    private final aadw g;
    private final ajbh h;

    public aikd(azrw azrwVar, aadw aadwVar, ajbh ajbhVar, azrw azrwVar2, byte[] bArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        aadwVar.getClass();
        this.g = aadwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        this.h = ajbhVar;
        this.f = new ArrayList();
    }

    private final synchronized void i(boolean z) {
        aiwg aiwgVar;
        hn hnVar;
        if (z) {
            if (this.c == null && this.f.isEmpty() && (hnVar = (aiwgVar = (aiwg) this.a.get()).b) != null) {
                if (hnVar.k()) {
                    aiwgVar.f(true);
                }
                hnVar.i(new hq().a());
                aiwg.b(hnVar);
                hnVar.d();
                aiwgVar.b = null;
                aifo.a(aifn.MEDIASESSION, "MediaSession released", new Object[0]);
            }
        }
    }

    private final boolean j() {
        if (!this.e) {
            return false;
        }
        int i = this.h.i;
        return (i == 2 || i == 3) && this.d != null;
    }

    private static void k(Service service, Notification notification) {
        service.startForeground(2, notification);
    }

    public final synchronized void a() {
        Service service = this.c;
        if (service != null) {
            service.stopForeground(true);
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).stopForeground(true);
        }
        this.e = false;
        this.h.I();
        ((eg) this.b.get()).c(2);
        this.d = null;
    }

    public final synchronized void b(boolean z) {
        c(z);
    }

    public final synchronized void c(boolean z) {
        i(z);
    }

    public final synchronized void d(Service service) {
        if (!this.f.contains(service) && j()) {
            k(service, this.d);
        }
        this.f.add(service);
    }

    public final synchronized void e(Service service) {
        this.f.remove(service);
    }

    public final synchronized void f(Service service) {
        if (this.c != service && j() && service != null) {
            k(service, this.d);
        }
        this.c = service;
    }

    public final synchronized void g(Notification notification, boolean z) {
        boolean z2;
        this.d = notification;
        if (!z) {
            atej atejVar = this.g.b().k;
            if (atejVar == null) {
                atejVar = atej.a;
            }
            apes apesVar = atejVar.y;
            if (apesVar == null) {
                apesVar = apes.a;
            }
            if (!apesVar.b) {
                h();
                ((eg) this.b.get()).e(2, notification);
            }
        }
        Service service = this.c;
        if (service != null) {
            service.startForeground(2, notification);
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).startForeground(2, notification);
            z2 = true;
        }
        this.e = true;
        this.h.J();
        if (z2) {
            return;
        }
        ((eg) this.b.get()).e(2, notification);
    }

    public final synchronized void h() {
        Service service = this.c;
        if (service != null) {
            service.stopForeground(false);
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).stopForeground(false);
        }
        this.e = false;
    }
}
