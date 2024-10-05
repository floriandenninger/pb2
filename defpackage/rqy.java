package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rqy {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature f;
    public static final Feature g;
    public static final Feature[] h;

    static {
        Feature feature = new Feature("wallet", 1L);
        a = feature;
        Feature feature2 = new Feature("wallet_biometric_auth_keys", 1L);
        b = feature2;
        Feature feature3 = new Feature("wallet_payment_dynamic_update", 2L);
        c = feature3;
        Feature feature4 = new Feature("wallet_1p_initialize_buyflow", 1L);
        d = feature4;
        Feature feature5 = new Feature("wallet_warm_up_ui_process", 1L);
        e = feature5;
        Feature feature6 = new Feature("wallet_get_setup_wizard_intent", 3L);
        f = feature6;
        Feature feature7 = new Feature("wallet_get_payment_card_recognition_intent", 1L);
        g = feature7;
        h = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7};
    }
}
