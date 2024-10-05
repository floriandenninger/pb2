package com.youtube.libraries.bandwidth;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class BandwidthSampleGenerator {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    final class CppProxy extends BandwidthSampleGenerator {
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

        public static native BandwidthSampleGenerator create(double d, int i, BandwidthSampleCallback bandwidthSampleCallback);

        private native void nativeDestroy(long j);

        private native void native_onCompletion(long j, CompletionEvent completionEvent);

        private native void native_onResponse(long j, ResponseEvent responseEvent);

        private native void native_onTransfer(long j, TransferEvent transferEvent);

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

        @Override // com.youtube.libraries.bandwidth.BandwidthSampleGenerator
        public void onCompletion(CompletionEvent completionEvent) {
            native_onCompletion(this.nativeRef, completionEvent);
        }

        @Override // com.youtube.libraries.bandwidth.BandwidthSampleGenerator
        public void onResponse(ResponseEvent responseEvent) {
            native_onResponse(this.nativeRef, responseEvent);
        }

        @Override // com.youtube.libraries.bandwidth.BandwidthSampleGenerator
        public void onTransfer(TransferEvent transferEvent) {
            native_onTransfer(this.nativeRef, transferEvent);
        }
    }

    public static BandwidthSampleGenerator create(double d, int i, BandwidthSampleCallback bandwidthSampleCallback) {
        return CppProxy.create(d, i, bandwidthSampleCallback);
    }

    public abstract void onCompletion(CompletionEvent completionEvent);

    public abstract void onResponse(ResponseEvent responseEvent);

    public abstract void onTransfer(TransferEvent transferEvent);
}
