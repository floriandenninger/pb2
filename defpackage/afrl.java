package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afrl implements ykr {
    private final /* synthetic */ int v;
    public static final /* synthetic */ afrl u = new afrl(20);
    public static final /* synthetic */ afrl t = new afrl(19);
    public static final /* synthetic */ afrl s = new afrl(18);
    public static final /* synthetic */ afrl r = new afrl(17);
    public static final /* synthetic */ afrl q = new afrl(16);
    public static final /* synthetic */ afrl p = new afrl(15);
    public static final /* synthetic */ afrl o = new afrl(14);
    public static final /* synthetic */ afrl n = new afrl(13);
    public static final /* synthetic */ afrl m = new afrl(12);
    public static final /* synthetic */ afrl l = new afrl(11);
    public static final /* synthetic */ afrl k = new afrl(10);
    public static final /* synthetic */ afrl j = new afrl(9);
    public static final /* synthetic */ afrl i = new afrl(8);
    public static final /* synthetic */ afrl h = new afrl(7);
    public static final /* synthetic */ afrl g = new afrl(6);
    public static final /* synthetic */ afrl f = new afrl(5);
    public static final /* synthetic */ afrl e = new afrl(4);
    public static final /* synthetic */ afrl d = new afrl(3);
    public static final /* synthetic */ afrl c = new afrl(2);
    public static final /* synthetic */ afrl b = new afrl(1);
    public static final /* synthetic */ afrl a = new afrl(0);

    private /* synthetic */ afrl(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ykr
    public final Object a(Object obj, Object obj2) {
        awwr awwrVar;
        switch (this.v) {
            case 0:
                aone aoneVar = (aone) obj2;
                amxd listIterator = ((ywt) obj).a.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (str.startsWith("dispatched_event_count_")) {
                        aoneVar.bp(str.substring(23), ((Integer) value).intValue());
                    } else if (str.startsWith("last_capture_time_ms_")) {
                        aoneVar.bs(str.substring(21), ((Long) value).longValue());
                    } else if (str.startsWith("dispatch_count_")) {
                        aoneVar.bo(str.substring(15), ((Integer) value).intValue());
                    } else if (str.startsWith("sum_time_between_")) {
                        aoneVar.bu(str.substring(17, str.length() - 12), ((Long) value).longValue());
                    } else if (str.startsWith("expired_events_")) {
                        aoneVar.br(str.substring(15), ((Integer) value).intValue());
                    } else if (str.startsWith("stored_events_")) {
                        aoneVar.bt(str.substring(14), ((Integer) value).intValue());
                    } else {
                        aoneVar.bq(str.substring(14, str.length() - 9), ((Boolean) value).booleanValue());
                    }
                }
                return aoneVar;
            case 1:
                aone aoneVar2 = (aone) obj;
                aoneVar2.copyOnWrite();
                asec asecVar = (asec) aoneVar2.instance;
                arnb arnbVar = (arnb) ((aone) obj2).build();
                asec asecVar2 = asec.a;
                arnbVar.getClass();
                asecVar.c = arnbVar;
                asecVar.b |= 1;
                return aoneVar2;
            case 2:
                aone aoneVar3 = (aone) obj2;
                amxd listIterator2 = ((ywt) obj).a.entrySet().listIterator();
                while (listIterator2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) listIterator2.next();
                    String str2 = (String) entry2.getKey();
                    if (str2.startsWith("com.google.android.libraries.youtube.notification.badgecount.badgecount")) {
                        aoneVar3.bv(str2, ((Integer) entry2.getValue()).intValue());
                    } else if (str2.startsWith("com.google.android.libraries.youtube.notification.pref.notification_channel_importance")) {
                        aoneVar3.bw(str2, ((Integer) entry2.getValue()).intValue());
                    } else {
                        aoneVar3.bx(str2, ((Boolean) entry2.getValue()).booleanValue());
                    }
                }
                return aoneVar3;
            case 3:
                aone aoneVar4 = (aone) obj;
                aoneVar4.copyOnWrite();
                arxo arxoVar = (arxo) aoneVar4.instance;
                arnb arnbVar2 = (arnb) ((aone) obj2).build();
                arxo arxoVar2 = arxo.a;
                arnbVar2.getClass();
                arxoVar.c = arnbVar2;
                arxoVar.b |= 1;
                return aoneVar4;
            case 4:
                aone aoneVar5 = (aone) obj;
                aoneVar5.copyOnWrite();
                arww arwwVar = (arww) aoneVar5.instance;
                arnb arnbVar3 = (arnb) ((aone) obj2).build();
                arww arwwVar2 = arww.a;
                arnbVar3.getClass();
                arwwVar.c = arnbVar3;
                arwwVar.b |= 1;
                return aoneVar5;
            case 5:
                aone aoneVar6 = (aone) obj;
                aoneVar6.copyOnWrite();
                arwz arwzVar = (arwz) aoneVar6.instance;
                arnb arnbVar4 = (arnb) ((aone) obj2).build();
                arwz arwzVar2 = arwz.a;
                arnbVar4.getClass();
                arwzVar.c = arnbVar4;
                arwzVar.b |= 1;
                return aoneVar6;
            case 6:
                aone aoneVar7 = (aone) obj;
                aoneVar7.copyOnWrite();
                atqz atqzVar = (atqz) aoneVar7.instance;
                arnb arnbVar5 = (arnb) ((aone) obj2).build();
                atqz atqzVar2 = atqz.a;
                arnbVar5.getClass();
                atqzVar.c = arnbVar5;
                atqzVar.b |= 1;
                return aoneVar7;
            case 7:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                for (Map.Entry entry3 : Collections.unmodifiableMap(((awwj) obj2).d).entrySet()) {
                    String L = yny.L("offline_auto_offline_time_%s", (String) entry3.getKey());
                    awwh awwhVar = (awwh) entry3.getValue();
                    if (!awwh.a.equals(awwhVar)) {
                        editor.putLong(L, awwhVar.c);
                    } else {
                        editor.remove(L);
                    }
                }
                return editor;
            case 8:
                aone builder = ((awwk) obj).toBuilder();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                builder.copyOnWrite();
                awwk awwkVar = (awwk) builder.instance;
                awwkVar.b |= 4;
                awwkVar.e = booleanValue;
                return (awwk) builder.build();
            case 9:
                aone builder2 = ((awwk) obj).toBuilder();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                builder2.copyOnWrite();
                awwk awwkVar2 = (awwk) builder2.instance;
                awwkVar2.b |= 2;
                awwkVar2.d = booleanValue2;
                return (awwk) builder2.build();
            case 10:
                aone builder3 = ((awwk) obj).toBuilder();
                aone createBuilder = aoms.a.createBuilder();
                long parseLong = Long.parseLong((String) obj2);
                createBuilder.copyOnWrite();
                ((aoms) createBuilder.instance).b = parseLong;
                builder3.copyOnWrite();
                awwk awwkVar3 = (awwk) builder3.instance;
                aoms aomsVar = (aoms) createBuilder.build();
                aomsVar.getClass();
                awwkVar3.c = aomsVar;
                awwkVar3.b |= 1;
                return (awwk) builder3.build();
            case 11:
                aone aoneVar8 = (aone) obj;
                aoneVar8.copyOnWrite();
                asbl asblVar = (asbl) aoneVar8.instance;
                arnb arnbVar6 = (arnb) ((aone) obj2).build();
                asbl asblVar2 = asbl.a;
                arnbVar6.getClass();
                asblVar.c = arnbVar6;
                asblVar.b |= 1;
                return aoneVar8;
            case 12:
                aone aoneVar9 = (aone) obj;
                aoneVar9.copyOnWrite();
                aryo aryoVar = (aryo) aoneVar9.instance;
                arnb arnbVar7 = (arnb) ((aone) obj2).build();
                aryo aryoVar2 = aryo.a;
                arnbVar7.getClass();
                aryoVar.c = arnbVar7;
                aryoVar.b |= 1;
                return aoneVar9;
            case 13:
                aone aoneVar10 = (aone) obj2;
                amxd listIterator3 = ((ywt) obj).a.entrySet().listIterator();
                while (listIterator3.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) listIterator3.next();
                    if (aili.f((String) entry4.getKey())) {
                        aoneVar10.bz((String) entry4.getKey(), entry4.getValue() == null ? false : ((Boolean) entry4.getValue()).booleanValue());
                    } else {
                        aoneVar10.bA((String) entry4.getKey(), entry4.getValue() == null ? 0L : ((Long) entry4.getValue()).longValue());
                    }
                }
                return aoneVar10;
            case 14:
                aone builder4 = ((awwr) obj).toBuilder();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                builder4.copyOnWrite();
                awwr awwrVar2 = (awwr) builder4.instance;
                awwrVar2.b |= 1;
                awwrVar2.d = booleanValue3;
                return (awwr) builder4.build();
            case 15:
                awwr awwrVar3 = (awwr) obj;
                try {
                    long parseLong2 = Long.parseLong((String) obj2);
                    if (awwrVar3 == null) {
                        aone createBuilder2 = awwr.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        awwr awwrVar4 = (awwr) createBuilder2.instance;
                        awwrVar4.b |= 2;
                        awwrVar4.e = parseLong2;
                        awwrVar = (awwr) createBuilder2.build();
                    } else {
                        aone builder5 = awwrVar3.toBuilder();
                        builder5.copyOnWrite();
                        awwr awwrVar5 = (awwr) builder5.instance;
                        awwrVar5.b |= 2;
                        awwrVar5.e = parseLong2;
                        awwrVar = (awwr) builder5.build();
                    }
                    return awwrVar;
                } catch (NumberFormatException e2) {
                    zga.d("Wrong custom interval string was set.", e2);
                    return awwrVar3;
                }
            case 16:
                aone aoneVar11 = (aone) obj;
                aoneVar11.copyOnWrite();
                ascy ascyVar = (ascy) aoneVar11.instance;
                arnb arnbVar8 = (arnb) ((aone) obj2).build();
                ascy ascyVar2 = ascy.a;
                arnbVar8.getClass();
                ascyVar.c = arnbVar8;
                ascyVar.b |= 1;
                return aoneVar11;
            case 17:
                aone aoneVar12 = (aone) obj;
                float floatValue = ((Float) obj2).floatValue();
                aoneVar12.copyOnWrite();
                awwt awwtVar = (awwt) aoneVar12.instance;
                awwt awwtVar2 = awwt.a;
                awwtVar.b |= 2;
                awwtVar.d = floatValue;
                return aoneVar12;
            case 18:
                aone aoneVar13 = (aone) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                aoneVar13.copyOnWrite();
                awwt awwtVar3 = (awwt) aoneVar13.instance;
                awwt awwtVar4 = awwt.a;
                awwtVar3.b |= 8;
                awwtVar3.f = floatValue2;
                return aoneVar13;
            case 19:
                aone aoneVar14 = (aone) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                aoneVar14.copyOnWrite();
                awwt awwtVar5 = (awwt) aoneVar14.instance;
                awwt awwtVar6 = awwt.a;
                awwtVar5.b |= 32;
                awwtVar5.h = floatValue3;
                return aoneVar14;
            default:
                aone aoneVar15 = (aone) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                aoneVar15.copyOnWrite();
                awwt awwtVar7 = (awwt) aoneVar15.instance;
                awwt awwtVar8 = awwt.a;
                awwtVar7.b |= 16;
                awwtVar7.g = floatValue4;
                return aoneVar15;
        }
    }
}
