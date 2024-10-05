package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ecw {
    public final ecy a;
    public final BlockingQueue c;
    public final String d;
    private final ExecutorService g;
    private final String h;
    public final LinkedHashMap b = new LinkedHashMap();
    public int f = 1;
    private final String i = "3";
    public final int e = 16;

    public ecw(String str, String str2, String str3, ecy ecyVar) {
        this.d = str;
        this.h = str2;
        this.a = ecyVar;
        a("v", "3");
        a("s", str2);
        this.c = new ArrayBlockingQueue(16);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new abqq(1, null));
        this.g = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new ecv(this));
    }

    public final void a(String str, String str2) {
        this.b.put(str, str2);
    }

    public final void b(edb edbVar) {
        this.c.offer(edbVar);
    }
}
