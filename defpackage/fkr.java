package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fkr {
    private static final amsx b = amsx.w("cross_device_offline_device_name", "cross_device_offline_device_state", "offline_has_shown_1080p_option", "offline_has_shown_1080p_tooltip", "offline_has_shown_download_expiration_disclaimer", "offline_stream_snackbar_impressions", "offline_stream_snackbar_last_shown", "offline_recs_enabled", "offline_quality_preference_updated_timestamp_millis", "last_downloads_page_usage_seconds");
    public static final amsx a = amsx.u(fkc.OFFLINE_FIRST_ADD_TOOLTIP, fkc.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, fkc.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED, fkc.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS);

    public static ywr a(Context context, azrw azrwVar) {
        vfg vfgVar = (vfg) azrwVar.get();
        vda a2 = vdb.a(context);
        a2.e("offlinestartup");
        a2.f("offlinestartup.pb");
        Uri a3 = a2.a();
        vfe a4 = vff.a();
        a4.e(fkh.a);
        a4.f(a3);
        return new ywp(agcm.e(vfgVar.a(a4.a())), fkh.a);
    }

    public static String b(String str, String str2) {
        return (String) amkq.bj(amnm.c(str).h(str2));
    }

    public static ywp c(Context context, anib anibVar, String str, vfg vfgVar, azrw azrwVar, aadw aadwVar) {
        vda a2 = vdb.a(context);
        a2.e("offline");
        a2.f("offlinemain.pb");
        Uri a3 = a2.a();
        vfe a4 = vff.a();
        a4.e(fkg.a);
        a4.f(a3);
        if (d(aadwVar)) {
            vfk d = vfn.d(context, anibVar);
            d.c = str;
            amsx amsxVar = b;
            d.d((String[]) amsxVar.toArray(new String[amsxVar.size()]));
            d.e(fkm.a);
            a4.b(d.a());
            ywu d2 = ywv.d(azrwVar, anibVar);
            d2.a = eri.m;
            d2.b(fjw.i);
            d2.b = fjw.h;
            d2.c = fkp.d;
            a4.b(d2.a());
        }
        return new ywp(agcm.e(vfgVar.a(a4.a())), fkg.a);
    }

    public static boolean d(aadw aadwVar) {
        atfq atfqVar = aadwVar.b().o;
        if (atfqVar == null) {
            atfqVar = atfq.a;
        }
        auie auieVar = atfqVar.g;
        if (auieVar == null) {
            auieVar = auie.a;
        }
        return auieVar.h;
    }

    public static String e(int i) {
        if (i == 1) {
            return fkc.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS;
        }
        Object[] objArr = new Object[1];
        int i2 = i - 1;
        if (i != 0) {
            objArr[0] = Integer.valueOf(i2);
            return yny.K(fkc.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS_FORMAT, objArr);
        }
        throw null;
    }

    public static void f(aone aoneVar, ywl ywlVar, ywl ywlVar2, ywl ywlVar3, ammy ammyVar) {
        amrw amrwVar = new amrw();
        amrwVar.g("cross_device_offline_device_name", new fkl(ammyVar, ywlVar2, 3));
        amrwVar.g("cross_device_offline_device_state", new fkl(ammyVar, ywlVar, 4));
        amrwVar.g("offline_has_shown_1080p_option", new fkl(ammyVar, ywlVar, 5));
        amrwVar.g("offline_has_shown_1080p_tooltip", new fkl(ammyVar, ywlVar, 6));
        amrwVar.g("offline_has_shown_download_expiration_disclaimer", new fkl(ammyVar, ywlVar, 7));
        amrwVar.g("offline_stream_snackbar_impressions", new fkl(ammyVar, ywlVar3, 8));
        amrwVar.g("offline_stream_snackbar_last_shown", new fkl(ammyVar, ywlVar3, 9));
        amrwVar.g("offline_recs_enabled", new fkl(ammyVar, ywlVar, 10));
        amrwVar.g("offline_quality_preference_updated_timestamp_millis", new fkl(ammyVar, ywlVar3, 11));
        amrwVar.g("last_downloads_page_usage_seconds", new fkl(ammyVar, ywlVar3, 12));
        whl.r(b, aoneVar, amrwVar.c());
    }

    public static void g(aone aoneVar, final ywl ywlVar, ywl ywlVar2, ammy ammyVar) {
        amrw amrwVar = new amrw();
        final int i = 1;
        amrwVar.g(fkc.OFFLINE_FIRST_ADD_TOOLTIP, new zff() { // from class: fkk
            @Override // defpackage.zff
            public final void a(Object obj, Object obj2) {
                if (i == 0) {
                    boolean booleanValue = ((Boolean) ywlVar.a(fkc.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, true)).booleanValue();
                    aone aoneVar2 = (aone) obj2;
                    aoneVar2.copyOnWrite();
                    fke fkeVar = (fke) aoneVar2.instance;
                    fke fkeVar2 = fke.a;
                    fkeVar.b |= 4;
                    fkeVar.e = booleanValue;
                    return;
                }
                boolean booleanValue2 = ((Boolean) ywlVar.a(fkc.OFFLINE_FIRST_ADD_TOOLTIP, true)).booleanValue();
                aone aoneVar3 = (aone) obj2;
                aoneVar3.copyOnWrite();
                fke fkeVar3 = (fke) aoneVar3.instance;
                fke fkeVar4 = fke.a;
                fkeVar3.b |= 2;
                fkeVar3.d = booleanValue2;
            }
        });
        final int i2 = 0;
        amrwVar.g(fkc.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, new zff() { // from class: fkk
            @Override // defpackage.zff
            public final void a(Object obj, Object obj2) {
                if (i2 == 0) {
                    boolean booleanValue = ((Boolean) ywlVar.a(fkc.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, true)).booleanValue();
                    aone aoneVar2 = (aone) obj2;
                    aoneVar2.copyOnWrite();
                    fke fkeVar = (fke) aoneVar2.instance;
                    fke fkeVar2 = fke.a;
                    fkeVar.b |= 4;
                    fkeVar.e = booleanValue;
                    return;
                }
                boolean booleanValue2 = ((Boolean) ywlVar.a(fkc.OFFLINE_FIRST_ADD_TOOLTIP, true)).booleanValue();
                aone aoneVar3 = (aone) obj2;
                aoneVar3.copyOnWrite();
                fke fkeVar3 = (fke) aoneVar3.instance;
                fke fkeVar4 = fke.a;
                fkeVar3.b |= 2;
                fkeVar3.d = booleanValue2;
            }
        });
        amrwVar.g(fkc.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED, new fkl(ammyVar, ywlVar, i2));
        amrwVar.g(fkc.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS, new fkl(ammyVar, ywlVar2, 2));
        whl.r(a, aoneVar, amrwVar.c());
    }
}
