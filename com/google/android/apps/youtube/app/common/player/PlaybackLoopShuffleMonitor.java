package com.google.android.apps.youtube.app.common.player;

import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import defpackage.ahdu;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.eoo;
import defpackage.flg;
import defpackage.ypd;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaybackLoopShuffleMonitor implements any, ypd {
    public int a;
    public boolean b;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());
    private final aioc d;
    private ayqx e;

    public PlaybackLoopShuffleMonitor(aioc aiocVar) {
        this.d = aiocVar;
    }

    public final void g(flg flgVar) {
        this.c.add(flgVar);
    }

    public final void h(ahdu ahduVar) {
        int i = this.a;
        boolean z = this.b;
        this.a = ahduVar.a();
        boolean d = ahduVar.d();
        this.b = d;
        if (i == this.a && z == d) {
            return;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((flg) it.next()).g(this.a, this.b);
        }
    }

    public final void i(flg flgVar) {
        this.c.remove(flgVar);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdu.class};
        }
        if (i == 0) {
            h((ahdu) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.e = this.d.am().Y(new ayrs() { // from class: flf
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                PlaybackLoopShuffleMonitor.this.h((ahdu) obj);
            }
        }, eoo.k);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        Object obj = this.e;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.e = null;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
