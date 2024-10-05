package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agbc implements ayro {
    private final /* synthetic */ int v;
    public static final /* synthetic */ agbc u = new agbc(20);
    public static final /* synthetic */ agbc t = new agbc(19);
    public static final /* synthetic */ agbc s = new agbc(18);
    public static final /* synthetic */ agbc r = new agbc(17);
    public static final /* synthetic */ agbc q = new agbc(16);
    public static final /* synthetic */ agbc p = new agbc(15);
    public static final /* synthetic */ agbc o = new agbc(14);
    public static final /* synthetic */ agbc n = new agbc(13);
    public static final /* synthetic */ agbc m = new agbc(12);
    public static final /* synthetic */ agbc l = new agbc(11);
    public static final /* synthetic */ agbc k = new agbc(10);
    public static final /* synthetic */ agbc j = new agbc(9);
    public static final /* synthetic */ agbc i = new agbc(8);
    public static final /* synthetic */ agbc h = new agbc(7);
    public static final /* synthetic */ agbc g = new agbc(6);
    public static final /* synthetic */ agbc f = new agbc(5);
    public static final /* synthetic */ agbc e = new agbc(4);
    public static final /* synthetic */ agbc d = new agbc(3);
    public static final /* synthetic */ agbc c = new agbc(2);
    public static final /* synthetic */ agbc b = new agbc(1);
    public static final /* synthetic */ agbc a = new agbc(0);

    private /* synthetic */ agbc(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayro
    public final Object a(Object obj, Object obj2) {
        aqyg aqygVar;
        switch (this.v) {
            case 0:
                return aghv.h((Context) obj, (Intent) obj2);
            case 1:
                return new Pair((aven) obj, (awrc) obj2);
            case 2:
                return aghv.i((Context) obj, (Intent) obj2);
            case 3:
                apek apekVar = (apek) obj;
                dw dwVar = new dw();
                dwVar.a = (Bitmap) obj2;
                aqyg aqygVar2 = null;
                if ((apekVar.b & 8) != 0) {
                    aqygVar = apekVar.f;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                dwVar.d(ajcq.b(aqygVar));
                if ((apekVar.b & 16) != 0 && (aqygVar2 = apekVar.g) == null) {
                    aqygVar2 = aqyg.a;
                }
                dwVar.e(ajcq.b(aqygVar2));
                return dwVar;
            case 4:
                aone aoneVar = (aone) obj;
                akzl akzlVar = (akzl) obj2;
                aoneVar.copyOnWrite();
                akzs akzsVar = (akzs) aoneVar.instance;
                akzs akzsVar2 = akzs.a;
                akzlVar.getClass();
                akzsVar.r = akzlVar;
                akzsVar.b |= 32768;
                return aoneVar;
            case 5:
                aone aoneVar2 = (aone) obj;
                aoneVar2.copyOnWrite();
                akzs akzsVar3 = (akzs) aoneVar2.instance;
                akzs akzsVar4 = akzs.a;
                akzsVar3.l = ((akzq) obj2).g;
                akzsVar3.b |= 128;
                return aoneVar2;
            case 6:
                aone aoneVar3 = (aone) obj;
                akzt akztVar = (akzt) obj2;
                aoneVar3.copyOnWrite();
                akzs akzsVar5 = (akzs) aoneVar3.instance;
                akzs akzsVar6 = akzs.a;
                akztVar.getClass();
                akzsVar5.q = akztVar;
                akzsVar5.b |= 16384;
                return aoneVar3;
            case 7:
                aone aoneVar4 = (aone) obj;
                akzw akzwVar = (akzw) obj2;
                aoneVar4.copyOnWrite();
                akzs akzsVar7 = (akzs) aoneVar4.instance;
                akzs akzsVar8 = akzs.a;
                akzwVar.getClass();
                akzsVar7.i = akzwVar;
                akzsVar7.b |= 16;
                return aoneVar4;
            case 8:
                aone aoneVar5 = (aone) obj;
                arvt arvtVar = (arvt) obj2;
                aoneVar5.copyOnWrite();
                akzs akzsVar9 = (akzs) aoneVar5.instance;
                akzs akzsVar10 = akzs.a;
                arvtVar.getClass();
                akzsVar9.j = arvtVar;
                akzsVar9.b |= 32;
                return aoneVar5;
            case 9:
                aone aoneVar6 = (aone) obj;
                awaf awafVar = (awaf) obj2;
                aoneVar6.copyOnWrite();
                akzs akzsVar11 = (akzs) aoneVar6.instance;
                akzs akzsVar12 = akzs.a;
                awafVar.getClass();
                akzsVar11.as = awafVar;
                akzsVar11.d |= 512;
                return aoneVar6;
            case 10:
                aone aoneVar7 = (aone) obj;
                String str = (String) obj2;
                aoneVar7.copyOnWrite();
                akzs akzsVar13 = (akzs) aoneVar7.instance;
                akzs akzsVar14 = akzs.a;
                str.getClass();
                akzsVar13.b |= 2;
                akzsVar13.f = str;
                return aoneVar7;
            case 11:
                aone aoneVar8 = (aone) obj;
                aoneVar8.F((List) obj2);
                return aoneVar8;
            case 12:
                aone aoneVar9 = (aone) obj;
                long longValue = ((Long) obj2).longValue();
                aoneVar9.copyOnWrite();
                akzl akzlVar2 = (akzl) aoneVar9.instance;
                akzl akzlVar3 = akzl.a;
                akzlVar2.b |= 2;
                akzlVar2.d = longValue;
                return aoneVar9;
            case 13:
                aone aoneVar10 = (aone) obj;
                long longValue2 = ((Long) obj2).longValue();
                aoneVar10.copyOnWrite();
                akzl akzlVar4 = (akzl) aoneVar10.instance;
                akzl akzlVar5 = akzl.a;
                akzlVar4.b |= 1;
                akzlVar4.c = longValue2;
                return aoneVar10;
            case 14:
                aone aoneVar11 = (aone) obj;
                long longValue3 = ((Long) obj2).longValue();
                aoneVar11.copyOnWrite();
                akzl akzlVar6 = (akzl) aoneVar11.instance;
                akzl akzlVar7 = akzl.a;
                akzlVar6.b |= 4;
                akzlVar6.e = longValue3;
                return aoneVar11;
            case 15:
                aone aoneVar12 = (aone) obj;
                akzp akzpVar = (akzp) obj2;
                aoneVar12.copyOnWrite();
                akzs akzsVar15 = (akzs) aoneVar12.instance;
                akzs akzsVar16 = akzs.a;
                akzpVar.getClass();
                akzsVar15.an = akzpVar;
                akzsVar15.d |= 4;
                return aoneVar12;
            case 16:
                aone aoneVar13 = (aone) obj;
                akzp akzpVar2 = (akzp) obj2;
                aoneVar13.copyOnWrite();
                akzs akzsVar17 = (akzs) aoneVar13.instance;
                akzs akzsVar18 = akzs.a;
                akzpVar2.getClass();
                akzsVar17.A = akzpVar2;
                akzsVar17.b |= 268435456;
                return aoneVar13;
            case 17:
                aone aoneVar14 = (aone) obj;
                akzp akzpVar3 = (akzp) obj2;
                aoneVar14.copyOnWrite();
                akzs akzsVar19 = (akzs) aoneVar14.instance;
                akzs akzsVar20 = akzs.a;
                akzpVar3.getClass();
                akzsVar19.O = akzpVar3;
                akzsVar19.c |= 4096;
                return aoneVar14;
            case 18:
                aone aoneVar15 = (aone) obj;
                akzp akzpVar4 = (akzp) obj2;
                aoneVar15.copyOnWrite();
                akzs akzsVar21 = (akzs) aoneVar15.instance;
                akzs akzsVar22 = akzs.a;
                akzpVar4.getClass();
                akzsVar21.K = akzpVar4;
                akzsVar21.c |= 256;
                return aoneVar15;
            case 19:
                aone aoneVar16 = (aone) obj;
                akzp akzpVar5 = (akzp) obj2;
                aoneVar16.copyOnWrite();
                akzs akzsVar23 = (akzs) aoneVar16.instance;
                akzs akzsVar24 = akzs.a;
                akzpVar5.getClass();
                akzsVar23.M = akzpVar5;
                akzsVar23.c |= 1024;
                return aoneVar16;
            default:
                aone aoneVar17 = (aone) obj;
                akzp akzpVar6 = (akzp) obj2;
                aoneVar17.copyOnWrite();
                akzs akzsVar25 = (akzs) aoneVar17.instance;
                akzs akzsVar26 = akzs.a;
                akzpVar6.getClass();
                akzsVar25.ai = akzpVar6;
                akzsVar25.c |= 536870912;
                return aoneVar17;
        }
    }
}
