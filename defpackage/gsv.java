package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gsv implements ayrw {
    private final /* synthetic */ int v;
    public static final /* synthetic */ gsv u = new gsv(20);
    public static final /* synthetic */ gsv t = new gsv(19);
    public static final /* synthetic */ gsv s = new gsv(18);
    public static final /* synthetic */ gsv r = new gsv(17);
    public static final /* synthetic */ gsv q = new gsv(16);
    public static final /* synthetic */ gsv p = new gsv(15);
    public static final /* synthetic */ gsv o = new gsv(14);
    public static final /* synthetic */ gsv n = new gsv(13);
    public static final /* synthetic */ gsv m = new gsv(12);
    public static final /* synthetic */ gsv l = new gsv(11);
    public static final /* synthetic */ gsv k = new gsv(10);
    public static final /* synthetic */ gsv j = new gsv(9);
    public static final /* synthetic */ gsv i = new gsv(8);
    public static final /* synthetic */ gsv h = new gsv(7);
    public static final /* synthetic */ gsv g = new gsv(6);
    public static final /* synthetic */ gsv f = new gsv(5);
    public static final /* synthetic */ gsv e = new gsv(4);
    public static final /* synthetic */ gsv d = new gsv(3);
    public static final /* synthetic */ gsv c = new gsv(2);
    public static final /* synthetic */ gsv b = new gsv(1);
    public static final /* synthetic */ gsv a = new gsv(0);

    private /* synthetic */ gsv(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrw
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                glc glcVar = (glc) obj;
                int i2 = gsy.e;
                return glcVar == glc.NOT_IN_PIP;
            case 1:
                return ((ammv) obj).h();
            case 2:
                int i3 = hav.f;
                return !((Boolean) obj).booleanValue();
            case 3:
                return hpa.J((hpa) obj);
            case 4:
                return !((Boolean) obj).booleanValue();
            case 5:
                return !((Boolean) obj).booleanValue();
            case 6:
                return hpa.K((hpa) obj);
            case 7:
                return ((Throwable) obj) instanceof cnq;
            case 8:
                return ((ammv) obj).h();
            case 9:
                return ((aakz) obj).c != null;
            case 10:
                isg isgVar = (isg) obj;
                avuf avufVar = isgVar.a;
                avuf avufVar2 = isgVar.b;
                if (avufVar == null) {
                    if (avufVar2 != null && avufVar2.getNumVideosCompleted().intValue() > 0) {
                        return true;
                    }
                } else if (avufVar2 != null && avufVar2.getNumVideosCompleted().intValue() > avufVar.getNumVideosCompleted().intValue()) {
                    return true;
                }
                return false;
            case 11:
                return ((aakz) obj).c != null;
            case 12:
                isg isgVar2 = (isg) obj;
                avuf avufVar3 = isgVar2.a;
                avuf avufVar4 = isgVar2.b;
                if (avufVar3 == null) {
                    if (avufVar4 != null && avufVar4.getNumVideosFailed().intValue() > 0) {
                        return true;
                    }
                } else if (avufVar4 != null && avufVar4.getNumVideosFailed().intValue() > avufVar3.getNumVideosFailed().intValue()) {
                    return true;
                }
                return false;
            case 13:
                return ((aakz) obj).c != null;
            case 14:
                return ((aakz) obj).c != null;
            case 15:
                return ((Boolean) obj).booleanValue();
            case 16:
                return ((Boolean) obj).booleanValue();
            case 17:
                return ((Boolean) obj).booleanValue();
            case 18:
                return ((aakz) obj).c != null;
            case 19:
                return ((foq) obj).a();
            default:
                int i4 = ivj.cs;
                return ((Boolean) obj).booleanValue();
        }
    }
}
