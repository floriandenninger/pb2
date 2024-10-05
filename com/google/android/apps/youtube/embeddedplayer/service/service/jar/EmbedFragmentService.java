package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.e;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayabilityStatusWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.t;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.aahd;
import defpackage.acsb;
import defpackage.ahbw;
import defpackage.ajjz;
import defpackage.anhy;
import defpackage.aoae;
import defpackage.apmg;
import defpackage.aqrs;
import defpackage.aryi;
import defpackage.aulq;
import defpackage.avgg;
import defpackage.oba;
import defpackage.osv;
import defpackage.otb;
import defpackage.ouu;
import defpackage.ykl;
import defpackage.ykn;
import defpackage.ynk;
import defpackage.ynl;
import defpackage.ynm;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EmbedFragmentService extends IEmbedFragmentService.Stub implements IBinder.DeathRecipient, ouu, b, c, a, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, d, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a {
    public static final /* synthetic */ int s = 0;
    private final aaea A;
    private anhy B;
    private ykn C;
    private apmg D;
    private final aadw E;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c F;
    public final osv a;
    public final ajjz b;
    public t c;
    public final f d;
    public final com.google.android.apps.youtube.embeddedplayer.service.csi.service.a e;
    com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b f;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b g;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b h;
    public a i;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b j;
    public d k;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b l;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a m;
    public final int n;
    e o;
    public aahd p;
    public volatile boolean q;
    public final aoae r;
    private final Executor t;
    private final com.google.android.apps.youtube.embeddedplayer.service.innertube.f u;
    private final Handler w;
    private final com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a x;
    private final g y;
    private final com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class ThumbnailCallback implements ykl {
        public ThumbnailCallback() {
        }

        @Override // defpackage.ykl
        public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
            EmbedFragmentService.this.z(null);
        }

        @Override // defpackage.ykl
        public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
            EmbedFragmentService.this.z((Bitmap) obj2);
        }
    }

    public EmbedFragmentService(Handler handler, t tVar, osv osvVar, aoae aoaeVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = osvVar;
        handler.getClass();
        this.w = handler;
        this.c = tVar;
        this.r = aoaeVar;
        f c = osvVar.c();
        this.d = c;
        this.e = osvVar.a();
        otb otbVar = (otb) osvVar;
        this.z = otbVar.f.e();
        this.t = otbVar.f.C();
        this.E = otbVar.f.F();
        this.A = otbVar.f.s();
        int a = c.a(i);
        this.n = a;
        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a d = otbVar.f.d();
        this.x = d;
        this.y = osvVar.d();
        d.a = otbVar.c.a;
        c.n(a);
        this.b = osvVar.f();
        this.F = otbVar.f.H();
        this.u = otbVar.f.g();
    }

    public final void A(CharSequence charSequence) {
        t tVar = this.c;
        if (tVar != null) {
            try {
                tVar.r(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void B(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b bVar) {
        this.g = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void C(VideoDetails videoDetails) {
        t tVar;
        if (this.q && (tVar = this.c) != null) {
            try {
                tVar.s(videoDetails);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void D(com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar) {
        this.m = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void E(WatchLaterButtonData watchLaterButtonData) {
        t tVar;
        if (this.q && (tVar = this.c) != null) {
            try {
                tVar.t(watchLaterButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final int a() {
        return this.n;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c b() {
        return this.x;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        i();
    }

    @Override // defpackage.ouu
    public final void c() {
        k();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
        return this.y;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final void e(int i) {
        if (i == 28664) {
            apmg apmgVar = this.D;
            if (apmgVar != null && (apmgVar.b & 32768) != 0) {
                this.d.l(this.n, apmgVar.t.I());
                return;
            }
            i = 28664;
        }
        this.d.k(this.n, acsb.c(i));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final void f() {
        this.g.i();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a
    public final void g() {
        this.w.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentService.this.i.g();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d
    public final void h(final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        this.w.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentService embedFragmentService = EmbedFragmentService.this;
                embedFragmentService.k.h(subscriptionNotificationMenuItem);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final void i() {
        this.w.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentService.this.k();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a
    public final void j() {
        this.w.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentService.this.m.j();
            }
        });
    }

    public final void k() {
        anhy anhyVar = this.B;
        if (anhyVar != null) {
            anhyVar.cancel(true);
            this.B = null;
        }
        this.r.C(this);
        t tVar = this.c;
        if (tVar != null) {
            tVar.asBinder().unlinkToDeath(this, 0);
            this.c = null;
        }
        this.d.t(this.n);
        System.gc();
    }

    public final void l() {
        anhy anhyVar = this.B;
        if (anhyVar != null) {
            anhyVar.cancel(true);
            this.B = null;
        }
        s(null);
        z(null);
        A(null);
        y(null);
        q(null);
        if (this.q) {
            n(null);
            C(VideoDetails.a);
            u(SubscribeButtonData.a);
            w(SubscriptionNotificationButtonData.a);
            x(SubscriptionNotificationMenuData.a);
            E(WatchLaterButtonData.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010e A[Catch: RuntimeException -> 0x019f, TryCatch #1 {RuntimeException -> 0x019f, blocks: (B:3:0x0001, B:10:0x0011, B:12:0x0015, B:14:0x001d, B:15:0x0021, B:17:0x0108, B:19:0x010e, B:20:0x0123, B:37:0x005c, B:38:0x0063, B:39:0x0064, B:40:0x00ad, B:44:0x00b9, B:47:0x00c1, B:50:0x0101), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor r13, j$.util.Optional r14) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService.m(com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor, j$.util.Optional):void");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void n(Bitmap bitmap) {
        t tVar;
        if (this.q && (tVar = this.c) != null) {
            try {
                tVar.h(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void o(aryi aryiVar) {
        t tVar = this.c;
        if (tVar == null) {
            return;
        }
        try {
            tVar.j(new PlayabilityStatusWrapper(aryiVar));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void p(boolean z) {
        t tVar = this.c;
        if (tVar != null) {
            try {
                tVar.i(z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void q(aulq aulqVar) {
        t tVar;
        if (this.c == null) {
            return;
        }
        if (aulqVar != null) {
            apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
            if (apmgVar != null && (tVar = this.c) != null) {
                try {
                    if (tVar.u()) {
                        this.d.s(this.n, apmgVar.t.I());
                    }
                } catch (RemoteException unused) {
                }
            }
            this.D = apmgVar;
        } else {
            this.D = null;
        }
        try {
            t tVar2 = this.c;
            if (tVar2 != null) {
                tVar2.k(this.D != null);
            }
        } catch (RemoteException unused2) {
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
    public final void r(final SimplePlaybackDescriptor simplePlaybackDescriptor) {
        aqrs E = oba.E(this.E);
        if (E == null || !E.b) {
            m(simplePlaybackDescriptor, Optional.empty());
        } else {
            ynm.k(this.z.a(), this.t, new ynk() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda1
                @Override // defpackage.zfi
                public final /* synthetic */ void a(Object obj) {
                    int i = EmbedFragmentService.s;
                }

                @Override // defpackage.ynk
                /* renamed from: b */
                public final void a(Throwable th) {
                    int i = EmbedFragmentService.s;
                }
            }, new ynl() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda3
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    EmbedFragmentService.this.m(simplePlaybackDescriptor, Optional.of(((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.d) obj).a));
                }
            });
        }
    }

    public final void s(avgg avggVar) {
        ykn yknVar = this.C;
        if (yknVar != null) {
            yknVar.d();
            this.C = null;
        }
        Uri B = avggVar != null ? ahbw.B(avggVar) : null;
        if (B == null) {
            return;
        }
        ykn c = ykn.c(new ThumbnailCallback());
        this.C = c;
        this.b.l(B, c);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(a aVar) {
        this.i = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        t tVar;
        if (this.q && (tVar = this.c) != null) {
            try {
                tVar.l(subscribeButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(d dVar) {
        this.k = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        t tVar;
        if (this.q && (tVar = this.c) != null) {
            try {
                tVar.m(subscriptionNotificationButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void x(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        t tVar;
        if (this.q && (tVar = this.c) != null) {
            try {
                tVar.n(subscriptionNotificationMenuData);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void y(CharSequence charSequence) {
        t tVar = this.c;
        if (tVar != null) {
            try {
                tVar.o(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void z(Bitmap bitmap) {
        t tVar = this.c;
        if (tVar != null) {
            try {
                tVar.q(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }
}
