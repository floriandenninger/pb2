package com.google.android.exoplayer.youtube.libvpx;

import com.google.android.exoplayer.ColorInfo;
import defpackage.phc;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VpxOutputBuffer extends phc {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public ColorInfo colorInfo;
    public int colorspace;
    public ByteBuffer data;
    public int decoderPrivate;
    public int height;
    public int mode;
    private final VpxDecoder owner;
    public int width;
    public ByteBuffer[] yuvPlanes = new ByteBuffer[3];
    public int[] yuvStrides = new int[3];

    public VpxOutputBuffer(VpxDecoder vpxDecoder) {
        this.owner = vpxDecoder;
    }

    private boolean isSafeToMultiply(int i, int i2) {
        return i >= 0 && i2 >= 0 && (i2 <= 0 || i < Integer.MAX_VALUE / i2);
    }

    boolean allocateYuvFrame(int i, int i2, int i3, int i4, int i5) {
        this.width = i;
        this.height = i2;
        this.colorspace = i5;
        int i6 = (int) ((i2 + 1) / 2);
        if (isSafeToMultiply(i3, i2) && isSafeToMultiply(i4, i6)) {
            int i7 = i2 * i3;
            int i8 = i6 * i4;
            int i9 = i8 + i8 + i7;
            if (isSafeToMultiply(i8, 2) && i9 >= i7) {
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i9) {
                    try {
                        this.data = ByteBuffer.allocateDirect(i9);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                this.yuvPlanes[0] = this.data.slice();
                this.yuvPlanes[1] = this.data.slice();
                this.yuvPlanes[2] = this.data.slice();
                int[] iArr = this.yuvStrides;
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }

    void assignYuvFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.width = i;
        this.height = i2;
        this.colorspace = i8;
        this.data = byteBuffer;
        this.yuvPlanes[0] = this.data.slice();
        int i9 = ((int) ((i2 + 1) / 2)) * i7;
        this.yuvPlanes[1] = this.data.slice();
        this.yuvPlanes[2] = this.data.slice();
        int[] iArr = this.yuvStrides;
        iArr[0] = i6;
        iArr[1] = i7;
        iArr[2] = i7;
    }

    boolean initForRgbFrame(int i, int i2) {
        this.width = i;
        this.height = i2;
        if (isSafeToMultiply(i, i2)) {
            int i3 = i * i2;
            if (isSafeToMultiply(i3, 2)) {
                int i4 = i3 + i3;
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i4) {
                    try {
                        this.data = ByteBuffer.allocateDirect(i4);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.phc
    public void release() {
        this.owner.e(this);
    }
}
