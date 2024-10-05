package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akwi extends akwr {
    private final alep a;

    public akwi(alep alepVar, akyb akybVar) {
        super(akybVar);
        this.a = alepVar;
    }

    private final akzp c(akzp akzpVar) {
        int l = akwg.l(akzpVar.c);
        if (l == 0) {
            l = 1;
        }
        return l + (-1) != 1 ? this.a.d() : akzp.a;
    }

    private static final akzp d(akzp akzpVar) {
        int l = akwg.l(akzpVar.c);
        return (l != 0 && l == 2) ? akzpVar : akzp.a;
    }

    @Override // defpackage.akwr
    public final akzs b(akzs akzsVar) {
        if (akzsVar == null) {
            return null;
        }
        if (!akzsVar.U) {
            throw new IllegalStateException("use_explicit_upload_flow must be true");
        }
        aone builder = akzsVar.toBuilder();
        builder.copyOnWrite();
        akzs akzsVar2 = (akzs) builder.instance;
        akzsVar2.c |= 67108864;
        akzsVar2.af = false;
        builder.copyOnWrite();
        akzs akzsVar3 = (akzs) builder.instance;
        akzsVar3.c |= 33554432;
        akzsVar3.ae = true;
        akzp akzpVar = akzsVar.an;
        if (akzpVar == null) {
            akzpVar = akzp.a;
        }
        akzp d = d(akzpVar);
        builder.copyOnWrite();
        akzs akzsVar4 = (akzs) builder.instance;
        d.getClass();
        akzsVar4.an = d;
        akzsVar4.d |= 4;
        akzp akzpVar2 = akzsVar.O;
        if (akzpVar2 == null) {
            akzpVar2 = akzp.a;
        }
        akzp c = c(akzpVar2);
        builder.copyOnWrite();
        akzs akzsVar5 = (akzs) builder.instance;
        c.getClass();
        akzsVar5.O = c;
        akzsVar5.c |= 4096;
        akzp akzpVar3 = akzsVar.aa;
        if (akzpVar3 == null) {
            akzpVar3 = akzp.a;
        }
        akzp c2 = c(akzpVar3);
        builder.copyOnWrite();
        akzs akzsVar6 = (akzs) builder.instance;
        c2.getClass();
        akzsVar6.aa = c2;
        akzsVar6.c |= 2097152;
        akzp akzpVar4 = akzsVar.y;
        if (akzpVar4 == null) {
            akzpVar4 = akzp.a;
        }
        akzp c3 = c(akzpVar4);
        builder.copyOnWrite();
        akzs akzsVar7 = (akzs) builder.instance;
        c3.getClass();
        akzsVar7.y = c3;
        akzsVar7.b |= 67108864;
        akzp akzpVar5 = akzsVar.y;
        if (akzpVar5 == null) {
            akzpVar5 = akzp.a;
        }
        akzp c4 = c(akzpVar5);
        builder.copyOnWrite();
        akzs akzsVar8 = (akzs) builder.instance;
        c4.getClass();
        akzsVar8.ac = c4;
        akzsVar8.c |= 8388608;
        akzp akzpVar6 = akzsVar.ak;
        if (akzpVar6 == null) {
            akzpVar6 = akzp.a;
        }
        akzp c5 = c(akzpVar6);
        builder.copyOnWrite();
        akzs akzsVar9 = (akzs) builder.instance;
        c5.getClass();
        akzsVar9.ak = c5;
        akzsVar9.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        akzp akzpVar7 = akzsVar.N;
        if (akzpVar7 == null) {
            akzpVar7 = akzp.a;
        }
        akzp c6 = c(akzpVar7);
        builder.copyOnWrite();
        akzs akzsVar10 = (akzs) builder.instance;
        c6.getClass();
        akzsVar10.N = c6;
        akzsVar10.c |= 2048;
        akzp akzpVar8 = akzsVar.K;
        if (akzpVar8 == null) {
            akzpVar8 = akzp.a;
        }
        akzp c7 = c(akzpVar8);
        builder.copyOnWrite();
        akzs akzsVar11 = (akzs) builder.instance;
        c7.getClass();
        akzsVar11.K = c7;
        akzsVar11.c |= 256;
        akzp akzpVar9 = akzsVar.f65J;
        if (akzpVar9 == null) {
            akzpVar9 = akzp.a;
        }
        akzp c8 = c(akzpVar9);
        builder.copyOnWrite();
        akzs akzsVar12 = (akzs) builder.instance;
        c8.getClass();
        akzsVar12.f65J = c8;
        akzsVar12.c |= 128;
        akzp akzpVar10 = akzsVar.M;
        if (akzpVar10 == null) {
            akzpVar10 = akzp.a;
        }
        akzp c9 = c(akzpVar10);
        builder.copyOnWrite();
        akzs akzsVar13 = (akzs) builder.instance;
        c9.getClass();
        akzsVar13.M = c9;
        akzsVar13.c |= 1024;
        akzp akzpVar11 = akzsVar.ad;
        if (akzpVar11 == null) {
            akzpVar11 = akzp.a;
        }
        akzp c10 = c(akzpVar11);
        builder.copyOnWrite();
        akzs akzsVar14 = (akzs) builder.instance;
        c10.getClass();
        akzsVar14.ad = c10;
        akzsVar14.c |= 16777216;
        akzp akzpVar12 = akzsVar.ai;
        if (akzpVar12 == null) {
            akzpVar12 = akzp.a;
        }
        akzp c11 = c(akzpVar12);
        builder.copyOnWrite();
        akzs akzsVar15 = (akzs) builder.instance;
        c11.getClass();
        akzsVar15.ai = c11;
        akzsVar15.c |= 536870912;
        if (akzsVar15.t) {
            akzp akzpVar13 = akzsVar.aj;
            if (akzpVar13 == null) {
                akzpVar13 = akzp.a;
            }
            akzp c12 = c(akzpVar13);
            builder.copyOnWrite();
            akzs akzsVar16 = (akzs) builder.instance;
            c12.getClass();
            akzsVar16.aj = c12;
            akzsVar16.c |= 1073741824;
        }
        if (((akzs) builder.instance).w) {
            akzp akzpVar14 = akzsVar.ao;
            if (akzpVar14 == null) {
                akzpVar14 = akzp.a;
            }
            akzp d2 = d(akzpVar14);
            builder.copyOnWrite();
            akzs akzsVar17 = (akzs) builder.instance;
            d2.getClass();
            akzsVar17.ao = d2;
            akzsVar17.d |= 8;
        }
        return (akzs) builder.build();
    }
}
