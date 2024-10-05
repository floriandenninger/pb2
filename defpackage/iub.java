package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iub implements ayrw {
    private final /* synthetic */ int v;
    public static final /* synthetic */ iub u = new iub(20);
    public static final /* synthetic */ iub t = new iub(19);
    public static final /* synthetic */ iub s = new iub(18);
    public static final /* synthetic */ iub r = new iub(17);
    public static final /* synthetic */ iub q = new iub(16);
    public static final /* synthetic */ iub p = new iub(15);
    public static final /* synthetic */ iub o = new iub(14);
    public static final /* synthetic */ iub n = new iub(13);
    public static final /* synthetic */ iub m = new iub(12);
    public static final /* synthetic */ iub l = new iub(11);
    public static final /* synthetic */ iub k = new iub(10);
    public static final /* synthetic */ iub j = new iub(9);
    public static final /* synthetic */ iub i = new iub(8);
    public static final /* synthetic */ iub h = new iub(7);
    public static final /* synthetic */ iub g = new iub(6);
    public static final /* synthetic */ iub f = new iub(5);
    public static final /* synthetic */ iub e = new iub(4);
    public static final /* synthetic */ iub d = new iub(3);
    public static final /* synthetic */ iub c = new iub(2);
    public static final /* synthetic */ iub b = new iub(1);
    public static final /* synthetic */ iub a = new iub(0);

    private /* synthetic */ iub(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrw
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                return ((Optional) obj).isPresent();
            case 1:
                int i2 = ivj.cs;
                return ((Throwable) obj) instanceof cnq;
            case 2:
                return ((aaxh) obj).a != null;
            case 3:
                return ((ammv) obj).h();
            case 4:
                return ((Boolean) ((ammw) obj).a).booleanValue();
            case 5:
                aakz aakzVar = (aakz) obj;
                return (aakzVar == null || aakzVar.c == null) ? false : true;
            case 6:
                return jjo.a.contains(((jia) obj).b);
            case 7:
                return ((aakz) obj).c != null;
            case 8:
                return ((ammv) obj).h();
            case 9:
                joj jojVar = (joj) obj;
                return jojVar.b.d(jojVar.a).h();
            case 10:
                return !((String) obj).isEmpty();
            case 11:
                return ((awji) obj) != null;
            case 12:
                return ((awiv) obj).b == 1;
            case 13:
                return !((String) obj).isEmpty();
            case 14:
                return ((Boolean) obj).booleanValue();
            case 15:
                return ((aakz) obj).c != null;
            case 16:
                return ((awil) obj) != null;
            case 17:
                return ((aakz) obj).c != null;
            case 18:
                return ((amsx) obj).isEmpty();
            case 19:
                return Objects.nonNull((awjp) obj);
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
