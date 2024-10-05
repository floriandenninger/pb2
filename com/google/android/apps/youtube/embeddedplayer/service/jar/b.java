package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.app.ActionBar;
import android.app.Activity;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Activity a;

    public b(Activity activity) {
        activity.getClass();
        this.a = activity;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.a
    public final int a() {
        return System.identityHashCode(this.a);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.a
    public final int b() {
        return this.a.getRequestedOrientation();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.a
    public final ActionBar c() {
        return this.a.getActionBar();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.a
    public final Window d() {
        return this.a.getWindow();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.a
    public final boolean e() {
        return this.a.isFinishing();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.a
    public final boolean f() {
        return this.a.isInMultiWindowMode();
    }
}
