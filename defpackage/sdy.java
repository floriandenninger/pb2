package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni;
import com.google.android.youtube.R;
import com.google.common.util.concurrent.SettableFuture;
import com.google.mediapipe.framework.Compat;
import com.google.research.xeno.effect.AssetDownloader;
import com.google.research.xeno.effect.InputFrameSource;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sdy implements seu, sfb, sct {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/components/rendering/RenderingManager");
    public final SettableFuture b = SettableFuture.f();
    public final SettableFuture c = SettableFuture.f();
    public final SettableFuture d = SettableFuture.f();
    public final Context e;
    public final aogo f;
    final sdo g;
    public final scu h;
    public final Executor i;
    public final sfh j;
    public sev k;
    public sdb l;

    public sdy(Context context, sem semVar, aogo aogoVar, Executor executor, Executor executor2) {
        this.e = context;
        this.f = aogoVar;
        scu scuVar = new scu(context, semVar, executor, aogoVar, this);
        this.h = scuVar;
        sdo sdoVar = new sdo(context, aogoVar, scuVar);
        this.g = sdoVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.product_banner_height);
        sdoVar.b.setLayoutParams(layoutParams);
        this.i = anaf.E(executor2);
        this.j = new sfh(executor);
    }

    public final View a() {
        return this.g.b;
    }

    @Override // defpackage.seu
    public final void b() {
        anhy a2;
        anhy a3;
        if (this.k != null) {
            anhy[] anhyVarArr = new anhy[3];
            sdb sdbVar = this.l;
            synchronized (sdbVar.c) {
                Iterator it = sdbVar.d.iterator();
                while (it.hasNext()) {
                    ((anhy) it.next()).cancel(true);
                }
                a2 = sdbVar.c.a();
            }
            anhyVarArr[0] = a2;
            scu scuVar = this.h;
            synchronized (scuVar.f) {
                scuVar.d();
                a3 = scuVar.f.a();
            }
            anhyVarArr[1] = a3;
            anhyVarArr[2] = this.j.a();
            anaf.I(anhyVarArr).c(new Runnable() { // from class: sdw
                @Override // java.lang.Runnable
                public final void run() {
                    sdy sdyVar = sdy.this;
                    sfj.a(sdyVar.c, sdyVar.i);
                    sfj.a(sdyVar.b, sdyVar.k.c);
                    sfj.a(sdyVar.d, sdyVar.k.b);
                }
            }, this.k.c);
        }
    }

    @Override // defpackage.seu
    public final void c(final sev sevVar) {
        this.k = sevVar;
        if (this.l == null) {
            this.l = new sdb(sevVar.d, sevVar.b, sevVar.c);
        }
        if (!this.b.isDone()) {
            this.b.qK(anfq.i(((scb) sevVar.e.a()).c, new anfz() { // from class: sdu
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    sdy sdyVar = sdy.this;
                    File file = new File(sdyVar.e.getCacheDir(), "faceviewer");
                    file.mkdir();
                    final String absolutePath = file.getAbsolutePath();
                    final Locale e = aik.c(sdyVar.e.getResources().getConfiguration()).e();
                    final sdb sdbVar = sdyVar.l;
                    aone createBuilder = ansa.a.createBuilder();
                    anrz anrzVar = anrz.a;
                    createBuilder.copyOnWrite();
                    ansa ansaVar = (ansa) createBuilder.instance;
                    anrzVar.getClass();
                    ansaVar.c = anrzVar;
                    ansaVar.b = 1;
                    final ansa ansaVar2 = (ansa) createBuilder.build();
                    return aci.c(new aeu() { // from class: sdh
                        @Override // defpackage.aeu
                        public final Object a(aes aesVar) {
                            AssetDownloader assetDownloader = AssetDownloader.this;
                            String str = absolutePath;
                            ansa ansaVar3 = ansaVar2;
                            Locale locale = e;
                            int i = sdi.b;
                            String country = locale.getCountry();
                            String language = locale.getLanguage();
                            StringBuilder sb = new StringBuilder(String.valueOf(country).length() + 1 + String.valueOf(language).length());
                            sb.append(country);
                            sb.append(":");
                            sb.append(language);
                            RuntimeJni.a(assetDownloader, str, ansaVar3, sb.toString(), scy.b(aesVar, sdg.c));
                            return "FaceViewerRuntime.create";
                        }
                    });
                }
            }, sevVar.b));
        }
        if (!this.d.isDone()) {
            this.d.qK(anfq.h(((scb) sevVar.e.a()).c, new amml() { // from class: sds
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    EGLSurface eGLSurface;
                    sdy sdyVar = sdy.this;
                    awyd a2 = awye.a();
                    aogo aogoVar = sdyVar.f;
                    if (aogoVar.e == 0) {
                        EGLContext eglGetCurrentContext = aogoVar.a.eglGetCurrentContext();
                        EGLDisplay eglGetCurrentDisplay = aogoVar.a.eglGetCurrentDisplay();
                        EGLSurface eglGetCurrentSurface = aogoVar.a.eglGetCurrentSurface(12377);
                        EGLSurface eglGetCurrentSurface2 = aogoVar.a.eglGetCurrentSurface(12378);
                        if (eglGetCurrentContext != aogoVar.c) {
                            eGLSurface = aogoVar.d();
                            aogoVar.a(eGLSurface, eGLSurface);
                        } else {
                            eGLSurface = null;
                        }
                        aogoVar.e = Compat.getCurrentNativeEGLContext();
                        EGL14.eglGetCurrentContext();
                        if (eglGetCurrentContext != aogoVar.c) {
                            aogoVar.a.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                            aogoVar.c(eGLSurface);
                        }
                    }
                    a2.b(aogoVar.e);
                    final sen senVar = new sen(a2.a());
                    senVar.c(sdyVar.g.d);
                    senVar.b(InputFrameSource.FRONT_CAMERA_NONMIRRORED, awys.b);
                    final scu scuVar = sdyVar.h;
                    scuVar.f.b(new sfg() { // from class: scl
                        @Override // defpackage.sfg
                        public final anhy a() {
                            final scu scuVar2 = scu.this;
                            final aogg aoggVar = senVar;
                            return anaf.R(new Runnable() { // from class: scr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    scu scuVar3 = scu.this;
                                    aogg aoggVar2 = aoggVar;
                                    scuVar3.h = aoggVar2;
                                    aoge aogeVar = scuVar3.i;
                                    if (aogeVar != null) {
                                        aogeVar.c(aoggVar2);
                                    }
                                }
                            }, scuVar2.g);
                        }
                    });
                    return senVar;
                }
            }, sevVar.c));
        }
        sevVar.e.a.f(sex.PROTO_DOWNLOAD_AND_INIT);
        this.c.qK(anfq.i(this.b, new anfz() { // from class: sdv
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                sev sevVar2 = sev.this;
                final sdi sdiVar = (sdi) obj;
                amxj amxjVar = sdy.a;
                final ansu ansuVar = sevVar2.a.a;
                return aci.c(new aeu() { // from class: sdf
                    @Override // defpackage.aeu
                    public final Object a(aes aesVar) {
                        sdi sdiVar2 = sdi.this;
                        ansu ansuVar2 = ansuVar;
                        RuntimeJni runtimeJni = sdiVar2.a;
                        runtimeJni.nativeMakeExperience(runtimeJni.a, ansuVar2.toByteArray(), NativeCallback.b(scy.b(aesVar, sdg.a), set.a));
                        return "FaceViewerRuntime.makeExperience";
                    }
                });
            }
        }, this.i));
        this.c.d(new Runnable() { // from class: sdp
            @Override // java.lang.Runnable
            public final void run() {
                sev sevVar2 = sev.this;
                amxj amxjVar = sdy.a;
                sevVar2.e.a.e(sex.PROTO_DOWNLOAD_AND_INIT);
            }
        }, sevVar.c);
        sdo sdoVar = this.g;
        sdoVar.g = sevVar;
        anaf.Y(sevVar.e.c().d(), new sdl(sdoVar.c), sevVar.c);
    }

    @Override // defpackage.sfb
    public final anhy d() {
        return this.j.b(new sdq(this, 1));
    }

    @Override // defpackage.sfb
    public final void e() {
        this.h.d();
    }
}
