package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acyu implements adtu {
    final /* synthetic */ acyz a;
    final /* synthetic */ adny b;
    final /* synthetic */ adgn c;

    public acyu(acyz acyzVar, adgn adgnVar, adny adnyVar) {
        this.a = acyzVar;
        this.c = adgnVar;
        this.b = adnyVar;
    }

    @Override // defpackage.adtu
    public final void a(IOException iOException) {
        this.b.b(-1, 4, -1);
    }

    @Override // defpackage.adtu
    public final void i(ysq ysqVar) {
        int i = ysqVar.a;
        if (i < 200 || i >= 400) {
            if (i >= 400 && i < 500) {
                this.b.b(i, 2, -1);
                return;
            } else if (i >= 500) {
                this.b.b(i, 0, -1);
                return;
            } else {
                this.b.b(i, 5, -1);
                return;
            }
        }
        this.a.b.a(new acyx(-1, this.c, this.b));
        Uri parse = ysqVar.c.a("LOCATION") != null ? Uri.parse(ysqVar.c.a("LOCATION")) : null;
        Uri uri = (parse == null || parse.getHost() != null) ? parse : null;
        adny adnyVar = this.b;
        adnyVar.a.ao.e(5);
        String str = adob.a;
        String valueOf = String.valueOf(adnyVar.a.m);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("Successfully launched YouTube TV on DIAL device ");
        sb.append(valueOf);
        zga.h(str, sb.toString());
        adnyVar.a.l = uri;
    }
}
