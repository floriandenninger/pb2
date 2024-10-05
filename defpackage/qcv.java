package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qcv {
    public static final Feature a = new Feature("account_capability_api", 1);
    public static final Feature b;
    public static final Feature c;

    static {
        new Feature("account_data_service", 6L);
        new Feature("account_data_service_legacy", 1L);
        new Feature("account_data_service_token", 6L);
        new Feature("account_data_service_visibility", 1L);
        b = new Feature("google_auth_service_token", 3L);
        c = new Feature("google_auth_service_accounts", 2L);
        new Feature("work_account_client_is_whitelisted", 1L);
        new Feature("config_sync", 1L);
        new Feature("gaiaid_primary_email_api", 1L);
    }
}
