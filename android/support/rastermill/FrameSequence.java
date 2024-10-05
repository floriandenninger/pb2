package android.support.rastermill;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FrameSequence {
    private final int mDefaultLoopCount;
    private final int mFrameCount;
    private final int mHeight;
    private final long mNativeFrameSequence;
    private final boolean mOpaque;
    private final int mWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class State {
        private long mNativeState;

        public State(long j) {
            this.mNativeState = j;
        }

        public void destroy() {
            long j = this.mNativeState;
            if (j != 0) {
                FrameSequence.nativeDestroyState(j);
                this.mNativeState = 0L;
            }
        }

        public long getFrame(int i, Bitmap bitmap, int i2) {
            if (bitmap == null || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                throw new IllegalArgumentException("Bitmap passed must be non-null and ARGB_8888");
            }
            long j = this.mNativeState;
            if (j == 0) {
                throw new IllegalStateException("attempted to draw destroyed FrameSequenceState");
            }
            return FrameSequence.nativeGetFrame(j, i, bitmap, i2);
        }
    }

    static {
        System.loadLibrary("framesequence");
    }

    private FrameSequence(long j, int i, int i2, boolean z, int i3, int i4) {
        this.mNativeFrameSequence = j;
        this.mWidth = i;
        this.mHeight = i2;
        this.mOpaque = z;
        this.mFrameCount = i3;
        this.mDefaultLoopCount = i4;
    }

    public static FrameSequence decodeByteArray(byte[] bArr) {
        return decodeByteArray(bArr, 0, bArr.length);
    }

    private static native long nativeCreateState(long j);

    private static native FrameSequence nativeDecodeByteArray(byte[] bArr, int i, int i2);

    private static native FrameSequence nativeDecodeByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native FrameSequence nativeDecodeStream(InputStream inputStream, byte[] bArr);

    private static native void nativeDestroyFrameSequence(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeDestroyState(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeGetFrame(long j, int i, Bitmap bitmap, int i2);

    public State createState() {
        long j = this.mNativeFrameSequence;
        if (j == 0) {
            throw new IllegalStateException("attempted to use incorrectly built FrameSequence");
        }
        long nativeCreateState = nativeCreateState(j);
        if (nativeCreateState == 0) {
            return null;
        }
        return new State(nativeCreateState);
    }

    protected void finalize() {
        try {
            long j = this.mNativeFrameSequence;
            if (j != 0) {
                nativeDestroyFrameSequence(j);
            }
        } finally {
            super.finalize();
        }
    }

    public int getDefaultLoopCount() {
        return this.mDefaultLoopCount;
    }

    public int getFrameCount() {
        return this.mFrameCount;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isOpaque() {
        return this.mOpaque;
    }

    public static FrameSequence decodeByteArray(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
                throw new IllegalArgumentException("invalid offset/length parameters");
            }
            return nativeDecodeByteArray(bArr, i, i2);
        }
        throw new IllegalArgumentException();
    }

    public static FrameSequence decodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        if (!byteBuffer.isDirect()) {
            if (byteBuffer.hasArray()) {
                return decodeByteArray(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Cannot have non-direct ByteBuffer with no byte array");
        }
        return nativeDecodeByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static FrameSequence decodeStream(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }
        return nativeDecodeStream(inputStream, new byte[16384]);
    }
}
