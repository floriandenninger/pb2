package defpackage;

import android.app.Application;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetector;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorV2;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Consumer;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akpv {
    public final akpt a;
    private final aktq b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final Optional g;
    private final amrw h = new amrw();
    private final amrw i = new amrw();
    private boolean j;

    public akpv(aktq aktqVar, akpt akptVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, Optional optional) {
        this.b = aktqVar;
        this.a = akptVar;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
        this.f = azrwVar4;
        this.g = optional;
    }

    public final void a() {
        this.j = true;
        avdy avdyVar = this.b.get();
        if (avdyVar.c) {
            akrq akrqVar = (akrq) this.f.get();
            for (Map.Entry entry : this.h.c().entrySet()) {
                String str = (String) entry.getKey();
                aktk aktkVar = (aktk) ((azrw) entry.getValue()).get();
                akrs akrsVar = (akrs) akrqVar.e.get();
                synchronized (akrsVar.a) {
                    akrsVar.b.put(str, aktkVar);
                }
            }
            for (Map.Entry entry2 : this.i.c().entrySet()) {
                String str2 = (String) entry2.getKey();
                akqj akqjVar = (akqj) ((azrw) entry2.getValue()).get();
                akrr akrrVar = (akrr) akrqVar.d.get();
                synchronized (akrrVar.a) {
                    akrrVar.e.put(str2, akqjVar);
                }
            }
            akrqVar.b(avdyVar);
        }
        yyy yyyVar = this.a.a.e;
        if (yyyVar.q == 0) {
            aksw akswVar = (aksw) this.c.get();
            if (akswVar.a > 0) {
                akswVar.e.start();
            }
        }
        if (yyyVar.r == 0) {
            ((NativeCrashDetector) this.d.get()).b();
        }
    }

    public final void d(String str, azrw azrwVar) {
        if (this.j) {
            throw new IllegalStateException("Capturer cannot be added once SystemInitializer has been initialized ");
        }
        this.i.g(str, azrwVar);
    }

    public final void e(String str, azrw azrwVar) {
        if (this.j) {
            throw new IllegalStateException("Transmitter cannot be added once SystemInitializer has been initialized");
        }
        this.h.g(str, azrwVar);
    }

    public final void b() {
        akpt akptVar = this.a;
        yyy yyyVar = akptVar.a.e;
        int i = yyyVar.q;
        if (i == 2) {
            aktd c = akptVar.c();
            int i2 = akso.a;
            aktc aktcVar = new aktc();
            c.f.set(aktcVar);
            Application application = (Application) c.h.b;
            application.registerActivityLifecycleCallbacks(aktcVar);
            application.registerComponentCallbacks(aktcVar);
            c.h.g.a();
        } else if (i == 1) {
            akta b = akptVar.b();
            b.d.set((aksp) this.e.get());
            b.e.g.a();
        }
        if (yyyVar.s == 1) {
            this.a.d();
        }
        final akrx akrxVar = (akrx) this.a.c.get();
        aksd aksdVar = (aksd) akrxVar.b.get();
        if (aksdVar.f() == 3) {
            float f = aksdVar.b;
            if (f < 0.0f) {
                aksc akscVar = aksdVar.a;
                f = ThreadLocalRandom.current().nextFloat();
                aksdVar.b = f;
            }
            if (f <= aksdVar.a()) {
                final long g = akrxVar.d.g();
                akrxVar.g = aksdVar.e();
                int max = Math.max(aksdVar.b() - ((int) (g - akrxVar.f)), 0);
                aksa a = aksb.a(akrxVar.a, aksdVar.d());
                a.d = aksdVar.c();
                a.e = max;
                a.a = new Runnable() { // from class: akrv
                    @Override // java.lang.Runnable
                    public final void run() {
                        akrx akrxVar2 = akrx.this;
                        akrxVar2.h.add(akrxVar2.g.call());
                    }
                };
                a.c = nvp.i;
                a.b = new Runnable() { // from class: akrw
                    @Override // java.lang.Runnable
                    public final void run() {
                        akrx akrxVar2 = akrx.this;
                        long j = g;
                        acpl acplVar = (acpl) akrxVar2.c.get();
                        arpn a2 = arpp.a();
                        aone createBuilder = avdf.a.createBuilder();
                        aone createBuilder2 = avdg.a.createBuilder();
                        aone createBuilder3 = avdb.a.createBuilder();
                        aone createBuilder4 = aqcr.a.createBuilder();
                        createBuilder4.ac(akrxVar2.h);
                        int i3 = akrxVar2.e;
                        createBuilder4.copyOnWrite();
                        aqcr aqcrVar = (aqcr) createBuilder4.instance;
                        aqcrVar.b |= 1;
                        aqcrVar.d = i3;
                        aqcr aqcrVar2 = (aqcr) createBuilder4.build();
                        createBuilder3.copyOnWrite();
                        avdb avdbVar = (avdb) createBuilder3.instance;
                        aqcrVar2.getClass();
                        avdbVar.c = aqcrVar2;
                        avdbVar.b |= 1;
                        aksd aksdVar2 = (aksd) akrxVar2.b.get();
                        long g2 = akrxVar2.d.g();
                        aone createBuilder5 = avda.a.createBuilder();
                        int b2 = aksdVar2.b();
                        createBuilder5.copyOnWrite();
                        avda avdaVar = (avda) createBuilder5.instance;
                        avdaVar.b |= 8;
                        avdaVar.f = b2 / 1000.0f;
                        createBuilder5.copyOnWrite();
                        avda avdaVar2 = (avda) createBuilder5.instance;
                        avdaVar2.b |= 2;
                        avdaVar2.d = ((float) (g2 - j)) / 1000.0f;
                        int d = aksdVar2.d();
                        createBuilder5.copyOnWrite();
                        avda avdaVar3 = (avda) createBuilder5.instance;
                        avdaVar3.b |= 1;
                        avdaVar3.c = d / 1000.0f;
                        float a3 = aksdVar2.a();
                        createBuilder5.copyOnWrite();
                        avda avdaVar4 = (avda) createBuilder5.instance;
                        avdaVar4.b |= 16;
                        avdaVar4.g = a3;
                        createBuilder5.copyOnWrite();
                        avda avdaVar5 = (avda) createBuilder5.instance;
                        avdaVar5.e = 2;
                        avdaVar5.b |= 4;
                        avda avdaVar6 = (avda) createBuilder5.build();
                        createBuilder3.copyOnWrite();
                        avdb avdbVar2 = (avdb) createBuilder3.instance;
                        avdaVar6.getClass();
                        avdbVar2.d = avdaVar6;
                        avdbVar2.b |= 2;
                        avdb avdbVar3 = (avdb) createBuilder3.build();
                        createBuilder2.copyOnWrite();
                        avdg avdgVar = (avdg) createBuilder2.instance;
                        avdbVar3.getClass();
                        avdgVar.j = avdbVar3;
                        avdgVar.b |= 1024;
                        avdg avdgVar2 = (avdg) createBuilder2.build();
                        createBuilder.copyOnWrite();
                        avdf avdfVar = (avdf) createBuilder.instance;
                        avdgVar2.getClass();
                        avdfVar.c = avdgVar2;
                        avdfVar.b |= 1;
                        avdf avdfVar2 = (avdf) createBuilder.build();
                        a2.copyOnWrite();
                        ((arpp) a2.instance).dK(avdfVar2);
                        acplVar.c((arpp) a2.build());
                    }
                };
                akrxVar.i = a.a();
                akrxVar.i.d();
            }
        }
        this.g.ifPresent(new Consumer() { // from class: akpu
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                final azrw azrwVar = (azrw) obj;
                final yyf yyfVar = akpv.this.a.a.g;
                yyfVar.c(yyf.e, 2);
                ((Executor) yyfVar.g.get()).execute(new Runnable() { // from class: yye
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((aof) azrwVar.get()).b(yyf.this.h);
                    }
                });
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(boolean z, azrw azrwVar) {
        File[] listFiles;
        apfh apfhVar;
        File[] fileArr;
        akpt akptVar = this.a;
        yyy yyyVar = akptVar.a.e;
        if (!z) {
            if (yyyVar.r == 0) {
                NativeCrashDetector nativeCrashDetector = (NativeCrashDetector) this.d.get();
                avdv avdvVar = nativeCrashDetector.a.get().l;
                if (avdvVar == null) {
                    avdvVar = avdv.a;
                }
                if (avdvVar.b) {
                    File a = nativeCrashDetector.a();
                    if (!a.exists() || (listFiles = a.listFiles()) == null) {
                        return;
                    }
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            yjk.u(file);
                        } else if (file.delete()) {
                            aone createBuilder = apfh.a.createBuilder();
                            createBuilder.copyOnWrite();
                            apfh apfhVar2 = (apfh) createBuilder.instance;
                            apfhVar2.c = 10;
                            apfhVar2.b |= 1;
                            apfh apfhVar3 = (apfh) createBuilder.build();
                            acpl acplVar = nativeCrashDetector.b;
                            arpn a2 = arpp.a();
                            a2.copyOnWrite();
                            ((arpp) a2.instance).cb(apfhVar3);
                            acplVar.c((arpp) a2.build());
                        } else {
                            afsi.b(1, 27, "Unable to delete native crash dumps.");
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i = yyyVar.q;
        if (i == 2) {
            akst.b(akptVar.c().h, azrwVar);
        } else if (i == 1) {
            akst.b(akptVar.b().e, azrwVar);
        }
        if (yyyVar.r == 1) {
            NativeCrashDetectorV2 nativeCrashDetectorV2 = (NativeCrashDetectorV2) this.a.b.get();
            File a3 = nativeCrashDetectorV2.a();
            try {
                fileArr = a3.listFiles();
            } catch (SecurityException e) {
                afsi.c(1, 27, String.format("!list '%s'", a3), e);
                fileArr = null;
            }
            if (fileArr != null) {
                acpl acplVar2 = (acpl) azrwVar.get();
                String l = Long.toString(nativeCrashDetectorV2.a.c);
                for (File file2 : fileArr) {
                    if (!file2.getName().equals(l)) {
                        if (file2.isDirectory()) {
                            yjk.u(file2);
                        } else if (file2.delete()) {
                            aone createBuilder2 = apfh.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            apfh apfhVar4 = (apfh) createBuilder2.instance;
                            apfhVar4.c = 10;
                            apfhVar4.b |= 1;
                            apfh apfhVar5 = (apfh) createBuilder2.build();
                            arpn a4 = arpp.a();
                            a4.copyOnWrite();
                            ((arpp) a4.instance).cb(apfhVar5);
                            acplVar2.c((arpp) a4.build());
                        } else {
                            afsi.b(1, 27, String.format("!del '%s'", file2));
                        }
                    }
                }
            }
        }
        if (yyyVar.s == 1) {
            for (File file3 : akbc.p(this.a.d().a, akth.JAVA_CRASH)) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file3);
                    try {
                        apfhVar = (apfh) aonm.parseFrom(apfh.a, fileInputStream, aomw.b());
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                        break;
                    }
                } catch (Exception e2) {
                    akbc.r(String.format("JavaCrashJournalV2 !read '%s'", file3), e2);
                    apfhVar = null;
                }
                if (apfhVar != null) {
                    String.valueOf(String.valueOf(apfhVar)).length();
                    arpn a5 = arpp.a();
                    a5.copyOnWrite();
                    ((arpp) a5.instance).cb(apfhVar);
                    arpp arppVar = (arpp) a5.build();
                    avdg avdgVar = apfhVar.e;
                    if (avdgVar == null) {
                        avdgVar = avdg.a;
                    }
                    avdc avdcVar = avdgVar.g;
                    if (avdcVar == null) {
                        avdcVar = avdc.a;
                    }
                    ((acpl) azrwVar.get()).f(arppVar, avdcVar.e);
                }
                akbc.q(file3);
            }
        }
    }
}
