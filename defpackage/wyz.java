package defpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyz implements xlj {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public final wza b;

    public wyz(wza wzaVar) {
        this.b = wzaVar;
    }

    public final amnv a() {
        return new wyy(this);
    }

    public final String b() {
        String d = this.b.d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 22);
        sb.append("sdkv=");
        sb.append(d);
        sb.append("&output=xml_vast2");
        return new StringBuilder(sb.toString()).toString();
    }

    @Override // defpackage.xlj
    public final String c(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.xlj
    public final String d() {
        return this.b.b();
    }

    @Override // defpackage.xlj
    public final String e() {
        return this.b.c();
    }

    @Override // defpackage.xlj
    public final Map f() {
        adz adzVar = new adz(1);
        adzVar.put(e(), d());
        return adzVar;
    }
}
