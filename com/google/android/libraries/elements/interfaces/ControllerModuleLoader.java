package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ControllerModuleLoader {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends ControllerModuleLoader {
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

        private native Status native_loadModule(long j, byte[] bArr, ArrayList arrayList);

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

        @Override // com.google.android.libraries.elements.interfaces.ControllerModuleLoader
        public Status loadModule(byte[] bArr, ArrayList arrayList) {
            return native_loadModule(this.nativeRef, bArr, arrayList);
        }
    }

    public abstract Status loadModule(byte[] bArr, ArrayList arrayList);
}
