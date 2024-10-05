package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class albr implements ayro {
    private final /* synthetic */ int j;
    public static final /* synthetic */ albr i = new albr(8);
    public static final /* synthetic */ albr h = new albr(7);
    public static final /* synthetic */ albr g = new albr(6);
    public static final /* synthetic */ albr f = new albr(5);
    public static final /* synthetic */ albr e = new albr(4);
    public static final /* synthetic */ albr d = new albr(3);
    public static final /* synthetic */ albr c = new albr(2);
    public static final /* synthetic */ albr b = new albr(1);
    public static final /* synthetic */ albr a = new albr(0);

    private /* synthetic */ albr(int i2) {
        this.j = i2;
    }

    @Override // defpackage.ayro
    public final Object a(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                aone aoneVar = (aone) obj;
                akzp akzpVar = (akzp) obj2;
                aoneVar.copyOnWrite();
                akzs akzsVar = (akzs) aoneVar.instance;
                akzs akzsVar2 = akzs.a;
                akzpVar.getClass();
                akzsVar.ao = akzpVar;
                akzsVar.d |= 8;
                return aoneVar;
            case 1:
                aone aoneVar2 = (aone) obj;
                akzp akzpVar2 = (akzp) obj2;
                aoneVar2.copyOnWrite();
                akzs akzsVar3 = (akzs) aoneVar2.instance;
                akzs akzsVar4 = akzs.a;
                akzpVar2.getClass();
                akzsVar3.y = akzpVar2;
                akzsVar3.b |= 67108864;
                return aoneVar2;
            case 2:
                aone aoneVar3 = (aone) obj;
                akzp akzpVar3 = (akzp) obj2;
                aoneVar3.copyOnWrite();
                akzs akzsVar5 = (akzs) aoneVar3.instance;
                akzs akzsVar6 = akzs.a;
                akzpVar3.getClass();
                akzsVar5.ak = akzpVar3;
                akzsVar5.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                return aoneVar3;
            case 3:
                aone aoneVar4 = (aone) obj;
                akzp akzpVar4 = (akzp) obj2;
                aoneVar4.copyOnWrite();
                akzs akzsVar7 = (akzs) aoneVar4.instance;
                akzs akzsVar8 = akzs.a;
                akzpVar4.getClass();
                akzsVar7.N = akzpVar4;
                akzsVar7.c |= 2048;
                return aoneVar4;
            case 4:
                aone aoneVar5 = (aone) obj;
                akzp akzpVar5 = (akzp) obj2;
                aoneVar5.copyOnWrite();
                akzs akzsVar9 = (akzs) aoneVar5.instance;
                akzs akzsVar10 = akzs.a;
                akzpVar5.getClass();
                akzsVar9.ac = akzpVar5;
                akzsVar9.c |= 8388608;
                return aoneVar5;
            case 5:
                aone aoneVar6 = (aone) obj;
                akzp akzpVar6 = (akzp) obj2;
                aoneVar6.copyOnWrite();
                akzs akzsVar11 = (akzs) aoneVar6.instance;
                akzs akzsVar12 = akzs.a;
                akzpVar6.getClass();
                akzsVar11.f65J = akzpVar6;
                akzsVar11.c |= 128;
                return aoneVar6;
            case 6:
                aone aoneVar7 = (aone) obj;
                akzp akzpVar7 = (akzp) obj2;
                aoneVar7.copyOnWrite();
                akzs akzsVar13 = (akzs) aoneVar7.instance;
                akzs akzsVar14 = akzs.a;
                akzpVar7.getClass();
                akzsVar13.aj = akzpVar7;
                akzsVar13.c |= 1073741824;
                return aoneVar7;
            case 7:
                aone aoneVar8 = (aone) obj;
                akzp akzpVar8 = (akzp) obj2;
                aoneVar8.copyOnWrite();
                akzs akzsVar15 = (akzs) aoneVar8.instance;
                akzs akzsVar16 = akzs.a;
                akzpVar8.getClass();
                akzsVar15.aa = akzpVar8;
                akzsVar15.c |= 2097152;
                return aoneVar8;
            default:
                aone aoneVar9 = (aone) obj;
                akzp akzpVar9 = (akzp) obj2;
                aoneVar9.copyOnWrite();
                akzs akzsVar17 = (akzs) aoneVar9.instance;
                akzs akzsVar18 = akzs.a;
                akzpVar9.getClass();
                akzsVar17.L = akzpVar9;
                akzsVar17.c |= 512;
                return aoneVar9;
        }
    }
}
