package com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded;

import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d {
    public final Handler a;
    private final Map b = DesugarCollections.synchronizedMap(new HashMap());

    public d(Handler handler) {
        this.a = handler;
    }

    public final synchronized void a(BusSupported$Data busSupported$Data) {
        Set set = (Set) this.b.get(busSupported$Data.d());
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(busSupported$Data);
        }
    }

    public final synchronized void b(BusSupported$Data[] busSupported$DataArr) {
        Set set = (Set) this.b.get(busSupported$DataArr[0].d());
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((c) it.next()).e();
        }
    }

    public final synchronized void c(com.google.android.apps.youtube.embeddedplayer.service.model.b bVar, c cVar) {
        Set set = (Set) this.b.get(bVar);
        if (set == null) {
            set = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
            this.b.put(bVar, set);
        }
        set.add(cVar);
    }
}
