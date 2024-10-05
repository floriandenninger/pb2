package defpackage;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.os.Process;
import io.grpc.Status;
import java.io.DataInput;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aynu {
    static volatile ayrs a;
    static volatile ayrv b;
    public static volatile ayrv c;
    public static volatile ayrv d;
    public static volatile ayrv e;
    public static volatile ayrv f;
    public static volatile ayrv g;
    public static volatile ayrv h;
    public static volatile ayrv i;
    public static volatile ayrv j;
    public static volatile ayrv k;
    public static volatile ayrv l;
    public static volatile ayrv m;
    public static volatile ayrv n;
    public static volatile ayrv o;
    public static volatile ayrv p;
    public static volatile ayrv q;
    public static volatile ayro r;
    public static volatile ayro s;
    public static volatile ayro t;
    public static volatile ayro u;
    public static volatile ayro v;
    public static volatile boolean w;
    public static volatile boolean x;
    private static bamz y;

    public static void A(bajh bajhVar, int i2, int i3, int i4) {
        if (i2 < i3 || i2 > i4) {
            throw new bajs(bajhVar.o(), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static aynu C() {
        Thread.currentThread();
        Process.myTid();
        return new aynu();
    }

    public static Set a(Map map, String str) {
        Status.Code a2;
        List e2 = ayjr.e(map, str);
        if (e2 == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(Status.Code.class);
        for (Object obj : e2) {
            if (obj instanceof Double) {
                Double d2 = (Double) obj;
                int intValue = d2.intValue();
                amkq.w(((double) intValue) == d2.doubleValue(), "Status code %s is not integral", obj);
                a2 = Status.fromCodeValue(intValue).getCode();
                amkq.w(a2.value() == d2.intValue(), "Status code %s is not valid", obj);
            } else if (obj instanceof String) {
                try {
                    a2 = Status.Code.a((String) obj);
                } catch (IllegalArgumentException e3) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Status code ");
                    sb.append(valueOf);
                    sb.append(" is not valid");
                    throw new amod(sb.toString(), e3);
                }
            } else {
                String valueOf2 = String.valueOf(obj);
                String valueOf3 = String.valueOf(obj.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 65 + String.valueOf(valueOf3).length());
                sb2.append("Can not convert status code ");
                sb2.append(valueOf2);
                sb2.append(" to Status.Code, because its type is ");
                sb2.append(valueOf3);
                throw new amod(sb2.toString());
            }
            noneOf.add(a2);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static axzs b(aycd aycdVar) {
        return new aypa(aycdVar);
    }

    public static void c(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static ayqx d() {
        return f(aysu.b);
    }

    public static ayqx e(ayrm ayrmVar) {
        aysw.b(ayrmVar, "run is null");
        return new ayqv(ayrmVar);
    }

    public static ayqx f(Runnable runnable) {
        aysw.b(runnable, "run is null");
        return new ayqz(runnable);
    }

    public static final void g(Throwable th, Throwable th2) {
        th2.getClass();
        if (th != th2) {
            int i2 = azti.a;
            Method method = aztg.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static ayqi h(ayrv ayrvVar, Callable callable) {
        try {
            ayqi ayqiVar = (ayqi) ayrvVar.a(callable);
            aysw.b(ayqiVar, "Scheduler Callable result can't be null");
            return ayqiVar;
        } catch (Throwable th) {
            throw azqi.b(th);
        }
    }

    public static ayqi i(Callable callable) {
        try {
            ayqi ayqiVar = (ayqi) callable.call();
            aysw.b(ayqiVar, "Scheduler Callable result can't be null");
            return ayqiVar;
        } catch (Throwable th) {
            throw azqi.b(th);
        }
    }

    public static void j(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof ayrh) && !(th instanceof ayrg) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof ayrf)) {
            th = new ayrj(th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static void k(Runnable runnable) {
        aysw.b(runnable, "run is null");
    }

    static boolean l(ayrq ayrqVar) {
        try {
            return ((ayvv) ayrqVar).j;
        } catch (Throwable th) {
            c(th);
            return true;
        }
    }

    public static boolean m(long j2, banw banwVar, Queue queue, AtomicLong atomicLong, ayrq ayrqVar) {
        long j3 = j2 & Long.MIN_VALUE;
        while (true) {
            if (j3 != j2) {
                if (l(ayrqVar)) {
                    return true;
                }
                Object poll = queue.poll();
                if (poll != null) {
                    banwVar.c(poll);
                    j3++;
                } else {
                    banwVar.sh();
                    return true;
                }
            } else {
                if (l(ayrqVar)) {
                    return true;
                }
                if (!queue.isEmpty()) {
                    j2 = atomicLong.get();
                    if (j2 == j3) {
                        long addAndGet = atomicLong.addAndGet(-(j3 & Long.MAX_VALUE));
                        if ((Long.MAX_VALUE & addAndGet) == 0) {
                            return false;
                        }
                        j2 = addAndGet;
                        j3 = addAndGet & Long.MIN_VALUE;
                    } else {
                        continue;
                    }
                } else {
                    banwVar.sh();
                    return true;
                }
            }
        }
    }

    public static int n(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }

    public static float[] o(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static final boolean p() {
        Logging.a("NativeLibrary", "Loading library: jingle_peerconnection_so");
        try {
            System.loadLibrary("jingle_peerconnection_so");
            return true;
        } catch (UnsatisfiedLinkError e2) {
            Logging.c("NativeLibrary", "Failed to load native library: jingle_peerconnection_so", e2);
            return false;
        }
    }

    public static int q(int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i3 = iArr[0];
        GLES20.glBindTexture(i2, i3);
        GLES20.glTexParameterf(i2, 10241, 9729.0f);
        GLES20.glTexParameterf(i2, 10240, 9729.0f);
        GLES20.glTexParameterf(i2, 10242, 33071.0f);
        GLES20.glTexParameterf(i2, 10243, 33071.0f);
        s("generateTexture");
        return i3;
    }

    public static FloatBuffer r(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        return asFloatBuffer;
    }

    public static void s(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new bapb(str);
            }
            StringBuilder sb = new StringBuilder(str.length() + 27);
            sb.append(str);
            sb.append(": GLES20 error: ");
            sb.append(glGetError);
            throw new GLException(glGetError, sb.toString());
        }
    }

    public static long t(DataInput dataInput) {
        long readUnsignedByte;
        long j2;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i2 = readUnsignedByte2 >> 6;
        if (i2 == 1) {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j2 = 60000;
        } else if (i2 == 2) {
            readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j2 = 1000;
        } else {
            if (i2 == 3) {
                return dataInput.readLong();
            }
            readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
            j2 = 1800000;
        }
        return readUnsignedByte * j2;
    }

    public static bajn u(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return new banl(bano.o(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            banr banrVar = new banr(str, dataInput.readUTF(), (int) t(dataInput), (int) t(dataInput));
            return banrVar.equals(bajn.a) ? bajn.a : banrVar;
        }
        if (readUnsignedByte == 80) {
            return bano.o(dataInput, str);
        }
        throw new IOException("Invalid encoding");
    }

    public static bamz v() {
        banf banfVar;
        if (y == null) {
            banh banhVar = new banh();
            band bandVar = new band("P");
            banhVar.d(bandVar, bandVar);
            banhVar.b(0);
            banhVar.i("Y");
            banhVar.b(1);
            banhVar.i("M");
            banhVar.b(2);
            banhVar.i("W");
            banhVar.b(3);
            banhVar.i("D");
            List list = banhVar.b;
            if (list.size() == 0) {
                banf banfVar2 = new banf(band.a);
                banhVar.d(banfVar2, banfVar2);
            } else {
                int size = list.size();
                while (true) {
                    int i2 = size - 1;
                    if (i2 < 0) {
                        banfVar = null;
                        break;
                    }
                    if (list.get(i2) instanceof banf) {
                        banfVar = (banf) list.get(i2);
                        list = list.subList(i2 + 1, list.size());
                        break;
                    }
                    size = i2 - 1;
                }
                if (banfVar == null || list.size() != 0) {
                    Object[] c2 = banh.c(list);
                    list.clear();
                    banj banjVar = (banj) c2[0];
                    banf banfVar3 = new banf(banjVar);
                    list.add(banfVar3);
                    list.add(banfVar3);
                } else {
                    throw new IllegalStateException("Cannot have two adjacent separators");
                }
            }
            banhVar.e();
            banhVar.i("H");
            banhVar.f();
            banhVar.i("M");
            banhVar.b(9);
            banhVar.i("S");
            y = banhVar.a();
        }
        return y;
    }

    public static int w(long j2) {
        if (j2 >= -2147483648L && j2 <= 2147483647L) {
            return (int) j2;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append("Value cannot fit in an int: ");
        sb.append(j2);
        throw new ArithmeticException(sb.toString());
    }

    public static long x(long j2, long j3) {
        long j4 = j2 + j3;
        if ((j2 ^ j4) >= 0 || (j2 ^ j3) < 0) {
            return j4;
        }
        StringBuilder sb = new StringBuilder(79);
        sb.append("The calculation caused an overflow: ");
        sb.append(j2);
        sb.append(" + ");
        sb.append(j3);
        throw new ArithmeticException(sb.toString());
    }

    public static long y(long j2, int i2) {
        long j3 = i2;
        long j4 = j2 * j3;
        if (j4 / j3 == j2) {
            return j4;
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Multiplication overflows a long: ");
        sb.append(j2);
        sb.append(" * ");
        sb.append(i2);
        throw new ArithmeticException(sb.toString());
    }

    public static long z(long j2, long j3) {
        long j4 = j2 - j3;
        if ((j2 ^ j4) >= 0 || (j2 ^ j3) >= 0) {
            return j4;
        }
        StringBuilder sb = new StringBuilder(79);
        sb.append("The calculation caused an overflow: ");
        sb.append(j2);
        sb.append(" - ");
        sb.append(j3);
        throw new ArithmeticException(sb.toString());
    }
}
