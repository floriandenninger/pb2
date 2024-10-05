package defpackage;

import android.util.Pair;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izd {
    private final shf a;
    private final aaea b;
    private final LinkedList c = new LinkedList();

    public izd(shf shfVar, aaea aaeaVar) {
        this.a = shfVar;
        this.b = aaeaVar;
    }

    private final void d() {
        long c = this.a.c();
        while (this.c.peekLast() != null && ((Long) ((Pair) this.c.peekLast()).first).longValue() < c) {
            this.c.removeLast();
        }
    }

    public final synchronized void a(String str) {
        d();
        aone createBuilder = auix.a.createBuilder();
        createBuilder.copyOnWrite();
        auix auixVar = (auix) createBuilder.instance;
        str.getClass();
        auixVar.b = 1;
        auixVar.c = str;
        this.c.addFirst(new Pair(Long.valueOf(this.a.c() + TimeUnit.SECONDS.toMillis(evr.v(this.b))), (auix) createBuilder.build()));
    }

    public final synchronized void b(aomf aomfVar) {
        d();
        aone createBuilder = auix.a.createBuilder();
        aone createBuilder2 = auiy.a.createBuilder();
        createBuilder2.copyOnWrite();
        auiy auiyVar = (auiy) createBuilder2.instance;
        auiyVar.b |= 1;
        auiyVar.c = aomfVar;
        createBuilder.copyOnWrite();
        auix auixVar = (auix) createBuilder.instance;
        auiy auiyVar2 = (auiy) createBuilder2.build();
        auiyVar2.getClass();
        auixVar.c = auiyVar2;
        auixVar.b = 2;
        this.c.addFirst(new Pair(Long.valueOf(this.a.c() + TimeUnit.SECONDS.toMillis(evr.v(this.b))), (auix) createBuilder.build()));
    }

    public final synchronized auix[] c() {
        auix[] auixVarArr;
        d();
        int size = this.c.size();
        auixVarArr = new auix[size];
        for (int i = 0; i < size; i++) {
            auixVarArr[i] = (auix) ((Pair) this.c.get(i)).second;
        }
        return auixVarArr;
    }
}
