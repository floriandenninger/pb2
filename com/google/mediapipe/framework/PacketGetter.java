package com.google.mediapipe.framework;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PacketGetter {
    private PacketGetter() {
    }

    public static GraphTextureFrame a(Packet packet) {
        return new GraphTextureFrame(nativeGetGpuBuffer(packet.getNativeHandle()), packet.nativeGetTimestamp(packet.a));
    }

    private static native byte[] nativeGetAudioData(long j);

    private static native boolean nativeGetBool(long j);

    private static native byte[] nativeGetBytes(long j);

    private static native float nativeGetFloat32(long j);

    private static native float[] nativeGetFloat32Vector(long j);

    private static native double nativeGetFloat64(long j);

    private static native double[] nativeGetFloat64Vector(long j);

    private static native long nativeGetGpuBuffer(long j);

    private static native int nativeGetGpuBufferName(long j);

    public static native boolean nativeGetImageData(long j, ByteBuffer byteBuffer);

    public static native int nativeGetImageHeight(long j);

    public static native int nativeGetImageWidth(long j);

    private static native short nativeGetInt16(long j);

    private static native short[] nativeGetInt16Vector(long j);

    private static native int nativeGetInt32(long j);

    private static native int[] nativeGetInt32Vector(long j);

    private static native long nativeGetInt64(long j);

    private static native long[] nativeGetInt64Vector(long j);

    private static native int nativeGetMatrixCols(long j);

    private static native float[] nativeGetMatrixData(long j);

    private static native int nativeGetMatrixRows(long j);

    private static native long nativeGetPacketFromReference(long j);

    private static native long[] nativeGetPairPackets(long j);

    private static native void nativeGetProto(long j, ProtoUtil$SerializedMessage protoUtil$SerializedMessage);

    public static native byte[] nativeGetProtoBytes(long j);

    private static native byte[][] nativeGetProtoVector(long j);

    private static native boolean nativeGetRgbaFromRgb(long j, ByteBuffer byteBuffer);

    private static native String nativeGetString(long j);

    private static native int nativeGetTimeSeriesHeaderNumChannels(long j);

    private static native double nativeGetTimeSeriesHeaderSampleRate(long j);

    private static native long[] nativeGetVectorPackets(long j);

    private static native int nativeGetVideoHeaderHeight(long j);

    private static native int nativeGetVideoHeaderWidth(long j);
}
