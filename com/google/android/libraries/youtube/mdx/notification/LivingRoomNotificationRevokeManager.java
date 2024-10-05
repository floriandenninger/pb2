package com.google.android.libraries.youtube.mdx.notification;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRevokeManager;
import defpackage.acue;
import defpackage.acuo;
import defpackage.acvk;
import defpackage.acvl;
import defpackage.acvm;
import defpackage.adgv;
import defpackage.adlu;
import defpackage.afte;
import defpackage.aftf;
import defpackage.afto;
import defpackage.amru;
import defpackage.anaf;
import defpackage.anhy;
import defpackage.any;
import defpackage.anzg;
import defpackage.aok;
import defpackage.atbf;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.shf;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zga;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LivingRoomNotificationRevokeManager extends acuo implements aftf, any, ypd {
    static final long a;
    public final ypa b;
    public final adgv c;
    public boolean d;
    private final shf e;
    private final boolean f;
    private final NotificationManager g;
    private final acue h;
    private ayqx i;
    private final anzg j;

    static {
        zga.a("MDX.NotificationRevokeManager");
        a = TimeUnit.HOURS.toMillis(3L);
    }

    public LivingRoomNotificationRevokeManager(anzg anzgVar, shf shfVar, Context context, afte afteVar, ypa ypaVar, adgv adgvVar, boolean z, acue acueVar, acvm acvmVar, byte[] bArr) {
        super(acvmVar);
        this.j = anzgVar;
        this.e = shfVar;
        this.b = ypaVar;
        this.f = z;
        this.c = adgvVar;
        this.g = (NotificationManager) context.getSystemService("notification");
        this.h = acueVar;
        this.i = n();
        afteVar.i(this);
    }

    private final ayqx n() {
        return this.h.k().ax(new ayrs() { // from class: adgz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                LivingRoomNotificationRevokeManager livingRoomNotificationRevokeManager = LivingRoomNotificationRevokeManager.this;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() == livingRoomNotificationRevokeManager.d) {
                    return;
                }
                livingRoomNotificationRevokeManager.d = bool.booleanValue();
                livingRoomNotificationRevokeManager.rb();
            }
        });
    }

    @Override // defpackage.acvj
    public final anhy a() {
        int i = true != this.f ? 3600 : 15;
        acvk a2 = acvl.a();
        a2.b(!this.d ? false : m());
        a2.c(8);
        a2.d(i);
        a2.e(i);
        return anaf.O(a2.a());
    }

    @Override // defpackage.acvj
    public final String b() {
        return "LivingRoomNotificationRevokeManager";
    }

    @Override // defpackage.acvj
    public final void c(amru amruVar) {
        if (m()) {
            if (!amruVar.isEmpty()) {
                long f = this.j.f();
                if (f == 0 || this.e.c() - f < a) {
                    return;
                }
                adgv adgvVar = this.c;
                zga.h(adgv.a, "LR Notification revoked due to TTL.");
                adgvVar.a(atbf.MDX_NOTIFICATION_GEL_ACTION_REVOKED_TTL);
                i();
                return;
            }
            adgv adgvVar2 = this.c;
            zga.h(adgv.a, "LR Notification revoked because no devices were found.");
            adgvVar2.a(atbf.MDX_NOTIFICATION_GEL_ACTION_REVOKED_DEVICE_NOT_FOUND);
            i();
        }
    }

    @Override // defpackage.acvj
    public final void d() {
    }

    @Override // defpackage.acuo, defpackage.acvj
    public final void h() {
    }

    final void i() {
        if (m()) {
            int e = this.j.e();
            this.g.cancel(this.j.g(), e);
            this.j.h();
        }
    }

    @Override // defpackage.aftf
    public final void j() {
        if (m()) {
            this.c.c();
            i();
        }
    }

    @Override // defpackage.aftf
    public final void k() {
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adlu.class, afto.class};
        }
        if (i == 0) {
            if (((adlu) obj).a() == null || !m()) {
                return null;
            }
            adgv adgvVar = this.c;
            zga.h(adgv.a, "LR Notification revoked because an MDx session was started.");
            adgvVar.a(atbf.MDX_NOTIFICATION_GEL_ACTION_REVOKED_STARTED_CASTING);
            i();
            this.b.m(this);
            return null;
        }
        if (i == 1) {
            if (!m()) {
                return null;
            }
            this.c.c();
            i();
            this.b.m(this);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aftf
    public final void l() {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    final boolean m() {
        int e = this.j.e();
        if (e == -1) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        StatusBarNotification[] activeNotifications = this.g.getActiveNotifications();
        if (activeNotifications == null) {
            this.j.h();
            return false;
        }
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            String g = this.j.g();
            if (statusBarNotification != null && statusBarNotification.getId() == e && statusBarNotification.getTag().equals(g)) {
                return true;
            }
        }
        this.j.h();
        return false;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        ayrz.c((AtomicReference) this.i);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (this.i.e()) {
            this.i = n();
        }
    }
}
