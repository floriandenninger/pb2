package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agtw {
    public static final long a = TimeUnit.HOURS.toMillis(1);

    public static void A(agmx agmxVar, String str) {
        agmxVar.k("disco_session_nonce", str);
    }

    public static void B(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(yny.K("offline_active_transfers_%s", str), z).apply();
    }

    public static void C(agmx agmxVar, boolean z) {
        agmxVar.g("sd_card_offline_disk_error", z);
    }

    public static void D(agmx agmxVar, boolean z) {
        agmxVar.g("is_sync", z);
    }

    public static void E(agmx agmxVar, boolean z) {
        agmxVar.g("triggered_by_refresh", z);
    }

    public static void F(agmx agmxVar, boolean z) {
        agmxVar.g("is_truncated_hash", z);
    }

    public static void G(agmx agmxVar, boolean z) {
        agmxVar.g("user_triggered", z);
    }

    public static void H(agmx agmxVar, byte[] bArr) {
        agmxVar.h("logging_params", bArr);
    }

    public static void I(agmx agmxVar, int i) {
        agmxVar.i("max_retries", i);
    }

    public static void J(agmx agmxVar, long j) {
        agmxVar.j("max_retry_milli_secs", j);
    }

    public static void K(agmx agmxVar, String str) {
        agmxVar.k("audio_track_id", str);
    }

    public static void L(agmx agmxVar, int i) {
        agmxVar.i("offline_digest_store_level", i);
    }

    public static void M(agmx agmxVar, int i) {
        agmxVar.i("stream_quality", i);
    }

    public static void N(agmx agmxVar, String str) {
        agmxVar.k("playlist_id", str);
    }

    public static void O(agmx agmxVar, boolean z) {
        agmxVar.g("requireTimeWindow", z);
    }

    public static void P(agmx agmxVar, agnf agnfVar) {
        agmxVar.i("running_media_status", agnfVar.q);
    }

    public static void Q(agmx agmxVar, long j) {
        agmxVar.j("storage_bytes_read", j);
    }

    public static void R(agmx agmxVar, long j) {
        agmxVar.j("transfer_added_time_millis", j);
    }

    public static void S(agmx agmxVar, String str) {
        agmxVar.k("transfer_nonce", str);
    }

    public static void T(agmx agmxVar, int i) {
        agmxVar.i("retry_strategy", i);
    }

    public static void U(agmx agmxVar, double d) {
        agmxVar.p(d);
    }

    public static void V(agmx agmxVar, int i) {
        agmxVar.i("transfer_type", i);
    }

    public static void W(agmx agmxVar, boolean z) {
        agmxVar.g("use_cached_disco", z);
    }

    public static void X(agmx agmxVar, String str) {
        agmxVar.k("video_id", str);
    }

    public static void Y(agmx agmxVar, String str) {
        agmxVar.k("video_list_id", str);
    }

    public static boolean Z(agmx agmxVar) {
        return agmxVar.l("sd_card_offline_disk_error");
    }

    public static int a(agmx agmxVar) {
        return agmxVar.b("max_retries", 35);
    }

    public static boolean aa(agmx agmxVar) {
        return agmxVar.m("is_sync", false);
    }

    public static boolean ab(agmx agmxVar) {
        return agmxVar.m("triggered_by_refresh", false);
    }

    public static boolean ac(agmx agmxVar) {
        return agmxVar.m("is_truncated_hash", false);
    }

    public static boolean ad(agmx agmxVar) {
        return agmxVar.m("is_unmetered_5g", false);
    }

    public static boolean ae(agmx agmxVar) {
        return agmxVar.m("user_triggered", true);
    }

    public static boolean af(agmx agmxVar) {
        return agmxVar.m("requireTimeWindow", false);
    }

    public static boolean ag(agmx agmxVar) {
        return agmxVar.l("use_cached_disco");
    }

    public static boolean ah(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(yny.K("offline_active_transfers_%s", str), true);
    }

    public static boolean ai(agnz agnzVar) {
        int f = f(agnzVar.f);
        return f == 1 || f == 4 || f == 7 || f == 6;
    }

    public static byte[] aj(agmx agmxVar) {
        return agmxVar.n("click_tracking_params");
    }

    public static byte[] ak(agmx agmxVar) {
        return agmxVar.n("logging_params");
    }

    public static void al(agmx agmxVar) {
        agmxVar.g("is_unmetered_5g", true);
    }

    public static int am(agmx agmxVar) {
        return anaf.bZ(agmxVar.b("offline_audio_quality", 0));
    }

    public static void an(agmx agmxVar, int i) {
        agmxVar.i("offline_audio_quality", i - 1);
    }

    public static int b(agmx agmxVar) {
        return agmxVar.b("stream_verification_attempts", 0);
    }

    public static int c(agmx agmxVar) {
        return agmxVar.b("offline_digest_store_level", -1);
    }

    public static int d(agmx agmxVar) {
        return agmxVar.a("stream_quality");
    }

    public static int e(agmx agmxVar) {
        return agmxVar.b("retry_strategy", 1);
    }

    public static int f(agmx agmxVar) {
        return agmxVar.b("transfer_type", 0);
    }

    public static long g(agmx agmxVar) {
        return agmxVar.d("back_off_total_millis", 0L);
    }

    public static long h(agmx agmxVar) {
        return agmxVar.d("base_retry_milli_secs", 2000L);
    }

    public static long i(agmx agmxVar) {
        return agmxVar.c("cache_bytes_read");
    }

    public static long j(agmx agmxVar) {
        return agmxVar.c("storage_bytes_read");
    }

    public static long k(agmx agmxVar) {
        return agmxVar.c("transfer_added_time_millis");
    }

    public static agnf l(agmx agmxVar) {
        return agnf.a(agmxVar.b("complete_media_status", agnf.COMPLETE.q));
    }

    public static agnf m(agmx agmxVar) {
        return agnf.a(agmxVar.b("running_media_status", agnf.ACTIVE.q));
    }

    public static String n(agmx agmxVar) {
        return agmxVar.f("disco_session_nonce");
    }

    public static String o(agmx agmxVar) {
        String r = r(agmxVar);
        return TextUtils.isEmpty(r) ? u(agmxVar) : r;
    }

    public static String p(agmx agmxVar) {
        return agmxVar.f("audio_track_id");
    }

    public static String q(agmx agmxVar) {
        return agmxVar.f("partial_playback_nonce");
    }

    public static String r(agmx agmxVar) {
        return agmxVar.f("playlist_id");
    }

    public static String s(agmx agmxVar) {
        return agmxVar.f("transfer_nonce");
    }

    public static String t(agmx agmxVar) {
        return ammx.d(agmxVar.f("video_id"));
    }

    public static String u(agmx agmxVar) {
        return agmxVar.f("video_list_id");
    }

    public static void v(agmx agmxVar, long j) {
        long g = g(agmxVar);
        long d = agmxVar.d("back_off_start_millis", -1L);
        if (d >= 0) {
            w(agmxVar, -1L);
            agmxVar.j("back_off_total_millis", g + (j - d));
        }
    }

    public static void w(agmx agmxVar, long j) {
        agmxVar.j("back_off_start_millis", j);
    }

    public static void x(agmx agmxVar, long j) {
        agmxVar.j("base_retry_milli_secs", j);
    }

    public static void y(agmx agmxVar, long j) {
        agmxVar.j("cache_bytes_read", j);
    }

    public static void z(agmx agmxVar, byte[] bArr) {
        agmxVar.h("click_tracking_params", bArr);
    }
}
