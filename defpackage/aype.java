package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aype {
    public static volatile ayrv a;
    public static volatile ayrv b;

    public static aypn a(Object obj, ayrv ayrvVar) {
        azah azahVar = new azah(obj, ayrvVar);
        ayrv ayrvVar2 = aynu.j;
        return azahVar;
    }

    public static boolean b(banv banvVar, banw banwVar, ayrv ayrvVar) {
        if (!(banvVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) banvVar).call();
            if (call == null) {
                azpy.b(banwVar);
                return true;
            }
            try {
                banv banvVar2 = (banv) ayrvVar.a(call);
                aysw.b(banvVar2, "The mapper returned a null Publisher");
                if (banvVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) banvVar2).call();
                        if (call2 == null) {
                            azpy.b(banwVar);
                            return true;
                        }
                        banwVar.f(new azpz(banwVar, call2));
                    } catch (Throwable th) {
                        aynu.c(th);
                        azpy.f(th, banwVar);
                        return true;
                    }
                } else {
                    banvVar2.ab(banwVar);
                }
                return true;
            } catch (Throwable th2) {
                aynu.c(th2);
                azpy.f(th2, banwVar);
                return true;
            }
        } catch (Throwable th3) {
            aynu.c(th3);
            azpy.f(th3, banwVar);
            return true;
        }
    }

    public static List c(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static void d() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List e(Iterable iterable) {
        iterable.getClass();
        int size = iterable.size();
        if (size == 0) {
            return azsh.a;
        }
        if (size != 1) {
            return new ArrayList((Collection) iterable);
        }
        return c(iterable.get(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(Iterable iterable) {
        return iterable.size();
    }

    public static void g(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        appendable.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            if (obj == null || (obj instanceof CharSequence)) {
                appendable.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
            } else {
                appendable.append(String.valueOf(obj));
            }
        }
        appendable.append(charSequence3);
    }

    public static List h(Object[] objArr) {
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void i(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static /* synthetic */ void j(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static azrz k(Object obj, Object obj2) {
        return new azrz(obj, obj2);
    }

    public static Object l(Throwable th) {
        return new azsa(th);
    }

    public static void m(Object obj) {
        if (obj instanceof azsa) {
            throw ((azsa) obj).a;
        }
    }

    public static String n(int i) {
        if (i == 0) {
            return "INVALID";
        }
        switch (i) {
            case 2:
                return "PCM_16BIT";
            case 3:
                return "PCM_8BIT";
            case 4:
                return "PCM_FLOAT";
            case 5:
            case 6:
                return "AC3";
            case 7:
                return "DTS";
            case 8:
                return "DTS_HD";
            case 9:
                return "MP3";
            default:
                StringBuilder sb = new StringBuilder(29);
                sb.append("Invalid encoding: ");
                sb.append(i);
                return sb.toString();
        }
    }

    public static String o(int i) {
        return i != 12 ? i != 16 ? "INVALID" : "IN_MONO" : "IN_STEREO";
    }

    public static String p(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static String q() {
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33);
        sb.append("@[name=");
        sb.append(name);
        sb.append(", id=");
        sb.append(id);
        sb.append("]");
        return sb.toString();
    }

    public static String r(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static void s(String str, Context context, AudioManager audioManager) {
        AudioDeviceInfo[] devices;
        int length;
        int i = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.ID;
        String str6 = Build.HARDWARE;
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        String str9 = Build.PRODUCT;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 108 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length());
        sb.append("Android SDK: ");
        sb.append(i);
        sb.append(", Release: ");
        sb.append(str2);
        sb.append(", Brand: ");
        sb.append(str3);
        sb.append(", Device: ");
        sb.append(str4);
        sb.append(", Id: ");
        sb.append(str5);
        sb.append(", Hardware: ");
        sb.append(str6);
        sb.append(", Manufacturer: ");
        sb.append(str7);
        sb.append(", Model: ");
        sb.append(str8);
        sb.append(", Product: ");
        sb.append(str9);
        Logging.a(str, sb.toString());
        String r = r(audioManager.getMode());
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        boolean isMicrophoneMute = audioManager.isMicrophoneMute();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        StringBuilder sb2 = new StringBuilder(r.length() + 116);
        sb2.append("Audio State: audio mode: ");
        sb2.append(r);
        sb2.append(", has mic: ");
        sb2.append(hasSystemFeature);
        sb2.append(", mic muted: ");
        sb2.append(isMicrophoneMute);
        sb2.append(", music active: ");
        sb2.append(isMusicActive);
        sb2.append(", speakerphone: ");
        sb2.append(isSpeakerphoneOn);
        sb2.append(", BT SCO: ");
        sb2.append(isBluetoothScoOn);
        Logging.a(str, sb2.toString());
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.a(str, "Audio State: ");
        boolean isVolumeFixed = audioManager.isVolumeFixed();
        StringBuilder sb3 = new StringBuilder(20);
        sb3.append("  fixed volume=");
        sb3.append(isVolumeFixed);
        Logging.a(str, sb3.toString());
        if (!isVolumeFixed) {
            for (int i2 = 0; i2 < 6; i2++) {
                int i3 = iArr[i2];
                StringBuilder sb4 = new StringBuilder();
                String str10 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
                StringBuilder sb5 = new StringBuilder(str10.length() + 4);
                sb5.append("  ");
                sb5.append(str10);
                sb5.append(": ");
                sb4.append(sb5.toString());
                sb4.append("volume=");
                sb4.append(audioManager.getStreamVolume(i3));
                sb4.append(", max=");
                sb4.append(audioManager.getStreamMaxVolume(i3));
                if (Build.VERSION.SDK_INT >= 23) {
                    sb4.append(", muted=");
                    sb4.append(audioManager.isStreamMute(i3));
                }
                Logging.a(str, sb4.toString());
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && (length = (devices = audioManager.getDevices(3)).length) != 0) {
            Logging.a(str, "Audio Devices: ");
            for (int i4 = 0; i4 < length; i4++) {
                AudioDeviceInfo audioDeviceInfo = devices[i4];
                StringBuilder sb6 = new StringBuilder();
                sb6.append("  ");
                sb6.append(p(audioDeviceInfo.getType()));
                sb6.append(true != audioDeviceInfo.isSource() ? "(out): " : "(in): ");
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    sb6.append("channels=");
                    sb6.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                    sb6.append(", ");
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    sb6.append("encodings=");
                    sb6.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                    sb6.append(", ");
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    sb6.append("sample rates=");
                    sb6.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                    sb6.append(", ");
                }
                sb6.append("id=");
                sb6.append(audioDeviceInfo.getId());
                Logging.a(str, sb6.toString());
            }
        }
    }

    public static /* synthetic */ String t(int i) {
        return i != 1 ? "AUDIO_TRACK_START_STATE_MISMATCH" : "AUDIO_TRACK_START_EXCEPTION";
    }

    public static /* synthetic */ String u(int i) {
        return i != 1 ? "AUDIO_RECORD_START_STATE_MISMATCH" : "AUDIO_RECORD_START_EXCEPTION";
    }

    public static Object v(Handler handler, Callable callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        baql baqlVar = new baql();
        baqk baqkVar = new baqk();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new baqm(baqlVar, callable, baqkVar, countDownLatch));
        w(countDownLatch);
        Exception exc = baqkVar.a;
        if (exc == null) {
            return baqlVar.a;
        }
        RuntimeException runtimeException = new RuntimeException(exc);
        StackTraceElement[] stackTrace = baqkVar.a.getStackTrace();
        StackTraceElement[] stackTrace2 = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace2.length;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length + length2];
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, length);
        System.arraycopy(stackTrace2, 0, stackTraceElementArr, length, length2);
        runtimeException.setStackTrace(stackTraceElementArr);
        throw runtimeException;
    }

    public static void w(CountDownLatch countDownLatch) {
        boolean z = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void x() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static void y(Handler handler, Runnable runnable) {
        v(handler, new baqn(runnable, 0));
    }

    public static boolean z(Thread thread) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = 2000;
        boolean z = false;
        while (j > 0) {
            try {
                thread.join(j);
                break;
            } catch (InterruptedException unused) {
                j = 2000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }
}
