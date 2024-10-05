package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aldz {
    static final Duration a = Duration.ofHours(10);
    public static final /* synthetic */ int g = 0;
    public final shf b;
    public final ScheduledExecutorService c;
    public final akwm d;
    public final akyb e;
    public final axze f;
    private final aaea h;
    private final albz i;

    public aldz(shf shfVar, ScheduledExecutorService scheduledExecutorService, aaea aaeaVar, akwm akwmVar, axze axzeVar, akyb akybVar, albz albzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = shfVar;
        this.c = scheduledExecutorService;
        this.h = aaeaVar;
        this.d = akwmVar;
        this.f = axzeVar;
        this.e = akybVar;
        this.i = albzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alec a(Iterable iterable, aldq aldqVar) {
        String str = ((alec) iterable.iterator().next()).a;
        aldo aldoVar = ((alec) iterable.iterator().next()).c;
        return new alec(str, this, aldoVar, anfq.i(anaf.U(iterable), new alds(this, str, aldqVar, aldoVar, 0), angq.a));
    }

    public final alec b(Iterable iterable, String str, aldq aldqVar, aldo aldoVar) {
        if (amkq.bm(iterable, akgg.h)) {
            HashSet hashSet = new HashSet();
            ammv ammvVar = amlr.a;
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                aleb alebVar = (aleb) it.next();
                if (!alebVar.b()) {
                    hashSet.addAll(alebVar.b);
                    ammv ammvVar2 = alebVar.c;
                    if (ammvVar2.h()) {
                        if (ammvVar.h()) {
                            Duration duration = (Duration) ammvVar.c();
                            Duration duration2 = (Duration) ammvVar2.c();
                            if (duration.compareTo(duration2) > 0) {
                                duration = duration2;
                            }
                            ammvVar = ammv.j(duration);
                        } else {
                            ammvVar = ammvVar2;
                        }
                    }
                }
            }
            alea a2 = aleb.a(str);
            a2.c(amsx.p(hashSet));
            a2.b(ammvVar);
            aleb a3 = a2.a();
            String f = aldqVar.f();
            String valueOf = String.valueOf(a3);
            f.length();
            String.valueOf(valueOf).length();
            return new alec(str, this, aldoVar, anaf.O(a3));
        }
        aldqVar.f().concat(" unblocked");
        return c(str, aldoVar, aldqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alec c(final String str, final aldo aldoVar, final aldq aldqVar) {
        return new alec(str, this, aldoVar, ambh.a(new ambg() { // from class: aldr
            @Override // defpackage.ambg
            public final Object a(ambf ambfVar) {
                return aldz.this.d(str, aldqVar, aldoVar, new aldy(ambfVar));
            }
        }, TimeUnit.HOURS, this.c));
    }

    public final String d(final String str, final aldq aldqVar, final aldo aldoVar, final aldy aldyVar) {
        this.c.execute(new Runnable() { // from class: aldt
            @Override // java.lang.Runnable
            public final void run() {
                akyq a2;
                anhy p;
                aldz aldzVar = aldz.this;
                aldy aldyVar2 = aldyVar;
                String str2 = str;
                aldq aldqVar2 = aldqVar;
                aldo aldoVar2 = aldoVar;
                if (aldyVar2.d()) {
                    return;
                }
                try {
                    akzs b = aldzVar.d.b(str2);
                    if (b == null) {
                        zga.c("UploadTaskController", "Cannot call executeOrUndoTask because job doesn't exist in database");
                        aldyVar2.a.c(new NullPointerException());
                        return;
                    }
                    akzp b2 = aldqVar2.b(b);
                    boolean z = b2 == null ? false : b.ae;
                    String f = aldqVar2.f();
                    int i = 1;
                    String str3 = true != z ? " execute" : " undo";
                    String concat = str3.length() != 0 ? f.concat(str3) : new String(f);
                    if (b2 != null) {
                        if (alep.j(b2)) {
                            String.valueOf(concat).concat(" skipped because State is already finished");
                            aldzVar.e(str2, b2, aldqVar2, aldoVar2, aldyVar2, concat);
                            return;
                        }
                        int l = akwg.l(b2.c);
                        if (l != 0 && l == 3 && b2.f > aldzVar.b.c()) {
                            String.valueOf(concat).concat(" skipped because RETRY is not ready yet");
                            aldzVar.e(str2, b2, aldqVar2, aldoVar2, aldyVar2, concat);
                            return;
                        }
                    }
                    if (z) {
                        a2 = aldqVar2.l();
                    } else {
                        a2 = aldqVar2.a(b);
                    }
                    if (a2 != null && !b.af) {
                        akyr g2 = a2.g();
                        if (!g2.b) {
                            aldqVar2.f().concat(" halted due to unmet requirements");
                            alea a3 = aleb.a(str2);
                            a3.c(amsx.r(a2));
                            aleb a4 = a3.a();
                            akyb akybVar = aldzVar.e;
                            String str4 = b.e;
                            avtr avtrVar = aldqVar2.j;
                            int i2 = g2.c;
                            aone createBuilder = avtf.a.createBuilder();
                            avta a5 = akybVar.a(str2);
                            createBuilder.copyOnWrite();
                            avtf avtfVar = (avtf) createBuilder.instance;
                            a5.getClass();
                            avtfVar.c = a5;
                            avtfVar.b |= 1;
                            createBuilder.copyOnWrite();
                            avtf avtfVar2 = (avtf) createBuilder.instance;
                            avtfVar2.d = avtrVar.S;
                            avtfVar2.b |= 2;
                            if (i2 == 1) {
                                i = 2;
                            } else if (i2 == 2) {
                                i = 3;
                            } else if (i2 == 3) {
                                i = 4;
                            } else if (i2 == 4) {
                                i = 7;
                            } else if (i2 == 5) {
                                i = 9;
                            }
                            createBuilder.copyOnWrite();
                            avtf avtfVar3 = (avtf) createBuilder.instance;
                            avtfVar3.e = i - 1;
                            avtfVar3.b |= 8;
                            avtf avtfVar4 = (avtf) createBuilder.build();
                            arpn a6 = arpp.a();
                            a6.copyOnWrite();
                            ((arpp) a6.instance).dY(avtfVar4);
                            akybVar.b(str4, (arpp) a6.build());
                            aldyVar2.a.b(a4);
                            return;
                        }
                    }
                    long c = aldzVar.b.c();
                    String.valueOf(concat).concat(" start");
                    if (z) {
                        p = aldqVar2.d(str2, aldzVar.d);
                    } else {
                        akyb akybVar2 = aldzVar.e;
                        String str5 = b.e;
                        avtr avtrVar2 = aldqVar2.j;
                        aone createBuilder2 = avtg.a.createBuilder();
                        avta a7 = akybVar2.a(str2);
                        createBuilder2.copyOnWrite();
                        avtg avtgVar = (avtg) createBuilder2.instance;
                        a7.getClass();
                        avtgVar.c = a7;
                        avtgVar.b |= 1;
                        createBuilder2.copyOnWrite();
                        avtg avtgVar2 = (avtg) createBuilder2.instance;
                        avtgVar2.d = avtrVar2.S;
                        avtgVar2.b |= 2;
                        arpn a8 = arpp.a();
                        a8.copyOnWrite();
                        ((arpp) a8.instance).dZ((avtg) createBuilder2.build());
                        akybVar2.b(str5, (arpp) a8.build());
                        p = aldqVar2.p(str2, aldzVar.d);
                    }
                    aldyVar2.b(p);
                    anaf.Y(p, new aldw(aldzVar, str2, aldqVar2, aldoVar2, aldyVar2, c, z, concat, p), aldzVar.c);
                } catch (akwn e) {
                    zga.f("UploadTaskController", "Storage exception trying to read job before executing upload task", e);
                    aldyVar2.a.c(e);
                }
            }
        });
        String f = aldqVar.f();
        return f.length() != 0 ? "Executing UploadTask ".concat(f) : new String("Executing UploadTask ");
    }

    public final void e(final String str, akzp akzpVar, final aldq aldqVar, final aldo aldoVar, final aldy aldyVar, String str2) {
        if (akzpVar == null) {
            aldyVar.a.b(aleb.a(str).a());
            return;
        }
        int l = akwg.l(akzpVar.c);
        if (l == 0 || l != 3) {
            aldyVar.a.b(aleb.a(str).a());
            return;
        }
        Duration between = Duration.between(Instant.ofEpochMilli(this.b.c()), Instant.ofEpochMilli(akzpVar.f));
        if (between.compareTo(Duration.ZERO) > 0) {
            avuj avujVar = this.h.a().h;
            if (avujVar == null) {
                avujVar = avuj.a;
            }
            long j = avujVar.s;
            if (j == 0) {
                j = a.toMillis();
            }
            if (between.toMillis() <= j) {
                between.getSeconds();
                String.valueOf(str2).length();
                aldyVar.c(this.c.schedule(new Callable() { // from class: aldv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return aldz.this.d(str, aldqVar, aldoVar, aldyVar);
                    }
                }, between.toMillis(), TimeUnit.MILLISECONDS));
                return;
            } else {
                between.getSeconds();
                String.valueOf(str2).length();
                alea a2 = aleb.a(str);
                a2.b(ammv.j(between));
                aldyVar.a.b(a2.a());
                return;
            }
        }
        this.c.execute(new Runnable() { // from class: aldu
            @Override // java.lang.Runnable
            public final void run() {
                aldz.this.d(str, aldqVar, aldoVar, aldyVar);
            }
        });
    }

    public final void f(String str, akwp akwpVar, aldq aldqVar, aldo aldoVar, aldy aldyVar, long j, boolean z, String str2) {
        String str3;
        akzp b;
        if (aldoVar.a()) {
            try {
                akzs b2 = this.d.b(str);
                if (b2 != null && b2.t && !b2.u) {
                    String.valueOf(str2).concat(" interrupted completion.");
                    return;
                }
            } catch (akwn e) {
                this.f.e("Missing job while evaluating interruption, completing with exception.", e);
                zga.c("UploadTaskController", "Missing job while evaluating interruption, completing with exception.");
                aldyVar.a.c(e);
                return;
            }
        }
        try {
            akyc a2 = this.d.a(str, akwpVar);
            this.i.a(a2);
            akzs akzsVar = a2.a;
            akzs akzsVar2 = a2.b;
            if (akzsVar != null) {
                str3 = akzsVar.e;
            } else {
                str3 = akzsVar2 != null ? akzsVar2.e : "";
            }
            if (akzsVar2 == null) {
                String.valueOf(str2).concat(" finished and job removed");
                b = null;
            } else {
                b = aldqVar.b(akzsVar2);
                String valueOf = String.valueOf(b);
                String.valueOf(str2).length();
                String.valueOf(valueOf).length();
            }
            if (!z) {
                int i = 1;
                if (b == null) {
                    aone createBuilder = akzp.a.createBuilder();
                    createBuilder.copyOnWrite();
                    akzp akzpVar = (akzp) createBuilder.instance;
                    akzpVar.c = 1;
                    akzpVar.b |= 1;
                    b = (akzp) createBuilder.build();
                }
                akyb akybVar = this.e;
                avtr avtrVar = aldqVar.j;
                int l = akwg.l(b.c);
                if (l == 0) {
                    l = 1;
                }
                avtq b3 = avtq.b(b.d);
                if (b3 == null) {
                    b3 = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
                }
                aone createBuilder2 = avtc.a.createBuilder();
                avta a3 = akybVar.a(str);
                createBuilder2.copyOnWrite();
                avtc avtcVar = (avtc) createBuilder2.instance;
                a3.getClass();
                avtcVar.c = a3;
                avtcVar.b |= 1;
                createBuilder2.copyOnWrite();
                avtc avtcVar2 = (avtc) createBuilder2.instance;
                avtcVar2.d = avtrVar.S;
                avtcVar2.b |= 2;
                int i2 = l - 1;
                if (i2 == 1) {
                    i = 2;
                } else if (i2 == 2) {
                    i = 3;
                } else if (i2 == 3) {
                    i = 4;
                }
                createBuilder2.copyOnWrite();
                avtc avtcVar3 = (avtc) createBuilder2.instance;
                avtcVar3.e = i - 1;
                avtcVar3.b |= 4;
                createBuilder2.copyOnWrite();
                avtc avtcVar4 = (avtc) createBuilder2.instance;
                avtcVar4.f = b3.aB;
                avtcVar4.b |= 8;
                avtc avtcVar5 = (avtc) createBuilder2.build();
                arpn a4 = arpp.a();
                a4.copyOnWrite();
                ((arpp) a4.instance).dX(avtcVar5);
                akybVar.b(str3, (arpp) a4.build());
                aldqVar.r(this.b.c() - j, akzsVar2);
            }
            e(str, b, aldqVar, aldoVar, aldyVar, str2);
        } catch (akwn e2) {
            aldyVar.a.c(e2);
        }
    }
}
