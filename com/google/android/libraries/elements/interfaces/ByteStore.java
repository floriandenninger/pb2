package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ByteStore {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends ByteStore {
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

        public static native ByteStore create(ByteStoreConfig byteStoreConfig);

        private native void nativeDestroy(long j);

        private native void native_clear(long j);

        private native Transaction native_createTransaction(long j);

        private native void native_set(long j, String str, byte[] bArr);

        private native void native_setWithMetadata(long j, String str, byte[] bArr, byte[] bArr2);

        private native Snapshot native_snapshot(long j);

        private native Subscription native_subscribe(long j, String str, Observer observer);

        private native ArrayList native_subscribeList(long j, ArrayList arrayList, Observer observer);

        private native FaultSubscription native_subscribeToFaults(long j, FaultObserver faultObserver);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public void clear() {
            native_clear(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Transaction createTransaction() {
            return native_createTransaction(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public void set(String str, byte[] bArr) {
            native_set(this.nativeRef, str, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public void setWithMetadata(String str, byte[] bArr, byte[] bArr2) {
            native_setWithMetadata(this.nativeRef, str, bArr, bArr2);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Snapshot snapshot() {
            return native_snapshot(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Subscription subscribe(String str, Observer observer) {
            return native_subscribe(this.nativeRef, str, observer);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public ArrayList subscribeList(ArrayList arrayList, Observer observer) {
            return native_subscribeList(this.nativeRef, arrayList, observer);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public FaultSubscription subscribeToFaults(FaultObserver faultObserver) {
            return native_subscribeToFaults(this.nativeRef, faultObserver);
        }
    }

    public static ByteStore create(ByteStoreConfig byteStoreConfig) {
        return CppProxy.create(byteStoreConfig);
    }

    public abstract void clear();

    public abstract Transaction createTransaction();

    public abstract void set(String str, byte[] bArr);

    public abstract void setWithMetadata(String str, byte[] bArr, byte[] bArr2);

    public abstract Snapshot snapshot();

    public abstract Subscription subscribe(String str, Observer observer);

    public abstract ArrayList subscribeList(ArrayList arrayList, Observer observer);

    public abstract FaultSubscription subscribeToFaults(FaultObserver faultObserver);
}
