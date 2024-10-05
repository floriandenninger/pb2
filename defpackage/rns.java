package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rns {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("set_dimensions_api", 1L);
        a = feature;
        Feature feature2 = new Feature("get_serving_version_api", 1L);
        b = feature2;
        Feature feature3 = new Feature("get_experiment_tokens_api", 1L);
        c = feature3;
        Feature feature4 = new Feature("sync_after_api", 1L);
        d = feature4;
        e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
