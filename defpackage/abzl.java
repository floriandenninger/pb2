package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abzl implements abya {
    final acra a;
    final Handler b;
    final Executor c;
    final Executor d;
    final shf e;
    final abde f;
    final abdl g;
    final abdl h;
    final abdl i;
    final aaxn j;
    final abdl k;
    final aaxn l;
    final aaxn m;
    final aaxn n;
    final aaxn o;
    final aaxn p;
    final aaxn q;

    public abzl(acra acraVar, abdl abdlVar, abdl abdlVar2, aaxn aaxnVar, aaxn aaxnVar2, aaxn aaxnVar3, aaxn aaxnVar4, aaxn aaxnVar5, aaxn aaxnVar6, abde abdeVar, abdl abdlVar3, abdl abdlVar4, aaxn aaxnVar7, Handler handler, Executor executor, Executor executor2, shf shfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = acraVar;
        this.k = abdlVar;
        this.i = abdlVar2;
        this.o = aaxnVar;
        this.j = aaxnVar2;
        this.q = aaxnVar3;
        this.m = aaxnVar4;
        this.p = aaxnVar5;
        this.n = aaxnVar6;
        this.f = abdeVar;
        this.h = abdlVar3;
        this.g = abdlVar4;
        this.l = aaxnVar7;
        this.b = handler;
        this.c = executor;
        this.d = executor2;
        this.e = shfVar;
    }

    public static String n(cnq cnqVar) {
        if (cnqVar.b == null) {
            return cnqVar.toString();
        }
        String valueOf = String.valueOf(cnqVar);
        int i = cnqVar.b.a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(" - ");
        sb.append(i);
        return sb.toString();
    }

    public static final int o(int i) {
        switch (i - 1) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
            default:
                return 1;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
        }
    }

    public static final int p(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return 21;
        }
        if (i2 == 3) {
            return 22;
        }
        if (i2 == 5) {
            return 2;
        }
        if (i2 == 6) {
            return 33;
        }
        if (i2 != 9) {
            return i2 != 13 ? 1 : 27;
        }
        return 32;
    }

    @Override // defpackage.abya
    public final void a(final String str, final abxs abxsVar) {
        amkq.E(!str.isEmpty());
        abdm j = this.l.j();
        j.a = str;
        j.k();
        ynm.k(this.l.l(j), this.c, new ynk() { // from class: abye
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                abzl abzlVar = abzl.this;
                final abxs abxsVar2 = abxsVar;
                if (th instanceof cnq) {
                    String valueOf = String.valueOf(abzl.n((cnq) th));
                    zga.b(valueOf.length() != 0 ? "Error deleting video: ".concat(valueOf) : new String("Error deleting video: "));
                } else {
                    zga.d("Error deleting video: ", th);
                }
                abzlVar.b.post(new Runnable() { // from class: abyk
                    @Override // java.lang.Runnable
                    public final void run() {
                        abxs abxsVar3 = abxs.this;
                        if (abxsVar3 != null) {
                            abxsVar3.b();
                        }
                    }
                });
            }
        }, new ynl() { // from class: abyg
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                abxs abxsVar2 = abxs.this;
                String str2 = str;
                if (abxsVar2 != null) {
                    abxsVar2.a(str2);
                }
            }
        });
    }

    @Override // defpackage.abya
    public final void b(String str, abxt abxtVar) {
        aaxn aaxnVar = this.q;
        aaym aaymVar = new aaym(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        aaymVar.a = str;
        aaxn aaxnVar2 = this.q;
        aaxnVar2.b.e(aaymVar, new abyw(this, abxtVar));
    }

    @Override // defpackage.abya
    public final void c(abxu abxuVar) {
        abxuVar.getClass();
        aaxn aaxnVar = this.p;
        aaxnVar.b.e(new aayo(aaxnVar.f, aaxnVar.a.c(), null, null, null), new abzf(this.b, this.a, abxuVar));
    }

    @Override // defpackage.abya
    public final void d(String str, avwv avwvVar, abxw abxwVar) {
        abxwVar.getClass();
        aaxn aaxnVar = this.n;
        aayq aayqVar = new aayq(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        if (str != null) {
            aayqVar.a = str;
        }
        if (avwvVar != null) {
            aayqVar.b = avwvVar;
        }
        aaxn aaxnVar2 = this.n;
        aaxnVar2.b.e(aayqVar, new abzi(this.b, this.a, abxwVar));
    }

    @Override // defpackage.abya
    public final void e(String str, abxx abxxVar) {
        amkq.E(!str.isEmpty());
        abxxVar.getClass();
        abdl abdlVar = this.g;
        aazo aazoVar = new aazo(abdlVar.f, abdlVar.a.c(), null, null, null);
        aazoVar.a = str;
        abdl abdlVar2 = this.g;
        abdlVar2.c(asbk.a, abdlVar2.b, aazd.l, aayn.t).e(aazoVar, new abzc(this, abxxVar));
    }

    @Override // defpackage.abya
    public final void f(String str, final abxy abxyVar) {
        amkq.E(!str.isEmpty());
        abxyVar.getClass();
        aaxn aaxnVar = this.m;
        aayt aaytVar = new aayt(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        aaytVar.a = str;
        ynm.k(this.m.b.b(aaytVar, this.d), this.c, new ynk() { // from class: abyf
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                abzl abzlVar = abzl.this;
                if (th instanceof cnq) {
                    cnq cnqVar = (cnq) th;
                    String valueOf = String.valueOf(abzl.n(cnqVar));
                    zga.b(valueOf.length() != 0 ? "Error updating broadcast participant: ".concat(valueOf) : new String("Error updating broadcast participant: "));
                    cnh cnhVar = cnqVar.b;
                    if (cnhVar == null || cnhVar.a != 403) {
                        abvt.b().n(20, 1, cnqVar);
                        abzlVar.b.post(new omm(12));
                        return;
                    } else {
                        abvt.b().n(20, 2, cnqVar);
                        abzlVar.b.post(new omm(15));
                        return;
                    }
                }
                zga.d("Error updating broadcast participant: ", th);
                abzlVar.b.post(new omm(13));
            }
        }, new ynl() { // from class: abyi
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                aulq aulqVar;
                abzl abzlVar = abzl.this;
                final abxy abxyVar2 = abxyVar;
                final ascq ascqVar = (ascq) obj;
                for (aulq aulqVar2 : ascqVar.c) {
                    if (aulqVar2.pY(asst.a)) {
                        asss asssVar = (asss) aulqVar2.pX(asst.a);
                        int df = amkq.df(asssVar.d);
                        if (df == 0) {
                            df = 1;
                        }
                        int i = asssVar.b;
                        if (i != 5) {
                            if (i == 6 && ((aulq) asssVar.c).pY(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                                if (asssVar.b == 6) {
                                    aulqVar = (aulq) asssVar.c;
                                } else {
                                    aulqVar = aulq.a;
                                }
                            }
                        } else {
                            ajcq.b((aqyg) asssVar.c).toString();
                        }
                        if (df == 2) {
                            abvt.b().n(20, 2, null);
                            abzlVar.b.post(new omm(16));
                            return;
                        }
                    }
                    aulq aulqVar3 = ascqVar.d;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    if (!aulqVar3.pY(ElementRendererOuterClass.elementRenderer)) {
                        abvt.b().n(20, 1, null);
                        abzlVar.b.post(new omm(14));
                        return;
                    }
                }
                abzlVar.b.post(new Runnable() { // from class: abyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        abxy.this.n(ascqVar);
                    }
                });
            }
        });
    }

    @Override // defpackage.abya
    public final void g(String str, final acio acioVar) {
        aaxn aaxnVar = this.j;
        aayl aaylVar = new aayl(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        aaylVar.a = str;
        aaxn aaxnVar2 = this.j;
        ynm.k(aaxnVar2.b.b(aaylVar, this.d), this.c, new ynk() { // from class: abyb
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                abzl abzlVar = abzl.this;
                acio acioVar2 = acioVar;
                cnq cnqVar = (cnq) th;
                zga.c("Error calling AddBroadcastParticipant", abzl.n(cnqVar));
                cnh cnhVar = cnqVar.b;
                if (cnhVar == null || cnhVar.a != 403) {
                    abvt.b().n(19, 1, cnqVar);
                    abzlVar.b.post(new abyj(acioVar2, 0));
                } else {
                    abvt.b().n(19, 2, cnqVar);
                    abzlVar.b.post(new abyj(acioVar2, 1));
                }
            }
        }, new ynl() { // from class: abyh
            /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:2:0x000c->B:30:?, LOOP_END, SYNTHETIC] */
            @Override // defpackage.ynl, defpackage.zfi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r10) {
                /*
                    r9 = this;
                    abzl r0 = defpackage.abzl.this
                    acio r1 = r2
                    ariv r10 = (defpackage.ariv) r10
                    aony r10 = r10.c
                    java.util.Iterator r10 = r10.iterator()
                Lc:
                    boolean r2 = r10.hasNext()
                    r3 = 2
                    if (r2 == 0) goto L8c
                    java.lang.Object r2 = r10.next()
                    aulq r2 = (defpackage.aulq) r2
                    aonk r4 = defpackage.asst.a
                    boolean r4 = r2.pY(r4)
                    r5 = 1
                    r6 = 0
                    if (r4 == 0) goto L69
                    aonk r4 = defpackage.asst.a
                    java.lang.Object r2 = r2.pX(r4)
                    asss r2 = (defpackage.asss) r2
                    int r4 = r2.d
                    int r4 = defpackage.amkq.df(r4)
                    if (r4 != 0) goto L34
                    goto L35
                L34:
                    r5 = r4
                L35:
                    int r4 = r2.b
                    r7 = 5
                    if (r4 != r7) goto L46
                    java.lang.Object r2 = r2.c
                    aqyg r2 = (defpackage.aqyg) r2
                    android.text.Spanned r2 = defpackage.ajcq.b(r2)
                    r2.toString()
                    goto L69
                L46:
                    r7 = 6
                    if (r4 != r7) goto L69
                    java.lang.Object r4 = r2.c
                    aulq r4 = (defpackage.aulq) r4
                    aonk r8 = com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass.confirmDialogRenderer
                    boolean r4 = r4.pY(r8)
                    if (r4 == 0) goto L69
                    int r4 = r2.b
                    if (r4 != r7) goto L5e
                    java.lang.Object r2 = r2.c
                    aulq r2 = (defpackage.aulq) r2
                    goto L60
                L5e:
                    aulq r2 = defpackage.aulq.a
                L60:
                    aonk r4 = com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass.confirmDialogRenderer
                    java.lang.Object r2 = r2.pX(r4)
                    aqdt r2 = (defpackage.aqdt) r2
                    goto L6a
                L69:
                    r2 = r6
                L6a:
                    r4 = 4
                    if (r5 == r3) goto L74
                    r3 = 14
                    if (r5 == r3) goto L74
                    if (r5 != r4) goto Lc
                    r5 = 4
                L74:
                    abvt r10 = defpackage.abvt.b()
                    r3 = 19
                    int r4 = defpackage.abzl.o(r5)
                    r10.n(r3, r4, r6)
                    android.os.Handler r10 = r0.b
                    abyd r0 = new abyd
                    r0.<init>()
                    r10.post(r0)
                    return
                L8c:
                    android.os.Handler r10 = r0.b
                    abyj r0 = new abyj
                    r0.<init>(r1, r3)
                    r10.post(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.abyh.a(java.lang.Object):void");
            }
        });
    }

    @Override // defpackage.abya
    public final void h(String str, abwk abwkVar) {
        amkq.E(!str.isEmpty());
        abdl abdlVar = this.h;
        aazn aaznVar = new aazn(abdlVar.f, abdlVar.a.c(), null, null, null);
        aaznVar.a = str;
        abdl abdlVar2 = this.h;
        abdlVar2.c(asbg.a, abdlVar2.b, aazd.k, aayn.s).e(aaznVar, new abyz(this, abwkVar));
    }

    @Override // defpackage.abya
    public final void i(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, arnn arnnVar, int i, int i2, Place place, Date date, String str3, abxr abxrVar) {
        abxrVar.getClass();
        abdl abdlVar = this.k;
        aazl aazlVar = new aazl(abdlVar.f, abdlVar.a.c(), null, null, null);
        aazlVar.F = i;
        if (str != null) {
            aazlVar.c = str;
        }
        if (str2 != null) {
            aazlVar.d = str2;
        }
        if (bool != null) {
            aazlVar.a = Boolean.valueOf(bool.booleanValue());
        }
        if (bool2 != null) {
            aazlVar.b = Boolean.valueOf(bool2.booleanValue());
        }
        if (bool3 != null) {
            aazlVar.t = Boolean.valueOf(bool3.booleanValue());
        }
        if (bool4 != null) {
            aazlVar.v = bool4;
        }
        if (arnnVar != null) {
            Boolean valueOf = Boolean.valueOf(arnnVar.c);
            Boolean valueOf2 = Boolean.valueOf(arnnVar.d);
            Boolean valueOf3 = Boolean.valueOf(arnnVar.e);
            String str4 = arnnVar.f;
            Boolean valueOf4 = Boolean.valueOf(arnnVar.g);
            String str5 = arnnVar.h;
            if ((arnnVar.b & 1) != 0) {
                aazlVar.s = Boolean.valueOf(valueOf.booleanValue());
                if (valueOf.booleanValue() && (arnnVar.b & 2) != 0) {
                    aazlVar.u = Boolean.valueOf(valueOf2.booleanValue());
                }
            }
            if ((arnnVar.b & 4) != 0) {
                aazlVar.w = valueOf3;
            }
            if (!TextUtils.isEmpty(str4)) {
                aazlVar.x = str4;
            }
            if ((arnnVar.b & 16) != 0) {
                aazlVar.y = valueOf4;
            }
            if (!TextUtils.isEmpty(str5)) {
                aazlVar.z = str5;
            }
        }
        if (place != null) {
            String str6 = place.a;
            String str7 = place.b;
            aazlVar.A = str6;
            aazlVar.B = str7;
        }
        if (date != null) {
            aazlVar.C = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(date.getTime()));
        }
        if (str3 != null) {
            aazlVar.D = str3;
        }
        if (i2 != 0) {
            aazlVar.E = i2;
        }
        abdl abdlVar2 = this.k;
        abdlVar2.c(arnl.a, abdlVar2.b, aazd.h, aayn.p).e(aazlVar, new abyn(this, abxrVar));
    }

    @Override // defpackage.abya
    public final void j(astx astxVar, String str, int i, abxv abxvVar) {
        aaxn aaxnVar = this.o;
        aayp aaypVar = new aayp(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        aaypVar.a = astxVar;
        aaypVar.b = str;
        aaypVar.c = i;
        aaxn aaxnVar2 = this.o;
        aaxnVar2.b.e(aaypVar, new abyt(this, abxvVar));
    }

    @Override // defpackage.abya
    public final void k(aone aoneVar, abxz abxzVar) {
        this.f.b(aoneVar, new abzk(this.b, abxzVar), null);
    }

    @Override // defpackage.abya
    public final aone l(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, arnn arnnVar, arno arnoVar, int i, int i2, abxq abxqVar, Date date, abxq abxqVar2, byte[] bArr) {
        long seconds;
        aone createBuilder;
        aone createBuilder2;
        str.getClass();
        aone createBuilder3 = arvt.a.createBuilder();
        createBuilder3.copyOnWrite();
        arvt arvtVar = (arvt) createBuilder3.instance;
        arvtVar.b |= 2;
        arvtVar.e = str;
        if (str2 != null) {
            aone createBuilder4 = arvo.a.createBuilder();
            createBuilder4.copyOnWrite();
            arvo arvoVar = (arvo) createBuilder4.instance;
            arvoVar.b |= 1;
            arvoVar.c = str2;
            createBuilder3.copyOnWrite();
            arvt arvtVar2 = (arvt) createBuilder3.instance;
            arvo arvoVar2 = (arvo) createBuilder4.build();
            arvoVar2.getClass();
            arvtVar2.f = arvoVar2;
            arvtVar2.b |= 8;
        }
        if (str3 != null) {
            aone createBuilder5 = arvb.a.createBuilder();
            createBuilder5.copyOnWrite();
            arvb arvbVar = (arvb) createBuilder5.instance;
            arvbVar.b |= 1;
            arvbVar.c = str3;
            createBuilder3.copyOnWrite();
            arvt arvtVar3 = (arvt) createBuilder3.instance;
            arvb arvbVar2 = (arvb) createBuilder5.build();
            arvbVar2.getClass();
            arvtVar3.g = arvbVar2;
            arvtVar3.b |= 16;
        }
        aone createBuilder6 = arvd.a.createBuilder();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            createBuilder6.copyOnWrite();
            arvd arvdVar = (arvd) createBuilder6.instance;
            arvdVar.b |= 1;
            arvdVar.c = booleanValue;
        }
        if (bool2 != null) {
            aone createBuilder7 = asrj.a.createBuilder();
            aone createBuilder8 = asrk.a.createBuilder();
            boolean booleanValue2 = bool2.booleanValue();
            createBuilder7.copyOnWrite();
            asrj asrjVar = (asrj) createBuilder7.instance;
            asrjVar.b |= 2;
            asrjVar.d = booleanValue2;
            createBuilder8.copyOnWrite();
            asrk.a((asrk) createBuilder8.instance);
            createBuilder6.copyOnWrite();
            arvd arvdVar2 = (arvd) createBuilder6.instance;
            asrj asrjVar2 = (asrj) createBuilder7.build();
            asrjVar2.getClass();
            arvdVar2.d = asrjVar2;
            arvdVar2.b |= 2;
            createBuilder6.copyOnWrite();
            arvd arvdVar3 = (arvd) createBuilder6.instance;
            asrk asrkVar = (asrk) createBuilder8.build();
            asrkVar.getClass();
            arvdVar3.e = asrkVar;
            arvdVar3.b |= 4;
        }
        int i3 = ((arvd) createBuilder6.instance).b;
        if ((i3 & 1) != 0 || (i3 & 2) != 0) {
            createBuilder3.copyOnWrite();
            arvt arvtVar4 = (arvt) createBuilder3.instance;
            arvd arvdVar4 = (arvd) createBuilder6.build();
            arvdVar4.getClass();
            arvtVar4.t = arvdVar4;
            arvtVar4.b |= 67108864;
        }
        if (bool3 != null) {
            aone createBuilder9 = aruz.a.createBuilder();
            boolean booleanValue3 = bool3.booleanValue();
            createBuilder9.copyOnWrite();
            aruz aruzVar = (aruz) createBuilder9.instance;
            aruzVar.b |= 1;
            aruzVar.c = booleanValue3;
            createBuilder3.copyOnWrite();
            arvt arvtVar5 = (arvt) createBuilder3.instance;
            aruz aruzVar2 = (aruz) createBuilder9.build();
            aruzVar2.getClass();
            arvtVar5.l = aruzVar2;
            arvtVar5.b |= 8192;
        }
        if (bool4 != null) {
            aone createBuilder10 = arvl.a.createBuilder();
            boolean booleanValue4 = bool4.booleanValue();
            createBuilder10.copyOnWrite();
            arvl arvlVar = (arvl) createBuilder10.instance;
            arvlVar.b |= 1;
            arvlVar.c = booleanValue4;
            createBuilder3.copyOnWrite();
            arvt arvtVar6 = (arvt) createBuilder3.instance;
            arvl arvlVar2 = (arvl) createBuilder10.build();
            arvlVar2.getClass();
            arvtVar6.v = arvlVar2;
            arvtVar6.c |= 131072;
        }
        if (arnoVar != null) {
            arnnVar.getClass();
            if (arnoVar.b) {
                arvt arvtVar7 = (arvt) createBuilder3.instance;
                if ((arvtVar7.b & 16777216) == 0) {
                    createBuilder2 = arvk.a.createBuilder();
                } else {
                    arvk arvkVar = arvtVar7.r;
                    if (arvkVar == null) {
                        arvkVar = arvk.a;
                    }
                    createBuilder2 = arvkVar.toBuilder();
                }
                boolean z = arnnVar.c;
                createBuilder2.copyOnWrite();
                arvk arvkVar2 = (arvk) createBuilder2.instance;
                arvkVar2.b |= 1;
                arvkVar2.c = z;
                createBuilder3.copyOnWrite();
                arvt arvtVar8 = (arvt) createBuilder3.instance;
                arvk arvkVar3 = (arvk) createBuilder2.build();
                arvkVar3.getClass();
                arvtVar8.r = arvkVar3;
                arvtVar8.b |= 16777216;
            }
            if (arnoVar.c) {
                arvt arvtVar9 = (arvt) createBuilder3.instance;
                if ((arvtVar9.b & 16777216) == 0) {
                    createBuilder = arvk.a.createBuilder();
                } else {
                    arvk arvkVar4 = arvtVar9.r;
                    if (arvkVar4 == null) {
                        arvkVar4 = arvk.a;
                    }
                    createBuilder = arvkVar4.toBuilder();
                }
                boolean z2 = arnnVar.d;
                createBuilder.copyOnWrite();
                arvk arvkVar5 = (arvk) createBuilder.instance;
                arvkVar5.b |= 2;
                arvkVar5.d = z2;
                createBuilder3.copyOnWrite();
                arvt arvtVar10 = (arvt) createBuilder3.instance;
                arvk arvkVar6 = (arvk) createBuilder.build();
                arvkVar6.getClass();
                arvtVar10.r = arvkVar6;
                arvtVar10.b |= 16777216;
            }
            if (arnoVar.g) {
                aone createBuilder11 = arvg.a.createBuilder();
                String str4 = arnnVar.h;
                createBuilder11.copyOnWrite();
                arvg arvgVar = (arvg) createBuilder11.instance;
                str4.getClass();
                arvgVar.b |= 1;
                arvgVar.c = str4;
                createBuilder11.copyOnWrite();
                arvg arvgVar2 = (arvg) createBuilder11.instance;
                arvgVar2.d = 1;
                arvgVar2.b |= 2;
                createBuilder3.copyOnWrite();
                arvt arvtVar11 = (arvt) createBuilder3.instance;
                arvg arvgVar3 = (arvg) createBuilder11.build();
                arvgVar3.getClass();
                arvtVar11.s = arvgVar3;
                arvtVar11.b |= 33554432;
            } else if (arnoVar.f && !arnnVar.g) {
                aone createBuilder12 = arvg.a.createBuilder();
                createBuilder12.copyOnWrite();
                arvg arvgVar4 = (arvg) createBuilder12.instance;
                arvgVar4.d = 2;
                arvgVar4.b |= 2;
                createBuilder3.copyOnWrite();
                arvt arvtVar12 = (arvt) createBuilder3.instance;
                arvg arvgVar5 = (arvg) createBuilder12.build();
                arvgVar5.getClass();
                arvtVar12.s = arvgVar5;
                arvtVar12.b |= 33554432;
            }
            if (arnoVar.e) {
                amkq.N((arnnVar.b & 8) != 0);
                aone createBuilder13 = arvp.a.createBuilder();
                String str5 = arnnVar.f;
                createBuilder13.copyOnWrite();
                arvp arvpVar = (arvp) createBuilder13.instance;
                str5.getClass();
                arvpVar.b |= 1;
                arvpVar.c = str5;
                createBuilder3.copyOnWrite();
                arvt arvtVar13 = (arvt) createBuilder3.instance;
                arvp arvpVar2 = (arvp) createBuilder13.build();
                arvpVar2.getClass();
                arvtVar13.p = arvpVar2;
                arvtVar13.b |= 1048576;
            } else if (arnoVar.d) {
                aone createBuilder14 = arvh.a.createBuilder();
                boolean z3 = arnnVar.e;
                createBuilder14.copyOnWrite();
                arvh arvhVar = (arvh) createBuilder14.instance;
                arvhVar.b |= 1;
                arvhVar.c = z3;
                createBuilder3.copyOnWrite();
                arvt arvtVar14 = (arvt) createBuilder3.instance;
                arvh arvhVar2 = (arvh) createBuilder14.build();
                arvhVar2.getClass();
                arvtVar14.n = arvhVar2;
                arvtVar14.b |= 65536;
            }
        }
        if (i2 != 0) {
            aone createBuilder15 = arvn.a.createBuilder();
            createBuilder15.copyOnWrite();
            arvn arvnVar = (arvn) createBuilder15.instance;
            arvnVar.d = i2 - 1;
            arvnVar.b |= 2;
            createBuilder15.copyOnWrite();
            arvn arvnVar2 = (arvn) createBuilder15.instance;
            arvnVar2.c = 1;
            arvnVar2.b |= 1;
            createBuilder3.copyOnWrite();
            arvt arvtVar15 = (arvt) createBuilder3.instance;
            arvn arvnVar3 = (arvn) createBuilder15.build();
            arvnVar3.getClass();
            arvtVar15.w = arvnVar3;
            arvtVar15.c |= 262144;
        }
        if (i != 0) {
            aone createBuilder16 = arvj.a.createBuilder();
            createBuilder16.copyOnWrite();
            arvj arvjVar = (arvj) createBuilder16.instance;
            arvjVar.c = i - 1;
            arvjVar.b |= 1;
            createBuilder3.copyOnWrite();
            arvt arvtVar16 = (arvt) createBuilder3.instance;
            arvj arvjVar2 = (arvj) createBuilder16.build();
            arvjVar2.getClass();
            arvtVar16.h = arvjVar2;
            arvtVar16.b |= 32;
        }
        if (!abxqVar.c()) {
            aone createBuilder17 = arvf.a.createBuilder();
            if (abxqVar.d()) {
                createBuilder17.copyOnWrite();
                arvf arvfVar = (arvf) createBuilder17.instance;
                arvfVar.g = 2;
                arvfVar.b |= 16;
            } else {
                String str6 = ((Place) abxqVar.b()).a;
                createBuilder17.copyOnWrite();
                arvf arvfVar2 = (arvf) createBuilder17.instance;
                str6.getClass();
                arvfVar2.b |= 8;
                arvfVar2.f = str6;
                String str7 = ((Place) abxqVar.b()).b;
                createBuilder17.copyOnWrite();
                arvf arvfVar3 = (arvf) createBuilder17.instance;
                str7.getClass();
                arvfVar3.b |= 4;
                arvfVar3.e = str7;
            }
            createBuilder3.copyOnWrite();
            arvt arvtVar17 = (arvt) createBuilder3.instance;
            arvf arvfVar4 = (arvf) createBuilder17.build();
            arvfVar4.getClass();
            arvtVar17.m = arvfVar4;
            arvtVar17.b |= 32768;
        }
        if (date != null) {
            long time = date.getTime();
            if (time == 0) {
                seconds = TimeUnit.MILLISECONDS.toSeconds(this.e.c());
            } else {
                seconds = TimeUnit.MILLISECONDS.toSeconds(time);
            }
            aone createBuilder18 = arve.a.createBuilder();
            createBuilder18.copyOnWrite();
            arve arveVar = (arve) createBuilder18.instance;
            arveVar.b |= 1;
            arveVar.c = seconds;
            createBuilder3.copyOnWrite();
            arvt arvtVar18 = (arvt) createBuilder3.instance;
            arve arveVar2 = (arve) createBuilder18.build();
            arveVar2.getClass();
            arvtVar18.u = arveVar2;
            arvtVar18.b |= 134217728;
        }
        if (!abxqVar2.c()) {
            aone createBuilder19 = arvc.a.createBuilder();
            if (abxqVar2.d()) {
                createBuilder19.copyOnWrite();
                arvc arvcVar = (arvc) createBuilder19.instance;
                arvcVar.b |= 2;
                arvcVar.d = true;
            } else {
                String str8 = (String) abxqVar2.b();
                createBuilder19.copyOnWrite();
                arvc arvcVar2 = (arvc) createBuilder19.instance;
                str8.getClass();
                arvcVar2.b |= 1;
                arvcVar2.c = str8;
                aone createBuilder20 = arva.a.createBuilder();
                int i4 = abvp.b;
                int i5 = i4 - 1;
                if (i4 != 0) {
                    createBuilder20.copyOnWrite();
                    arva arvaVar = (arva) createBuilder20.instance;
                    arvaVar.b |= 1;
                    arvaVar.c = i5;
                    arva arvaVar2 = (arva) createBuilder20.build();
                    createBuilder3.copyOnWrite();
                    arvt arvtVar19 = (arvt) createBuilder3.instance;
                    arvaVar2.getClass();
                    arvtVar19.k = arvaVar2;
                    arvtVar19.b |= 512;
                } else {
                    throw null;
                }
            }
            createBuilder3.copyOnWrite();
            arvt arvtVar20 = (arvt) createBuilder3.instance;
            arvc arvcVar3 = (arvc) createBuilder19.build();
            arvcVar3.getClass();
            arvtVar20.o = arvcVar3;
            arvtVar20.b |= 524288;
        }
        if (bArr != null) {
            aone createBuilder21 = arvq.a.createBuilder();
            createBuilder21.copyOnWrite();
            arvq arvqVar = (arvq) createBuilder21.instance;
            arvqVar.c = 3;
            arvqVar.b |= 1;
            aone createBuilder22 = aruw.a.createBuilder();
            aomf x = aomf.x(bArr);
            createBuilder22.copyOnWrite();
            aruw aruwVar = (aruw) createBuilder22.instance;
            aruwVar.b = 1;
            aruwVar.c = x;
            createBuilder21.copyOnWrite();
            arvq arvqVar2 = (arvq) createBuilder21.instance;
            aruw aruwVar2 = (aruw) createBuilder22.build();
            aruwVar2.getClass();
            arvqVar2.d = aruwVar2;
            arvqVar2.b |= 4;
            createBuilder3.copyOnWrite();
            arvt arvtVar21 = (arvt) createBuilder3.instance;
            arvq arvqVar3 = (arvq) createBuilder21.build();
            arvqVar3.getClass();
            arvtVar21.q = arvqVar3;
            arvtVar21.b |= 4194304;
        }
        return createBuilder3;
    }

    @Override // defpackage.abya
    public final void m(String str, boolean z, boolean z2, MediaFormat mediaFormat, abwl abwlVar) {
        amkq.E(!str.isEmpty());
        if (!z) {
            mediaFormat.getClass();
        }
        int integer = mediaFormat == null ? 0 : mediaFormat.getInteger("height");
        abdl abdlVar = this.i;
        aazm aazmVar = new aazm(abdlVar.f, abdlVar.a.c(), null, null, null);
        aazmVar.b = str;
        aazmVar.c = "YouTube Mobile Stream";
        if (z) {
            aazmVar.d = 10005;
        } else {
            aazmVar.d = aazm.a.get(integer, 10003);
        }
        aazmVar.s = z ? 1 : 0;
        abdl abdlVar2 = this.i;
        abdlVar2.c(arny.a, abdlVar2.b, aazd.i, aayn.q).e(aazmVar, new abyq(this, z2, abwlVar, null));
    }
}
