package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abzp extends MediaCodec.Callback implements acac {
    public final String a;
    protected final MediaCodec b;
    public int c;
    public acab d;
    private final acaf f;
    private final MediaFormat g;
    private long j;
    private boolean l;
    private boolean m;
    private acaa n;
    private long h = -1;
    private int i = -1;
    private long k = -1;
    public int e = 1;

    public abzp(MediaFormat mediaFormat, acaf acafVar) {
        String str;
        this.g = mediaFormat;
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
        this.b = createEncoderByType;
        createEncoderByType.setCallback(this);
        createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        try {
            str = createEncoderByType.getName();
        } catch (IllegalStateException e) {
            Log.e("ScreencastBaseEncoder", "Error obtaining codec name", e);
            str = "";
        }
        this.a = str;
        acafVar.getClass();
        this.f = acafVar;
    }

    private static final void f(MediaFormat mediaFormat, MediaFormat mediaFormat2, String str) {
        if (mediaFormat.containsKey(str) || !mediaFormat2.containsKey(str)) {
            return;
        }
        mediaFormat.setInteger(str, mediaFormat2.getInteger(str));
    }

    protected abstract void b();

    public boolean c() {
        if (this.e == 6) {
            return true;
        }
        try {
            String valueOf = String.valueOf(this.a);
            if (valueOf.length() != 0) {
                "Release encoder ".concat(valueOf);
            }
            this.b.release();
            this.e = 6;
        } catch (Exception unused) {
            String valueOf2 = String.valueOf(this.a);
            if (valueOf2.length() != 0) {
                "Releasing encoder failed: ".concat(valueOf2);
            }
        }
        return this.e == 6;
    }

    @Override // defpackage.acac
    public final String g() {
        return this.a;
    }

    final void h() {
        this.l = true;
        acaa acaaVar = this.n;
        if (acaaVar != null) {
            acaaVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i) {
        acab acabVar = this.d;
        if (acabVar != null) {
            acabVar.a(this, i);
        }
    }

    @Override // defpackage.acac
    public final boolean j() {
        int i = this.e;
        return i == 2 || i == 3 || i == 4;
    }

    @Override // defpackage.acac
    public final boolean l(acaa acaaVar) {
        if (!j()) {
            String valueOf = String.valueOf(this.a);
            Log.e("ScreencastBaseEncoder", valueOf.length() != 0 ? "Cannot signal EOS unless active: ".concat(valueOf) : new String("Cannot signal EOS unless active: "));
            return false;
        }
        if (this.m) {
            return true;
        }
        String valueOf2 = String.valueOf(this.a);
        if (valueOf2.length() != 0) {
            "Signal EOS for encoder ".concat(valueOf2);
        }
        this.m = true;
        this.n = acaaVar;
        b();
        return true;
    }

    @Override // defpackage.acac
    public final boolean m() {
        if (!j()) {
            String valueOf = String.valueOf(this.a);
            Log.e("ScreencastBaseEncoder", valueOf.length() != 0 ? "Cannot pause inactive encoder: ".concat(valueOf) : new String("Cannot pause inactive encoder: "));
            return false;
        }
        int i = this.e;
        if (i == 2) {
            this.e = 4;
            return true;
        }
        if (i == 4) {
            return true;
        }
        String valueOf2 = String.valueOf(this.a);
        Log.e("ScreencastBaseEncoder", valueOf2.length() != 0 ? "Cannot switch between pause/still frame for encoder: ".concat(valueOf2) : new String("Cannot switch between pause/still frame for encoder: "));
        return false;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        String valueOf = String.valueOf(this.a);
        Log.e("ScreencastBaseEncoder", valueOf.length() != 0 ? "Encoder encountered error: ".concat(valueOf) : new String("Encoder encountered error: "), codecException);
        i(7);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        if (mediaCodec != this.b || this.i < 0) {
            String valueOf = String.valueOf(this.a);
            Log.e("ScreencastBaseEncoder", valueOf.length() != 0 ? "Skipping request to process buffer on missing codec: ".concat(valueOf) : new String("Skipping request to process buffer on missing codec: "));
            return;
        }
        if (i < 0) {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
            sb.append("Unexpected buffer index (");
            sb.append(i);
            sb.append(") for codec: ");
            sb.append(str);
            Log.e("ScreencastBaseEncoder", sb.toString());
            return;
        }
        if (this.l) {
            String str2 = this.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 59);
            sb2.append("Unexpected buffer index (");
            sb2.append(i);
            sb2.append(")  after EOS on codec: ");
            sb2.append(str2);
            Log.e("ScreencastBaseEncoder", sb2.toString());
            return;
        }
        try {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
            if (outputBuffer == null) {
                String valueOf2 = String.valueOf(this.a);
                Log.e("ScreencastBaseEncoder", valueOf2.length() != 0 ? "Codec produced no output data in its buffer: ".concat(valueOf2) : new String("Codec produced no output data in its buffer: "));
                i(7);
                return;
            }
            int i2 = bufferInfo.flags;
            if ((i2 & 2) != 0) {
                bufferInfo.size = 0;
            }
            if (bufferInfo.size != 0) {
                if (this.j > 0) {
                    bufferInfo.presentationTimeUs -= this.j;
                }
                if (bufferInfo.presentationTimeUs > 0) {
                    if (this.h > 0) {
                        long j = bufferInfo.presentationTimeUs;
                        long j2 = this.h;
                        if (j < j2 + 100) {
                            String str3 = this.a;
                            long j3 = bufferInfo.presentationTimeUs;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 103);
                            sb3.append("Timewarp for ");
                            sb3.append(str3);
                            sb3.append(". Last frame at ");
                            sb3.append(j2);
                            sb3.append(" is too close to current frame at ");
                            sb3.append(j3);
                            Log.e("ScreencastBaseEncoder", sb3.toString());
                            bufferInfo.presentationTimeUs = this.h + 100;
                        }
                    }
                    this.h = bufferInfo.presentationTimeUs;
                    acaf acafVar = this.f;
                    if (acafVar != null && acafVar.k()) {
                        if (!this.f.n(this.i, outputBuffer, bufferInfo)) {
                            i(19);
                        }
                    }
                }
            }
            mediaCodec.releaseOutputBuffer(i, false);
            if ((i2 & 4) != 0) {
                if (this.l) {
                    String valueOf3 = String.valueOf(this.a);
                    Log.w("ScreencastBaseEncoder", valueOf3.length() != 0 ? "End of stream already reached for codec: ".concat(valueOf3) : new String("End of stream already reached for codec: "));
                } else {
                    if (this.m) {
                        String valueOf4 = String.valueOf(this.a);
                        if (valueOf4.length() != 0) {
                            "End of stream reached for codec: ".concat(valueOf4);
                        }
                        h();
                        return;
                    }
                    String valueOf5 = String.valueOf(this.a);
                    Log.w("ScreencastBaseEncoder", valueOf5.length() != 0 ? "Reached end of stream unexpectedly for codec: ".concat(valueOf5) : new String("Reached end of stream unexpectedly for codec: "));
                    i(7);
                }
            }
        } catch (Exception e) {
            String str4 = this.a;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 51);
            sb4.append("Codec experienced an error for buffer ");
            sb4.append(i);
            sb4.append(": ");
            sb4.append(str4);
            Log.e("ScreencastBaseEncoder", sb4.toString(), e);
            if (this.m) {
                h();
            } else {
                i(7);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        f(mediaFormat, this.g, "bitrate");
        f(mediaFormat, this.g, "sample-rate");
        f(mediaFormat, this.g, "frame-rate");
        this.c = mediaFormat.getInteger("bitrate");
        int a = this.f.a(mediaFormat);
        if (a < 0) {
            String valueOf = String.valueOf(this.a);
            Log.e("ScreencastBaseEncoder", valueOf.length() != 0 ? "Encoder could not add track to muxer: ".concat(valueOf) : new String("Encoder could not add track to muxer: "));
            i(7);
            return;
        }
        this.i = a;
        if (!this.f.j() || this.f.l()) {
            return;
        }
        String valueOf2 = String.valueOf(this.a);
        Log.e("ScreencastBaseEncoder", valueOf2.length() != 0 ? "Encoder could not start muxer: ".concat(valueOf2) : new String("Encoder could not start muxer: "));
        i(19);
    }

    @Override // defpackage.acac
    public final boolean k() {
        int i = this.e;
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                String valueOf = String.valueOf(this.a);
                Log.e("ScreencastBaseEncoder", valueOf.length() != 0 ? "Cannot resume non paused encoder: ".concat(valueOf) : new String("Cannot resume non paused encoder: "));
                return false;
            }
        } else if (this.k >= 0) {
            this.j += ((System.nanoTime() - this.k) / 1000) - 100;
            this.k = -1L;
        }
        this.e = 2;
        return true;
    }

    public boolean d() {
        if (j()) {
            return true;
        }
        if (this.e != 1) {
            String valueOf = String.valueOf(this.a);
            Log.e("ScreencastBaseEncoder", valueOf.length() != 0 ? "Cannot start once stopped or released: ".concat(valueOf) : new String("Cannot start once stopped or released: "));
            return false;
        }
        try {
            String valueOf2 = String.valueOf(this.a);
            if (valueOf2.length() != 0) {
                "Start encoder ".concat(valueOf2);
            }
            this.b.start();
            this.e = 2;
        } catch (Exception unused) {
            String valueOf3 = String.valueOf(this.a);
            if (valueOf3.length() != 0) {
                "Starting encoder failed: ".concat(valueOf3);
            }
        }
        return this.e == 2;
    }

    public boolean e() {
        if (this.e == 5) {
            return true;
        }
        if (!j()) {
            String valueOf = String.valueOf(this.a);
            Log.e("ScreencastBaseEncoder", valueOf.length() != 0 ? "Encoder not active: ".concat(valueOf) : new String("Encoder not active: "));
            return false;
        }
        try {
            String valueOf2 = String.valueOf(this.a);
            if (valueOf2.length() != 0) {
                "Stop encoder ".concat(valueOf2);
            }
            this.b.stop();
            this.e = 5;
        } catch (Exception unused) {
            String valueOf3 = String.valueOf(this.a);
            if (valueOf3.length() != 0) {
                "Stopping encoder failed: ".concat(valueOf3);
            }
        }
        return this.e == 5;
    }
}
