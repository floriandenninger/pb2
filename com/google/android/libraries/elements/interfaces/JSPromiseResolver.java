package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class JSPromiseResolver {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends JSPromiseResolver {
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

        private native void native_reject(long j, Status status);

        private native void native_resolve(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.JSPromiseResolver
        public void reject(Status status) {
            native_reject(this.nativeRef, status);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSPromiseResolver
        public void resolve() {
            native_resolve(this.nativeRef);
        }
    }

    public abstract void reject(Status status);

    public abstract void resolve();
}
