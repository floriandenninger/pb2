package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axsy implements axsx {
    public static final uxe a;
    public static final uxe b;
    public static final uxe c;
    public static final uxe d;
    public static final uxe e;
    public static final uxe f;

    static {
        uxj f2 = new uxj("com.google.android.libraries.consentverifier").f();
        a = f2.d("CollectionBasisVerifierFeatures__enable_all_features", true);
        b = f2.d("CollectionBasisVerifierFeatures__enable_logging", false);
        c = f2.d("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false);
        d = f2.b("CollectionBasisVerifierFeatures__failure_log_cooldown_period_ms", 86400000L);
        e = f2.b("CollectionBasisVerifierFeatures__max_stack_trace_size", 1000L);
        f = f2.b("CollectionBasisVerifierFeatures__min_app_version_code_to_log", -1L);
        f2.d("CollectionBasisVerifierFeatures__use_packed_proto", true);
    }

    @Override // defpackage.axsx
    public final long a() {
        return ((Long) d.get()).longValue();
    }

    @Override // defpackage.axsx
    public final long b() {
        return ((Long) e.get()).longValue();
    }

    @Override // defpackage.axsx
    public final long c() {
        return ((Long) f.get()).longValue();
    }

    @Override // defpackage.axsx
    public final boolean d() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.axsx
    public final boolean e() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.axsx
    public final boolean f() {
        return ((Boolean) c.get()).booleanValue();
    }
}
