package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Choreographer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqx extends lo implements Choreographer.FrameCallback, akqs {
    public final boolean a;
    public acra b;
    public boolean c;
    private final shf d;
    private final Choreographer e;
    private final akqu f;
    private boolean g;

    public akqx(Context context, acpl acplVar, akto aktoVar, aadw aadwVar, akqw akqwVar, ExecutorService executorService, shf shfVar) {
        apwy b = aadwVar.b();
        float f = 0.0f;
        if (b != null && (b.b & 4096) != 0) {
            aulu auluVar = b.l;
            f = (auluVar == null ? aulu.a : auluVar).g;
        }
        this.a = aktoVar.b(f, aksi.SCROLL_TRACKER_SAMPLING);
        this.d = shfVar;
        this.e = Choreographer.getInstance();
        this.f = new akqu(context, akqwVar, acplVar, executorService);
        this.g = false;
        this.c = false;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        akqu akquVar = this.f;
        if (i != 0) {
            akquVar.j = true;
            akquVar.m = aund.SCROLL_ORIENTATION_HORIZONTAL;
        }
        if (i2 != 0) {
            akquVar.k = true;
            akquVar.m = aund.SCROLL_ORIENTATION_VERTICAL;
        }
        akquVar.i += i2 + i;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2;
        if (this.g) {
            this.e.postFrameCallback(this);
            akqu akquVar = this.f;
            long j3 = 0;
            if (akquVar.h == 0) {
                akquVar.h = j;
                akquVar.g = j;
                return;
            }
            long millis = TimeUnit.NANOSECONDS.toMillis(j - akquVar.g);
            if (millis > 17) {
                long millis2 = TimeUnit.NANOSECONDS.toMillis(j);
                double d = millis;
                Double.isNaN(d);
                int i = (int) (d / 16.67d);
                int i2 = 0;
                int i3 = 0;
                while (i3 < 6 && akqu.a[i3] <= i) {
                    long[] jArr = akquVar.d;
                    long j4 = jArr[i3];
                    if (j4 != j3) {
                        long[] jArr2 = akquVar.e;
                        jArr2[i3] = jArr2[i3] + (millis2 - j4);
                        int[] iArr = akquVar.f;
                        iArr[i3] = iArr[i3] + 1;
                    }
                    jArr[i3] = millis2;
                    int[] iArr2 = akquVar.c;
                    iArr2[i3] = iArr2[i3] + 1;
                    i3++;
                    j3 = 0;
                }
                long j5 = millis2 - millis;
                amru a = akquVar.p.a();
                int size = a.size();
                int i4 = 0;
                while (i4 < size) {
                    aqct aqctVar = (aqct) a.get(i4);
                    aqcs aqcsVar = (aqcs) aqctVar.e.get(i2);
                    amru amruVar = a;
                    long j6 = aqcsVar.c;
                    if (j5 > j6 || j6 > millis2) {
                        j2 = j5;
                    } else {
                        amrp amrpVar = akquVar.n;
                        aone builder = aqctVar.toBuilder();
                        aone builder2 = aqcsVar.toBuilder();
                        builder2.copyOnWrite();
                        aqcs aqcsVar2 = (aqcs) builder2.instance;
                        j2 = j5;
                        aqcsVar2.b |= 8;
                        aqcsVar2.f = (int) millis;
                        builder2.copyOnWrite();
                        aqcs aqcsVar3 = (aqcs) builder2.instance;
                        aqcsVar3.b |= 4;
                        aqcsVar3.e = i;
                        builder.copyOnWrite();
                        aqct aqctVar2 = (aqct) builder.instance;
                        aqcs aqcsVar4 = (aqcs) builder2.build();
                        aqcsVar4.getClass();
                        aqctVar2.a();
                        aqctVar2.e.set(0, aqcsVar4);
                        amrpVar.h((aqct) builder.build());
                    }
                    i4++;
                    a = amruVar;
                    j5 = j2;
                    i2 = 0;
                }
            }
            akquVar.g = j;
        }
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1 && !this.g) {
                this.e.postFrameCallback(this);
                this.g = true;
                akqu akquVar = this.f;
                akquVar.g = 0L;
                akquVar.h = 0L;
                akquVar.i = 0;
                akquVar.c = new int[6];
                akquVar.d = new long[6];
                akquVar.e = new long[6];
                akquVar.f = new int[6];
                akquVar.j = false;
                akquVar.k = false;
                akquVar.l = aunc.SCROLL_DIRECTION_UNKNOWN;
                akquVar.m = aund.SCROLL_ORIENTATION_UNKNOWN;
                akquVar.n = amru.f();
                akquVar.p.b();
                return;
            }
            return;
        }
        if (this.g) {
            akqu akquVar2 = this.f;
            long c = this.d.c();
            acra acraVar = this.b;
            String k = acraVar != null ? acraVar.k() : "";
            akquVar2.p.c();
            long millis = TimeUnit.NANOSECONDS.toMillis(akquVar2.g - akquVar2.h);
            if ((!akquVar2.j || !akquVar2.k) && millis > 0) {
                akqv akqvVar = new akqv(akquVar2.c, akquVar2.e, akquVar2.f, millis);
                int i2 = akquVar2.i;
                if (i2 < 0) {
                    akquVar2.l = aunc.SCROLL_DIRECTION_BACKWARDS;
                } else if (i2 > 0) {
                    akquVar2.l = aunc.SCROLL_DIRECTION_FORWARD;
                } else {
                    akquVar2.l = aunc.SCROLL_DIRECTION_UNKNOWN;
                }
                if (!k.isEmpty()) {
                    akquVar2.q.execute(new akqt(akquVar2, k, akqvVar, Math.abs(akquVar2.i), akquVar2.m, akquVar2.l, akquVar2.n.g(), c));
                }
            }
            this.g = false;
        }
    }
}
