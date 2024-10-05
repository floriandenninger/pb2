package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PublicKeyVerifier {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends PublicKeyVerifier {
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

        private native Status native_initialize(long j, String str, byte[] bArr, byte[] bArr2);

        private native Status native_verify(long j, byte[] bArr, byte[] bArr2);

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

        @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
        public Status initialize(String str, byte[] bArr, byte[] bArr2) {
            return native_initialize(this.nativeRef, str, bArr, bArr2);
        }

        @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
        public Status verify(byte[] bArr, byte[] bArr2) {
            return native_verify(this.nativeRef, bArr, bArr2);
        }
    }

    public abstract Status initialize(String str, byte[] bArr, byte[] bArr2);

    public abstract Status verify(byte[] bArr, byte[] bArr2);
}
