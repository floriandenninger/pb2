package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.au;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import com.google.android.apps.youtube.embeddedplayer.service.model.AdEventData;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import defpackage.alta;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e implements com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c {
    public d a;
    public final ConcurrentMap b;

    public e() {
        this(new ConcurrentHashMap());
    }

    public e(ConcurrentMap concurrentMap) {
        this.b = concurrentMap;
    }

    public final void a(String str, av avVar) {
        if (str == null || avVar == null) {
            return;
        }
        this.b.put(str, new WeakReference(avVar));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final synchronized void b(BusSupported$Data busSupported$Data) {
        av avVar;
        if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.AD_EVENT_DATA) && (busSupported$Data instanceof AdEventData)) {
            AdEventData adEventData = (AdEventData) busSupported$Data;
            d dVar = this.a;
            if (dVar != null) {
                dVar.a(adEventData.b());
            }
            WeakReference weakReference = (WeakReference) this.b.get(adEventData.e());
            if (weakReference != null && (avVar = (av) weakReference.get()) != null) {
                int b = adEventData.b();
                int a = adEventData.a();
                int i = avVar.t;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    avVar.a.add(au.c(b, a));
                } else if (i2 == 1) {
                    avVar.k(b, a);
                } else if (i2 == 2) {
                    alta.C("Ad events are unauthorized", new Object[0]);
                }
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void e() {
    }
}
