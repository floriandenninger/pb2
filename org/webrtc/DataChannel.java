package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DataChannel {
    public long a;
    public long b;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Buffer {
        public final ByteBuffer a;

        public Buffer(ByteBuffer byteBuffer, boolean z) {
            this.a = byteBuffer;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Init {
        public boolean a = true;
        public int b = -1;
        public int c = -1;
        public String d = "";
        public int e = -1;

        int getId() {
            return this.e;
        }

        int getMaxRetransmitTimeMs() {
            return this.b;
        }

        int getMaxRetransmits() {
            return this.c;
        }

        boolean getNegotiated() {
            return false;
        }

        boolean getOrdered() {
            return this.a;
        }

        String getProtocol() {
            return this.d;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface Observer {
        void onBufferedAmountChange(long j);

        void onMessage(Buffer buffer);

        void onStateChange();
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public DataChannel(long j) {
        this.a = j;
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native boolean nativeSend(byte[] bArr, boolean z);

    private native State nativeState();

    long getNativeDataChannel() {
        return this.a;
    }

    public native long nativeRegisterObserver(Observer observer);

    public native void nativeUnregisterObserver(long j);
}
