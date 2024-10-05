package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rjj extends rdv {
    public final rji b;
    public rfg c;
    public volatile Boolean d;
    private final res e;
    private final List f;
    private final res g;
    private final tfq h;

    public rjj(rgt rgtVar) {
        super(rgtVar);
        this.f = new ArrayList();
        this.h = new tfq(null);
        this.b = new rji(this);
        this.e = new rix(this, rgtVar);
        this.g = new riz(this, rgtVar);
    }

    public final boolean A() {
        n();
        a();
        return this.c != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B() {
        n();
        a();
        return !C() || N().o() >= ((Integer) rfd.ao.a()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjj.C():boolean");
    }

    public final void D() {
        P();
    }

    @Override // defpackage.rdv
    protected final boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.AppMetadata e(boolean r37) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjj.e(boolean):com.google.android.gms.measurement.internal.AppMetadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        n();
        a();
        if (A()) {
            return;
        }
        if (C()) {
            rji rjiVar = this.b;
            rjiVar.c.n();
            Context I = rjiVar.c.I();
            synchronized (rjiVar) {
                if (rjiVar.a) {
                    rjiVar.c.aF().k.a("Connection attempt already in progress");
                    return;
                }
                if (rjiVar.b == null || (!rjiVar.b.x() && !rjiVar.b.w())) {
                    rjiVar.b = new rfl(I, Looper.getMainLooper(), rjiVar, rjiVar);
                    rjiVar.c.aF().k.a("Connecting to remote service");
                    rjiVar.a = true;
                    qip.an(rjiVar.b);
                    rjiVar.b.G();
                    return;
                }
                rjiVar.c.aF().k.a("Already awaiting connection attempt");
                return;
            }
        }
        if (J().t()) {
            return;
        }
        P();
        List<ResolveInfo> queryIntentServices = I().getPackageManager().queryIntentServices(new Intent().setClassName(I(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            aF().c.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context I2 = I();
        P();
        intent.setComponent(new ComponentName(I2, "com.google.android.gms.measurement.AppMeasurementService"));
        rji rjiVar2 = this.b;
        rjiVar2.c.n();
        Context I3 = rjiVar2.c.I();
        qtj a = qtj.a();
        synchronized (rjiVar2) {
            if (rjiVar2.a) {
                rjiVar2.c.aF().k.a("Connection attempt already in progress");
                return;
            }
            rjiVar2.c.aF().k.a("Using local app measurement service");
            rjiVar2.a = true;
            a.c(I3, intent, rjiVar2.c.b, 129);
        }
    }

    public final void p() {
        n();
        a();
        rji rjiVar = this.b;
        if (rjiVar.b != null && (rjiVar.b.w() || rjiVar.b.x())) {
            rjiVar.b.l();
        }
        rjiVar.b = null;
        try {
            qtj.a().b(I(), this.b);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.c = null;
    }

    public final void q() {
        n();
        aF().k.b("Processing queued up service tasks", Integer.valueOf(this.f.size()));
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                aF().c.b("Task exception while flushing queue", e);
            }
        }
        this.f.clear();
        this.g.a();
    }

    public final void r(AtomicReference atomicReference) {
        n();
        a();
        u(new ris(this, atomicReference, e(false)));
    }

    public final void s(ComponentName componentName) {
        n();
        if (this.c != null) {
            this.c = null;
            aF().k.b("Disconnected from device MeasurementService", componentName);
            n();
            o();
        }
    }

    public final void t() {
        n();
        this.h.a();
        res resVar = this.e;
        J();
        resVar.c(((Long) rfd.f272J.a()).longValue());
    }

    public final void u(Runnable runnable) {
        n();
        if (A()) {
            runnable.run();
            return;
        }
        int size = this.f.size();
        J();
        if (size >= 1000) {
            aF().c.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f.add(runnable);
        this.g.c(60000L);
        o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(rfg rfgVar, AbstractSafeParcelable abstractSafeParcelable, AppMetadata appMetadata) {
        int i;
        n();
        a();
        D();
        J();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List r = i().r();
            if (r != null) {
                arrayList.addAll(r);
                i = r.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof EventParcel) {
                    try {
                        rfgVar.k((EventParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e) {
                        aF().c.b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof UserAttributeParcel) {
                    try {
                        rfgVar.r((UserAttributeParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e2) {
                        aF().c.b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof ConditionalUserPropertyParcel) {
                    try {
                        rfgVar.m((ConditionalUserPropertyParcel) abstractSafeParcelable2, appMetadata);
                    } catch (RemoteException e3) {
                        aF().c.b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    aF().c.a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        n();
        a();
        P();
        rfj i = i();
        byte[] as = i.N().as(conditionalUserPropertyParcel);
        boolean z = false;
        if (as.length <= 131072) {
            if (i.q(2, as)) {
                z = true;
            }
        } else {
            i.aF().d.a("Conditional user property too long for local database. Sending directly to service");
        }
        u(new rjb(this, e(true), z, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(rij rijVar) {
        n();
        a();
        u(new riv(this, rijVar));
    }

    public final void y(Bundle bundle) {
        n();
        a();
        u(new riw(this, e(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(rfg rfgVar) {
        n();
        this.c = rfgVar;
        t();
        q();
    }
}
