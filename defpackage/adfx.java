package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.mdx.model.AppStatus;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfx {
    public AppStatus a;
    public Uri b;
    public Uri c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public adgn j;
    private String k;
    private String l;
    private Long m;
    private Integer n;

    public adfx() {
    }

    public adfx(adfy adfyVar) {
        this.b = adfyVar.b;
        this.c = adfyVar.c;
        this.k = adfyVar.d;
        this.l = adfyVar.e;
        this.d = adfyVar.f;
        this.e = adfyVar.g;
        this.f = adfyVar.h;
        this.g = adfyVar.i;
        this.h = adfyVar.j;
        this.m = Long.valueOf(adfyVar.k);
        this.n = Integer.valueOf(adfyVar.l);
        this.i = adfyVar.m;
    }

    public final adfy a() {
        String str;
        Long l;
        String str2 = this.k;
        if (str2 == null || (str = this.l) == null || (l = this.m) == null || this.n == null || this.i == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.k == null) {
                sb.append(" deviceName");
            }
            if (this.l == null) {
                sb.append(" networkId");
            }
            if (this.m == null) {
                sb.append(" wakeOnLanTimeout");
            }
            if (this.n == null) {
                sb.append(" wakeOnLanStatusOnStarted");
            }
            if (this.i == 0) {
                sb.append(" cacheMethod");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        adfy adfyVar = new adfy(this.b, this.c, str2, str, this.d, this.e, this.f, this.g, this.h, l.longValue(), this.n.intValue(), this.i);
        AppStatus appStatus = this.a;
        appStatus.getClass();
        adfyVar.a = appStatus;
        adfyVar.n = this.j;
        return adfyVar;
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null deviceName");
        }
        this.k = str;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null networkId");
        }
        this.l = str;
    }

    public final void d(long j) {
        this.m = Long.valueOf(j);
    }

    public final void e(int i) {
        this.n = Integer.valueOf(i);
    }
}
