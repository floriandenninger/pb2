package defpackage;

import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whl {
    public static String A(int i) {
        switch (i - 1) {
            case 0:
                return "GET";
            case 1:
                return "POST";
            case 2:
                return "PUT";
            case 3:
                return "DELETE";
            case 4:
                return "HEAD";
            case 5:
                return "OPTIONS";
            case 6:
                return "TRACE";
            default:
                return "PATCH";
        }
    }

    public static void B(vin vinVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            vinVar.b(" = ");
            return;
        }
        if (i2 == 1) {
            vinVar.b(" != ");
            return;
        }
        if (i2 == 2) {
            vinVar.b(" < ");
            return;
        }
        if (i2 == 3) {
            vinVar.b(" <= ");
            return;
        }
        if (i2 == 4) {
            vinVar.b(" > ");
        } else if (i2 != 5) {
            vinVar.b(" LIKE ");
        } else {
            vinVar.b(" >= ");
        }
    }

    public static final void C(aajc aajcVar, int i, vin vinVar) {
        aajcVar.a(vinVar);
        B(vinVar, i);
        vinVar.b(" ? ");
    }

    public static final aaiz D(aajb aajbVar, List list) {
        vin vinVar = new vin();
        vinVar.b("SELECT entity_key FROM ");
        aajbVar.b(vinVar);
        vinVar.b(" WHERE ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((aaiy) it.next()).a(vinVar);
        }
        return new aaiz(aajbVar, vinVar.a());
    }

    public static final void E(final aajc aajcVar, final int i, final Long l, aajb aajbVar, List list) {
        aajbVar.c(aajcVar);
        list.add(new aaiy() { // from class: aaiw
            @Override // defpackage.aaiy
            public final void a(vin vinVar) {
                aajc aajcVar2 = aajc.this;
                int i2 = i;
                Long l2 = l;
                whl.C(aajcVar2, i2, vinVar);
                aajcVar2.c(vinVar, l2);
            }
        });
    }

    public static final void F(final aajc aajcVar, final int i, final String str, aajb aajbVar, List list) {
        aajbVar.c(aajcVar);
        list.add(new aaiy() { // from class: aaix
            @Override // defpackage.aaiy
            public final void a(vin vinVar) {
                aajc aajcVar2 = aajc.this;
                int i2 = i;
                String str2 = str;
                whl.C(aajcVar2, i2, vinVar);
                aajcVar2.c(vinVar, str2);
            }
        });
    }

    public static aomf G(apxf apxfVar) {
        return (apxfVar == null || (apxfVar.b & 1) == 0) ? aomf.b : apxfVar.c;
    }

    public static apxf H(byte[] bArr) {
        if (bArr != null) {
            try {
                return (apxf) aonm.parseFrom(apxf.a, bArr, aomw.b());
            } catch (aoob unused) {
            }
        }
        return apxf.a;
    }

    public static void I(aahd aahdVar, List list, Object obj) {
        J(aahdVar, list, obj != null ? amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", obj) : null);
    }

    public static void J(aahd aahdVar, List list, Map map) {
        if (aahdVar == null || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apxf apxfVar = (apxf) it.next();
            if (apxfVar != null) {
                aahdVar.c(apxfVar, map);
            }
        }
    }

    public static vgz K(Context context, vfg vfgVar) {
        vda a = vdb.a(context);
        a.e("mdd");
        a.f("TaskPeriods.pb");
        Uri a2 = a.a();
        vfe a3 = vff.a();
        a3.f(a2);
        a3.e(ttz.a);
        return vfgVar.a(a3.a());
    }

    public static vgz L(Context context, String str, anib anibVar, vfg vfgVar) {
        vfk d = vfn.d(context, anibVar);
        d.b();
        d.c = str;
        d.d("innertube_safety_mode_enabled");
        d.e(fkm.q);
        vfn a = d.a();
        vfe a2 = vff.a();
        a2.f(adyu.dz(context));
        a2.e(awus.a);
        a2.b(a);
        return vfgVar.a(a2.a());
    }

    public static vgz M(Context context, String str, anib anibVar, vfg vfgVar) {
        Uri s = s(context, "innertube", "innertube.pb");
        vfe a = vff.a();
        a.e(awuu.a);
        a.f(s);
        lyk lykVar = lyk.q;
        vfk d = vfn.d(context, anibVar);
        d.c = str;
        d.d("com.google.android.libraries.youtube.innertube.pref.player_config_supplier");
        d.e(new abeq(lykVar, 0));
        a.b(d.a());
        lyk lykVar2 = lyk.r;
        vfk d2 = vfn.d(context, anibVar);
        d2.c = str;
        d2.d("attribution_data");
        d2.e(new abeq(lykVar2, 2));
        a.b(d2.a());
        a.d(new vhe(awuu.a));
        return vfgVar.a(a.a());
    }

    public static float N(float f, float f2, float f3) {
        if (f3 < f) {
            return 0.0f;
        }
        if (f3 > f2) {
            return 1.0f;
        }
        return (f3 - f) / (f2 - f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean O(axzf axzfVar, axzg axzgVar) {
        Boolean bool;
        aqvj aqvjVar = axzfVar.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352819L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352819L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352819L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue() || ((Boolean) axzgVar.j().aB()).booleanValue();
    }

    public static final boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 23 && ((KeyguardManager) context.getSystemService("keyguard")).isDeviceSecure();
    }

    public static final Class[] b(wjn wjnVar, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wja.class, wjc.class, aftm.class};
        }
        if (i == 0) {
            wjnVar.d((wja) obj);
            return null;
        }
        if (i == 1) {
            wjnVar.e((wjc) obj);
            return null;
        }
        if (i == 2) {
            wjnVar.h();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static final void c(aatg aatgVar, String str, wig wigVar) {
        aatgVar.a(AccountIdentity.t(str), new wiy(wigVar), str, 6);
    }

    public static boolean d(Class cls, xgh xghVar) {
        wyr wyrVar = (wyr) cls.getAnnotation(wyr.class);
        if (wyrVar == null) {
            String valueOf = String.valueOf(xghVar);
            StringBuilder sb = new StringBuilder("null".length() + 33 + String.valueOf(valueOf).length());
            sb.append("Null values for FactoryHelper: ");
            sb.append("null");
            sb.append(", ");
            sb.append(valueOf);
            whu.l(null, sb.toString());
            return false;
        }
        if (wyrVar.b() == apae.SLOT_TYPE_UNSPECIFIED || wyrVar.b() == xghVar.c()) {
            return xghVar.f(wyrVar.d());
        }
        return false;
    }

    public static boolean e(Class cls, xgh xghVar, xev xevVar) {
        wyr wyrVar = (wyr) cls.getAnnotation(wyr.class);
        if (wyrVar == null || xevVar == null) {
            String valueOf = String.valueOf(wyrVar);
            String valueOf2 = String.valueOf(xghVar);
            String valueOf3 = String.valueOf(xevVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append("Null values for FactoryHelper: ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(", ");
            sb.append(valueOf3);
            whu.l(null, sb.toString());
            return false;
        }
        if (wyrVar.b() != apae.SLOT_TYPE_UNSPECIFIED && wyrVar.b() != xghVar.c()) {
            return false;
        }
        if ((wyrVar.a() == apac.LAYOUT_TYPE_UNSPECIFIED || wyrVar.a() == xevVar.b) && xghVar.f(wyrVar.d())) {
            for (Class cls2 : wyrVar.c()) {
                if (xevVar.f(cls2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String f(xgh xghVar) {
        StringBuilder sb = new StringBuilder(xghVar.c().name());
        sb.append(" ");
        g(sb, xghVar.d);
        g(sb, xghVar.e);
        g(sb, xghVar.f);
        return sb.toString();
    }

    public static void g(StringBuilder sb, List list) {
        int i = 0;
        while (true) {
            amvj amvjVar = (amvj) list;
            if (i >= amvjVar.c) {
                return;
            }
            sb.append(((xgx) list.get(i)).b().name());
            i++;
            if (i == amvjVar.c) {
                sb.append(";");
            } else {
                sb.append(",");
            }
        }
    }

    public static void h(Map map, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14) {
        map.put(apah.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED, azrwVar);
        map.put(apah.TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED, azrwVar);
        map.put(apah.TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED, azrwVar);
        map.put(apah.TRIGGER_TYPE_SLOT_ID_ENTER_REQUESTED, azrwVar2);
        map.put(apah.TRIGGER_TYPE_SLOT_ID_ENTERED, azrwVar2);
        map.put(apah.TRIGGER_TYPE_SLOT_ID_SCHEDULED, azrwVar2);
        map.put(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED, azrwVar2);
        map.put(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED_AND_SLOT_FULFILLED, azrwVar2);
        map.put(apah.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED, azrwVar2);
        map.put(apah.TRIGGER_TYPE_LAYOUT_ID_EXITED, azrwVar2);
        map.put(apah.TRIGGER_TYPE_SLOT_ID_EXITED, azrwVar2);
        map.put(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE, azrwVar3);
        map.put(apah.TRIGGER_TYPE_IN_MEDIA_TIME_RANGE_AND_SLOT_FULFILLED_NON_EMPTY, azrwVar3);
        map.put(apah.TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED, azrwVar3);
        map.put(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID, azrwVar7);
        map.put(apah.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED, azrwVar8);
        map.put(apah.TRIGGER_TYPE_LIVE_STREAM_BREAK_STARTED, azrwVar9);
        map.put(apah.TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED, azrwVar9);
        map.put(apah.TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED, azrwVar10);
        map.put(apah.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED, azrwVar11);
        map.put(apah.TRIGGER_TYPE_SKIP_REQUESTED, azrwVar12);
        map.put(apah.TRIGGER_TYPE_ON_LOADED_DIFFERENT_VIDEO_ID_THAN_EXPECTED, azrwVar7);
        map.put(apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON, azrwVar2);
        map.put(apah.TRIGGER_TYPE_SURVEY_SUBMITTED, azrwVar13);
        map.put(apah.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED, azrwVar7);
        map.put(apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_OTHER_REASON, azrwVar2);
        map.put(apah.TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR, azrwVar4);
        map.put(apah.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED, azrwVar5);
        map.put(apah.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED, azrwVar5);
        map.put(apah.TRIGGER_TYPE_MEDIA_PAUSED, azrwVar6);
        map.put(apah.TRIGGER_TYPE_MEDIA_RESUMED, azrwVar6);
        map.put(apah.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED, azrwVar6);
        map.put(apah.TRIGGER_TYPE_CLOSE_REQUESTED, azrwVar6);
        map.put(apah.TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED, azrwVar14);
    }

    public static void i(xjp xjpVar, xcl xclVar, auve auveVar, xcf xcfVar, PlayerResponseModel playerResponseModel, PlayerResponseModel playerResponseModel2, xfn xfnVar, boolean z, int i) {
        xkc b = xkd.b();
        if (auveVar != null) {
            b.l(auveVar);
        }
        b.b(xcfVar);
        b.d(xki.a(playerResponseModel.x(), playerResponseModel.b()));
        boolean z2 = z && i > 7;
        b.m(true != z2 ? 2 : 0);
        if (z2) {
            b.p(wbs.j(playerResponseModel.c()));
        }
        b.o((int) TimeUnit.MILLISECONDS.convert(i, TimeUnit.SECONDS));
        if (playerResponseModel2 != null) {
            b.g((playerResponseModel2.a.b & 536870912) != 0);
        }
        b.c(xfnVar);
        if (z2) {
            if (xclVar.c) {
                float f = xclVar.d;
                int i2 = xclVar.e;
                if (f == 0.0f || i2 == 0) {
                    afsi.b(2, 1, String.format(Locale.ENGLISH, "Unexpected custom dimensions: scaling factor %f, padding %d", Float.valueOf(f), Integer.valueOf(i2)));
                } else {
                    b.e(true);
                    b.k(f);
                    b.j(i2);
                }
            } else if (xclVar.b) {
                b.f(true);
            }
        }
        xjpVar.a = b.a();
    }

    public static boolean j(xjp xjpVar, boolean z) {
        if (xjpVar.f().d == 2 || xjpVar.f().e == z) {
            return false;
        }
        xkc a = xjpVar.f().a();
        a.i(z);
        xjpVar.a = a.a();
        return true;
    }

    public static boolean k(xjp xjpVar, PlayerConfigModel playerConfigModel, int i, int i2) {
        xkd f = xjpVar.f();
        xkc a = f.a();
        a.o(((int) TimeUnit.MILLISECONDS.convert(i, TimeUnit.SECONDS)) - i2);
        boolean z = false;
        if (f.d != 0) {
            xjpVar.a = a.a();
            return false;
        }
        int j = wbs.j(playerConfigModel) - i2;
        if (j > 0) {
            a.p(j);
        } else if (f.d == 0) {
            a.m(1);
            a.p(0);
            z = true;
        }
        xjpVar.a = a.a();
        return z;
    }

    public static synchronized vcw l(Context context) {
        vcw vcwVar;
        synchronized (whl.class) {
            slf.c();
            vcwVar = new vcw(Arrays.asList(vcz.q(context).a()));
        }
        return vcwVar;
    }

    public static final boolean m(String str, vfm vfmVar) {
        return vfmVar.f(str, false);
    }

    public static ywr n(Context context, String str, String str2, vfg vfgVar, aooy aooyVar) {
        vda a = vdb.a(context);
        a.e(str);
        a.f(str2);
        Uri a2 = a.a();
        vfe a3 = vff.a();
        a3.e(aooyVar);
        a3.f(a2);
        return new ywp(agcm.e(vfgVar.a(a3.a())), aooyVar);
    }

    public static ambx o(Context context, String str, anib anibVar, vfg vfgVar, amsx amsxVar, Uri uri, aooy aooyVar, vfl vflVar) {
        vfk d = vfn.d(context, anibVar);
        d.b();
        d.c = str;
        d.d((String[]) amsxVar.toArray(new String[0]));
        d.e(vflVar);
        vfn a = d.a();
        vfe a2 = vff.a();
        a2.f(uri);
        a2.e(aooyVar);
        a2.b(a);
        return agcm.e(vfgVar.a(a2.a()));
    }

    public static yll p(String str, Context context, vfg vfgVar, anib anibVar, String str2, ykr ykrVar, aooy aooyVar, amsx amsxVar, ylr ylrVar) {
        return ylrVar.a(agcm.e(q(str, context, vfgVar, anibVar, str2, ykrVar, aooyVar, amsxVar)), aooyVar);
    }

    public static vgz q(String str, Context context, vfg vfgVar, anib anibVar, String str2, ykr ykrVar, aooy aooyVar, amsx amsxVar) {
        vda a = vdb.a(context);
        a.e("commonui");
        a.f(str);
        Uri a2 = a.a();
        vfk d = vfn.d(context, anibVar);
        d.d((String[]) amsxVar.toArray(new String[amsxVar.size()]));
        d.b();
        d.c = str2;
        ykrVar.getClass();
        d.e(new abeq(ykrVar, 1));
        vfn a3 = d.a();
        vfe a4 = vff.a();
        a4.e(aooyVar);
        a4.f(a2);
        a4.b(a3);
        return vfgVar.a(a4.a());
    }

    public static void r(amsx amsxVar, aoox aooxVar, amrz amrzVar) {
        amxd listIterator = amsxVar.listIterator();
        while (listIterator.hasNext()) {
            ((zff) amrzVar.get(listIterator.next())).getClass();
        }
        amxd listIterator2 = amsxVar.listIterator();
        while (listIterator2.hasNext()) {
            Object next = listIterator2.next();
            ((zff) amrzVar.get(next)).a(next, aooxVar);
        }
    }

    public static Uri s(Context context, String str, String str2) {
        vda a = vdb.a(context);
        a.e(str);
        a.f(str2);
        return a.a();
    }

    public static void t(Context context, String str, String str2, int i, boolean z, boolean z2) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setShowBadge(z);
        if (!z2) {
            notificationChannel.setSound(null, null);
        }
        try {
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void u(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannel("GenericNotifications");
            t(context, "generic_notifications", context.getString(R.string.default_notifications_channel), 2, false, true);
        }
    }

    public static void v(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            t(context, str, str2, 2, false, true);
        }
    }

    public static void w(dy dyVar, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            dyVar.E = str;
        }
    }

    public static void x(dy dyVar, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            String num = Integer.toString(7);
            if (notificationManager.getNotificationChannel(num) != null) {
                dyVar.E = num;
            } else {
                y(dyVar);
            }
        }
    }

    public static void y(dy dyVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            dyVar.E = "generic_notifications";
        }
    }

    public static final void z(String str) {
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null) {
            zga.b("HttpsEnforcer: unexpected null host");
        } else if (!"https".equalsIgnoreCase(scheme)) {
            throw new yvs();
        }
    }
}
