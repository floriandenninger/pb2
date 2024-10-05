package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alad extends FilterInputStream {
    private final boolean a;
    private final long b;

    public alad(InputStream inputStream) {
        super(inputStream);
        this.a = false;
        this.b = -1L;
    }

    public long a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }

    public alad(InputStream inputStream, long j) {
        super(inputStream);
        amkq.E(j >= 0);
        this.a = true;
        this.b = j;
    }
}
