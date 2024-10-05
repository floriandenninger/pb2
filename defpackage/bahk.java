package defpackage;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bahk implements bahy {
    final /* synthetic */ bahx a;
    private final /* synthetic */ int b;

    public bahk(bahx bahxVar, int i) {
        this.b = i;
        this.a = bahxVar;
    }

    @Override // defpackage.bahy
    public final void a() {
        List list;
        int i = this.b;
        if (i == 0) {
            this.a.j.close();
            return;
        }
        if (i != 1) {
            if (this.a.g.get() == 8) {
                return;
            }
            URL url = new URL(this.a.m);
            HttpURLConnection httpURLConnection = this.a.q;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.a.q = null;
            }
            this.a.q = (HttpURLConnection) url.openConnection();
            this.a.q.setInstanceFollowRedirects(false);
            if (!this.a.e.containsKey("User-Agent")) {
                bahx bahxVar = this.a;
                bahxVar.e.put("User-Agent", bahxVar.d);
            }
            for (Map.Entry entry : this.a.e.entrySet()) {
                this.a.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            bahx bahxVar2 = this.a;
            if (bahxVar2.i == null) {
                bahxVar2.i = "GET";
            }
            bahxVar2.q.setRequestMethod(bahxVar2.i);
            bahx bahxVar3 = this.a;
            baiq baiqVar = bahxVar3.j;
            if (baiqVar != null) {
                bahxVar3.r = new bahe(bahxVar3, bahxVar3.k, bahxVar3.c, bahxVar3.q, baiqVar);
                bahx bahxVar4 = this.a;
                bahe baheVar = bahxVar4.r;
                baheVar.a(new bahd(baheVar, bahxVar4.f.size() == 1, 0));
                return;
            }
            bahxVar3.l = 10;
            this.a.q.connect();
            this.a.k();
            return;
        }
        if (this.a.q == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = "http/1.1";
        int i2 = 0;
        while (true) {
            String headerFieldKey = this.a.q.getHeaderFieldKey(i2);
            if (headerFieldKey == null) {
                break;
            }
            if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                str = this.a.q.getHeaderField(i2);
            }
            if (!headerFieldKey.startsWith("X-Android")) {
                arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.a.q.getHeaderField(i2)));
            }
            i2++;
        }
        int responseCode = this.a.q.getResponseCode();
        bahx bahxVar5 = this.a;
        bahxVar5.o = new baij(new ArrayList(bahxVar5.f), responseCode, this.a.q.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0L);
        if (responseCode < 300 || responseCode >= 400 || (list = (List) this.a.o.getAllHeaders().get("location")) == null) {
            this.a.i();
            if (responseCode >= 400) {
                InputStream errorStream = this.a.q.getErrorStream();
                this.a.n = errorStream == null ? null : bagt.a(errorStream);
                this.a.b.b();
                return;
            }
            bahx bahxVar6 = this.a;
            bahxVar6.n = bagt.a(bahxVar6.q.getInputStream());
            this.a.b.b();
            return;
        }
        bahx bahxVar7 = this.a;
        bahxVar7.m(1, 2, new bahm(bahxVar7, (String) list.get(0)));
    }
}
