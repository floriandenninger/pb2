package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class sto implements ayrv {
    public final /* synthetic */ stp a;
    public final /* synthetic */ awop b;
    public final /* synthetic */ swu c;
    private final /* synthetic */ int d;

    public /* synthetic */ sto(stp stpVar, awop awopVar, swu swuVar, int i) {
        this.d = i;
        this.a = stpVar;
        this.b = awopVar;
        this.c = swuVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = 1;
        if (this.d != 0) {
            stp stpVar = this.a;
            awop awopVar = this.b;
            swu swuVar = this.c;
            syv syvVar = (syv) obj;
            sww swwVar = (sww) stpVar.b.get();
            awms awmsVar = awopVar.d;
            if (awmsVar == null) {
                awmsVar = awms.a;
            }
            try {
                axoc a = EkoProcessor.a(awmsVar.toByteArray(), sui.a(syvVar).a, stpVar.c);
                if (!a.a.f()) {
                    String valueOf = String.valueOf(a.a.getDescription());
                    throw new syf(valueOf.length() != 0 ? "Eko processor error: ".concat(valueOf) : new String("Eko processor error: "));
                }
                byte[] bArr = a.b;
                bArr.getClass();
                return swwVar.d((awnw) aonm.parseFrom(awnw.a, bArr, aomw.b()), swuVar, 1);
            } catch (IOException e) {
                throw new syf("Invalid eko template", e);
            }
        }
        stp stpVar2 = this.a;
        awop awopVar2 = this.b;
        swu swuVar2 = this.c;
        aong aongVar = (aong) awpz.a.createBuilder();
        aonk aonkVar = awor.b;
        aone createBuilder = awor.a.createBuilder();
        awms awmsVar2 = awopVar2.d;
        if (awmsVar2 == null) {
            awmsVar2 = awms.a;
        }
        aomf byteString = awmsVar2.toByteString();
        createBuilder.copyOnWrite();
        awor aworVar = (awor) createBuilder.instance;
        aworVar.c |= 1;
        aworVar.d = byteString;
        aongVar.e(aonkVar, (awor) createBuilder.build());
        awpz awpzVar = (awpz) aongVar.build();
        awoc awocVar = awopVar2.c;
        if (awocVar == null) {
            awocVar = awoc.a;
        }
        int i2 = ((awoe) awocVar.pX(awoe.b)).d;
        aone createBuilder2 = awob.a.createBuilder();
        createBuilder2.copyOnWrite();
        awob awobVar = (awob) createBuilder2.instance;
        awpzVar.getClass();
        awobVar.d = awpzVar;
        awobVar.c |= 2;
        awoc awocVar2 = awopVar2.c;
        if (awocVar2 == null) {
            awocVar2 = awoc.a;
        }
        createBuilder2.copyOnWrite();
        awob awobVar2 = (awob) createBuilder2.instance;
        awocVar2.getClass();
        awobVar2.f = awocVar2;
        awobVar2.c |= 16;
        try {
            byte[] bArr2 = new byte[6];
            aomp ak = aomp.ak(bArr2);
            ak.B(i2, 2);
            ak.D(0);
            try {
                awog awogVar = (awog) aonm.parseFrom(awog.a, bArr2);
                createBuilder2.copyOnWrite();
                awob awobVar3 = (awob) createBuilder2.instance;
                awogVar.getClass();
                awobVar3.e = awogVar;
                awobVar3.c |= 8;
                final awob awobVar4 = (awob) createBuilder2.build();
                final sxd sxdVar = stpVar2.a;
                return aypy.y(new Callable() { // from class: sug
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i3;
                        int i4;
                        int i5;
                        awob awobVar5 = awob.this;
                        sxd sxdVar2 = sxdVar;
                        awog awogVar2 = awobVar5.e;
                        if (awogVar2 == null) {
                            awogVar2 = awog.a;
                        }
                        syv d = syv.d(awogVar2);
                        if ((awobVar5.c & 16) == 0) {
                            return azrh.aN(d);
                        }
                        awoc awocVar3 = awobVar5.f;
                        if (awocVar3 == null) {
                            awocVar3 = awoc.a;
                        }
                        awoe awoeVar = awocVar3.pY(awoe.b) ? (awoe) awocVar3.pX(awoe.b) : null;
                        awou awouVar = awocVar3.pY(awou.b) ? (awou) awocVar3.pX(awou.b) : null;
                        if (awoeVar == null && awouVar == null) {
                            return azrh.aN(d);
                        }
                        if (awoeVar == null || awouVar == null || (i4 = awoeVar.d) == (i5 = awouVar.c)) {
                            amrw h = amrz.h();
                            if (awoeVar != null) {
                                i3 = awoeVar.d;
                                amrw h2 = amrz.h();
                                for (awof awofVar : awoeVar.c) {
                                    if ((awofVar.b & 1) != 0) {
                                        h2.g(awofVar.c, Integer.valueOf(awofVar.d));
                                    }
                                }
                                h.i(h2.c());
                            } else {
                                i3 = 0;
                            }
                            if (awouVar != null) {
                                i3 = awouVar.c;
                                h.i(amrz.k("/environment", Integer.valueOf(awouVar.d)));
                            }
                            return sgf.v(sui.a(d), i3, h.c(), sxdVar2, null);
                        }
                        StringBuilder sb = new StringBuilder(108);
                        sb.append("ComponentType localEntitiesConfig.resultField=");
                        sb.append(i4);
                        sb.append(", environmentEntitiesConfig.resultField=");
                        sb.append(i5);
                        throw new syf(sb.toString());
                    }
                }).as(syv.b).c(new sto(stpVar2, awopVar2, swuVar2, i));
            } catch (aoob e2) {
                throw new syf("Invalid model", e2);
            }
        } catch (IOException e3) {
            throw new syf("Invalid model creation", e3);
        }
    }
}
