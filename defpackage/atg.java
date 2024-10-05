package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atg {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;
    public Object j;

    public atg() {
        this.c = 1;
        this.e = Collections.emptyMap();
        this.g = -1L;
    }

    public atg(ath athVar) {
        this.a = athVar.a;
        this.b = athVar.b;
        this.c = athVar.c;
        this.d = athVar.d;
        this.e = athVar.e;
        this.f = athVar.g;
        this.g = athVar.h;
        this.h = athVar.i;
        this.i = athVar.j;
        this.j = athVar.k;
    }

    public final ath a() {
        pse.j(this.a, "The uri must be set.");
        return new ath(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b(String str) {
        this.a = Uri.parse(str);
    }
}
