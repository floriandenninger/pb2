package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lyk implements ykr {
    private final /* synthetic */ int v;
    public static final /* synthetic */ lyk u = new lyk(20);
    public static final /* synthetic */ lyk t = new lyk(19);
    public static final /* synthetic */ lyk s = new lyk(18);
    public static final /* synthetic */ lyk r = new lyk(17);
    public static final /* synthetic */ lyk q = new lyk(16);
    public static final /* synthetic */ lyk p = new lyk(15);
    public static final /* synthetic */ lyk o = new lyk(14);
    public static final /* synthetic */ lyk n = new lyk(13);
    public static final /* synthetic */ lyk m = new lyk(12);
    public static final /* synthetic */ lyk l = new lyk(11);
    public static final /* synthetic */ lyk k = new lyk(10);
    public static final /* synthetic */ lyk j = new lyk(9);
    public static final /* synthetic */ lyk i = new lyk(8);
    public static final /* synthetic */ lyk h = new lyk(7);
    public static final /* synthetic */ lyk g = new lyk(6);
    public static final /* synthetic */ lyk f = new lyk(5);
    public static final /* synthetic */ lyk e = new lyk(4);
    public static final /* synthetic */ lyk d = new lyk(3);
    public static final /* synthetic */ lyk c = new lyk(2);
    public static final /* synthetic */ lyk b = new lyk(1);
    public static final /* synthetic */ lyk a = new lyk(0);

    private /* synthetic */ lyk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ykr
    public final Object a(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return lyl.a((vfm) obj, (lym) obj2);
            case 1:
                aone builder = ((awvr) obj).toBuilder();
                avzr avzrVar = ((Boolean) obj2).booleanValue() ? avzr.VIDEO_QUALITY_SETTING_DATA_SAVER : avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                builder.copyOnWrite();
                awvr awvrVar = (awvr) builder.instance;
                awvrVar.m = avzrVar.e;
                awvrVar.b |= 16;
                return (awvr) builder.build();
            case 2:
                return mcx.a((vfm) obj, (mcz) obj2);
            case 3:
                return opm.a((vfm) obj, (opo) obj2);
            case 4:
                aone aoneVar = (aone) obj;
                aoneVar.copyOnWrite();
                arpi arpiVar = (arpi) aoneVar.instance;
                arnb arnbVar = (arnb) ((aone) obj2).build();
                arpi arpiVar2 = arpi.a;
                arnbVar.getClass();
                arpiVar.e = arnbVar;
                arpiVar.b |= 1;
                return aoneVar;
            case 5:
                aone aoneVar2 = (aone) obj2;
                amxd listIterator = ((ywt) obj).a.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    String str = (String) ((Map.Entry) listIterator.next()).getKey();
                    if (str.startsWith("incognito_promotion_already_shown")) {
                        aoneVar2.bc(str.substring(33));
                    }
                }
                return aoneVar2;
            case 6:
                aone aoneVar3 = (aone) obj;
                aoneVar3.copyOnWrite();
                arxd arxdVar = (arxd) aoneVar3.instance;
                arnb arnbVar2 = (arnb) ((aone) obj2).build();
                arxd arxdVar2 = arxd.a;
                arnbVar2.getClass();
                arxdVar.c = arnbVar2;
                arxdVar.b |= 1;
                return aoneVar3;
            case 7:
                aone builder2 = ((lae) obj).toBuilder();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                builder2.copyOnWrite();
                lae laeVar = (lae) builder2.instance;
                laeVar.b |= 128;
                laeVar.i = booleanValue;
                return (lae) builder2.build();
            case 8:
                aone builder3 = ((lae) obj).toBuilder();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                builder3.copyOnWrite();
                lae laeVar2 = (lae) builder3.instance;
                laeVar2.b |= 1;
                laeVar2.c = booleanValue2;
                return (lae) builder3.build();
            case 9:
                aone builder4 = ((lae) obj).toBuilder();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                builder4.copyOnWrite();
                lae laeVar3 = (lae) builder4.instance;
                laeVar3.b |= 64;
                laeVar3.h = booleanValue3;
                return (lae) builder4.build();
            case 10:
                aone builder5 = ((lae) obj).toBuilder();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                builder5.copyOnWrite();
                lae laeVar4 = (lae) builder5.instance;
                laeVar4.b |= 256;
                laeVar4.j = booleanValue4;
                return (lae) builder5.build();
            case 11:
                aone builder6 = ((lae) obj).toBuilder();
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                builder6.copyOnWrite();
                lae laeVar5 = (lae) builder6.instance;
                laeVar5.b |= 32;
                laeVar5.g = booleanValue5;
                return (lae) builder6.build();
            case 12:
                aone builder7 = ((lae) obj).toBuilder();
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                builder7.copyOnWrite();
                lae laeVar6 = (lae) builder7.instance;
                laeVar6.b |= 4;
                laeVar6.d = booleanValue6;
                return (lae) builder7.build();
            case 13:
                aone builder8 = ((lae) obj).toBuilder();
                boolean booleanValue7 = ((Boolean) obj2).booleanValue();
                builder8.copyOnWrite();
                lae laeVar7 = (lae) builder8.instance;
                laeVar7.b |= 8;
                laeVar7.e = booleanValue7;
                return (lae) builder8.build();
            case 14:
                aone builder9 = ((lae) obj).toBuilder();
                boolean booleanValue8 = ((Boolean) obj2).booleanValue();
                builder9.copyOnWrite();
                lae laeVar8 = (lae) builder9.instance;
                laeVar8.b |= 16;
                laeVar8.f = booleanValue8;
                return (lae) builder9.build();
            case 15:
                aone aoneVar4 = (aone) obj2;
                amxd listIterator2 = ((ywt) obj).a.entrySet().listIterator();
                while (listIterator2.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator2.next();
                    aoneVar4.be((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                return aoneVar4;
            case 16:
                return (awuu) obj2;
            case 17:
                return (awuu) obj2;
            case 18:
                aone aoneVar5 = (aone) obj;
                aoneVar5.copyOnWrite();
                ario arioVar = (ario) aoneVar5.instance;
                arnb arnbVar3 = (arnb) ((aone) obj2).build();
                ario arioVar2 = ario.a;
                arnbVar3.getClass();
                arioVar.e = arnbVar3;
                arioVar.b |= 1;
                return aoneVar5;
            case 19:
                aone aoneVar6 = (aone) obj;
                aoneVar6.copyOnWrite();
                arry arryVar = (arry) aoneVar6.instance;
                arnb arnbVar4 = (arnb) ((aone) obj2).build();
                arry arryVar2 = arry.a;
                arnbVar4.getClass();
                arryVar.c = arnbVar4;
                arryVar.b |= 1;
                return aoneVar6;
            default:
                aone aoneVar7 = (aone) obj;
                aoneVar7.copyOnWrite();
                arzu arzuVar = (arzu) aoneVar7.instance;
                arnb arnbVar5 = (arnb) ((aone) obj2).build();
                arzu arzuVar2 = arzu.a;
                arnbVar5.getClass();
                arzuVar.c = arnbVar5;
                arzuVar.b |= 1;
                return aoneVar7;
        }
    }
}
