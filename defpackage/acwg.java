package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acwg implements acwk {
    public static final String a = zga.a("MDX.browserchannel");
    public final yrw b;
    public final acvu c;
    public final Uri d;
    public final Map e;
    public final boolean f;
    public volatile String g;
    public int h;
    public String i;
    public int j = 0;
    public int k;
    public boolean l;
    private final yrw m;
    private final azrw n;
    private final adkt o;
    private final Map p;
    private final boolean q;

    public acwg(String str, azrw azrwVar, adkt adktVar, Map map, Map map2, yrw yrwVar, yrw yrwVar2, boolean z, boolean z2) {
        Uri parse = Uri.parse(str);
        this.d = parse;
        Uri.parse(str.replace("bind", "test"));
        amkq.E(wbs.al(parse));
        azrwVar.getClass();
        this.n = azrwVar;
        this.o = adktVar;
        this.e = map;
        this.p = map2;
        this.b = yrwVar;
        this.m = yrwVar2;
        this.f = z;
        this.q = z2;
        this.k = 1;
        this.c = new acvu();
        this.l = false;
    }

    @Override // defpackage.acwk
    public final void a() {
        this.l = true;
        ((adtm) this.n.get()).c();
    }

    @Override // defpackage.acwk
    public final void b() {
        if (this.q) {
            this.o.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(Map map, adtu adtuVar) {
        Uri.Builder appendQueryParameter = this.d.buildUpon().appendQueryParameter("RID", String.valueOf(this.k)).appendQueryParameter("VER", "8").appendQueryParameter("CVER", "1");
        if (this.g != null) {
            appendQueryParameter.appendQueryParameter("SID", this.g);
        }
        String str = this.i;
        if (str != null) {
            appendQueryParameter.appendQueryParameter("gsessionid", str);
        }
        if (this.f && !this.l) {
            appendQueryParameter.appendQueryParameter("auth_failure_option", "send_error");
        }
        ysj c = ysk.c(appendQueryParameter.build().toString());
        d(c);
        c.b = ysi.d(map, "UTF-8");
        ysk a2 = c.a();
        String.format("Sending HTTP POST request: %s", a2);
        adyu.w(this.m, a2, new acwb(this, adtuVar));
    }

    public final void d(ysj ysjVar) {
        String b = ((adtm) this.n.get()).b();
        if (b != null) {
            ysjVar.c("Authorization", b.length() != 0 ? "Bearer ".concat(b) : new String("Bearer "));
        }
        String a2 = ((adtm) this.n.get()).a();
        if (a2 != null) {
            ysjVar.c("X-Goog-PageId", a2);
        }
        if (this.o.a() != null) {
            ysjVar.c("X-YouTube-LoungeId-Token", this.o.a().c);
        }
        for (Map.Entry entry : this.p.entrySet()) {
            ysjVar.c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final String toString() {
        String str = this.g;
        String str2 = this.i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length());
        sb.append("Session id: ");
        sb.append(str);
        sb.append(" GFE Session cookie: ");
        sb.append(str2);
        return sb.toString();
    }
}
