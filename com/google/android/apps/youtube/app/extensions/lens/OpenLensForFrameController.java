package com.google.android.apps.youtube.app.extensions.lens;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.PixelCopy;
import android.view.Surface;
import androidx.activity.result.ActivityResult;
import com.google.android.apps.youtube.app.extensions.lens.OpenLensForFrameController;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.libraries.lens.sdk.intent.BinderBitmap;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import defpackage.aac;
import defpackage.aadw;
import defpackage.aae;
import defpackage.aahd;
import defpackage.aap;
import defpackage.acpl;
import defpackage.afsx;
import defpackage.afsy;
import defpackage.ahej;
import defpackage.ainy;
import defpackage.aiwk;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.any;
import defpackage.anyx;
import defpackage.aoeg;
import defpackage.aok;
import defpackage.apxf;
import defpackage.arpn;
import defpackage.arpp;
import defpackage.asmu;
import defpackage.asmv;
import defpackage.asmw;
import defpackage.asvu;
import defpackage.atsq;
import defpackage.azrw;
import defpackage.kch;
import defpackage.kcz;
import defpackage.kqa;
import defpackage.rwh;
import defpackage.tdp;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zga;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OpenLensForFrameController implements any, ypd {
    public final azrw a;
    public final kqa b;
    public final Executor c;
    public final acpl d;
    public boolean f;
    aac g;
    private final Context j;
    private final afsy k;
    private final ypa l;
    private final aahd m;
    private final boolean n;
    private aae o;
    private final kch p;
    public ammv e = amlr.a;
    public ammv h = amlr.a;
    public int i = 1;

    public OpenLensForFrameController(aadw aadwVar, kch kchVar, Context context, afsy afsyVar, ypa ypaVar, azrw azrwVar, kqa kqaVar, aahd aahdVar, Executor executor, acpl acplVar) {
        this.p = kchVar;
        this.j = context;
        this.k = afsyVar;
        this.l = ypaVar;
        this.a = azrwVar;
        this.b = kqaVar;
        this.m = aahdVar;
        this.c = executor;
        this.d = acplVar;
        asvu asvuVar = aadwVar.b().e;
        boolean z = (asvuVar == null ? asvu.a : asvuVar).cL;
        this.n = z;
        if (z) {
            k();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, aad] */
    private final void k() {
        this.g = new aac() { // from class: gzl
            @Override // defpackage.aac
            public final void a(Object obj) {
                OpenLensForFrameController openLensForFrameController = OpenLensForFrameController.this;
                ActivityResult activityResult = (ActivityResult) obj;
                if (activityResult.a == -1) {
                    acpl acplVar = openLensForFrameController.d;
                    arpn a = arpp.a();
                    asmu a2 = asmv.a();
                    asmw asmwVar = asmw.LENS_LAUNCH_STATUS_SUCCESS;
                    a2.copyOnWrite();
                    ((asmv) a2.instance).f(asmwVar);
                    asmv asmvVar = (asmv) a2.build();
                    a.copyOnWrite();
                    ((arpp) a.instance).dt(asmvVar);
                    acplVar.c((arpp) a.build());
                    return;
                }
                String.valueOf(String.valueOf(activityResult)).length();
                openLensForFrameController.i(asmw.LENS_LAUNCH_STATUS_LENS_NOT_AVAILABLE);
            }
        };
        this.o = this.j.registerForActivityResult(new aap(), this.g);
    }

    public final void g() {
        aiwk aiwkVar = ((ainy) this.a.get()).p.a;
        if (aiwkVar == null || aiwkVar.af()) {
            zga.m("OpenLensForFrameCtrl", "Playback is stopped.");
            i(asmw.LENS_LAUNCH_STATUS_PLAYBACK_STOPPED);
            return;
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((kcz) this.p.get()).aT;
        if (youTubePlayerViewNotForReflection == null) {
            zga.m("OpenLensForFrameCtrl", "Unable to access player view.");
            i(asmw.LENS_LAUNCH_STATUS_NO_PLAYER_VIEW);
            return;
        }
        Surface A = youTubePlayerViewNotForReflection.d.A();
        if (A == null) {
            zga.m("OpenLensForFrameCtrl", "Unable to access media surface.");
            i(asmw.LENS_LAUNCH_STATUS_NO_PLAYER_SURFACE);
            return;
        }
        this.i = 3;
        int width = youTubePlayerViewNotForReflection.d.getWidth();
        int height = youTubePlayerViewNotForReflection.d.getHeight();
        if (Build.VERSION.SDK_INT < 24) {
            i(asmw.LENS_LAUNCH_STATUS_BAD_ANDROID_SDK_VERSION);
            return;
        }
        final Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        final HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName());
        handlerThread.start();
        PixelCopy.request(A, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: gzk
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                final OpenLensForFrameController openLensForFrameController = OpenLensForFrameController.this;
                HandlerThread handlerThread2 = handlerThread;
                Bitmap bitmap = createBitmap;
                handlerThread2.quitSafely();
                if (i != 0) {
                    asmu a = asmv.a();
                    asmw asmwVar = asmw.LENS_LAUNCH_STATUS_PIXELCOPY_FAILED;
                    a.copyOnWrite();
                    ((asmv) a.instance).f(asmwVar);
                    a.copyOnWrite();
                    ((asmv) a.instance).e(i);
                    openLensForFrameController.h((asmv) a.build());
                    return;
                }
                final Bitmap copy = bitmap.copy(bitmap.getConfig(), false);
                bitmap.recycle();
                if (copy == null) {
                    zga.m("OpenLensForFrameCtrl", "Failed to convert Bitmap");
                    openLensForFrameController.i(asmw.LENS_LAUNCH_STATUS_BITMAP_COPY_FAILED);
                } else {
                    openLensForFrameController.e = ammv.j(new LensImage(copy));
                    openLensForFrameController.c.execute(new Runnable() { // from class: gzm
                        @Override // java.lang.Runnable
                        public final void run() {
                            OpenLensForFrameController openLensForFrameController2 = OpenLensForFrameController.this;
                            Bitmap bitmap2 = copy;
                            kqa kqaVar = openLensForFrameController2.b;
                            kqaVar.a = bitmap2;
                            kqaVar.Y();
                        }
                    });
                    openLensForFrameController.j((LensImage) openLensForFrameController.e.c());
                }
            }
        }, new Handler(handlerThread.getLooper()));
    }

    public final void h(asmv asmvVar) {
        acpl acplVar = this.d;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).dt(asmvVar);
        acplVar.c((arpp) a.build());
        if (!this.h.h() || (((atsq) this.h.c()).c & 4) == 0) {
            return;
        }
        aahd aahdVar = this.m;
        apxf apxfVar = ((atsq) this.h.c()).f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.a(apxfVar);
    }

    public final void i(asmw asmwVar) {
        asmu a = asmv.a();
        a.copyOnWrite();
        asmv.c((asmv) a.instance, asmwVar);
        h((asmv) a.build());
    }

    public final void j(LensImage lensImage) {
        this.i = 4;
        anyx anyxVar = new anyx();
        anyxVar.a.putByteArray("lens_init_params", aoeg.a.toByteArray());
        anyxVar.a.putLong("request_lens_time_nanos", SystemClock.elapsedRealtimeNanos());
        anyxVar.a.putLong("start_streaming_time_nanos", 0L);
        anyxVar.a.putInt("transition_type", 0);
        anyxVar.m(0);
        anyxVar.a.putInt("theme", 0);
        anyxVar.a.putLong("handover_session_id", 0L);
        anyxVar.n(false);
        anyxVar.a.putParcelable("postcapture_image", lensImage);
        if (this.h.h() && (((atsq) this.h.c()).c & 2) != 0) {
            anyxVar.m(((atsq) this.h.c()).e);
        }
        afsx c = this.k.c();
        if (c.g()) {
            anyxVar.n(true);
        } else if (c instanceof AccountIdentity) {
            anyxVar.a.putString("account_name", ((AccountIdentity) c).a());
        }
        aae aaeVar = this.o;
        if (aaeVar != null) {
            try {
                aaeVar.b(rwh.Z(anyxVar));
                return;
            } catch (ActivityNotFoundException unused) {
                zga.c("OpenLensForFrameCtrl", "Failed to resolve Lens Intent.");
                i(asmw.LENS_LAUNCH_STATUS_LENS_NOT_AVAILABLE);
                return;
            }
        }
        Context context = this.j;
        anyxVar.a.putBinder("lens_activity_binder", new tdp(context));
        Intent Z = rwh.Z(anyxVar);
        Z.addFlags(268435456);
        Z.addFlags(32768);
        context.startActivity(Z);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahej.class};
        }
        if (i == 0) {
            ahej ahejVar = (ahej) obj;
            if (this.i != 2 || ahejVar.a() != 3) {
                if (!this.e.h()) {
                    return null;
                }
                if (ahejVar.a() != 2 && ahejVar.a() != 6) {
                    return null;
                }
                kqa kqaVar = this.b;
                kqaVar.a = null;
                kqaVar.Y();
                BinderBitmap binderBitmap = ((LensImage) this.e.c()).a;
                (binderBitmap != null ? binderBitmap.a : null).recycle();
                this.e = amlr.a;
                return null;
            }
            this.f = true;
            g();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        this.l.m(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        if (this.n) {
            return;
        }
        k();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        this.l.g(this);
        if (this.f && this.h.h() && ((atsq) this.h.c()).d) {
            this.f = false;
            ((ainy) this.a.get()).b();
        }
        this.i = 1;
        this.h = amlr.a;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
