package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.provider.SearchRecentSuggestions;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.libraries.youtube.notification.NotificationInteractionBroadcastReceiver;
import com.google.android.libraries.youtube.notification.push.optoutdialog.NotificationOptOutDialogActivity;
import com.google.android.youtube.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class enq {
    public static final /* synthetic */ int a = 0;

    static {
        TimeUnit.MINUTES.toSeconds(90L);
    }

    public static ajcx A(Context context, aadw aadwVar, ajcw ajcwVar, Executor executor) {
        return new ajdb(aadwVar.b(), context, ajcwVar, executor);
    }

    public static akdn B(Context context, aadw aadwVar, aaea aaeaVar, SharedPreferences sharedPreferences) {
        return new lgz(context, sharedPreferences, aadwVar, aaeaVar);
    }

    public static Set C(aadw aadwVar, apdb apdbVar, azrw azrwVar, azrw azrwVar2, ynn ynnVar) {
        avdj avdjVar = aadwVar.b().u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        if (avdjVar.r == 0) {
            return amvs.a;
        }
        if (!apdbVar.b || apdbVar.k) {
            return amsx.r(new aapw((aaeg) azrwVar2.get(), new egv(azrwVar, 4), ynnVar, 3));
        }
        return amvs.a;
    }

    public static boolean D(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.cc;
    }

    public static afso E(ylf ylfVar) {
        return new afso(ylfVar, "offline_library_browse_fetch");
    }

    public static afso F(ylf ylfVar) {
        return new afso(ylfVar, "offline_settings_fetch");
    }

    public static fuj G(aadw aadwVar, fuo fuoVar) {
        apeq am = evr.am(aadwVar);
        return (am != null && am.b && am.c) ? new fug(fuoVar) : new fui();
    }

    public static akev H(aaea aaeaVar, SharedPreferences sharedPreferences, akep akepVar, Context context, afsy afsyVar, wco wcoVar, ScheduledExecutorService scheduledExecutorService, shf shfVar, lgw lgwVar, akdz akdzVar, akec akecVar, akdj akdjVar, aker akerVar, akeh akehVar, lgy lgyVar) {
        lha lhaVar = new lha(sharedPreferences, context, aaeaVar);
        lhaVar.f();
        lhaVar.f = true;
        lhaVar.g = false;
        lhaVar.e = false;
        lhaVar.j = evr.U(aaeaVar);
        return new akev(lhaVar, akepVar, afsyVar, wcoVar, scheduledExecutorService, shfVar, lgwVar, akdzVar, akecVar, akdjVar, akerVar, akehVar, lgyVar, null);
    }

    public static akev I(aaea aaeaVar, SharedPreferences sharedPreferences, akep akepVar, Context context, afsy afsyVar, wco wcoVar, ScheduledExecutorService scheduledExecutorService, shf shfVar, lgw lgwVar, akdz akdzVar, akec akecVar, aker akerVar, akeh akehVar, lgy lgyVar) {
        lha lhaVar = new lha(sharedPreferences, context, aaeaVar);
        lhaVar.f();
        lhaVar.f = false;
        lhaVar.g = true;
        lhaVar.e = true;
        lhaVar.j = evr.U(aaeaVar);
        return new akev(lhaVar, akepVar, afsyVar, wcoVar, scheduledExecutorService, shfVar, lgwVar, akdzVar, akecVar, null, akerVar, akehVar, lgyVar, null);
    }

    public static akdp J(azrw azrwVar) {
        return (akdp) azrwVar.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static akep K(azrw azrwVar, azrw azrwVar2, akey akeyVar, shf shfVar, axzg axzgVar) {
        Boolean bool;
        ysl yslVar;
        aqvj aqvjVar = axzgVar.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45358877L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45358877L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45358877L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            yslVar = (ysl) azrwVar2.get();
        } else {
            yslVar = (ysl) azrwVar.get();
        }
        return new akep(yslVar, akeyVar, shfVar);
    }

    public static akmq L(azrw azrwVar) {
        return (akmq) azrwVar.get();
    }

    public static dsm M(Context context, apdb apdbVar) {
        return new dsm(context, apdbVar);
    }

    public static evr N() {
        return new evr();
    }

    public static Set O(aaea aaeaVar, axze axzeVar, lah lahVar, izb izbVar, ggn ggnVar) {
        HashSet hashSet = new HashSet();
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if (aswbVar.M) {
            hashSet.add(lahVar);
        }
        aswb aswbVar2 = aaeaVar.a().e;
        if (aswbVar2 == null) {
            aswbVar2 = aswb.a;
        }
        if (aswbVar2.aG) {
            hashSet.add(izbVar);
        }
        if (((Boolean) axzeVar.a.a.Y(axzd.c).B().as(false).X()).booleanValue()) {
            hashSet.add(ggnVar);
        }
        return hashSet;
    }

    public static aaxl P(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, Context context) {
        return new aaxl(aarmVar, ajoyVar, afsyVar, yslVar, aapw.a, evr.b(context), null, null, null);
    }

    public static alaj Q(Context context, aadw aadwVar, akzk akzkVar, axze axzeVar) {
        alaj alajVar = new alaj();
        alajVar.b(new alab(context, akzkVar, axzeVar, 1, null, null, null));
        alajVar.b(new alab(context, akzkVar, axzeVar, 0, null, null, null));
        alajVar.b(new zyl(context, aadwVar, akzkVar, axzeVar, null, null, null));
        alajVar.b(new alaq());
        return alajVar;
    }

    public static axze R(aaea aaeaVar) {
        return new axze(aaeaVar, (char[]) null);
    }

    public static PendingIntent a(Context context, Intent intent) {
        PendingIntent b = uzj.b(context, intent, uzj.a | 134217728);
        b.getClass();
        return b;
    }

    public static Intent b(Context context) {
        return fav.e(context);
    }

    public static PackageManager c(Context context) {
        return context.getPackageManager();
    }

    public static SearchRecentSuggestions d(Context context) {
        return new SearchRecentSuggestions(context, "com.google.android.youtube.SuggestionProvider", 1);
    }

    public static aabx e(iyu iyuVar) {
        aabw aabwVar = new aabw();
        aabwVar.a = adyu.dx();
        aabwVar.b = adyu.dx();
        aabwVar.c = army.ANDROID;
        aabwVar.d = iyuVar;
        aabwVar.e = true;
        return aabwVar.a();
    }

    public static aapw f(azrw azrwVar, ynn ynnVar) {
        return new aapw(new aaeh(1), new egv(azrwVar, 3), ynnVar, 3);
    }

    public static adui g(azrw azrwVar) {
        return (adui) azrwVar.get();
    }

    public static afqp h(abep abepVar) {
        afqc afqcVar;
        aaeb aaebVar = (aaeb) ynm.g(abepVar.c(), 1L, TimeUnit.SECONDS, aaeb.a());
        afqo afqoVar = new afqo();
        if (aaebVar == aaeb.TEST || aaebVar == aaeb.UBERDEMO) {
            afqcVar = ezz.b;
        } else {
            afqcVar = ezz.a;
        }
        afqoVar.a = afqcVar;
        afqoVar.b = afqi.ANDROID;
        return afqoVar.a();
    }

    public static afyq i(Context context) {
        afyp afypVar = new afyp();
        afypVar.c(0);
        afypVar.b(0);
        afypVar.a(0);
        afypVar.a = new Intent(context, (Class<?>) NotificationInteractionBroadcastReceiver.class);
        afypVar.b = fav.e(context);
        afypVar.c = new Intent(context, (Class<?>) NotificationOptOutDialogActivity.class).addFlags(411041792);
        afypVar.c(R.drawable.quantum_ic_video_youtube_white_24);
        afypVar.b(R.mipmap.ic_launcher);
        afypVar.a(R.string.application_name);
        afypVar.g = "414843287017";
        Integer num = afypVar.d;
        if (num == null || afypVar.e == null || afypVar.f == null) {
            StringBuilder sb = new StringBuilder();
            if (afypVar.d == null) {
                sb.append(" smallIcon");
            }
            if (afypVar.e == null) {
                sb.append(" largeIcon");
            }
            if (afypVar.f == null) {
                sb.append(" appLabel");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new afyq(afypVar.a, afypVar.b, afypVar.c, num.intValue(), afypVar.e.intValue(), afypVar.f.intValue(), afypVar.g);
    }

    public static agcf j(agcd agcdVar, afyt afytVar) {
        agaf agafVar = (agaf) agcdVar.a.get();
        agafVar.getClass();
        aaxn aaxnVar = (aaxn) agcdVar.b.get();
        aaxnVar.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) agcdVar.c.get();
        scheduledExecutorService.getClass();
        zfm zfmVar = (zfm) agcdVar.d.get();
        zfmVar.getClass();
        afytVar.getClass();
        Context context = (Context) agcdVar.e.get();
        context.getClass();
        aaea aaeaVar = (aaea) agcdVar.f.get();
        aaeaVar.getClass();
        shf shfVar = (shf) agcdVar.g.get();
        shfVar.getClass();
        ysy ysyVar = (ysy) agcdVar.h.get();
        ysyVar.getClass();
        ajyg ajygVar = (ajyg) agcdVar.i.get();
        ajygVar.getClass();
        return new agcc(agafVar, aaxnVar, scheduledExecutorService, zfmVar, afytVar, context, aaeaVar, shfVar, ysyVar, ajygVar, agcdVar.j, null, null, null);
    }

    public static aghp k() {
        agho aghoVar = new agho();
        aghoVar.a = false;
        aghoVar.b(false);
        aghoVar.a(false);
        aghoVar.d = false;
        aghoVar.b(true);
        aghoVar.a(true);
        Boolean bool = aghoVar.a;
        if (bool == null || aghoVar.b == null || aghoVar.c == null || aghoVar.d == null) {
            StringBuilder sb = new StringBuilder();
            if (aghoVar.a == null) {
                sb.append(" channelAutoOfflineEnabled");
            }
            if (aghoVar.b == null) {
                sb.append(" videoListAutoOfflineEnabled");
            }
            if (aghoVar.c == null) {
                sb.append(" offlineCandidatesEnabled");
            }
            if (aghoVar.d == null) {
                sb.append(" offlineSubscriptionsSyncEnabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aghp(bool.booleanValue(), aghoVar.b.booleanValue(), aghoVar.c.booleanValue(), aghoVar.d.booleanValue());
    }

    public static aght l() {
        aghs aghsVar = new aghs();
        aghsVar.a(false);
        aghsVar.b = false;
        aghsVar.c = 1;
        aghsVar.d = 35;
        aghsVar.e = 2000L;
        aghsVar.f = Long.valueOf(agtw.a);
        aghsVar.i = false;
        aghsVar.g = false;
        aghsVar.h = 0;
        aghsVar.a(true);
        Boolean bool = aghsVar.a;
        if (bool == null || aghsVar.b == null || aghsVar.c == null || aghsVar.d == null || aghsVar.e == null || aghsVar.f == null || aghsVar.g == null || aghsVar.h == null || aghsVar.i == null) {
            StringBuilder sb = new StringBuilder();
            if (aghsVar.a == null) {
                sb.append(" enablePlaylistAutoSync");
            }
            if (aghsVar.b == null) {
                sb.append(" enableYouTubeBundles");
            }
            if (aghsVar.c == null) {
                sb.append(" transferRetryStrategy");
            }
            if (aghsVar.d == null) {
                sb.append(" transferMaxRetries");
            }
            if (aghsVar.e == null) {
                sb.append(" transferBaseRetryMilliSecs");
            }
            if (aghsVar.f == null) {
                sb.append(" transferMaxRetryMilliSecs");
            }
            if (aghsVar.g == null) {
                sb.append(" disableOfflineWhenDatabaseOpenException");
            }
            if (aghsVar.h == null) {
                sb.append(" databaseOpenRetries");
            }
            if (aghsVar.i == null) {
                sb.append(" enableFallbackToAudioOnlyDownload");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aght(bool.booleanValue(), aghsVar.b.booleanValue(), aghsVar.c.intValue(), aghsVar.d.intValue(), aghsVar.e.longValue(), aghsVar.f.longValue(), aghsVar.g.booleanValue(), aghsVar.h.intValue(), aghsVar.i.booleanValue());
    }

    public static ahbv m() {
        ahbu a2 = ahbv.a();
        a2.c(true);
        return a2.a();
    }

    public static ajjv n() {
        return ajjv.a;
    }

    public static ajjz o(apdb apdbVar, azrw azrwVar, azrw azrwVar2) {
        return apdbVar.b ? (ajjz) azrwVar.get() : (ajjz) azrwVar2.get();
    }

    public static akeh p() {
        return new akeh();
    }

    public static akei q(shf shfVar) {
        return new akei(shfVar);
    }

    public static aker r(azrw azrwVar) {
        return (aker) azrwVar.get();
    }

    public static amrz s() {
        return acov.a;
    }

    public static FirebaseAnalytics t(Context context) {
        return FirebaseAnalytics.getInstance(context);
    }

    public static armw u() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    z = true;
                } else if (cameraInfo.facing == 1) {
                    z2 = true;
                }
            }
            return z ? z2 ? armw.CAMERA_FRONT_AND_BACK : armw.CAMERA_BACK : z2 ? armw.CAMERA_FRONT : armw.CAMERA_NONE;
        } catch (Exception e) {
            zga.d("Can't get camera type", e);
            return armw.CAMERA_UNKNOWN;
        }
    }

    public static String v(Context context, SharedPreferences sharedPreferences, String str) {
        Set set = aaef.c;
        String string = sharedPreferences.getString(fav.COUNTRY, "");
        if (!TextUtils.isEmpty(string)) {
            string = zhq.l(string);
            if (set.contains(string)) {
                return string;
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            string = telephonyManager.getSimCountryIso();
            if (!TextUtils.isEmpty(string)) {
                string = zhq.l(string);
                if (set.contains(string)) {
                    return string;
                }
            }
        }
        if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(str)) {
            String l = zhq.l(str);
            if (set.contains(l)) {
                return l;
            }
        }
        String l2 = zhq.l(Locale.getDefault().getCountry());
        if (set.contains(l2)) {
            return l2;
        }
        return null;
    }

    public static boolean w(yxx yxxVar) {
        return (yxxVar.f(yxx.E) & 2097152) != 0;
    }

    public static kyj x(aadw aadwVar, abaz abazVar) {
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.F) {
            return new kya(abazVar);
        }
        return new kyi(abazVar);
    }

    public static ymq y(ymy ymyVar, Executor executor, aadw aadwVar) {
        apwy b = aadwVar.b();
        avdj avdjVar = b.u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        if ((avdjVar.b & 1) == 0) {
            return new ymq(executor);
        }
        avdj avdjVar2 = b.u;
        if (avdjVar2 == null) {
            avdjVar2 = avdj.a;
        }
        apdy apdyVar = avdjVar2.c;
        if (apdyVar == null) {
            apdyVar = apdy.c;
        }
        aonw aonwVar = new aonw(apdyVar.g, apdy.b);
        avdj avdjVar3 = b.u;
        if (avdjVar3 == null) {
            avdjVar3 = avdj.a;
        }
        apdy apdyVar2 = avdjVar3.c;
        if (apdyVar2 == null) {
            apdyVar2 = apdy.c;
        }
        return new ymq(ymyVar, executor, aonwVar, new aonw(apdyVar2.f, apdy.a));
    }

    public static ymy z(ScheduledExecutorService scheduledExecutorService, aadw aadwVar) {
        apwy b = aadwVar.b();
        apdy apdyVar = null;
        if (b != null && (b.b & 67108864) != 0) {
            avdj avdjVar = b.u;
            if (avdjVar == null) {
                avdjVar = avdj.a;
            }
            apdyVar = avdjVar.c;
            if (apdyVar == null) {
                apdyVar = apdy.c;
            }
        }
        return new ymy(scheduledExecutorService, apdyVar);
    }
}
