package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aipq implements amml {
    private final /* synthetic */ int v;
    public static final /* synthetic */ aipq u = new aipq(20);
    public static final /* synthetic */ aipq t = new aipq(19);
    public static final /* synthetic */ aipq s = new aipq(18);
    public static final /* synthetic */ aipq r = new aipq(17);
    public static final /* synthetic */ aipq q = new aipq(16);
    public static final /* synthetic */ aipq p = new aipq(15);
    public static final /* synthetic */ aipq o = new aipq(14);
    public static final /* synthetic */ aipq n = new aipq(13);
    public static final /* synthetic */ aipq m = new aipq(12);
    public static final /* synthetic */ aipq l = new aipq(11);
    public static final /* synthetic */ aipq k = new aipq(10);
    public static final /* synthetic */ aipq j = new aipq(9);
    public static final /* synthetic */ aipq i = new aipq(8);
    public static final /* synthetic */ aipq h = new aipq(7);
    public static final /* synthetic */ aipq g = new aipq(6);
    public static final /* synthetic */ aipq f = new aipq(5);
    public static final /* synthetic */ aipq e = new aipq(4);
    public static final /* synthetic */ aipq d = new aipq(3);
    public static final /* synthetic */ aipq c = new aipq(2);
    public static final /* synthetic */ aipq b = new aipq(1);
    public static final /* synthetic */ aipq a = new aipq(0);

    private /* synthetic */ aipq(int i2) {
        this.v = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return Boolean.valueOf(1 == (((awwm) obj).b & 1));
            case 1:
                return ((awwm) obj).d;
            case 2:
                return ((ajbl) obj).I();
            case 3:
                return ((ajbl) obj).M();
            case 4:
                return ((ajbl) obj).C();
            case 5:
                return ((ajbl) obj).P();
            case 6:
                return ((ajbl) obj).R();
            case 7:
                return ((aioc) obj).V();
            case 8:
                return ((ajbl) obj).t();
            case 9:
                return ((ajbl) obj).u();
            case 10:
                return ((ajbl) obj).v();
            case 11:
                return ((ajbl) obj).C();
            case 12:
                return ((ajbl) obj).I();
            case 13:
                return ((ajbl) obj).M();
            case 14:
                return ((ajbl) obj).W();
            case 15:
                return Boolean.valueOf(((Activity) obj).isFinishing());
            case 16:
                return new ajrd(((Long) obj).longValue());
            case 17:
                return Boolean.valueOf(((awwr) obj).d);
            case 18:
                awwr awwrVar = (awwr) obj;
                return Long.toString(awwrVar == null ? -1L : awwrVar.e);
            case 19:
                auqd auqdVar = (auqd) obj;
                if (auqdVar.b == 64166933) {
                    return (auqc) auqdVar.c;
                }
                return auqc.a;
            default:
                return ajcq.b((aqyg) obj);
        }
    }
}
