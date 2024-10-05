package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acou extends rbd implements acop {
    public final Runnable a;
    public final AtomicInteger b;
    protected anhy c;
    protected HandlerThread d;
    protected final axpg e;
    protected apda f;
    protected qob g;
    private final Context h;
    private final ywh i;
    private final ScheduledExecutorService j;
    private final shf k;
    private Handler l;
    private astv m;
    private Location n;
    private LocationAvailability o;
    private boolean p;
    private final aadw q;

    public acou(Context context, aadw aadwVar, ywh ywhVar, shf shfVar, ScheduledExecutorService scheduledExecutorService, axpg axpgVar) {
        this.h = context;
        aadwVar.getClass();
        this.q = aadwVar;
        ywhVar.getClass();
        this.i = ywhVar;
        shfVar.getClass();
        this.k = shfVar;
        scheduledExecutorService.getClass();
        this.j = scheduledExecutorService;
        this.e = axpgVar;
        this.d = null;
        this.b = new AtomicInteger(1);
        this.a = new acot(this, 1);
    }

    private final boolean s() {
        apda apdaVar = this.f;
        return apdaVar != null && this.i.a((atub[]) apdaVar.e.toArray(new atub[0]));
    }

    @Override // defpackage.rbd
    public final void a(LocationAvailability locationAvailability) {
        this.o = locationAvailability;
    }

    @Override // defpackage.rbd
    public final void b(LocationResult locationResult) {
        if (locationResult != null) {
            int size = locationResult.b.size();
            q(size == 0 ? null : (Location) locationResult.b.get(size - 1));
        }
    }

    @Override // defpackage.acop
    public final astw c() {
        int i;
        LocationAvailability locationAvailability;
        LocationAvailability locationAvailability2;
        if (!r()) {
            return null;
        }
        aone createBuilder = astw.a.createBuilder();
        try {
            if (this.p) {
                i = 9;
            } else {
                i = (!r() || s()) ? (r() && this.n == null && ((locationAvailability2 = this.o) == null || locationAvailability2.d)) ? 2 : (!r() || (locationAvailability = this.o) == null || locationAvailability.d) ? this.n != null ? 4 : 1 : 8 : 5;
            }
            createBuilder.copyOnWrite();
            astw astwVar = (astw) createBuilder.instance;
            astwVar.c = i - 1;
            astwVar.b |= 1;
            Location location = this.n;
            if (location != null) {
                int latitude = (int) (location.getLatitude() * 1.0E7d);
                createBuilder.copyOnWrite();
                astw astwVar2 = (astw) createBuilder.instance;
                astwVar2.b = 8 | astwVar2.b;
                astwVar2.d = latitude;
                int longitude = (int) (this.n.getLongitude() * 1.0E7d);
                createBuilder.copyOnWrite();
                astw astwVar3 = (astw) createBuilder.instance;
                astwVar3.b |= 16;
                astwVar3.e = longitude;
                int round = Math.round(this.n.getAccuracy());
                createBuilder.copyOnWrite();
                astw astwVar4 = (astw) createBuilder.instance;
                astwVar4.b |= 32;
                astwVar4.f = round;
                long convert = TimeUnit.MILLISECONDS.convert(this.k.e() - this.n.getElapsedRealtimeNanos(), TimeUnit.NANOSECONDS);
                createBuilder.copyOnWrite();
                astw astwVar5 = (astw) createBuilder.instance;
                astwVar5.b |= 64;
                astwVar5.g = convert;
            }
        } catch (Exception e) {
            afsi.c(2, 26, "Failure createLocationInfo.", e);
        }
        return (astw) createBuilder.build();
    }

    @Override // defpackage.acop
    public final synchronized void d() {
        try {
            if (this.b.get() == 2) {
                this.b.set(1);
                this.c.d(new acot(this, 0), this.j);
                return;
            }
            anhy anhyVar = this.c;
            if (anhyVar != null && !anhyVar.isCancelled()) {
                this.c.cancel(true);
            }
            if (this.g == null || this.b.get() == 3) {
                return;
            }
            this.g.C(this);
            this.b.set(1);
            this.g = null;
        } catch (Exception e) {
            p(e, "Failure stopLocationListening.");
        }
    }

    @Override // defpackage.acop
    public final synchronized void e() {
        try {
            if (this.b.compareAndSet(1, 2)) {
                astv astvVar = this.q.b().t;
                if (astvVar == null) {
                    astvVar = astv.a;
                }
                apda apdaVar = astvVar.c;
                if (apdaVar == null) {
                    apdaVar = apda.a;
                }
                if (apdaVar.f) {
                    this.l = (Handler) this.e.get();
                } else {
                    if (this.d == null) {
                        HandlerThread handlerThread = new HandlerThread(String.valueOf(getClass().getName()).concat("_POLLING"), 10);
                        this.d = handlerThread;
                        handlerThread.start();
                    }
                    if (this.l == null) {
                        this.l = new Handler(this.d.getLooper());
                    }
                }
                anhy anhyVar = this.c;
                if (anhyVar != null && !anhyVar.isCancelled()) {
                    this.c.cancel(true);
                }
                this.c = anaf.T(new anfy() { // from class: acos
                    @Override // defpackage.anfy
                    public final anhy a() {
                        acou acouVar = acou.this;
                        acouVar.a.run();
                        if (acouVar.b.get() == 0) {
                            return anaf.O(null);
                        }
                        return anaf.N(new IllegalStateException("Could not start location updates"));
                    }
                }, this.j);
            }
        } catch (Exception e) {
            p(e, "Failure startLocationListening.");
            anaf.M();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff A[Catch: all -> 0x015c, Exception -> 0x015e, TryCatch #0 {Exception -> 0x015e, blocks: (B:5:0x0003, B:7:0x0007, B:9:0x0011, B:10:0x0013, B:12:0x0017, B:14:0x001b, B:15:0x001d, B:16:0x001f, B:18:0x0025, B:20:0x002b, B:22:0x002f, B:23:0x0037, B:25:0x0040, B:27:0x0045, B:29:0x004b, B:30:0x005f, B:33:0x008b, B:36:0x00a6, B:37:0x00a8, B:40:0x00b3, B:50:0x00c9, B:53:0x0110, B:57:0x00ff, B:60:0x0107, B:64:0x0153), top: B:4:0x0003, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void o() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acou.o():void");
    }

    public final void p(Exception exc, String str) {
        this.b.set(3);
        this.p = true;
        afsi.c(1, 26, str, exc);
        try {
            synchronized (this) {
                qob qobVar = this.g;
                if (qobVar != null) {
                    qobVar.C(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(Location location) {
        if (location != null) {
            this.n = location;
        }
    }

    public final boolean r() {
        astv astvVar = this.m;
        return (astvVar == null || this.f == null || !astvVar.b) ? false : true;
    }
}
