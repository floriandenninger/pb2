package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vlw {
    private final amnp a;
    private final List b = new ArrayList();
    private final int c;

    public vlw(azrw azrwVar, int i) {
        this.a = (amnp) azrwVar.get();
        this.c = i;
    }

    public final aofh a() {
        aone createBuilder = aofh.a.createBuilder();
        createBuilder.L(this.b);
        aone createBuilder2 = aofj.a.createBuilder();
        int i = this.c;
        createBuilder2.copyOnWrite();
        aofj aofjVar = (aofj) createBuilder2.instance;
        aofjVar.c = i - 1;
        aofjVar.b |= 1;
        long a = this.a.a(TimeUnit.MICROSECONDS);
        createBuilder2.copyOnWrite();
        aofj aofjVar2 = (aofj) createBuilder2.instance;
        aofjVar2.b |= 2;
        aofjVar2.d = a;
        createBuilder.copyOnWrite();
        aofh aofhVar = (aofh) createBuilder.instance;
        aofj aofjVar3 = (aofj) createBuilder2.build();
        aofjVar3.getClass();
        aofhVar.d = aofjVar3;
        aofhVar.b |= 1;
        return (aofh) createBuilder.build();
    }

    public final aofi b() {
        amnp amnpVar = this.a;
        amnpVar.e();
        amnpVar.f();
        aone createBuilder = aofi.a.createBuilder();
        int i = this.c;
        createBuilder.copyOnWrite();
        aofi aofiVar = (aofi) createBuilder.instance;
        aofiVar.c = i - 1;
        aofiVar.b |= 1;
        return (aofi) createBuilder.build();
    }

    public final void c(aoff aoffVar) {
        this.b.add(aoffVar);
    }
}
