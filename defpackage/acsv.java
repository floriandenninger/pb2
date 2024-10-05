package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acsv {
    public final boolean a;
    public final shf b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public acsv(boolean z, shf shfVar) {
        this.a = z;
        this.b = shfVar;
    }

    public static final String e(long j, long j2) {
        return String.valueOf(Long.toString(j - j2)).concat(" ms");
    }

    public final void a(String str) {
        if (this.a) {
            String valueOf = String.valueOf(str);
            zga.g(valueOf.length() != 0 ? "[DefaultLatencyLogger] ".concat(valueOf) : new String("[DefaultLatencyLogger] "));
        }
    }

    public final void b(String str, String str2) {
        if (this.a) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
            sb.append("<");
            sb.append(str);
            sb.append("> ");
            sb.append(str2);
            a(sb.toString());
        }
    }

    public final void c(String str) {
        if (this.a) {
            String valueOf = String.valueOf(str);
            a(valueOf.length() != 0 ? "Client Action Nonce is empty when calling ".concat(valueOf) : new String("Client Action Nonce is empty when calling "));
        }
    }

    public final long d(asmn asmnVar) {
        Long l = (Long) this.c.get(new hx(asmnVar, ""));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }
}
