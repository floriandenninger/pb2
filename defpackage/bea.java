package defpackage;

import android.util.Pair;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bea implements Comparator {
    private final /* synthetic */ int v;
    public static final /* synthetic */ bea u = new bea(20);
    public static final /* synthetic */ bea t = new bea(19);
    public static final /* synthetic */ bea s = new bea(18);
    public static final /* synthetic */ bea r = new bea(17);
    public static final /* synthetic */ bea q = new bea(16);
    public static final /* synthetic */ bea p = new bea(15);
    public static final /* synthetic */ bea o = new bea(14);
    public static final /* synthetic */ bea n = new bea(13);
    public static final /* synthetic */ bea m = new bea(12);
    public static final /* synthetic */ bea l = new bea(11);
    public static final /* synthetic */ bea k = new bea(10);
    public static final /* synthetic */ bea j = new bea(9);
    public static final /* synthetic */ bea i = new bea(8);
    public static final /* synthetic */ bea h = new bea(7);
    public static final /* synthetic */ bea g = new bea(6);
    public static final /* synthetic */ bea f = new bea(5);
    public static final /* synthetic */ bea e = new bea(4);
    public static final /* synthetic */ bea d = new bea(3);
    public static final /* synthetic */ bea c = new bea(2);
    public static final /* synthetic */ bea b = new bea(1);
    public static final /* synthetic */ bea a = new bea(0);

    private /* synthetic */ bea(int i2) {
        this.v = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2;
        int i3;
        switch (this.v) {
            case 0:
                i2 = ((pms) obj2).j;
                i3 = ((pms) obj).j;
                break;
            case 1:
                Comparator comparator = adm.a;
                return ((adh) obj).a.compareTo(((adh) obj2).a);
            case 2:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                amvd amvdVar = bej.a;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 3:
                amvd amvdVar2 = bej.a;
                return 0;
            case 4:
                return ((bgf) obj).a - ((bgf) obj2).a;
            case 5:
                return Float.compare(((bgf) obj).c, ((bgf) obj2).c);
            case 6:
                return -fio.c((aakt) obj).compareTo(fio.c((aakt) obj2));
            case 7:
                i2 = ((axdk) obj2).d();
                i3 = ((axdk) obj).d();
                break;
            case 8:
                return -Long.valueOf(((agnv) obj).i).compareTo(Long.valueOf(((agnv) obj2).i));
            case 9:
                akzs akzsVar = (akzs) obj;
                akzs akzsVar2 = (akzs) obj2;
                akzsVar.getClass();
                akzsVar2.getClass();
                long j2 = akzsVar.h;
                long j3 = akzsVar2.h;
                if (j2 > j3) {
                    return -1;
                }
                return j2 == j3 ? 0 : 1;
            case 10:
                int i4 = nzl.t;
                i2 = ((Integer) obj2).intValue();
                i3 = ((Integer) obj).intValue();
                break;
            case 11:
                int i5 = ((pqg) obj2).c;
                int i6 = ((pqg) obj).c;
                if (i5 == i6) {
                    return 0;
                }
                return i5 >= i6 ? 1 : -1;
            case 12:
                int i7 = ((prv) obj).b.b;
                int i8 = ((prv) obj2).b.b;
                if (i7 == i8) {
                    return 0;
                }
                return i7 >= i8 ? 1 : -1;
            case 13:
                return (((pru) obj).b > ((pru) obj2).b ? 1 : (((pru) obj).b == ((pru) obj2).b ? 0 : -1));
            case 14:
                return pun.a.indexOf((String) obj) - pun.a.indexOf((String) obj2);
            case 15:
                return stb.a.indexOf(((sym) obj).getClass()) - stb.a.indexOf(((sym) obj2).getClass());
            case 16:
                return (int) (((aoam) obj).q() - ((aoam) obj2).q());
            case 17:
                return Integer.valueOf(((tbw) obj).a).compareTo(Integer.valueOf(((tbw) obj2).a));
            case 18:
                return rwh.au((aooy) ((Pair) obj).first).compareTo(rwh.au((aooy) ((Pair) obj2).first));
            case 19:
                return rwh.au((tld) obj).compareTo(rwh.au((tld) obj2));
            default:
                return rwh.au((tlg) obj).compareTo(rwh.au((tlg) obj2));
        }
        return i2 - i3;
    }
}
