package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acuo implements acvj {
    private static final String a = zga.a("MDX.BaseBackgroundScanClient");
    private final acvm b;
    private boolean c;

    public acuo(acvm acvmVar) {
        this.b = acvmVar;
    }

    @Override // defpackage.acvj
    public void h() {
        this.c = true;
    }

    public final void rb() {
        if (!this.c) {
            zga.m(a, String.format(Locale.US, "Client %s attempted to notify configuration change when it hasn't been registered.", b()));
            return;
        }
        acvm acvmVar = this.b;
        String b = b();
        if (b.length() != 0) {
            "Client configuration changed: ".concat(b);
        }
        acvmVar.a.e("mdx_background_scanner", 0L, true, 0, null, acvs.j, false);
    }
}
