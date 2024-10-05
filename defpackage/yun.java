package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yun implements ysn {
    private final yuw a;
    private final zgi b;

    public yun(shf shfVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, apdq apdqVar, ynx ynxVar, ScheduledExecutorService scheduledExecutorService, ysb ysbVar, Executor executor, azrw azrwVar4, ysw yswVar, zgi zgiVar) {
        c(apdqVar);
        yud yudVar = new yud();
        if (shfVar != null) {
            yudVar.e = shfVar;
            if (azrwVar != null) {
                yudVar.a = azrwVar;
                if (azrwVar2 != null) {
                    yudVar.b = azrwVar2;
                    if (azrwVar3 != null) {
                        yudVar.c = azrwVar3;
                        yudVar.f = apdqVar;
                        if (ynxVar != null) {
                            yudVar.d = ynxVar;
                            if (scheduledExecutorService != null) {
                                yudVar.g = scheduledExecutorService;
                                yudVar.h = ysbVar;
                                yudVar.i = executor;
                                yudVar.n = 5000L;
                                yudVar.p = new yum(apdqVar);
                                yudVar.q = new yum(apdqVar);
                                if (azrwVar4 != null) {
                                    yudVar.r = azrwVar4;
                                    yudVar.s = yswVar;
                                    this.a = yudVar;
                                    this.b = zgiVar;
                                    return;
                                }
                                throw new NullPointerException("Null requestCompletionListenerProvider");
                            }
                            throw new NullPointerException("Null timeoutExecutor");
                        }
                        throw new NullPointerException("Null commonConfigs");
                    }
                    throw new NullPointerException("Null uriRewriter");
                }
                throw new NullPointerException("Null headerDecoratorProvider");
            }
            throw new NullPointerException("Null cronetEngineProvider");
        }
        throw new NullPointerException("Null clock");
    }

    public static void c(apdq apdqVar) {
        apdqVar.getClass();
        amkq.F(apdqVar.h >= 0, "normalCoreSize < 0");
        amkq.F(apdqVar.i > 0, "normalMaxSize <= 0");
        amkq.F(apdqVar.i >= apdqVar.h, "normalMaxSize < normalCoreSize");
        amkq.F(apdqVar.f >= 0, "priorityCoreSize < 0");
        amkq.F(apdqVar.g > 0, "priorityMaxSize <= 0");
        amkq.F(apdqVar.g >= apdqVar.f, "priorityMaxSize < priorityCoreSize");
        amkq.F(apdqVar.e >= 0, "keepAliveTime < 0");
    }

    @Override // defpackage.ysn
    public final /* synthetic */ ysl a(cnd cndVar, ysm ysmVar, String str) {
        return yny.d(this, cndVar, ysmVar, str);
    }

    @Override // defpackage.ysn
    public final ysl b(cnd cndVar, ysm ysmVar, Executor executor, aace aaceVar, String str) {
        azrw azrwVar;
        azrw azrwVar2;
        ynx ynxVar;
        shf shfVar;
        apdq apdqVar;
        ScheduledExecutorService scheduledExecutorService;
        ysm ysmVar2;
        cnd cndVar2;
        Integer num;
        yuw yuwVar = this.a;
        if (cndVar == null) {
            throw new NullPointerException("Null cache");
        }
        yud yudVar = (yud) yuwVar;
        yudVar.k = cndVar;
        if (ysmVar != null) {
            yudVar.j = ysmVar;
            yudVar.u = aaceVar;
            yudVar.l = 4;
            yudVar.m = str;
            if (executor != null) {
                yudVar.o = executor;
                zgi zgiVar = this.b;
                if (zgiVar != null) {
                    yudVar.t = zgiVar;
                    azrw azrwVar3 = yudVar.a;
                    if (azrwVar3 == null || (azrwVar = yudVar.b) == null || (azrwVar2 = yudVar.c) == null || (ynxVar = yudVar.d) == null || (shfVar = yudVar.e) == null || (apdqVar = yudVar.f) == null || (scheduledExecutorService = yudVar.g) == null || (ysmVar2 = yudVar.j) == null || (cndVar2 = yudVar.k) == null || (num = yudVar.l) == null || yudVar.m == null || yudVar.n == null || yudVar.o == null || yudVar.p == null || yudVar.q == null || yudVar.r == null || yudVar.s == null || yudVar.t == null) {
                        StringBuilder sb = new StringBuilder();
                        if (yudVar.a == null) {
                            sb.append(" cronetEngineProvider");
                        }
                        if (yudVar.b == null) {
                            sb.append(" headerDecoratorProvider");
                        }
                        if (yudVar.c == null) {
                            sb.append(" uriRewriter");
                        }
                        if (yudVar.d == null) {
                            sb.append(" commonConfigs");
                        }
                        if (yudVar.e == null) {
                            sb.append(" clock");
                        }
                        if (yudVar.f == null) {
                            sb.append(" androidCrolleyConfig");
                        }
                        if (yudVar.g == null) {
                            sb.append(" timeoutExecutor");
                        }
                        if (yudVar.j == null) {
                            sb.append(" volleyNetworkConfig");
                        }
                        if (yudVar.k == null) {
                            sb.append(" cache");
                        }
                        if (yudVar.l == null) {
                            sb.append(" threadPoolSize");
                        }
                        if (yudVar.m == null) {
                            sb.append(" threadPoolTag");
                        }
                        if (yudVar.n == null) {
                            sb.append(" connectionTimeout");
                        }
                        if (yudVar.o == null) {
                            sb.append(" deliveryExecutor");
                        }
                        if (yudVar.p == null) {
                            sb.append(" normalExecutorGenerator");
                        }
                        if (yudVar.q == null) {
                            sb.append(" priorityExecutorGenerator");
                        }
                        if (yudVar.r == null) {
                            sb.append(" requestCompletionListenerProvider");
                        }
                        if (yudVar.s == null) {
                            sb.append(" networkRequestTracker");
                        }
                        if (yudVar.t == null) {
                            sb.append(" clientErrorLogger");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    return new yuh(new yue(azrwVar3, azrwVar, azrwVar2, ynxVar, shfVar, apdqVar, scheduledExecutorService, yudVar.h, yudVar.i, ysmVar2, cndVar2, yudVar.u, num.intValue(), yudVar.m, yudVar.n.longValue(), yudVar.o, yudVar.p, yudVar.q, yudVar.r, yudVar.s, yudVar.t));
                }
                throw new NullPointerException("Null clientErrorLogger");
            }
            throw new NullPointerException("Null deliveryExecutor");
        }
        throw new NullPointerException("Null volleyNetworkConfig");
    }
}
