package defpackage;

import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import android.util.Log;
import com.google.android.libraries.youtube.livecreation.screencast.controls.VolumeIndicatorView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acej implements Runnable {
    final /* synthetic */ VolumeIndicatorView a;
    private final /* synthetic */ int b;

    public acej(VolumeIndicatorView volumeIndicatorView, int i) {
        this.b = i;
        this.a = volumeIndicatorView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            VolumeIndicatorView volumeIndicatorView = this.a;
            yjk.e();
            if (volumeIndicatorView.d) {
                return;
            }
            AudioRecord audioRecord = volumeIndicatorView.c;
            if (audioRecord == null) {
                Log.w("VolumeIndicator", "Could not start audio level sampler due to missing recorder");
                return;
            } else {
                audioRecord.startRecording();
                volumeIndicatorView.d = true;
                return;
            }
        }
        if (i == 1) {
            VolumeIndicatorView volumeIndicatorView2 = this.a;
            yjk.e();
            amkq.E(!volumeIndicatorView2.d);
            int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
            volumeIndicatorView2.c = new AudioRecord(1, 44100, 16, 2, minBufferSize + minBufferSize);
            if (volumeIndicatorView2.c.getState() != 1) {
                Log.e("VolumeIndicator", "Could not initialize audio recorder");
                volumeIndicatorView2.b();
                return;
            }
            volumeIndicatorView2.c.setRecordPositionUpdateListener(volumeIndicatorView2, volumeIndicatorView2.b);
            volumeIndicatorView2.c.setPositionNotificationPeriod(4410);
            volumeIndicatorView2.f = new short[4410];
            volumeIndicatorView2.g = AutomaticGainControl.isAvailable() ? AutomaticGainControl.create(volumeIndicatorView2.c.getAudioSessionId()) : null;
            AutomaticGainControl automaticGainControl = volumeIndicatorView2.g;
            if (automaticGainControl != null) {
                automaticGainControl.setEnabled(true);
                return;
            }
            return;
        }
        int i2 = 0;
        if (i == 2) {
            VolumeIndicatorView volumeIndicatorView3 = this.a;
            yjk.e();
            if (volumeIndicatorView3.d) {
                volumeIndicatorView3.c.stop();
                volumeIndicatorView3.d = false;
                volumeIndicatorView3.e = 0.0d;
                volumeIndicatorView3.postInvalidate();
                return;
            }
            return;
        }
        if (i == 3) {
            VolumeIndicatorView volumeIndicatorView4 = this.a;
            yjk.e();
            if (!volumeIndicatorView4.d) {
                Log.e("VolumeIndicator", "Trying to drain recorder when not active");
                return;
            }
            AudioRecord audioRecord2 = volumeIndicatorView4.c;
            short[] sArr = volumeIndicatorView4.f;
            int length = sArr.length;
            audioRecord2.read(sArr, 0, 4410);
            int i3 = 0;
            while (true) {
                short[] sArr2 = volumeIndicatorView4.f;
                int length2 = sArr2.length;
                if (i2 < 4410) {
                    i3 = Math.max(i3, Math.abs((int) sArr2[i2]));
                    i2++;
                } else {
                    double d = i3;
                    Double.isNaN(d);
                    volumeIndicatorView4.e = d / 32767.0d;
                    volumeIndicatorView4.a.post(volumeIndicatorView4.i);
                    return;
                }
            }
        } else {
            this.a.b();
        }
    }
}
