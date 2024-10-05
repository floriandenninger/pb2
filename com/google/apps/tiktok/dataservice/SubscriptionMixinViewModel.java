package com.google.apps.tiktok.dataservice;

import defpackage.amcb;
import defpackage.amcd;
import defpackage.amkq;
import defpackage.apm;
import defpackage.uqq;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SubscriptionMixinViewModel extends apm {
    private final Map a = new HashMap();
    private final amcb b;

    public SubscriptionMixinViewModel() {
        new amcd("SubscriptionMixinVM");
        amcb amcbVar = new amcb();
        this.b = amcbVar;
        uqq.j();
        synchronized (amcbVar.a) {
            amcbVar.b = true;
            amcbVar.d = 1;
            Runnable runnable = amcbVar.c;
            if (runnable != null) {
                uqq.m(runnable);
                amcbVar.c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.apm
    public final void d() {
        ArrayDeque arrayDeque;
        Iterator it = this.a.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
        amcb amcbVar = this.b;
        synchronized (amcbVar.a) {
            amkq.O(amcbVar.b, "Executor may only be drained when it is suspended.");
            arrayDeque = new ArrayDeque(amcbVar.a);
            amcbVar.a.clear();
        }
        arrayDeque.clear();
    }
}
