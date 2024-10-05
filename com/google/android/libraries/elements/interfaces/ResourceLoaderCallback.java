package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ResourceLoaderCallback {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends ResourceLoaderCallback {
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

        private native void native_resourcesProcessed(long j, ValidationResult validationResult, Status status);

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

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderCallback
        public void resourcesProcessed(ValidationResult validationResult, Status status) {
            native_resourcesProcessed(this.nativeRef, validationResult, status);
        }
    }

    public abstract void resourcesProcessed(ValidationResult validationResult, Status status);
}
