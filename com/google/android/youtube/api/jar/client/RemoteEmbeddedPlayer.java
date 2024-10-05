package com.google.android.youtube.api.jar.client;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.TextureView;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.s;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.t;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.k;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import defpackage.acsc;
import defpackage.alvc;
import defpackage.oba;
import defpackage.zga;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoteEmbeddedPlayer extends alvc {
    private IApiPlayerService S;
    private final int T;
    private com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c U;
    private com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d V;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b W;
    private final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e X;
    private final k Y;
    private final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b Z;
    public boolean a;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b aa;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b ab;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b ac;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b ad;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b ae;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b af;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b ag;
    private final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e ah;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;

    static {
        zga.k("YouTubeAndroidPlayerAPI");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private RemoteEmbeddedPlayer(android.content.Context r27, android.app.Activity r28, com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer.<init>(android.content.Context, android.app.Activity, com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService, boolean):void");
    }

    private final void aB(SimplePlaybackDescriptor simplePlaybackDescriptor) {
        com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = this.V;
        if (dVar != null) {
            try {
                dVar.f(this.T, simplePlaybackDescriptor, true);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.alvc
    public final boolean A() {
        return this.c;
    }

    @Override // defpackage.alvc
    public final boolean B() {
        try {
            return this.S.O();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final boolean C() {
        return this.a;
    }

    @Override // defpackage.alvc
    public final boolean D(VisibilityChangeEventData visibilityChangeEventData) {
        if (!au()) {
            return false;
        }
        try {
            this.S.s(visibilityChangeEventData);
            return true;
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final boolean E(int i, KeyEvent keyEvent) {
        try {
            this.S.u(i, keyEvent);
            return false;
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final boolean F(int i, KeyEvent keyEvent) {
        try {
            this.S.v(i, keyEvent);
            return false;
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    protected final boolean G(byte[] bArr) {
        try {
            return this.S.P(bArr);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    protected final byte[] H() {
        try {
            return this.S.R();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final int a() {
        long j = this.f;
        if (j < -2147483648L || j > 2147483647L) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("32 bit time overflow: ");
            sb.append(j);
            zga.l(sb.toString());
        }
        return (int) this.f;
    }

    @Override // defpackage.alvc
    public final int b() {
        long j = this.g;
        if (j < -2147483648L || j > 2147483647L) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("32 bit time overflow: ");
            sb.append(j);
            zga.l(sb.toString());
        }
        return (int) this.g;
    }

    @Override // defpackage.alvc
    public final void d(String str, int i, int i2) {
        aB(SimplePlaybackDescriptor.b(str, 0, i, i2));
        try {
            this.d = false;
            this.f = i2;
            this.S.h(str, i, i2, this.T);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void e(String str, int i) {
        aB(SimplePlaybackDescriptor.d(str, 0, i));
        try {
            this.d = false;
            this.f = i;
            this.S.i(str, i, this.T);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void f(List list, int i, int i2) {
        aB(SimplePlaybackDescriptor.e(list, 0, i, i2));
        try {
            this.d = false;
            this.f = i2;
            this.S.j(list, i, i2, this.T);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void h(String str, int i, int i2) {
        aB(SimplePlaybackDescriptor.b(str, 1, i, i2));
        try {
            this.d = false;
            this.f = i2;
            this.S.o(str, i, i2, false, this.T);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void i(String str, int i) {
        aB(SimplePlaybackDescriptor.d(str, 1, i));
        try {
            this.d = false;
            this.f = i;
            this.S.p(str, false, i, false, this.T);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void j(List list, int i, int i2) {
        aB(SimplePlaybackDescriptor.e(list, 1, i, i2));
        try {
            this.d = false;
            this.f = i2;
            this.S.q(list, i, i2, false, this.T);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void k(acsc acscVar) {
        com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = this.V;
        if (dVar != null) {
            try {
                dVar.h(acscVar.a);
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.alvc
    public final void r(boolean z) {
        try {
            this.S.B(z);
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar = this.X;
            if (eVar != null) {
                eVar.b();
            }
            k kVar = this.Y;
            if (kVar != null) {
                t tVar = kVar.c;
                TextureView textureView = tVar.a;
                if (textureView != null) {
                    tVar.removeView(textureView);
                }
                tVar.a = null;
                s sVar = kVar.b;
                if (sVar != null) {
                    sVar.a = null;
                    sVar.b = null;
                    kVar.b = null;
                }
            }
            com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = this.V;
            if (dVar != null) {
                dVar.l(this.T);
            }
            this.W.b();
            this.aa.b();
            this.ah.c();
            this.N.c();
            this.ac.b();
            this.ad.b();
            this.ab.b();
        } catch (RemoteException unused) {
        }
        this.V = null;
        this.U = null;
        com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.a().c();
        this.S = new DisconnectedApiPlayerService();
    }

    @Override // defpackage.alvc
    public final boolean z() {
        return this.b;
    }

    @Override // defpackage.alvc
    public final void c() {
        try {
            this.S.m();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void g() {
        if (!this.e) {
            this.d = true;
            return;
        }
        try {
            this.d = false;
            this.S.n();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void l() {
        try {
            this.S.r();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void m(boolean z) {
        try {
            this.S.k(z);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void n() {
        try {
            this.S.f();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void o() {
        try {
            this.d = false;
            this.S.x();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void p() {
        try {
            this.d = false;
            this.S.y();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void q() {
        try {
            this.S.z();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void s(int i) {
        try {
            this.d = false;
            this.f += i;
            this.S.E(i);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void t(int i) {
        try {
            this.d = false;
            this.f = i;
            this.S.F(i);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void u(boolean z) {
        try {
            this.S.G(z);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void v(boolean z) {
        try {
            this.S.H(z);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void w(boolean z) {
        try {
            this.S.I(z);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void x() {
        try {
            this.S.J();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.alvc
    public final void y() {
        try {
            this.d = false;
            this.S.M();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public RemoteEmbeddedPlayer(IBinder iBinder, IBinder iBinder2) {
        this(iBinder, iBinder2, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RemoteEmbeddedPlayer(android.os.IBinder r5, android.os.IBinder r6, android.os.IBinder r7, boolean r8) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.youtube.player.internal.dynamic.IObjectWrapper"
            r1 = 0
            if (r5 != 0) goto L7
            r2 = r1
            goto L17
        L7:
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof defpackage.alvv
            if (r3 == 0) goto L12
            alvv r2 = (defpackage.alvv) r2
            goto L17
        L12:
            alvt r2 = new alvt
            r2.<init>(r5)
        L17:
            java.lang.Object r5 = defpackage.alvu.b(r2)
            android.content.Context r5 = (android.content.Context) r5
            if (r6 != 0) goto L21
            r0 = r1
            goto L31
        L21:
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r2 = r0 instanceof defpackage.alvv
            if (r2 == 0) goto L2c
            alvv r0 = (defpackage.alvv) r0
            goto L31
        L2c:
            alvt r0 = new alvt
            r0.<init>(r6)
        L31:
            java.lang.Object r6 = defpackage.alvu.b(r0)
            android.app.Activity r6 = (android.app.Activity) r6
            if (r7 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r0 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService"
            android.os.IInterface r0 = r7.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService
            if (r1 == 0) goto L48
            r1 = r0
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService r1 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService) r1
            goto L4d
        L48:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy r1 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy
            r1.<init>(r7)
        L4d:
            r4.<init>(r5, r6, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RemoteEmbeddedPlayer(android.os.IBinder r7, android.os.IBinder r8, boolean r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L5
            r1 = r0
            goto L17
        L5:
            java.lang.String r1 = "com.google.android.youtube.player.internal.dynamic.IObjectWrapper"
            android.os.IInterface r1 = r7.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.alvv
            if (r2 == 0) goto L12
            alvv r1 = (defpackage.alvv) r1
            goto L17
        L12:
            alvt r1 = new alvt
            r1.<init>(r7)
        L17:
            java.lang.Object r7 = defpackage.alvu.b(r1)
            android.app.Activity r7 = (android.app.Activity) r7
            if (r8 != 0) goto L20
            goto L32
        L20:
            java.lang.String r0 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService"
            android.os.IInterface r0 = r8.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService
            if (r1 == 0) goto L2d
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService r0 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService) r0
            goto L32
        L2d:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy r0 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy
            r0.<init>(r8)
        L32:
            java.lang.Class r8 = r7.getClass()
            java.lang.Class r8 = r8.getSuperclass()
            r1 = 0
            if (r8 == 0) goto L42
            java.lang.reflect.Field[] r8 = r8.getDeclaredFields()
            goto L44
        L42:
            java.lang.reflect.Field[] r8 = new java.lang.reflect.Field[r1]
        L44:
            int r2 = r8.length
        L45:
            if (r1 >= r2) goto L6e
            r3 = r8[r1]
            java.lang.Class r4 = r3.getType()
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            if (r4 != r5) goto L6b
            r4 = 1
            r3.setAccessible(r4)
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.IllegalAccessException -> L62
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.IllegalAccessException -> L62
            if (r3 != 0) goto L5e
            goto L6b
        L5e:
            r6.<init>(r7, r3, r0, r9)
            return
        L62:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not get the activity from the ActivityWrapper"
            r8.<init>(r9, r7)
            throw r8
        L6b:
            int r1 = r1 + 1
            goto L45
        L6e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Failed to extract the wrapped activity"
            r7.<init>(r8)
            goto L77
        L76:
            throw r7
        L77:
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer.<init>(android.os.IBinder, android.os.IBinder, boolean):void");
    }
}
