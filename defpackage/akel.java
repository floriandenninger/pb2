package defpackage;

import android.text.TextUtils;
import j$.net.URLEncoder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akel implements akdm {
    String a;
    String b;
    String c;
    String d;
    public String e;
    boolean f;
    String g;
    String h;
    String i;
    String j;
    String k;
    long l;
    String m;
    String n;
    boolean q;
    String r;
    boolean s;
    int t;
    int u;
    public acsy v;
    int p = -1;
    long o = -1;

    public final akex a() {
        String concat;
        boolean z = !TextUtils.isEmpty(this.g);
        if (!TextUtils.isEmpty(this.e) || (!TextUtils.isEmpty(this.a) && !TextUtils.isEmpty(this.b) && this.d != null)) {
            if (!this.f || this.d.equals("")) {
                String str = this.e;
                if (str != null) {
                    concat = str.length() != 0 ? "https://suggestqueries.google.com".concat(str) : new String("https://suggestqueries.google.com");
                } else {
                    String valueOf = String.valueOf(String.format("&client=%s", this.a));
                    String valueOf2 = String.valueOf(valueOf.length() != 0 ? "https://suggestqueries.google.com/complete/search?ds=yt&oe=UTF-8&xssi=t".concat(valueOf) : new String("https://suggestqueries.google.com/complete/search?ds=yt&oe=UTF-8&xssi=t"));
                    String valueOf3 = String.valueOf(String.format("&hl=%s", this.b));
                    String concat2 = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                    if (!TextUtils.isEmpty(this.c)) {
                        String valueOf4 = String.valueOf(concat2);
                        String valueOf5 = String.valueOf(String.format("&gl=%s", this.c));
                        concat2 = valueOf5.length() != 0 ? valueOf4.concat(valueOf5) : new String(valueOf4);
                    }
                    String concat3 = String.valueOf(concat2).concat("&hjson=t");
                    if (!TextUtils.isEmpty(this.j)) {
                        String valueOf6 = String.valueOf(concat3);
                        String valueOf7 = String.valueOf(String.format("&sugexp=%s", this.j));
                        concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                    }
                    if (this.f) {
                        this.d = "";
                        concat3 = String.valueOf(concat3).concat("&gs_pcr=t");
                    }
                    if (!TextUtils.isEmpty(this.k)) {
                        String format = String.format("&pq=%s", this.k);
                        String format2 = String.format("&pq_sec=%s", Long.valueOf(this.l));
                        StringBuilder sb = new StringBuilder(String.valueOf(concat3).length() + String.valueOf(format).length() + String.valueOf(format2).length());
                        sb.append(concat3);
                        sb.append(format);
                        sb.append(format2);
                        concat3 = sb.toString();
                    }
                    if (!TextUtils.isEmpty(this.m)) {
                        String valueOf8 = String.valueOf(concat3);
                        String valueOf9 = String.valueOf(String.format("&video_id=%s", this.m));
                        concat3 = valueOf9.length() != 0 ? valueOf8.concat(valueOf9) : new String(valueOf8);
                    }
                    if (!TextUtils.isEmpty(this.n)) {
                        String valueOf10 = String.valueOf(concat3);
                        String valueOf11 = String.valueOf(String.format("&pvideo_id=%s", this.n));
                        concat3 = valueOf11.length() != 0 ? valueOf10.concat(valueOf11) : new String(valueOf10);
                        if (this.o >= 0) {
                            String valueOf12 = String.valueOf(concat3);
                            String valueOf13 = String.valueOf(String.format("&pvideo_sec=%s", Long.valueOf(this.o)));
                            concat3 = valueOf13.length() != 0 ? valueOf12.concat(valueOf13) : new String(valueOf12);
                        }
                    }
                    if (this.p >= 0) {
                        String valueOf14 = String.valueOf(concat3);
                        String valueOf15 = String.valueOf(String.format("&cp=%s", Integer.valueOf(this.p)));
                        concat3 = valueOf15.length() != 0 ? valueOf14.concat(valueOf15) : new String(valueOf14);
                    }
                    if (this.q) {
                        concat3 = String.valueOf(concat3).concat("&ytbolding=1");
                    }
                    if (!TextUtils.isEmpty(this.r)) {
                        String valueOf16 = String.valueOf(concat3);
                        String valueOf17 = String.valueOf(String.format("&hsid=%s", this.r));
                        concat3 = valueOf17.length() != 0 ? valueOf16.concat(valueOf17) : new String(valueOf16);
                    }
                    if (this.s) {
                        concat3 = String.valueOf(concat3).concat("&ytvs=1");
                        if (this.t >= 0) {
                            String valueOf18 = String.valueOf(concat3);
                            String valueOf19 = String.valueOf(String.format("&w=%s", Integer.valueOf(this.t)));
                            concat3 = valueOf19.length() != 0 ? valueOf18.concat(valueOf19) : new String(valueOf18);
                        }
                        if (this.u >= 0) {
                            String valueOf20 = String.valueOf(concat3);
                            String valueOf21 = String.valueOf(String.format("&h=%s", Integer.valueOf(this.u)));
                            concat3 = valueOf21.length() != 0 ? valueOf20.concat(valueOf21) : new String(valueOf20);
                        }
                    }
                    this.d = URLEncoder.encode(this.d, "UTF-8");
                    String valueOf22 = String.valueOf(concat3);
                    String valueOf23 = String.valueOf(String.format("&q=%s", this.d));
                    concat = valueOf23.length() != 0 ? valueOf22.concat(valueOf23) : new String(valueOf22);
                }
                akex akexVar = new akex(concat, this.r);
                akexVar.c = this.v;
                if (z) {
                    String valueOf24 = String.valueOf(this.g);
                    akexVar.t("Authorization", valueOf24.length() != 0 ? "Bearer ".concat(valueOf24) : new String("Bearer "));
                    if (!TextUtils.isEmpty(this.h)) {
                        akexVar.t("X-Goog-PageId", this.h);
                    }
                } else if (!TextUtils.isEmpty(this.i)) {
                    akexVar.t("X-Goog-Visitor-Id", this.i);
                }
                return akexVar;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.e);
    }

    @Override // defpackage.akdm
    public final acsy c() {
        return this.v;
    }

    public final void d(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    public final void e() {
        this.f = true;
    }

    public final void f() {
        this.s = true;
    }
}
