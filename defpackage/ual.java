package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ual extends Exception {
    public ual(aokf aokfVar) {
        super(String.format(Locale.US, "Fetch disabled for FetchReason [%d].", Integer.valueOf(aokfVar.j)));
    }

    public ual(aokm aokmVar) {
        super(String.format(Locale.US, "Registration disabled for RegistrationReason [%d].", Integer.valueOf(aokmVar.l)));
    }
}
