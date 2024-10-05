package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abzn extends abzp {
    private final abzo f;
    private boolean g;
    private boolean h;
    private int i;

    public abzn(MediaFormat mediaFormat, abzo abzoVar, acaf acafVar) {
        super(mediaFormat, acafVar);
        this.f = abzoVar;
        abzoVar.f(this);
        abzoVar.e(this);
    }

    @Override // defpackage.acac
    public final void a(int i) {
        throw null;
    }

    @Override // defpackage.abzp
    protected final void b() {
        this.g = true;
        this.f.d();
    }

    @Override // defpackage.abzp, defpackage.acac
    public final boolean c() {
        int i = this.i;
        if (i > 0) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("Buffers still pending from audio input at release: count=");
            sb.append(i);
            Log.w("DefaultAudioEncoder", sb.toString());
        }
        if (!this.f.b()) {
            Log.w("DefaultAudioEncoder", "Error releasing audio input");
        }
        return super.c();
    }

    @Override // defpackage.abzp, defpackage.acac
    public final boolean d() {
        if (!this.f.c()) {
            Log.e("DefaultAudioEncoder", "Failed to ensure audio input was started");
            return false;
        }
        return super.d();
    }

    @Override // defpackage.abzp, defpackage.acac
    public final boolean e() {
        if (!this.f.d()) {
            Log.w("DefaultAudioEncoder", "Error stopping audio encoder");
        }
        return super.e();
    }

    public final void f(int i, int i2, int i3, long j) {
        this.i--;
        if (i3 >= 0) {
            try {
                if (!this.h && j()) {
                    this.b.queueInputBuffer(i, 0, this.e == 3 ? 0 : i3, j, i2);
                    boolean z = (i2 & 4) != 0;
                    this.h = z;
                    if (!z || this.g) {
                        return;
                    }
                    Log.e("DefaultAudioEncoder", "Unexpected EOS from audio data");
                    i(7);
                    return;
                }
                StringBuilder sb = new StringBuilder(60);
                sb.append("Received full buffer after sending end: bufferId=");
                sb.append(i);
                Log.e("DefaultAudioEncoder", sb.toString());
                return;
            } catch (Exception e) {
                Log.e("DefaultAudioEncoder", "Error queuing input to audio encoder", e);
                i(7);
                return;
            }
        }
        if (this.g) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Error reading audio data: ");
        sb2.append(i3);
        Log.e("DefaultAudioEncoder", sb2.toString());
        i(7);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        yjk.e();
        if (i < 0) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Unexpected buffer index for codec: ");
            sb.append(i);
            Log.e("DefaultAudioEncoder", sb.toString());
            return;
        }
        try {
            ByteBuffer inputBuffer = this.b.getInputBuffer(i);
            if (inputBuffer == null) {
                Log.e("DefaultAudioEncoder", "Got a null buffer valid buffer should be present");
            } else {
                this.i++;
                this.f.a(i, inputBuffer);
            }
        } catch (Exception e) {
            Log.e("DefaultAudioEncoder", "Error obtaining input buffer for audio encoder", e);
            if (this.g) {
                return;
            }
            i(7);
        }
    }
}
