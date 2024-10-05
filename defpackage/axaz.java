package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axaz implements axam {
    public final axaw a;
    public final axbb b;
    public UrlRequest c;
    private final String d;
    private final String e;
    private final awzx f;
    private final CronetEngine g;
    private final ExecutorService h;

    public axaz(String str, String str2, awzx awzxVar, CronetEngine cronetEngine, ExecutorService executorService, axaw axawVar, axbb axbbVar) {
        this.d = str;
        this.e = str2;
        this.f = awzxVar;
        this.g = cronetEngine;
        this.h = executorService;
        this.a = axawVar;
        this.b = axbbVar;
    }

    @Override // defpackage.axam
    public final anhy a() {
        UrlRequest.Builder newUrlRequestBuilder = this.g.newUrlRequestBuilder(this.d, this.a, this.h);
        newUrlRequestBuilder.setHttpMethod(this.e);
        for (String str : this.f.c()) {
            Iterator it = this.f.b(str).iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(str, (String) it.next());
            }
        }
        newUrlRequestBuilder.addHeader("Content-Type", "application/x-www-form-urlencoded");
        axbb axbbVar = this.b;
        newUrlRequestBuilder.addHeader("Content-Length", String.valueOf(axbbVar != null ? axbbVar.c : 0L));
        axbb axbbVar2 = this.b;
        if (axbbVar2 != null) {
            newUrlRequestBuilder.setUploadDataProvider(axbbVar2, this.h);
        }
        if (newUrlRequestBuilder instanceof ExperimentalUrlRequest.Builder) {
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) newUrlRequestBuilder;
            builder.setTrafficStatsTag(-1);
            builder.setTrafficStatsUid(-1);
        }
        this.c = newUrlRequestBuilder.build();
        this.h.execute(new axax(this, 0));
        return this.a.a;
    }

    @Override // defpackage.axam
    public final /* synthetic */ anhy b() {
        return awxr.f();
    }

    @Override // defpackage.axam
    public final awzu c() {
        return this.b.b;
    }

    @Override // defpackage.axam
    public final String e() {
        return this.d;
    }

    @Override // defpackage.axam
    public final void f() {
        if (this.c != null) {
            this.h.execute(new axax(this, 1));
        }
    }

    @Override // defpackage.axam
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.axam
    public final void j(final awxr awxrVar, final int i, final int i2) {
        final byte[] bArr = null;
        this.h.execute(new Runnable(awxrVar, i, i2, bArr) { // from class: axay
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ awxr d;

            @Override // java.lang.Runnable
            public final void run() {
                axaz axazVar = axaz.this;
                awxr awxrVar2 = this.d;
                int i3 = this.b;
                int i4 = this.c;
                axaw axawVar = axazVar.a;
                axawVar.b = axazVar;
                axawVar.c = awxrVar2;
                axbb axbbVar = axazVar.b;
                if (axbbVar != null) {
                    axbbVar.d = i3;
                    axbbVar.e = i4;
                    axbbVar.a = new axba(awxrVar2, axazVar, null);
                }
            }
        });
    }
}
