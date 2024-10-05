package com.google.vr.ndk.base;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.axfq;
import defpackage.axib;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrLayout extends FrameLayout {
    private GvrApi gvrApi;
    private axib impl;
    private GvrUiLayout uiLayout;
    private ExternalSurface videoSurface;

    public GvrLayout(Context context) {
        super(context);
        if (axfq.k(context) == null) {
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
        init();
    }

    private void init() {
        try {
            if (this.impl == null) {
                this.impl = GvrLayoutFactory.create(getContext());
            }
            this.uiLayout = new GvrUiLayout(this.impl.getUiLayout());
            if (this.gvrApi == null) {
                this.gvrApi = new GvrApi(getContext(), this.impl.getNativeGvrContext());
            }
            addView((View) ObjectWrapper.b(this.impl.getRootView(), View.class));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean enableAsyncReprojectionProtected() {
        try {
            return this.impl.enableAsyncReprojection(1);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public GvrApi getGvrApi() {
        return this.gvrApi;
    }

    public GvrUiLayout getUiLayout() {
        return this.uiLayout;
    }

    public void onPause() {
        try {
            this.impl.onPause();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void onResume() {
        try {
            this.impl.onResume();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean setAsyncReprojectionEnabled(boolean z) {
        if (!z) {
            if (this.gvrApi.getAsyncReprojectionEnabled()) {
                throw new UnsupportedOperationException("Async reprojection cannot be disabled once enabled.");
            }
            return true;
        }
        try {
            return this.impl.enableAsyncReprojection(0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void shutdown() {
        try {
            ExternalSurface externalSurface = this.videoSurface;
            if (externalSurface != null) {
                externalSurface.shutdown();
                this.videoSurface = null;
            }
            this.impl.shutdown();
            this.gvrApi.shutdown();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void setPresentationView(View view) {
        try {
            this.impl.setPresentationView(ObjectWrapper.a(view));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void setStereoModeEnabled(boolean z) {
        try {
            this.impl.setStereoModeEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
