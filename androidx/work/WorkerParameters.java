package androidx.work;

import defpackage.byr;
import defpackage.byu;
import defpackage.bzm;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkerParameters {
    public UUID a;
    public byr b;
    public Set c;
    public int d;
    public Executor e;
    public bzm f;
    public byu g;

    public WorkerParameters(UUID uuid, byr byrVar, Collection collection, int i, Executor executor, bzm bzmVar, byu byuVar) {
        this.a = uuid;
        this.b = byrVar;
        this.c = new HashSet(collection);
        this.d = i;
        this.e = executor;
        this.f = bzmVar;
        this.g = byuVar;
    }
}
