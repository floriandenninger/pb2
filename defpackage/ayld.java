package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayld extends ayio {
    public final aylc c;
    private static final ReferenceQueue d = new ReferenceQueue();
    private static final ConcurrentMap e = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(ayld.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayld(aybv aybvVar) {
        super(aybvVar);
        ReferenceQueue referenceQueue = d;
        ConcurrentMap concurrentMap = e;
        this.c = new aylc(this, aybvVar, referenceQueue, concurrentMap);
    }
}
