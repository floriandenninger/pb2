package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class uou {
    public uou() {
    }

    public uou(byte[] bArr) {
    }

    public static int A(int i) {
        if (i == 0) {
            throw null;
        }
        if (i == 32) {
            return 0;
        }
        if (i != 48) {
            return i != 120 ? 2 : 3;
        }
        return 1;
    }

    public static long e(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List f(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimers(i)) {
            return Collections.emptyList();
        }
        return upe.a.d(healthStats.getTimers(i));
    }

    public static Map g(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.emptyMap() : healthStats.getStats(i);
    }

    public static baaz h(String str) {
        aone createBuilder = baaz.a.createBuilder();
        createBuilder.copyOnWrite();
        baaz baazVar = (baaz) createBuilder.instance;
        baazVar.b |= 2;
        baazVar.d = str;
        return (baaz) createBuilder.build();
    }

    public static babe i(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return k(null, healthStats.getTimer(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static babe j(babe babeVar, babe babeVar2) {
        if (babeVar == null || babeVar2 == null) {
            return babeVar;
        }
        int i = babeVar.c - babeVar2.c;
        long j = babeVar.d - babeVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        aone createBuilder = babe.a.createBuilder();
        baaz baazVar = babeVar.e;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        createBuilder.copyOnWrite();
        babe babeVar3 = (babe) createBuilder.instance;
        baazVar.getClass();
        babeVar3.e = baazVar;
        babeVar3.b |= 4;
        createBuilder.copyOnWrite();
        babe babeVar4 = (babe) createBuilder.instance;
        babeVar4.b |= 1;
        babeVar4.c = i;
        createBuilder.copyOnWrite();
        babe babeVar5 = (babe) createBuilder.instance;
        babeVar5.b |= 2;
        babeVar5.d = j;
        return (babe) createBuilder.build();
    }

    public static babe k(String str, TimerStat timerStat) {
        aone createBuilder = babe.a.createBuilder();
        int count = timerStat.getCount();
        createBuilder.copyOnWrite();
        babe babeVar = (babe) createBuilder.instance;
        babeVar.b |= 1;
        babeVar.c = count;
        long time = timerStat.getTime();
        createBuilder.copyOnWrite();
        babe babeVar2 = (babe) createBuilder.instance;
        babeVar2.b |= 2;
        babeVar2.d = time;
        if (babeVar2.c < 0) {
            createBuilder.copyOnWrite();
            babe babeVar3 = (babe) createBuilder.instance;
            babeVar3.b |= 1;
            babeVar3.c = 0;
        }
        if (str != null) {
            baaz h = h(str);
            createBuilder.copyOnWrite();
            babe babeVar4 = (babe) createBuilder.instance;
            h.getClass();
            babeVar4.e = h;
            babeVar4.b |= 4;
        }
        babe babeVar5 = (babe) createBuilder.instance;
        if (babeVar5.c == 0 && babeVar5.d == 0) {
            return null;
        }
        return (babe) createBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static babf l(babf babfVar, babf babfVar2) {
        babe babeVar;
        babe babeVar2;
        babe babeVar3;
        babe babeVar4;
        babe babeVar5;
        babe babeVar6;
        babe babeVar7;
        babe babeVar8;
        babe babeVar9;
        babe babeVar10;
        babe babeVar11;
        babe babeVar12;
        babe babeVar13;
        babe babeVar14;
        babe babeVar15;
        babe babeVar16;
        babe babeVar17;
        babe babeVar18;
        babe babeVar19;
        babe babeVar20;
        babe babeVar21;
        babe babeVar22;
        babe babeVar23;
        babe babeVar24;
        babe babeVar25;
        babe babeVar26;
        babe babeVar27;
        babe babeVar28;
        babe babeVar29;
        babe babeVar30;
        babe babeVar31;
        babe babeVar32;
        if (babfVar != null && babfVar2 != null) {
            aone createBuilder = babf.a.createBuilder();
            if ((babfVar.b & 1) != 0) {
                long j = babfVar.d - babfVar2.d;
                if (j != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar3 = (babf) createBuilder.instance;
                    babfVar3.b |= 1;
                    babfVar3.d = j;
                }
            }
            if ((babfVar.b & 2) != 0) {
                long j2 = babfVar.e - babfVar2.e;
                if (j2 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar4 = (babf) createBuilder.instance;
                    babfVar4.b |= 2;
                    babfVar4.e = j2;
                }
            }
            if ((babfVar.b & 4) != 0) {
                long j3 = babfVar.f - babfVar2.f;
                if (j3 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar5 = (babf) createBuilder.instance;
                    babfVar5.b |= 4;
                    babfVar5.f = j3;
                }
            }
            if ((babfVar.b & 8) != 0) {
                long j4 = babfVar.g - babfVar2.g;
                if (j4 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar6 = (babf) createBuilder.instance;
                    babfVar6.b |= 8;
                    babfVar6.g = j4;
                }
            }
            createBuilder.bU(upe.a.e(babfVar.h, babfVar2.h));
            createBuilder.bV(upe.a.e(babfVar.i, babfVar2.i));
            createBuilder.bW(upe.a.e(babfVar.j, babfVar2.j));
            createBuilder.bT(upe.a.e(babfVar.k, babfVar2.k));
            createBuilder.bS(upe.a.e(babfVar.l, babfVar2.l));
            createBuilder.bO(upe.a.e(babfVar.m, babfVar2.m));
            if ((babfVar.b & 16) != 0) {
                babeVar = babfVar.n;
                if (babeVar == null) {
                    babeVar = babe.a;
                }
            } else {
                babeVar = null;
            }
            if ((babfVar2.b & 16) != 0) {
                babeVar2 = babfVar2.n;
                if (babeVar2 == null) {
                    babeVar2 = babe.a;
                }
            } else {
                babeVar2 = null;
            }
            babe j5 = j(babeVar, babeVar2);
            if (j5 != null) {
                createBuilder.copyOnWrite();
                babf babfVar7 = (babf) createBuilder.instance;
                babfVar7.n = j5;
                babfVar7.b |= 16;
            }
            createBuilder.bP(upe.a.e(babfVar.o, babfVar2.o));
            createBuilder.bR(upb.a.e(babfVar.q, babfVar2.q));
            createBuilder.bQ(upa.a.e(babfVar.r, babfVar2.r));
            if ((babfVar.b & 32) != 0) {
                long j6 = babfVar.s - babfVar2.s;
                if (j6 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar8 = (babf) createBuilder.instance;
                    babfVar8.b |= 32;
                    babfVar8.s = j6;
                }
            }
            if ((babfVar.b & 64) != 0) {
                long j7 = babfVar.t - babfVar2.t;
                if (j7 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar9 = (babf) createBuilder.instance;
                    babfVar9.b |= 64;
                    babfVar9.t = j7;
                }
            }
            if ((babfVar.b & 128) != 0) {
                long j8 = babfVar.u - babfVar2.u;
                if (j8 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar10 = (babf) createBuilder.instance;
                    babfVar10.b |= 128;
                    babfVar10.u = j8;
                }
            }
            if ((babfVar.b & 256) != 0) {
                long j9 = babfVar.v - babfVar2.v;
                if (j9 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar11 = (babf) createBuilder.instance;
                    babfVar11.b |= 256;
                    babfVar11.v = j9;
                }
            }
            if ((babfVar.b & 512) != 0) {
                long j10 = babfVar.w - babfVar2.w;
                if (j10 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar12 = (babf) createBuilder.instance;
                    babfVar12.b |= 512;
                    babfVar12.w = j10;
                }
            }
            if ((babfVar.b & 1024) != 0) {
                long j11 = babfVar.x - babfVar2.x;
                if (j11 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar13 = (babf) createBuilder.instance;
                    babfVar13.b |= 1024;
                    babfVar13.x = j11;
                }
            }
            if ((babfVar.b & 2048) != 0) {
                long j12 = babfVar.y - babfVar2.y;
                if (j12 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar14 = (babf) createBuilder.instance;
                    babfVar14.b |= 2048;
                    babfVar14.y = j12;
                }
            }
            if ((babfVar.b & 4096) != 0) {
                long j13 = babfVar.z - babfVar2.z;
                if (j13 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar15 = (babf) createBuilder.instance;
                    babfVar15.b |= 4096;
                    babfVar15.z = j13;
                }
            }
            if ((babfVar.b & 8192) != 0) {
                long j14 = babfVar.A - babfVar2.A;
                if (j14 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar16 = (babf) createBuilder.instance;
                    babfVar16.b |= 8192;
                    babfVar16.A = j14;
                }
            }
            if ((babfVar.b & 16384) != 0) {
                long j15 = babfVar.B - babfVar2.B;
                if (j15 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar17 = (babf) createBuilder.instance;
                    babfVar17.b |= 16384;
                    babfVar17.B = j15;
                }
            }
            if ((babfVar.b & 32768) != 0) {
                long j16 = babfVar.C - babfVar2.C;
                if (j16 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar18 = (babf) createBuilder.instance;
                    babfVar18.b |= 32768;
                    babfVar18.C = j16;
                }
            }
            if ((babfVar.b & 65536) != 0) {
                long j17 = babfVar.D - babfVar2.D;
                if (j17 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar19 = (babf) createBuilder.instance;
                    babfVar19.b |= 65536;
                    babfVar19.D = j17;
                }
            }
            if ((babfVar.b & 131072) != 0) {
                long j18 = babfVar.E - babfVar2.E;
                if (j18 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar20 = (babf) createBuilder.instance;
                    babfVar20.b |= 131072;
                    babfVar20.E = j18;
                }
            }
            if ((babfVar.b & 262144) != 0) {
                long j19 = babfVar.F - babfVar2.F;
                if (j19 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar21 = (babf) createBuilder.instance;
                    babfVar21.b |= 262144;
                    babfVar21.F = j19;
                }
            }
            if ((babfVar.b & 524288) != 0) {
                babeVar3 = babfVar.G;
                if (babeVar3 == null) {
                    babeVar3 = babe.a;
                }
            } else {
                babeVar3 = null;
            }
            if ((babfVar2.b & 524288) != 0) {
                babeVar4 = babfVar2.G;
                if (babeVar4 == null) {
                    babeVar4 = babe.a;
                }
            } else {
                babeVar4 = null;
            }
            babe j20 = j(babeVar3, babeVar4);
            if (j20 != null) {
                createBuilder.copyOnWrite();
                babf babfVar22 = (babf) createBuilder.instance;
                babfVar22.G = j20;
                babfVar22.b |= 524288;
            }
            if ((babfVar.b & 1048576) != 0) {
                long j21 = babfVar.H - babfVar2.H;
                if (j21 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar23 = (babf) createBuilder.instance;
                    babfVar23.b |= 1048576;
                    babfVar23.H = j21;
                }
            }
            if ((babfVar.b & 2097152) != 0) {
                babeVar5 = babfVar.I;
                if (babeVar5 == null) {
                    babeVar5 = babe.a;
                }
            } else {
                babeVar5 = null;
            }
            if ((babfVar2.b & 2097152) != 0) {
                babeVar6 = babfVar2.I;
                if (babeVar6 == null) {
                    babeVar6 = babe.a;
                }
            } else {
                babeVar6 = null;
            }
            babe j22 = j(babeVar5, babeVar6);
            if (j22 != null) {
                createBuilder.copyOnWrite();
                babf babfVar24 = (babf) createBuilder.instance;
                babfVar24.I = j22;
                babfVar24.b |= 2097152;
            }
            if ((babfVar.b & 4194304) != 0) {
                babeVar7 = babfVar.f142J;
                if (babeVar7 == null) {
                    babeVar7 = babe.a;
                }
            } else {
                babeVar7 = null;
            }
            if ((babfVar2.b & 4194304) != 0) {
                babeVar8 = babfVar2.f142J;
                if (babeVar8 == null) {
                    babeVar8 = babe.a;
                }
            } else {
                babeVar8 = null;
            }
            babe j23 = j(babeVar7, babeVar8);
            if (j23 != null) {
                createBuilder.copyOnWrite();
                babf babfVar25 = (babf) createBuilder.instance;
                babfVar25.f142J = j23;
                babfVar25.b |= 4194304;
            }
            if ((babfVar.b & 8388608) != 0) {
                babeVar9 = babfVar.K;
                if (babeVar9 == null) {
                    babeVar9 = babe.a;
                }
            } else {
                babeVar9 = null;
            }
            if ((babfVar2.b & 8388608) != 0) {
                babeVar10 = babfVar2.K;
                if (babeVar10 == null) {
                    babeVar10 = babe.a;
                }
            } else {
                babeVar10 = null;
            }
            babe j24 = j(babeVar9, babeVar10);
            if (j24 != null) {
                createBuilder.copyOnWrite();
                babf babfVar26 = (babf) createBuilder.instance;
                babfVar26.K = j24;
                babfVar26.b |= 8388608;
            }
            if ((babfVar.b & 16777216) != 0) {
                babeVar11 = babfVar.L;
                if (babeVar11 == null) {
                    babeVar11 = babe.a;
                }
            } else {
                babeVar11 = null;
            }
            if ((babfVar2.b & 16777216) != 0) {
                babeVar12 = babfVar2.L;
                if (babeVar12 == null) {
                    babeVar12 = babe.a;
                }
            } else {
                babeVar12 = null;
            }
            babe j25 = j(babeVar11, babeVar12);
            if (j25 != null) {
                createBuilder.copyOnWrite();
                babf babfVar27 = (babf) createBuilder.instance;
                babfVar27.L = j25;
                babfVar27.b |= 16777216;
            }
            if ((babfVar.b & 33554432) != 0) {
                babeVar13 = babfVar.M;
                if (babeVar13 == null) {
                    babeVar13 = babe.a;
                }
            } else {
                babeVar13 = null;
            }
            if ((babfVar2.b & 33554432) != 0) {
                babeVar14 = babfVar2.M;
                if (babeVar14 == null) {
                    babeVar14 = babe.a;
                }
            } else {
                babeVar14 = null;
            }
            babe j26 = j(babeVar13, babeVar14);
            if (j26 != null) {
                createBuilder.copyOnWrite();
                babf babfVar28 = (babf) createBuilder.instance;
                babfVar28.M = j26;
                babfVar28.b |= 33554432;
            }
            if ((babfVar.b & 67108864) != 0) {
                babeVar15 = babfVar.N;
                if (babeVar15 == null) {
                    babeVar15 = babe.a;
                }
            } else {
                babeVar15 = null;
            }
            if ((babfVar2.b & 67108864) != 0) {
                babeVar16 = babfVar2.N;
                if (babeVar16 == null) {
                    babeVar16 = babe.a;
                }
            } else {
                babeVar16 = null;
            }
            babe j27 = j(babeVar15, babeVar16);
            if (j27 != null) {
                createBuilder.copyOnWrite();
                babf babfVar29 = (babf) createBuilder.instance;
                babfVar29.N = j27;
                babfVar29.b |= 67108864;
            }
            if ((babfVar.b & 134217728) != 0) {
                babeVar17 = babfVar.O;
                if (babeVar17 == null) {
                    babeVar17 = babe.a;
                }
            } else {
                babeVar17 = null;
            }
            if ((babfVar2.b & 134217728) != 0) {
                babeVar18 = babfVar2.O;
                if (babeVar18 == null) {
                    babeVar18 = babe.a;
                }
            } else {
                babeVar18 = null;
            }
            babe j28 = j(babeVar17, babeVar18);
            if (j28 != null) {
                createBuilder.copyOnWrite();
                babf babfVar30 = (babf) createBuilder.instance;
                babfVar30.O = j28;
                babfVar30.b |= 134217728;
            }
            if ((babfVar.b & 268435456) != 0) {
                babeVar19 = babfVar.P;
                if (babeVar19 == null) {
                    babeVar19 = babe.a;
                }
            } else {
                babeVar19 = null;
            }
            if ((babfVar2.b & 268435456) != 0) {
                babeVar20 = babfVar2.P;
                if (babeVar20 == null) {
                    babeVar20 = babe.a;
                }
            } else {
                babeVar20 = null;
            }
            babe j29 = j(babeVar19, babeVar20);
            if (j29 != null) {
                createBuilder.copyOnWrite();
                babf babfVar31 = (babf) createBuilder.instance;
                babfVar31.P = j29;
                babfVar31.b |= 268435456;
            }
            if ((babfVar.b & 536870912) != 0) {
                babeVar21 = babfVar.Q;
                if (babeVar21 == null) {
                    babeVar21 = babe.a;
                }
            } else {
                babeVar21 = null;
            }
            if ((babfVar2.b & 536870912) != 0) {
                babeVar22 = babfVar2.Q;
                if (babeVar22 == null) {
                    babeVar22 = babe.a;
                }
            } else {
                babeVar22 = null;
            }
            babe j30 = j(babeVar21, babeVar22);
            if (j30 != null) {
                createBuilder.copyOnWrite();
                babf babfVar32 = (babf) createBuilder.instance;
                babfVar32.Q = j30;
                babfVar32.b |= 536870912;
            }
            if ((babfVar.b & 1073741824) != 0) {
                babeVar23 = babfVar.R;
                if (babeVar23 == null) {
                    babeVar23 = babe.a;
                }
            } else {
                babeVar23 = null;
            }
            if ((babfVar2.b & 1073741824) != 0) {
                babeVar24 = babfVar2.R;
                if (babeVar24 == null) {
                    babeVar24 = babe.a;
                }
            } else {
                babeVar24 = null;
            }
            babe j31 = j(babeVar23, babeVar24);
            if (j31 != null) {
                createBuilder.copyOnWrite();
                babf babfVar33 = (babf) createBuilder.instance;
                babfVar33.R = j31;
                babfVar33.b |= 1073741824;
            }
            if ((babfVar.b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                babeVar25 = babfVar.S;
                if (babeVar25 == null) {
                    babeVar25 = babe.a;
                }
            } else {
                babeVar25 = null;
            }
            if ((babfVar2.b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                babeVar26 = babfVar2.S;
                if (babeVar26 == null) {
                    babeVar26 = babe.a;
                }
            } else {
                babeVar26 = null;
            }
            babe j32 = j(babeVar25, babeVar26);
            if (j32 != null) {
                createBuilder.copyOnWrite();
                babf babfVar34 = (babf) createBuilder.instance;
                babfVar34.S = j32;
                babfVar34.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            if ((babfVar.c & 1) != 0) {
                babeVar27 = babfVar.T;
                if (babeVar27 == null) {
                    babeVar27 = babe.a;
                }
            } else {
                babeVar27 = null;
            }
            if ((babfVar2.c & 1) != 0) {
                babeVar28 = babfVar2.T;
                if (babeVar28 == null) {
                    babeVar28 = babe.a;
                }
            } else {
                babeVar28 = null;
            }
            babe j33 = j(babeVar27, babeVar28);
            if (j33 != null) {
                createBuilder.copyOnWrite();
                babf babfVar35 = (babf) createBuilder.instance;
                babfVar35.T = j33;
                babfVar35.c |= 1;
            }
            if ((babfVar.c & 2) != 0) {
                babeVar29 = babfVar.U;
                if (babeVar29 == null) {
                    babeVar29 = babe.a;
                }
            } else {
                babeVar29 = null;
            }
            if ((babfVar2.c & 2) != 0) {
                babeVar30 = babfVar2.U;
                if (babeVar30 == null) {
                    babeVar30 = babe.a;
                }
            } else {
                babeVar30 = null;
            }
            babe j34 = j(babeVar29, babeVar30);
            if (j34 != null) {
                createBuilder.copyOnWrite();
                babf babfVar36 = (babf) createBuilder.instance;
                babfVar36.U = j34;
                babfVar36.c |= 2;
            }
            if ((babfVar.c & 4) != 0) {
                long j35 = babfVar.V - babfVar2.V;
                if (j35 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar37 = (babf) createBuilder.instance;
                    babfVar37.c |= 4;
                    babfVar37.V = j35;
                }
            }
            if ((babfVar.c & 8) != 0) {
                long j36 = babfVar.W - babfVar2.W;
                if (j36 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar38 = (babf) createBuilder.instance;
                    babfVar38.c |= 8;
                    babfVar38.W = j36;
                }
            }
            if ((babfVar.c & 16) != 0) {
                long j37 = babfVar.X - babfVar2.X;
                if (j37 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar39 = (babf) createBuilder.instance;
                    babfVar39.c |= 16;
                    babfVar39.X = j37;
                }
            }
            if ((babfVar.c & 32) != 0) {
                long j38 = babfVar.Y - babfVar2.Y;
                if (j38 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar40 = (babf) createBuilder.instance;
                    babfVar40.c |= 32;
                    babfVar40.Y = j38;
                }
            }
            if ((babfVar.c & 64) != 0) {
                long j39 = babfVar.Z - babfVar2.Z;
                if (j39 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar41 = (babf) createBuilder.instance;
                    babfVar41.c |= 64;
                    babfVar41.Z = j39;
                }
            }
            if ((babfVar.c & 128) != 0) {
                long j40 = babfVar.aa - babfVar2.aa;
                if (j40 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar42 = (babf) createBuilder.instance;
                    babfVar42.c |= 128;
                    babfVar42.aa = j40;
                }
            }
            if ((babfVar.c & 256) != 0) {
                long j41 = babfVar.ab - babfVar2.ab;
                if (j41 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar43 = (babf) createBuilder.instance;
                    babfVar43.c |= 256;
                    babfVar43.ab = j41;
                }
            }
            if ((babfVar.c & 512) != 0) {
                long j42 = babfVar.ac - babfVar2.ac;
                if (j42 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar44 = (babf) createBuilder.instance;
                    babfVar44.c |= 512;
                    babfVar44.ac = j42;
                }
            }
            if ((babfVar.c & 1024) != 0) {
                long j43 = babfVar.ad - babfVar2.ad;
                if (j43 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar45 = (babf) createBuilder.instance;
                    babfVar45.c |= 1024;
                    babfVar45.ad = j43;
                }
            }
            if ((babfVar.c & 2048) != 0) {
                long j44 = babfVar.ae - babfVar2.ae;
                if (j44 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar46 = (babf) createBuilder.instance;
                    babfVar46.c |= 2048;
                    babfVar46.ae = j44;
                }
            }
            if ((babfVar.c & 4096) != 0) {
                long j45 = babfVar.af - babfVar2.af;
                if (j45 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar47 = (babf) createBuilder.instance;
                    babfVar47.c |= 4096;
                    babfVar47.af = j45;
                }
            }
            if ((babfVar.c & 8192) != 0) {
                long j46 = babfVar.ag - babfVar2.ag;
                if (j46 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar48 = (babf) createBuilder.instance;
                    babfVar48.c |= 8192;
                    babfVar48.ag = j46;
                }
            }
            if ((babfVar.c & 16384) != 0) {
                long j47 = babfVar.ah - babfVar2.ah;
                if (j47 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar49 = (babf) createBuilder.instance;
                    babfVar49.c |= 16384;
                    babfVar49.ah = j47;
                }
            }
            if ((babfVar.c & 32768) != 0) {
                long j48 = babfVar.ai - babfVar2.ai;
                if (j48 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar50 = (babf) createBuilder.instance;
                    babfVar50.c = 32768 | babfVar50.c;
                    babfVar50.ai = j48;
                }
            }
            if ((babfVar.c & 65536) != 0) {
                long j49 = babfVar.aj - babfVar2.aj;
                if (j49 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar51 = (babf) createBuilder.instance;
                    babfVar51.c |= 65536;
                    babfVar51.aj = j49;
                }
            }
            if ((babfVar.c & 131072) != 0) {
                babeVar31 = babfVar.ak;
                if (babeVar31 == null) {
                    babeVar31 = babe.a;
                }
            } else {
                babeVar31 = null;
            }
            if ((babfVar2.c & 131072) != 0) {
                babeVar32 = babfVar2.ak;
                if (babeVar32 == null) {
                    babeVar32 = babe.a;
                }
            } else {
                babeVar32 = null;
            }
            babe j50 = j(babeVar31, babeVar32);
            if (j50 != null) {
                createBuilder.copyOnWrite();
                babf babfVar52 = (babf) createBuilder.instance;
                babfVar52.ak = j50;
                babfVar52.c |= 131072;
            }
            if ((babfVar.c & 262144) != 0) {
                long j51 = babfVar.al - babfVar2.al;
                if (j51 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar53 = (babf) createBuilder.instance;
                    babfVar53.c |= 262144;
                    babfVar53.al = j51;
                }
            }
            if ((babfVar.c & 524288) != 0) {
                long j52 = babfVar.am - babfVar2.am;
                if (j52 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar54 = (babf) createBuilder.instance;
                    babfVar54.c |= 524288;
                    babfVar54.am = j52;
                }
            }
            if ((babfVar.c & 1048576) != 0) {
                long j53 = babfVar.an - babfVar2.an;
                if (j53 != 0) {
                    createBuilder.copyOnWrite();
                    babf babfVar55 = (babf) createBuilder.instance;
                    babfVar55.c |= 1048576;
                    babfVar55.an = j53;
                }
            }
            babfVar = (babf) createBuilder.build();
            if (p(babfVar)) {
                return null;
            }
        }
        return babfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(baba babaVar) {
        return babaVar == null || (babaVar.c.size() == 0 && babaVar.d.size() == 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean n(babc babcVar) {
        if (babcVar != null) {
            return babcVar.c <= 0 && babcVar.d <= 0 && babcVar.e <= 0 && babcVar.f <= 0 && babcVar.g <= 0 && babcVar.h <= 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean o(babd babdVar) {
        return babdVar == null || (((long) babdVar.c) <= 0 && ((long) babdVar.d) <= 0);
    }

    static boolean p(babf babfVar) {
        if (babfVar != null) {
            return babfVar.d <= 0 && babfVar.e <= 0 && babfVar.f <= 0 && babfVar.g <= 0 && babfVar.h.size() == 0 && babfVar.i.size() == 0 && babfVar.j.size() == 0 && babfVar.k.size() == 0 && babfVar.l.size() == 0 && babfVar.m.size() == 0 && babfVar.o.size() == 0 && babfVar.p.size() == 0 && babfVar.q.size() == 0 && babfVar.r.size() == 0 && babfVar.s <= 0 && babfVar.t <= 0 && babfVar.u <= 0 && babfVar.v <= 0 && babfVar.w <= 0 && babfVar.x <= 0 && babfVar.y <= 0 && babfVar.z <= 0 && babfVar.A <= 0 && babfVar.B <= 0 && babfVar.C <= 0 && babfVar.D <= 0 && babfVar.E <= 0 && babfVar.F <= 0 && babfVar.H <= 0 && babfVar.V <= 0 && babfVar.W <= 0 && babfVar.X <= 0 && babfVar.Y <= 0 && babfVar.Z <= 0 && babfVar.aa <= 0 && babfVar.ab <= 0 && babfVar.ac <= 0 && babfVar.ad <= 0 && babfVar.ae <= 0 && babfVar.af <= 0 && babfVar.ag <= 0 && babfVar.ah <= 0 && babfVar.ai <= 0 && babfVar.aj <= 0 && babfVar.al <= 0 && babfVar.am <= 0 && babfVar.an <= 0;
        }
        return true;
    }

    public static boolean q() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static upf r(Long l, Long l2, HealthStats healthStats, baav baavVar, uoq uoqVar) {
        uph uphVar = uoqVar.b;
        aone createBuilder = babf.a.createBuilder();
        long e = e(healthStats, 10001);
        if (e != 0) {
            createBuilder.copyOnWrite();
            babf babfVar = (babf) createBuilder.instance;
            babfVar.b |= 1;
            babfVar.d = e;
        }
        long e2 = e(healthStats, 10002);
        if (e2 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar2 = (babf) createBuilder.instance;
            babfVar2.b |= 2;
            babfVar2.e = e2;
        }
        long e3 = e(healthStats, 10003);
        if (e3 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar3 = (babf) createBuilder.instance;
            babfVar3.b |= 4;
            babfVar3.f = e3;
        }
        long e4 = e(healthStats, 10004);
        if (e4 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar4 = (babf) createBuilder.instance;
            babfVar4.b |= 8;
            babfVar4.g = e4;
        }
        createBuilder.bU(f(healthStats, 10005));
        createBuilder.bV(f(healthStats, 10006));
        createBuilder.bW(f(healthStats, 10007));
        createBuilder.bT(f(healthStats, 10008));
        createBuilder.bS(f(healthStats, 10009));
        createBuilder.bO(f(healthStats, 10010));
        babe i = i(healthStats, 10011);
        if (i != null) {
            createBuilder.copyOnWrite();
            babf babfVar5 = (babf) createBuilder.instance;
            babfVar5.n = i;
            babfVar5.b |= 16;
        }
        createBuilder.bP(f(healthStats, 10012));
        createBuilder.bR(upb.a.d(g(healthStats, 10014)));
        createBuilder.bQ(upa.a.d(g(healthStats, 10015)));
        long e5 = e(healthStats, 10016);
        if (e5 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar6 = (babf) createBuilder.instance;
            babfVar6.b |= 32;
            babfVar6.s = e5;
        }
        long e6 = e(healthStats, 10017);
        if (e6 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar7 = (babf) createBuilder.instance;
            babfVar7.b |= 64;
            babfVar7.t = e6;
        }
        long e7 = e(healthStats, 10018);
        if (e7 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar8 = (babf) createBuilder.instance;
            babfVar8.b |= 128;
            babfVar8.u = e7;
        }
        long e8 = e(healthStats, 10019);
        if (e8 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar9 = (babf) createBuilder.instance;
            babfVar9.b |= 256;
            babfVar9.v = e8;
        }
        long e9 = e(healthStats, 10020);
        if (e9 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar10 = (babf) createBuilder.instance;
            babfVar10.b |= 512;
            babfVar10.w = e9;
        }
        long e10 = e(healthStats, 10021);
        if (e10 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar11 = (babf) createBuilder.instance;
            babfVar11.b |= 1024;
            babfVar11.x = e10;
        }
        long e11 = e(healthStats, 10022);
        if (e11 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar12 = (babf) createBuilder.instance;
            babfVar12.b |= 2048;
            babfVar12.y = e11;
        }
        long e12 = e(healthStats, 10023);
        if (e12 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar13 = (babf) createBuilder.instance;
            babfVar13.b |= 4096;
            babfVar13.z = e12;
        }
        long e13 = e(healthStats, 10024);
        if (e13 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar14 = (babf) createBuilder.instance;
            babfVar14.b |= 8192;
            babfVar14.A = e13;
        }
        long e14 = e(healthStats, 10025);
        if (e14 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar15 = (babf) createBuilder.instance;
            babfVar15.b |= 16384;
            babfVar15.B = e14;
        }
        long e15 = e(healthStats, 10026);
        if (e15 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar16 = (babf) createBuilder.instance;
            babfVar16.b |= 32768;
            babfVar16.C = e15;
        }
        long e16 = e(healthStats, 10027);
        if (e16 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar17 = (babf) createBuilder.instance;
            babfVar17.b |= 65536;
            babfVar17.D = e16;
        }
        long e17 = e(healthStats, 10028);
        if (e17 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar18 = (babf) createBuilder.instance;
            babfVar18.b |= 131072;
            babfVar18.E = e17;
        }
        long e18 = e(healthStats, 10029);
        if (e18 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar19 = (babf) createBuilder.instance;
            babfVar19.b |= 262144;
            babfVar19.F = e18;
        }
        babe i2 = i(healthStats, 10030);
        if (i2 != null) {
            createBuilder.copyOnWrite();
            babf babfVar20 = (babf) createBuilder.instance;
            babfVar20.G = i2;
            babfVar20.b |= 524288;
        }
        long e19 = e(healthStats, 10031);
        if (e19 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar21 = (babf) createBuilder.instance;
            babfVar21.b |= 1048576;
            babfVar21.H = e19;
        }
        babe i3 = i(healthStats, 10032);
        if (i3 != null) {
            createBuilder.copyOnWrite();
            babf babfVar22 = (babf) createBuilder.instance;
            babfVar22.I = i3;
            babfVar22.b |= 2097152;
        }
        babe i4 = i(healthStats, 10033);
        if (i4 != null) {
            createBuilder.copyOnWrite();
            babf babfVar23 = (babf) createBuilder.instance;
            babfVar23.f142J = i4;
            babfVar23.b |= 4194304;
        }
        babe i5 = i(healthStats, 10034);
        if (i5 != null) {
            createBuilder.copyOnWrite();
            babf babfVar24 = (babf) createBuilder.instance;
            babfVar24.K = i5;
            babfVar24.b |= 8388608;
        }
        babe i6 = i(healthStats, 10035);
        if (i6 != null) {
            createBuilder.copyOnWrite();
            babf babfVar25 = (babf) createBuilder.instance;
            babfVar25.L = i6;
            babfVar25.b |= 16777216;
        }
        babe i7 = i(healthStats, 10036);
        if (i7 != null) {
            createBuilder.copyOnWrite();
            babf babfVar26 = (babf) createBuilder.instance;
            babfVar26.M = i7;
            babfVar26.b |= 33554432;
        }
        babe i8 = i(healthStats, 10037);
        if (i8 != null) {
            createBuilder.copyOnWrite();
            babf babfVar27 = (babf) createBuilder.instance;
            babfVar27.N = i8;
            babfVar27.b |= 67108864;
        }
        babe i9 = i(healthStats, 10038);
        if (i9 != null) {
            createBuilder.copyOnWrite();
            babf babfVar28 = (babf) createBuilder.instance;
            babfVar28.O = i9;
            babfVar28.b |= 134217728;
        }
        babe i10 = i(healthStats, 10039);
        if (i10 != null) {
            createBuilder.copyOnWrite();
            babf babfVar29 = (babf) createBuilder.instance;
            babfVar29.P = i10;
            babfVar29.b |= 268435456;
        }
        babe i11 = i(healthStats, 10040);
        if (i11 != null) {
            createBuilder.copyOnWrite();
            babf babfVar30 = (babf) createBuilder.instance;
            babfVar30.Q = i11;
            babfVar30.b |= 536870912;
        }
        babe i12 = i(healthStats, 10041);
        if (i12 != null) {
            createBuilder.copyOnWrite();
            babf babfVar31 = (babf) createBuilder.instance;
            babfVar31.R = i12;
            babfVar31.b |= 1073741824;
        }
        babe i13 = i(healthStats, 10042);
        if (i13 != null) {
            createBuilder.copyOnWrite();
            babf babfVar32 = (babf) createBuilder.instance;
            babfVar32.S = i13;
            babfVar32.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        babe i14 = i(healthStats, 10043);
        if (i14 != null) {
            createBuilder.copyOnWrite();
            babf babfVar33 = (babf) createBuilder.instance;
            babfVar33.T = i14;
            babfVar33.c |= 1;
        }
        babe i15 = i(healthStats, 10044);
        if (i15 != null) {
            createBuilder.copyOnWrite();
            babf babfVar34 = (babf) createBuilder.instance;
            babfVar34.U = i15;
            babfVar34.c |= 2;
        }
        long e20 = e(healthStats, 10045);
        if (e20 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar35 = (babf) createBuilder.instance;
            babfVar35.c |= 4;
            babfVar35.V = e20;
        }
        long e21 = e(healthStats, 10046);
        if (e21 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar36 = (babf) createBuilder.instance;
            babfVar36.c |= 8;
            babfVar36.W = e21;
        }
        long e22 = e(healthStats, 10047);
        if (e22 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar37 = (babf) createBuilder.instance;
            babfVar37.c |= 16;
            babfVar37.X = e22;
        }
        long e23 = e(healthStats, 10048);
        if (e23 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar38 = (babf) createBuilder.instance;
            babfVar38.c |= 32;
            babfVar38.Y = e23;
        }
        long e24 = e(healthStats, 10049);
        if (e24 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar39 = (babf) createBuilder.instance;
            babfVar39.c |= 64;
            babfVar39.Z = e24;
        }
        long e25 = e(healthStats, 10050);
        if (e25 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar40 = (babf) createBuilder.instance;
            babfVar40.c |= 128;
            babfVar40.aa = e25;
        }
        long e26 = e(healthStats, 10051);
        if (e26 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar41 = (babf) createBuilder.instance;
            babfVar41.c |= 256;
            babfVar41.ab = e26;
        }
        long e27 = e(healthStats, 10052);
        if (e27 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar42 = (babf) createBuilder.instance;
            babfVar42.c |= 512;
            babfVar42.ac = e27;
        }
        long e28 = e(healthStats, 10053);
        if (e28 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar43 = (babf) createBuilder.instance;
            babfVar43.c |= 1024;
            babfVar43.ad = e28;
        }
        long e29 = e(healthStats, 10054);
        if (e29 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar44 = (babf) createBuilder.instance;
            babfVar44.c |= 2048;
            babfVar44.ae = e29;
        }
        long e30 = e(healthStats, 10055);
        if (e30 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar45 = (babf) createBuilder.instance;
            babfVar45.c |= 4096;
            babfVar45.af = e30;
        }
        long e31 = e(healthStats, 10056);
        if (e31 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar46 = (babf) createBuilder.instance;
            babfVar46.c |= 8192;
            babfVar46.ag = e31;
        }
        long e32 = e(healthStats, 10057);
        if (e32 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar47 = (babf) createBuilder.instance;
            babfVar47.c |= 16384;
            babfVar47.ah = e32;
        }
        long e33 = e(healthStats, 10058);
        if (e33 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar48 = (babf) createBuilder.instance;
            babfVar48.c = 32768 | babfVar48.c;
            babfVar48.ai = e33;
        }
        long e34 = e(healthStats, 10059);
        if (e34 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar49 = (babf) createBuilder.instance;
            babfVar49.c |= 65536;
            babfVar49.aj = e34;
        }
        babe i16 = i(healthStats, 10061);
        if (i16 != null) {
            createBuilder.copyOnWrite();
            babf babfVar50 = (babf) createBuilder.instance;
            babfVar50.ak = i16;
            babfVar50.c |= 131072;
        }
        long e35 = e(healthStats, 10062);
        if (e35 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar51 = (babf) createBuilder.instance;
            babfVar51.c |= 262144;
            babfVar51.al = e35;
        }
        long e36 = e(healthStats, 10063);
        if (e36 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar52 = (babf) createBuilder.instance;
            babfVar52.c = 524288 | babfVar52.c;
            babfVar52.am = e36;
        }
        long e37 = e(healthStats, 10064);
        if (e37 != 0) {
            createBuilder.copyOnWrite();
            babf babfVar53 = (babf) createBuilder.instance;
            babfVar53.c |= 1048576;
            babfVar53.an = e37;
        }
        aone builder = ((babf) createBuilder.build()).toBuilder();
        uoy uoyVar = uphVar.b;
        Collections.unmodifiableList(((babf) builder.instance).h);
        for (int i17 = 0; i17 < ((babf) builder.instance).h.size(); i17++) {
            builder.cb(i17, uoyVar.b(uox.WAKELOCK, builder.bL(i17)));
        }
        Collections.unmodifiableList(((babf) builder.instance).i);
        for (int i18 = 0; i18 < ((babf) builder.instance).i.size(); i18++) {
            builder.cc(i18, uoyVar.b(uox.WAKELOCK, builder.bM(i18)));
        }
        Collections.unmodifiableList(((babf) builder.instance).j);
        for (int i19 = 0; i19 < ((babf) builder.instance).j.size(); i19++) {
            builder.cd(i19, uoyVar.b(uox.WAKELOCK, builder.bN(i19)));
        }
        Collections.unmodifiableList(((babf) builder.instance).k);
        for (int i20 = 0; i20 < ((babf) builder.instance).k.size(); i20++) {
            builder.ca(i20, uoyVar.b(uox.WAKELOCK, builder.bK(i20)));
        }
        Collections.unmodifiableList(((babf) builder.instance).l);
        for (int i21 = 0; i21 < ((babf) builder.instance).l.size(); i21++) {
            builder.bZ(i21, uoyVar.b(uox.SYNC, builder.bJ(i21)));
        }
        Collections.unmodifiableList(((babf) builder.instance).m);
        for (int i22 = 0; i22 < ((babf) builder.instance).m.size(); i22++) {
            builder.bX(i22, uoyVar.b(uox.JOB, builder.bH(i22)));
        }
        Collections.unmodifiableList(((babf) builder.instance).o);
        for (int i23 = 0; i23 < ((babf) builder.instance).o.size(); i23++) {
            builder.bY(i23, uoyVar.b(uox.SENSOR, builder.bI(i23)));
        }
        return new upf((babf) builder.build(), l, l2, 396895652L, Long.valueOf(uoqVar.d != null ? r0.hashCode() : 0L), baavVar, null, null);
    }

    public static bacc s(Context context) {
        return t(null, context);
    }

    public static bacc t(String str, Context context) {
        aone createBuilder = bacc.a.createBuilder();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        createBuilder.copyOnWrite();
        bacc baccVar = (bacc) createBuilder.instance;
        baccVar.b |= 1;
        baccVar.c = elapsedCpuTime;
        boolean c = uon.c(context);
        createBuilder.copyOnWrite();
        bacc baccVar2 = (bacc) createBuilder.instance;
        baccVar2.b |= 2;
        baccVar2.d = c;
        int activeCount = Thread.activeCount();
        createBuilder.copyOnWrite();
        bacc baccVar3 = (bacc) createBuilder.instance;
        baccVar3.b |= 4;
        baccVar3.e = activeCount;
        if (str != null) {
            createBuilder.copyOnWrite();
            bacc baccVar4 = (bacc) createBuilder.instance;
            baccVar4.b |= 8;
            baccVar4.f = str;
        }
        return (bacc) createBuilder.build();
    }

    public static /* synthetic */ String u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "YT_MAIN_ANDROID" : "YT_KIDS_ANDROID" : "FAMILY_LINK_ANDROID" : "UNKNOWN";
    }

    public static anhy v(final qoi qoiVar, final amml ammlVar, final Executor executor) {
        final SettableFuture f = SettableFuture.f();
        qoiVar.i(new qon() { // from class: ulz
            @Override // defpackage.qon
            public final void a(final qom qomVar) {
                final SettableFuture settableFuture = SettableFuture.this;
                Executor executor2 = executor;
                final amml ammlVar2 = ammlVar;
                Status a = qomVar.a();
                if (a.g != 14) {
                    if (!a.c()) {
                        settableFuture.e(new ulu(qomVar, a));
                        uou.w(qomVar);
                        return;
                    } else {
                        executor2.execute(new Runnable() { // from class: umb
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettableFuture settableFuture2 = SettableFuture.this;
                                amml ammlVar3 = ammlVar2;
                                qom qomVar2 = qomVar;
                                try {
                                    settableFuture2.o(ammlVar3.apply(qomVar2));
                                } catch (RuntimeException e) {
                                    settableFuture2.e(e);
                                } finally {
                                    uou.w(qomVar2);
                                }
                            }
                        });
                        return;
                    }
                }
                String valueOf = String.valueOf(qomVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("We never use the blocking API for these calls: ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
        }, TimeUnit.SECONDS);
        f.d(amjk.f(new Runnable() { // from class: uma
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = SettableFuture.this;
                qoi qoiVar2 = qoiVar;
                if (settableFuture.isCancelled()) {
                    qoiVar2.f();
                }
            }
        }), angq.a);
        return f;
    }

    public static void w(qom qomVar) {
        if (qomVar instanceof qoj) {
            ((qoj) qomVar).b();
        }
    }

    public static void x(String str, List list, Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        ukh a = uki.a();
        a.b(str);
        map.put(str, a);
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? "MENAGERIE" : "MDI";
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FALSE" : "TRUE" : "UNKNOWN";
    }
}
