package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axsf implements axse {
    public static final uxe a;
    public static final uxe b;

    static {
        uxj f = new uxj("com.google.android.libraries.notifications").f();
        try {
            a = f.e("RegistrationFeature__disable_registration_by_reason", (ucu) aonm.parseFrom(ucu.b, new byte[]{8, 3}), uxf.e);
            b = f.d("RegistrationFeature__disable_registration_on_login_accounts_changed", true);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"RegistrationFeature__disable_registration_by_reason\"");
        }
    }

    @Override // defpackage.axse
    public final ucu a() {
        return (ucu) a.get();
    }

    @Override // defpackage.axse
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }
}
