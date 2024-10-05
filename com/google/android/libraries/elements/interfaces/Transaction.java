package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class Transaction {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends Transaction {
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

        private native void native_abort(long j);

        private native void native_commit(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public void abort() {
            native_abort(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public void commit() {
            native_commit(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public abstract void abort();

    public abstract void commit();
}
