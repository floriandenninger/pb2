package defpackage;

import android.graphics.Rect;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class knl implements ayro {
    private final /* synthetic */ int u;
    public static final /* synthetic */ knl t = new knl(20);
    public static final /* synthetic */ knl s = new knl(19);
    public static final /* synthetic */ knl r = new knl(18);
    public static final /* synthetic */ knl q = new knl(17);
    public static final /* synthetic */ knl p = new knl(16);
    public static final /* synthetic */ knl o = new knl(15);
    public static final /* synthetic */ knl n = new knl(14);
    public static final /* synthetic */ knl m = new knl(13);
    public static final /* synthetic */ knl l = new knl(12);
    public static final /* synthetic */ knl k = new knl(11);
    public static final /* synthetic */ knl j = new knl(10);
    public static final /* synthetic */ knl i = new knl(9);
    public static final /* synthetic */ knl h = new knl(8);
    public static final /* synthetic */ knl g = new knl(7);
    public static final /* synthetic */ knl f = new knl(6);
    public static final /* synthetic */ knl e = new knl(5);
    public static final /* synthetic */ knl d = new knl(4);
    public static final /* synthetic */ knl c = new knl(3);
    public static final /* synthetic */ knl b = new knl(2);
    public static final /* synthetic */ knl a = new knl(1);

    public /* synthetic */ knl(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayro
    public final Object a(Object obj, Object obj2) {
        boolean z = false;
        switch (this.u) {
            case 0:
                return Boolean.valueOf(knm.b(((Boolean) obj).booleanValue(), (nxh) obj2));
            case 1:
                klx klxVar = (klx) obj2;
                klw klwVar = kly.a;
                klt kltVar = klxVar.b;
                kmb kmbVar = ((klw) obj).a;
                klz klzVar = kltVar.a;
                Object obj3 = kltVar.b;
                kma kmaVar = new kma(kmbVar);
                klzVar.a(kmaVar, obj3);
                return klw.a(kmaVar.a(), klxVar.a);
            case 2:
                Rect rect = (Rect) obj2;
                aswb aswbVar = ((arfd) obj).e;
                if (aswbVar == null) {
                    aswbVar = aswb.a;
                }
                if (aswbVar.bm) {
                    return Integer.valueOf(rect.right);
                }
                return 0;
            case 3:
                return ammw.a((String) obj, (jps) obj2);
            case 4:
                return (ammv) obj2;
            case 5:
                ammv ammvVar = (ammv) obj;
                return ammvVar.h() ? ammvVar : (ammv) obj2;
            case 6:
                aqjs aqjsVar = (aqjs) obj2;
                aswb aswbVar2 = ((arfd) obj).e;
                if (aswbVar2 == null) {
                    aswbVar2 = aswb.a;
                }
                return aswbVar2.bo ? aqjsVar.d : "";
            case 7:
                return Pair.create((atgn) obj, (ammv) obj2);
            case 8:
                float intValue = ((Integer) obj).intValue();
                float height = ((Rect) obj2).height();
                return Float.valueOf(height > 0.001f ? anaf.al(1.0f - (Math.abs(intValue - r5.top) / height), 0.0f, 1.0f) : 0.0f);
            case 9:
                return ammw.a((nqp) obj, (apxf) obj2);
            case 10:
                return ammw.a((nqg) obj, (nqg) obj2);
            case 11:
                return (nxh) obj2;
            case 12:
                return ((nxj) obj2).a;
            case 13:
                ammv ammvVar2 = (ammv) obj;
                if (((Boolean) obj2).booleanValue() && !ammvVar2.h()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                ammv ammvVar3 = (ammv) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (ammvVar3.h()) {
                    intValue2 = ((Integer) ammvVar3.c()).intValue();
                }
                return Integer.valueOf(intValue2);
            case 15:
                ammw ammwVar = (ammw) obj2;
                return Integer.valueOf(nwx.b(((Integer) obj).intValue(), ((Integer) ammwVar.a).intValue(), ((Integer) ammwVar.b).intValue(), ((Integer) ammwVar.b).intValue()));
            case 16:
                ammw ammwVar2 = (ammw) obj2;
                return Integer.valueOf(nwx.b(((Integer) obj).intValue(), ((Integer) ammwVar2.a).intValue(), ((Integer) ammwVar2.b).intValue(), 0));
            case 17:
                return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
            case 18:
                return ammw.a((Integer) obj, (Integer) obj2);
            case 19:
                return ammw.a((nxh) obj, (Boolean) obj2);
            default:
                nxk nxkVar = (nxk) obj;
                int i2 = nxc.e;
                return badl.d((Boolean) obj2, nxkVar.a, nxkVar.b);
        }
    }
}
