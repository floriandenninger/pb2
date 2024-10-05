package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adny {
    public final /* synthetic */ adob a;

    public adny(adob adobVar) {
        this.a = adobVar;
    }

    public final void a(adfw adfwVar, int i) {
        zga.h(adob.a, String.format(Locale.US, "Found corresponding cloud screen %s for DIAL device %s", adfwVar, this.a.m));
        adob adobVar = this.a;
        adobVar.s = i + 1;
        adobVar.ao.e(11);
        this.a.as(adfwVar);
    }

    public final void b(int i, int i2, int i3) {
        adkw adkwVar;
        this.a.s = i3 + 1;
        if (i2 == 0) {
            adkwVar = adkw.LAUNCH_FAIL_DEVICE_BUSY;
        } else if (i2 == 2) {
            adkwVar = adkw.LAUNCH_FAIL_TIMEOUT;
        } else if (i2 != 3) {
            adkwVar = i2 != 4 ? adkw.UNKNOWN : adkw.NETWORK;
        } else {
            adkwVar = adkw.LAUNCH_FAIL_TIMEOUT;
        }
        zga.c(adob.a, String.format(Locale.US, "Could not find cloud screen corresponding to DIAL device %s, %s", this.a.m, adkwVar));
        atbi aH = adob.aH(i2);
        if (aH.equals(atbi.MDX_SESSION_DISCONNECT_REASON_NETWORK)) {
            this.a.ar(adkwVar, aH, 1);
        } else {
            this.a.ar(adkwVar, adob.aH(i2), Integer.valueOf(i));
        }
    }
}
