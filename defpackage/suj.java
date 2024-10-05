package defpackage;

import android.accounts.Account;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class suj implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ suj u = new suj(20);
    public static final /* synthetic */ suj t = new suj(19);
    public static final /* synthetic */ suj s = new suj(18);
    public static final /* synthetic */ suj r = new suj(17);
    public static final /* synthetic */ suj q = new suj(16);
    public static final /* synthetic */ suj p = new suj(15);
    public static final /* synthetic */ suj o = new suj(14);
    public static final /* synthetic */ suj n = new suj(13);
    public static final /* synthetic */ suj m = new suj(12);
    public static final /* synthetic */ suj l = new suj(11);
    public static final /* synthetic */ suj k = new suj(10);
    public static final /* synthetic */ suj j = new suj(9);
    public static final /* synthetic */ suj i = new suj(8);
    public static final /* synthetic */ suj h = new suj(7);
    public static final /* synthetic */ suj g = new suj(6);
    public static final /* synthetic */ suj f = new suj(5);
    public static final /* synthetic */ suj e = new suj(4);
    public static final /* synthetic */ suj d = new suj(3);
    public static final /* synthetic */ suj c = new suj(2);
    public static final /* synthetic */ suj b = new suj(1);
    public static final /* synthetic */ suj a = new suj(0);

    private /* synthetic */ suj(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return ammv.j((byte[]) obj);
            case 1:
                return ammv.j((byte[]) obj);
            case 2:
                amrw h2 = amrz.h();
                for (Object obj2 : (Object[]) obj) {
                    Pair pair = (Pair) obj2;
                    h2.g((String) pair.first, (ammv) pair.second);
                }
                return h2.c();
            case 3:
                return syv.c((awoi) obj);
            case 4:
                return ((ahel) obj).a().x();
            case 5:
                return ((ahel) obj).a().I();
            case 6:
                return ((ahel) obj).a().U();
            case 7:
                return ((ahel) obj).a().w();
            case 8:
                return ((ahel) obj).a().P();
            case 9:
                return ((ahel) obj).a().V();
            case 10:
                return ((ahel) obj).a().v();
            case 11:
                return ((ahel) obj).a().x();
            case 12:
                return (Account) ((ammv) obj).c();
            case 13:
                return (aakt) ((ammv) obj).c();
            case 14:
                return (aakt) ((ammv) obj).c();
            case 15:
                return ((aakz) obj).c;
            case 16:
                return ((aakz) obj).c;
            case 17:
                return Boolean.valueOf(((yrm) obj).a);
            case 18:
                return Boolean.valueOf(((yrm) obj).b);
            case 19:
                return Integer.valueOf(((yrm) obj).c);
            default:
                return ((agcm) obj).d();
        }
    }
}
