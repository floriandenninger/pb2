package com.google.vr.sdk.audio;

import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrAudioSurround {
    private static UnsatisfiedLinkError nativeLibraryLoadException;
    private final int numFramesPerOutputBuffer;
    private final int numInputChannels;
    private long vrAudioSystemRef;

    static {
        try {
            System.loadLibrary("gvr_audio");
        } catch (UnsatisfiedLinkError e) {
            nativeLibraryLoadException = e;
        }
    }

    public GvrAudioSurround(int i, int i2, int i3, int i4) {
        this.vrAudioSystemRef = 0L;
        UnsatisfiedLinkError unsatisfiedLinkError = nativeLibraryLoadException;
        if (unsatisfiedLinkError != null) {
            throw unsatisfiedLinkError;
        }
        this.vrAudioSystemRef = nativeInitialize(i, i2, i3, 1024);
        this.numFramesPerOutputBuffer = 1024;
        this.numInputChannels = i3;
    }

    private native int nativeAddInput(long j, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeFlush(long j);

    private native int nativeGetAvailableInputSize(long j);

    private native int nativeGetAvailableOutputSize(long j);

    private native int nativeGetOutput(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long nativeInitialize(int i, int i2, int i3, int i4);

    private native void nativeRelease(long j);

    private native void nativeSetOrientationQuaternion(long j, float f, float f2, float f3, float f4);

    private native boolean nativeTriggerProcessing(long j);

    public int addInput(ByteBuffer byteBuffer, int i, int i2) {
        return nativeAddInput(this.vrAudioSystemRef, byteBuffer, i, i2);
    }

    protected void finalize() {
        try {
            if (this.vrAudioSystemRef != 0) {
                Log.w("GvrAudioSurround", "GvrAudioSurround not correctly released");
                release();
            }
        } finally {
            super.finalize();
        }
    }

    public void flush() {
        nativeFlush(this.vrAudioSystemRef);
    }

    public int getAvailableOutputSize() {
        return nativeGetAvailableOutputSize(this.vrAudioSystemRef);
    }

    public int getOutput(ByteBuffer byteBuffer, int i, int i2) {
        return nativeGetOutput(this.vrAudioSystemRef, byteBuffer, i, i2);
    }

    public void release() {
        nativeRelease(this.vrAudioSystemRef);
        this.vrAudioSystemRef = 0L;
    }

    public boolean triggerProcessing() {
        return nativeTriggerProcessing(this.vrAudioSystemRef);
    }

    public void updateNativeOrientation(float f, float f2, float f3, float f4) {
        nativeSetOrientationQuaternion(this.vrAudioSystemRef, f, f2, f3, f4);
    }
}
