package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ury {
    private static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture");
    private static amnv b = amkq.x(gzp.h);
    private final azrw c;
    private final Context d;

    public ury(azrw azrwVar, Context context) {
        this.c = azrwVar;
        this.d = context;
    }

    public static /* synthetic */ ammv a() {
        try {
            return ammv.j(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", '^', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
            return amlr.a;
        } catch (NoSuchMethodException e2) {
            ((amxh) ((amxh) ((amxh) a.c()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", '\\', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) not found");
            return amlr.a;
        } catch (Exception e3) {
            e = e3;
            ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", '^', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
            return amlr.a;
        }
    }

    private static int c(Debug.MemoryInfo memoryInfo) {
        Method method = (Method) ((ammv) b.get()).f();
        if (method == null) {
            return -1;
        }
        try {
            return ((Integer) method.invoke(memoryInfo, 14)).intValue();
        } catch (Error | Exception e) {
            b = gzp.i;
            ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getOtherGraphicsPss", 'w', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) invocation failure");
            return -1;
        }
    }

    private static Integer d(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    private static Long e(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            String group = matcher.group(1);
            amkq.u(group);
            return Long.valueOf(Long.parseLong(group));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final babm b(int i, int i2, String str, String str2) {
        ActivityManager.MemoryInfo memoryInfo;
        url urlVar = (url) this.c.get();
        uqq.i();
        urx urxVar = null;
        Debug.MemoryInfo memoryInfo2 = urlVar.d ? uon.a(this.d).getProcessMemoryInfo(new int[]{i2})[0] : null;
        if (urlVar.e) {
            ActivityManager.MemoryInfo memoryInfo3 = new ActivityManager.MemoryInfo();
            uon.a(this.d).getMemoryInfo(memoryInfo3);
            memoryInfo = memoryInfo3;
        } else {
            memoryInfo = null;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                String g = anaf.w(new File("/proc/self/status"), Charset.defaultCharset()).g();
                if (g.isEmpty()) {
                    ((amxh) ((amxh) a.f()).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 220, "MemoryUsageCapture.java")).q("Null or empty proc status");
                } else {
                    urx urxVar2 = new urx();
                    urxVar2.f = e(urx.a, g);
                    urxVar2.g = e(urx.b, g);
                    urxVar2.h = e(urx.c, g);
                    urxVar2.i = e(urx.d, g);
                    urxVar2.j = e(urx.e, g);
                    urxVar = urxVar2;
                }
            } catch (IOException e) {
                ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getProcStatus", (char) 249, "MemoryUsageCapture.java")).q("Error reading proc status");
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            aong aongVar = (aong) babm.a.createBuilder();
            aone createBuilder = babl.a.createBuilder();
            aone createBuilder2 = babj.a.createBuilder();
            if (memoryInfo2 != null) {
                int i3 = memoryInfo2.dalvikPss;
                createBuilder2.copyOnWrite();
                babj babjVar = (babj) createBuilder2.instance;
                babjVar.b |= 1;
                babjVar.c = i3;
                int i4 = memoryInfo2.nativePss;
                createBuilder2.copyOnWrite();
                babj babjVar2 = (babj) createBuilder2.instance;
                babjVar2.b |= 2;
                babjVar2.d = i4;
                int i5 = memoryInfo2.otherPss;
                createBuilder2.copyOnWrite();
                babj babjVar3 = (babj) createBuilder2.instance;
                babjVar3.b |= 4;
                babjVar3.e = i5;
                int i6 = memoryInfo2.dalvikPrivateDirty;
                createBuilder2.copyOnWrite();
                babj babjVar4 = (babj) createBuilder2.instance;
                babjVar4.b |= 8;
                babjVar4.f = i6;
                int i7 = memoryInfo2.nativePrivateDirty;
                createBuilder2.copyOnWrite();
                babj babjVar5 = (babj) createBuilder2.instance;
                babjVar5.b |= 16;
                babjVar5.g = i7;
                int i8 = memoryInfo2.otherPrivateDirty;
                createBuilder2.copyOnWrite();
                babj babjVar6 = (babj) createBuilder2.instance;
                babjVar6.b |= 32;
                babjVar6.h = i8;
                int totalPss = memoryInfo2.getTotalPss();
                createBuilder2.copyOnWrite();
                babj babjVar7 = (babj) createBuilder2.instance;
                babjVar7.b |= 64;
                babjVar7.i = totalPss;
                int totalPrivateClean = memoryInfo2.getTotalPrivateClean();
                createBuilder2.copyOnWrite();
                babj babjVar8 = (babj) createBuilder2.instance;
                babjVar8.b |= 128;
                babjVar8.j = totalPrivateClean;
                int totalSwappablePss = memoryInfo2.getTotalSwappablePss();
                createBuilder2.copyOnWrite();
                babj babjVar9 = (babj) createBuilder2.instance;
                babjVar9.b |= 512;
                babjVar9.l = totalSwappablePss;
                int totalSharedDirty = memoryInfo2.getTotalSharedDirty();
                createBuilder2.copyOnWrite();
                babj babjVar10 = (babj) createBuilder2.instance;
                babjVar10.b |= 256;
                babjVar10.k = totalSharedDirty;
                int c = c(memoryInfo2);
                if (c != -1) {
                    createBuilder2.copyOnWrite();
                    babj babjVar11 = (babj) createBuilder2.instance;
                    babjVar11.b |= 1024;
                    babjVar11.m = c;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        Map<String, String> memoryStats = memoryInfo2.getMemoryStats();
                        Integer d = d(memoryStats.get("summary.code"));
                        if (d != null) {
                            int intValue = d.intValue();
                            createBuilder2.copyOnWrite();
                            babj babjVar12 = (babj) createBuilder2.instance;
                            babjVar12.b |= 4096;
                            babjVar12.o = intValue;
                        }
                        Integer d2 = d(memoryStats.get("summary.stack"));
                        if (d2 != null) {
                            int intValue2 = d2.intValue();
                            createBuilder2.copyOnWrite();
                            babj babjVar13 = (babj) createBuilder2.instance;
                            babjVar13.b |= 8192;
                            babjVar13.p = intValue2;
                        }
                        Integer d3 = d(memoryStats.get("summary.graphics"));
                        if (d3 != null) {
                            int intValue3 = d3.intValue();
                            createBuilder2.copyOnWrite();
                            babj babjVar14 = (babj) createBuilder2.instance;
                            babjVar14.b |= 16384;
                            babjVar14.q = intValue3;
                        }
                        Integer d4 = d(memoryStats.get("summary.system"));
                        if (d4 != null) {
                            int intValue4 = d4.intValue();
                            createBuilder2.copyOnWrite();
                            babj babjVar15 = (babj) createBuilder2.instance;
                            babjVar15.b |= 65536;
                            babjVar15.s = intValue4;
                        }
                        Integer d5 = d(memoryStats.get("summary.java-heap"));
                        if (d5 != null) {
                            int intValue5 = d5.intValue();
                            createBuilder2.copyOnWrite();
                            babj babjVar16 = (babj) createBuilder2.instance;
                            babjVar16.b |= 2048;
                            babjVar16.n = intValue5;
                        }
                        Integer d6 = d(memoryStats.get("summary.private-other"));
                        if (d6 != null) {
                            int intValue6 = d6.intValue();
                            createBuilder2.copyOnWrite();
                            babj babjVar17 = (babj) createBuilder2.instance;
                            babjVar17.b |= 32768;
                            babjVar17.r = intValue6;
                        }
                    } catch (NumberFormatException e2) {
                        ((amxh) ((amxh) ((amxh) a.f()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "addDebugInfoToMemoryStats", (char) 326, "MemoryUsageCapture.java")).q("failed to collect memory summary stats");
                    }
                }
            }
            if (memoryInfo != null) {
                long j = memoryInfo.availMem;
                createBuilder2.copyOnWrite();
                babj babjVar18 = (babj) createBuilder2.instance;
                babjVar18.b |= 131072;
                babjVar18.t = (int) (j >> 10);
                long j2 = memoryInfo.totalMem;
                createBuilder2.copyOnWrite();
                babj babjVar19 = (babj) createBuilder2.instance;
                babjVar19.b |= 262144;
                babjVar19.u = (int) (j2 >> 20);
            }
            if (urxVar != null) {
                Long l = urxVar.f;
                if (l != null) {
                    long longValue = l.longValue();
                    createBuilder2.copyOnWrite();
                    babj babjVar20 = (babj) createBuilder2.instance;
                    babjVar20.b |= 524288;
                    babjVar20.v = longValue;
                }
                Long l2 = urxVar.g;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    createBuilder2.copyOnWrite();
                    babj babjVar21 = (babj) createBuilder2.instance;
                    babjVar21.b |= 1048576;
                    babjVar21.w = longValue2;
                }
                Long l3 = urxVar.h;
                if (l3 != null) {
                    long longValue3 = l3.longValue();
                    createBuilder2.copyOnWrite();
                    babj babjVar22 = (babj) createBuilder2.instance;
                    babjVar22.b |= 2097152;
                    babjVar22.x = longValue3;
                }
                Long l4 = urxVar.i;
                if (l4 != null) {
                    long longValue4 = l4.longValue();
                    createBuilder2.copyOnWrite();
                    babj babjVar23 = (babj) createBuilder2.instance;
                    babjVar23.b |= 4194304;
                    babjVar23.y = longValue4;
                }
                Long l5 = urxVar.j;
                if (l5 != null) {
                    long longValue5 = l5.longValue();
                    createBuilder2.copyOnWrite();
                    babj babjVar24 = (babj) createBuilder2.instance;
                    babjVar24.b |= 8388608;
                    babjVar24.z = longValue5;
                }
            }
            babj babjVar25 = (babj) createBuilder2.build();
            createBuilder.copyOnWrite();
            babl bablVar = (babl) createBuilder.instance;
            babjVar25.getClass();
            bablVar.c = babjVar25;
            bablVar.b |= 1;
            aongVar.copyOnWrite();
            babm babmVar = (babm) aongVar.instance;
            babl bablVar2 = (babl) createBuilder.build();
            bablVar2.getClass();
            babmVar.c = bablVar2;
            babmVar.b |= 1;
            aone createBuilder3 = bacd.a.createBuilder();
            bacc t = uou.t(str, this.d);
            createBuilder3.copyOnWrite();
            bacd bacdVar = (bacd) createBuilder3.instance;
            t.getClass();
            bacdVar.c = t;
            bacdVar.b |= 1;
            aongVar.copyOnWrite();
            babm babmVar2 = (babm) aongVar.instance;
            bacd bacdVar2 = (bacd) createBuilder3.build();
            bacdVar2.getClass();
            babmVar2.d = bacdVar2;
            babmVar2.b |= 2;
            aone createBuilder4 = babk.a.createBuilder();
            boolean d7 = uon.d(this.d);
            createBuilder4.copyOnWrite();
            babk babkVar = (babk) createBuilder4.instance;
            babkVar.b = 1 | babkVar.b;
            babkVar.c = d7;
            aongVar.copyOnWrite();
            babm babmVar3 = (babm) aongVar.instance;
            babk babkVar2 = (babk) createBuilder4.build();
            babkVar2.getClass();
            babmVar3.f = babkVar2;
            babmVar3.b |= 8;
            aongVar.copyOnWrite();
            babm babmVar4 = (babm) aongVar.instance;
            babmVar4.e = i - 1;
            babmVar4.b |= 4;
            if (str2 != null) {
                aongVar.copyOnWrite();
                babm babmVar5 = (babm) aongVar.instance;
                babmVar5.b |= 16;
                babmVar5.g = str2;
            }
            return (babm) aongVar.build();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
