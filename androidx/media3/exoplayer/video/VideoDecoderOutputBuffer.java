package androidx.media3.exoplayer.video;

import defpackage.asx;
import defpackage.asy;
import defpackage.pms;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VideoDecoderOutputBuffer extends asy {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public int decoderPrivate;
    public pms format;
    public int height;
    public int mode;
    private final asx owner;
    public ByteBuffer supplementalData;
    public int width;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(asx asxVar) {
        this.owner = asxVar;
    }

    private static boolean isSafeToMultiply(int i, int i2) {
        return i >= 0 && i2 >= 0 && (i2 <= 0 || i < Integer.MAX_VALUE / i2);
    }

    public void init(long j, int i, ByteBuffer byteBuffer) {
        this.timeUs = j;
        this.mode = i;
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            addFlag(268435456);
            int limit = byteBuffer.limit();
            ByteBuffer byteBuffer2 = this.supplementalData;
            if (byteBuffer2 == null || byteBuffer2.capacity() < limit) {
                this.supplementalData = ByteBuffer.allocate(limit);
            }
            this.supplementalData.put(byteBuffer);
            return;
        }
        this.supplementalData = null;
    }

    public void initForPrivateFrame(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
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
                    this.data = ByteBuffer.allocateDirect(i9);
                }
                if (this.yuvPlanes == null) {
                    this.yuvPlanes = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.data;
                ByteBuffer[] byteBufferArr = this.yuvPlanes;
                ByteBuffer slice = byteBuffer2.slice();
                byteBufferArr[0] = slice;
                ByteBuffer slice2 = byteBuffer2.slice();
                byteBufferArr[1] = slice2;
                ByteBuffer slice3 = byteBuffer2.slice();
                byteBufferArr[2] = slice3;
                if (this.yuvStrides == null) {
                    this.yuvStrides = new int[3];
                }
                int[] iArr = this.yuvStrides;
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.asy
    public void release() {
        this.owner.a(this);
    }
}
