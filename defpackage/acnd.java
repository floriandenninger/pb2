package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.opengl.EGLContext;
import android.os.Handler;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoderFactory;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.AudioTrack;
import org.webrtc.BuiltinAudioDecoderFactoryFactory;
import org.webrtc.BuiltinAudioEncoderFactoryFactory;
import org.webrtc.ContextUtils;
import org.webrtc.DataChannel;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.Metrics;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.SessionDescription;
import org.webrtc.VideoTrack;
import org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnd implements acmv {
    private static final SparseArray C;
    public static final long a;
    public acog A;
    private final List D;
    private final boolean E;
    private final acoh F;
    public final Context c;
    public final ysl d;
    public final List e;
    public final boolean f;
    public final int g;
    public final baog h;
    public final acnh i;
    public Handler j;
    public boolean k;
    public String l;
    public String m;
    public int n;
    public int o;
    public acnk p;
    public String q;
    public acma r;
    public acnp s;
    public baoc t;
    public baqv u;
    public AudioTrack v;
    public VideoTrack w;
    public PeerConnectionFactory x;
    public PeerConnection y;
    public acne z;
    public final Runnable b = new acmy(this, 0);
    public final acnc B = new acnc(this, null);

    static {
        SparseArray sparseArray = new SparseArray();
        C = sparseArray;
        sparseArray.put(0, axin.NONE);
        sparseArray.put(1, axin.FRAMERATE);
        sparseArray.put(2, axin.DYNAMIC);
        a = TimeUnit.SECONDS.toMillis(1L);
    }

    public acnd(Context context, ysl yslVar, EGLContext eGLContext, List list, List list2, boolean z, boolean z2, int i, float f, int i2, acoh acohVar, acne acneVar) {
        boolean z3;
        long j;
        boolean z4 = false;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.c = applicationContext;
        this.d = yslVar;
        this.D = list;
        this.e = list2;
        this.f = z;
        this.E = z2;
        this.F = acohVar;
        this.z = acneVar;
        SparseBooleanArray sparseBooleanArray = abvo.a;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        int i3 = 300000;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 1 || (type == 0 && abvo.a.get(subtype, false))) {
                i3 = i2;
            }
        }
        this.g = i3;
        eGLContext.getClass();
        this.i = new acnh(context, yslVar);
        baok l = ((baol) baoe.c(eGLContext, baom.c)).l();
        this.h = l;
        bapo bapoVar = new bapo(applicationContext);
        int i4 = i > 0 ? i : 150;
        double d = f > 0.0f ? f : 0.95d;
        String str = (list2 == null || list2.size() <= 0 || list2.get(0) != axio.H265X) ? "" : "WebRTC-GenericPictureId/Enabled/";
        String format = String.format("WebRTC-BweWindowSizeInPackets/Enabled-%d/", Integer.valueOf(i4));
        String format2 = String.format("WebRTC-BweBackOffFactor/Enabled-%f/", Double.valueOf(d));
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 48 + String.valueOf(format2).length() + str.length());
        sb.append(format);
        sb.append(format2);
        sb.append("WebRTC-Audio-MinimizeResamplingOnMobile/Enabled/");
        sb.append(str);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        if (valueOf.length() != 0) {
            "Field trials: ".concat(valueOf);
        }
        bapoVar.b = sb2;
        Context context2 = bapoVar.a;
        String str2 = bapoVar.b;
        ContextUtils.initialize(context2);
        synchronized (bape.a) {
            if (!bape.b) {
                Logging.a("NativeLibrary", "Loading native library: jingle_peerconnection_so");
                bape.b = aynu.p();
            } else {
                Logging.a("NativeLibrary", "Native library has already been loaded.");
            }
        }
        PeerConnectionFactory.nativeInitializeAndroidGlobals();
        PeerConnectionFactory.nativeInitializeFieldTrials(str2);
        Logging.a("PeerConnectionFactory", "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
        PeerConnectionFactory.nativeDeleteLoggable();
        Metrics.nativeEnable();
        PeerConnectionFactory.Options options = new PeerConnectionFactory.Options();
        axjz c = InternalMediaCodecVideoEncoderFactory.c();
        c.a = amkq.y(l);
        c.e = new acnc(this, null);
        for (axio axioVar : axio.values()) {
            ((amof) c.c).f(axioVar);
        }
        for (int i5 = 0; i5 < this.D.size(); i5++) {
            axin axinVar = (axin) C.get(((acls) this.D.get(i5)).b);
            if (axinVar != null) {
                String str3 = ((acls) this.D.get(i5)).a;
                axio axioVar2 = ((acls) this.D.get(i5)).c;
                c.a(InternalMediaCodecVideoEncoderFactory.b(axioVar2, str3, axinVar));
                axioVar2.ordinal();
            }
        }
        InternalMediaCodecVideoEncoderFactory internalMediaCodecVideoEncoderFactory = new InternalMediaCodecVideoEncoderFactory(c.a, c.b, c.e, amrv.b(c.c), c.d, null);
        bapn bapnVar = new bapn();
        bapnVar.a = options;
        bapnVar.b = internalMediaCodecVideoEncoderFactory;
        if (this.E) {
            bapnVar.c = new axkj(this.h);
        }
        barb a2 = JavaAudioDeviceModule.a(this.c);
        a2.d = this.f;
        a2.a = 1;
        a2.e = new AudioAttributes.Builder().setUsage(1).build();
        if (bare.b()) {
            z3 = true;
        } else {
            Logging.b("JavaAudioDeviceModule", "HW AEC not supported");
            z3 = false;
        }
        a2.b = z3;
        if (bare.c()) {
            z4 = true;
        } else {
            Logging.b("JavaAudioDeviceModule", "HW NS not supported");
        }
        a2.c = z4;
        a2.h = new acnc(this);
        a2.f = new acnc(this);
        a2.g = this.F;
        bapnVar.d = a2.a();
        PeerConnectionFactory.b();
        if (bapnVar.d == null) {
            bapnVar.d = JavaAudioDeviceModule.a(ContextUtils.getApplicationContext()).a();
        }
        Context applicationContext2 = ContextUtils.getApplicationContext();
        PeerConnectionFactory.Options options2 = bapnVar.a;
        JavaAudioDeviceModule javaAudioDeviceModule = bapnVar.d;
        synchronized (javaAudioDeviceModule.h) {
            j = javaAudioDeviceModule.i;
            if (j == 0) {
                j = JavaAudioDeviceModule.nativeCreateAudioDeviceModule(javaAudioDeviceModule.a, javaAudioDeviceModule.b, javaAudioDeviceModule.c, javaAudioDeviceModule.d, javaAudioDeviceModule.e, javaAudioDeviceModule.f, javaAudioDeviceModule.g, false);
                javaAudioDeviceModule.i = j;
            }
        }
        this.x = PeerConnectionFactory.nativeCreatePeerConnectionFactory(applicationContext2, options2, j, BuiltinAudioEncoderFactoryFactory.nativeCreateBuiltinAudioEncoderFactory(), BuiltinAudioDecoderFactoryFactory.nativeCreateBuiltinAudioDecoderFactory(), bapnVar.b, bapnVar.c, 0L, 0L, 0L, 0L, 0L);
    }

    public final void a(boolean z) {
        MediaConstraints mediaConstraints = new MediaConstraints();
        if (this.E) {
            mediaConstraints.a.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "true"));
            mediaConstraints.a.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "true"));
            this.y.nativeCreateDataChannel("data_channel", new DataChannel.Init());
        } else {
            mediaConstraints.a.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "false"));
        }
        this.y.nativeCreateOffer(new aclr(this, z), mediaConstraints);
    }

    public final void b() {
        this.j.post(new acmy(this, 1, null));
        acma acmaVar = this.r;
        if (acmaVar != null) {
            acmaVar.b();
            acmaVar.c = null;
            this.r = null;
        }
        acnp acnpVar = this.s;
        if (acnpVar != null) {
            acnpVar.a();
            acnp acnpVar2 = this.s;
            acnpVar2.i = null;
            acnpVar2.a.quit();
            this.s = null;
        }
        PeerConnection peerConnection = this.y;
        if (peerConnection != null) {
            peerConnection.nativeClose();
            for (MediaStream mediaStream : peerConnection.a) {
                peerConnection.nativeRemoveLocalStream(mediaStream.a());
                mediaStream.dispose();
            }
            peerConnection.a.clear();
            Iterator it = peerConnection.c.iterator();
            while (it.hasNext()) {
                ((RtpSender) it.next()).a();
            }
            peerConnection.c.clear();
            Iterator it2 = peerConnection.d.iterator();
            while (it2.hasNext()) {
                ((RtpReceiver) it2.next()).dispose();
            }
            Iterator it3 = peerConnection.e.iterator();
            while (it3.hasNext()) {
                ((RtpTransceiver) it3.next()).dispose();
            }
            peerConnection.e.clear();
            peerConnection.d.clear();
            PeerConnection.nativeFreeOwnedPeerConnection(peerConnection.b);
            this.y = null;
        }
        baoc baocVar = this.t;
        if (baocVar != null) {
            baocVar.b();
            this.t = null;
        }
        baqv baqvVar = this.u;
        if (baqvVar != null) {
            baqvVar.b();
            this.u = null;
        }
        this.i.b(null);
        this.q = null;
    }

    public final void c(SessionDescription sessionDescription) {
        String.valueOf(String.valueOf(sessionDescription.a)).length();
        String valueOf = String.valueOf(sessionDescription.b);
        if (valueOf.length() != 0) {
            "setRemoteDescription description: ".concat(valueOf);
        }
        PeerConnection peerConnection = this.y;
        if (peerConnection != null) {
            peerConnection.nativeSetRemoteDescription(new acnb(this), sessionDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        AudioTrack audioTrack = this.v;
        return (audioTrack == null || this.t == null || !audioTrack.e()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(boolean z) {
        AudioTrack audioTrack = this.v;
        return (audioTrack == null || this.t == null || (z != audioTrack.e() && !this.v.f(z))) ? false : true;
    }
}
