package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class EnvironmentDataObserver {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends EnvironmentDataObserver {
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

        private native void native_environmentDataDidChange(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataObserver
        public void environmentDataDidChange() {
            native_environmentDataDidChange(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public abstract void environmentDataDidChange();
}
