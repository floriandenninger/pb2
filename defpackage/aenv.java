package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aenv {
    public final ysy a;
    public final ywr b;
    public final zgd c;
    public volatile boolean d;
    private final aaea e;
    private final ScheduledExecutorService f;

    public aenv(ysy ysyVar, ywr ywrVar, ScheduledExecutorService scheduledExecutorService, aaea aaeaVar) {
        aenu aenuVar = new aenu(this);
        this.c = aenuVar;
        this.d = false;
        this.a = ysyVar;
        this.b = ywrVar;
        this.f = scheduledExecutorService;
        this.e = aaeaVar;
        aenuVar.c(scheduledExecutorService);
    }

    public static /* synthetic */ void d() {
        afsi.e(1, 6, "Failed to persist persisted bandwidth samples.", 0.01d);
    }

    private final atuc e() {
        arfd a;
        aaea aaeaVar = this.e;
        if (aaeaVar == null || (a = aaeaVar.a()) == null) {
            return null;
        }
        atcl atclVar = a.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atuc atucVar = atclVar.g;
        return atucVar == null ? atuc.a : atucVar;
    }

    public final List a() {
        int i;
        ArrayList arrayList = new ArrayList();
        if (c()) {
            int a = this.a.a();
            synchronized (this) {
                Iterator it = ((ArrayDeque) this.c.get()).iterator();
                while (it.hasNext()) {
                    afik afikVar = (afik) it.next();
                    if (a == 2 || (i = afikVar.c) == 0 || i == a) {
                        arrayList.add(Long.valueOf(afikVar.b));
                    }
                }
            }
        }
        return arrayList;
    }

    public final void b(long j, long j2) {
        boolean z;
        atuc e = e();
        if (e == null) {
            return;
        }
        boolean z2 = e.b;
        int i = e.c;
        int i2 = e.d;
        if (!z2 || j2 <= 0 || j <= 0) {
            return;
        }
        aone createBuilder = afik.a.createBuilder();
        createBuilder.copyOnWrite();
        ((afik) createBuilder.instance).d = j;
        createBuilder.copyOnWrite();
        ((afik) createBuilder.instance).b = j2;
        createBuilder.copyOnWrite();
        ((afik) createBuilder.instance).c = 0;
        afik afikVar = (afik) createBuilder.build();
        synchronized (this) {
            z = !this.d;
            this.d = true;
            ArrayDeque arrayDeque = (ArrayDeque) this.c.get();
            arrayDeque.add(afikVar);
            while (arrayDeque.size() > i) {
                arrayDeque.pop();
            }
        }
        if (z) {
            try {
                this.f.schedule(new Runnable() { // from class: aent
                    @Override // java.lang.Runnable
                    public final void run() {
                        afik[] afikVarArr;
                        int i3;
                        aenv aenvVar = aenv.this;
                        int a = aenvVar.a.a();
                        synchronized (aenvVar) {
                            ArrayDeque arrayDeque2 = (ArrayDeque) aenvVar.c.get();
                            afikVarArr = (afik[]) arrayDeque2.toArray(new afik[arrayDeque2.size()]);
                            aenvVar.d = false;
                        }
                        ArrayList arrayList = new ArrayList(afikVarArr.length);
                        for (afik afikVar2 : afikVarArr) {
                            if (afikVar2.c == 0) {
                                aone builder = afikVar2.toBuilder();
                                builder.copyOnWrite();
                                ((afik) builder.instance).c = a;
                                arrayList.add((afik) builder.build());
                            } else {
                                arrayList.add(afikVar2);
                            }
                        }
                        ynm.m(aenvVar.b.b(new tni(arrayList, 8)), adha.r);
                    }
                }, i2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                afsi.c(2, 8, "Could not schedule the persisting of bandwidth samples.", e2);
                synchronized (this) {
                    this.d = false;
                }
            }
        }
    }

    public final boolean c() {
        atuc e = e();
        if (e != null) {
            return e.b;
        }
        return false;
    }
}
