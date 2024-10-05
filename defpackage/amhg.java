package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amhg implements amir {
    public final amir a;
    public final UUID b;
    private final String c;

    public amhg(String str, UUID uuid) {
        str.getClass();
        this.c = str;
        this.a = null;
        this.b = uuid;
    }

    @Override // defpackage.amir
    public final amir a() {
        return this.a;
    }

    @Override // defpackage.amir
    public final String b() {
        return this.c;
    }

    @Override // defpackage.amir
    public final UUID c() {
        return this.b;
    }

    @Override // defpackage.amis, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        amjw.i(this);
    }

    public final String toString() {
        return amjw.g(this);
    }

    public amhg(String str, amir amirVar, amip amipVar) {
        str.getClass();
        this.c = str;
        this.a = amirVar;
        this.b = amirVar.c();
        amkq.E(amipVar.c);
    }

    public amhg(String str, UUID uuid, amip amipVar) {
        this(str, uuid);
        amkq.E(amipVar.c);
    }
}
