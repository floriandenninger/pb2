package com.google.android.libraries.youtube.offline.transfer.service;

import android.app.Notification;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;
import defpackage.aaea;
import defpackage.acpx;
import defpackage.acpz;
import defpackage.adyl;
import defpackage.afhs;
import defpackage.afhy;
import defpackage.agmq;
import defpackage.agnf;
import defpackage.agnz;
import defpackage.agof;
import defpackage.agon;
import defpackage.agsd;
import defpackage.agsg;
import defpackage.agtv;
import defpackage.agtw;
import defpackage.agud;
import defpackage.agui;
import defpackage.aguj;
import defpackage.agus;
import defpackage.agvo;
import defpackage.agvp;
import defpackage.agwc;
import defpackage.agwe;
import defpackage.agwf;
import defpackage.agwg;
import defpackage.agzr;
import defpackage.ammv;
import defpackage.ammx;
import defpackage.amnv;
import defpackage.amrz;
import defpackage.aqxl;
import defpackage.atqs;
import defpackage.avjo;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.azrw;
import defpackage.efd;
import defpackage.efz;
import defpackage.ptk;
import defpackage.shf;
import defpackage.yjj;
import defpackage.zga;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OfflineTransferService extends agud {
    public SharedPreferences h;
    public Executor i;
    public azrw j;
    public azrw k;
    public azrw l;
    public agmq m;
    public agus n;
    public aaea o;
    public acpz p;
    public Executor q;
    public agsd r;
    public agvp s;
    public agwg t;
    private volatile String u;
    private Notification v;
    private SharedPreferences.OnSharedPreferenceChangeListener w;
    private ayqx x;

    private final void s() {
        agtw.B(this.h, ((agof) this.l.get()).d(), true);
    }

    private final void t() {
        if (Build.VERSION.SDK_INT < 26 || getApplicationInfo().targetSdkVersion < 26) {
            return;
        }
        Notification a = ((agon) this.j.get()).a();
        this.v = a;
        if (a != null) {
            startForeground(13, a);
        }
    }

    @Override // defpackage.agud
    protected final aguj a(agui aguiVar) {
        return this.n.a(aguiVar, ammx.d(getClass().getCanonicalName()), this.s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agud
    public final void b() {
        if (this.g) {
            stopSelf();
        }
    }

    @Override // defpackage.agud, defpackage.agui
    public final void c(boolean z) {
        if (this.e.e() <= 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((agtv) it.next()).c();
            }
            this.g = true;
            b();
        }
        if (z) {
            agtw.B(this.h, ((agof) this.l.get()).d(), false);
        }
    }

    @Override // defpackage.agud, defpackage.agui
    public final void d(Map map) {
        this.b.putAll(map);
        this.c = true;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agtv) it.next()).g();
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            if (((agnz) it2.next()).c()) {
                s();
                return;
            }
        }
    }

    @Override // defpackage.agud, defpackage.agui
    public final void e(agnz agnzVar) {
        this.b.put(agnzVar.a, agnzVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agtv) it.next()).a(agnzVar);
        }
        s();
    }

    @Override // defpackage.agud, defpackage.agui
    public final void g(final agnz agnzVar, final boolean z) {
        this.b.put(agnzVar.a, agnzVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agtv) it.next()).e(agnzVar);
        }
        this.a.execute(new Runnable() { // from class: agwd
            @Override // java.lang.Runnable
            public final void run() {
                OfflineTransferService.this.r(agnzVar, z);
            }
        });
    }

    @Override // defpackage.agud, defpackage.agui
    public final void h(agnz agnzVar) {
        this.b.remove(agnzVar.a);
        for (agtv agtvVar : this.d) {
            agtvVar.f(agnzVar);
            if ((agnzVar.c & 512) != 0) {
                agtvVar.b(agnzVar);
            }
        }
        if (agtw.ai(agnzVar) && agnzVar.a.equals(this.u)) {
            this.u = null;
        }
        this.a.execute(new agwc(this, agnzVar, 1));
    }

    @Override // defpackage.agud, defpackage.agui
    public final void l(agnz agnzVar, atqs atqsVar, agnf agnfVar) {
        this.b.put(agnzVar.a, agnzVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agtv) it.next()).k(agnzVar, atqsVar, agnfVar);
        }
        if (agtw.ai(agnzVar)) {
            if (agnzVar.b == avjo.TRANSFER_STATE_COMPLETE) {
                if (agnzVar.a.equals(this.u)) {
                    this.u = null;
                }
            } else if (agnzVar.b == avjo.TRANSFER_STATE_TRANSFERRING) {
                this.u = agnzVar.a;
            }
        }
        this.a.execute(new agwc(this, agnzVar, 0));
    }

    @Override // defpackage.agud
    public final void n() {
        Notification notification = this.v;
        if (notification != null) {
            startForeground(13, notification);
        } else {
            stopForeground(true);
        }
    }

    @Override // defpackage.agud
    protected final void o() {
        this.q.execute(new Runnable() { // from class: agwb
            @Override // java.lang.Runnable
            public final void run() {
                OfflineTransferService offlineTransferService = OfflineTransferService.this;
                String d = ((agof) offlineTransferService.l.get()).d();
                if ("NO_OP_STORE_TAG".equals(d)) {
                    return;
                }
                offlineTransferService.e.l(d);
            }
        });
    }

    @Override // defpackage.agud, android.app.Service
    public final void onCreate() {
        zga.g("[Offline] Creating OfflineTransferService...");
        efd kv = ((agwe) yjj.o(getApplication(), agwe.class)).kv();
        this.h = (SharedPreferences) kv.a.z.get();
        this.i = (Executor) kv.a.lj.get();
        efz efzVar = kv.a;
        this.j = efzVar.lf;
        this.k = efzVar.gU;
        this.l = efzVar.gH;
        this.m = (agmq) efzVar.li.get();
        this.n = kv.a.fC();
        this.o = (aaea) kv.a.K.get();
        this.p = (acpz) kv.a.gV.get();
        this.q = (Executor) kv.a.f.get();
        this.r = (agsd) kv.a.gS.get();
        efz efzVar2 = kv.a;
        azrw azrwVar = efzVar2.gH;
        amnv amnvVar = (amnv) efzVar2.ga.get();
        shf shfVar = (shf) kv.a.g.get();
        efz efzVar3 = kv.a;
        this.s = afhy.e(azrwVar, amnvVar, shfVar, efzVar3.gn, (ptk) efzVar3.gE.get(), ammv.j(kv.a.ei()), amrz.n(5, kv.a.lk, 4, kv.a.lw, 3, kv.a.lx, 2, kv.a.ly), (adyl) kv.a.gq.get(), (afhs) kv.a.gg.get());
        this.t = (agwg) kv.a.a.dl.get();
        super.onCreate();
        agwf agwfVar = new agwf(this);
        this.w = agwfVar;
        this.h.registerOnSharedPreferenceChangeListener(agwfVar);
        this.x = this.r.a(new ayrs() { // from class: agwa
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                OfflineTransferService.this.q();
            }
        });
        q();
        if (agzr.i(this.o)) {
            this.p.b(new acpx(1, 6), aqxl.FLOW_TYPE_OFFLINE_TRANSFER_SERVICE);
        }
        t();
        p(this.m);
        p(this.t);
        Executor executor = this.i;
        this.a = executor;
        agvo agvoVar = this.f;
        if (agvoVar != null) {
            agvoVar.b = executor;
        }
    }

    @Override // defpackage.agud, android.app.Service
    public final void onDestroy() {
        zga.g("[Offline] Destroying OfflineTransferService...");
        if (agzr.i(this.o)) {
            this.p.b(new acpx(2, 6), aqxl.FLOW_TYPE_OFFLINE_TRANSFER_SERVICE);
        }
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.w;
        if (onSharedPreferenceChangeListener != null) {
            this.h.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
        super.onDestroy();
        Object obj = this.x;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.x = null;
        }
    }

    @Override // defpackage.agud, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        zga.g("[Offline] OfflineTransferService onStartCommand");
        t();
        if (intent != null) {
            this.e.g(intent.getAction(), intent.getExtras());
        }
        this.g = false;
        return 1;
    }

    public final void q() {
        this.e.o(((agsg) this.k.get()).w());
    }

    public final void r(agnz agnzVar, boolean z) {
        ((agon) this.j.get()).C(agnzVar, z);
    }
}
