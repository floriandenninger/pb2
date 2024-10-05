package defpackage;

import j$.util.Optional;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jif implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jif u = new jif(20);
    public static final /* synthetic */ jif t = new jif(19);
    public static final /* synthetic */ jif s = new jif(18);
    public static final /* synthetic */ jif r = new jif(17);
    public static final /* synthetic */ jif q = new jif(16);
    public static final /* synthetic */ jif p = new jif(15);
    public static final /* synthetic */ jif o = new jif(14);
    public static final /* synthetic */ jif n = new jif(13);
    public static final /* synthetic */ jif m = new jif(12);
    public static final /* synthetic */ jif l = new jif(11);
    public static final /* synthetic */ jif k = new jif(10);
    public static final /* synthetic */ jif j = new jif(9);
    public static final /* synthetic */ jif i = new jif(8);
    public static final /* synthetic */ jif h = new jif(7);
    public static final /* synthetic */ jif g = new jif(6);
    public static final /* synthetic */ jif f = new jif(5);
    public static final /* synthetic */ jif e = new jif(4);
    public static final /* synthetic */ jif d = new jif(3);
    public static final /* synthetic */ jif c = new jif(2);
    public static final /* synthetic */ jif b = new jif(1);
    public static final /* synthetic */ jif a = new jif(0);

    private /* synthetic */ jif(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return ((ayqj) obj).g();
            case 1:
                return aypn.w((amru) obj);
            case 2:
                amsx amsxVar = jjo.a;
                return ((jia) obj).a;
            case 3:
                amsx amsxVar2 = jjo.a;
                return aypn.z((jia) obj).F();
            case 4:
                return ((ayrl) obj).O(iub.g).ak(TimeUnit.MILLISECONDS).F();
            case 5:
                aakt aaktVar = ((aakz) obj).c;
                aaktVar.getClass();
                return aaktVar;
            case 6:
                return amkq.ao((amru) obj);
            case 7:
                return (byte[]) ((ammv) obj).c();
            case 8:
                try {
                    return (avfb) aonm.parseFrom(avfb.a, (byte[]) obj, aomw.b());
                } catch (aoob e2) {
                    throw new aoob("Could not parse ThemeSetEntity", e2);
                }
            case 9:
                return ((joj) obj).a;
            case 10:
                return Optional.of((aakt) obj);
            case 11:
                zga.d("Error handling the deletion of the smart downloads list", (Throwable) obj);
                return agou.c;
            case 12:
                awwg b2 = awwg.b(((awwj) obj).c);
                return b2 == null ? awwg.UNKNOWN : b2;
            case 13:
                return ((awja) obj).f();
            case 14:
                return ((awja) obj).f();
            case 15:
                return amru.o((List) obj);
            case 16:
                return aypy.T((List) obj);
            case 17:
                awwg b3 = awwg.b(((awwj) obj).c);
                return b3 == null ? awwg.UNKNOWN : b3;
            case 18:
                return ((awiu) obj).getDownloads();
            case 19:
                awiv awivVar = (awiv) obj;
                return awivVar.b == 1 ? (String) awivVar.c : "";
            default:
                return Optional.of((aakt) obj);
        }
    }
}
