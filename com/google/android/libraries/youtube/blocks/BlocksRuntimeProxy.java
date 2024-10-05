package com.google.android.libraries.youtube.blocks;

import com.google.android.libraries.elements.interfaces.BlocksContainerLoaderProxy;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class BlocksRuntimeProxy {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    final class CppProxy extends BlocksRuntimeProxy {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native BlocksContainerLoaderProxy createContainerLoader();

        private native void nativeDestroy(long j);

        public static native void setContainerVersionProvider(BlocksContainerVersionProvider blocksContainerVersionProvider);

        public static native void setJsModuleCache(JSModuleCache jSModuleCache);

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

    public static BlocksContainerLoaderProxy createContainerLoader() {
        return CppProxy.createContainerLoader();
    }

    public static void setContainerVersionProvider(BlocksContainerVersionProvider blocksContainerVersionProvider) {
        CppProxy.setContainerVersionProvider(blocksContainerVersionProvider);
    }

    public static void setJsModuleCache(JSModuleCache jSModuleCache) {
        CppProxy.setJsModuleCache(jSModuleCache);
    }
}
