package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class JSEntitiesProcessors {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends JSEntitiesProcessors {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        public static native void registerProcessors(JSController jSController, EntitiesProcessorResolver entitiesProcessorResolver);

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
    }

    public static void registerProcessors(JSController jSController, EntitiesProcessorResolver entitiesProcessorResolver) {
        CppProxy.registerProcessors(jSController, entitiesProcessorResolver);
    }
}
