package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ytt extends yrw {
    protected final azrw a;
    protected final azrw b;
    protected final yty c;
    protected final whl d;
    private final boolean e;
    private final int f;
    private final int g;

    public ytt(ytu ytuVar) {
        this.a = ytuVar.a;
        this.b = ytuVar.c;
        yry yryVar = ytuVar.d;
        this.e = yryVar.d;
        this.f = yryVar.a;
        this.g = yryVar.b;
        if (!ytuVar.e) {
            synchronized (ytuVar) {
                if (!ytuVar.e) {
                    ytuVar.f = ytuVar.d.c ? new whl() : null;
                    ytuVar.e = true;
                }
            }
        }
        this.d = ytuVar.f;
        this.c = (yty) ytuVar.b.get();
    }

    @Override // defpackage.yrw
    public final ysq a(ysk yskVar) {
        String str = yskVar.a;
        owp a = ((zia) this.b.get()).a(str);
        String a2 = a.a(str);
        if (a2 == null) {
            String str2 = a.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21 + str.length());
            sb.append("Request blocked by ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            zga.l(sb.toString());
            throw new yvs(a);
        }
        if (this.d != null) {
            whl.z(a2);
        }
        ytz ytzVar = new ytz(this.f, this.g);
        ytq ytqVar = new ytq(ytzVar, this.e, this);
        UrlRequest.Builder newUrlRequestBuilder = ((CronetEngine) this.a.get()).newUrlRequestBuilder(a2, ytqVar, ytzVar);
        newUrlRequestBuilder.setHttpMethod(whl.A(yskVar.e));
        yse yseVar = yskVar.b;
        yty ytyVar = this.c;
        ArrayList arrayList = new ArrayList(yseVar.b.size());
        for (Map.Entry entry : yseVar.b) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), (String) entry.getValue()));
        }
        ytyVar.b(newUrlRequestBuilder, Collections.unmodifiableList(arrayList));
        ysi ysiVar = yskVar.c;
        if (ysiVar != null) {
            ByteBuffer b = ysiVar.b();
            newUrlRequestBuilder.setUploadDataProvider(b != null ? UploadDataProviders.create(b) : new ytr(ysiVar), ytzVar);
        }
        newUrlRequestBuilder.setPriority(yskVar.d);
        UrlRequest build = newUrlRequestBuilder.build();
        build.start();
        if (!ytzVar.c) {
            ytzVar.c(build, ytzVar.a + ytzVar.b);
        }
        while (!ytzVar.c) {
            ytzVar.c(build, ytzVar.b);
        }
        ytqVar.a();
        ytqVar.a();
        if (ytqVar.b) {
            return (ysq) ytqVar.c;
        }
        throw new IOException();
    }
}
