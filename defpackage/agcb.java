package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class agcb implements agcf {
    public static final amml a = new hom(5);
    public final zfm b;
    public final ajbh c;
    private final String d;
    private final agaf e;
    private final ScheduledExecutorService f;
    private final afyt g;
    private final Context h;
    private final shf i;
    private final aaea j;
    private final ysy k;
    private final agch l;
    private final azrw m;
    private final aaxn n;

    public agcb(agaf agafVar, aaxn aaxnVar, ScheduledExecutorService scheduledExecutorService, zfm zfmVar, afyt afytVar, Context context, shf shfVar, aaea aaeaVar, ysy ysyVar, agch agchVar, azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ajbh ajbhVar = new ajbh((short[]) null);
        zhq.m("414843287017");
        this.d = "414843287017";
        this.e = agafVar;
        this.n = aaxnVar;
        this.f = scheduledExecutorService;
        this.b = zfmVar;
        this.g = afytVar;
        this.h = context;
        this.i = shfVar;
        this.j = aaeaVar;
        this.k = ysyVar;
        this.c = ajbhVar;
        this.l = agchVar;
        this.m = azrwVar;
    }

    private final void i() {
        int P = this.c.P(agcg.FINISHED_REGISTRATION);
        int i = P - 1;
        if (P == 0) {
            throw null;
        }
        if (i == 1) {
            j();
        } else {
            if (i != 2) {
                return;
            }
            c(agci.UNKNOWN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcb.j():void");
    }

    @Override // defpackage.agcf
    public final ammv a() {
        return ammv.j(this.e.s());
    }

    @Override // defpackage.agcf
    public final void b(final agce agceVar) {
        this.f.execute(new Runnable() { // from class: agca
            @Override // java.lang.Runnable
            public final void run() {
                agcb agcbVar = agcb.this;
                agce agceVar2 = agceVar;
                if (agcbVar.c.P(agcg.REGISTRATION_FORCED) == 3) {
                    Object apply = agcb.a.apply(agceVar2);
                    apply.getClass();
                    agcbVar.c((agci) apply);
                }
            }
        });
    }

    public final void c(agci agciVar) {
        List<NotificationChannel> list;
        azrw azrwVar = this.m;
        String str = agciVar.j;
        boolean z = false;
        if (afzz.d(this.j, azrwVar)) {
            ((viz) ((aksl) azrwVar.get()).o.get()).b(str);
        }
        boolean g = g();
        yjk.e();
        String str2 = (String) ((amna) a()).a;
        if (!TextUtils.isEmpty(str2)) {
            zfo a2 = this.b.a();
            aaxn aaxnVar = this.n;
            abah abahVar = new abah(aaxnVar.f, aaxnVar.a.c(), null, null, null);
            aone aoneVar = abahVar.b;
            aomf z2 = aomf.z(str2);
            aoneVar.copyOnWrite();
            atns atnsVar = (atns) aoneVar.instance;
            atns atnsVar2 = atns.a;
            atnsVar.b |= 1;
            atnsVar.c = z2;
            String str3 = this.d;
            aone aoneVar2 = abahVar.b;
            aoneVar2.copyOnWrite();
            atns atnsVar3 = (atns) aoneVar2.instance;
            atnsVar3.b |= 8;
            atnsVar3.f = str3;
            boolean booleanValue = ((Boolean) ynm.f(this.g.c(), true)).booleanValue();
            if (!booleanValue) {
                aone aoneVar3 = abahVar.b;
                aoneVar3.copyOnWrite();
                atns atnsVar4 = (atns) aoneVar3.instance;
                atnsVar4.b |= 2;
                atnsVar4.d = true;
            }
            boolean E = aear.E(this.h);
            if (!E) {
                aone aoneVar4 = abahVar.b;
                aoneVar4.copyOnWrite();
                atns atnsVar5 = (atns) aoneVar4.instance;
                atnsVar5.b |= 4;
                atnsVar5.e = true;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                list = ((NotificationManager) this.h.getSystemService("notification")).getNotificationChannels();
                for (NotificationChannel notificationChannel : list) {
                    aone createBuilder = atnr.a.createBuilder();
                    String id = notificationChannel.getId();
                    createBuilder.copyOnWrite();
                    atnr atnrVar = (atnr) createBuilder.instance;
                    id.getClass();
                    atnrVar.b |= 1;
                    atnrVar.c = id;
                    int importance = notificationChannel.getImportance();
                    createBuilder.copyOnWrite();
                    atnr atnrVar2 = (atnr) createBuilder.instance;
                    atnrVar2.b |= 2;
                    atnrVar2.d = importance;
                    boolean z3 = notificationChannel.getSound() != null;
                    createBuilder.copyOnWrite();
                    atnr atnrVar3 = (atnr) createBuilder.instance;
                    atnrVar3.b |= 4;
                    atnrVar3.e = z3;
                    boolean canShowBadge = notificationChannel.canShowBadge();
                    createBuilder.copyOnWrite();
                    atnr atnrVar4 = (atnr) createBuilder.instance;
                    atnrVar4.b |= 8;
                    atnrVar4.f = canShowBadge;
                    boolean shouldShowLights = notificationChannel.shouldShowLights();
                    createBuilder.copyOnWrite();
                    atnr atnrVar5 = (atnr) createBuilder.instance;
                    atnrVar5.b |= 16;
                    atnrVar5.g = shouldShowLights;
                    boolean canBypassDnd = notificationChannel.canBypassDnd();
                    createBuilder.copyOnWrite();
                    atnr atnrVar6 = (atnr) createBuilder.instance;
                    atnrVar6.b |= 32;
                    atnrVar6.h = canBypassDnd;
                    int lockscreenVisibility = notificationChannel.getLockscreenVisibility();
                    createBuilder.copyOnWrite();
                    atnr atnrVar7 = (atnr) createBuilder.instance;
                    atnrVar7.b |= 64;
                    atnrVar7.i = lockscreenVisibility;
                    abahVar.a.add((atnr) createBuilder.build());
                }
            } else {
                list = null;
            }
            List<NotificationChannel> list2 = list;
            while (true) {
                try {
                    afyt afytVar = this.g;
                    agaf agafVar = this.e;
                    Context context = this.h;
                    shf shfVar = this.i;
                    boolean d = afytVar.d(context);
                    ammv h = agafVar.h();
                    if (!agafVar.i().h() || !h.h() || ((Boolean) h.c()).booleanValue() != d) {
                        ynm.m(agafVar.q(shfVar.c()), afka.k);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(agafVar.p(E));
                    arrayList.add(agafVar.n(booleanValue));
                    if (Build.VERSION.SDK_INT >= 26 && list2 != null) {
                        for (NotificationChannel notificationChannel2 : list2) {
                            arrayList.add(agafVar.o(notificationChannel2.getId(), new agad(notificationChannel2.getImportance(), notificationChannel2.getSound() == null)));
                        }
                    }
                    try {
                        anaf.H(arrayList).c(anij.a, angq.a).get();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (ExecutionException unused2) {
                        zga.b("Failed to store notification settings to disk");
                    }
                    f("INNERTUBE_SUCCESS");
                    z = true;
                    break;
                } catch (aasx | IllegalStateException e) {
                    zga.n("Could not register for notifications with InnerTube: ", e);
                    if (a2.b()) {
                        f("INNERTUBE_RETRY");
                    } else {
                        f("INNERTUBE_FAILED");
                        z = false;
                        break;
                    }
                }
                f("INNERTUBE_RETRY");
            }
        }
        if (g & z) {
            try {
                ynm.d(this.e.m(new Date().getTime()), afyf.e);
            } catch (Exception e2) {
                zga.d("Failed to store the timestamp", e2);
            }
        }
        i();
    }

    @Override // defpackage.agcf
    public final void d() {
        yjk.e();
        if (this.c.P(agcg.REGISTRATION) == 2) {
            j();
        }
    }

    @Override // defpackage.agcf
    public final void e() {
        this.f.schedule(new Runnable() { // from class: agbz
            @Override // java.lang.Runnable
            public final void run() {
                agcb.this.d();
            }
        }, 3L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str) {
        azrw azrwVar = this.m;
        if (afzz.d(this.j, azrwVar)) {
            ((viz) ((aksl) azrwVar.get()).p.get()).b(str);
        }
    }

    public abstract boolean g();
}
