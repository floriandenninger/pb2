package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tvd {
    public final vcw a;
    private final Executor b;

    public tvd(Executor executor, vcw vcwVar) {
        this.b = executor;
        this.a = vcwVar;
    }

    public final anhy a(tva tvaVar, int i) {
        final Uri parse;
        if (i == 0) {
            parse = Uri.parse(tvaVar.b);
        } else if (i == 1) {
            parse = Uri.parse(tvaVar.c);
        } else if (i == 2) {
            parse = Uri.parse(tvaVar.d);
        } else {
            parse = Uri.parse(tvaVar.e);
        }
        return anaf.T(new anfy() { // from class: tvc
            @Override // defpackage.anfy
            public final anhy a() {
                tvd tvdVar = tvd.this;
                return anaf.O((InputStream) tvdVar.a.c(parse, veg.b()));
            }
        }, this.b);
    }
}
