package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelk implements aelm {
    public final azrw a;
    public final ScheduledExecutorService b;
    public final aaea c;
    public final shf d;
    public final aejd e;
    public final afeu f;
    public final aehs g;
    public final afgx h;
    public final aadw i;
    public final airs j;
    public final afhs k;
    private final afjo l;
    private final aapf m;
    private final aarr n;
    private aejb q;
    private String r;
    private long s;
    private final axzg t;
    private final axzg u;
    private final ajoy v;
    private final Object p = new Object();
    private final Handler o = new Handler(Looper.getMainLooper());

    public aelk(azrw azrwVar, ScheduledExecutorService scheduledExecutorService, afjo afjoVar, ajoy ajoyVar, aaea aaeaVar, aadw aadwVar, shf shfVar, aapf aapfVar, airs airsVar, aarr aarrVar, aejd aejdVar, afeu afeuVar, aehs aehsVar, afgt afgtVar, axzg axzgVar, axzg axzgVar2, afhs afhsVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = azrwVar;
        this.b = scheduledExecutorService;
        this.l = afjoVar;
        this.v = ajoyVar;
        this.c = aaeaVar;
        this.i = aadwVar;
        this.d = shfVar;
        this.m = aapfVar;
        this.j = airsVar;
        this.n = aarrVar;
        this.e = aejdVar;
        this.f = afeuVar;
        this.g = aehsVar;
        this.h = afgtVar;
        this.u = axzgVar;
        this.t = axzgVar2;
        this.k = afhsVar;
    }

    public final aejb a(String str, aelw aelwVar, aelb aelbVar, afjf afjfVar, aarn aarnVar, aaox aaoxVar) {
        aejb aejbVar;
        synchronized (this.p) {
            if (TextUtils.equals(this.r, str) && str != null && TimeUnit.MILLISECONDS.toSeconds(this.d.d() - this.s) < 10 && (aejbVar = this.q) != null) {
                return aejbVar;
            }
            this.q = this.e.a(aaoxVar, aelwVar, aelbVar, afjfVar, aarnVar);
            this.r = str;
            this.s = this.d.d();
            return this.q;
        }
    }

    @Override // defpackage.aelm
    public final aejb b(final aarn aarnVar, final aaox aaoxVar, final ysl yslVar, acsx acsxVar, boolean z) {
        final afjf c = c(acsxVar);
        c.V();
        boolean z2 = !aaoxVar.j;
        final aesn a = this.j.a(aaoxVar.b);
        aelw aelwVar = new aelw(this.h, aaoxVar.b, this.f);
        try {
            aelc i = aelz.i(this.c, this.i, this.d);
            if (aaoxVar.g == null) {
                d(yslVar, aarnVar);
                return adyu.n();
            }
            final aejb a2 = a(aaoxVar.b, aelwVar, adyu.l(i), c, aarnVar, aaoxVar);
            if (z) {
                f(yslVar, aaoxVar, aarnVar, a2, a, c);
            } else {
                this.b.execute(new Runnable() { // from class: aelg
                    @Override // java.lang.Runnable
                    public final void run() {
                        aelk.this.f(yslVar, aaoxVar, aarnVar, a2, a, c);
                    }
                });
            }
            return a2;
        } catch (aelx e) {
            int i2 = e.a;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                aelwVar.c("unavailable.hotconfig", e);
            } else if (i3 == 1) {
                aelwVar.c("unavailable.keyexpired", e);
            }
            if (z2) {
                d(yslVar, aarnVar);
            }
            return adyu.n();
        }
    }

    public final afjf c(acsx acsxVar) {
        afjf afjfVar = this.l;
        if (acsxVar != null && !(acsxVar instanceof acsz)) {
            if (this.k.p().B) {
                afjfVar = this.v.m(acsxVar);
            }
            afjfVar.D();
        }
        return afjfVar;
    }

    public final void d(ysl yslVar, aarn aarnVar) {
        if (this.k.r().q) {
            return;
        }
        yslVar.a(aarnVar);
    }

    public final void e(final aaox aaoxVar, final aesn aesnVar, final afjf afjfVar) {
        if (this.k.q().v) {
            this.o.post(new Runnable() { // from class: aelh
                @Override // java.lang.Runnable
                public final void run() {
                    aelk aelkVar = aelk.this;
                    ((aemv) aelkVar.a.get()).s(aaoxVar, aesnVar, afjfVar);
                }
            });
        } else {
            ((aemv) this.a.get()).s(aaoxVar, aesnVar, afjfVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(ysl yslVar, aaox aaoxVar, aarn aarnVar, aejb aejbVar, aesn aesnVar, afjf afjfVar) {
        Boolean bool;
        atys atysVar;
        this.g.b(aesnVar, aaoxVar.b);
        aeis aeisVar = (aeis) aejbVar;
        aeisVar.o();
        aqvj aqvjVar = this.t.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45358592L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45358592L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45358592L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        if (!aaoxVar.j || booleanValue) {
            if (!aaoxVar.g() && yslVar != null && aarnVar != null) {
                anaf.Y(aeisVar.f, new aelj(this, aarnVar, yslVar), angq.a);
            }
            if (aaoxVar.j && booleanValue) {
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayrz.c((AtomicReference) this.u.k().ax(new lgx(atomicBoolean, 7)));
            if (atomicBoolean.get()) {
                return;
            }
            aaea aaeaVar = this.c;
            if (aaeaVar == null || aaeaVar.a() == null) {
                atysVar = atys.a;
            } else {
                atysVar = aaeaVar.a().j;
                if (atysVar == null) {
                    atysVar = atys.a;
                }
            }
            if (atysVar.S) {
                return;
            }
            e(aaoxVar, aesnVar, afjfVar);
        }
    }

    public final void g(aaox aaoxVar, byte[] bArr, afjf afjfVar) {
        PlayerResponseModel playerResponseModel;
        VideoStreamingData videoStreamingData;
        aryr aryrVar = (aryr) this.n.a(bArr, aryr.a);
        if (aryrVar == null) {
            aelz.g("Invalid prefetched ads PlayerResponse");
            return;
        }
        if ((aryrVar.b & 8) != 0) {
            aryv aryvVar = aryrVar.h;
            if (aryvVar == null) {
                aryvVar = aryv.a;
            }
            if (aryvVar.l.isEmpty() || (videoStreamingData = (playerResponseModel = new PlayerResponseModel(aryrVar, 0L, this.m)).c) == null || videoStreamingData.e() == null) {
                return;
            }
            aaoxVar.f(videoStreamingData.c);
            if (this.k.ad()) {
                aaoxVar.d(videoStreamingData, playerResponseModel.c());
            } else {
                aaoxVar.c(videoStreamingData);
            }
            aaoxVar.e(playerResponseModel.c().F());
            try {
                f(null, aaoxVar, null, a(null, new aelw(this.h, aaoxVar.b, this.f), null, afjfVar, null, aaoxVar), this.j.a(aaoxVar.b), afjfVar);
            } catch (RuntimeException e) {
                aelz.j("LoadOnesieVideo for prefetched ads playbacks got an exception.", e);
            }
        }
    }
}
