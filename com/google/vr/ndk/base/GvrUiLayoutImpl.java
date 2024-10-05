package com.google.vr.ndk.base;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.axfq;
import defpackage.axgo;
import defpackage.axgs;
import defpackage.axgu;
import defpackage.axgx;
import defpackage.axgy;
import defpackage.axha;
import defpackage.axid;
import defpackage.axih;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrUiLayoutImpl extends axid {
    private final Runnable beginDimmingUiLayerRunnable;
    private final CloseButtonListenerWrapper closeButtonListener;
    private boolean daydreamModeEnabled;
    private final Runnable delayDimmingUiLayerAfterVisibleRunnable;
    private final axha uiLayer;
    private ObjectAnimator uiLayerDimmingAnimation;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    class CloseButtonListenerWrapper implements Runnable {
        private Runnable activeCloseButtonListener;
        private final Context context;
        private final Runnable defaultCloseButtonListener;
        private boolean invokingCloseButton = false;
        private final Runnable passiveCloseButtonListener;

        public CloseButtonListenerWrapper(Context context, Runnable runnable, DaydreamUtilsWrapper daydreamUtilsWrapper) {
            this.context = context;
            this.passiveCloseButtonListener = runnable;
            Runnable createDefaultCloseButtonListener = GvrUiLayoutImpl.createDefaultCloseButtonListener(context, daydreamUtilsWrapper);
            this.defaultCloseButtonListener = createDefaultCloseButtonListener;
            this.activeCloseButtonListener = createDefaultCloseButtonListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.invokingCloseButton) {
                Log.w("GvrUiLayoutImpl", "GVR close behavior invoked recursively.");
                Activity k = axfq.k(this.context);
                if (k != null) {
                    k.finish();
                    return;
                }
                return;
            }
            this.invokingCloseButton = true;
            try {
                Runnable runnable = this.passiveCloseButtonListener;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = this.activeCloseButtonListener;
                if (runnable2 != null) {
                    runnable2.run();
                }
            } finally {
                this.invokingCloseButton = false;
            }
        }

        public void setClientCloseButtonListener(Runnable runnable) {
            if (runnable == null) {
                runnable = this.defaultCloseButtonListener;
            }
            this.activeCloseButtonListener = runnable;
        }
    }

    public GvrUiLayoutImpl(Context context, Runnable runnable) {
        this(context, runnable, new DaydreamUtilsWrapper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void beginDimmingUiLayer() {
        cancelDimmingUiLayer();
        axgs axgsVar = this.uiLayer.h;
        if (axgsVar == null || axgsVar.getVisibility() != 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.uiLayer.b, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.2f);
            this.uiLayerDimmingAnimation = ofFloat;
            ofFloat.setDuration(500L);
            this.uiLayerDimmingAnimation.start();
            setDimmedUiTouchOverride();
            return;
        }
        getRoot().postDelayed(this.delayDimmingUiLayerAfterVisibleRunnable, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Runnable createDefaultCloseButtonListener(final Context context, DaydreamUtilsWrapper daydreamUtilsWrapper) {
        final Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        final Activity k = axfq.k(context);
        if (k == null) {
            return new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    context.startActivity(intent);
                }
            };
        }
        if (daydreamUtilsWrapper.isDaydreamActivity(k)) {
            return new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    k.startActivity(intent);
                    k.finish();
                }
            };
        }
        return new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl.3
            @Override // java.lang.Runnable
            public void run() {
                k.onBackPressed();
            }
        };
    }

    private void delayDimmingUiLayer(long j) {
        cancelDimmingUiLayer();
        getRoot().postDelayed(this.beginDimmingUiLayerRunnable, j);
    }

    private void setDimmedUiTouchOverride() {
        this.uiLayer.k = new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                GvrUiLayoutImpl.this.m105xa40a1450();
            }
        };
    }

    public void cancelDimmingUiLayer() {
        getRoot().removeCallbacks(this.beginDimmingUiLayerRunnable);
        ObjectAnimator objectAnimator = this.uiLayerDimmingAnimation;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.uiLayerDimmingAnimation = null;
        }
        this.uiLayer.b.setAlpha(1.0f);
        this.uiLayer.k = null;
    }

    public void delayDimmingUiLayerAfterVisible() {
        delayDimmingUiLayer(2500L);
    }

    public ViewGroup getRoot() {
        return this.uiLayer.b;
    }

    @Override // defpackage.axie
    public axih getRootView() {
        return ObjectWrapper.a(this.uiLayer.b);
    }

    public void invokeCloseButtonListener() {
        this.closeButtonListener.run();
    }

    @Override // defpackage.axie
    public boolean isEnabled() {
        return this.uiLayer.i;
    }

    /* renamed from: lambda$setDimmedUiTouchOverride$0$com-google-vr-ndk-base-GvrUiLayoutImpl, reason: not valid java name */
    public /* synthetic */ void m105xa40a1450() {
        delayDimmingUiLayer(5000L);
    }

    @Override // defpackage.axie
    public void setCloseButtonListener(axih axihVar) {
        this.closeButtonListener.setClientCloseButtonListener(axihVar != null ? (Runnable) ObjectWrapper.b(axihVar, Runnable.class) : null);
    }

    public void setDaydreamModeEnabled(boolean z) {
        if (this.daydreamModeEnabled == z) {
            return;
        }
        this.daydreamModeEnabled = z;
        if (z) {
            this.uiLayer.d(0.35f);
            this.uiLayer.e(false);
        } else {
            this.uiLayer.d(1.0f);
        }
    }

    @Override // defpackage.axie
    public void setEnabled(boolean z) {
        axha axhaVar = this.uiLayer;
        axhaVar.i = z;
        axgo.a(new axgx(axhaVar, z, 0));
    }

    @Override // defpackage.axie
    public void setSettingsButtonEnabled(boolean z) {
        axha axhaVar = this.uiLayer;
        axhaVar.j = z;
        axgo.a(new axgx(axhaVar, z, 2));
    }

    @Override // defpackage.axie
    public void setSettingsButtonListener(axih axihVar) {
        this.uiLayer.m = axihVar != null ? (Runnable) ObjectWrapper.b(axihVar, Runnable.class) : null;
    }

    @Override // defpackage.axie
    public void setTransitionViewEnabled(boolean z) {
        axha axhaVar = this.uiLayer;
        boolean z2 = false;
        if (z && !this.daydreamModeEnabled) {
            z2 = true;
        }
        axhaVar.e(z2);
    }

    @Override // defpackage.axie
    public void setTransitionViewListener(axih axihVar) {
        axha axhaVar = this.uiLayer;
        Runnable runnable = axihVar != null ? (Runnable) ObjectWrapper.b(axihVar, Runnable.class) : null;
        axhaVar.n = runnable;
        axgo.a(new axgy(axhaVar, runnable, 1));
    }

    @Override // defpackage.axie
    public void setViewerName(String str) {
        axha axhaVar = this.uiLayer;
        axhaVar.o = str;
        axgo.a(new axgu(axhaVar, str));
    }

    public GvrUiLayoutImpl(Context context, Runnable runnable, DaydreamUtilsWrapper daydreamUtilsWrapper) {
        this.delayDimmingUiLayerAfterVisibleRunnable = new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GvrUiLayoutImpl.this.delayDimmingUiLayerAfterVisible();
            }
        };
        this.beginDimmingUiLayerRunnable = new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GvrUiLayoutImpl.this.beginDimmingUiLayer();
            }
        };
        this.daydreamModeEnabled = false;
        CloseButtonListenerWrapper closeButtonListenerWrapper = new CloseButtonListenerWrapper(context, runnable, daydreamUtilsWrapper);
        this.closeButtonListener = closeButtonListenerWrapper;
        axha axhaVar = new axha(context);
        this.uiLayer = axhaVar;
        axhaVar.l = closeButtonListenerWrapper;
        axgo.a(new axgy(axhaVar, closeButtonListenerWrapper, 0));
    }
}
