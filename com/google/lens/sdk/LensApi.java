package com.google.lens.sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.lens.sdk.LensApi;
import defpackage.aoef;
import defpackage.aoeg;
import defpackage.aoeh;
import defpackage.aoej;
import defpackage.aoel;
import defpackage.aoem;
import defpackage.aoen;
import defpackage.aoeo;
import defpackage.aone;
import defpackage.aong;
import defpackage.ede;
import defpackage.edi;
import defpackage.edn;
import defpackage.rwh;
import defpackage.tda;
import defpackage.tdb;
import defpackage.tdd;
import defpackage.tdf;
import defpackage.tdl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LensApi {
    static final Uri a = Uri.parse("googleapp://lens");
    public static final /* synthetic */ int c = 0;
    public final tdd b;
    private final tda d;
    private final KeyguardManager e;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface LensAvailabilityCallback {
        void onAvailabilityStatusFetched(int i);
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public @interface LensAvailabilityStatus {
        public static final int LENS_AVAILABILITY_UNKNOWN = -1;
        public static final int LENS_READY = 0;
        public static final int LENS_UNAVAILABLE = 1;
        public static final int LENS_UNAVAILABLE_AGSA_OUTDATED = 6;

        @Deprecated
        public static final int LENS_UNAVAILABLE_ASSISTANT_EYES_FLAG_DISABLED = 8;
        public static final int LENS_UNAVAILABLE_DEVICE_INCOMPATIBLE = 3;
        public static final int LENS_UNAVAILABLE_DEVICE_LOCKED = 5;
        public static final int LENS_UNAVAILABLE_FEATURE_UNAVAILABLE = 11;
        public static final int LENS_UNAVAILABLE_INVALID_CURSOR = 4;

        @Deprecated
        public static final int LENS_UNAVAILABLE_LOCALE_NOT_SUPPORTED = 2;
        public static final int LENS_UNAVAILABLE_SERVICE_BUSY_FAILURE = 10;
        public static final int LENS_UNAVAILABLE_SERVICE_UNAVAILABLE = 9;
        public static final int LENS_UNAVAILABLE_UNKNOWN_ERROR_CODE = 12;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public @interface LensFeature {
        public static final int LENS_AR_STICKERS = 1;
        public static final int LENS_CORE = 0;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public @interface LensLaunchStatus {
        public static final int LAUNCH_FAILURE_UNLOCK_FAILED = 1;
        public static final int LAUNCH_SUCCESS = 0;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface LensLaunchStatusCallback {
        void onLaunchStatusFetched(int i);
    }

    public LensApi(Context context) {
        this.e = (KeyguardManager) context.getSystemService("keyguard");
        tda tdaVar = new tda(context);
        this.d = tdaVar;
        this.b = new tdd(context, tdaVar);
    }

    private final void e(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback, Runnable runnable) {
        if (!this.e.isKeyguardLocked()) {
            runnable.run();
            if (lensLaunchStatusCallback != null) {
                lensLaunchStatusCallback.onLaunchStatusFetched(0);
                return;
            }
            return;
        }
        if (activity == null || Build.VERSION.SDK_INT < 26) {
            int i = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Cannot start Lens when device is locked with Android ");
            sb.append(i);
            Log.e("LensApi", sb.toString());
            if (lensLaunchStatusCallback != null) {
                lensLaunchStatusCallback.onLaunchStatusFetched(1);
                return;
            }
            return;
        }
        this.e.requestDismissKeyguard(activity, new aoel(runnable, lensLaunchStatusCallback));
    }

    private final boolean f(String str) {
        String str2 = this.d.g.d;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String[] split = str2.split("\\.", -1);
        String[] split2 = str.split("\\.", -1);
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt < parseInt2) {
                return true;
            }
            if (parseInt > parseInt2) {
                return false;
            }
        }
        return split.length < split2.length;
    }

    public final void a(Activity activity) {
        tdd tddVar = this.b;
        rwh.U();
        if (tddVar.a.f()) {
            aong aongVar = (aong) edi.a.createBuilder();
            aongVar.copyOnWrite();
            edi ediVar = (edi) aongVar.instance;
            ediVar.c = 347;
            ediVar.b |= 1;
            edi ediVar2 = (edi) aongVar.build();
            try {
                tdf tdfVar = tddVar.a;
                byte[] byteArray = ediVar2.toByteArray();
                rwh.U();
                rwh.V(((tdl) tdfVar).f(), "Attempted to use lensServiceSession before ready.");
                ede edeVar = ((tdl) tdfVar).j;
                rwh.W(edeVar);
                edeVar.a(byteArray);
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Unable to send prewarm signal.", e);
            }
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(a);
        activity.startActivityForResult(intent, 0);
    }

    public final boolean c(Bitmap bitmap, aoeo aoeoVar) {
        if (bitmap == null) {
            Log.w("LensApi", "launchLensActivityWithBitmap: bitmap should not be null.");
        }
        if (this.e.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        }
        if (this.b.e() != 2) {
            return false;
        }
        aoen c2 = aoeoVar.c();
        c2.b = bitmap;
        b(c2.a());
        return true;
    }

    public void checkArStickersAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.d.a(new aoem(lensAvailabilityCallback, 1));
    }

    public void checkLensAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        if (!this.e.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
            if (f("8.3")) {
                lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                return;
            } else {
                this.d.a(new aoem(lensAvailabilityCallback, 0));
                return;
            }
        }
        lensAvailabilityCallback.onAvailabilityStatusFetched(5);
    }

    public void checkPendingIntentAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        if (!this.e.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
            if (f("9.72")) {
                lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                return;
            }
            tdd tddVar = this.b;
            aoeh aoehVar = new aoeh(lensAvailabilityCallback, 1);
            rwh.U();
            tddVar.d(new tdb(tddVar, aoehVar, 2));
            return;
        }
        lensAvailabilityCallback.onAvailabilityStatusFetched(5);
    }

    public void checkPostCaptureAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        if (!this.e.isKeyguardLocked() || Build.VERSION.SDK_INT >= 26) {
            if (f("8.19")) {
                lensAvailabilityCallback.onAvailabilityStatusFetched(6);
                return;
            }
            tdd tddVar = this.b;
            aoeh aoehVar = new aoeh(lensAvailabilityCallback, 0);
            rwh.U();
            tddVar.d(new tdb(tddVar, aoehVar, 1));
            return;
        }
        lensAvailabilityCallback.onAvailabilityStatusFetched(5);
    }

    public final boolean d(aoeo aoeoVar, PendingIntentConsumer pendingIntentConsumer) {
        if (this.b.f() != 2) {
            return false;
        }
        tdd tddVar = this.b;
        tddVar.c(aoeoVar.a(tddVar.a()));
        tdd tddVar2 = this.b;
        tddVar2.a();
        Bundle d = aoeoVar.d();
        rwh.U();
        tddVar2.b = pendingIntentConsumer;
        if (tddVar2.a.f()) {
            aong aongVar = (aong) edi.a.createBuilder();
            aongVar.copyOnWrite();
            edi ediVar = (edi) aongVar.instance;
            ediVar.c = 412;
            ediVar.b |= 1;
            try {
                tddVar2.a.c(((edi) aongVar.build()).toByteArray(), new SystemParcelableWrapper(d));
                return true;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to send Lens service client event", e);
            }
        }
        Log.e("LensApi", "Failed to request pending intent.");
        return false;
    }

    @Deprecated
    public void launchLensActivity(Activity activity) {
        e(activity, null, new aoej(this, activity, 1));
    }

    public boolean launchLensActivityWithBitmap(Bitmap bitmap) {
        if (this.e.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        aoen b = aoeo.b();
        b.c = Long.valueOf(elapsedRealtimeNanos);
        return c(bitmap, b.a());
    }

    public boolean launchLensActivityWithBitmapForTranslate(Bitmap bitmap) {
        edn ednVar;
        tdd tddVar = this.b;
        rwh.U();
        rwh.V(tddVar.a.f(), "getLensCapabilities() called when Lens is not ready.");
        if (!tddVar.a.f()) {
            ednVar = edn.a;
        } else {
            tdf tdfVar = tddVar.a;
            rwh.U();
            tdl tdlVar = (tdl) tdfVar;
            rwh.V(tdlVar.l(), "Attempted to use LensCapabilities before ready.");
            ednVar = tdlVar.g;
        }
        if ((ednVar.b & 2) == 0) {
            Log.e("LensApi", "Translate is not supported.");
            return false;
        }
        aone createBuilder = aoeg.a.createBuilder();
        aoef aoefVar = aoef.a;
        createBuilder.copyOnWrite();
        aoeg aoegVar = (aoeg) createBuilder.instance;
        aoefVar.getClass();
        aoegVar.c = aoefVar;
        aoegVar.b = 2;
        aoeg aoegVar2 = (aoeg) createBuilder.build();
        aoen b = aoeo.b();
        b.e = 5;
        b.d = aoegVar2;
        return c(bitmap, b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [tdf, android.content.ServiceConnection] */
    public void onPause() {
        tdd tddVar = this.b;
        rwh.U();
        ?? r1 = tddVar.a;
        rwh.U();
        tdl tdlVar = (tdl) r1;
        if (tdlVar.l()) {
            aong aongVar = (aong) edi.a.createBuilder();
            aongVar.copyOnWrite();
            edi ediVar = (edi) aongVar.instance;
            ediVar.c = 345;
            ediVar.b |= 1;
            edi ediVar2 = (edi) aongVar.build();
            try {
                ede edeVar = ((tdl) r1).j;
                rwh.W(edeVar);
                edeVar.a(ediVar2.toByteArray());
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceConnImpl", "Unable to end Lens service session.", e);
            }
            tdlVar.j = null;
            tdlVar.e = 0;
            tdlVar.f = null;
            tdlVar.g = null;
        }
        if (tdlVar.k()) {
            try {
                ((tdl) r1).b.unbindService(r1);
            } catch (IllegalArgumentException unused) {
                Log.w("LensServiceConnImpl", "Unable to unbind, service is not registered.");
            }
            tdlVar.i = null;
        }
        tdlVar.h = 1;
        tdlVar.i(1);
        tddVar.b = null;
    }

    public void onResume() {
        tdd tddVar = this.b;
        rwh.U();
        ((tdl) tddVar.a).m();
    }

    public boolean requestLensActivityPendingIntent(PendingIntentConsumer pendingIntentConsumer) {
        return d(aoeo.b().a(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmap(Bitmap bitmap, PendingIntentConsumer pendingIntentConsumer) {
        aoen b = aoeo.b();
        b.b = bitmap;
        return d(b.a(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmapUri(Context context, Uri uri, PendingIntentConsumer pendingIntentConsumer) {
        if (context != null) {
            context.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
        }
        aoen b = aoeo.b();
        b.a = uri;
        return d(b.a(), pendingIntentConsumer);
    }

    public final void b(aoeo aoeoVar) {
        if (aoeoVar.a != null || aoeoVar.b != null) {
            tdd tddVar = this.b;
            if (!tddVar.c(aoeoVar.a(tddVar.a()))) {
                return;
            }
        }
        tdd tddVar2 = this.b;
        tddVar2.a();
        Bundle d = aoeoVar.d();
        rwh.U();
        if (tddVar2.a.f()) {
            aong aongVar = (aong) edi.a.createBuilder();
            aongVar.copyOnWrite();
            edi ediVar = (edi) aongVar.instance;
            ediVar.c = 355;
            ediVar.b |= 1;
            try {
                tddVar2.a.c(((edi) aongVar.build()).toByteArray(), new SystemParcelableWrapper(d));
                tddVar2.a.d();
                return;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to start Lens", e);
            }
        }
        Log.e("LensApi", "Failed to start lens.");
    }

    @Deprecated
    public void launchLensActivity(Activity activity, int i) {
        if (i == 0) {
            e(activity, null, new aoej(this, activity, 0));
            return;
        }
        if (i == 1) {
            int T = rwh.T(this.d.g.f);
            if (T != 0 && T == 2) {
                Intent intent = new Intent();
                intent.setClassName("com.google.ar.lens", "com.google.vr.apps.ornament.app.MainActivity");
                activity.startActivity(intent);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid lens activity: ");
        sb.append(i);
        Log.w("LensApi", sb.toString());
    }

    public void launchLensActivity(final Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback) {
        final aoeo a2 = aoeo.b().a();
        e(activity, lensLaunchStatusCallback, new Runnable() { // from class: aoek
            @Override // java.lang.Runnable
            public final void run() {
                final LensApi lensApi = LensApi.this;
                final Activity activity2 = activity;
                final aoeo aoeoVar = a2;
                final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                tdd tddVar = lensApi.b;
                tdc tdcVar = new tdc() { // from class: aoei
                    @Override // defpackage.tdc
                    public final void a(int i) {
                        LensApi lensApi2 = LensApi.this;
                        aoeo aoeoVar2 = aoeoVar;
                        long j = elapsedRealtimeNanos;
                        Activity activity3 = activity2;
                        if (i == 2) {
                            if (aoeoVar2.c == null) {
                                aoen c2 = aoeoVar2.c();
                                c2.c = Long.valueOf(j);
                                aoeoVar2 = c2.a();
                            }
                            lensApi2.b(aoeoVar2);
                            return;
                        }
                        lensApi2.a(activity3);
                    }
                };
                rwh.U();
                tddVar.d(new tdb(tddVar, tdcVar, 0));
            }
        });
    }
}
