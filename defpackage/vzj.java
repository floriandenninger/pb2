package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.video.trim.VideoTrimView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vzj extends Handler {
    final /* synthetic */ VideoTrimView a;
    private float b = Float.NaN;

    public vzj(VideoTrimView videoTrimView) {
        this.a = videoTrimView;
    }

    public final void a() {
        removeMessages(0);
        this.b = Float.NaN;
    }

    public final void b(long j, float f) {
        boolean isNaN = Float.isNaN(this.b);
        float abs = Math.abs(f - this.b);
        float f2 = this.a.c / 2;
        if (isNaN || abs > f2) {
            removeMessages(0);
            sendEmptyMessageDelayed(0, j);
            this.b = f;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 0) {
            return;
        }
        VideoTrimView videoTrimView = this.a;
        if (videoTrimView.l && videoTrimView.w() && !this.a.x()) {
            VideoTrimView videoTrimView2 = this.a;
            if (!videoTrimView2.v) {
                videoTrimView2.j();
            }
            VideoTrimView videoTrimView3 = this.a;
            if (videoTrimView3.k) {
                amkq.N(!videoTrimView3.x());
                amkq.N(videoTrimView3.w());
                if (videoTrimView3.q.b <= videoTrimView3.n) {
                    return;
                }
                long h = videoTrimView3.u == vzm.BEGIN ? videoTrimView3.h() : videoTrimView3.g();
                double b = videoTrimView3.q.b(h);
                double d = h;
                double d2 = videoTrimView3.n;
                Double.isNaN(b);
                Double.isNaN(d2);
                Double.isNaN(d);
                long j = (long) (d - (b * d2));
                Double.isNaN(b);
                Double.isNaN(d2);
                Double.isNaN(d);
                long j2 = (long) (d + ((1.0d - b) * d2));
                videoTrimView3.t = new vyn(videoTrimView3.r);
                videoTrimView3.t.a(j, j2);
                videoTrimView3.t.k(videoTrimView3);
                videoTrimView3.q.l(j, j2);
                videoTrimView3.l();
                videoTrimView3.s();
                videoTrimView3.k(videoTrimView3.b);
                videoTrimView3.requestLayout();
            }
        }
    }
}
