package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adpv implements amml {
    private final /* synthetic */ int u;
    public static final /* synthetic */ adpv t = new adpv(20);
    public static final /* synthetic */ adpv s = new adpv(19);
    public static final /* synthetic */ adpv r = new adpv(18);
    public static final /* synthetic */ adpv q = new adpv(17);
    public static final /* synthetic */ adpv p = new adpv(16);
    public static final /* synthetic */ adpv o = new adpv(15);
    public static final /* synthetic */ adpv n = new adpv(13);
    public static final /* synthetic */ adpv m = new adpv(12);
    public static final /* synthetic */ adpv l = new adpv(11);
    public static final /* synthetic */ adpv k = new adpv(10);
    public static final /* synthetic */ adpv j = new adpv(9);
    public static final /* synthetic */ adpv i = new adpv(8);
    public static final /* synthetic */ adpv h = new adpv(7);
    public static final /* synthetic */ adpv g = new adpv(6);
    public static final /* synthetic */ adpv f = new adpv(5);
    public static final /* synthetic */ adpv e = new adpv(4);
    public static final /* synthetic */ adpv d = new adpv(3);
    public static final /* synthetic */ adpv c = new adpv(2);
    public static final /* synthetic */ adpv b = new adpv(1);
    public static final /* synthetic */ adpv a = new adpv(0);

    public /* synthetic */ adpv(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        aone builder;
        aone builder2;
        switch (this.u) {
            case 0:
                return Boolean.valueOf(((awvh) obj).d);
            case 1:
                return Boolean.valueOf(((awvh) obj).c);
            case 2:
                awvh awvhVar = (awvh) obj;
                int i2 = adqc.E;
                if (awvhVar == null) {
                    builder = awvh.a.createBuilder();
                } else {
                    builder = awvhVar.toBuilder();
                }
                builder.copyOnWrite();
                awvh awvhVar2 = (awvh) builder.instance;
                awvhVar2.b |= 2;
                awvhVar2.d = true;
                return (awvh) builder.build();
            case 3:
                awvh awvhVar3 = (awvh) obj;
                int i3 = adqc.E;
                if (awvhVar3 == null) {
                    builder2 = awvh.a.createBuilder();
                } else {
                    builder2 = awvhVar3.toBuilder();
                }
                builder2.copyOnWrite();
                awvh awvhVar4 = (awvh) builder2.instance;
                awvhVar4.b |= 1;
                awvhVar4.c = true;
                return (awvh) builder2.build();
            case 4:
                Boolean bool = (Boolean) obj;
                int i4 = adqc.E;
                return bool;
            case 5:
                Boolean bool2 = (Boolean) obj;
                int i5 = adqc.E;
                return bool2;
            case 6:
                return Integer.valueOf(((adxk) obj).a.getType());
            case 7:
                aone aoneVar = (aone) obj;
                aoneVar.copyOnWrite();
                awvr awvrVar = (awvr) aoneVar.instance;
                awvr awvrVar2 = awvr.a;
                awvrVar.b |= 4;
                awvrVar.f = 3;
                return aoneVar;
            case 8:
                return Boolean.valueOf(((awvr) obj).f >= 3);
            case 9:
                return (ovs) ((aone) obj).build();
            case 10:
                return ((ovs) obj).toByteArray();
            case 11:
                return Integer.valueOf(((aeyf) obj).b);
            case 12:
                return Long.valueOf(((aeyf) obj).c);
            case 13:
                return new afft((byte[]) obj);
            case 14:
                aone builder3 = ((awvr) obj).toBuilder();
                builder3.copyOnWrite();
                awvr awvrVar3 = (awvr) builder3.instance;
                awvrVar3.b |= 256;
                awvrVar3.q = true;
                return (awvr) builder3.build();
            case 15:
                return ((awvs) obj).d;
            case 16:
                aone aoneVar2 = (aone) obj;
                aoneVar2.copyOnWrite();
                awwa awwaVar = (awwa) aoneVar2.instance;
                awwa awwaVar2 = awwa.a;
                awwaVar.b |= 1;
                awwaVar.j = 1;
                return aoneVar2;
            case 17:
                return Boolean.valueOf(((awwa) obj).j > 0);
            case 18:
                awwv b2 = awwv.b(((awwz) obj).b);
                return b2 == null ? awwv.ACTION_TYPE_UNKNOWN : b2;
            case 19:
                awwv b3 = awwv.b(((awxb) obj).b);
                return b3 == null ? awwv.ACTION_TYPE_UNKNOWN : b3;
            default:
                return cnm.a((cnq) obj);
        }
    }
}
