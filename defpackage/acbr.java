package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acbr implements acaf, acbc {
    private final acbd a;
    private final Uri b;
    private final String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private acad k;
    private volatile long l;

    public acbr(Context context, Uri uri, String str, abzz abzzVar, boolean z, boolean z2, int i, long j) {
        acbd acbdVar = new acbd(context, uri.getHost(), uri.getPort(), abzzVar, z, z2, i, j);
        this.h = -1;
        this.i = -1;
        this.j = 0;
        amkq.E("rtmp".equals(uri.getScheme()));
        this.b = uri;
        this.c = str;
        this.a = acbdVar;
        acbdVar.b = this;
    }

    @Override // defpackage.acaf
    public final int a(MediaFormat mediaFormat) {
        if (this.e) {
            Log.e("RtmpMuxer", "Cannot add a track once started");
            return -1;
        }
        if (this.f) {
            Log.e("RtmpMuxer", "Cannot add a track once stopped");
            return -1;
        }
        if (this.g) {
            Log.e("RtmpMuxer", "Cannot add a track after release");
            return -1;
        }
        if (adyu.cQ(mediaFormat)) {
            if (this.h >= 0) {
                Log.e("RtmpMuxer", "Video track already added");
                return -1;
            }
            acbd acbdVar = this.a;
            if (!"video/avc".equals(mediaFormat.getString("mime"))) {
                Log.e("RtmpMuxer", "Video format not supported by RTMP connection");
                return -1;
            }
            acbdVar.c = 7;
            acbdVar.k = mediaFormat;
            int i = this.j;
            this.j = i + 1;
            this.h = i;
            return i;
        }
        if (!adyu.cO(mediaFormat)) {
            String valueOf = String.valueOf(mediaFormat);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unknown media format type: ");
            sb.append(valueOf);
            Log.e("RtmpMuxer", sb.toString());
            return -1;
        }
        if (this.i >= 0) {
            Log.e("RtmpMuxer", "Audio track already added");
            return -1;
        }
        acbd acbdVar2 = this.a;
        if (!"audio/mp4a-latm".equals(mediaFormat.getString("mime"))) {
            Log.e("RtmpMuxer", "Audio format not supported by RTMP connection");
            return -1;
        }
        acbdVar2.d = 10;
        acbdVar2.j = mediaFormat;
        int i2 = this.j;
        this.j = i2 + 1;
        this.i = i2;
        return i2;
    }

    @Override // defpackage.acaf
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.acaf
    public final int c() {
        if (this.g) {
            Log.e("RtmpMuxer", "Cannot prepare once released");
            return 1;
        }
        if (this.f) {
            Log.e("RtmpMuxer", "Cannot prepare once stopped");
            return 1;
        }
        if (this.e) {
            Log.e("RtmpMuxer", "Cannot prepare once started");
            return 1;
        }
        if (this.d) {
            return 0;
        }
        try {
            this.l = 0L;
            this.a.d();
            this.d = true;
            return 0;
        } catch (IOException e) {
            Log.e("RtmpMuxer", "Connecting to remote host failed due to IO error", e);
            return 12;
        } catch (InterruptedException e2) {
            Log.e("RtmpMuxer", "Connection was interrupted", e2);
            return 12;
        } catch (ProtocolException e3) {
            Log.e("RtmpMuxer", "RTMP protocol error during initial handshake", e3);
            return 12;
        } catch (TimeoutException e4) {
            Log.e("RtmpMuxer", "Connecting to remote host timed out", e4);
            return 11;
        } catch (Exception e5) {
            Log.e("RtmpMuxer", "Preparing the RTMP connection failed", e5);
            return 12;
        }
    }

    @Override // defpackage.acaf
    public final long d() {
        return this.l;
    }

    @Override // defpackage.acaf
    public final Pair e() {
        return this.a.c();
    }

    @Override // defpackage.acaf
    public final void f() {
    }

    @Override // defpackage.acaf
    public final void g(Context context, acae acaeVar) {
        if (acaeVar != null) {
            acaeVar.a(this.b);
        }
    }

    @Override // defpackage.acaf
    public final void h(acad acadVar) {
        this.k = acadVar;
    }

    @Override // defpackage.acaf
    public final void i(int i) {
        this.a.g(i);
    }

    @Override // defpackage.acaf
    public final boolean j() {
        return !this.g && !this.f && this.i >= 0 && this.h >= 0;
    }

    @Override // defpackage.acaf
    public final boolean k() {
        return (!this.e || this.f || this.g) ? false : true;
    }

    @Override // defpackage.acaf
    public final boolean l() {
        acbd acbdVar;
        Uri uri;
        String str;
        boolean z;
        if (this.g) {
            Log.e("RtmpMuxer", "Cannot start once released");
            return false;
        }
        if (this.f) {
            Log.e("RtmpMuxer", "Cannot restart once stopped");
            return false;
        }
        if (!this.d) {
            Log.e("RtmpMuxer", "Muxer not prepared");
            return false;
        }
        if (this.e) {
            return true;
        }
        if (!j()) {
            Log.e("RtmpMuxer", "Cannot start without all tracks");
            return false;
        }
        try {
            acbdVar = this.a;
            uri = this.b;
            str = this.c;
        } catch (Exception e) {
            Log.e("RtmpMuxer", "Starting the RTMP connection failed", e);
        }
        if (!acbdVar.h) {
            throw new IllegalStateException("RTMP channel is not connected");
        }
        if (acbdVar.i) {
            Log.e("RtmpConnection", "Stream is already published");
        } else {
            if (acbdVar.j == null) {
                throw new IllegalStateException("RTMP audio format is missing");
            }
            if (acbdVar.k == null) {
                throw new IllegalStateException("RTMP video format is missing");
            }
            acbv acbvVar = acbdVar.f;
            if (!acbq.d(8192)) {
                throw new ProtocolException("Invalid chunk size to set: 8192");
            }
            amkq.E(true);
            acbv.i(acbvVar.a, 2, 0, 4, 1, 0);
            acbvVar.a.putInt(8192);
            acbvVar.g(acbvVar.a);
            acbvVar.f = 8192;
            ByteBuffer.allocate(8192);
            acbvVar.f(4);
            acbdVar.f.d(10485760, 0);
            if (!acbdVar.g) {
                Future e2 = acbdVar.e.e(1);
                acbv acbvVar2 = acbdVar.f;
                if (uri == null) {
                    throw new ProtocolException("Target URI cannot be null");
                }
                String path = uri.getPath();
                if (TextUtils.isEmpty(path)) {
                    throw new ProtocolException("Target path cannot be empty");
                }
                while (path.startsWith("/")) {
                    path = path.substring(1);
                }
                if (TextUtils.isEmpty(path)) {
                    throw new ProtocolException("Target path cannot be empty");
                }
                if (TextUtils.isEmpty(str)) {
                    throw new ProtocolException("Stream key cannot be empty");
                }
                acbvVar2.b.b();
                acbvVar2.b.g("connect");
                acbvVar2.b.d(1.0d);
                acbvVar2.b.a.writeByte(3);
                acbvVar2.b.f("app");
                acbvVar2.b.g(path);
                acbvVar2.b.f("flashVer");
                acbvVar2.b.g(acbvVar2.i);
                acbvVar2.b.f("flashver");
                acbvVar2.b.g(acbvVar2.i);
                acbvVar2.b.f("tcUrl");
                acbvVar2.b.g(uri.toString());
                acbvVar2.b.f("type");
                acbvVar2.b.g("nonprivate");
                acbvVar2.b.e();
                ByteBuffer a = acbvVar2.b.a();
                int limit = a.limit();
                acbv.i(acbvVar2.a, 3, 0, limit, 20, 1);
                acbvVar2.g(acbvVar2.a);
                acbvVar2.g(a);
                acbvVar2.f(limit);
                acbo acboVar = (acbo) e2.get(5000L, TimeUnit.MILLISECONDS);
                if (acboVar.a != 0 || !"NetConnection.Connect.Success".equals(acboVar.b)) {
                    String valueOf = String.valueOf(acboVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("RTMP NetConnection failed: result=");
                    sb.append(valueOf);
                    throw new ProtocolException(sb.toString());
                }
                acbdVar.e.f(1);
                acbv acbvVar3 = acbdVar.f;
                int a2 = acbdVar.a();
                if (TextUtils.isEmpty(str)) {
                    throw new ProtocolException("Stream key cannot be empty");
                }
                acbvVar3.b.b();
                acbvVar3.b.g("releaseStream");
                acbvVar3.b.d(a2);
                acbvVar3.b.c();
                acbvVar3.b.g(str);
                ByteBuffer a3 = acbvVar3.b.a();
                int limit2 = a3.limit();
                acbv.i(acbvVar3.a, 3, 0, limit2, 20, 1);
                acbvVar3.g(acbvVar3.a);
                acbvVar3.g(a3);
                acbvVar3.f(limit2);
                int a4 = acbdVar.a();
                Future e3 = acbdVar.e.e(a4);
                acbv acbvVar4 = acbdVar.f;
                acbvVar4.b.b();
                acbvVar4.b.g("createStream");
                acbvVar4.b.d(a4);
                acbvVar4.b.c();
                ByteBuffer a5 = acbvVar4.b.a();
                int limit3 = a5.limit();
                acbv.i(acbvVar4.a, 3, 0, limit3, 20, 1);
                acbvVar4.g(acbvVar4.a);
                acbvVar4.g(a5);
                acbvVar4.f(limit3);
                acbo acboVar2 = (acbo) e3.get(5000L, TimeUnit.MILLISECONDS);
                if (acboVar2.a != 0) {
                    String valueOf2 = String.valueOf(acboVar2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 47);
                    sb2.append("RTMP NetConnection.createStream failed: result=");
                    sb2.append(valueOf2);
                    throw new ProtocolException(sb2.toString());
                }
                acbdVar.e.f(a4);
                Future e4 = acbdVar.e.e(2);
                acbv acbvVar5 = acbdVar.f;
                if (TextUtils.isEmpty(str)) {
                    throw new ProtocolException("Stream key cannot be empty");
                }
                acbvVar5.b.b();
                acbvVar5.b.g("publish");
                acbvVar5.b.d(2.0d);
                acbvVar5.b.c();
                acbvVar5.b.g(str);
                acbvVar5.b.g("live");
                ByteBuffer a6 = acbvVar5.b.a();
                int limit4 = a6.limit();
                acbv.i(acbvVar5.a, 3, 0, limit4, 20, 1);
                acbvVar5.g(acbvVar5.a);
                acbvVar5.g(a6);
                acbvVar5.f(limit4);
                acbo acboVar3 = (acbo) e4.get(5000L, TimeUnit.MILLISECONDS);
                if (acboVar3.a != 0 || !"NetStream.Publish.Start".equals(acboVar3.b)) {
                    String valueOf3 = String.valueOf(acboVar3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
                    sb3.append("RTMP publish request failed: result=");
                    sb3.append(valueOf3);
                    throw new ProtocolException(sb3.toString());
                }
                acbdVar.e.f(2);
                acbv acbvVar6 = acbdVar.f;
                int i = acbdVar.d;
                MediaFormat mediaFormat = acbdVar.j;
                int i2 = acbdVar.c;
                MediaFormat mediaFormat2 = acbdVar.k;
                if (!adyu.cO(mediaFormat) || !mediaFormat.containsKey("bitrate") || !mediaFormat.containsKey("sample-rate")) {
                    String valueOf4 = String.valueOf(mediaFormat);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 22);
                    sb4.append("Invalid audio format: ");
                    sb4.append(valueOf4);
                    throw new ProtocolException(sb4.toString());
                }
                if (!adyu.cQ(mediaFormat2) || !mediaFormat2.containsKey("width") || !mediaFormat2.containsKey("height") || !mediaFormat2.containsKey("bitrate") || !mediaFormat2.containsKey("frame-rate")) {
                    String valueOf5 = String.valueOf(mediaFormat2);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 22);
                    sb5.append("Invalid video format: ");
                    sb5.append(valueOf5);
                    throw new ProtocolException(sb5.toString());
                }
                acbvVar6.b.b();
                acbvVar6.b.g("@setDataFrame");
                acbvVar6.b.g("onMetaData");
                acaz acazVar = acbvVar6.b;
                acazVar.a.writeByte(8);
                acazVar.a.writeInt(13);
                acbvVar6.b.f("duration");
                acbvVar6.b.d(0.0d);
                acbvVar6.b.f("width");
                acbvVar6.b.d(mediaFormat2.getInteger("width"));
                acbvVar6.b.f("height");
                acbvVar6.b.d(mediaFormat2.getInteger("height"));
                acbvVar6.b.f("videodatarate");
                acbvVar6.b.d(mediaFormat2.getInteger("bitrate"));
                acbvVar6.b.f("framerate");
                acbvVar6.b.d(mediaFormat2.getInteger("frame-rate"));
                acbvVar6.b.f("videocodecid");
                acbvVar6.b.d(i2);
                acbvVar6.b.f("audiodatarate");
                acbvVar6.b.d(mediaFormat.getInteger("bitrate"));
                acbvVar6.b.f("audiosamplerate");
                acbvVar6.b.d(mediaFormat.getInteger("sample-rate"));
                acbvVar6.b.f("audiosamplesize");
                acaz acazVar2 = acbvVar6.b;
                if (i != 10) {
                    StringBuilder sb6 = new StringBuilder(36);
                    sb6.append("Unsupported audio codec: ");
                    sb6.append(i);
                    throw new ProtocolException(sb6.toString());
                }
                acazVar2.d(16.0d);
                acbvVar6.b.f("stereo");
                acaz acazVar3 = acbvVar6.b;
                acazVar3.a.writeByte(1);
                acazVar3.a.writeByte(1);
                acbvVar6.b.f("audiocodecid");
                acbvVar6.b.d(10.0d);
                acbvVar6.b.f("encoder");
                acbvVar6.b.g(acbvVar6.i);
                acbvVar6.b.f("filesize");
                acbvVar6.b.d(0.0d);
                acbvVar6.b.e();
                ByteBuffer a7 = acbvVar6.b.a();
                int limit5 = a7.limit();
                acbv.i(acbvVar6.a, 3, 0, limit5, 18, 1);
                acbvVar6.g(acbvVar6.a);
                acbvVar6.g(a7);
                acbvVar6.f(limit5);
                z = true;
                acbdVar.i = true;
                this.e = z;
                return this.e;
            }
            int millis = (int) (TimeUnit.SECONDS.toMillis(16384L) / 1000);
            try {
                Socket socket = acbdVar.a.socket();
                socket.setSendBufferSize(16384);
                socket.setSoTimeout(millis);
            } catch (Exception e5) {
                Log.e("RtmpConnection", "Could not set socket options", e5);
            }
            acbdVar.i = true;
        }
        z = true;
        this.e = z;
        return this.e;
    }

    @Override // defpackage.acaf
    public final boolean m() {
        if (this.g) {
            Log.e("RtmpMuxer", "Cannot stop once released");
            return false;
        }
        if (!this.e) {
            Log.e("RtmpMuxer", "Muxer not started");
            return false;
        }
        if (this.f) {
            return true;
        }
        try {
            this.a.e();
            this.f = true;
        } catch (Exception e) {
            Log.e("RtmpMuxer", "Stopping the RTMP connection failed", e);
        }
        return this.f;
    }

    @Override // defpackage.acaf
    public final boolean n(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        long j;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        byte[] f;
        int i6;
        int i7;
        if (this.g) {
            Log.e("RtmpMuxer", "Cannot write data once released");
            return false;
        }
        if (this.f) {
            Log.e("RtmpMuxer", "Cannot write data once stopped");
            return false;
        }
        if (!this.e) {
            Log.e("RtmpMuxer", "Muxer not started");
            return false;
        }
        try {
            acbd acbdVar = this.a;
            boolean z3 = i == this.i;
            if (!acbdVar.i) {
                throw new IllegalStateException("RTMP stream must be published before sending data");
            }
            acbv acbvVar = acbdVar.f;
            int i8 = acbdVar.d;
            MediaFormat mediaFormat = acbdVar.j;
            int i9 = acbdVar.c;
            MediaFormat mediaFormat2 = acbdVar.k;
            if ((bufferInfo.flags & 2) == 0) {
                if (!acbvVar.j) {
                    i2 = i8;
                    i3 = i9;
                    j = 0;
                    i4 = -1;
                } else if (!z3 && (bufferInfo.flags & 1) != 0 && (bufferInfo.flags & 4) == 0) {
                    if (acbvVar.k) {
                        i2 = i8;
                        i3 = i9;
                        i4 = -1;
                    } else {
                        if (!mediaFormat2.containsKey("csd-0") || !mediaFormat2.containsKey("csd-1")) {
                            throw new ProtocolException("Video format missing codec config data");
                        }
                        ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer("csd-0");
                        ByteBuffer byteBuffer3 = mediaFormat2.getByteBuffer("csd-1");
                        byte[] f2 = acbq.f(i9, true, true);
                        acbvVar.e(byteBuffer2);
                        acbvVar.e(byteBuffer3);
                        int remaining = byteBuffer2.remaining();
                        int remaining2 = byteBuffer3.remaining();
                        int i10 = remaining + 11 + remaining2;
                        ByteBuffer allocate = ByteBuffer.allocate(i10);
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        allocate.put((byte) 1);
                        allocate.put((byte) 100);
                        allocate.put((byte) 0);
                        allocate.put((byte) 13);
                        allocate.put((byte) -1);
                        allocate.put((byte) -31);
                        allocate.put((byte) ((remaining >> 8) & PrivateKeyType.INVALID));
                        allocate.put((byte) (remaining & PrivateKeyType.INVALID));
                        allocate.put(byteBuffer2);
                        allocate.put((byte) 1);
                        allocate.put((byte) ((remaining2 >> 8) & PrivateKeyType.INVALID));
                        allocate.put((byte) (remaining2 & PrivateKeyType.INVALID));
                        allocate.put(byteBuffer3);
                        i4 = -1;
                        i2 = i8;
                        i3 = i9;
                        acbvVar.c(allocate, f2, 6, 9, 0);
                        if (!mediaFormat.containsKey("csd-0")) {
                            throw new ProtocolException("Audio format missing codec config data");
                        }
                        ByteBuffer byteBuffer4 = mediaFormat.getByteBuffer("csd-0");
                        new MediaCodec.BufferInfo().size = byteBuffer4.limit();
                        acbvVar.c(byteBuffer4, acbq.e(i2, true), 4, 8, 0);
                    }
                    long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                    acbw acbwVar = acbvVar.d;
                    j = 0;
                    amkq.E(millis > 0);
                    ((acbf) acbwVar).f = millis;
                    long j2 = ((acbf) acbwVar).d.getLong(acbf.c, acbf.a);
                    if (j2 >= 0 && j2 < acbf.a) {
                        long j3 = acbf.a;
                        ((acbf) acbwVar).g = j2 + j3 + j3;
                        ((acbf) acbwVar).i = true;
                        ((acbf) acbwVar).j = true;
                        acbvVar.j = false;
                        z3 = false;
                    }
                    ((acbf) acbwVar).g = 0L;
                    ((acbf) acbwVar).i = true;
                    ((acbf) acbwVar).j = true;
                    acbvVar.j = false;
                    z3 = false;
                }
                if (z3) {
                    f = acbq.e(i2, false);
                    z = true;
                    i6 = 8;
                    i7 = 4;
                } else {
                    z = true;
                    if (1 != (bufferInfo.flags & 1)) {
                        i5 = i3;
                        z2 = false;
                    } else {
                        i5 = i3;
                        z2 = true;
                    }
                    f = acbq.f(i5, false, z2);
                    i6 = 9;
                    i7 = 6;
                }
                int i11 = z == acbvVar.k ? 42 : i6;
                boolean z4 = z3;
                long millis2 = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                acbw acbwVar2 = acbvVar.d;
                amkq.E(millis2 > j);
                amkq.N(((acbf) acbwVar2).f > j);
                long j4 = millis2 - ((acbf) acbwVar2).f;
                if (j4 >= j) {
                    long j5 = ((acbf) acbwVar2).g + j4;
                    if (j5 > 2147483647L) {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("Timestamp overflow: ");
                        sb.append(j5);
                        zga.l(sb.toString());
                    }
                    if (((acbf) acbwVar2).i && (((acbf) acbwVar2).j || j5 - ((acbf) acbwVar2).h >= acbf.b)) {
                        ((acbf) acbwVar2).e.post(new acbe((acbf) acbwVar2, j5));
                        ((acbf) acbwVar2).h = j5;
                        ((acbf) acbwVar2).i = j5 < acbf.a;
                        ((acbf) acbwVar2).j = false;
                    }
                    i4 = (int) j5;
                }
                if (i4 < 0) {
                    String str = true != z4 ? "VIDEO" : "AUDIO";
                    long j6 = ((acbf) acbvVar.d).f;
                    StringBuilder sb2 = new StringBuilder(str.length() + 111);
                    sb2.append("Skipping media data with early timestamp: type=");
                    sb2.append(str);
                    sb2.append(", timestamp=");
                    sb2.append(millis2);
                    sb2.append(", startTime=");
                    sb2.append(j6);
                    Log.e("RtmpOutputStream", sb2.toString());
                } else {
                    acbvVar.e(byteBuffer);
                    acbvVar.c(byteBuffer, f, i7, i11, i4);
                }
            }
            if (acbdVar.g) {
                acbdVar.f.a();
            }
            this.l += bufferInfo.size - bufferInfo.offset;
            return true;
        } catch (Exception e) {
            Log.e("RtmpMuxer", "Sending sample data failed", e);
            return false;
        }
    }

    @Override // defpackage.acaf
    public final void o() {
        if (this.g) {
            return;
        }
        try {
            this.a.f();
            this.g = true;
        } catch (Exception e) {
            Log.e("RtmpMuxer", "Releasing the RTMP connection failed", e);
        }
    }

    @Override // defpackage.acbc
    public final void p() {
        acad acadVar = this.k;
        if (acadVar != null) {
            acadVar.a();
        }
    }
}
