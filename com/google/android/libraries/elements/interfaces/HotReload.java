package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class HotReload {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends HotReload {
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

        public static native HotReload create(String str, ResourceLoader resourceLoader);

        public static native HotReload createForPlayground(String str, ResourceLoader resourceLoader, ByteStore byteStore);

        private native void nativeDestroy(long j);

        private native void native_allowUnsubscribeFromResourceChanges(long j, boolean z);

        private native DevResourceManager native_devResourceManager(long j);

        private native Status native_loadResourceList(long j, byte[] bArr);

        private native void native_setLoggingDelegate(long j, LoggingDelegate loggingDelegate);

        private native void native_start(long j);

        private native void native_stop(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.HotReload
        public void allowUnsubscribeFromResourceChanges(boolean z) {
            native_allowUnsubscribeFromResourceChanges(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.HotReload
        public DevResourceManager devResourceManager() {
            return native_devResourceManager(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.HotReload
        public Status loadResourceList(byte[] bArr) {
            return native_loadResourceList(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.HotReload
        public void setLoggingDelegate(LoggingDelegate loggingDelegate) {
            native_setLoggingDelegate(this.nativeRef, loggingDelegate);
        }

        @Override // com.google.android.libraries.elements.interfaces.HotReload
        public void start() {
            native_start(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.HotReload
        public void stop() {
            native_stop(this.nativeRef);
        }
    }

    public static HotReload create(String str, ResourceLoader resourceLoader) {
        return CppProxy.create(str, resourceLoader);
    }

    public static HotReload createForPlayground(String str, ResourceLoader resourceLoader, ByteStore byteStore) {
        return CppProxy.createForPlayground(str, resourceLoader, byteStore);
    }

    public abstract void allowUnsubscribeFromResourceChanges(boolean z);

    public abstract DevResourceManager devResourceManager();

    public abstract Status loadResourceList(byte[] bArr);

    public abstract void setLoggingDelegate(LoggingDelegate loggingDelegate);

    public abstract void start();

    public abstract void stop();
}
