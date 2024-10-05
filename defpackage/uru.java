package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uru implements upq, urj {
    public final Application a;
    public final axpg b;
    public final upo c;
    public final ury d;
    private final anic e;
    private final unq f;
    private final boolean g;
    private final urt h;

    public uru() {
    }

    public uru(upp uppVar, Context context, urt urtVar, anic anicVar, axpg axpgVar, ury uryVar, unq unqVar, azrw azrwVar, Executor executor) {
        this();
        new AtomicReference(urm.a);
        new ConcurrentHashMap();
        this.h = urtVar;
        this.f = unqVar;
        this.c = uppVar.a(executor, axpgVar, azrwVar);
        this.a = (Application) context;
        this.e = anicVar;
        this.b = axpgVar;
        this.d = uryVar;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        this.g = bool.booleanValue();
    }

    public static boolean d(int i) {
        return i != 1;
    }

    @Override // defpackage.upq, defpackage.uyo
    public final void a() {
        if (this.g) {
            c();
        }
    }

    @Override // defpackage.urj
    public final synchronized void b(String str) {
        amkq.E(true);
        e(str, false, 1, null);
    }

    public final void c() {
        this.h.a = new urs() { // from class: urv
            @Override // defpackage.urs
            public final void a(int i, String str) {
                uru.this.e(null, true, i, str);
            }
        };
    }

    public final void e(final String str, final boolean z, final int i, final String str2) {
        if (this.f.b) {
            anaf.M();
        } else {
            anaf.T(new anfy() { // from class: urw
                @Override // defpackage.anfy
                public final anhy a() {
                    long a;
                    uru uruVar = uru.this;
                    int i2 = i;
                    String str3 = str;
                    boolean z2 = z;
                    String str4 = str2;
                    url urlVar = (url) uruVar.b.get();
                    if (uru.d(i2)) {
                        int i3 = urlVar.f;
                        a = -1;
                    } else {
                        a = uruVar.c.a(str3);
                    }
                    if (a == -1) {
                        return anhv.a;
                    }
                    if (urlVar.c) {
                        System.gc();
                        System.runFinalization();
                        System.gc();
                    }
                    ammv ammvVar = urlVar.b;
                    if (!urlVar.a) {
                        aone createBuilder = bact.a.createBuilder();
                        babm b = uruVar.d.b(i2, Process.myPid(), null, str4);
                        createBuilder.copyOnWrite();
                        bact bactVar = (bact) createBuilder.instance;
                        b.getClass();
                        bactVar.c = b;
                        bactVar.b |= 1;
                        bact bactVar2 = (bact) createBuilder.build();
                        upj a2 = upk.a();
                        a2.a = str3;
                        a2.b(z2);
                        a2.d = Long.valueOf(a);
                        a2.d(bactVar2);
                        a2.b = null;
                        if (uru.d(i2)) {
                            a2.c(true);
                        }
                        return uruVar.c.b(a2.a());
                    }
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = uon.a(uruVar.a).getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return anhv.a;
                    }
                    ArrayList arrayList = new ArrayList(runningAppProcesses.size());
                    String packageName = uruVar.a.getPackageName();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (Build.VERSION.SDK_INT > 22 || runningAppProcessInfo.processName.contains(packageName)) {
                            aone createBuilder2 = bact.a.createBuilder();
                            babm b2 = uruVar.d.b(i2, runningAppProcessInfo.pid, runningAppProcessInfo.processName, str4);
                            createBuilder2.copyOnWrite();
                            bact bactVar3 = (bact) createBuilder2.instance;
                            b2.getClass();
                            bactVar3.c = b2;
                            bactVar3.b |= 1;
                            bact bactVar4 = (bact) createBuilder2.build();
                            upj a3 = upk.a();
                            a3.a = str3;
                            a3.b(z2);
                            a3.d = Long.valueOf(a);
                            a3.d(bactVar4);
                            a3.b = null;
                            if (uru.d(i2)) {
                                a3.c(true);
                            }
                            arrayList.add(uruVar.c.b(a3.a()));
                        }
                    }
                    return anaf.J(arrayList).a(anaf.aa(), angq.a);
                }
            }, this.e);
        }
    }
}
