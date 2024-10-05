package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gip implements Callable {
    private final /* synthetic */ int v;
    public static final /* synthetic */ gip u = new gip(20);
    public static final /* synthetic */ gip t = new gip(19);
    public static final /* synthetic */ gip s = new gip(18);
    public static final /* synthetic */ gip r = new gip(17);
    public static final /* synthetic */ gip q = new gip(16);
    public static final /* synthetic */ gip p = new gip(15);
    public static final /* synthetic */ gip o = new gip(14);
    public static final /* synthetic */ gip n = new gip(13);
    public static final /* synthetic */ gip m = new gip(12);
    public static final /* synthetic */ gip l = new gip(11);
    public static final /* synthetic */ gip k = new gip(10);
    public static final /* synthetic */ gip j = new gip(9);
    public static final /* synthetic */ gip i = new gip(8);
    public static final /* synthetic */ gip h = new gip(7);
    public static final /* synthetic */ gip g = new gip(6);
    public static final /* synthetic */ gip f = new gip(5);
    public static final /* synthetic */ gip e = new gip(4);
    public static final /* synthetic */ gip d = new gip(3);
    public static final /* synthetic */ gip c = new gip(2);
    public static final /* synthetic */ gip b = new gip(1);
    public static final /* synthetic */ gip a = new gip(0);

    private /* synthetic */ gip(int i2) {
        this.v = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.v) {
            case 0:
                gah a2 = gai.a();
                a2.c(gaj.ACTIVITY_DEFAULT);
                a2.d(gak.ACTIVITY_DEFAULT);
                return a2.a();
            case 1:
                return new dxx();
            case 2:
                gah a3 = gai.a();
                a3.b(false);
                a3.c(gaj.ACTIVITY_DEFAULT);
                return a3.a();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 8:
                return true;
            case 12:
                boolean z = tqd.a;
            case 9:
            case 10:
            case 11:
                return null;
            case 13:
            case 14:
                return null;
            case 15:
                return awml.a;
            case 16:
                return amru.f();
            case 17:
                return amsx.i();
            case 18:
                return null;
            case 19:
                return new vec(2);
            default:
                return new vec(4);
        }
    }
}
