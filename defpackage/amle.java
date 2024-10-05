package defpackage;

import j$.util.Objects;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amle extends amkz {
    private static final Map a = Collections.emptyMap();
    private static final long serialVersionUID = 4556936364828217687L;
    private final Object b;
    private Map c;
    private amla d;

    protected amle() {
        this(null);
    }

    public static amle c(amla amlaVar) {
        amld amldVar = new amld();
        amldVar.a = amlaVar;
        return new amle(amldVar.a);
    }

    private final boolean d() {
        return this.c == null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    @Override // defpackage.amkz
    public final Map a() {
        Map map;
        synchronized (this.b) {
            if (d()) {
                synchronized (this.b) {
                    this.c = null;
                    this.d = null;
                    throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
                }
            }
            map = this.c;
            if (map == null) {
                throw new NullPointerException("requestMetadata");
            }
        }
        return map;
    }

    @Override // defpackage.amkz
    public final void b(Executor executor, aydj aydjVar) {
        synchronized (this.b) {
            if (d()) {
                executor.execute(new amky(this, aydjVar));
                return;
            }
            Map map = this.c;
            if (map != null) {
                aydjVar.a(map);
                return;
            }
            throw new NullPointerException("cached requestMetadata");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amle)) {
            return false;
        }
        amle amleVar = (amle) obj;
        return Objects.equals(this.c, amleVar.c) && Objects.equals(this.d, amleVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d);
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("requestMetadata", this.c);
        Y.b("temporaryAccess", this.d);
        return Y.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public amle(amla amlaVar) {
        this.b = new byte[0];
        if (amlaVar != null) {
            Map map = a;
            this.d = amlaVar;
            amrw h = amrz.h();
            String str = amlaVar.a;
            h.g("Authorization", Collections.singletonList(str.length() != 0 ? "Bearer ".concat(str) : new String("Bearer ")));
            h.i(map);
            this.c = h.c();
        }
    }
}
