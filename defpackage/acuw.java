package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acuw implements acvj {
    private static final String a = zga.a("MDX.BackgroundDeviceLogger");
    private static final int b = (int) TimeUnit.MINUTES.toSeconds(5);
    private static final int c = (int) TimeUnit.MINUTES.toSeconds(5);

    @Override // defpackage.acvj
    public final anhy a() {
        acvk a2 = acvl.a();
        a2.b(true);
        a2.c(10);
        a2.d(b);
        a2.e(c);
        return anaf.O(a2.a());
    }

    @Override // defpackage.acvj
    public final String b() {
        return "background-logger";
    }

    @Override // defpackage.acvj
    public final void c(amru amruVar) {
        zga.h(a, String.format(Locale.US, "discovered %d devices", Integer.valueOf(amruVar.size())));
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            String.format(Locale.US, "route: %s", ((bpv) amruVar.get(i)).d);
        }
    }

    @Override // defpackage.acvj
    public final void d() {
        zga.h(a, "wifi network disconnected");
    }

    @Override // defpackage.acvj
    public final void h() {
    }
}
