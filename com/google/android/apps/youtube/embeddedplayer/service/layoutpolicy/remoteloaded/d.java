package com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import defpackage.opn;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements Application.ActivityLifecycleCallbacks, c {
    private final WeakReference b;
    private BitSet c;
    private Rect d;
    private int e;
    private VisibilityChangeEventData f;
    private final b g;
    private boolean h;

    public d(View view, b bVar) {
        this.b = new WeakReference(view);
        this.g = bVar;
    }

    private static int h(DisplayMetrics displayMetrics, int i) {
        return (int) Math.ceil(i / displayMetrics.density);
    }

    private static Rect i(Rect rect, DisplayMetrics displayMetrics) {
        return new Rect(h(displayMetrics, rect.left), h(displayMetrics, rect.top), h(displayMetrics, rect.right), h(displayMetrics, rect.bottom));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c
    public final int a() {
        if (this.h) {
            return (this.d.width() * this.d.height()) - this.e;
        }
        return 0;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c
    public final void b() {
        View view;
        if (this.h && (view = (View) this.b.get()) != null) {
            Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
            this.d = rect;
            rect.offset((int) view.getTranslationX(), (int) view.getTranslationY());
            this.c = new BitSet(this.d.width() * this.d.height());
            Rect rect2 = new Rect();
            if (!view.getLocalVisibleRect(rect2)) {
                this.e = 0;
                return;
            }
            int max = Math.max(rect2.left, 0);
            int min = Math.min(rect2.right, this.d.width());
            int min2 = Math.min(rect2.bottom, this.d.height());
            int width = this.d.width();
            for (int max2 = Math.max(rect2.top, 0); max2 < min2; max2++) {
                int i = max2 * width;
                int i2 = i + max;
                int i3 = i + min;
                if ((min - max) - this.c.get(i2, i3).cardinality() > 0) {
                    this.c.set(i2, i3, true);
                }
            }
            this.e = rect2.height() * rect2.width();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c
    public final void c(Rect rect, Rect rect2) {
        if (this.h) {
            int max = Math.max(rect.left, rect2.left) - rect2.left;
            int min = Math.min(rect.right, rect2.right) - rect2.left;
            int min2 = Math.min(rect.bottom, rect2.bottom) - rect2.top;
            int width = this.d.width();
            for (int max2 = Math.max(rect.top, rect2.top) - rect2.top; max2 < min2; max2++) {
                int i = max2 * width;
                int i2 = i + max;
                int i3 = i + min;
                int cardinality = this.c.get(i2, i3).cardinality();
                if (cardinality > 0) {
                    this.e -= cardinality;
                    this.c.set(i2, i3, false);
                }
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c
    public final void d(boolean z) {
        View view;
        double d;
        double d2;
        double d3;
        double d4;
        VisibilityChangeEventData visibilityChangeEventData;
        int streamMaxVolume;
        if (this.h && (view = (View) this.b.get()) != null) {
            if (z) {
                visibilityChangeEventData = new VisibilityChangeEventData(0.0d, 0.0d, 0.0d, true, new Rect(0, 0, 0, 0), new Rect(0, 0, 0, 0), new Rect(0, 0, 0, 0), new Rect(0, 0, 0, 0));
            } else {
                DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
                DisplayMetrics displayMetrics2 = view.getContext().getApplicationContext().getResources().getDisplayMetrics();
                Rect rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                Rect rect2 = new Rect(0, 0, displayMetrics2.widthPixels, displayMetrics2.heightPixels);
                int width = view.getWidth();
                int height = view.getHeight();
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                Rect rect3 = new Rect(i, i2, width + i, height + i2);
                double width2 = rect2.width() * rect2.height();
                double width3 = rect3.width() * rect3.height();
                if (width3 > 0.0d) {
                    double d5 = this.e;
                    Double.isNaN(d5);
                    Double.isNaN(width3);
                    d2 = d5 / width3;
                    d = 0.0d;
                } else {
                    d = 0.0d;
                    d2 = 0.0d;
                }
                if (width2 > d) {
                    double d6 = this.e;
                    Double.isNaN(d6);
                    Double.isNaN(width2);
                    d3 = d6 / width2;
                } else {
                    d3 = d;
                }
                AudioManager audioManager = (AudioManager) view.getContext().getSystemService("audio");
                if (audioManager == null || (streamMaxVolume = audioManager.getStreamMaxVolume(3)) <= 0) {
                    d4 = d;
                } else {
                    double streamVolume = audioManager.getStreamVolume(3);
                    double d7 = streamMaxVolume;
                    Double.isNaN(streamVolume);
                    Double.isNaN(d7);
                    d4 = Math.min(streamVolume / d7, 1.0d);
                }
                visibilityChangeEventData = new VisibilityChangeEventData(d2, d3, d4, false, i(rect3, displayMetrics), i(rect3, displayMetrics), i(rect, displayMetrics), i(rect2, displayMetrics2));
            }
            VisibilityChangeEventData visibilityChangeEventData2 = this.f;
            if ((visibilityChangeEventData2 == null || !visibilityChangeEventData.equals(visibilityChangeEventData2)) && this.g.a(visibilityChangeEventData)) {
                this.f = visibilityChangeEventData;
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c
    public final void e() {
        View view;
        if (this.h && (view = (View) this.b.get()) != null) {
            ((Application) view.getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
            this.f = null;
            this.h = false;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c
    public final boolean f() {
        return this.h;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c
    public final void g() {
        View view;
        if (this.h || (view = (View) this.b.get()) == null) {
            return;
        }
        ((Application) view.getContext().getApplicationContext()).registerActivityLifecycleCallbacks(this);
        this.h = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View view = (View) this.b.get();
        if (view == null) {
            return;
        }
        Optional g = opn.g(view.getContext());
        if (g.isPresent() && activity == g.get() && this.h) {
            d(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
