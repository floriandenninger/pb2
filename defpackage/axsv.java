package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axsv implements axsu {
    public static final uvr a;
    public static final uvr b;
    public static final uvr c;

    static {
        uvp a2 = new uvp(uvg.a("com.google.android.gms.auth_account")).a();
        a2.b("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        a2.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        a2.c("getTokenRefactor__account_manager_timeout_seconds", 20L);
        a2.c("getTokenRefactor__android_id_shift", 0L);
        a2.e("getTokenRefactor__authenticator_logic_improved", false);
        try {
            a = a2.f("getTokenRefactor__blocked_packages", (aors) aonm.parseFrom(aors.a, new byte[]{10, 19, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 118, 101, 110, 100, 105, 110, 103, 10, 32, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 109, 101, 101, 116, 105, 110, 103, 115, 10, 33, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 109, 101, 115, 115, 97, 103, 105, 110, 103}), axsr.c);
            a2.e("getTokenRefactor__chimera_get_token_evolved", true);
            a2.c("getTokenRefactor__clear_token_timeout_seconds", 20L);
            a2.c("getTokenRefactor__default_task_timeout_seconds", 20L);
            b = a2.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            c = a2.e("getTokenRefactor__gaul_token_api_evolved", false);
            a2.c("getTokenRefactor__get_token_timeout_seconds", 120L);
            a2.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            a2.b("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"getTokenRefactor__blocked_packages\"");
        }
    }

    @Override // defpackage.axsu
    public final aors a() {
        return (aors) a.c();
    }

    @Override // defpackage.axsu
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axsu
    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
