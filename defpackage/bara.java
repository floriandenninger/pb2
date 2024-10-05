package defpackage;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.JniCommon;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bara {
    public final baqo a;
    public final bapa b;
    public final baoy c;
    public final baqt d;
    private final baqz e;

    public bara() {
        baqt baqtVar = new baqt();
        baqo baqoVar = new baqo();
        this.a = baqoVar;
        this.b = new bapa(6408);
        baqz baqzVar = new baqz();
        this.e = baqzVar;
        this.c = new baoy("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", baqzVar);
        this.d = baqtVar;
        baqoVar.b();
    }

    public final VideoFrame.I420Buffer a(baqr baqrVar) {
        try {
            baqrVar.getWidth();
            baqrVar.getHeight();
            baqrVar.retain();
            int width = baqrVar.getWidth();
            int height = baqrVar.getHeight();
            int i = ((width + 7) / 8) * 8;
            int i2 = (height + 1) / 2;
            int i3 = height + i2;
            ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i * i3);
            int i4 = i / 4;
            Matrix matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            this.b.b(i4, i3);
            GLES20.glBindFramebuffer(36160, this.b.a);
            aynu.s("glBindFramebuffer");
            baqz baqzVar = this.e;
            baqzVar.d = baqz.a;
            baqzVar.e = 1.0f;
            baqt.c(this.c, baqrVar, matrix, width, height, 0, 0, i4, height);
            baqz baqzVar2 = this.e;
            baqzVar2.d = baqz.b;
            baqzVar2.e = 2.0f;
            int i5 = i4 / 2;
            baqt.c(this.c, baqrVar, matrix, width, height, 0, height, i5, i2);
            baqz baqzVar3 = this.e;
            baqzVar3.d = baqz.c;
            baqzVar3.e = 2.0f;
            baqt.c(this.c, baqrVar, matrix, width, height, i5, height, i5, i2);
            bapa bapaVar = this.b;
            GLES20.glReadPixels(0, 0, bapaVar.c, bapaVar.d, 6408, 5121, nativeAllocateByteBuffer);
            aynu.s("YuvConverter.convert");
            GLES20.glBindFramebuffer(36160, 0);
            int i6 = i * height;
            int i7 = i / 2;
            int i8 = i6 + i7;
            ByteBuffer slice = nativeAllocateByteBuffer.slice();
            int i9 = (i * (i2 - 1)) + i7;
            ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
            ByteBuffer slice3 = nativeAllocateByteBuffer.slice();
            baqrVar.release();
            return JavaI420Buffer.b(width, height, slice, i, slice2, i, slice3, i, new baqy(nativeAllocateByteBuffer, 0));
        } catch (GLException e) {
            Logging.e("YuvConverter", "Failed to convert TextureBuffer", e);
            return null;
        }
    }
}
