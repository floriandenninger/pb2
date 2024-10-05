package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class loc implements amml {
    private final /* synthetic */ int v;
    public static final /* synthetic */ loc u = new loc(20);
    public static final /* synthetic */ loc t = new loc(19);
    public static final /* synthetic */ loc s = new loc(18);
    public static final /* synthetic */ loc r = new loc(17);
    public static final /* synthetic */ loc q = new loc(16);
    public static final /* synthetic */ loc p = new loc(15);
    public static final /* synthetic */ loc o = new loc(14);
    public static final /* synthetic */ loc n = new loc(13);
    public static final /* synthetic */ loc m = new loc(12);
    public static final /* synthetic */ loc l = new loc(11);
    public static final /* synthetic */ loc k = new loc(10);
    public static final /* synthetic */ loc j = new loc(9);
    public static final /* synthetic */ loc i = new loc(8);
    public static final /* synthetic */ loc h = new loc(7);
    public static final /* synthetic */ loc g = new loc(6);
    public static final /* synthetic */ loc f = new loc(5);
    public static final /* synthetic */ loc e = new loc(4);
    public static final /* synthetic */ loc d = new loc(3);
    public static final /* synthetic */ loc c = new loc(2);
    public static final /* synthetic */ loc b = new loc(1);
    public static final /* synthetic */ loc a = new loc(0);

    private /* synthetic */ loc(int i2) {
        this.v = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return Boolean.valueOf(((lox) obj).l);
            case 1:
                return Boolean.valueOf(((lox) obj).f);
            case 2:
                aone builder = ((fof) obj).toBuilder();
                builder.copyOnWrite();
                fof fofVar = (fof) builder.instance;
                fofVar.b |= 4;
                fofVar.e = 1;
                return (fof) builder.build();
            case 3:
                aone builder2 = ((fof) obj).toBuilder();
                builder2.copyOnWrite();
                fof fofVar2 = (fof) builder2.instance;
                fofVar2.b &= -5;
                fofVar2.e = 0;
                return (fof) builder2.build();
            case 4:
                avzr b2 = avzr.b(((awvr) obj).m);
                return b2 == null ? avzr.VIDEO_QUALITY_SETTING_UNKNOWN : b2;
            case 5:
                avzr b3 = avzr.b(((awvr) obj).n);
                return b3 == null ? avzr.VIDEO_QUALITY_SETTING_UNKNOWN : b3;
            case 6:
                avzr avzrVar = avzr.VIDEO_QUALITY_SETTING_DATA_SAVER;
                avzr b4 = avzr.b(((awvr) obj).m);
                if (b4 == null) {
                    b4 = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                return Boolean.valueOf(avzrVar.equals(b4));
            case 7:
                aone builder3 = ((gnh) obj).toBuilder();
                builder3.copyOnWrite();
                gnh gnhVar = (gnh) builder3.instance;
                gnhVar.b |= 1;
                gnhVar.c = true;
                return (gnh) builder3.build();
            case 8:
                aone builder4 = ((gnh) obj).toBuilder();
                builder4.copyOnWrite();
                gnh gnhVar2 = (gnh) builder4.instance;
                gnhVar2.b |= 2;
                gnhVar2.d = true;
                return (gnh) builder4.build();
            case 9:
                return obj;
            case 10:
                aone builder5 = ((gnh) obj).toBuilder();
                builder5.copyOnWrite();
                gnh gnhVar3 = (gnh) builder5.instance;
                gnhVar3.b |= 32;
                gnhVar3.h = true;
                return (gnh) builder5.build();
            case 11:
                aone builder6 = ((gnh) obj).toBuilder();
                builder6.copyOnWrite();
                gnh gnhVar4 = (gnh) builder6.instance;
                gnhVar4.b |= 32;
                gnhVar4.h = false;
                return (gnh) builder6.build();
            case 12:
                aone builder7 = ((lym) obj).toBuilder();
                builder7.copyOnWrite();
                lym lymVar = (lym) builder7.instance;
                lymVar.b |= 1;
                lymVar.c = true;
                return (lym) builder7.build();
            case 13:
                apxf apxfVar = ((aptg) obj).g;
                return apxfVar == null ? apxf.a : apxfVar;
            case 14:
                return ((atvw) obj).j;
            case 15:
                atvu atvuVar = ((atvw) obj).i;
                if (atvuVar == null) {
                    atvuVar = atvu.a;
                }
                if (atvuVar.b == 102716411) {
                    return (arej) atvuVar.c;
                }
                return arej.a;
            case 16:
                apxf apxfVar2 = ((atvt) obj).e;
                return apxfVar2 == null ? apxf.a : apxfVar2;
            case 17:
                atvx b5 = atvx.b(((atvt) obj).h);
                return b5 == null ? atvx.PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN : b5;
            case 18:
                return ((atvt) obj).c;
            case 19:
                return ((atvt) obj).d;
            default:
                apxf apxfVar3 = ((atvw) obj).e;
                return apxfVar3 == null ? apxf.a : apxfVar3;
        }
    }
}
