package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class eng implements ayrw {
    private final /* synthetic */ int t;
    public static final /* synthetic */ eng s = new eng(20);
    public static final /* synthetic */ eng r = new eng(19);
    public static final /* synthetic */ eng q = new eng(18);
    public static final /* synthetic */ eng p = new eng(17);
    public static final /* synthetic */ eng o = new eng(16);
    public static final /* synthetic */ eng n = new eng(15);
    public static final /* synthetic */ eng m = new eng(14);
    public static final /* synthetic */ eng l = new eng(13);
    public static final /* synthetic */ eng k = new eng(12);
    public static final /* synthetic */ eng j = new eng(9);
    public static final /* synthetic */ eng i = new eng(8);
    public static final /* synthetic */ eng h = new eng(7);
    public static final /* synthetic */ eng g = new eng(6);
    public static final /* synthetic */ eng f = new eng(5);
    public static final /* synthetic */ eng e = new eng(4);
    public static final /* synthetic */ eng d = new eng(3);
    public static final /* synthetic */ eng c = new eng(2);
    public static final /* synthetic */ eng b = new eng(1);
    public static final /* synthetic */ eng a = new eng(0);

    public /* synthetic */ eng(int i2) {
        this.t = i2;
    }

    @Override // defpackage.ayrw
    public final boolean a(Object obj) {
        switch (this.t) {
            case 0:
                return wbs.ax(((Long) obj).longValue(), yyt.b);
            case 1:
                return wbs.ax(((Long) obj).longValue(), yyt.a);
            case 2:
                List list = (List) obj;
                return list.size() >= 2 && eoh.b((fhg) list.get(0)) != eoh.b((fhg) list.get(1));
            case 3:
                zga.d("Failed to update bedtime reminder data to store.", (Throwable) obj);
                return true;
            case 4:
                return ((Boolean) obj).booleanValue();
            case 5:
                List list2 = (List) obj;
                return ((Boolean) list2.get(0)).booleanValue() && !((Boolean) list2.get(1)).booleanValue();
            case 6:
                return ((Boolean) obj).booleanValue();
            case 7:
                int i2 = ezd.c;
                return !((Boolean) obj).booleanValue();
            case 8:
                return ((ammv) obj).h();
            case 9:
                return ((Boolean) obj).booleanValue();
            case 10:
                ammw ammwVar = (ammw) obj;
                fin finVar = (fin) ammwVar.a;
                int i3 = finVar.b;
                return ((i3 == 155 || i3 == 261) && ((amsx) ammwVar.b).contains(finVar.c)) ? false : true;
            case 11:
                ammw ammwVar2 = (ammw) obj;
                fin finVar2 = (fin) ammwVar2.a;
                return (finVar2.b == 156 && ((amsx) ammwVar2.b).contains(finVar2.c)) ? false : true;
            case 12:
                return ((ammv) obj).h();
            case 13:
                return ((asxj) obj).b == 2;
            case 14:
                return ((asxj) obj).b == 1;
            case 15:
                return true;
            case 16:
                return true;
            case 17:
                return !ammx.e((String) obj);
            case 18:
                return ((aakz) obj).c != null;
            case 19:
                return ((aakz) obj).c != null;
            default:
                List list3 = (List) obj;
                return ((Boolean) list3.get(0)).booleanValue() && !((Boolean) list3.get(1)).booleanValue();
        }
    }
}
