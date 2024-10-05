package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agqw extends ailn {
    private final shf a;
    private final afhf b;

    public agqw(shf shfVar, afhf afhfVar) {
        shfVar.getClass();
        this.a = shfVar;
        afhfVar.getClass();
        this.b = afhfVar;
    }

    @Override // defpackage.ailn
    protected final void a(Uri uri, Header header, HttpResponse httpResponse) {
        aill a = aill.a(uri);
        if (a == null || uri.getQueryParameter("e") == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        String queryParameter = uri.getQueryParameter("e");
        if ((TextUtils.isEmpty(queryParameter) ? 0L : Long.parseLong(queryParameter)) < this.a.d()) {
            zga.l("Offline URL has expired. Not allowed to access content.");
            httpResponse.setStatusCode(403);
            return;
        }
        ailm a2 = ailm.a(header, a.d);
        String r = adyu.r(a.a, a.b, a.c, a.e);
        ate a3 = this.b.a();
        Uri uri2 = Uri.EMPTY;
        long j = a2.a;
        ath athVar = new ath(uri2, j, (a2.b - j) + 1, r);
        try {
            try {
                a3.h(athVar);
                try {
                    a3.j();
                } catch (IOException e) {
                    zga.n("IOException trying to close offline data source", e);
                }
                if (a2.b(httpResponse)) {
                    httpResponse.setEntity(new ailp(a3, athVar));
                }
            } catch (IOException unused) {
                zga.l("Offlined video not found on disk.");
                httpResponse.setStatusCode(404);
                try {
                    a3.j();
                } catch (IOException e2) {
                    zga.n("IOException trying to close offline data source", e2);
                }
            }
        } finally {
        }
    }
}
