package defpackage;

import android.os.SystemClock;
import java.util.Locale;
import org.webrtc.Logging;
import org.webrtc.VideoCodecStatus;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class axjb implements Runnable {
    public final /* synthetic */ axjl a;
    private final /* synthetic */ int b;

    public /* synthetic */ axjb(axjl axjlVar, int i) {
        this.b = i;
        this.a = axjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            axjl axjlVar = this.a;
            axjlVar.i();
            if (axjlVar.p == axjlVar.y) {
                axjlVar.l();
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float f = ((float) (elapsedRealtime - axjlVar.x)) / 1000.0f;
            float f2 = axjlVar.p - axjlVar.y;
            Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "Statistics for last %s ms. Received frames: %s. Decoded: %s. Delivered: %s. Bitrate: %.0f kbps. FPS: %.1f. Decode time: %.1f. Delay: %.1f.", Long.valueOf(elapsedRealtime - axjlVar.x), Integer.valueOf(axjlVar.n), Integer.valueOf(axjlVar.o), Integer.valueOf(axjlVar.p), Float.valueOf(((axjlVar.z * 8) / f) / 1000.0f), Float.valueOf(f2 / f), Float.valueOf(((float) axjlVar.A) / f2), Float.valueOf(((float) axjlVar.B) / f2)));
            axjlVar.l();
            return;
        }
        if (i == 1) {
            axjl axjlVar2 = this.a;
            axjlVar2.i();
            VideoCodecStatus d = axjlVar2.d(0L);
            if (d == VideoCodecStatus.OK) {
                if (axjlVar2.n <= axjlVar2.o) {
                    axjlVar2.l.a(100L);
                    return;
                }
                return;
            } else {
                String valueOf = String.valueOf(d);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Error in deliverPendingOutputs: ");
                sb.append(valueOf);
                Logging.b("IMCVideoDecoder", sb.toString());
                axjlVar2.r = d;
                return;
            }
        }
        this.a.m();
    }
}
