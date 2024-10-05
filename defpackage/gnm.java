package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gnm {
    private static final amsx a = amsx.w("app_theme_appearance_edu_shown", "app_theme_not_match_system_edu_shown", "app_theme_dark", "app_theme_appearance", "auto_switch_theme_on_battery_saver", "auto_switch_theme_on_battery_saver_settings_toggle", new String[0]);

    public static gnh a(vfm vfmVar, gnh gnhVar) {
        aone builder = gnhVar.toBuilder();
        if (vfmVar.e("app_theme_appearance_edu_shown")) {
            boolean m = whl.m("app_theme_appearance_edu_shown", vfmVar);
            builder.copyOnWrite();
            gnh gnhVar2 = (gnh) builder.instance;
            gnhVar2.b |= 1;
            gnhVar2.c = m;
        }
        if (vfmVar.e("app_theme_not_match_system_edu_shown")) {
            boolean m2 = whl.m("app_theme_not_match_system_edu_shown", vfmVar);
            builder.copyOnWrite();
            gnh gnhVar3 = (gnh) builder.instance;
            gnhVar3.b |= 2;
            gnhVar3.d = m2;
        }
        if (vfmVar.e("app_theme_dark")) {
            boolean m3 = whl.m("app_theme_dark", vfmVar);
            builder.copyOnWrite();
            gnh gnhVar4 = (gnh) builder.instance;
            gnhVar4.b |= 4;
            gnhVar4.e = m3;
        }
        if (vfmVar.e("app_theme_appearance")) {
            String d = vfmVar.d("app_theme_appearance", "APPEARANCE_SYSTEM");
            builder.copyOnWrite();
            gnh gnhVar5 = (gnh) builder.instance;
            d.getClass();
            gnhVar5.b |= 8;
            gnhVar5.f = d;
        }
        if (vfmVar.e("auto_switch_theme_on_battery_saver")) {
            boolean m4 = whl.m("auto_switch_theme_on_battery_saver", vfmVar);
            builder.copyOnWrite();
            gnh gnhVar6 = (gnh) builder.instance;
            gnhVar6.b |= 16;
            gnhVar6.g = m4;
        }
        if (vfmVar.e("auto_switch_theme_on_battery_saver_settings_toggle")) {
            boolean m5 = whl.m("auto_switch_theme_on_battery_saver_settings_toggle", vfmVar);
            builder.copyOnWrite();
            gnh gnhVar7 = (gnh) builder.instance;
            gnhVar7.b |= 32;
            gnhVar7.h = m5;
        }
        return (gnh) builder.build();
    }

    public static ywr b(Context context, azrw azrwVar, anib anibVar, String str) {
        vfg vfgVar = (vfg) azrwVar.get();
        fkp fkpVar = fkp.h;
        gnh gnhVar = gnh.a;
        return new ywp(agcm.e(whl.q("theme_proto.pb", context, vfgVar, anibVar, str, fkpVar, gnhVar, a)), gnhVar);
    }
}
