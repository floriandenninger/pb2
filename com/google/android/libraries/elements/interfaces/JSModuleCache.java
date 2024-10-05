package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class JSModuleCache {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends JSModuleCache {
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

        public static native JSModuleCache create();

        private native void nativeDestroy(long j);

        private native void native_addObserver(long j, JSModuleCacheObserver jSModuleCacheObserver);

        private native StatusOr native_getAvailableModuleSetVersion(long j, String str);

        private native ControllerModuleLoader native_getLoader(long j);

        private native StatusOr native_getModuleContents(long j, String str);

        private native StatusOr native_getModuleDependencies(long j, String str);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public void addObserver(JSModuleCacheObserver jSModuleCacheObserver) {
            native_addObserver(this.nativeRef, jSModuleCacheObserver);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getAvailableModuleSetVersion(String str) {
            return native_getAvailableModuleSetVersion(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public ControllerModuleLoader getLoader() {
            return native_getLoader(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getModuleContents(String str) {
            return native_getModuleContents(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getModuleDependencies(String str) {
            return native_getModuleDependencies(this.nativeRef, str);
        }
    }

    public static JSModuleCache create() {
        return CppProxy.create();
    }

    public abstract void addObserver(JSModuleCacheObserver jSModuleCacheObserver);

    public abstract StatusOr getAvailableModuleSetVersion(String str);

    public abstract ControllerModuleLoader getLoader();

    public abstract StatusOr getModuleContents(String str);

    public abstract StatusOr getModuleDependencies(String str);
}
