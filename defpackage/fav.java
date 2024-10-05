package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fav {

    @Backup
    public static final String AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING = "autonav_toggle_user_edu_triggers_remaining";

    @Backup
    public static final String COUNTRY = "country";

    @SubstringBackup
    public static final String HINT_ID_PREFIX = "hint_id_prefix";

    @SubstringBackup
    public static final String HINT_LAST_SHOWN = "hint_last_shown";

    @Backup
    public static final String MOVING_THUMBNAILS_FIRST_ADD_TOOLTIP = "moving_thumbnails_first_add_tooltip";

    @Backup
    public static final String PIP_POLICY = "background_pip_policy_v2";

    @Backup
    public static final String RATE_LIMIT_PROMO_LAST_ALLOWED = "rate_limit_promo_last_allowed";

    @Backup
    public static final String RATE_LIMIT_SHOW_AUTOCONNECT_PROMPT_LAST_ALLOWED = "rate_limit_show_autoconnect_prompt_last_allowed";

    @Backup
    public static final String RATE_LIMIT_SHOW_INTERSTITIAL_PROMO_LAST_ALLOWED = "rate_limit_show_interstitial_promo_last_allowed";

    @Backup
    public static final String SHOW_ACCOUNT_TAB_TUTORIAL = "show_accounts_tab_tutorial";

    @Backup
    public static final String SHOW_CHANNELS_NOTIFICATIONS_TUTORIAL = "show_channels_notifications_tutorial";

    @Backup
    public static final String SHOW_SUBSCRIBERS_TAB_TUTORIAL = "show_subscribers_tab_tutorial";

    @Backup
    public static final String SHOW_SUBS_CHANNELS_TUTORIAL = "show_subs_channels_tutorial";

    @Backup
    public static final String SHOW_TRENDING_TAB_TUTORIAL = "show_trending_tab_tutorial";

    @Backup
    public static final String TIME_FUSION_ENABLED = "time_fusion_enabled";

    @Backup
    public static final String TIME_LAST_BROWSE_CLING_SHOWN = "time_last_browse_cling_shown";

    @Backup
    public static final String TIME_LAST_WATCH_TUTORIAL_SHOWN = "time_last_watch_tutorial_shown";

    @Backup
    public static final String UPLOAD_PRIVACY = "upload_privacy";

    @Backup
    public static final String VIDEO_ZOOM_USER_EDUCATION_SHOWN = "video_zoom_user_education_shown";

    public static void A(float f, Rect rect, Rect rect2) {
        double d = f;
        double width = rect.width();
        double height = rect.height();
        Double.isNaN(width);
        Double.isNaN(height);
        if (d < width / height) {
            int width2 = (int) (rect.width() / f);
            rect2.set(rect.left, rect.top - ((width2 - rect.height()) / 2), rect.right, rect.top + ((width2 + rect.height()) / 2));
        } else {
            int height2 = (int) (rect.height() * f);
            rect2.set(rect.left - ((height2 - rect.width()) / 2), rect.top, rect.left + ((rect.width() + height2) / 2), rect.bottom);
        }
    }

    public static void B(float f, Rect rect, Rect rect2) {
        double d = f;
        double width = rect.width();
        double height = rect.height();
        Double.isNaN(width);
        Double.isNaN(height);
        if (d < width / height) {
            int height2 = (int) (rect.height() * f);
            rect2.set(rect.left + ((rect.width() - height2) / 2), rect.top, rect.left + ((rect.width() + height2) / 2), rect.bottom);
        } else {
            int width2 = (int) (rect.width() / f);
            rect2.set(rect.left, rect.top + ((rect.height() - width2) / 2), rect.right, rect.top + ((rect.height() + width2) / 2));
        }
    }

    public static String C(Context context) {
        int myPid = Process.myPid();
        String N = N(myPid);
        if (N != null) {
            return N;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static int D(int i) {
        float f;
        float abs;
        int round;
        int round2;
        int round3;
        int alpha = Color.alpha(i);
        float max = Math.max(0.0f, Math.min(1.0f, 0.1f));
        if (max == 0.0f) {
            return i;
        }
        if (max == 1.0f) {
            return whu.S(-16777216, alpha);
        }
        float[] fArr = new float[3];
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        float max2 = Math.max(red, Math.max(green, blue));
        float min = Math.min(red, Math.min(green, blue));
        float f2 = max2 - min;
        float f3 = (max2 + min) / 2.0f;
        if (max2 == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max2 == red ? ((green - blue) / f2) % 6.0f : max2 == green ? ((blue - red) / f2) + 2.0f : ((red - green) / f2) + 4.0f;
            abs = f2 / (1.0f - Math.abs((f3 + f3) - 1.0f));
        }
        fArr[0] = (f * 60.0f) % 360.0f;
        fArr[1] = abs;
        fArr[2] = f3;
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - max));
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float abs2 = (1.0f - Math.abs((f6 + f6) - 1.0f)) * f5;
        float f7 = f6 - (0.5f * abs2);
        float abs3 = (1.0f - Math.abs(((f4 / 60.0f) % 2.0f) - 1.0f)) * abs2;
        switch (((int) f4) / 60) {
            case 0:
                round = Math.round((abs2 + f7) * 255.0f);
                round2 = Math.round((abs3 + f7) * 255.0f);
                round3 = Math.round(f7 * 255.0f);
                break;
            case 1:
                round = Math.round((abs3 + f7) * 255.0f);
                round2 = Math.round((abs2 + f7) * 255.0f);
                round3 = Math.round(f7 * 255.0f);
                break;
            case 2:
                round = Math.round(f7 * 255.0f);
                round2 = Math.round((abs2 + f7) * 255.0f);
                round3 = Math.round((abs3 + f7) * 255.0f);
                break;
            case 3:
                round = Math.round(f7 * 255.0f);
                round2 = Math.round((abs3 + f7) * 255.0f);
                round3 = Math.round((abs2 + f7) * 255.0f);
                break;
            case 4:
                round = Math.round((abs3 + f7) * 255.0f);
                round2 = Math.round(f7 * 255.0f);
                round3 = Math.round((abs2 + f7) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs2 + f7) * 255.0f);
                round2 = Math.round(f7 * 255.0f);
                round3 = Math.round((abs3 + f7) * 255.0f);
                break;
            default:
                round = 0;
                round3 = 0;
                round2 = 0;
                break;
        }
        return Color.argb(alpha, Math.max(0, Math.min(PrivateKeyType.INVALID, round)), Math.max(0, Math.min(PrivateKeyType.INVALID, round2)), Math.max(0, Math.min(PrivateKeyType.INVALID, round3)));
    }

    public static gos E(brj brjVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (int) (i5 * i6 * 0.015f);
        if (brjVar != null) {
            got a = got.a(brjVar.c(brk.b), i7, i, i2, i4);
            got a2 = got.a(brjVar.c(brk.e), i7, i, i2, i4);
            got gotVar = a.g ? a : a2.g ? a2 : null;
            if (gotVar != null) {
                return gotVar;
            }
            boolean z = a.e;
            got gotVar2 = (z && a2.e) ? ((float) a.f) * 2.5f >= ((float) a2.f) ? a : a2 : null;
            if (gotVar2 != null) {
                return gotVar2;
            }
            if (!z) {
                a = a2.e ? a2 : null;
            }
            if (a != null) {
                return a;
            }
        }
        return new gos(D(i), i, i3, i2);
    }

    public static void F(Context context, Uri uri) {
        if (ykp.h(context, uri)) {
            return;
        }
        whu.K(context, R.string.error_no_activity_for_uri, 0);
    }

    public static ammv G(String str, aakv aakvVar) {
        return ammv.i((awil) aakvVar.f(str).g(awil.class).X());
    }

    public static ammv H(ammv ammvVar) {
        atre b;
        if (ammvVar.h() && (b = ((awil) ammvVar.c()).b()) != null) {
            atqq aa = mcy.aa(b);
            if (aa == null || aa.g <= 0) {
                return amlr.a;
            }
            return ammv.j(Integer.valueOf((int) TimeUnit.SECONDS.toDays(aa.g)));
        }
        return amlr.a;
    }

    public static final void I(Optional optional, atrx atrxVar, atsb atsbVar, acra acraVar, Optional optional2, Optional optional3) {
        atol atolVar;
        amkq.F((optional2.isPresent() && optional3.isPresent()) ? false : true, "videoId and playlistId cannot both be present.");
        if (optional.isPresent()) {
            atolVar = (atol) optional.filter(ghv.s).map(iur.s).orElse(atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN);
        } else if (atrxVar != atrx.UNKNOWN_FORMAT_TYPE) {
            atolVar = atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_ALREADY_SAVED;
        } else {
            atolVar = atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
        }
        atol atolVar2 = atolVar;
        ahbj.k(atsbVar, acraVar, (String) optional2.orElse(null), (String) optional3.orElse(null), atrxVar, atolVar2 == atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_ALREADY_SAVED, agno.OFFLINE_IMMEDIATELY, atolVar2);
    }

    public static jtd J(Class cls, Class cls2) {
        return new jsp(cls, cls2);
    }

    public static int[] K() {
        return new int[]{1, 2};
    }

    public static void L(ajok ajokVar, aooy aooyVar) {
        if (aooyVar == null) {
            return;
        }
        String k = ajokVar.k("downloads_page_section_key");
        jqj O = O(ajokVar);
        if (O == null || k == null) {
            return;
        }
        jqk a = O.a();
        if (a.a(k, aooyVar) != null) {
            awav b = a.b(k, aooyVar);
            if (b == null) {
                zga.b(k.length() != 0 ? "Trying to show ungrafted proto for section: ".concat(k) : new String("Trying to show ungrafted proto for section: "));
            } else {
                a.b.I(3, adyu.ce(b), null);
            }
        }
    }

    public static void M(ajok ajokVar, aooy aooyVar) {
        jqk a;
        acsc a2;
        if (ajokVar == null || aooyVar == null) {
            return;
        }
        String k = ajokVar.k("downloads_page_section_key");
        jqj O = O(ajokVar);
        if (O == null || k == null || (a2 = (a = O.a()).a(k, aooyVar)) == null) {
            return;
        }
        awav b = a.b(k, aooyVar);
        if (b == null) {
            zga.b(k.length() != 0 ? "Trying to show ungrafted proto for section: ".concat(k) : new String("Trying to show ungrafted proto for section: "));
            return;
        }
        a.b.u(adyu.ce(b), null);
        awav c = a.c(a2, aooyVar);
        if (c != null) {
            a.b.u(adyu.ce(c), null);
        }
    }

    private static String N(int i) {
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            String str = new String(anaf.x(new File(sb.toString())).h(), Charset.forName("iso-8859-1"));
            int indexOf = str.indexOf(0);
            return indexOf > 0 ? str.substring(0, indexOf) : str;
        } catch (Error | Exception unused) {
            return null;
        }
    }

    private static jqj O(ajok ajokVar) {
        if (ajokVar.c("sectionListController") instanceof jqj) {
            return (jqj) ajokVar.c("sectionListController");
        }
        return null;
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, f("settings.accessibility.AccessibilitySettingsActivity")).setFlags(335544320);
    }

    public static Intent b(Context context) {
        return new Intent().setClassName(context, f("settings.SettingsActivity")).putExtra(":android:show_fragment", f("settings.GeneralPrefsFragment")).setFlags(335544320);
    }

    public static Intent c(Context context) {
        return new Intent().setClassName(context, f("settings.SettingsActivity")).putExtra(":android:show_fragment", f("settings.OfflinePrefsFragment")).setFlags(335544320);
    }

    public static Intent d(Context context) {
        return new Intent().setClassName(context, f("settings.SettingsActivity")).putExtra(":android:show_fragment", f("settings.videoquality.VideoQualityPrefsFragment")).setFlags(335544320);
    }

    public static Intent e(Context context) {
        return new Intent().setClassName(context, "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity").setFlags(335544320).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
    }

    public static String f(String str) {
        return str.length() != 0 ? "com.google.android.apps.youtube.app.".concat(str) : new String("com.google.android.apps.youtube.app.");
    }

    @Deprecated
    public static void g(fgp fgpVar, fhg fhgVar) {
        fgpVar.oQ(fhgVar);
    }

    public static boolean h(ajok ajokVar) {
        if (ajnr.a(ajokVar).a > 1) {
            return true;
        }
        return ajokVar.j("always_display_as_grid", false);
    }

    public static final ftg i(ViewGroup viewGroup, Spinner spinner, int i, int i2, int i3) {
        viewGroup.getClass();
        spinner.getClass();
        return new ftg(viewGroup, spinner, i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(ajng ajngVar, ajng ajngVar2, aadw aadwVar) {
        boolean z;
        if (ajngVar instanceof ajpd) {
            apwy b = aadwVar.b();
            asvu asvuVar = b.e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if ((asvuVar.e & 8192) != 0) {
                asvu asvuVar2 = b.e;
                if (asvuVar2 == null) {
                    asvuVar2 = asvu.a;
                }
                z = asvuVar2.af;
            } else {
                z = true;
            }
            if (!((you) ajngVar).isEmpty() || ajngVar2.isEmpty()) {
                return;
            }
            Object c = ajngVar2.c(0);
            if ((c instanceof apib) || (c instanceof apqv) || (c instanceof asnr) || (c instanceof aptj) || (c instanceof avnh) || (c instanceof avnb) || (c instanceof apzx) || (c instanceof apyv) || (c instanceof areq) || (c instanceof auia) || (c instanceof nia) || (c instanceof aqul) || (c instanceof aunk) || (c instanceof auwt) || (c instanceof auwz) || (c instanceof arev) || (c instanceof atdn) || (c instanceof aqae)) {
                return;
            }
            if (((c instanceof ajds) && !z) || (c instanceof aptm) || evr.br(c)) {
                return;
            }
            ((ajpd) ajngVar).add(frd.b());
        }
    }

    public static void k(ajjz ajjzVar, avgf avgfVar, int i, int i2, syd sydVar, sxc sxcVar, Executor executor) {
        try {
            executor.execute(new ajhz(ajjzVar, avgfVar, i, i2, 1));
        } catch (RejectedExecutionException e) {
            sydVar.a(28, "Image preload rejected", sxcVar, e);
        }
    }

    public static aahd l(aahd aahdVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 2);
        return new gve(aahdVar, hashMap);
    }

    public static ajol m() {
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 2);
        return new ajol() { // from class: gvc
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i) {
                ajokVar.g(hashMap);
            }
        };
    }

    public static int n(int i, int i2, float f) {
        return (int) (i + ((i2 - i) * f) + 0.5f);
    }

    public static View o(View view, Point point, ammy ammyVar) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup) view;
            for (View view2 : new Iterable() { // from class: goz
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    return new gpa(viewGroup);
                }
            }) {
                View o = o(view2, new Point(point.x - (view2.getLeft() + ((int) view2.getTranslationX())), point.y - (view2.getTop() + ((int) view2.getTranslationY()))), ammyVar);
                if (o != null) {
                    return o;
                }
            }
        }
        if (point.x < 0 || point.x >= view.getWidth() || point.y < 0 || point.y >= view.getHeight() || !ammyVar.a(view)) {
            return null;
        }
        return view;
    }

    public static View p(View view, int i, Class cls) {
        View findViewById = view.findViewById(i);
        if (findViewById == null) {
            return null;
        }
        try {
            return (View) cls.cast(findViewById);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static AccessibilityLayerLayout q(Activity activity) {
        View findViewById = activity.findViewById(R.id.accessibility_layer_container);
        if (findViewById instanceof AccessibilityLayerLayout) {
            return (AccessibilityLayerLayout) findViewById;
        }
        return null;
    }

    public static void r(Point point, View view) {
        while (view != null) {
            Object parent = view.getParent();
            point.x = (int) (point.x - (view.getLeft() + view.getTranslationX()));
            point.y = (int) (point.y - (view.getTop() + view.getTranslationY()));
            if (parent instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) parent;
                point.x += viewPager.getScrollX();
                point.y += viewPager.getScrollY();
            }
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                point.x -= iArr[0];
                point.y -= iArr[1];
                return;
            }
        }
    }

    public static void s(Rect rect, Rect rect2, Rect rect3, float f) {
        rect.set(n(rect2.left, rect3.left, f), n(rect2.top, rect3.top, f), n(rect2.right, rect3.right, f), n(rect2.bottom, rect3.bottom, f));
    }

    public static void t(Activity activity, boolean z) {
        AccessibilityLayerLayout q = q(activity);
        if (q != null) {
            q.b(z);
        }
    }

    public static void u(Activity activity, boolean z) {
        AccessibilityLayerLayout q = q(activity);
        if (q != null) {
            q.c(z);
        }
    }

    public static int v(long j) {
        double d = j;
        Double.isNaN(d);
        return (int) Math.ceil(d / 86400.0d);
    }

    public static int w(long j) {
        double d = j;
        Double.isNaN(d);
        return (int) Math.ceil(d / 3600.0d);
    }

    public static int x(long j) {
        double d = j;
        Double.isNaN(d);
        return (int) Math.ceil(d / 60.0d);
    }

    public static CharSequence y(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        ajm a = ajm.a();
        return a == null ? charSequence : a.b(charSequence.toString());
    }

    public static void z(Rect rect, float f, Rect rect2) {
        rect.getClass();
        rect2.getClass();
        amkq.E(f >= 0.0f);
        if (f == 1.0f) {
            rect2.set(rect);
            return;
        }
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int width = rect.width();
        int height = rect.height();
        int round = Math.round(width * f);
        int round2 = Math.round(height * f);
        rect2.left = centerX - (round / 2);
        rect2.top = centerY - (round2 / 2);
        rect2.right = rect2.left + round;
        rect2.bottom = rect2.top + round2;
    }
}
