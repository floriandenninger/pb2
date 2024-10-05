package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.backup.Backup;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghv {

    @Backup
    public static final String CATEGORY = "offline_category";

    @Backup
    public static final String CATEGORY_BACKGROUND = "offline_category_background";

    @Backup
    public static final String CATEGORY_PRIMARY_STORAGE = "offline_category_primary_storage";

    @Backup
    public static final String CATEGORY_SDCARD_STORAGE = "offline_category_sdcard_storage";

    @Backup
    public static final String DOWNLOAD_NETWORK_PREFERENCE = "offline_network_preference";

    @Backup
    public static final String PLAYLIST_WARNING = "offline_playlist_warning";

    @Backup
    public static final String QUALITY = "offline_quality";

    @Backup
    public static final String WIFI_OR_UNRESTRICTED_DATA_POLICY = "offline_unrestricted_data_policy";

    @Backup
    public static final String WIFI_POLICY = "offline_policy";

    @Backup
    public static final String WIFI_POLICY_STRING = "offline_policy_string";

    public static anhy a(anhy anhyVar, final Callable callable, final Object obj, Executor executor) {
        return aney.h(anfq.i(anht.q(anhyVar), new anfz() { // from class: agfs
            @Override // defpackage.anfz
            public final anhy a(Object obj2) {
                return anaf.O(callable.call());
            }
        }, executor), aglv.class, new amml() { // from class: agfr
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                return obj;
            }
        }, angq.a);
    }

    public static int b(int i) {
        return i != 0 ? 2 : 0;
    }

    public static agsn c(agof agofVar, String str) {
        if (TextUtils.equals(agofVar.d(), str)) {
            return agofVar.a();
        }
        return null;
    }

    public static void d(ylf ylfVar) {
        ylfVar.e("offline_transfer_keep_alive", 0L, false, 1, null, null, false);
    }

    public static AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer e(apeo apeoVar) {
        if ((apeoVar.b & 4096) == 0) {
            return null;
        }
        aulq aulqVar = apeoVar.s;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.notificationSurveyCustomStyleRenderer)) {
            return null;
        }
        aulq aulqVar2 = apeoVar.s;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer) aulqVar2.pX(AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.notificationSurveyCustomStyleRenderer);
    }

    public static boolean f(apeo apeoVar) {
        aqyg aqygVar;
        if (apeoVar == null) {
            return false;
        }
        int i = apeoVar.b;
        if ((i & 2) == 0 && (i & 4) == 0) {
            return false;
        }
        apek apekVar = apeoVar.e;
        if (apekVar == null) {
            apekVar = apek.a;
        }
        if ((apekVar.b & 16) != 0) {
            aqygVar = apekVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return !TextUtils.isEmpty(ajcq.b(aqygVar));
    }

    public static boolean g(apeo apeoVar, ajut ajutVar) {
        aqyg aqygVar;
        AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer e;
        if (apeoVar != null && (apeoVar.b & 1) != 0) {
            apek apekVar = apeoVar.e;
            if (apekVar == null) {
                apekVar = apek.a;
            }
            aqyg aqygVar2 = null;
            if ((apekVar.b & 8) != 0) {
                aqygVar = apekVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            if (!TextUtils.isEmpty(ajcq.b(aqygVar))) {
                if ((apekVar.b & 16) != 0 && (aqygVar2 = apekVar.g) == null) {
                    aqygVar2 = aqyg.a;
                }
                if (!TextUtils.isEmpty(ajcq.b(aqygVar2)) && (e = e(apeoVar)) != null && e.b.size() != 0) {
                    Iterator it = e.b.iterator();
                    while (it.hasNext()) {
                        AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer = (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer) ((aulq) it.next()).pX(AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.iconSurveyOptionRenderer);
                        if (androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer != null && (androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b & 1) != 0) {
                            arfs arfsVar = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.c;
                            if (arfsVar == null) {
                                arfsVar = arfs.a;
                            }
                            arfr b = arfr.b(arfsVar.c);
                            if (b == null) {
                                b = arfr.UNKNOWN;
                            }
                            if (ajutVar.a(b) == 0) {
                            }
                        }
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static PendingIntent h(Context context, Intent intent) {
        return PendingIntent.getActivity(context, (int) (Math.random() * 2.147483647E9d), intent, yny.M() | 1073741824);
    }

    public static PendingIntent i(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, (int) (Math.random() * 2.147483647E9d), intent, yny.M() | 1073741824);
    }

    public static void j(Intent intent, apxf apxfVar) {
        if (apxfVar == null) {
            return;
        }
        intent.putExtra("service_endpoint", apxfVar.toByteArray());
    }

    public static void k(Intent intent, apxf apxfVar, acra acraVar, boolean z) {
        if (apxfVar == null) {
            return;
        }
        if (acraVar != null && z) {
            aone createBuilder = atmc.a.createBuilder();
            String k = acraVar.k();
            createBuilder.copyOnWrite();
            atmc atmcVar = (atmc) createBuilder.instance;
            k.getClass();
            atmcVar.b |= 1;
            atmcVar.c = k;
            atmc atmcVar2 = (atmc) createBuilder.build();
            aong aongVar = (aong) apxfVar.toBuilder();
            aongVar.e(atmb.b, atmcVar2);
            apxfVar = (apxf) aongVar.build();
        }
        intent.putExtra("navigation_endpoint", apxfVar.toByteArray());
    }
}
