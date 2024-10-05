package defpackage;

import android.graphics.Matrix;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axiw extends baqt {
    private final axiv b = new axiv();

    @Override // defpackage.baqt
    public final void a() {
        this.b.c();
        super.a();
    }

    @Override // defpackage.baqt
    public final void b(VideoFrame videoFrame, bapq bapqVar, Matrix matrix, int i, int i2) {
        VideoFrame.Buffer buffer;
        int i3;
        int i4;
        VideoFrame.Buffer buffer2 = videoFrame.getBuffer();
        int rotation = videoFrame.getRotation();
        if (buffer2 instanceof baqj) {
            final axiv axivVar = this.b;
            baqj baqjVar = (baqj) buffer2;
            axivVar.b.a();
            amkq.F(rotation % 90 == 0, "Frame rotation must be a multiple of 90.");
            if (rotation % 180 == 0) {
                i3 = baqjVar.a;
                i4 = baqjVar.b;
            } else {
                i3 = baqjVar.b;
                i4 = baqjVar.a;
            }
            if (i <= 0 || i2 <= 0 || i + i >= i3 || i2 + i2 >= i4) {
                baqjVar.retain();
                buffer = baqjVar;
            } else {
                axivVar.a.c = Math.max(i, i2);
                amkq.N(!axivVar.c);
                axivVar.c = true;
                Matrix matrix2 = new Matrix();
                int i5 = baqjVar.a;
                int i6 = baqjVar.b;
                baqt.c(axivVar, baqjVar, matrix2, i5, i6, 0, 0, i5, i6);
                bapa bapaVar = axivVar.a.a;
                int i7 = bapaVar.c;
                int i8 = bapaVar.d;
                buffer = new baqj(i7, i8, i7, i8, 2, bapaVar.b, baqjVar.c, baqjVar.d, baqjVar.e, new baqg(new Runnable() { // from class: axiu
                    @Override // java.lang.Runnable
                    public final void run() {
                        axiv axivVar2 = axiv.this;
                        axivVar2.b.a();
                        axivVar2.c = false;
                    }
                }));
            }
        } else {
            buffer2.retain();
            buffer = buffer2;
        }
        VideoFrame videoFrame2 = new VideoFrame(buffer, videoFrame.getRotation(), videoFrame.getTimestampNs());
        super.b(videoFrame2, bapqVar, null, i, i2);
        videoFrame2.release();
    }
}
