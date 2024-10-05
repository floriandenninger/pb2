package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akrq implements yqa, yqb {
    public final azrw c;
    public final azrw d;
    public final azrw e;
    final Runnable f;
    private ypc g;
    private ypc h;
    private ypc i;
    private yqi j;
    private akrp k;
    private final Application m;
    private final ypa n;
    private final shf o;
    private final ScheduledExecutorService p;
    private final azrw q;
    private final Executor r;
    private final azrw s;
    private ayqx t;
    private ScheduledFuture u;
    public boolean a = false;
    private long l = -1;
    public long b = -1;

    public akrq(Application application, ypa ypaVar, final shf shfVar, ScheduledExecutorService scheduledExecutorService, azrw azrwVar, final azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.m = application;
        this.n = ypaVar;
        this.o = shfVar;
        this.p = scheduledExecutorService;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.q = azrwVar4;
        this.r = anaf.E(scheduledExecutorService);
        this.s = azrwVar5;
        this.f = new Runnable() { // from class: akro
            @Override // java.lang.Runnable
            public final void run() {
                akrq akrqVar = akrq.this;
                shf shfVar2 = shfVar;
                azrw azrwVar6 = azrwVar2;
                synchronized (akrqVar) {
                    if (akrqVar.a) {
                        akrqVar.b = shfVar2.d();
                        ((akrr) azrwVar6.get()).b(null);
                    }
                }
            }
        };
    }

    private final synchronized void g() {
        f();
        if (this.a) {
            ypc ypcVar = this.g;
            if (ypcVar != null) {
                this.n.l(ypcVar);
                this.g = null;
            }
            ypc ypcVar2 = this.h;
            if (ypcVar2 != null) {
                this.n.l(ypcVar2);
                this.h = null;
            }
            ypc ypcVar3 = this.i;
            if (ypcVar3 != null) {
                this.n.l(ypcVar3);
                this.i = null;
            }
            Object obj = this.t;
            if (obj != null) {
                ayrz.c((AtomicReference) obj);
                this.t = null;
            }
            akrp akrpVar = this.k;
            if (akrpVar != null) {
                this.m.unregisterReceiver(akrpVar);
                this.k = null;
            }
            yqi yqiVar = this.j;
            if (yqiVar != null) {
                yqiVar.b(this.m);
                this.j.d(this);
                this.j.d(this);
                this.j = null;
            }
            this.a = false;
        }
    }

    private final synchronized void h(avdy avdyVar) {
        if (this.a) {
            return;
        }
        final int i = 1;
        this.g = this.n.a(this, akqz.class, new ypb(this) { // from class: akrl
            public final /* synthetic */ akrq a;

            {
                this.a = this;
            }

            @Override // defpackage.ypb
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    ((akrr) this.a.d.get()).a(((akra) obj).a());
                    return;
                }
                if (i2 != 1) {
                    this.a.d((akrb) obj);
                    return;
                }
                akqz akqzVar = (akqz) obj;
                akrr akrrVar = (akrr) this.a.d.get();
                akqzVar.b();
                akrrVar.b(akqzVar.a());
            }
        });
        final int i2 = 0;
        this.h = this.n.a(this, akra.class, new ypb(this) { // from class: akrl
            public final /* synthetic */ akrq a;

            {
                this.a = this;
            }

            @Override // defpackage.ypb
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    ((akrr) this.a.d.get()).a(((akra) obj).a());
                    return;
                }
                if (i22 != 1) {
                    this.a.d((akrb) obj);
                    return;
                }
                akqz akqzVar = (akqz) obj;
                akrr akrrVar = (akrr) this.a.d.get();
                akqzVar.b();
                akrrVar.b(akqzVar.a());
            }
        });
        final int i3 = 2;
        this.i = this.n.a(this, akrb.class, new ypb(this) { // from class: akrl
            public final /* synthetic */ akrq a;

            {
                this.a = this;
            }

            @Override // defpackage.ypb
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    ((akrr) this.a.d.get()).a(((akra) obj).a());
                    return;
                }
                if (i22 != 1) {
                    this.a.d((akrb) obj);
                    return;
                }
                akqz akqzVar = (akqz) obj;
                akrr akrrVar = (akrr) this.a.d.get();
                akqzVar.b();
                akrrVar.b(akqzVar.a());
            }
        });
        avdw avdwVar = avdyVar.e;
        if (avdwVar == null) {
            avdwVar = avdw.a;
        }
        if (avdwVar.r) {
            this.t = ((akqk) this.s.get()).c.ax(new ayrs() { // from class: akrm
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    akrq.this.d((akrb) obj);
                }
            });
        }
        yqi yqiVar = new yqi();
        this.j = yqiVar;
        yqiVar.a(this.m);
        this.j.c(this);
        this.j.c(this);
        ((akqo) this.c.get()).a(this.m.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        akrp akrpVar = new akrp(this);
        this.k = akrpVar;
        this.m.registerReceiver(akrpVar, intentFilter);
        this.a = true;
    }

    @Override // defpackage.yqb
    public final void a() {
        this.r.execute(new akrn(this, 0));
        akrr akrrVar = (akrr) this.d.get();
        synchronized (akrrVar.a) {
            for (akqj akqjVar : akrrVar.e.values()) {
                if (akqjVar.e()) {
                    Context context = akrrVar.b;
                    akqjVar.c();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
    
        if (r0.c != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(defpackage.avdy r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.c     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto La
            r5.g()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r5)
            return
        La:
            azrw r0 = r5.d     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb4
            akrr r0 = (defpackage.akrr) r0     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r1 = r0.a     // Catch: java.lang.Throwable -> Lb4
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r2 = r0.e     // Catch: java.lang.Throwable -> Lb1
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> Lb1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lb1
        L1f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lb1
            akqj r3 = (defpackage.akqj) r3     // Catch: java.lang.Throwable -> Lb1
            r3.d(r6)     // Catch: java.lang.Throwable -> Lb1
            boolean r4 = r3 instanceof defpackage.akqh     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto L1f
            boolean r3 = r3.e()     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L1f
            r3 = 1
            r0.f = r3     // Catch: java.lang.Throwable -> Lb1
            goto L1f
        L3c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            azrw r0 = r5.e     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb4
            akrs r0 = (defpackage.akrs) r0     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r1 = r0.a     // Catch: java.lang.Throwable -> Lb4
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r0 = r0.b     // Catch: java.lang.Throwable -> Lae
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lae
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lae
        L52:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Lae
            aktk r2 = (defpackage.aktk) r2     // Catch: java.lang.Throwable -> Lae
            r2.a(r6)     // Catch: java.lang.Throwable -> Lae
            goto L52
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lae
            r5.h(r6)     // Catch: java.lang.Throwable -> Lb4
            int r0 = r6.b     // Catch: java.lang.Throwable -> Lb4
            r0 = r0 & 64
            if (r0 == 0) goto L76
            avdr r0 = r6.f     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L72
            avdr r0 = defpackage.avdr.a     // Catch: java.lang.Throwable -> Lb4
        L72:
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L87
        L76:
            azrw r0 = r5.q     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb4
            aktp r0 = (defpackage.aktp) r0     // Catch: java.lang.Throwable -> Lb4
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> Lb4
            r0.b = r1     // Catch: java.lang.Throwable -> Lb4
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)     // Catch: java.lang.Throwable -> Lb4
        L87:
            int r0 = r6.b     // Catch: java.lang.Throwable -> Lb4
            r0 = r0 & 2
            if (r0 == 0) goto L98
            avdt r6 = r6.d     // Catch: java.lang.Throwable -> Lb4
            if (r6 != 0) goto L93
            avdt r6 = defpackage.avdt.a     // Catch: java.lang.Throwable -> Lb4
        L93:
            int r6 = r6.b     // Catch: java.lang.Throwable -> Lb4
            long r0 = (long) r6     // Catch: java.lang.Throwable -> Lb4
            r5.l = r0     // Catch: java.lang.Throwable -> Lb4
        L98:
            android.app.Application r6 = r5.m     // Catch: java.lang.Throwable -> Lb4
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> Lb4
            boolean r6 = defpackage.uon.c(r6)     // Catch: java.lang.Throwable -> Lb4
            if (r6 == 0) goto La9
            r5.a()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r5)
            return
        La9:
            r5.c()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r5)
            return
        Lae:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lae
            throw r6     // Catch: java.lang.Throwable -> Lb4
        Lb1:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            throw r6     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r6 = move-exception
            monitor-exit(r5)
            goto Lb8
        Lb7:
            throw r6
        Lb8:
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akrq.b(avdy):void");
    }

    @Override // defpackage.yqa
    public final void c() {
        this.r.execute(new akrn(this, 1));
        akrr akrrVar = (akrr) this.d.get();
        synchronized (akrrVar.a) {
            for (akqj akqjVar : akrrVar.e.values()) {
                if (akqjVar.e()) {
                    Context context = akrrVar.b;
                    akqjVar.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(akrb akrbVar) {
        InteractionLoggingScreen c;
        akrr akrrVar = (akrr) this.d.get();
        avdh a = akrbVar.a();
        bact b = akrbVar.b();
        boolean c2 = akrbVar.c();
        String str = ((aktp) this.q.get()).a;
        aone createBuilder = avdg.a.createBuilder();
        if (a != null) {
            createBuilder.copyOnWrite();
            avdg avdgVar = (avdg) createBuilder.instance;
            avdgVar.c = a.c;
            avdgVar.b |= 1;
        }
        if ((b.b & 64) != 0) {
            bach bachVar = b.h;
            if (bachVar == null) {
                bachVar = bach.a;
            }
            if (bachVar.c) {
                aone createBuilder2 = avdc.a.createBuilder();
                if (str != null) {
                    createBuilder2.copyOnWrite();
                    avdc avdcVar = (avdc) createBuilder2.instance;
                    avdcVar.b |= 1;
                    avdcVar.c = str;
                }
                avdj avdjVar = ((aadw) akrrVar.d.get()).b().u;
                if (avdjVar == null) {
                    avdjVar = avdj.a;
                }
                if (avdjVar.q && (c = ((acrt) akrrVar.c.get()).c()) != null) {
                    int i = c.f;
                    createBuilder2.copyOnWrite();
                    avdc avdcVar2 = (avdc) createBuilder2.instance;
                    avdcVar2.b |= 2;
                    avdcVar2.d = i;
                }
                int i2 = ((avdc) createBuilder2.instance).b;
                if ((i2 & 1) != 0 || (i2 & 2) != 0) {
                    createBuilder.copyOnWrite();
                    avdg avdgVar2 = (avdg) createBuilder.instance;
                    avdc avdcVar3 = (avdc) createBuilder2.build();
                    avdcVar3.getClass();
                    avdgVar2.g = avdcVar3;
                    avdgVar2.b |= 64;
                }
            }
        }
        aomf byteString = b.toByteString();
        createBuilder.copyOnWrite();
        avdg avdgVar3 = (avdg) createBuilder.instance;
        avdgVar3.b |= 8;
        avdgVar3.f = byteString;
        akrrVar.c(createBuilder, c2, akrrVar.f);
    }

    public final synchronized void e() {
        if (this.a) {
            if (this.l >= 0) {
                f();
                long d = this.o.d();
                long j = this.b;
                this.u = this.p.scheduleAtFixedRate(this.f, j >= 0 ? Math.max(0L, (j + this.l) - d) : 0L, this.l, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final synchronized void f() {
        ScheduledFuture scheduledFuture = this.u;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.u.cancel(true);
        }
        this.u = null;
    }
}
