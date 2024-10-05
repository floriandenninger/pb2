package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ResourcePreloader {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends ResourcePreloader {
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

        private native Status native_ensureLoaded(long j, HashSet hashSet, ProcessState processState, Long l);

        private native Status native_loadAll(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourcePreloader
        public Status ensureLoaded(HashSet hashSet, ProcessState processState, Long l) {
            return native_ensureLoaded(this.nativeRef, hashSet, processState, l);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourcePreloader
        public Status loadAll() {
            return native_loadAll(this.nativeRef);
        }
    }

    public abstract Status ensureLoaded(HashSet hashSet, ProcessState processState, Long l);

    public abstract Status loadAll();
}
