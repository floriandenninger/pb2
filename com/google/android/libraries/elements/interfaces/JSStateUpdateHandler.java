package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class JSStateUpdateHandler {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends JSStateUpdateHandler {
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

        private native byte[] native_getCreationData(long j);

        private native void native_stateDidUpdate(long j, byte[] bArr);

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

        @Override // com.google.android.libraries.elements.interfaces.JSStateUpdateHandler
        public byte[] getCreationData() {
            return native_getCreationData(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateUpdateHandler
        public void stateDidUpdate(byte[] bArr) {
            native_stateDidUpdate(this.nativeRef, bArr);
        }
    }

    public abstract byte[] getCreationData();

    public abstract void stateDidUpdate(byte[] bArr);
}
