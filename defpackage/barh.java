package defpackage;

import android.media.AudioRecord;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.R;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import org.webrtc.Logging;
import org.webrtc.audio.WebRtcAudioRecord;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class barh extends Thread {
    public volatile boolean a;
    final /* synthetic */ WebRtcAudioRecord b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public barh(WebRtcAudioRecord webRtcAudioRecord) {
        super("AudioRecordJavaThread");
        this.b = webRtcAudioRecord;
        this.a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(-19);
        String valueOf = String.valueOf(aype.q());
        Logging.a("WebRtcAudioRecordExternal", valueOf.length() != 0 ? "AudioRecordThread".concat(valueOf) : new String("AudioRecordThread"));
        int i = 3;
        WebRtcAudioRecord.c(this.b.f.getRecordingState() == 3);
        WebRtcAudioRecord.d(0);
        System.nanoTime();
        while (this.a) {
            WebRtcAudioRecord webRtcAudioRecord = this.b;
            AudioRecord audioRecord = webRtcAudioRecord.f;
            ByteBuffer byteBuffer = webRtcAudioRecord.e;
            int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
            if (read == this.b.e.capacity()) {
                boolean z = this.b.g;
                if (this.a) {
                    WebRtcAudioRecord webRtcAudioRecord2 = this.b;
                    webRtcAudioRecord2.nativeDataIsRecorded(webRtcAudioRecord2.d, read);
                }
                WebRtcAudioRecord webRtcAudioRecord3 = this.b;
                if (webRtcAudioRecord3.h != null) {
                    byte[] copyOfRange = Arrays.copyOfRange(webRtcAudioRecord3.e.array(), this.b.e.arrayOffset(), this.b.e.capacity() + this.b.e.arrayOffset());
                    WebRtcAudioRecord webRtcAudioRecord4 = this.b;
                    acoh acohVar = webRtcAudioRecord4.h;
                    int audioFormat = webRtcAudioRecord4.f.getAudioFormat();
                    int channelCount = this.b.f.getChannelCount();
                    int sampleRate = this.b.f.getSampleRate();
                    acoj acojVar = acohVar.b;
                    acmq acmqVar = (acmq) acojVar.j;
                    if (acmqVar.g) {
                        abzu abzuVar = acmqVar.i;
                        if (abzuVar != null) {
                            abzuVar.k(copyOfRange);
                        }
                    } else {
                        MediaFormat mediaFormat = acojVar.k;
                        if (mediaFormat != null && acojVar.l != null && !acohVar.a) {
                            int i2 = 2;
                            int i3 = 4;
                            if (audioFormat != 1 && audioFormat != 2) {
                                if (audioFormat == i) {
                                    i2 = 1;
                                } else if (audioFormat == 4) {
                                    i2 = 4;
                                } else if (audioFormat != 13) {
                                    StringBuilder sb = new StringBuilder(28);
                                    sb.append("Bad audio format ");
                                    sb.append(audioFormat);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                            mediaFormat.setInteger("max-input-size", (int) ((((sampleRate * channelCount) * i2) * 50) / 1000));
                            acojVar.k.setInteger("channel-count", channelCount);
                            acojVar.k.setInteger("channel-mask", channelCount == 1 ? 16 : 12);
                            acojVar.k.setInteger("sample-rate", sampleRate);
                            acoj acojVar2 = acohVar.b;
                            acmd acmdVar = acojVar2.j;
                            final MediaFormat mediaFormat2 = acojVar2.k;
                            final MediaFormat mediaFormat3 = acojVar2.l;
                            final acmq acmqVar2 = (acmq) acmdVar;
                            acmqVar2.b.post(new Runnable() { // from class: acmi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    abzu abzuVar2;
                                    String uri;
                                    final acmq acmqVar3 = acmq.this;
                                    MediaFormat mediaFormat4 = mediaFormat2;
                                    MediaFormat mediaFormat5 = mediaFormat3;
                                    Handler handler = acmqVar3.b;
                                    mediaFormat4.getClass();
                                    handler.getClass();
                                    if (!adyu.cO(mediaFormat4)) {
                                        Log.e("AudioInputFactory", "Could not create audio input, not an audio format");
                                        abzuVar2 = null;
                                    } else {
                                        abzuVar2 = new abzu(handler, mediaFormat4);
                                    }
                                    acmqVar3.i = abzuVar2;
                                    abzu abzuVar3 = acmqVar3.i;
                                    if (abzuVar3 == null) {
                                        zga.c("LocalRecordingManagerImpl", "Could not create audio input.");
                                        acmqVar3.g();
                                        return;
                                    }
                                    acmqVar3.j = abzuVar3;
                                    acmqVar3.d();
                                    acmqVar3.f = new abqt(adyu.cU(acmqVar3.a, R.raw.copy_texture_frag));
                                    acmqVar3.k = new abqk(new acmn(acmqVar3));
                                    if (acmqVar3.n instanceof abzy) {
                                        acmqVar3.d.a = new abro() { // from class: acme
                                            @Override // defpackage.abro
                                            public final void a() {
                                                acmq acmqVar4 = acmq.this;
                                                acmqVar4.b.post(new acmg(acmqVar4, 2));
                                            }
                                        };
                                    }
                                    acmqVar3.k.b(new acmo(acmqVar3), acmqVar3.b);
                                    if (acmqVar3.h == null) {
                                        if (!"mounted".equals(Environment.getExternalStorageState())) {
                                            zga.c("LocalRecordingMgr", "Could not write to external storage.");
                                            uri = null;
                                        } else {
                                            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
                                            File file = new File(externalStoragePublicDirectory, "YouTubeLive");
                                            if (file.exists() || file.mkdirs()) {
                                                externalStoragePublicDirectory = file;
                                            } else {
                                                zga.c("LocalRecordingMgr", "Could not create HD asset dir.  Using movies dir");
                                            }
                                            String format = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.US).format(new Date());
                                            String absolutePath = externalStoragePublicDirectory.getAbsolutePath();
                                            String str = File.separator;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 6 + String.valueOf(str).length() + String.valueOf(format).length());
                                            sb2.append(absolutePath);
                                            sb2.append(str);
                                            sb2.append("VIDEO_");
                                            sb2.append(format);
                                            uri = Uri.fromFile(new File(sb2.toString())).toString();
                                        }
                                        acmqVar3.h = uri;
                                        if (TextUtils.isEmpty(acmqVar3.h)) {
                                            zga.c("LocalRecordingManagerImpl", "Could not create file for muxer");
                                            acmqVar3.g();
                                        }
                                    }
                                    acmqVar3.l = adyu.cR(acmqVar3.a, Uri.parse(acmqVar3.h), "", acmqVar3.j, false, false, 0, 0L);
                                    acaf acafVar = acmqVar3.l;
                                    if (acafVar == null) {
                                        zga.c("LocalRecordingManagerImpl", "Could not create file muxer.");
                                    } else {
                                        acafVar.h(new acmp(acmqVar3));
                                        if (acmqVar3.l.c() == 0) {
                                            acmqVar3.m = adyu.cI(mediaFormat4, acmqVar3.i, acmqVar3.l);
                                            acac acacVar = acmqVar3.m;
                                            if (acacVar == null) {
                                                zga.c("LocalRecordingManagerImpl", "Could not create audio encoder.");
                                                acmqVar3.g();
                                                return;
                                            }
                                            ((abzp) acacVar).d = acmqVar3.s;
                                            acmqVar3.o = adyu.cC(acmqVar3.a, mediaFormat5, acmqVar3.l, null);
                                            acas acasVar = acmqVar3.o;
                                            if (acasVar == null) {
                                                zga.c("LocalRecordingManagerImpl", "Could not create video encoder.");
                                            } else {
                                                acasVar.d = acmqVar3.s;
                                                int integer = mediaFormat5.getInteger("frame-rate");
                                                abzy cF = adyu.cF(acmqVar3.k, acmqVar3.o, integer, Math.min(integer, 15), acmqVar3.j, acmqVar3.b);
                                                if (cF == null) {
                                                    zga.c("LocalRecordingManagerImpl", "Could not create frame rate converter");
                                                    acas acasVar2 = acmqVar3.o;
                                                    acasVar2.d = null;
                                                    acasVar2.c();
                                                } else {
                                                    cF.e = acmqVar3.s;
                                                    acmqVar3.n = cF;
                                                    return;
                                                }
                                            }
                                            acmqVar3.g();
                                            return;
                                        }
                                    }
                                    acmqVar3.g();
                                }
                            });
                            acmq acmqVar3 = (acmq) acohVar.b.j;
                            acmqVar3.b.post(new acmg(acmqVar3, i3));
                            acohVar.a = true;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("AudioRecord.read failed: ");
                sb2.append(read);
                String sb3 = sb2.toString();
                Logging.b("WebRtcAudioRecordExternal", sb3);
                if (read == -3) {
                    this.a = false;
                    WebRtcAudioRecord webRtcAudioRecord5 = this.b;
                    String valueOf2 = String.valueOf(sb3);
                    Logging.b("WebRtcAudioRecordExternal", valueOf2.length() != 0 ? "Run-time recording error: ".concat(valueOf2) : new String("Run-time recording error: "));
                    aype.s("WebRtcAudioRecordExternal", webRtcAudioRecord5.b, webRtcAudioRecord5.c);
                    acnc acncVar = webRtcAudioRecord5.i;
                    if (acncVar != null) {
                        String valueOf3 = String.valueOf(sb3);
                        zga.c("PeerConnectionClient", valueOf3.length() != 0 ? "onWebRtcAudioRecordError: ".concat(valueOf3) : new String("onWebRtcAudioRecordError: "));
                        acog acogVar = acncVar.a.A;
                        if (acogVar != null) {
                            acogVar.a();
                        }
                    }
                }
            }
            i = 3;
        }
        try {
            AudioRecord audioRecord2 = this.b.f;
            if (audioRecord2 != null) {
                audioRecord2.stop();
                WebRtcAudioRecord.d(1);
            }
        } catch (IllegalStateException e) {
            String valueOf4 = String.valueOf(e.getMessage());
            Logging.b("WebRtcAudioRecordExternal", valueOf4.length() != 0 ? "AudioRecord.stop failed: ".concat(valueOf4) : new String("AudioRecord.stop failed: "));
        }
    }
}
