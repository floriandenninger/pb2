package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fkp implements ykr {
    private final /* synthetic */ int v;
    public static final /* synthetic */ fkp u = new fkp(20);
    public static final /* synthetic */ fkp t = new fkp(19);
    public static final /* synthetic */ fkp s = new fkp(18);
    public static final /* synthetic */ fkp r = new fkp(17);
    public static final /* synthetic */ fkp q = new fkp(16);
    public static final /* synthetic */ fkp p = new fkp(15);
    public static final /* synthetic */ fkp o = new fkp(14);
    public static final /* synthetic */ fkp n = new fkp(13);
    public static final /* synthetic */ fkp m = new fkp(12);
    public static final /* synthetic */ fkp l = new fkp(11);
    public static final /* synthetic */ fkp k = new fkp(10);
    public static final /* synthetic */ fkp j = new fkp(9);
    public static final /* synthetic */ fkp i = new fkp(8);
    public static final /* synthetic */ fkp h = new fkp(7);
    public static final /* synthetic */ fkp g = new fkp(6);
    public static final /* synthetic */ fkp f = new fkp(5);
    public static final /* synthetic */ fkp e = new fkp(4);
    public static final /* synthetic */ fkp d = new fkp(3);
    public static final /* synthetic */ fkp c = new fkp(2);
    public static final /* synthetic */ fkp b = new fkp(1);
    public static final /* synthetic */ fkp a = new fkp(0);

    private /* synthetic */ fkp(int i2) {
        this.v = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.content.SharedPreferences$Editor] */
    /* JADX WARN: Type inference failed for: r12v63, types: [aonm, lox] */
    @Override // defpackage.ykr
    public final Object a(Object obj, Object obj2) {
        Object obj3;
        switch (this.v) {
            case 0:
                obj3 = (SharedPreferences.Editor) obj;
                fkg fkgVar = (fkg) obj2;
                amsx amsxVar = fkr.a;
                if ((fkgVar.b & 1) != 0) {
                    obj3.putString("cross_device_offline_device_name", fkgVar.c);
                }
                if ((fkgVar.b & 2) != 0) {
                    obj3.putBoolean("cross_device_offline_device_state", fkgVar.d);
                }
                if ((fkgVar.b & 4) != 0) {
                    obj3.putBoolean("offline_has_shown_1080p_option", fkgVar.e);
                }
                if ((fkgVar.b & 8) != 0) {
                    obj3.putBoolean("offline_has_shown_1080p_tooltip", fkgVar.f);
                }
                if ((fkgVar.b & 16) != 0) {
                    obj3.putBoolean("offline_has_shown_download_expiration_disclaimer", fkgVar.g);
                }
                if ((fkgVar.b & 32) == 0) {
                    obj3.remove("offline_stream_snackbar_impressions");
                } else {
                    obj3.putLong("offline_stream_snackbar_impressions", fkgVar.h);
                }
                if ((fkgVar.b & 64) == 0) {
                    obj3.remove("offline_stream_snackbar_last_shown");
                } else {
                    obj3.putLong("offline_stream_snackbar_last_shown", fkgVar.i);
                }
                if ((fkgVar.b & 128) != 0) {
                    obj3.putBoolean("offline_recs_enabled", fkgVar.k);
                }
                if ((fkgVar.b & 256) != 0) {
                    obj3.putLong("offline_quality_preference_updated_timestamp_millis", fkgVar.l);
                }
                if ((fkgVar.b & 512) != 0) {
                    obj3.putLong("last_downloads_page_usage_seconds", fkgVar.m);
                }
                for (Map.Entry entry : Collections.unmodifiableMap(fkgVar.j).entrySet()) {
                    String str = (String) entry.getKey();
                    String L = yny.L("offline_access_enabled%s", str);
                    String L2 = yny.L("offline_access_updated_at%s", str);
                    fkb fkbVar = (fkb) entry.getValue();
                    if (!fkb.a.equals(fkbVar)) {
                        obj3.putBoolean(L, fkbVar.c);
                        obj3.putLong(L2, fkbVar.d);
                    } else {
                        obj3.remove(L);
                        obj3.remove(L2);
                    }
                }
                return obj3;
            case 1:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                fke fkeVar = (fke) obj2;
                amsx amsxVar2 = fkr.a;
                if ((fkeVar.b & 2) != 0) {
                    editor.putBoolean(fkc.OFFLINE_FIRST_ADD_TOOLTIP, fkeVar.d);
                }
                if ((fkeVar.b & 1) != 0) {
                    editor.putBoolean(fkc.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED, fkeVar.c);
                }
                if ((fkeVar.b & 4) != 0) {
                    editor.putBoolean(fkc.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, fkeVar.e);
                }
                if ((fkeVar.b & 8) != 0) {
                    editor.putLong(fkc.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS, fkeVar.f);
                }
                int[] K = fav.K();
                int i2 = 0;
                while (true) {
                    if (i2 < 2) {
                        int i3 = K[i2];
                        String e2 = fkr.e(i3);
                        int i4 = i3 - 1;
                        if (i3 != 0) {
                            if (fkeVar.a(i4)) {
                                aoot aootVar = fkeVar.g;
                                Integer valueOf = Integer.valueOf(i4);
                                editor.putLong(e2, aootVar.containsKey(valueOf) ? ((Long) aootVar.get(valueOf)).longValue() : 0L);
                            } else {
                                editor.remove(e2);
                            }
                            i2++;
                        } else {
                            throw null;
                        }
                    } else {
                        if (fkeVar.a(0)) {
                            aoot aootVar2 = fkeVar.g;
                            editor.putLong(fkc.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS, aootVar2.containsKey(0) ? ((Long) aootVar2.get(0)).longValue() : 0L);
                        }
                        return editor;
                    }
                }
            case 2:
                aone aoneVar = (aone) obj2;
                amsx amsxVar3 = fkr.a;
                amxd listIterator = ((ywt) obj).a.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) listIterator.next();
                    Object value = entry2.getValue();
                    if (value != null) {
                        if (fkc.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS.equals(entry2.getKey())) {
                            aoneVar.g(0, ((Long) value).longValue());
                        } else {
                            try {
                                aoneVar.g(Integer.parseInt(fkr.b("offline_last_scheduled_ad_hoc_refresh_time_millis_", (String) entry2.getKey())), ((Long) value).longValue());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
                return aoneVar;
            case 3:
                aone aoneVar2 = (aone) obj2;
                amsx amsxVar4 = fkr.a;
                amxd listIterator2 = ((ywt) obj).a.entrySet().listIterator();
                while (listIterator2.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) listIterator2.next();
                    Object value2 = entry3.getValue();
                    if (value2 != null) {
                        if (((String) entry3.getKey()).startsWith("offline_access_enabled")) {
                            String b2 = fkr.b("offline_access_enabled", (String) entry3.getKey());
                            aone builder = aoneVar2.h(b2, fkb.a).toBuilder();
                            boolean booleanValue = ((Boolean) value2).booleanValue();
                            builder.copyOnWrite();
                            fkb fkbVar2 = (fkb) builder.instance;
                            fkbVar2.b |= 1;
                            fkbVar2.c = booleanValue;
                            aoneVar2.i(b2, (fkb) builder.build());
                        } else {
                            String b3 = fkr.b("offline_access_updated_at", (String) entry3.getKey());
                            aone builder2 = aoneVar2.h(b3, fkb.a).toBuilder();
                            long longValue = ((Long) value2).longValue();
                            builder2.copyOnWrite();
                            fkb fkbVar3 = (fkb) builder2.instance;
                            fkbVar3.b |= 2;
                            fkbVar3.d = longValue;
                            aoneVar2.i(b3, (fkb) builder2.build());
                        }
                    }
                }
                return aoneVar2;
            case 4:
                SharedPreferences.Editor editor2 = (SharedPreferences.Editor) obj;
                fnx fnxVar = (fnx) obj2;
                if ((fnxVar.b & 1) != 0) {
                    editor2.putInt(fav.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING, fnxVar.c);
                }
                return editor2;
            case 5:
                aone aoneVar3 = (aone) obj2;
                amxd listIterator3 = ((ywt) obj).a.entrySet().listIterator();
                while (listIterator3.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) listIterator3.next();
                    String str2 = (String) entry4.getKey();
                    List h2 = amnm.c(":").h(str2);
                    ammv j2 = h2.isEmpty() ? amlr.a : ammv.j((String) h2.get(0));
                    if (j2.h()) {
                        String str3 = (String) j2.c();
                        foa foaVar = foa.a;
                        Map unmodifiableMap = Collections.unmodifiableMap(((fof) aoneVar3.instance).f);
                        if (unmodifiableMap.containsKey(str3)) {
                            foaVar = (foa) unmodifiableMap.get(str3);
                        }
                        aone builder3 = foaVar.toBuilder();
                        if (evr.i(str2)) {
                            boolean booleanValue2 = entry4.getValue() == null ? false : ((Boolean) entry4.getValue()).booleanValue();
                            builder3.copyOnWrite();
                            foa foaVar2 = (foa) builder3.instance;
                            foaVar2.b |= 1;
                            foaVar2.c = booleanValue2;
                        } else {
                            int intValue = entry4.getValue() == null ? 0 : ((Integer) entry4.getValue()).intValue();
                            builder3.copyOnWrite();
                            foa foaVar3 = (foa) builder3.instance;
                            foaVar3.b |= 2;
                            foaVar3.d = intValue;
                        }
                        aoneVar3.j((String) j2.c(), (foa) builder3.build());
                    }
                }
                return aoneVar3;
            case 6:
                SharedPreferences.Editor editor3 = (SharedPreferences.Editor) obj;
                fof fofVar = (fof) obj2;
                String[] strArr = fod.a;
                if ((fofVar.b & 1) != 0) {
                    editor3.putBoolean("snap_zoom_initially_zoomed", fofVar.c);
                }
                if ((fofVar.b & 2) != 0) {
                    editor3.putBoolean(fav.VIDEO_ZOOM_USER_EDUCATION_SHOWN, fofVar.d);
                }
                if ((fofVar.b & 4) != 0) {
                    editor3.putInt("inline_global_play_pause", fofVar.e);
                }
                if (fofVar.f.size() > 0) {
                    for (Map.Entry entry5 : Collections.unmodifiableMap(fofVar.f).entrySet()) {
                        String str4 = (String) entry5.getKey();
                        foa foaVar4 = (foa) entry5.getValue();
                        if ((foaVar4.b & 1) != 0) {
                            editor3.putBoolean(evr.h("bollard_enabled", str4), foaVar4.c);
                        }
                        if ((foaVar4.b & 2) != 0) {
                            editor3.putInt(evr.h("bollard_frequency_mins", str4), foaVar4.d);
                        }
                    }
                }
                return editor3;
            case 7:
                return gnm.a((vfm) obj, (gnh) obj2);
            case 8:
                aone builder4 = ((gnh) obj).toBuilder();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                builder4.copyOnWrite();
                gnh gnhVar = (gnh) builder4.instance;
                gnhVar.b |= 4;
                gnhVar.e = booleanValue3;
                builder4.copyOnWrite();
                gnh gnhVar2 = (gnh) builder4.instance;
                gnhVar2.b |= 32;
                gnhVar2.h = true;
                return (gnh) builder4.build();
            case 9:
                String str5 = (String) obj2;
                aone builder5 = ((gnh) obj).toBuilder();
                builder5.copyOnWrite();
                gnh gnhVar3 = (gnh) builder5.instance;
                str5.getClass();
                gnhVar3.b |= 8;
                gnhVar3.f = str5;
                builder5.copyOnWrite();
                gnh gnhVar4 = (gnh) builder5.instance;
                gnhVar4.b |= 2;
                gnhVar4.d = true;
                return (gnh) builder5.build();
            case 10:
                aone aoneVar4 = (aone) obj2;
                amxd listIterator4 = ((ywt) obj).a.entrySet().listIterator();
                while (listIterator4.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) listIterator4.next();
                    aoneVar4.k((String) entry6.getKey(), ((Long) entry6.getValue()).longValue());
                }
                return aoneVar4;
            case 11:
                aone aoneVar5 = (aone) obj;
                aone aoneVar6 = (aone) obj2;
                aoneVar5.copyOnWrite();
                arsc arscVar = (arsc) aoneVar5.instance;
                arnb arnbVar = (arnb) aoneVar6.build();
                arsc arscVar2 = arsc.a;
                arnbVar.getClass();
                arscVar.c = arnbVar;
                arscVar.b |= 1;
                aryo aryoVar = ((arsc) aoneVar5.instance).e;
                if (aryoVar == null) {
                    aryoVar = aryo.a;
                }
                aone builder6 = aryoVar.toBuilder();
                builder6.copyOnWrite();
                aryo aryoVar2 = (aryo) builder6.instance;
                arnb arnbVar2 = (arnb) aoneVar6.build();
                arnbVar2.getClass();
                aryoVar2.c = arnbVar2;
                aryoVar2.b |= 1;
                aoneVar5.copyOnWrite();
                arsc arscVar3 = (arsc) aoneVar5.instance;
                aryo aryoVar3 = (aryo) builder6.build();
                aryoVar3.getClass();
                arscVar3.e = aryoVar3;
                arscVar3.b |= 4;
                return aoneVar5;
            case 12:
                aone aoneVar7 = (aone) obj;
                aoneVar7.copyOnWrite();
                arsf arsfVar = (arsf) aoneVar7.instance;
                arnb arnbVar3 = (arnb) ((aone) obj2).build();
                arsf arsfVar2 = arsf.a;
                arnbVar3.getClass();
                arsfVar.e = arnbVar3;
                arsfVar.b |= 1;
                return aoneVar7;
            case 13:
                aone aoneVar8 = (aone) obj;
                aoneVar8.copyOnWrite();
                aswm aswmVar = (aswm) aoneVar8.instance;
                arnb arnbVar4 = (arnb) ((aone) obj2).build();
                aswm aswmVar2 = aswm.a;
                arnbVar4.getClass();
                aswmVar.c = arnbVar4;
                aswmVar.b |= 1;
                return aoneVar8;
            case 14:
                String str6 = (String) obj2;
                aone createBuilder = lqx.a.createBuilder();
                createBuilder.copyOnWrite();
                lqx lqxVar = (lqx) createBuilder.instance;
                str6.getClass();
                lqxVar.b |= 1;
                lqxVar.c = str6;
                lqx lqxVar2 = (lqx) createBuilder.build();
                aone builder7 = ((lqw) obj).toBuilder();
                builder7.copyOnWrite();
                lqw lqwVar = (lqw) builder7.instance;
                lqxVar2.getClass();
                lqwVar.c = lqxVar2;
                lqwVar.b |= 1;
                return (lqw) builder7.build();
            case 15:
                int b4 = zhq.b((String) obj2, -1);
                aone builder8 = ((fof) obj).toBuilder();
                builder8.copyOnWrite();
                fof fofVar2 = (fof) builder8.instance;
                fofVar2.b |= 4;
                fofVar2.e = b4;
                return (fof) builder8.build();
            case 16:
                aone builder9 = ((fof) obj).toBuilder();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                builder9.copyOnWrite();
                fof fofVar3 = (fof) builder9.instance;
                fofVar3.b |= 1;
                fofVar3.c = booleanValue4;
                return (fof) builder9.build();
            case 17:
                aone builder10 = ((kqs) obj).toBuilder();
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                builder10.copyOnWrite();
                kqs kqsVar = (kqs) builder10.instance;
                kqsVar.b |= 1;
                kqsVar.c = booleanValue5;
                return (kqs) builder10.build();
            case 18:
                long x = ayeq.x((String) obj2);
                aone builder11 = ((kqs) obj).toBuilder();
                builder11.copyOnWrite();
                kqs kqsVar2 = (kqs) builder11.instance;
                kqsVar2.b |= 2;
                kqsVar2.d = x;
                return (kqs) builder11.build();
            case 19:
                aone builder12 = ((lox) obj).toBuilder();
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                builder12.copyOnWrite();
                lox loxVar = (lox) builder12.instance;
                loxVar.b |= 512;
                loxVar.l = booleanValue6;
                return (lox) builder12.build();
            default:
                Boolean bool = (Boolean) obj2;
                aone builder13 = ((lox) obj).toBuilder();
                boolean booleanValue7 = bool.booleanValue();
                builder13.copyOnWrite();
                lox loxVar2 = (lox) builder13.instance;
                loxVar2.b |= 8;
                loxVar2.f = booleanValue7;
                obj3 = (lox) builder13.build();
                if (bool.booleanValue()) {
                    aone builder14 = obj3.toBuilder();
                    boolean z = obj3.g;
                    builder14.copyOnWrite();
                    lox loxVar3 = (lox) builder14.instance;
                    loxVar3.b |= 1024;
                    loxVar3.m = z;
                    boolean z2 = obj3.h;
                    builder14.copyOnWrite();
                    lox loxVar4 = (lox) builder14.instance;
                    loxVar4.b |= 2048;
                    loxVar4.n = z2;
                    boolean z3 = obj3.i;
                    builder14.copyOnWrite();
                    lox loxVar5 = (lox) builder14.instance;
                    loxVar5.b |= 4096;
                    loxVar5.o = z3;
                    boolean z4 = obj3.j;
                    builder14.copyOnWrite();
                    lox loxVar6 = (lox) builder14.instance;
                    loxVar6.b |= 8192;
                    loxVar6.p = z4;
                    boolean z5 = obj3.k;
                    builder14.copyOnWrite();
                    lox loxVar7 = (lox) builder14.instance;
                    loxVar7.b |= 16384;
                    loxVar7.q = z5;
                    return (lox) builder14.build();
                }
                return obj3;
        }
    }
}
