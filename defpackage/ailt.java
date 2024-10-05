package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ailt {
    final /* synthetic */ ailv a;
    private final Uri.Builder b;
    private final Set c = new HashSet();

    public ailt(ailv ailvVar, String str) {
        this.a = ailvVar;
        Uri.Builder scheme = new Uri.Builder().scheme("http");
        int localPort = ailvVar.e.getLocalPort();
        StringBuilder sb = new StringBuilder(21);
        sb.append("localhost:");
        sb.append(localPort);
        this.b = scheme.encodedAuthority(sb.toString()).path(str);
    }

    public final synchronized Uri a() {
        aima aimaVar;
        Uri.Builder builder;
        aimaVar = this.a.c;
        builder = this.b;
        return builder.appendQueryParameter("sig", aimaVar.a(builder.appendQueryParameter("sparams", TextUtils.join(",", this.c)).build())).build();
    }

    public final synchronized void b(String str, String str2) {
        amkq.N(!this.c.contains(str));
        Uri.Builder builder = this.b;
        if (str2 == null) {
            str2 = "";
        }
        builder.appendQueryParameter(str, str2);
        this.c.add(str);
    }

    public final void c(String str, long j) {
        b(str, Long.toString(j));
    }
}
