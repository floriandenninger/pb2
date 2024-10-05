package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tfe {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final andq c;

    static {
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        b = currentTimeMillis;
        SystemClock.elapsedRealtime();
        aone createBuilder = andq.a.createBuilder();
        createBuilder.copyOnWrite();
        andq andqVar = (andq) createBuilder.instance;
        andqVar.b |= 2;
        andqVar.d = 0;
        createBuilder.copyOnWrite();
        andq andqVar2 = (andq) createBuilder.instance;
        andqVar2.b |= 4;
        andqVar2.e = 0;
        createBuilder.copyOnWrite();
        andq andqVar3 = (andq) createBuilder.instance;
        andqVar3.b |= 1;
        andqVar3.c = currentTimeMillis;
        c = (andq) createBuilder.build();
    }

    public static andp a() {
        aone createBuilder = andp.a.createBuilder();
        int andIncrement = a.getAndIncrement();
        createBuilder.copyOnWrite();
        andp andpVar = (andp) createBuilder.instance;
        andpVar.b |= 2;
        andpVar.d = andIncrement;
        andq andqVar = c;
        createBuilder.copyOnWrite();
        andp andpVar2 = (andp) createBuilder.instance;
        andqVar.getClass();
        andpVar2.c = andqVar;
        andpVar2.b |= 1;
        return (andp) createBuilder.build();
    }
}
