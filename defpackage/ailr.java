package defpackage;

import android.net.Uri;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ailr extends ailn {
    public static final /* synthetic */ int a = 0;
    private final afhf b;

    public ailr(afhf afhfVar) {
        this.b = afhfVar;
    }

    @Override // defpackage.ailn
    protected final void a(Uri uri, Header header, HttpResponse httpResponse) {
        ath athVar;
        aill a2 = aill.a(uri);
        if (a2 == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        String queryParameter = uri.getQueryParameter("s");
        if (queryParameter == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        Uri parse = Uri.parse(queryParameter);
        ailm a3 = ailm.a(header, a2.d);
        String r = a3.c != -1 ? adyu.r(a2.a, a2.b, a2.c, a2.e) : null;
        if (a3.c == -1) {
            athVar = new ath(parse, a3.a, -1L, r, null);
        } else {
            long j = a3.a;
            athVar = new ath(parse, j, 1 + (a3.b - j), r, null);
        }
        ate a4 = this.b.a();
        if (a3.b(httpResponse)) {
            httpResponse.setEntity(new ailp(a4, athVar));
        }
    }
}
