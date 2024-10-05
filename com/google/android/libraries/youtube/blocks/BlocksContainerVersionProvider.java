package com.google.android.libraries.youtube.blocks;

import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class BlocksContainerVersionProvider {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    final class CppProxy extends BlocksContainerVersionProvider {
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

        public static native BlocksContainerVersionProvider create();

        private native void nativeDestroy(long j);

        private native StatusOr native_getActiveContainerVersion(long j, long j2);

        private native void native_setActiveContainerVersion(long j, long j2, long j3, String str);

        private native void native_setPreloader(long j, ResourcePreloader resourcePreloader);

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

        @Override // com.google.android.libraries.youtube.blocks.BlocksContainerVersionProvider
        public StatusOr getActiveContainerVersion(long j) {
            return native_getActiveContainerVersion(this.nativeRef, j);
        }

        @Override // com.google.android.libraries.youtube.blocks.BlocksContainerVersionProvider
        public void setActiveContainerVersion(long j, long j2, String str) {
            native_setActiveContainerVersion(this.nativeRef, j, j2, str);
        }

        @Override // com.google.android.libraries.youtube.blocks.BlocksContainerVersionProvider
        public void setPreloader(ResourcePreloader resourcePreloader) {
            native_setPreloader(this.nativeRef, resourcePreloader);
        }
    }

    public static BlocksContainerVersionProvider create() {
        return CppProxy.create();
    }

    public abstract StatusOr getActiveContainerVersion(long j);

    public abstract void setActiveContainerVersion(long j, long j2, String str);

    public abstract void setPreloader(ResourcePreloader resourcePreloader);
}
