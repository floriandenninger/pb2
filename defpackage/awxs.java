package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.webrtc.Logging;
import org.webrtc.VideoCodecStatus;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awxs {
    public static int a;
    public static volatile Boolean b;
    private static Context c;
    private static axii d;

    private awxs() {
    }

    public static String a(String str) {
        String substring = str.substring(str.lastIndexOf(47) + 1);
        int indexOf = substring.indexOf(95);
        int i = indexOf + 1;
        int indexOf2 = substring.indexOf(95, i);
        if (indexOf >= indexOf2) {
            throw new awzr();
        }
        String substring2 = substring.substring(i, indexOf2);
        int indexOf3 = substring2.indexOf(45);
        int lastIndexOf = substring2.lastIndexOf(45);
        if (indexOf3 >= lastIndexOf) {
            throw new awzr();
        }
        return substring2.substring(indexOf3 + 1, lastIndexOf);
    }

    public static boolean b(String str, String str2) {
        if (str.isEmpty()) {
            return false;
        }
        if (str2.isEmpty()) {
            return true;
        }
        try {
            return j(str).compareTo(j(str2)) > 0;
        } catch (awzr unused) {
            return true;
        }
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static final axas d(awzw awzwVar) {
        return new axas(awzwVar);
    }

    public static final VideoCodecStatus e(Handler handler, final Callable callable, String str) {
        Object call;
        try {
            if (handler.getLooper().getThread() == Thread.currentThread()) {
                try {
                    call = callable.call();
                } catch (Exception e) {
                    throw new ExecutionException(e);
                }
            } else {
                final axke axkeVar = new axke();
                final baqk baqkVar = new baqk();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final byte[] bArr = null;
                if (handler.post(new Runnable(callable, baqkVar, countDownLatch, bArr) { // from class: axkd
                    public final /* synthetic */ Callable b;
                    public final /* synthetic */ CountDownLatch c;
                    public final /* synthetic */ baqk d;

                    @Override // java.lang.Runnable
                    public final void run() {
                        axke axkeVar2 = axke.this;
                        Callable callable2 = this.b;
                        baqk baqkVar2 = this.d;
                        CountDownLatch countDownLatch2 = this.c;
                        try {
                            axkeVar2.a = callable2.call();
                        } catch (Exception e2) {
                            baqkVar2.a = e2;
                        }
                        countDownLatch2.countDown();
                    }
                })) {
                    while (!countDownLatch.await(3000L, TimeUnit.MILLISECONDS)) {
                        Thread thread = handler.getLooper().getThread();
                        if (thread.isAlive()) {
                            Throwable th = new Throwable();
                            th.setStackTrace(thread.getStackTrace());
                            Logging.e("ThreadUtils", "Invoke waiting to complete.", new Throwable(th));
                        } else {
                            throw new IllegalStateException("Underlying thread died while waiting for the operation to complete.");
                        }
                    }
                    Exception exc = baqkVar.a;
                    if (exc == null) {
                        call = axkeVar.a;
                    } else {
                        throw new ExecutionException(exc);
                    }
                } else {
                    throw new IllegalStateException("Posting on the handler failed. (Thread is not alive.)");
                }
            }
            return (VideoCodecStatus) call;
        } catch (IllegalStateException e2) {
            e = e2;
            Logging.c("ThreadUtils", "Exception", e);
            return VideoCodecStatus.ERROR;
        } catch (InterruptedException e3) {
            Logging.c("ThreadUtils", "Interrupted", e3);
            Thread.currentThread().interrupt();
            return VideoCodecStatus.ERROR;
        } catch (ExecutionException e4) {
            e = e4;
            Logging.c("ThreadUtils", "Exception", e);
            return VideoCodecStatus.ERROR;
        } catch (TimeoutException e5) {
            Thread thread2 = handler.getLooper().getThread();
            if (thread2.isAlive()) {
                Throwable th2 = new Throwable();
                th2.setStackTrace(thread2.getStackTrace());
                StringBuilder sb = new StringBuilder(str.length() + 36);
                sb.append("Timeout waiting for ");
                sb.append(str);
                sb.append(". Thread is busy");
                Logging.c("ThreadUtils", sb.toString(), new Throwable(th2));
            } else {
                Logging.c("ThreadUtils", str.length() != 0 ? "Thread died while waiting for ".concat(str) : new String("Thread died while waiting for "), e5);
            }
            return VideoCodecStatus.ERROR;
        }
    }

    public static final axkc f(String str) {
        return new axkc(MediaCodec.createByCodecName(str));
    }

    public static Context g(Context context) {
        if (c == null) {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            if (vrCoreClientApiVersion < 9) {
                throw new axhh(4);
            }
            try {
                c = context.createPackageContext("com.google.vr.vrcore", 3);
                a = vrCoreClientApiVersion;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new axhh(1);
            }
        }
        return c;
    }

    public static axii h(Context context) {
        axii axiiVar;
        if (d == null) {
            IBinder k = k(g(context).getClassLoader());
            if (k == null) {
                axiiVar = null;
            } else {
                IInterface queryLocalInterface = k.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                if (queryLocalInterface instanceof axii) {
                    axiiVar = (axii) queryLocalInterface;
                } else {
                    axiiVar = new axii(k);
                }
            }
            d = axiiVar;
        }
        return d;
    }

    public static synchronized boolean i(Context context) {
        boolean booleanValue;
        synchronized (awxs.class) {
            if (b == null) {
                try {
                    b = Boolean.valueOf(axhg.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), axhg.c, axhg.d, axhg.b));
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalStateException("Unable to find self package info", e);
                }
            }
            booleanValue = b.booleanValue();
        }
        return booleanValue;
    }

    private static String j(String str) {
        String[] split = str.substring(str.lastIndexOf(47) + 1).split("_", -1);
        if (split.length != 6 || split[2].length() != 10 || split[2].charAt(4) != '-' || split[2].charAt(7) != '-') {
            throw new awzr();
        }
        return split[2];
    }

    private static IBinder k(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.vrcore.library.VrCreator").newInstance();
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.vrcore.library.VrCreator");
        } catch (IllegalAccessException unused2) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.vrcore.library.VrCreator");
        } catch (InstantiationException unused3) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.vrcore.library.VrCreator");
        }
    }
}
