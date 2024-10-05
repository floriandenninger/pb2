package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjz implements Runnable, amih {
    public final amjc a;
    public final long b;
    public final AtomicReference c;
    public anhy d;
    int e = 0;
    private final UUID f;
    private final amjm g;

    public amjz(amjc amjcVar, UUID uuid, amjm amjmVar, amjx amjxVar, long j) {
        this.a = amjcVar;
        this.f = uuid;
        this.g = amjmVar;
        this.b = j;
        this.c = new AtomicReference(amjxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amjy a() {
        amjy amjyVar;
        int i;
        synchronized (this) {
            amjx amjxVar = (amjx) this.c.get();
            int i2 = amjxVar.d + 1;
            amjx[] amjxVarArr = new amjx[i2];
            while (amjxVar != null) {
                amjxVarArr[amjxVar.d] = amjxVar;
                amjxVar = amjxVar.e;
            }
            aone builder = this.g.toBuilder();
            SparseArray sparseArray = new SparseArray(i2);
            amjx amjxVar2 = null;
            for (int i3 = 0; i3 < i2; i3++) {
                amjx amjxVar3 = amjxVarArr[i3];
                Object g = amjxVar3.c.g(amiq.c);
                amim amimVar = g == null ? amim.a : new amim(1, g);
                if (amimVar.c == 1) {
                    ((amhv) amimVar.b).a();
                    if (amjxVar3.d != 0) {
                        amjxVar2 = amjxVar3;
                    }
                }
            }
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                amjx amjxVar4 = amjxVarArr[i5];
                int a = amjxVar4.a();
                if (amjxVar2 != null && (i = amjxVar2.d) != 0) {
                    a = amjxVar4.d == 0 ? i : amjxVar2 == amjxVar4 ? -1 : amjxVar4.a();
                }
                aone createBuilder = amik.a.createBuilder();
                String str = amjxVar4.a;
                createBuilder.copyOnWrite();
                amik amikVar = (amik) createBuilder.instance;
                str.getClass();
                amikVar.b |= 1;
                amikVar.c = str;
                int i6 = amjxVar4.d;
                createBuilder.copyOnWrite();
                amik amikVar2 = (amik) createBuilder.instance;
                amikVar2.b |= 2;
                amikVar2.d = i6;
                createBuilder.copyOnWrite();
                amik amikVar3 = (amik) createBuilder.instance;
                amikVar3.b |= 4;
                amikVar3.e = a;
                long j = amjxVar4.b;
                createBuilder.copyOnWrite();
                amik amikVar4 = (amik) createBuilder.instance;
                amikVar4.b |= 8;
                amikVar4.f = j;
                int i7 = amjxVar4.f;
                if (i7 != 0) {
                    amkq.N(true);
                    createBuilder.copyOnWrite();
                    amik amikVar5 = (amik) createBuilder.instance;
                    amikVar5.b |= 16;
                    amikVar5.g = 1073741823 & i7;
                    amkq.N(true);
                    boolean z = (1073741824 & i7) != 0;
                    createBuilder.copyOnWrite();
                    amik amikVar6 = (amik) createBuilder.instance;
                    amikVar6.b |= 64;
                    amikVar6.h = z;
                }
                amik amikVar7 = (amik) createBuilder.build();
                builder.copyOnWrite();
                amjm amjmVar = (amjm) builder.instance;
                amikVar7.getClass();
                aony aonyVar = amjmVar.e;
                if (!aonyVar.c()) {
                    amjmVar.e = aonm.mutableCopy(aonyVar);
                }
                amjmVar.e.add(amikVar7);
                sparseArray.append(amjxVar4.d, amjxVar4.c);
                if (!amjxVar4.c()) {
                    i4++;
                }
            }
            if (this.e != 0) {
                aone createBuilder2 = amhq.a.createBuilder();
                aone createBuilder3 = amhp.a.createBuilder();
                int i8 = this.e;
                createBuilder3.copyOnWrite();
                amhp amhpVar = (amhp) createBuilder3.instance;
                amhpVar.b |= 1;
                amhpVar.c = i8;
                amhp amhpVar2 = (amhp) createBuilder3.build();
                createBuilder2.copyOnWrite();
                amhq amhqVar = (amhq) createBuilder2.instance;
                amhpVar2.getClass();
                amhqVar.c = amhpVar2;
                amhqVar.b = 1 | amhqVar.b;
                amhq amhqVar2 = (amhq) createBuilder2.build();
                builder.copyOnWrite();
                amjm amjmVar2 = (amjm) builder.instance;
                amhqVar2.getClass();
                amjmVar2.h = amhqVar2;
                amjmVar2.b |= 16;
            }
            amjyVar = new amjy(amjxVarArr[0].a, this.f, this.b, (amjm) builder.build(), sparseArray, i4);
        }
        return amjyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amjc amjcVar = this.a;
        anhy anhyVar = this.d;
        amjy a = a();
        amkq.N(amjcVar.d.remove(a.b) != null);
        if (anhyVar.isCancelled()) {
            amhq amhqVar = a.d.h;
            if (amhqVar == null) {
                amhqVar = amhq.a;
            }
            long d = amjcVar.b.d() - a.c;
            aone builder = a.d.toBuilder();
            aone builder2 = amhqVar.toBuilder();
            aone createBuilder = amho.a.createBuilder();
            int i = a.f;
            createBuilder.copyOnWrite();
            amho amhoVar = (amho) createBuilder.instance;
            amhoVar.b |= 2;
            amhoVar.d = i;
            createBuilder.copyOnWrite();
            amho amhoVar2 = (amho) createBuilder.instance;
            amhoVar2.b = 1 | amhoVar2.b;
            amhoVar2.c = d;
            amho amhoVar3 = (amho) createBuilder.build();
            builder2.copyOnWrite();
            amhq amhqVar2 = (amhq) builder2.instance;
            amhoVar3.getClass();
            amhqVar2.d = amhoVar3;
            amhqVar2.b |= 2;
            amhq amhqVar3 = (amhq) builder2.build();
            builder.copyOnWrite();
            amjm amjmVar = (amjm) builder.instance;
            amhqVar3.getClass();
            amjmVar.h = amhqVar3;
            amjmVar.b |= 16;
            amjm amjmVar2 = (amjm) builder.build();
            int size = amjmVar2.e.size() - 1;
            Iterator it = amkq.aT(amjmVar2.e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                amik amikVar = (amik) it.next();
                int i2 = amikVar.b;
                if ((i2 & 16) == 0 && (i2 & 4) != 0) {
                    size = amikVar.d;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (size >= 0) {
                amik amikVar2 = (amik) amjmVar2.e.get(size);
                int i4 = (int) amikVar2.f;
                String valueOf = String.valueOf(amikVar2.c);
                String str = (amikVar2.b & 16) == 0 ? " (Timed Out)" : "";
                arrayList.add(new StackTraceElement("tk_trace", str.length() != 0 ? valueOf.concat(str) : new String(valueOf), "Started After", (i4 - i3) / 1000));
                size = ((amik) amjmVar2.e.get(size)).e;
                i3 = i4;
            }
            ((amxh) ((amxh) ((amxh) amjc.a.f()).h(new amjq(null, (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])))).i("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceTimeout", 263, "TraceManagerImpl.java")).v("Trace %s timed out after %d ms. Complete trace: %s", a.a, Long.valueOf(d), amjmVar2);
            amjcVar.d(amjmVar2, a.e, a.a);
            return;
        }
        try {
            anaf.W(anhyVar);
            long j = a.c;
            while (true) {
                long j2 = amjcVar.e.get();
                if (j <= j2) {
                    break;
                }
                if (amjcVar.e.compareAndSet(j2, 300000 + j)) {
                    long j3 = j - 2100000;
                    for (final amjz amjzVar : amjcVar.d.values()) {
                        if (amjzVar.b < j3) {
                            ania schedule = amjcVar.c.schedule(ajfg.f, 10L, TimeUnit.SECONDS);
                            amjzVar.getClass();
                            schedule.d(new Runnable() { // from class: amjb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    amjz.this.d.cancel(true);
                                }
                            }, angq.a);
                        }
                    }
                }
            }
            amjcVar.d(a.d, a.e, a.a);
        } catch (ExecutionException e) {
            ((amxh) ((amxh) ((amxh) amjc.a.f()).h(e.getCause())).i("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceComplete", 207, "TraceManagerImpl.java")).s("Trace %s failed collection", a.a);
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = a().a;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 18 + String.valueOf(str).length());
        sb.append("UnfinishedTrace@");
        sb.append(hexString);
        sb.append("[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
