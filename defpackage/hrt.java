package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrt {
    public Uri a;
    public Uri b;
    public atmc c;
    public String d;
    public Long e;
    public String f;
    public String g;
    public amru h;
    public awaf i;
    public String j;
    public String k;
    public int l;
    private avtn m;
    private Boolean n;
    private Boolean o;

    public final hru a() {
        int i;
        Uri uri;
        Boolean bool;
        avtn avtnVar = this.m;
        if (avtnVar == null || (i = this.l) == 0 || (uri = this.a) == null || (bool = this.n) == null || this.o == null) {
            StringBuilder sb = new StringBuilder();
            if (this.m == null) {
                sb.append(" uploadFlowSource");
            }
            if (this.l == 0) {
                sb.append(" uploadFlowFlavor");
            }
            if (this.a == null) {
                sb.append(" sourceUri");
            }
            if (this.n == null) {
                sb.append(" usesYTAudioSource");
            }
            if (this.o == null) {
                sb.append(" isShortsEligible");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new hru(avtnVar, i, uri, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, bool.booleanValue(), this.o.booleanValue(), this.j, this.k);
    }

    public final void b(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    public final void c(avtn avtnVar) {
        if (avtnVar == null) {
            throw new NullPointerException("Null uploadFlowSource");
        }
        this.m = avtnVar;
    }

    public final void d(boolean z) {
        this.n = Boolean.valueOf(z);
    }
}
