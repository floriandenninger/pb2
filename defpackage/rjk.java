package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rjk extends rka {
    public final rfz a;
    public final rfz b;
    public final rfz c;
    public final rfz d;
    public final rfz e;
    private String f;
    private boolean g;
    private long h;

    public rjk(rki rkiVar) {
        super(rkiVar);
        rgc M = M();
        M.getClass();
        this.a = new rfz(M, "last_delete_stale", 0L);
        rgc M2 = M();
        M2.getClass();
        this.b = new rfz(M2, "backoff", 0L);
        rgc M3 = M();
        M3.getClass();
        this.c = new rfz(M3, "last_upload", 0L);
        rgc M4 = M();
        M4.getClass();
        this.d = new rfz(M4, "last_upload_attempt", 0L);
        rgc M5 = M();
        M5.getClass();
        this.e = new rfz(M5, "midnight_offset", 0L);
    }

    @Deprecated
    final Pair a(String str) {
        n();
        Q();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = this.f;
        if (str2 == null || elapsedRealtime >= this.h) {
            this.h = elapsedRealtime + J().g(str);
            try {
                pvg a = pvh.a(I());
                this.f = "";
                String str3 = a.a;
                if (str3 != null) {
                    this.f = str3;
                }
                this.g = a.b;
            } catch (Exception e) {
                aF().j.b("Unable to get advertising id", e);
                this.f = "";
            }
            return new Pair(this.f, Boolean.valueOf(this.g));
        }
        return new Pair(str2, Boolean.valueOf(this.g));
    }

    @Override // defpackage.rka
    protected final void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair c(String str, ren renVar) {
        if (renVar.g()) {
            return a(str);
        }
        return new Pair("", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final String d(String str) {
        n();
        String str2 = (String) a(str).first;
        MessageDigest aw = rkm.aw();
        if (aw == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, aw.digest(str2.getBytes())));
    }
}
