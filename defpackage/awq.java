package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awq {
    public final pms a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final avr[] i;

    private final int e(long j) {
        int i;
        int i2 = this.g;
        switch (i2) {
            case 5:
                i = 80000;
                break;
            case 6:
            case 18:
                i = 768000;
                break;
            case 7:
                i = 192000;
                break;
            case 8:
                i = 2250000;
                break;
            case 9:
                i = 40000;
                break;
            case 10:
                i = 100000;
                break;
            case 11:
                i = 16000;
                break;
            case 12:
                i = 7000;
                break;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                i = 3062500;
                break;
            case 15:
                i = 8000;
                break;
            case 16:
                i = 256000;
                break;
            case 17:
                i = 336000;
                break;
        }
        if (i2 == 5) {
            i += i;
        }
        return (int) ((j * i) / 1000000);
    }

    private static AudioAttributes f(asd asdVar, boolean z) {
        return asdVar.a();
    }

    public final long a(long j) {
        return (j * this.e) / 1000000;
    }

    public final long b(long j) {
        return (j * 1000000) / this.e;
    }

    public final AudioTrack c(boolean z, asd asdVar, int i) {
        AudioTrack audioTrack;
        try {
            if (pts.a < 29) {
                audioTrack = new AudioTrack(f(asdVar, false), awx.y(this.e, this.f, this.g), this.h, 1, i);
            } else {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(f(asdVar, false)).setAudioFormat(awx.y(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new awd(state, this.e, this.f, this.h, this.a, d(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new awd(0, this.e, this.f, this.h, this.a, d(), e);
        }
    }

    public final boolean d() {
        return this.c == 1;
    }

    public awq(pms pmsVar, int i, int i2, int i3, int i4, int i5, int i6, avr[] avrVarArr) {
        int c;
        this.a = pmsVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.i = avrVarArr;
        if (i2 == 0) {
            int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
            pse.g(minBufferSize != -2);
            c = pts.c(minBufferSize * 4, ((int) a(250000L)) * i3, Math.max(minBufferSize, ((int) a(750000L)) * i3));
        } else {
            c = i2 != 1 ? e(250000L) : e(50000000L);
        }
        this.h = c;
    }
}
