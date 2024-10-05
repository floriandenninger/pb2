package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public class anaf {
    public static Object A(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object B(java.util.concurrent.Future r4, long r5, java.util.concurrent.TimeUnit r7) {
        /*
            r0 = 1
            r1 = 0
            long r5 = r7.toNanos(r5)     // Catch: java.lang.Throwable -> L28
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L28
            long r2 = r2 + r5
        Lb:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            java.lang.Object r4 = r4.get(r5, r7)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            if (r1 == 0) goto L1a
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L1a:
            return r4
        L1b:
            r4 = move-exception
            r0 = r1
            goto L2a
        L1e:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L26
            long r5 = r2 - r5
            r1 = 1
            goto Lb
        L26:
            r4 = move-exception
            goto L2a
        L28:
            r4 = move-exception
            r0 = 0
        L2a:
            if (r0 == 0) goto L33
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L33:
            goto L35
        L34:
            throw r4
        L35:
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anaf.B(java.util.concurrent.Future, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public static anib C(ExecutorService executorService) {
        anib anifVar;
        if (executorService instanceof anib) {
            return (anib) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            anifVar = new anii((ScheduledExecutorService) executorService);
        } else {
            anifVar = new anif(executorService);
        }
        return anifVar;
    }

    public static anic D(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof anic) {
            return (anic) scheduledExecutorService;
        }
        return new anii(scheduledExecutorService);
    }

    public static Executor E(Executor executor) {
        return new anim(executor);
    }

    public static Executor F(Executor executor, anfm anfmVar) {
        executor.getClass();
        return executor == angq.a ? executor : new anid(executor, anfmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static amru G(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        ?? r6 = iterable;
        if (!z) {
            r6 = amru.n(iterable);
        }
        anhy[] anhyVarArr = (anhy[]) r6.toArray(new anhy[0]);
        anho anhoVar = new anho(anhyVarArr);
        amrp h = amru.h(anhyVarArr.length);
        for (int i = 0; i < anhyVarArr.length; i++) {
            h.h(new anhn(anhoVar));
        }
        amru g = h.g();
        for (int i2 = 0; i2 < anhyVarArr.length; i2++) {
            anhyVarArr[i2].d(new anhj(anhoVar, g, i2), angq.a);
        }
        return g;
    }

    public static anhm H(Iterable iterable) {
        return new anhm(false, amru.n(iterable));
    }

    @SafeVarargs
    public static anhm I(anhy... anhyVarArr) {
        return new anhm(false, amru.p(anhyVarArr));
    }

    public static anhm J(Iterable iterable) {
        return new anhm(true, amru.n(iterable));
    }

    @SafeVarargs
    public static anhm K(anhy... anhyVarArr) {
        return new anhm(true, amru.p(anhyVarArr));
    }

    public static anhy L(Iterable iterable) {
        return new angl(amru.n(iterable), true);
    }

    public static anhy M() {
        return new anhu();
    }

    public static anhy N(Throwable th) {
        th.getClass();
        return new anhu(th);
    }

    public static anhy O(Object obj) {
        if (obj == null) {
            return anhv.a;
        }
        return new anhv(obj);
    }

    public static anhy P(anhy anhyVar) {
        if (anhyVar.isDone()) {
            return anhyVar;
        }
        anhp anhpVar = new anhp(anhyVar);
        anhyVar.d(anhpVar, angq.a);
        return anhpVar;
    }

    public static anhy Q(anfy anfyVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        aniu f = aniu.f(anfyVar);
        f.d(new anhi(scheduledExecutorService.schedule(f, j, timeUnit)), angq.a);
        return f;
    }

    public static anhy R(Runnable runnable, Executor executor) {
        aniu h = aniu.h(runnable, null);
        executor.execute(h);
        return h;
    }

    public static anhy S(Callable callable, Executor executor) {
        aniu g = aniu.g(callable);
        executor.execute(g);
        return g;
    }

    public static anhy T(anfy anfyVar, Executor executor) {
        aniu f = aniu.f(anfyVar);
        executor.execute(f);
        return f;
    }

    public static anhy U(Iterable iterable) {
        return new angl(amru.n(iterable), false);
    }

    public static anhy V(anhy anhyVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (anhyVar.isDone()) {
            return anhyVar;
        }
        anir anirVar = new anir(anhyVar);
        anip anipVar = new anip(anirVar);
        anirVar.b = scheduledExecutorService.schedule(anipVar, j, timeUnit);
        anhyVar.d(anipVar, angq.a);
        return anirVar;
    }

    public static Object W(Future future) {
        amkq.Q(future.isDone(), "Future was expected to be done: %s", future);
        return A(future);
    }

    public static Object X(Future future) {
        try {
            return A(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new angr((Error) cause);
            }
            throw new aniv(cause);
        }
    }

    public static void Y(anhy anhyVar, anhh anhhVar, Executor executor) {
        anhhVar.getClass();
        anhyVar.d(new anhk(anhyVar, anhhVar), executor);
    }

    public static void Z(anhy anhyVar, Future future) {
        if (anhyVar instanceof anfm) {
            ((anfm) anhyVar).n(future);
        } else {
            if (anhyVar == null || !anhyVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    public static int aA(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aB(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aC(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aD(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int aE(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            default:
                return 0;
        }
    }

    public static int aF(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aG(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int aH(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aI(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    public static int aJ(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
            default:
                return 0;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
        }
    }

    public static int aK(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aL(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int aM(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aN(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int aO(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aP(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aQ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int aR(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int aS(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int aT(int i) {
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
            default:
                return 0;
        }
    }

    public static int aU(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aV(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aW(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 3 ? 0 : 5;
        }
        return 3;
    }

    public static int aX(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            default:
                return 0;
        }
    }

    public static int aY(int i) {
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ String aZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "USER_INTERFACE_THEME_DARK" : "USER_INTERFACE_THEME_LIGHT" : "USER_INTERFACE_THEME_UNKNOWN";
    }

    public static Callable aa() {
        return new aein(6);
    }

    public static int ab(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j <= j2 ? 0 : 1;
    }

    public static int ac(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int ad(long j) {
        int i = (int) j;
        amkq.I(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int ae(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int af(int... iArr) {
        amkq.E(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int ag(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? CellularSignalStrengthError.ERROR_NOT_SUPPORTED : (int) j;
    }

    public static Integer ah(String str) {
        Long valueOf;
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i = charAt == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                int a = anes.a(str.charAt(i));
                if (a >= 0 && a < 10) {
                    long j = -a;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            int a2 = anes.a(str.charAt(i2));
                            if (a2 < 0 || a2 >= 10) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = a2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i2 = i3;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static List ai(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new aneq(iArr, 0, length);
    }

    public static int[] aj(Collection collection) {
        if (collection instanceof aneq) {
            aneq aneqVar = (aneq) collection;
            return Arrays.copyOfRange(aneqVar.a, aneqVar.b, aneqVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int ak(int i, int i2) {
        amkq.K(true, "min (%s) must be less than or equal to max (%s)", i2, 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static float al(float f, float f2, float f3) {
        if (f2 <= f3) {
            return Math.min(Math.max(f, f2), f3);
        }
        throw new IllegalArgumentException(amkq.z("min (%s) must be less than or equal to max (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static float[] am(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    public static int an(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    public static int ao(boolean... zArr) {
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    public static void ap(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 54);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    public static void aq(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static long ar(long j, long j2) {
        long j3 = j + j2;
        ap(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static long as(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ (-1)) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros((-1) ^ j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        ap(numberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        ap(true, "checkedMultiply", j, j2);
        long j3 = j * j2;
        ap(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (((r7 == java.math.RoundingMode.HALF_EVEN ? 1 : 0) & (r0 & 1)) != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r2 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r1 > 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r5 > 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r5 < 0) goto L65;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int at(int r5, int r6, java.math.RoundingMode r7) {
        /*
            r7.getClass()
            if (r6 == 0) goto L54
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = defpackage.anen.a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L53;
                case 3: goto L48;
                case 4: goto L4e;
                case 5: goto L45;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L42
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L4c
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            r6 = r6 & r7
            if (r6 == 0) goto L4b
            goto L4c
        L42:
            if (r1 <= 0) goto L4b
            goto L4c
        L45:
            if (r5 <= 0) goto L4b
            goto L4c
        L48:
            if (r5 >= 0) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L53
        L4e:
            int r0 = r0 + r5
            return r0
        L50:
            aq(r4)
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anaf.at(int, int, java.math.RoundingMode):int");
    }

    public static boolean au(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static aone av(Throwable th) {
        aone createBuilder = andu.a.createBuilder();
        aone cr = cr(th);
        createBuilder.copyOnWrite();
        andu anduVar = (andu) createBuilder.instance;
        andt andtVar = (andt) cr.build();
        andtVar.getClass();
        anduVar.c = andtVar;
        anduVar.b |= 1;
        while (th.getCause() != null) {
            aone cr2 = cr(th.getCause());
            createBuilder.copyOnWrite();
            andu anduVar2 = (andu) createBuilder.instance;
            andt andtVar2 = (andt) cr2.build();
            andtVar2.getClass();
            anduVar2.a();
            anduVar2.d.add(andtVar2);
            th = th.getCause();
        }
        return createBuilder;
    }

    public static int aw(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int ax(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int ay(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int az(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bA(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bB(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bC(int i) {
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
            case 23:
            case 24:
            case 30:
            default:
                return 0;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
        }
    }

    public static int bD(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bE(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bF(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int bG(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static int bH(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int bI(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bJ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bK(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static String bL(int i) {
        return Integer.toString(i - 1);
    }

    public static int bM(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int bN(int i) {
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
            case 8:
            default:
                return 0;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
        }
    }

    public static int bO(int i) {
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
            default:
                return 0;
        }
    }

    public static int bP(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bQ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bR(int i) {
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
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static int bS(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bT(int i) {
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

    public static int bU(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bV(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bW(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int bX(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            default:
                return 0;
        }
    }

    public static int bY(int i) {
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
            default:
                return 0;
        }
    }

    public static int bZ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int ba(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bb(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bc(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bd(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int be(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            default:
                return 0;
        }
    }

    public static int bf(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bg(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int bh(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bi(int i) {
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

    public static int bj(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bk(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int bl(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bm(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bn(int i) {
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
            default:
                return 0;
        }
    }

    public static int bo(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bp(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bq(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int br(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bs(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bt(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bu(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bv(int i) {
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

    public static int bw(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bx(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static int by(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int bz(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int ca(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int cb(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int cc(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int cd(int i) {
        if (i == 90) {
            return 91;
        }
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
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static int ce(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int cf(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int cg(int i) {
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
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static int ch(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int ci(int i) {
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

    public static int cj(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int ck(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int cl(int i) {
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
            default:
                return 0;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
        }
    }

    public static int cm(int i) {
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
            default:
                return 0;
        }
    }

    public static int cn(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int co(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    private static int cp(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        while ((i & i3) != 0) {
            i3 >>= 1;
        }
        return (i & (i3 - 1)) + i3;
    }

    private static void cq(int[] iArr, int i, int i2, int i3, int i4) {
        do {
            i3 -= i2;
            iArr[i + i3] = i4;
        } while (i3 > 0);
    }

    private static aone cr(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        aone createBuilder = andt.a.createBuilder();
        String name = th.getClass().getName();
        createBuilder.copyOnWrite();
        andt andtVar = (andt) createBuilder.instance;
        name.getClass();
        andtVar.b |= 1;
        andtVar.c = name;
        if (th.getMessage() != null) {
            String message = th.getMessage();
            createBuilder.copyOnWrite();
            andt andtVar2 = (andt) createBuilder.instance;
            message.getClass();
            andtVar2.b |= 2;
            andtVar2.d = message;
        }
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                aone createBuilder2 = ands.a.createBuilder();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    createBuilder2.copyOnWrite();
                    ands andsVar = (ands) createBuilder2.instance;
                    className.getClass();
                    andsVar.b |= 1;
                    andsVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    createBuilder2.copyOnWrite();
                    ands andsVar2 = (ands) createBuilder2.instance;
                    methodName.getClass();
                    andsVar2.b |= 2;
                    andsVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    createBuilder2.copyOnWrite();
                    ands andsVar3 = (ands) createBuilder2.instance;
                    andsVar3.b |= 8;
                    andsVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        createBuilder2.copyOnWrite();
                        ands andsVar4 = (ands) createBuilder2.instance;
                        fileName.getClass();
                        andsVar4.b |= 4;
                        andsVar4.e = fileName;
                    }
                }
                createBuilder.copyOnWrite();
                andt andtVar3 = (andt) createBuilder.instance;
                ands andsVar5 = (ands) createBuilder2.build();
                andsVar5.getClass();
                aony aonyVar = andtVar3.f;
                if (!aonyVar.c()) {
                    andtVar3.f = aonm.mutableCopy(aonyVar);
                }
                andtVar3.f.add(andsVar5);
            }
        }
        return createBuilder;
    }

    public static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static void e(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean f(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static void i(byte[] bArr, File file, amsx amsxVar) {
        bArr.getClass();
        anby a = anby.a();
        try {
            FileOutputStream j = j(file, amsxVar);
            a.c(j);
            j.write(bArr);
            j.flush();
        } finally {
        }
    }

    public static FileOutputStream j(File file, amsx amsxVar) {
        return new FileOutputStream(file, amsxVar.contains(anca.a));
    }

    public static int l(int i) {
        if (i == 45) {
            return 46;
        }
        if (i == 46) {
            return 47;
        }
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
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            default:
                return 0;
        }
    }

    public static int m(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int n(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int o(int i) {
        return i - 2;
    }

    public static int p(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 200) {
            return 202;
        }
        switch (i) {
            case 100:
                return 102;
            case 101:
                return 103;
            case 102:
                return 104;
            case 103:
                return 105;
            case 104:
                return 106;
            case 105:
                return 107;
            case 106:
                return 108;
            case 107:
                return 109;
            case 108:
                return 110;
            case 109:
                return 111;
            case 110:
                return 112;
            case 111:
                return 113;
            default:
                switch (i) {
                    case 300:
                        return 302;
                    case 301:
                        return 303;
                    case 302:
                        return 304;
                    case 303:
                        return 305;
                    case 304:
                        return 306;
                    case 305:
                        return 307;
                    case 306:
                        return 308;
                    case 307:
                        return 309;
                    case 308:
                        return 310;
                    case 309:
                        return 311;
                    case 310:
                        return 312;
                    case 311:
                        return 313;
                    case 312:
                        return 314;
                    case 313:
                        return 315;
                    case 314:
                        return 316;
                    case 315:
                        return 317;
                    case 316:
                        return 318;
                    case 317:
                        return 319;
                    case 318:
                        return 320;
                    case 319:
                        return 321;
                    case 320:
                        return 322;
                    case 321:
                        return 323;
                    case 322:
                        return 324;
                    case 323:
                        return 325;
                    case 324:
                        return 326;
                    case 325:
                        return 327;
                    case 326:
                        return 328;
                    case 327:
                        return 329;
                    case 328:
                        return 330;
                    case 329:
                        return 331;
                    default:
                        switch (i) {
                            case 400:
                                return 402;
                            case 401:
                                return 403;
                            case 402:
                                return 404;
                            case 403:
                                return 405;
                            case 404:
                                return 406;
                            default:
                                switch (i) {
                                    case 1000:
                                        return 1002;
                                    case 1001:
                                        return 1003;
                                    case 1002:
                                        return 1004;
                                    case 1003:
                                        return 1005;
                                    case 1004:
                                        return 1006;
                                    case 1005:
                                        return 1007;
                                    case 1006:
                                        return 1008;
                                    case 1007:
                                        return 1009;
                                    case 1008:
                                        return 1010;
                                    case 1009:
                                        return 1011;
                                    case 1010:
                                        return 1012;
                                    case 1011:
                                        return 1013;
                                    default:
                                        switch (i) {
                                            case 2000:
                                                return 2002;
                                            case 2001:
                                                return 2003;
                                            case 2002:
                                                return 2004;
                                            case 2003:
                                                return 2005;
                                            case 2004:
                                                return 2006;
                                            case 2005:
                                                return 2007;
                                            case 2006:
                                                return 2008;
                                            case 2007:
                                                return 2009;
                                            case 2008:
                                                return 2010;
                                            case 2009:
                                                return 2011;
                                            case 2010:
                                                return 2012;
                                            case 2011:
                                                return 2013;
                                            case 2012:
                                                return 2014;
                                            case 2013:
                                                return 2015;
                                            case 2014:
                                                return 2016;
                                            default:
                                                return 0;
                                        }
                                }
                        }
                }
        }
    }

    public static int q(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int r(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static void s(File file, File file2) {
        amkq.L(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        anaf x = x(file);
        file2.getClass();
        amsx q = amsx.q(new anca[0]);
        anby a = anby.a();
        try {
            FileInputStream cp = ((ancb) x).cp();
            a.c(cp);
            FileOutputStream j = j(file2, q);
            a.c(j);
            anbt.g(cp, j);
        } finally {
        }
    }

    public static void t(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Unable to create parent directories of ");
        sb.append(valueOf);
        throw new IOException(sb.toString());
    }

    public static void u(byte[] bArr, File file) {
        file.getClass();
        i(bArr, file, amsx.q(new anca[0]));
    }

    public static byte[] v(File file) {
        return x(file).h();
    }

    public static anaf w(File file, Charset charset) {
        return new anbq(x(file), charset, null, null);
    }

    public static anaf x(File file) {
        return new ancb(file);
    }

    public static anjq y(String str) {
        if (!ankk.f().containsKey(str)) {
            throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
        }
        return (anjq) ankk.f().get(str);
    }

    public static int z(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        int i4;
        int i5 = iArr[i];
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i4 = 1;
            if (i7 >= i3) {
                break;
            }
            int i8 = iArr2[i7];
            iArr4[i8] = iArr4[i8] + 1;
            i7++;
        }
        iArr5[1] = 0;
        int i9 = 1;
        while (i9 < 15) {
            int i10 = i9 + 1;
            iArr5[i10] = iArr5[i9] + iArr4[i9];
            i9 = i10;
        }
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = iArr2[i11];
            if (i12 != 0) {
                int i13 = iArr5[i12];
                iArr5[i12] = i13 + 1;
                iArr3[i13] = i11;
            }
        }
        int i14 = 1 << i2;
        if (iArr5[15] == 1) {
            for (int i15 = 0; i15 < i14; i15++) {
                iArr[i5 + i15] = iArr3[0];
            }
            return i14;
        }
        int i16 = 0;
        int i17 = 1;
        int i18 = 2;
        while (i17 <= i2) {
            while (iArr4[i17] > 0) {
                cq(iArr, i5 + i16, i18, i14, (i17 << 16) | iArr3[i6]);
                i16 = cp(i16, i17);
                iArr4[i17] = iArr4[i17] - 1;
                i6++;
            }
            i17++;
            i18 += i18;
        }
        int i19 = i14 - 1;
        int i20 = i5;
        int i21 = i16;
        int i22 = i2 + 1;
        int i23 = 2;
        int i24 = -1;
        int i25 = i6;
        int i26 = i14;
        while (i22 <= 15) {
            int i27 = i24;
            while (iArr4[i22] > 0) {
                int i28 = i21 & i19;
                if (i28 != i27) {
                    i20 += i26;
                    int i29 = i4 << (i22 - i2);
                    int i30 = i22;
                    while (i30 < 15) {
                        int i31 = i29 - iArr4[i30];
                        if (i31 <= 0) {
                            break;
                        }
                        i30++;
                        i29 = i31 + i31;
                    }
                    int i32 = i30 - i2;
                    i26 = i4 << i32;
                    i14 += i26;
                    iArr[i5 + i28] = ((i32 + i2) << 16) | ((i20 - i5) - i28);
                    i27 = i28;
                }
                cq(iArr, i20 + (i21 >> i2), i23, i26, ((i22 - i2) << 16) | iArr3[i25]);
                i21 = cp(i21, i22);
                iArr4[i22] = iArr4[i22] - 1;
                i25++;
                i4 = 1;
            }
            i22++;
            i23 += i23;
            i24 = i27;
            i4 = 1;
        }
        return i14;
    }

    public amyt a() {
        return amys.a;
    }

    public anam b() {
        return anam.b;
    }

    public void c(String str, Level level, boolean z) {
    }

    public String g() {
        throw null;
    }

    public byte[] h() {
        throw null;
    }

    public void k(int i) {
        throw null;
    }
}
