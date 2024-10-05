package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import org.webrtc.NativeAndroidVideoTrackSource;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor$FrameAdaptationParameters;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclu implements Runnable {
    final /* synthetic */ aclw a;

    public aclu(aclw aclwVar) {
        this.a = aclwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        aclw aclwVar = this.a;
        aclwVar.a.removeCallbacks(aclwVar.f);
        if (this.a.g) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            aclw aclwVar2 = this.a;
            long j2 = aclwVar2.e;
            if (j2 < 0) {
                aclwVar2.e = elapsedRealtimeNanos;
                j2 = elapsedRealtimeNanos;
            }
            if (elapsedRealtimeNanos >= j2 - aclwVar2.d) {
                acoj acojVar = aclwVar2.h.a;
                abrb abrbVar = acojVar.a;
                final int i = abrbVar.e;
                if (i != 0) {
                    acnd acndVar = acojVar.g;
                    final int i2 = abrbVar.a;
                    final int i3 = abrbVar.b;
                    final acnp acnpVar = acndVar.s;
                    if (acnpVar != null) {
                        final acnc acncVar = acndVar.B;
                        final Handler handler = acndVar.j;
                        if (acnpVar.d == null || acnpVar.e != i2 || acnpVar.f != i3 || acnpVar.g != i || acnpVar.k != acncVar || acnpVar.h != handler) {
                            acnpVar.e = i2;
                            acnpVar.f = i3;
                            acnpVar.g = i;
                            acnpVar.k = acncVar;
                            acnpVar.h = handler;
                            final byte[] bArr = null;
                            final byte[] bArr2 = null;
                            acnpVar.d = new Runnable(i2, i3, i, acncVar, handler, bArr, bArr2) { // from class: acnn
                                public final /* synthetic */ int b;
                                public final /* synthetic */ int c;
                                public final /* synthetic */ int d;
                                public final /* synthetic */ Handler e;
                                public final /* synthetic */ acnc f;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    acnp acnpVar2 = acnp.this;
                                    int i4 = this.b;
                                    int i5 = this.c;
                                    int i6 = this.d;
                                    acnc acncVar2 = this.f;
                                    Handler handler2 = this.e;
                                    yjk.e();
                                    if (!acnpVar2.j || acnpVar2.i == null) {
                                        return;
                                    }
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                                    acmc acmcVar = new acmc(i4, i5, i6, null, acnpVar2.c, null);
                                    acmcVar.c = acncVar2;
                                    acmcVar.a = handler2;
                                    VideoFrame videoFrame = new VideoFrame(acmcVar, 0, nanos);
                                    baqu baquVar = (baqu) acnpVar2.i;
                                    VideoProcessor$FrameAdaptationParameters nativeAdaptFrame = NativeAndroidVideoTrackSource.nativeAdaptFrame(baquVar.a.a.a, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs());
                                    synchronized (baquVar.a.b) {
                                    }
                                    VideoFrame videoFrame2 = nativeAdaptFrame.h ? null : new VideoFrame(videoFrame.getBuffer().cropAndScale(nativeAdaptFrame.a, nativeAdaptFrame.b, nativeAdaptFrame.c, nativeAdaptFrame.d, nativeAdaptFrame.e, nativeAdaptFrame.f), videoFrame.getRotation(), nativeAdaptFrame.g);
                                    if (videoFrame2 != null) {
                                        NativeAndroidVideoTrackSource.nativeOnFrameCaptured(baquVar.a.a.a, videoFrame2.getRotation(), videoFrame2.getTimestampNs(), videoFrame2.getBuffer());
                                        videoFrame2.release();
                                    }
                                    videoFrame.release();
                                }
                            };
                        }
                        acnpVar.b.post(acnpVar.d);
                    }
                }
                do {
                    aclw aclwVar3 = this.a;
                    j = aclwVar3.e + aclwVar3.c;
                    aclwVar3.e = j;
                } while (j <= elapsedRealtimeNanos);
            }
            aclw aclwVar4 = this.a;
            aclwVar4.a.postDelayed(aclwVar4.f, aclwVar4.b);
        }
    }
}
