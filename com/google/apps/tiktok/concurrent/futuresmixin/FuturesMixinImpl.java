package com.google.apps.tiktok.concurrent.futuresmixin;

import defpackage.adz;
import defpackage.amcd;
import defpackage.amce;
import defpackage.amcf;
import defpackage.amcg;
import defpackage.amch;
import defpackage.amil;
import defpackage.amio;
import defpackage.amjw;
import defpackage.amkq;
import defpackage.anhy;
import defpackage.any;
import defpackage.aoe;
import defpackage.aof;
import defpackage.aok;
import defpackage.aps;
import defpackage.apu;
import defpackage.azrw;
import defpackage.dd;
import defpackage.qqe;
import defpackage.uqq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FuturesMixinImpl extends amcf implements any {
    private FuturesMixinViewModel a;
    private final azrw b;
    private final apu c;
    private final aof d;
    private final amch e = new amch();
    private boolean f = false;
    private boolean g = false;
    private final Set h = new HashSet();

    public FuturesMixinImpl(azrw azrwVar, apu apuVar, aof aofVar) {
        this.b = azrwVar;
        this.c = apuVar;
        aofVar.b(this);
        this.d = aofVar;
    }

    private final void i() {
        Iterator it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            amcg amcgVar = (amcg) it.next();
            amcd amcdVar = this.a.b;
            uqq.j();
            Class<?> cls = amcgVar.getClass();
            if (amcdVar.d.containsKey(cls)) {
                amkq.Q(amcdVar.c.put(Integer.valueOf(((Integer) amcdVar.d.get(cls)).intValue()), amcgVar) == null, "Attempted to register the callback class % twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices", cls);
            } else {
                int andIncrement = amcd.a.getAndIncrement();
                adz adzVar = amcdVar.d;
                Integer valueOf = Integer.valueOf(andIncrement);
                adzVar.put(cls, valueOf);
                amcdVar.c.put(valueOf, amcgVar);
            }
        }
        this.h.clear();
        this.g = true;
        uqq.m(this.e);
        this.e.a.clear();
        this.f = true;
        FuturesMixinViewModel futuresMixinViewModel = this.a;
        futuresMixinViewModel.d = true;
        amcd amcdVar2 = futuresMixinViewModel.b;
        uqq.j();
        for (Map.Entry entry : amcdVar2.d.entrySet()) {
            amkq.Q(amcdVar2.c.containsKey(entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
        for (ParcelableFuture parcelableFuture : futuresMixinViewModel.c) {
            if (!parcelableFuture.b) {
                amil m = amjw.m("onPending FuturesMixin", amio.a);
                try {
                    Object obj = parcelableFuture.c;
                    m.close();
                } catch (Throwable th) {
                    try {
                        m.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } else {
                try {
                    futuresMixinViewModel.b.a(parcelableFuture.a);
                } catch (NullPointerException e) {
                    String valueOf2 = String.valueOf(parcelableFuture);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 7);
                    sb.append("future=");
                    sb.append(valueOf2);
                    throw new IllegalStateException(sb.toString(), e);
                }
            }
            parcelableFuture.b(futuresMixinViewModel);
        }
    }

    @Override // defpackage.amcf
    public final void g(amcg amcgVar) {
        uqq.j();
        amkq.O(!this.g, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        amkq.O(!this.d.a().a(aoe.STARTED), "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        amkq.O(!this.f, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        this.h.add(amcgVar);
    }

    @Override // defpackage.amcf
    public final void h(amce amceVar, qqe qqeVar, amcg amcgVar) {
        uqq.j();
        amkq.O(!((dd) this.b.get()).Y(), "Listen called outside safe window. State loss is possible.");
        FuturesMixinViewModel futuresMixinViewModel = this.a;
        anhy anhyVar = amceVar.a;
        Object obj = qqeVar.a;
        uqq.j();
        WeakHashMap weakHashMap = amjw.a;
        amcd amcdVar = futuresMixinViewModel.b;
        uqq.j();
        Integer num = (Integer) amcdVar.d.get(amcgVar.getClass());
        amkq.Q(num != null, "The callback %s has not been registered", amcgVar.getClass());
        amkq.Q(amcdVar.a(num.intValue()) == amcgVar, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", amcgVar.getClass());
        ParcelableFuture parcelableFuture = new ParcelableFuture(num.intValue(), obj, anhyVar);
        futuresMixinViewModel.c.add(parcelableFuture);
        if (futuresMixinViewModel.d) {
            parcelableFuture.b(futuresMixinViewModel);
            anhyVar.isDone();
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.a = (FuturesMixinViewModel) new aps(this.c).a(FuturesMixinViewModel.class);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        FuturesMixinViewModel futuresMixinViewModel = this.a;
        amkq.O(!futuresMixinViewModel.d, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        amcd amcdVar = futuresMixinViewModel.b;
        uqq.j();
        amcdVar.c.clear();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        if (this.f) {
            return;
        }
        i();
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (this.f) {
            FuturesMixinViewModel futuresMixinViewModel = this.a;
            futuresMixinViewModel.d = false;
            Iterator it = futuresMixinViewModel.c.iterator();
            while (it.hasNext()) {
                ((ParcelableFuture) it.next()).b(null);
            }
            this.f = false;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        amkq.O(!this.f, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        i();
    }
}
