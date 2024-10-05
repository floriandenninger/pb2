package com.google.android.apps.youtube.embeddedplayer.service.imageclient.service;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import defpackage.ykl;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e implements ykl {
    private final BitmapKey a;
    private final WeakReference b;
    private Runnable c;

    public e(BitmapKey bitmapKey, WeakReference weakReference, Runnable runnable) {
        this.a = bitmapKey;
        this.b = weakReference;
        this.c = runnable;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        d(null);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        d((Bitmap) obj2);
    }

    public final synchronized void c() {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            this.c = null;
        }
        this.b.clear();
    }

    public final synchronized void d(Bitmap bitmap) {
        try {
            f fVar = (f) this.b.get();
            if (fVar != null) {
                fVar.a(this.a, bitmap);
            }
        } catch (RemoteException unused) {
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            this.c = null;
        }
        this.b.clear();
    }
}
