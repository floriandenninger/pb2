package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bk;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bn;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlayerViewModeData;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.alta;
import defpackage.amkq;
import defpackage.apxf;
import defpackage.ayqj;
import defpackage.ayqr;
import defpackage.ayrm;
import defpackage.ayrv;
import defpackage.ayrz;
import defpackage.azqi;
import defpackage.azre;
import defpackage.azrh;
import defpackage.oba;
import defpackage.zbg;
import defpackage.zga;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m implements aahd {
    public static final /* synthetic */ int i = 0;
    private static WeakReference k;
    private static WeakReference l;
    public final bn a;
    public av b;
    public av c;
    public av d;
    public final e e;
    final l f;
    public final azrh g;
    final k h;
    private final HashSet m;
    private boolean n;
    private final k o;
    private final o p;
    private final j q;

    public m(Context context, a aVar, e eVar, o oVar) {
        azrh aN = azrh.aN(com.google.android.apps.youtube.embeddedplayer.service.model.d.a);
        this.g = aN;
        this.e = eVar;
        this.p = oVar;
        k kVar = new k(this, 1);
        this.h = kVar;
        k kVar2 = new k(this, 0);
        this.o = kVar2;
        l lVar = new l(this);
        this.f = lVar;
        j jVar = new j(this);
        this.q = jVar;
        this.m = new HashSet();
        this.a = new bn(context, aVar, lVar, kVar2, eVar, oVar, kVar, aN, jVar, null);
    }

    private final void A() {
        View view;
        ViewGroup viewGroup;
        if (this.b == null) {
            return;
        }
        this.p.a(null);
        this.g.c(com.google.android.apps.youtube.embeddedplayer.service.model.d.a);
        bn bnVar = this.a;
        if (!bnVar.f()) {
            oba.C();
        } else {
            try {
                bnVar.l = false;
                bnVar.c.g();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
        av avVar = this.b;
        if (avVar != null) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c cVar = avVar.c;
            Optional a = cVar.h.a();
            if (a.isPresent() && (view = cVar.d) != null && (viewGroup = cVar.c) != null) {
                viewGroup.removeView(view);
                cVar.c.addView((View) a.get());
                cVar.d = null;
            }
            this.b = null;
        }
    }

    private final boolean B(av avVar, boolean z) {
        ViewGroup viewGroup;
        av avVar2 = this.c;
        if (avVar2 == null ? !(!z || this.b == null) : avVar2 != avVar) {
            return false;
        }
        if (!avVar.equals(this.b)) {
            A();
            FrameLayout frameLayout = this.a.n;
            com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c cVar = avVar.c;
            View view = cVar.d;
            amkq.F(view == null || view == frameLayout, "Another player view is already attached.");
            cVar.d = frameLayout;
            Optional a = cVar.h.a();
            if (a.isPresent() && (viewGroup = cVar.c) != null) {
                viewGroup.removeView((View) a.get());
                cVar.c.addView(frameLayout);
            }
            try {
                this.a.c.m();
            } catch (RemoteException e) {
                oba.B(e);
            }
            this.b = avVar;
            avVar.m.E(new ayrm() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.f
                @Override // defpackage.ayrm
                public final void a() {
                    m.this.g.c(com.google.android.apps.youtube.embeddedplayer.service.model.d.a);
                }
            }).aE(this.g);
            this.p.a(this.b);
            u(avVar);
            Optional ofNullable = Optional.ofNullable((Context) avVar.e.get());
            final bn bnVar = this.a;
            bnVar.getClass();
            ofNullable.ifPresent(new Consumer() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.i
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    bn bnVar2 = bn.this;
                    Context context = (Context) obj;
                    bnVar2.a = context;
                    ak akVar = bnVar2.p;
                    akVar.G = context;
                    com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b bVar = akVar.E;
                    bVar.g = context;
                    bVar.d.c = context;
                    bVar.c.c = context;
                    bnVar2.q.c = context;
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        }
        return true;
    }

    private final boolean C(av avVar) {
        return this.c != null && this.d == avVar;
    }

    private final boolean D(av avVar) {
        if (!this.n) {
            return false;
        }
        if (avVar == this.b) {
            return true;
        }
        return C(avVar);
    }

    public static synchronized m g(Context context, a aVar) {
        m mVar;
        synchronized (m.class) {
            z(Tick.REMOTE_EMBED_COORDINATOR_INIT_START);
            mVar = new m(context, aVar, new e(new ConcurrentHashMap()), new o());
            z(Tick.REMOTE_EMBED_COORDINATOR_INIT_END);
            l = new WeakReference(mVar);
        }
        return mVar;
    }

    private static synchronized ayqj y(ayqj ayqjVar, final a aVar, final IApiPlayerFactoryService iApiPlayerFactoryService) {
        ayqj m;
        synchronized (m.class) {
            try {
                com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.h(System.currentTimeMillis());
            } catch (RemoteException unused) {
                alta.C("Csi controller service is disconnected", new Object[0]);
            }
            ayrv ayrvVar = new ayrv() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.g
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    return m.g((Context) obj, a.this);
                }
            };
            m = ayqjVar.I(ayqr.a()).G(ayrvVar).I(azre.a()).G(new ayrv() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.h
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    IApiPlayerFactoryService iApiPlayerFactoryService2 = IApiPlayerFactoryService.this;
                    m mVar = (m) obj;
                    int i2 = m.i;
                    try {
                        final bn bnVar = mVar.a;
                        bnVar.c(Tick.REMOTE_EMBEDDED_PLAYER_V2_SERVICE_INIT_START);
                        bnVar.c = iApiPlayerFactoryService2.a(new bk(bnVar), bnVar.H, bnVar.I, null, bnVar.f165J, bnVar.K, bnVar.L, bnVar.M, bnVar.N, bnVar.O, bnVar.P, bnVar.Q, bnVar.R, bnVar.S, bnVar.T, bnVar.U, false);
                        bnVar.e = bnVar.c.d();
                        bnVar.i = new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.c(bnVar.e);
                        bnVar.d = bnVar.c.e();
                        bnVar.f = bnVar.c.a();
                        com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.a(bnVar.f);
                        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.a().b(bnVar.c.b());
                        bnVar.m.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ax
                            @Override // java.lang.Runnable
                            public final void run() {
                                bn bnVar2 = bn.this;
                                bnVar2.y.k(bnVar2.U, bnVar2.d, bnVar2.e);
                                bnVar2.w.i = new WeakReference(bnVar2.d);
                                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak akVar = bnVar2.p;
                                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = bnVar2.e;
                                akVar.C = dVar;
                                akVar.E.h = dVar;
                                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b bVar = bnVar2.i;
                                akVar.D = bVar;
                                if (akVar.np()) {
                                    akVar.s.h = bVar;
                                }
                            }
                        });
                        final IApiPlayerService iApiPlayerService = bnVar.c;
                        bnVar.b = new aahd() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.az
                            @Override // defpackage.aahd
                            public final /* synthetic */ void a(apxf apxfVar) {
                                aahc.a(this, apxfVar);
                            }

                            @Override // defpackage.aahd
                            public final /* synthetic */ void b(List list) {
                                aahc.b(this, list);
                            }

                            @Override // defpackage.aahd
                            public final void c(apxf apxfVar, Map map) {
                                IApiPlayerService iApiPlayerService2 = IApiPlayerService.this;
                                int i3 = bn.W;
                                try {
                                    iApiPlayerService2.D(new CommandWrapper(apxfVar));
                                } catch (RemoteException e) {
                                    oba.B(e);
                                }
                            }

                            @Override // defpackage.aahd
                            public final /* synthetic */ void d(List list, Map map) {
                                aahc.c(this, list, map);
                            }

                            @Override // defpackage.aahd
                            public final /* synthetic */ void e(List list, Object obj2) {
                                aahc.d(this, list, obj2);
                            }
                        };
                        bnVar.D.sc(bnVar.b);
                        bnVar.c(Tick.REMOTE_EMBEDDED_PLAYER_V2_SERVICE_INIT_END);
                        bnVar.f.a();
                        return mVar;
                    } catch (RemoteException e) {
                        throw azqi.b(e);
                    }
                }
            }).m();
        }
        return m;
    }

    private static void z(Tick tick) {
        try {
            com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.e(tick, System.currentTimeMillis());
        } catch (RemoteException unused) {
            alta.C("Csi controller service is disconnected", new Object[0]);
        }
    }

    @Override // defpackage.aahd
    public final void a(apxf apxfVar) {
        aahd aahdVar = this.a.b;
        if (aahdVar != null) {
            aahc.a(aahdVar, apxfVar);
        } else {
            alta.C("Command routing not available", new Object[0]);
        }
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    @Deprecated
    public final void c(apxf apxfVar, Map map) {
        if (map != null) {
            alta.B("Routing in the remote-loaded process does not support arguments", new Object[0]);
        }
        a(apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }

    public final synchronized Bundle f(av avVar) {
        Bundle bundle = null;
        byte[] bArr = null;
        if (avVar != this.b) {
            return null;
        }
        bn bnVar = this.a;
        if (bnVar.f()) {
            Bundle bundle2 = new Bundle();
            com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bnVar.A;
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("isFullscreen", cVar.g);
            bundle2.putBundle("fullscreenHelperState", bundle3);
            try {
                bArr = bnVar.c.Q();
            } catch (RemoteException e) {
                oba.B(e);
            }
            if (bArr != null) {
                bundle2.putByteArray("apiPlayerState", bArr);
                return bundle2;
            }
            bundle = bundle2;
        }
        return bundle;
    }

    public final synchronized void i(av avVar) {
        if (avVar == null) {
            return;
        }
        if (this.b == avVar) {
            zga.b("Deregistering currently playing fragment.");
            o(avVar);
        }
        if (this.c == avVar) {
            this.c = null;
            this.d = null;
            this.a.e(false);
        }
        if (this.d == avVar) {
            this.d = null;
        }
        this.m.remove(avVar);
        if (this.m.size() == 0) {
            bn bnVar = this.a;
            if (bnVar.f()) {
                com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bnVar.A;
                cVar.b.i();
                cVar.f = false;
                bnVar.B.f();
                ayrz.c((AtomicReference) bnVar.E);
                try {
                    bnVar.c.B(true);
                    com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar = bnVar.I;
                    if (eVar != null) {
                        eVar.b();
                    }
                    Object obj = bnVar.x.d;
                    if (obj != null) {
                        ayrz.c((AtomicReference) obj);
                    }
                    com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.j jVar = bnVar.y;
                    if (!jVar.a.e()) {
                        ayrz.c((AtomicReference) jVar.a);
                    }
                    bnVar.H.b();
                    bnVar.K.b();
                    bnVar.N.c();
                    bnVar.U.c();
                    bnVar.M.b();
                    bnVar.O.b();
                    bnVar.L.b();
                    com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e eVar2 = bnVar.S;
                    com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.d dVar = eVar2.b;
                    if (dVar != null) {
                        dVar.a = null;
                        eVar2.b = null;
                    }
                    eVar2.a = null;
                    com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.a().c();
                    com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b = com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.a;
                } catch (RemoteException e) {
                    oba.B(e);
                }
                bnVar.d = null;
                bnVar.i = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
                bnVar.c = new DisconnectedApiPlayerService();
            }
            k = null;
            l = null;
        }
    }

    public final synchronized void j(String str) {
        e eVar = this.e;
        if (str != null) {
            eVar.b.remove(str);
        }
    }

    public final synchronized void k() {
        try {
            this.a.c.w();
        } catch (RemoteException e) {
            oba.B(e);
        }
    }

    public final synchronized void l(av avVar) {
        this.m.add(avVar);
    }

    public final synchronized void m(av avVar) {
        if (this.c != null) {
            zga.b("Attempting to register more than one fullscreen embed.");
            i(this.c);
        }
        this.c = avVar;
        l(avVar);
        o(this.b);
    }

    public final synchronized void n(String str, av avVar) {
        this.e.a(str, avVar);
    }

    public final synchronized void o(av avVar) {
        if (avVar == null) {
            return;
        }
        if (avVar == this.b) {
            A();
        } else if (C(avVar)) {
            x(avVar, false);
        } else {
            zga.b("Attempting to relinquish an ungranted playback.");
        }
    }

    public final synchronized void p(av avVar, SimplePlaybackDescriptor simplePlaybackDescriptor, com.google.android.apps.youtube.embeddedplayer.service.model.f fVar, boolean z) {
        if (simplePlaybackDescriptor == null) {
            zga.b("No description for playback provided.");
            return;
        }
        boolean z2 = false;
        if (B(avVar, false)) {
            String str = simplePlaybackDescriptor.b;
            if (str != null) {
                bn bnVar = this.a;
                boolean z3 = simplePlaybackDescriptor.e == 2 && !z;
                int i2 = simplePlaybackDescriptor.g;
                int i3 = avVar.o;
                if (bnVar.f()) {
                    try {
                        bnVar.l = false;
                        bnVar.x.m();
                        if (!z3) {
                            bnVar.x.k();
                        }
                        com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d dVar = bnVar.w;
                        dVar.k(4);
                        dVar.e.removeMessages(1);
                        bnVar.p.ng();
                        bnVar.y.kV();
                        bnVar.V.b(new PlayerViewModeData(0));
                        com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bnVar.A;
                        if (cVar.e != fVar) {
                            cVar.e = fVar;
                            zbg zbgVar = cVar.b;
                            if (cVar.e.b && cVar.c != null && !cVar.d.hasFeature(9)) {
                                z2 = true;
                            }
                            zbgVar.p(!z2);
                        }
                        bnVar.f.g(Tick.REMOTE_SENDS_MAIN_APP_REQUEST, System.currentTimeMillis());
                        bnVar.c.p(str, z3, i2, z, i3);
                        return;
                    } catch (RemoteException e) {
                        oba.B(e);
                        return;
                    }
                }
                oba.C();
                return;
            }
            String str2 = simplePlaybackDescriptor.c;
            if (str2 != null) {
                bn bnVar2 = this.a;
                int i4 = simplePlaybackDescriptor.f;
                int i5 = simplePlaybackDescriptor.g;
                int i6 = avVar.o;
                if (bnVar2.f()) {
                    try {
                        bnVar2.l = false;
                        bnVar2.c.o(str2, i4, i5, z, i6);
                        return;
                    } catch (RemoteException e2) {
                        oba.B(e2);
                        return;
                    }
                }
                oba.C();
                return;
            }
            ArrayList arrayList = simplePlaybackDescriptor.d;
            if (arrayList != null) {
                bn bnVar3 = this.a;
                int i7 = simplePlaybackDescriptor.f;
                int i8 = simplePlaybackDescriptor.g;
                int i9 = avVar.o;
                if (bnVar3.f()) {
                    try {
                        bnVar3.l = false;
                        bnVar3.c.q(arrayList, i7, i8, z, i9);
                        return;
                    } catch (RemoteException e3) {
                        oba.B(e3);
                        return;
                    }
                }
                oba.C();
                return;
            }
            zga.b("No playback information provided; cannot start playback.");
            return;
        }
    }

    public final synchronized void q(av avVar, Bundle bundle) {
        if (B(avVar, true)) {
            bn bnVar = this.a;
            if (bnVar.f()) {
                Bundle bundle2 = bundle.getBundle("fullscreenHelperState");
                if (bundle2 != null) {
                    com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bnVar.A;
                    if (bundle2.getBoolean("isFullscreen")) {
                        cVar.h.a.e(true);
                    }
                }
                if (!bnVar.B.l()) {
                    alta.C("Aborting Fragment restoration because player is not visible", new Object[0]);
                } else {
                    byte[] byteArray = bundle.getByteArray("apiPlayerState");
                    if (byteArray != null) {
                        try {
                            bnVar.c.t(byteArray);
                        } catch (RemoteException e) {
                            oba.B(e);
                        }
                    }
                }
            }
            av avVar2 = this.c;
            if (avVar2 != null && avVar2 == avVar) {
                bn bnVar2 = this.a;
                if (bnVar2.F) {
                    bnVar2.b();
                }
            }
        }
    }

    public final synchronized void r(String str) {
        bn bnVar = this.a;
        if (!bnVar.f()) {
            oba.C();
            return;
        }
        try {
            bnVar.c.K(str);
        } catch (RemoteException e) {
            oba.B(e);
        }
    }

    public final synchronized void s() {
        bn bnVar = this.a;
        if (!bnVar.f()) {
            oba.C();
            return;
        }
        try {
            bnVar.c.L();
        } catch (RemoteException e) {
            oba.B(e);
        }
    }

    public final synchronized boolean t(av avVar) {
        boolean D;
        D = D(avVar);
        if (D) {
            bn bnVar = this.a;
            if (!bnVar.f()) {
                oba.C();
            } else {
                try {
                    bnVar.c.y();
                } catch (RemoteException e) {
                    oba.B(e);
                }
            }
        }
        return D;
    }

    public final synchronized void u(av avVar) {
        if (avVar == this.b && !this.n) {
            this.n = true;
            bn bnVar = this.a;
            if (!bnVar.f()) {
                oba.C();
                return;
            }
            try {
                bnVar.c.f();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    public final synchronized void v(av avVar, boolean z) {
        if (avVar == this.b && this.n) {
            this.n = false;
            bn bnVar = this.a;
            if (!bnVar.f()) {
                oba.C();
                return;
            }
            try {
                bnVar.c.k(z);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    public final synchronized void w(av avVar) {
        if (D(avVar)) {
            this.a.d();
        }
    }

    public final synchronized void x(av avVar, boolean z) {
        if (D(avVar)) {
            this.a.e(z);
        }
    }

    public static synchronized ayqj h(ayqj ayqjVar, a aVar, IApiPlayerFactoryService iApiPlayerFactoryService) {
        synchronized (m.class) {
            WeakReference weakReference = l;
            ayqj ayqjVar2 = null;
            m mVar = weakReference == null ? null : (m) weakReference.get();
            if (mVar != null) {
                return ayqj.F(mVar);
            }
            WeakReference weakReference2 = k;
            if (weakReference2 != null) {
                ayqjVar2 = (ayqj) weakReference2.get();
            }
            if (ayqjVar2 != null) {
                return ayqjVar2;
            }
            ayqj y = y(ayqjVar, aVar, iApiPlayerFactoryService);
            k = new WeakReference(y);
            return y;
        }
    }
}
