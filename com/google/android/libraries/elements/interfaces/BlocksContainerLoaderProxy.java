package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class BlocksContainerLoaderProxy {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends BlocksContainerLoaderProxy {
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

        private native void nativeDestroy(long j);

        private native Status native_loadContainerManifest(long j, byte[] bArr);

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

        @Override // com.google.android.libraries.elements.interfaces.BlocksContainerLoaderProxy
        public Status loadContainerManifest(byte[] bArr) {
            return native_loadContainerManifest(this.nativeRef, bArr);
        }
    }

    public abstract Status loadContainerManifest(byte[] bArr);
}
