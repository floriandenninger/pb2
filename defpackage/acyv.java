package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyv implements adtu {
    private final /* synthetic */ int a;

    public acyv(int i) {
        this.a = i;
    }

    @Override // defpackage.adtu
    public final void i(ysq ysqVar) {
        if (this.a != 0) {
            return;
        }
        int i = ysqVar.a;
        if (i != 200) {
            String str = acyz.a;
            StringBuilder sb = new StringBuilder(61);
            sb.append("Error stopping YouTubeTV. Response status code is ");
            sb.append(i);
            zga.c(str, sb.toString());
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            zga.j(acyz.a, "Error waiting for the TV to stop the app", e);
        }
    }

    @Override // defpackage.adtu
    public final void a(IOException iOException) {
        if (this.a != 0) {
            zga.f(acwg.a, "Terminate request failed", iOException);
            return;
        }
        String str = acyz.a;
        String valueOf = String.valueOf(iOException);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Error stopping YouTubeTV.");
        sb.append(valueOf);
        zga.c(str, sb.toString());
    }
}
