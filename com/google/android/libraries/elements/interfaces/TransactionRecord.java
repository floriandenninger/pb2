package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class TransactionRecord {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class CppProxy extends TransactionRecord {
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

        private native Snapshot native_beginState(long j);

        private native Snapshot native_endState(long j);

        private native HashSet native_keys(long j);

        private native ArrayList native_keysOrdered(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TransactionRecord
        public Snapshot beginState() {
            return native_beginState(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TransactionRecord
        public Snapshot endState() {
            return native_endState(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.TransactionRecord
        public HashSet keys() {
            return native_keys(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TransactionRecord
        public ArrayList keysOrdered() {
            return native_keysOrdered(this.nativeRef);
        }
    }

    public abstract Snapshot beginState();

    public abstract Snapshot endState();

    public abstract HashSet keys();

    public abstract ArrayList keysOrdered();
}
