package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import com.google.android.youtube.R;
import defpackage.agaj;
import defpackage.alta;
import defpackage.aluy;
import defpackage.alva;
import defpackage.alvf;
import defpackage.alvt;
import defpackage.alvu;
import defpackage.alvv;
import defpackage.ayqj;
import defpackage.ayqr;
import defpackage.ayrs;
import defpackage.azre;
import defpackage.ecr;
import defpackage.joi;
import defpackage.oba;
import defpackage.oqu;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteEmbedFragment extends alva {
    private final Context a;
    private final IApiPlayerFactoryService b;
    private final IEmbedFragmentServiceFactoryService c;
    private ViewGroup d;
    private ayqj e;
    private Future f;

    public RemoteEmbedFragment(Context context, IApiPlayerFactoryService iApiPlayerFactoryService, IEmbedFragmentServiceFactoryService iEmbedFragmentServiceFactoryService) {
        this.a = context;
        this.b = iApiPlayerFactoryService;
        this.c = iEmbedFragmentServiceFactoryService;
    }

    private final void E(final Context context, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar) {
        this.d = new FrameLayout(context);
        final Context context2 = this.a;
        ayqj m = ayqj.C(new Callable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.aa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context3 = context2;
                Context context4 = context;
                Resources.Theme theme = context3.getTheme();
                theme.applyStyle(R.style.YouTubeEmbedServiceTheme, false);
                return com.google.android.apps.youtube.embeddedplayer.service.context.b.a(context4, context3.getResources(), context3.getClassLoader(), theme);
            }
        }).M(azre.a()).m();
        ayqj I = av.c(m, com.google.android.apps.youtube.embeddedplayer.service.jar.m.h(m, aVar, this.b), aVar, this.d, this.c).I(ayqr.a());
        this.e = I;
        I.W(oqu.k, oqu.m);
        this.f = this.e.Y();
    }

    private static void F(SetOperationType setOperationType) {
        com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d dVar = com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b;
        try {
            dVar.j(setOperationType, System.currentTimeMillis());
            dVar.g(Tick.REMOTE_RECEIVES_REQUEST, System.currentTimeMillis());
        } catch (RemoteException unused) {
            alta.C("Csi Controller Service disconnected", new Object[0]);
        }
    }

    @Override // defpackage.alvb
    public final void A() {
        this.e.W(oqu.l, oqu.m);
    }

    @Override // defpackage.alvb
    public final void B() {
        com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.c();
        this.e.W(oqu.j, oqu.m);
    }

    @Override // defpackage.alvb
    public final void C(final aluy aluyVar) {
        this.e.W(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ac
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aluy aluyVar2 = aluy.this;
                n nVar = ((av) obj).n;
                if (nVar == null) {
                    try {
                        aluyVar2.a(0L);
                        return;
                    } catch (RemoteException unused) {
                        alta.B("Problem sending getDuration result.", new Object[0]);
                        return;
                    }
                }
                nVar.c(aluyVar2);
            }
        }, oqu.m);
    }

    @Override // defpackage.alvb
    public final void D(final String str, final aluy aluyVar) {
        this.e.W(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.w
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                String str2 = str;
                aluy aluyVar2 = aluyVar;
                Optional a = com.google.android.apps.youtube.embeddedplayer.service.util.a.a(str2);
                a.ifPresent(new ao((av) obj));
                try {
                    boolean isPresent = a.isPresent();
                    Parcel pn = aluyVar2.pn();
                    ecr.e(pn, isPresent);
                    aluyVar2.pp(1, pn);
                } catch (RemoteException unused) {
                    alta.B("Problem sending setUri result to client.", new Object[0]);
                }
            }
        }, oqu.m);
    }

    @Override // defpackage.alvb
    public final Bundle a() {
        av avVar;
        try {
            avVar = (av) this.f.get(1L, TimeUnit.SECONDS);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            alta.C(valueOf.length() != 0 ? "Cannot save state: ".concat(valueOf) : new String("Cannot save state: "), new Object[0]);
            avVar = null;
        }
        if (avVar == null) {
            return null;
        }
        return avVar.b();
    }

    @Override // defpackage.alvb
    public final alvv b() {
        return alvu.a(this.d);
    }

    @Override // defpackage.alvb
    @Deprecated
    public final void c() {
        this.e.W(oqu.d, oqu.m);
    }

    @Override // defpackage.alvb
    public final void d() {
        F(SetOperationType.MUTED_AUTOPLAY);
        this.e.W(oqu.e, oqu.m);
    }

    @Override // defpackage.alvb
    public final void e(String str) {
        this.e.W(new joi(str, 5), oqu.m);
    }

    @Override // defpackage.alvb
    public final void f(IBinder iBinder) {
        alvv alvtVar;
        if (iBinder == null) {
            alvtVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof alvv) {
                alvtVar = (alvv) queryLocalInterface;
            } else {
                alvtVar = new alvt(iBinder);
            }
        }
        Activity activity = (Activity) alvu.b(alvtVar);
        E(activity, new com.google.android.apps.youtube.embeddedplayer.service.jar.b(activity));
    }

    @Override // defpackage.alvb
    public final void g(IBinder iBinder) {
        alvv alvtVar;
        if (iBinder == null) {
            alvtVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof alvv) {
                alvtVar = (alvv) queryLocalInterface;
            } else {
                alvtVar = new alvt(iBinder);
            }
        }
        Window window = (Window) alvu.b(alvtVar);
        E(window.getContext(), new com.google.android.apps.youtube.embeddedplayer.service.jar.r(window));
    }

    @Override // defpackage.alvb
    public final void h() {
        this.e.W(oqu.f, oqu.m);
    }

    @Override // defpackage.alvb
    public final void i(final Bundle bundle) {
        this.e.W(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                Bundle bundle2 = bundle;
                av avVar = (av) obj;
                if (bundle2 == null || avVar.n()) {
                    return;
                }
                avVar.r = bundle2.getBundle("saved_coordinator_state");
                avVar.e();
                if (bundle2.getBoolean("has_simple_start_descriptor")) {
                    com.google.android.apps.youtube.embeddedplayer.service.model.j jVar = new com.google.android.apps.youtube.embeddedplayer.service.model.j();
                    jVar.a = bundle2.getInt("spd_descriptor_type");
                    jVar.b = bundle2.getString("spd_video_id");
                    jVar.c = bundle2.getString("spd_playlist_id");
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("spd_video_ids_list");
                    if (stringArrayList == null) {
                        stringArrayList = new ArrayList<>();
                    }
                    jVar.d = stringArrayList;
                    jVar.e = 0;
                    jVar.f = bundle2.getInt("spd_start_index");
                    jVar.g = bundle2.getInt("spd_start_millis");
                    avVar.q = jVar.a();
                    try {
                        IEmbedFragmentService iEmbedFragmentService = avVar.h;
                        if (iEmbedFragmentService != null) {
                            iEmbedFragmentService.r(avVar.q);
                        }
                    } catch (RemoteException unused) {
                        alta.B("Problem setting playback description.", new Object[0]);
                    }
                }
            }
        }, oqu.m);
    }

    @Override // defpackage.alvb
    public final void j() {
        this.e.W(oqu.g, oqu.m);
    }

    @Override // defpackage.alvb
    public final void k() {
        F(SetOperationType.AUTOPLAY);
        this.e.W(oqu.h, oqu.m);
    }

    @Override // defpackage.alvb
    public final void l(final String str, final int i) {
        this.e.W(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.v
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                String str2 = str;
                int i2 = i;
                av avVar = (av) obj;
                agaj c = EmbedsPrewarmData.c();
                c.f(str2);
                c.e(i2);
                EmbedsPrewarmData d = c.d();
                if (avVar.n()) {
                    return;
                }
                bn bnVar = avVar.g.a;
                if (!bnVar.f()) {
                    oba.C();
                    return;
                }
                try {
                    bnVar.c.A(d);
                } catch (RemoteException e) {
                    oba.B(e);
                }
            }
        }, oqu.m);
    }

    @Override // defpackage.alvb
    public final void m(int i) {
        this.e.W(new u(i, 0), oqu.m);
    }

    @Override // defpackage.alvb
    public final void n(int i) {
        this.e.W(new u(i, 2), oqu.m);
    }

    @Override // defpackage.alvb
    public final void o() {
        this.e.W(oqu.i, oqu.m);
    }

    @Override // defpackage.alvb
    public final void p(String str) {
        this.e.W(new joi(str, 6), oqu.m);
    }

    @Override // defpackage.alvb
    public final void q(boolean z) {
        this.e.W(new z(z, 1), oqu.m);
    }

    @Override // defpackage.alvb
    public final void r(boolean z) {
        this.e.W(new z(z, 0), oqu.m);
    }

    @Override // defpackage.alvb
    public final void s(final alvf alvfVar) {
        this.e.W(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ad
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ((av) obj).k = alvf.this;
            }
        }, oqu.m);
    }

    @Override // defpackage.alvb
    public final void t(int i) {
        this.e.W(new u(i, 3), oqu.m);
    }

    @Override // defpackage.alvb
    @Deprecated
    public final void u(String str, boolean z) {
        this.e.W(new x(str, z, 1), oqu.m);
    }

    @Override // defpackage.alvb
    public final void v(String str) {
        this.e.W(new joi(str, 7), oqu.m);
    }

    @Override // defpackage.alvb
    public final void w(String str, boolean z) {
        this.e.W(new x(str, z, 0), oqu.m);
    }

    @Override // defpackage.alvb
    public final void x(String str) {
        this.e.W(new joi(str, 8), oqu.m);
    }

    @Override // defpackage.alvb
    @Deprecated
    public final void y(final List list, final boolean z) {
        this.e.W(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.y
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                List list2 = list;
                boolean z2 = z;
                com.google.android.apps.youtube.embeddedplayer.service.model.j jVar = new com.google.android.apps.youtube.embeddedplayer.service.model.j();
                jVar.a = 3;
                jVar.d = new ArrayList(list2);
                jVar.e = av.a(z2);
                ((av) obj).l(jVar.a());
            }
        }, oqu.m);
    }

    @Override // defpackage.alvb
    public final void z(String str) {
        this.e.W(new joi(str, 4), oqu.m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RemoteEmbedFragment(android.os.IBinder r4, android.os.IBinder r5, android.os.IBinder r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L5
            r1 = r0
            goto L17
        L5:
            java.lang.String r1 = "com.google.android.youtube.player.internal.dynamic.IObjectWrapper"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.alvv
            if (r2 == 0) goto L12
            alvv r1 = (defpackage.alvv) r1
            goto L17
        L12:
            alvt r1 = new alvt
            r1.<init>(r4)
        L17:
            java.lang.Object r4 = defpackage.alvu.b(r1)
            android.content.Context r4 = (android.content.Context) r4
            if (r5 != 0) goto L21
            r1 = r0
            goto L33
        L21:
            java.lang.String r1 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService
            if (r2 == 0) goto L2e
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService r1 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService) r1
            goto L33
        L2e:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy r1 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy
            r1.<init>(r5)
        L33:
            if (r6 != 0) goto L36
            goto L49
        L36:
            java.lang.String r5 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService"
            android.os.IInterface r5 = r6.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService
            if (r0 == 0) goto L44
            r0 = r5
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService r0 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService) r0
            goto L49
        L44:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy r0 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy
            r0.<init>(r6)
        L49:
            r3.<init>(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.jar.client.RemoteEmbedFragment.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RemoteEmbedFragment(android.os.IBinder r5, android.os.IBinder r6, android.os.IBinder r7, android.os.IBinder r8) {
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
            if (r7 != 0) goto L21
            r2 = r1
            goto L33
        L21:
            java.lang.String r2 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService"
            android.os.IInterface r2 = r7.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService
            if (r3 == 0) goto L2e
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService r2 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService) r2
            goto L33
        L2e:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy r2 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService$Stub$Proxy
            r2.<init>(r7)
        L33:
            if (r8 != 0) goto L37
            r7 = r1
            goto L49
        L37:
            java.lang.String r7 = "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService"
            android.os.IInterface r7 = r8.queryLocalInterface(r7)
            boolean r3 = r7 instanceof com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService
            if (r3 == 0) goto L44
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService r7 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService) r7
            goto L49
        L44:
            com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy r7 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService$Stub$Proxy
            r7.<init>(r8)
        L49:
            r4.<init>(r5, r2, r7)
            if (r6 != 0) goto L4f
            goto L60
        L4f:
            android.os.IInterface r5 = r6.queryLocalInterface(r0)
            boolean r7 = r5 instanceof defpackage.alvv
            if (r7 == 0) goto L5b
            r1 = r5
            alvv r1 = (defpackage.alvv) r1
            goto L60
        L5b:
            alvt r1 = new alvt
            r1.<init>(r6)
        L60:
            java.lang.Object r5 = defpackage.alvu.b(r1)
            android.app.Activity r5 = (android.app.Activity) r5
            com.google.android.apps.youtube.embeddedplayer.service.jar.b r6 = new com.google.android.apps.youtube.embeddedplayer.service.jar.b
            r6.<init>(r5)
            r4.E(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.jar.client.RemoteEmbedFragment.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder, android.os.IBinder):void");
    }
}
