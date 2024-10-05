package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afyf implements amml {
    private final /* synthetic */ int u;
    public static final /* synthetic */ afyf t = new afyf(20);
    public static final /* synthetic */ afyf s = new afyf(19);
    public static final /* synthetic */ afyf r = new afyf(18);
    public static final /* synthetic */ afyf q = new afyf(17);
    public static final /* synthetic */ afyf p = new afyf(16);
    public static final /* synthetic */ afyf o = new afyf(15);
    public static final /* synthetic */ afyf n = new afyf(14);
    public static final /* synthetic */ afyf m = new afyf(13);
    public static final /* synthetic */ afyf l = new afyf(12);
    public static final /* synthetic */ afyf k = new afyf(11);
    public static final /* synthetic */ afyf j = new afyf(10);
    public static final /* synthetic */ afyf i = new afyf(9);
    public static final /* synthetic */ afyf h = new afyf(8);
    public static final /* synthetic */ afyf g = new afyf(7);
    public static final /* synthetic */ afyf f = new afyf(6);
    public static final /* synthetic */ afyf e = new afyf(5);
    public static final /* synthetic */ afyf d = new afyf(4);
    public static final /* synthetic */ afyf c = new afyf(3);
    public static final /* synthetic */ afyf b = new afyf(1);
    public static final /* synthetic */ afyf a = new afyf(0);

    public /* synthetic */ afyf(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.u) {
            case 0:
                return (uch) ((cnm) obj).a;
            case 1:
                aone builder = ((awwb) obj).toBuilder();
                builder.copyOnWrite();
                awwb awwbVar = (awwb) builder.instance;
                awwbVar.b &= -3;
                awwbVar.d = awwb.a.d;
                builder.copyOnWrite();
                awwb awwbVar2 = (awwb) builder.instance;
                awwbVar2.b &= -5;
                awwbVar2.e = awwb.a.e;
                builder.copyOnWrite();
                awwb awwbVar3 = (awwb) builder.instance;
                awwbVar3.b &= -2;
                awwbVar3.c = awwb.a.c;
                return (awwb) builder.build();
            case 2:
                return aear.Z((twy) obj);
            case 3:
                aone aoneVar = (aone) obj;
                aoneVar.copyOnWrite();
                awwf awwfVar = (awwf) aoneVar.instance;
                awwf awwfVar2 = awwf.a;
                awwfVar.b |= 512;
                awwfVar.o = 1;
                return aoneVar;
            case 4:
                return Boolean.valueOf(((awwf) obj).o > 0);
            case 5:
                return new Exception((Throwable) obj);
            case 6:
                return new Exception((Throwable) obj);
            case 7:
                return ((agnb) obj).a;
            case 8:
                int i2 = aghc.r;
                return amru.q();
            case 9:
                return amlr.a;
            case 10:
                int i3 = aghc.r;
                return amru.q();
            case 11:
                ammv ammvVar = (ammv) obj;
                if (!ammvVar.h()) {
                    return null;
                }
                aqoz aqozVar = (aqoz) ammvVar.c();
                if ((aqozVar.b.c & 16) != 0) {
                    return aqozVar.getError();
                }
                return null;
            case 12:
                return ((ajbl) obj).y();
            case 13:
                return ((anjr) obj).a;
            case 14:
                return ((ajbl) obj).O();
            case 15:
                return ((agzw) obj).toString();
            case 16:
                return ((ajbl) obj).r();
            case 17:
                return ((ajbl) obj).A();
            case 18:
                return ((ajbl) obj).H();
            case 19:
                return ((ajbl) obj).K();
            default:
                return ((ajbl) obj).t();
        }
    }
}
