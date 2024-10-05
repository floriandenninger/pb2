package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yue extends yuy {
    private volatile transient ThreadPoolExecutor A;
    public final azrw a;
    public final azrw b;
    public final azrw c;
    public final ynx d;
    public final shf e;
    public final apdq f;
    public final ScheduledExecutorService g;
    public final ysb h;
    public final Executor i;
    public final ysm j;
    public final cnd k;
    public final int l;
    public final String m;
    public final long n;
    public final Executor o;
    public final yux p;
    public final azrw q;
    public final ysw r;
    public final zgi s;
    public volatile transient boolean t;
    public volatile transient boolean u;
    public volatile transient boolean v;
    public volatile transient ThreadPoolExecutor w;
    public final aace x;
    public volatile transient whl y;
    private final yux z;

    public yue(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, ynx ynxVar, shf shfVar, apdq apdqVar, ScheduledExecutorService scheduledExecutorService, ysb ysbVar, Executor executor, ysm ysmVar, cnd cndVar, aace aaceVar, int i, String str, long j, Executor executor2, yux yuxVar, yux yuxVar2, azrw azrwVar4, ysw yswVar, zgi zgiVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = ynxVar;
        this.e = shfVar;
        this.f = apdqVar;
        this.g = scheduledExecutorService;
        this.h = ysbVar;
        this.i = executor;
        this.j = ysmVar;
        this.k = cndVar;
        this.x = aaceVar;
        this.l = i;
        if (str == null) {
            throw new NullPointerException("Null threadPoolTag");
        }
        this.m = str;
        this.n = j;
        if (executor2 != null) {
            this.o = executor2;
            if (yuxVar != null) {
                this.z = yuxVar;
                if (yuxVar2 != null) {
                    this.p = yuxVar2;
                    if (azrwVar4 != null) {
                        this.q = azrwVar4;
                        if (yswVar != null) {
                            this.r = yswVar;
                            if (zgiVar != null) {
                                this.s = zgiVar;
                                return;
                            }
                            throw new NullPointerException("Null clientErrorLogger");
                        }
                        throw new NullPointerException("Null networkRequestTracker");
                    }
                    throw new NullPointerException("Null requestCompletionListenerProvider");
                }
                throw new NullPointerException("Null priorityExecutorGenerator");
            }
            throw new NullPointerException("Null normalExecutorGenerator");
        }
        throw new NullPointerException("Null deliveryExecutor");
    }

    @Override // defpackage.yts
    public final ynx a() {
        return this.d;
    }

    @Override // defpackage.yts
    public final azrw b() {
        return this.a;
    }

    @Override // defpackage.yts
    public final azrw c() {
        return this.b;
    }

    @Override // defpackage.yts
    public final azrw d() {
        return this.c;
    }

    @Override // defpackage.yuy
    public final int e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        ysb ysbVar;
        Executor executor;
        aace aaceVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof yuy) {
            yuy yuyVar = (yuy) obj;
            if (this.a.equals(yuyVar.b()) && this.b.equals(yuyVar.c()) && this.c.equals(yuyVar.d()) && this.d.equals(yuyVar.a()) && this.e.equals(yuyVar.h()) && this.f.equals(yuyVar.o()) && this.g.equals(yuyVar.s()) && ((ysbVar = this.h) != null ? ysbVar.equals(yuyVar.i()) : yuyVar.i() == null) && ((executor = this.i) != null ? executor.equals(yuyVar.r()) : yuyVar.r() == null) && this.j.equals(yuyVar.j()) && this.k.equals(yuyVar.g()) && ((aaceVar = this.x) != null ? aaceVar.equals(yuyVar.v()) : yuyVar.v() == null) && this.l == yuyVar.e() && this.m.equals(yuyVar.p()) && this.n == yuyVar.f() && this.o.equals(yuyVar.q()) && this.z.equals(yuyVar.l()) && this.p.equals(yuyVar.m()) && this.q.equals(yuyVar.t()) && this.r.equals(yuyVar.k()) && this.s.equals(yuyVar.n())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yuy
    public final long f() {
        return this.n;
    }

    @Override // defpackage.yuy
    public final cnd g() {
        return this.k;
    }

    @Override // defpackage.yuy
    public final shf h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        ysb ysbVar = this.h;
        int hashCode2 = (hashCode ^ (ysbVar == null ? 0 : ysbVar.hashCode())) * 1000003;
        Executor executor = this.i;
        int hashCode3 = (((((hashCode2 ^ (executor == null ? 0 : executor.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        aace aaceVar = this.x;
        int hashCode4 = aaceVar != null ? aaceVar.hashCode() : 0;
        int i = this.l;
        int hashCode5 = this.m.hashCode();
        long j = this.n;
        return ((((((((((((((((((hashCode3 ^ hashCode4) * 1000003) ^ i) * 1000003) ^ hashCode5) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
    }

    @Override // defpackage.yuy
    public final ysb i() {
        return this.h;
    }

    @Override // defpackage.yuy
    public final ysm j() {
        return this.j;
    }

    @Override // defpackage.yuy
    public final ysw k() {
        return this.r;
    }

    @Override // defpackage.yuy
    public final yux l() {
        return this.z;
    }

    @Override // defpackage.yuy
    public final yux m() {
        return this.p;
    }

    @Override // defpackage.yuy
    public final zgi n() {
        return this.s;
    }

    @Override // defpackage.yuy
    public final apdq o() {
        return this.f;
    }

    @Override // defpackage.yuy
    public final String p() {
        return this.m;
    }

    @Override // defpackage.yuy
    public final Executor q() {
        return this.o;
    }

    @Override // defpackage.yuy
    public final Executor r() {
        return this.i;
    }

    @Override // defpackage.yuy
    public final ScheduledExecutorService s() {
        return this.g;
    }

    @Override // defpackage.yuy
    public final azrw t() {
        return this.q;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.x);
        int i = this.l;
        String str = this.m;
        long j = this.n;
        String valueOf13 = String.valueOf(this.o);
        String valueOf14 = String.valueOf(this.z);
        String valueOf15 = String.valueOf(this.p);
        String valueOf16 = String.valueOf(this.q);
        String valueOf17 = String.valueOf(this.r);
        String valueOf18 = String.valueOf(this.s);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        int length11 = String.valueOf(valueOf11).length();
        int length12 = String.valueOf(valueOf12).length();
        int length13 = str.length();
        int length14 = String.valueOf(valueOf13).length();
        int length15 = String.valueOf(valueOf14).length();
        int length16 = String.valueOf(valueOf15).length();
        int length17 = String.valueOf(valueOf16).length();
        StringBuilder sb = new StringBuilder(length + 495 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + String.valueOf(valueOf17).length() + String.valueOf(valueOf18).length());
        sb.append("CronetRequestQueueConfig{cronetEngineProvider=");
        sb.append(valueOf);
        sb.append(", headerDecoratorProvider=");
        sb.append(valueOf2);
        sb.append(", uriRewriter=");
        sb.append(valueOf3);
        sb.append(", commonConfigs=");
        sb.append(valueOf4);
        sb.append(", clock=");
        sb.append(valueOf5);
        sb.append(", androidCrolleyConfig=");
        sb.append(valueOf6);
        sb.append(", timeoutExecutor=");
        sb.append(valueOf7);
        sb.append(", requestFinishedListener=");
        sb.append(valueOf8);
        sb.append(", requestFinishedListenerExecutor=");
        sb.append(valueOf9);
        sb.append(", volleyNetworkConfig=");
        sb.append(valueOf10);
        sb.append(", cache=");
        sb.append(valueOf11);
        sb.append(", requestLogger=");
        sb.append(valueOf12);
        sb.append(", threadPoolSize=");
        sb.append(i);
        sb.append(", threadPoolTag=");
        sb.append(str);
        sb.append(", connectionTimeout=");
        sb.append(j);
        sb.append(", deliveryExecutor=");
        sb.append(valueOf13);
        sb.append(", normalExecutorGenerator=");
        sb.append(valueOf14);
        sb.append(", priorityExecutorGenerator=");
        sb.append(valueOf15);
        sb.append(", requestCompletionListenerProvider=");
        sb.append(valueOf16);
        sb.append(", networkRequestTracker=");
        sb.append(valueOf17);
        sb.append(", clientErrorLogger=");
        sb.append(valueOf18);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.yuy
    public final ThreadPoolExecutor u() {
        int i;
        if (this.A == null) {
            synchronized (this) {
                if (this.A == null) {
                    apdq apdqVar = ((yum) this.z).a;
                    int i2 = this.l;
                    if (i2 == 1) {
                        i2 = 1;
                        i = 1;
                    } else {
                        i = apdqVar.h;
                    }
                    int i3 = i2 == 1 ? 1 : apdqVar.i;
                    long j = i2 == 1 ? 0L : apdqVar.e;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
                    String str = this.m;
                    this.A = new ThreadPoolExecutor(i, i3, j, timeUnit, linkedBlockingDeque, new yna(10, str.length() != 0 ? "cronet-".concat(str) : new String("cronet-")));
                    if (this.A == null) {
                        throw new NullPointerException("normalExecutor() cannot return null");
                    }
                }
            }
        }
        return this.A;
    }

    @Override // defpackage.yuy
    public final aace v() {
        return this.x;
    }
}
