package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqc extends akpy {
    private final azrw a;
    private final shf b;
    private final ypa c;
    private final azrw d;
    private final azrw e;
    private final PowerManager f;
    private final Object g = new Object();
    private final Object h = new Object();
    private final akqb i;
    private apcs j;
    private akqb k;
    private akpz l;
    private boolean m;
    private long n;
    private final azrw o;
    private akqa p;

    public akqc(Context context, azrw azrwVar, shf shfVar, ypa ypaVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        akqa akqaVar = new akqa(0);
        this.i = akqaVar;
        this.k = akqaVar;
        this.a = azrwVar;
        this.b = shfVar;
        this.c = ypaVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.o = azrwVar4;
        this.f = (PowerManager) context.getSystemService("power");
    }

    private final float g() {
        float a = ((zfe) this.e.get()).a();
        if (a == -1.0f) {
            return -1.0f;
        }
        return a * 1000000.0f;
    }

    private final apcs h(Context context, float f) {
        aone createBuilder = apcs.a.createBuilder();
        createBuilder.copyOnWrite();
        apcs apcsVar = (apcs) createBuilder.instance;
        apcsVar.b |= 1;
        apcsVar.c = (int) f;
        int i = ((akqo) this.a.get()).c;
        createBuilder.copyOnWrite();
        apcs apcsVar2 = (apcs) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        apcsVar2.h = i2;
        apcsVar2.b |= 32;
        aqjw f2 = ((ysy) this.d.get()).f();
        createBuilder.copyOnWrite();
        apcs apcsVar3 = (apcs) createBuilder.instance;
        apcsVar3.d = f2.B;
        apcsVar3.b |= 2;
        try {
            int i3 = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            int i4 = Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode");
            createBuilder.copyOnWrite();
            apcs apcsVar4 = (apcs) createBuilder.instance;
            apcsVar4.b |= 4;
            apcsVar4.e = i3;
            int i5 = i4 == 1 ? 2 : 3;
            createBuilder.copyOnWrite();
            apcs apcsVar5 = (apcs) createBuilder.instance;
            apcsVar5.f = i5 - 1;
            apcsVar5.b |= 8;
        } catch (Settings.SettingNotFoundException unused) {
            createBuilder.copyOnWrite();
            apcs apcsVar6 = (apcs) createBuilder.instance;
            apcsVar6.b |= 4;
            apcsVar6.e = -1;
            createBuilder.copyOnWrite();
            apcs apcsVar7 = (apcs) createBuilder.instance;
            apcsVar7.f = 0;
            apcsVar7.b |= 8;
        }
        PowerManager powerManager = this.f;
        if (powerManager != null) {
            int i6 = true != powerManager.isPowerSaveMode() ? 3 : 2;
            createBuilder.copyOnWrite();
            apcs apcsVar8 = (apcs) createBuilder.instance;
            apcsVar8.g = i6 - 1;
            apcsVar8.b |= 16;
        } else {
            createBuilder.copyOnWrite();
            apcs apcsVar9 = (apcs) createBuilder.instance;
            apcsVar9.g = 0;
            apcsVar9.b |= 16;
        }
        return (apcs) createBuilder.build();
    }

    private final void i() {
        synchronized (this.g) {
            this.j = null;
        }
    }

    private final boolean j() {
        int a;
        if (!this.m) {
            return false;
        }
        synchronized (this.h) {
            if (!this.k.b()) {
                this.k = this.i;
                return false;
            }
            if (((akqo) this.a.get()).b != 2) {
                i();
                return false;
            }
            float g = g();
            if (g == -1.0f) {
                i();
                return false;
            }
            synchronized (this.g) {
                if (this.j == null) {
                    return true;
                }
                float f = r3.c - g;
                synchronized (this.h) {
                    a = this.k.a();
                }
                return f >= ((float) a);
            }
        }
    }

    @Override // defpackage.akpy, defpackage.akqj
    public final void a() {
        if (j()) {
            this.c.d(new akra(null));
        }
    }

    @Override // defpackage.akpy, defpackage.akqj
    public final void b() {
        synchronized (this.h) {
            akpz akpzVar = this.l;
            if (akpzVar != null) {
                akpzVar.b = akpzVar.a.d();
                this.k = this.l;
            } else {
                this.k = this.i;
            }
        }
        i();
    }

    @Override // defpackage.akpy, defpackage.akqj
    public final void c() {
        synchronized (this.h) {
            akqa akqaVar = this.p;
            if (akqaVar != null) {
                this.k = akqaVar;
            } else {
                this.k = this.i;
            }
        }
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1 A[Catch: all -> 0x00b6, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:7:0x000d, B:9:0x0018, B:11:0x0024, B:12:0x0026, B:14:0x0040, B:16:0x0046, B:18:0x004a, B:19:0x004c, B:23:0x0053, B:25:0x0060, B:26:0x0062, B:28:0x0068, B:30:0x006c, B:31:0x006e, B:33:0x0072, B:34:0x0074, B:36:0x0078, B:38:0x0080, B:39:0x0082, B:41:0x0086, B:42:0x0088, B:43:0x0093, B:45:0x00a1, B:46:0x00ac, B:49:0x00a6, B:51:0x00aa, B:52:0x0090, B:53:0x00ae, B:54:0x00b0, B:56:0x0030, B:59:0x00b2, B:60:0x00b4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6 A[Catch: all -> 0x00b6, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:7:0x000d, B:9:0x0018, B:11:0x0024, B:12:0x0026, B:14:0x0040, B:16:0x0046, B:18:0x004a, B:19:0x004c, B:23:0x0053, B:25:0x0060, B:26:0x0062, B:28:0x0068, B:30:0x006c, B:31:0x006e, B:33:0x0072, B:34:0x0074, B:36:0x0078, B:38:0x0080, B:39:0x0082, B:41:0x0086, B:42:0x0088, B:43:0x0093, B:45:0x00a1, B:46:0x00ac, B:49:0x00a6, B:51:0x00aa, B:52:0x0090, B:53:0x00ae, B:54:0x00b0, B:56:0x0030, B:59:0x00b2, B:60:0x00b4), top: B:3:0x0003 }] */
    @Override // defpackage.akqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.avdy r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.h
            monitor-enter(r0)
            akqb r1 = r9.i     // Catch: java.lang.Throwable -> Lb6
            r9.k = r1     // Catch: java.lang.Throwable -> Lb6
            avdm r1 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto Ld
            avdm r1 = defpackage.avdm.a     // Catch: java.lang.Throwable -> Lb6
        Ld:
            float r1 = r1.f     // Catch: java.lang.Throwable -> Lb6
            double r2 = (double) r1     // Catch: java.lang.Throwable -> Lb6
            r4 = 0
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L30
            azrw r1 = r9.o     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lb6
            akto r1 = (defpackage.akto) r1     // Catch: java.lang.Throwable -> Lb6
            avdm r2 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r2 != 0) goto L26
            avdm r2 = defpackage.avdm.a     // Catch: java.lang.Throwable -> Lb6
        L26:
            float r2 = r2.d     // Catch: java.lang.Throwable -> Lb6
            aksi r3 = defpackage.aksi.BATTERY_SAMPLING     // Catch: java.lang.Throwable -> Lb6
            boolean r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> Lb6
            r1 = r1 ^ r6
            goto L3e
        L30:
            j$.util.concurrent.ThreadLocalRandom r2 = j$.util.concurrent.ThreadLocalRandom.current()     // Catch: java.lang.Throwable -> Lb6
            long r2 = r2.nextLong()     // Catch: java.lang.Throwable -> Lb6
            float r2 = (float) r2     // Catch: java.lang.Throwable -> Lb6
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lb2
            r1 = 0
        L3e:
            if (r10 == 0) goto Lae
            int r2 = r10.b     // Catch: java.lang.Throwable -> Lb6
            r2 = r2 & 512(0x200, float:7.17E-43)
            if (r2 == 0) goto Lae
            avdm r2 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r2 != 0) goto L4c
            avdm r2 = defpackage.avdm.a     // Catch: java.lang.Throwable -> Lb6
        L4c:
            boolean r2 = r2.c     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto Lae
            if (r1 == 0) goto L53
            goto Lae
        L53:
            r9.m = r6     // Catch: java.lang.Throwable -> Lb6
            akqa r1 = new akqa     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lb6
            r9.p = r1     // Catch: java.lang.Throwable -> Lb6
            avdm r1 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L62
            avdm r1 = defpackage.avdm.a     // Catch: java.lang.Throwable -> Lb6
        L62:
            int r1 = r1.b     // Catch: java.lang.Throwable -> Lb6
            r1 = r1 & 4
            if (r1 == 0) goto L90
            avdm r1 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L6e
            avdm r1 = defpackage.avdm.a     // Catch: java.lang.Throwable -> Lb6
        L6e:
            avdl r1 = r1.e     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L74
            avdl r1 = defpackage.avdl.a     // Catch: java.lang.Throwable -> Lb6
        L74:
            boolean r1 = r1.b     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L90
            akpz r1 = new akpz     // Catch: java.lang.Throwable -> Lb6
            azrw r2 = r9.a     // Catch: java.lang.Throwable -> Lb6
            avdm r10 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r10 != 0) goto L82
            avdm r10 = defpackage.avdm.a     // Catch: java.lang.Throwable -> Lb6
        L82:
            avdl r10 = r10.e     // Catch: java.lang.Throwable -> Lb6
            if (r10 != 0) goto L88
            avdl r10 = defpackage.avdl.a     // Catch: java.lang.Throwable -> Lb6
        L88:
            shf r3 = r9.b     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r2, r10, r3)     // Catch: java.lang.Throwable -> Lb6
            r9.l = r1     // Catch: java.lang.Throwable -> Lb6
            goto L93
        L90:
            r10 = 0
            r9.l = r10     // Catch: java.lang.Throwable -> Lb6
        L93:
            azrw r10 = r9.a     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> Lb6
            akqo r10 = (defpackage.akqo) r10     // Catch: java.lang.Throwable -> Lb6
            boolean r10 = r10.b()     // Catch: java.lang.Throwable -> Lb6
            if (r10 == 0) goto La6
            akqa r10 = r9.p     // Catch: java.lang.Throwable -> Lb6
            r9.k = r10     // Catch: java.lang.Throwable -> Lb6
            goto Lac
        La6:
            akpz r10 = r9.l     // Catch: java.lang.Throwable -> Lb6
            if (r10 == 0) goto Lac
            r9.k = r10     // Catch: java.lang.Throwable -> Lb6
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        Lae:
            r9.m = r7     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        Lb2:
            r9.m = r7     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        Lb6:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqc.d(avdy):void");
    }

    @Override // defpackage.akqj
    public final boolean e() {
        return this.m;
    }

    @Override // defpackage.akqj
    public final boolean f(Context context, aone aoneVar) {
        boolean z = false;
        if (!j()) {
            return false;
        }
        long d = this.b.d();
        apcs h = h(context, g());
        synchronized (this.g) {
            apcs apcsVar = this.j;
            if (apcsVar != null) {
                aone createBuilder = apcr.a.createBuilder();
                createBuilder.copyOnWrite();
                apcr apcrVar = (apcr) createBuilder.instance;
                apcrVar.d = apcsVar;
                apcrVar.b |= 2;
                createBuilder.copyOnWrite();
                apcr apcrVar2 = (apcr) createBuilder.instance;
                h.getClass();
                apcrVar2.e = h;
                apcrVar2.b |= 4;
                long j = d - this.n;
                createBuilder.copyOnWrite();
                apcr apcrVar3 = (apcr) createBuilder.instance;
                apcrVar3.b |= 1;
                apcrVar3.c = j;
                aoneVar.copyOnWrite();
                avdg avdgVar = (avdg) aoneVar.instance;
                apcr apcrVar4 = (apcr) createBuilder.build();
                avdg avdgVar2 = avdg.a;
                apcrVar4.getClass();
                avdgVar.i = apcrVar4;
                avdgVar.b |= 256;
                z = true;
            }
            this.j = h;
            this.n = d;
        }
        return z;
    }
}
