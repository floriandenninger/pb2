package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class owz implements owx {
    private final Context a;

    public owz(Context context) {
        this.a = context;
    }

    @Override // defpackage.owx
    public final owy a(String str, oww owwVar) {
        return new owy(this.a, str, owwVar);
    }

    @Override // defpackage.owx
    public final owy b(owt owtVar, oww owwVar) {
        if (!owt.a().equals(owtVar)) {
            String valueOf = String.valueOf(owtVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("Only \"proto\" encoding is supported by firelog1p. Got: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return a("FCM_CLIENT_EVENT_LOGGING", owwVar);
    }
}
