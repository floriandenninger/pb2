package com.google.android.libraries.elements.interfaces;

import android.graphics.Rect;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class IntersectionEngine {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends IntersectionEngine {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native IntersectionEngine create();

        private native void nativeDestroy(long j);

        private native void native_onEnter(long j, String str, Rect rect, Rect rect2, Rect rect3, boolean z);

        private native void native_onExit(long j, String str, Rect rect, Rect rect2, Rect rect3, boolean z);

        private native void native_onScroll(long j, String str, Rect rect, Rect rect2, Rect rect3, int i, int i2);

        private native IntersectionSubscription native_subscribe(long j, String str, IntersectionObserver intersectionObserver);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onEnter(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
            native_onEnter(this.nativeRef, str, rect, rect2, rect3, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onExit(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
            native_onExit(this.nativeRef, str, rect, rect2, rect3, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onScroll(String str, Rect rect, Rect rect2, Rect rect3, int i, int i2) {
            native_onScroll(this.nativeRef, str, rect, rect2, rect3, i, i2);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public IntersectionSubscription subscribe(String str, IntersectionObserver intersectionObserver) {
            return native_subscribe(this.nativeRef, str, intersectionObserver);
        }
    }

    public static IntersectionEngine create() {
        return CppProxy.create();
    }

    public abstract void onEnter(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    public abstract void onExit(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    public abstract void onScroll(String str, Rect rect, Rect rect2, Rect rect3, int i, int i2);

    public abstract IntersectionSubscription subscribe(String str, IntersectionObserver intersectionObserver);
}
