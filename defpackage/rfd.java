package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfd {
    public static final rfc A;
    public static final rfc B;
    public static final rfc C;
    public static final rfc D;
    public static final rfc E;
    public static final rfc F;
    public static final rfc G;
    public static final rfc H;
    public static final rfc I;

    /* renamed from: J, reason: collision with root package name */
    public static final rfc f272J;
    public static final rfc K;
    public static final rfc L;
    public static final rfc M;
    public static final rfc N;
    public static final rfc O;
    public static final rfc P;
    public static final rfc Q;
    public static final rfc R;
    public static final rfc S;
    public static final rfc T;
    public static final rfc U;
    public static final rfc V;
    public static final rfc W;
    public static final rfc X;
    public static final rfc Y;
    public static final rfc Z;
    public static final List a = Collections.synchronizedList(new ArrayList());
    public static final rfc aa;
    public static final rfc ab;
    public static final rfc ac;
    public static final rfc ad;
    public static final rfc ae;
    public static final rfc af;
    public static final rfc ag;
    public static final rfc ah;
    public static final rfc ai;
    public static final rfc aj;
    public static final rfc ak;
    public static final rfc al;
    public static final rfc am;
    public static final rfc an;
    public static final rfc ao;
    public static final rfc ap;
    public static final rfc aq;
    public static final rfc ar;
    public static final rfc as;
    public static final rfc at;
    public static final rfc au;
    public static final rfc av;
    public static final rfc aw;
    public static final rfc ax;
    public static final rfc ay;
    public static final rfc b;
    public static final rfc c;
    public static final rfc d;
    public static final rfc e;
    public static final rfc f;
    public static final rfc g;
    public static final rfc h;
    public static final rfc i;
    public static final rfc j;
    public static final rfc k;
    public static final rfc l;
    public static final rfc m;
    public static final rfc n;
    public static final rfc o;
    public static final rfc p;
    public static final rfc q;
    public static final rfc r;
    public static final rfc s;
    public static final rfc t;
    public static final rfc u;
    public static final rfc v;
    public static final rfc w;
    public static final rfc x;
    public static final rfc y;
    public static final rfc z;

    static {
        Collections.synchronizedSet(new HashSet());
        b = c("measurement.ad_id_cache_time", 10000L, rex.b);
        c = c("measurement.monitoring.sample_period_millis", 86400000L, rex.l);
        d = c("measurement.config.cache_time", 86400000L, rex.d);
        e = c("measurement.config.url_scheme", "https", rex.p);
        f = c("measurement.config.url_authority", "app-measurement.com", rey.g);
        g = c("measurement.upload.max_bundles", 100, rey.s);
        h = c("measurement.upload.max_batch_size", 65536, rez.j);
        i = c("measurement.upload.max_bundle_size", 65536, rfa.b);
        j = c("measurement.upload.max_events_per_bundle", 1000, rfa.k);
        k = c("measurement.upload.max_events_per_day", 100000, rfa.l);
        l = c("measurement.upload.max_error_events_per_day", 1000, rey.a);
        m = c("measurement.upload.max_public_events_per_day", 50000, rey.m);
        n = c("measurement.upload.max_conversions_per_day", 10000, rez.c);
        o = c("measurement.upload.max_realtime_events_per_day", 10, rez.n);
        p = c("measurement.store.max_stored_events_per_app", 100000, rfa.d);
        q = c("measurement.upload.url", "https://app-measurement.com/a", rfa.m);
        r = c("measurement.upload.backoff_period", 43200000L, rfa.n);
        s = c("measurement.upload.window_interval", 3600000L, rfa.o);
        t = c("measurement.upload.interval", 3600000L, rex.a);
        u = c("measurement.upload.realtime_upload_interval", 10000L, rex.c);
        v = c("measurement.upload.debug_upload_interval", 1000L, rex.e);
        w = c("measurement.upload.minimum_delay", 500L, rex.f);
        x = c("measurement.alarm_manager.minimum_interval", 60000L, rex.g);
        y = c("measurement.upload.stale_data_deletion_interval", 86400000L, rex.h);
        z = c("measurement.upload.refresh_blacklisted_config_interval", 604800000L, rex.i);
        A = c("measurement.upload.initial_upload_delay_time", 15000L, rex.j);
        B = c("measurement.upload.retry_time", 1800000L, rex.k);
        C = c("measurement.upload.retry_count", 6, rex.m);
        D = c("measurement.upload.max_queue_time", 2419200000L, rex.n);
        E = c("measurement.lifetimevalue.max_currency_tracked", 4, rex.o);
        F = c("measurement.audience.filter_result_max_count", 200, rex.q);
        G = a("measurement.upload.max_public_user_properties", 25);
        H = a("measurement.upload.max_event_name_cardinality", 500);
        I = a("measurement.upload.max_public_event_params", 25);
        f272J = c("measurement.service_client.idle_disconnect_millis", 5000L, rex.r);
        K = c("measurement.test.boolean_flag", false, rex.s);
        L = c("measurement.test.string_flag", "---", rex.t);
        M = c("measurement.test.long_flag", -1L, rex.u);
        N = c("measurement.test.int_flag", -2, rey.b);
        O = c("measurement.test.double_flag", Double.valueOf(-3.0d), rey.c);
        P = c("measurement.experiment.max_ids", 50, rey.d);
        Q = c("measurement.max_bundles_per_iteration", 100, rey.e);
        R = c("measurement.sdk.attribution.cache.ttl", 604800000L, rey.f);
        S = c("measurement.validation.internal_limits_internal_event_params", false, rey.h);
        T = c("measurement.collection.firebase_global_collection_flag_enabled", true, rey.i);
        U = c("measurement.collection.redundant_engagement_removal_enabled", false, rey.j);
        V = c("measurement.collection.log_event_and_bundle_v2", true, rey.k);
        W = a("measurement.quality.checksum", false);
        X = c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, rey.l);
        Y = c("measurement.audience.refresh_event_count_filters_timestamp", false, rey.n);
        Z = c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, rey.o);
        aa = c("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, rey.p);
        ab = c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, rey.q);
        ac = c("measurement.sdk.collection.enable_extend_user_property_size", true, rey.r);
        ad = c("measurement.upload.file_lock_state_check", true, rey.t);
        ae = c("measurement.ga.ga_app_id", false, rey.u);
        af = c("measurement.lifecycle.app_in_background_parameter", false, rez.b);
        ag = c("measurement.integration.disable_firebase_instance_id", false, rez.a);
        ah = c("measurement.lifecycle.app_backgrounded_engagement", false, rez.d);
        ai = c("measurement.collection.service.update_with_analytics_fix", false, rez.e);
        aj = c("measurement.client.firebase_feature_rollout.v1.enable", true, rez.f);
        ak = c("measurement.client.sessions.check_on_reset_and_enable2", true, rez.g);
        al = c("measurement.scheduler.task_thread.cleanup_on_exit", false, rez.h);
        am = c("measurement.upload.file_truncate_fix", false, rez.i);
        c("measurement.collection.synthetic_data_mitigation", false, rez.k);
        an = c("measurement.androidId.delete_feature", true, rez.l);
        ao = c("measurement.service.storage_consent_support_version", 203600, rez.m);
        ap = c("measurement.client.properties.non_null_origin", true, rez.o);
        c("measurement.client.click_identifier_control.dev", false, rez.p);
        c("measurement.service.click_identifier_control", false, rez.q);
        aq = c("measurement.config.persist_last_modified", true, rez.r);
        ar = c("measurement.client.consent.suppress_1p_in_ga4f_install", true, rez.s);
        as = c("measurement.client.consent.gmpappid_worker_thread_fix", true, rez.t);
        at = c("measurement.module.pixie.ees", true, rez.u);
        au = c("measurement.module.pixie.fix_array", true, rfa.a);
        c("measurement.euid.client.dev", false, rfa.c);
        c("measurement.euid.service", false, rfa.e);
        av = c("measurement.adid_zero.service", false, rfa.f);
        aw = c("measurement.adid_zero.remove_lair_if_adidzero_false", true, rfa.g);
        c("measurement.adid_zero.adid_uid", false, rfa.h);
        ax = c("measurement.service.refactor.package_side_screen", true, rfa.i);
        ay = c("measurement.config.fix_feature_flags_from_config", true, rfa.j);
    }

    static rfc a(String str, Object obj) {
        return c(str, obj, null);
    }

    public static Map b(Context context) {
        uuy a2 = uuy.a(context.getContentResolver(), uvg.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.c();
    }

    static rfc c(String str, Object obj, rfb rfbVar) {
        rfc rfcVar = new rfc(str, obj, rfbVar);
        a.add(rfcVar);
        return rfcVar;
    }
}
