package com.google.android.libraries.youtube.player.features.markers.sync;

import android.util.Pair;
import com.google.android.libraries.youtube.player.features.markers.sync.TimedSyncObserverImpl;
import defpackage.aahd;
import defpackage.aahv;
import defpackage.afly;
import defpackage.afsy;
import defpackage.ahfo;
import defpackage.ahty;
import defpackage.ahua;
import defpackage.ahub;
import defpackage.aioc;
import defpackage.ajyw;
import defpackage.ammv;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.ayrs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TimedSyncObserverImpl implements ahub {
    public long a;
    public boolean b;
    public boolean c;
    private final aioc d;
    private final ayqw e = new ayqw();
    private final Map f = new HashMap();
    private final ajyw g;

    public TimedSyncObserverImpl(aioc aiocVar, ajyw ajywVar, byte[] bArr, byte[] bArr2) {
        this.d = aiocVar;
        this.g = ajywVar;
    }

    @Override // defpackage.ahub
    public final void g(String str, String str2) {
        Pair create = Pair.create(str, str2);
        ahty ahtyVar = (ahty) this.f.get(create);
        if (ahtyVar == null) {
            return;
        }
        ahtyVar.c();
        this.f.remove(create);
    }

    @Override // defpackage.ahyl
    public final void h(int i, long j) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        this.c = z;
        if (i == 4 || i == 5 || j == this.a) {
            return;
        }
        this.a = j;
        j(j);
    }

    @Override // defpackage.ahub
    public final void i(String str, String str2, ammv ammvVar) {
        Pair create = Pair.create(str, str2);
        if (this.f.containsKey(create)) {
            return;
        }
        ajyw ajywVar = this.g;
        aahv aahvVar = (aahv) ajywVar.c.get();
        aahvVar.getClass();
        afsy afsyVar = (afsy) ajywVar.b.get();
        afsyVar.getClass();
        aahd aahdVar = (aahd) ajywVar.a.get();
        aahdVar.getClass();
        str.getClass();
        str2.getClass();
        ahua ahuaVar = new ahua(aahvVar, afsyVar, aahdVar, str, str2, ammvVar);
        ahuaVar.b(this.a);
        this.f.put(create, ahuaVar);
    }

    public final void j(long j) {
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((ahty) it.next()).a(j);
        }
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

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.e.c();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((ahty) it.next()).c();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((ahty) it.next()).b(this.a);
        }
        final int i = 1;
        final int i2 = 0;
        this.e.g(this.d.G().e.Y(new ayrs(this) { // from class: ahuc
            public final /* synthetic */ TimedSyncObserverImpl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    this.a.b = ((Boolean) obj).booleanValue();
                    return;
                }
                TimedSyncObserverImpl timedSyncObserverImpl = this.a;
                aheg ahegVar = (aheg) obj;
                if (timedSyncObserverImpl.b || timedSyncObserverImpl.c) {
                    return;
                }
                long e = ahegVar.e();
                if (e != timedSyncObserverImpl.a) {
                    timedSyncObserverImpl.a = e;
                    timedSyncObserverImpl.j(e);
                }
            }
        }, ahfo.m), this.d.G().b.A(afly.l).Y(new ayrs(this) { // from class: ahuc
            public final /* synthetic */ TimedSyncObserverImpl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    this.a.b = ((Boolean) obj).booleanValue();
                    return;
                }
                TimedSyncObserverImpl timedSyncObserverImpl = this.a;
                aheg ahegVar = (aheg) obj;
                if (timedSyncObserverImpl.b || timedSyncObserverImpl.c) {
                    return;
                }
                long e = ahegVar.e();
                if (e != timedSyncObserverImpl.a) {
                    timedSyncObserverImpl.a = e;
                    timedSyncObserverImpl.j(e);
                }
            }
        }, ahfo.m));
    }
}
