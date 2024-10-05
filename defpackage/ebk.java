package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebk implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final Handler a = new Handler(Looper.getMainLooper());
    private final Context b;
    private Application c;
    private final PowerManager d;
    private final KeyguardManager e;
    private BroadcastReceiver f;
    private final eay g;
    private WeakReference h;
    private WeakReference i;
    private eav j;
    private byte k = -1;
    private int l = -1;
    private long m = -3;

    public ebk(Context context, eay eayVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.g = eayVar;
        this.d = (PowerManager) applicationContext.getSystemService("power");
        this.e = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.c = application;
            this.j = new eav(application, this);
        }
        d(null);
    }

    private final void e(Activity activity, int i) {
        Window window;
        if (this.i == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View b = b();
        if (b == null || peekDecorView == null || b.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.l = i;
    }

    private final void f() {
        a.post(new ebi(this));
    }

    private final void g(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            ebj ebjVar = new ebj(this);
            this.f = ebjVar;
            this.b.registerReceiver(ebjVar, intentFilter);
        }
        Application application = this.c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception unused) {
            }
        }
    }

    private final void h(View view) {
        try {
            WeakReference weakReference = this.h;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.h = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f;
        if (broadcastReceiver != null) {
            try {
                this.b.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f = null;
        }
        Application application = this.c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.j);
            } catch (Exception unused4) {
            }
        }
    }

    public final long a() {
        if (this.m <= -2 && b() == null) {
            this.m = -3L;
        }
        return this.m;
    }

    final View b() {
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if ((r5.flags & 524288) != 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.i
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r0 = r7.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L13
            r7.m = r2
            r7.k = r1
            return
        L13:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            boolean r5 = r0.isShown()
            if (r5 != 0) goto L24
            r4 = r4 | 2
        L24:
            android.os.PowerManager r5 = r7.d
            if (r5 == 0) goto L30
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L30
            r4 = r4 | 4
        L30:
            eay r5 = r7.g
            boolean r5 = r5.a
            if (r5 != 0) goto L5e
            android.app.KeyguardManager r5 = r7.e
            if (r5 == 0) goto L5c
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L5c
            android.app.Activity r5 = defpackage.ebg.b(r0)
            if (r5 != 0) goto L47
            goto L5c
        L47:
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L4f
            r5 = 0
            goto L53
        L4f:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
        L53:
            if (r5 == 0) goto L5c
            int r5 = r5.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L5e
        L5c:
            r4 = r4 | 8
        L5e:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L6b
            r4 = r4 | 16
        L6b:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L78
            r4 = r4 | 32
        L78:
            int r0 = r0.getWindowVisibility()
            int r5 = r7.l
            if (r5 == r1) goto L81
            r0 = r5
        L81:
            if (r0 == 0) goto L85
            r4 = r4 | 64
        L85:
            byte r0 = r7.k
            if (r0 == r4) goto L98
            byte r0 = (byte) r4
            r7.k = r0
            if (r4 != 0) goto L93
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L96
        L93:
            long r0 = (long) r4
            long r0 = r2 - r0
        L96:
            r7.m = r0
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebk.c():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(View view) {
        long j;
        View b = b();
        if (b != null) {
            b.removeOnAttachStateChangeListener(this);
            h(b);
        }
        this.i = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                g(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.m = j;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        c();
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.l = -1;
        g(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l = -1;
        c();
        f();
        h(view);
    }
}
