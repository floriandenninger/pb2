package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhq extends acuo implements adhd {
    public final shf d;
    public final Executor e;
    public final ajoy f;
    private final adhf h;
    private final adeg i;
    private final azrw j;
    private final azrw k;
    private final aioc l;
    private final ayqw m;
    private adhp n;
    private final adhs o;
    private final adhm p;
    private adhp q;
    public static final String a = zga.a("MDX.ContinueWatchingNotification");
    private static final long g = TimeUnit.HOURS.toMillis(3);
    static final long b = TimeUnit.SECONDS.toMillis(120);
    static final long c = TimeUnit.DAYS.toMillis(3);

    public adhq(adhf adhfVar, adeg adegVar, azrw azrwVar, adhs adhsVar, ajoy ajoyVar, shf shfVar, azrw azrwVar2, aioc aiocVar, acvm acvmVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(acvmVar);
        this.m = new ayqw();
        this.p = new adhm(this);
        this.h = adhfVar;
        this.i = adegVar;
        this.j = azrwVar;
        this.o = adhsVar;
        this.f = ajoyVar;
        this.d = shfVar;
        this.k = azrwVar2;
        this.l = aiocVar;
        this.e = executor;
    }

    public static /* synthetic */ void k(Throwable th) {
        zga.d("Failed to record notification hidden.", th);
    }

    @Override // defpackage.acvj
    public final anhy a() {
        return anfq.h(this.f.p(), aczu.k, angq.a);
    }

    @Override // defpackage.acvj
    public final String b() {
        return "continue-watching";
    }

    @Override // defpackage.acvj
    public final void c(final amru amruVar) {
        anaf.Y(anfq.h(anfq.i(anht.q(this.f.p()), new anfz() { // from class: adhj
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                adhq adhqVar = adhq.this;
                if (!((Boolean) obj).booleanValue()) {
                    return anaf.O(null);
                }
                return anfq.h(((vgz) adhqVar.f.a.get()).a(), aczu.h, angq.a);
            }
        }, angq.a), new amml() { // from class: adhi
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                final adhq adhqVar = adhq.this;
                final amru amruVar2 = amruVar;
                final String str = (String) obj;
                if (ammx.e(str)) {
                    return null;
                }
                ynm.k(adhqVar.f.q(), adhqVar.e, new ynk() { // from class: adhg
                    @Override // defpackage.zfi
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        adhq adhqVar2 = adhq.this;
                        amru amruVar3 = amruVar2;
                        String str2 = str;
                        zga.d("Failed to red the lastTimeShownTimestamp from disk.", th);
                        adhqVar2.j(amruVar3, str2, 0L);
                    }
                }, new ynl() { // from class: adhh
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj2) {
                        adhq.this.j(amruVar2, str, ((Long) obj2).longValue());
                    }
                });
                return null;
            }
        }, angq.a), new adhk(0), angq.a);
    }

    @Override // defpackage.acvj
    public final void d() {
        e();
    }

    @Override // defpackage.adhd
    public final void e() {
        this.h.d.d("continue-watching", 6);
        ynm.m(this.f.r(), adha.d);
    }

    @Override // defpackage.adhd
    public final void f() {
        yjk.f();
        if (this.q == null) {
            adhp adhpVar = new adhp(this, 1);
            this.q = adhpVar;
            this.m.g(adhpVar.kI(this.l));
        }
        if (this.n == null) {
            adhp adhpVar2 = new adhp(this, 0);
            this.n = adhpVar2;
            this.m.g(adhpVar2.kI(this.l));
        }
    }

    @Override // defpackage.adhd
    public final void g() {
        yjk.f();
        if (this.q != null) {
            this.m.c();
            this.q = null;
        }
    }

    @Override // defpackage.adhd
    public final void i() {
        long j;
        aixh n;
        PlayerResponseModel c2;
        try {
            j = ((Long) ynm.e(this.f.q(), aczu.l, 1L, TimeUnit.SECONDS)).longValue();
        } catch (Exception unused) {
            j = 0;
        }
        if (((Boolean) this.k.get()).booleanValue() || j == 0 || this.d.c() - j >= c) {
            Boolean bool = false;
            try {
                bool = (Boolean) ynm.e(anfq.h(((vgz) this.f.a.get()).a(), aczu.e, angq.a), aczu.l, 1L, TimeUnit.SECONDS);
            } catch (Exception unused2) {
            }
            if (bool.booleanValue()) {
                return;
            }
            adhs adhsVar = this.o;
            adch adchVar = adhsVar.b;
            Context context = adhsVar.a;
            List a2 = adchVar.a();
            int i = 1;
            bpv bpvVar = a2.size() != 1 ? null : (bpv) a2.get(0);
            if (bpvVar == null || (n = ((ainy) this.j.get()).n()) == null || (c2 = n.c()) == null) {
                return;
            }
            long h = ((ainy) this.j.get()).h();
            long b2 = n.b();
            long j2 = h - b2;
            String valueOf = String.valueOf(((ainy) this.j.get()).q());
            if (valueOf.length() != 0) {
                "videoId:".concat(valueOf);
            }
            String valueOf2 = String.valueOf(((ainy) this.j.get()).p());
            if (valueOf2.length() != 0) {
                "playlistId:".concat(valueOf2);
            }
            String valueOf3 = String.valueOf(((ainy) this.j.get()).p());
            if (valueOf3.length() != 0) {
                "playlistIndex:".concat(valueOf3);
            }
            if (j2 >= b) {
                String str = bpvVar.d;
                acvc a3 = acvd.a();
                a3.b(str);
                a3.c(bpvVar.c);
                if (this.i.f(bpvVar)) {
                    i = 2;
                } else {
                    int r = adgb.r(bpvVar.q);
                    if (r != 0) {
                        i = r;
                    }
                }
                a3.e(i);
                adld c3 = adle.c();
                c3.f(((ainy) this.j.get()).q());
                c3.b(b2);
                c3.d(((ainy) this.j.get()).p());
                c3.e(((ainy) this.j.get()).g());
                a3.a = c3.a();
                acvd a4 = a3.a();
                adhf adhfVar = this.h;
                String x = c2.x();
                aami b3 = c2.b();
                adhm adhmVar = this.p;
                Resources resources = adhfVar.a.getResources();
                aamh b4 = b3.b(resources.getDimensionPixelSize(R.dimen.notification_big_picture_icon_width), resources.getDimensionPixelSize(R.dimen.notification_big_picture_icon_height));
                if (b4 != null) {
                    adhfVar.c.l(b4.a(), new adhe(adhfVar, resources, x, str, a4, adhmVar));
                }
            }
        }
    }

    public final void j(amru amruVar, String str, long j) {
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            if (adeg.c(str, ((bpv) amruVar.get(i)).c) && this.d.c() - j < g) {
                return;
            }
        }
        e();
    }
}
