package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afsc implements afrz {
    protected final int a;
    private final aqje b;
    private final shf c;
    private final afsa d;
    private final Queue e = new ConcurrentLinkedQueue();
    private final ynn f;
    private final boolean g;
    private final double h;
    private Future i;

    public afsc(afqd afqdVar, shf shfVar, yoi yoiVar, ynn ynnVar) {
        this.b = afqdVar.f();
        this.a = afqdVar.c();
        this.c = shfVar;
        this.d = new afsa(yoiVar);
        this.f = ynnVar;
        this.g = afqdVar.k();
        this.h = afqdVar.a();
    }

    private final void i(String str, Exception exc) {
        zga.f("GEL_DELAYED_EVENT_DEBUG", str, exc);
        if (this.g) {
            String valueOf = String.valueOf(str);
            afsi.d(1, 12, valueOf.length() != 0 ? "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(valueOf) : new String("GEL_DELAYED_EVENT_MONITORING_ERROR "), exc, this.h);
        }
    }

    private final void j(aone aoneVar) {
        String uuid = UUID.randomUUID().toString();
        aoneVar.copyOnWrite();
        ovz ovzVar = (ovz) aoneVar.instance;
        ovz ovzVar2 = ovz.a;
        uuid.getClass();
        int i = ovzVar.b | 1;
        ovzVar.b = i;
        ovzVar.c = uuid;
        if ((i & 8) != 0) {
            return;
        }
        long c = this.c.c();
        aoneVar.copyOnWrite();
        ovz ovzVar3 = (ovz) aoneVar.instance;
        ovzVar3.b |= 8;
        ovzVar3.f = c;
    }

    private final boolean k(aone aoneVar) {
        int i = this.a;
        return i > 0 && ((ovz) aoneVar.build()).toByteArray().length > i;
    }

    @Override // defpackage.afrz
    public final synchronized yok a() {
        yjk.e();
        b();
        return this.d.b();
    }

    @Override // defpackage.afrz
    public final synchronized void b() {
        yjk.e();
        if (!this.e.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                aone aoneVar = (aone) this.e.poll();
                if (aoneVar != null) {
                    if (!k(aoneVar)) {
                        arrayList.add(yoe.a(((ovz) aoneVar.instance).c, aoneVar));
                    }
                } else {
                    try {
                        break;
                    } catch (RuntimeException e) {
                        i("Failed storing multiple delayed events when flushing buffer to disk.", e);
                    }
                }
            }
            afsa afsaVar = this.d;
            yjk.e();
            afsaVar.e(true);
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    afsaVar.h((yoe) it.next(), true);
                }
                afsaVar.j(true);
                afsaVar.g(true);
            } catch (Throwable th) {
                afsaVar.g(true);
                throw th;
            }
        }
        Future future = this.i;
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // defpackage.afrz
    public final synchronized void c(Set set) {
        yjk.e();
        this.d.d();
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ovz ovzVar = (ovz) ((aone) it.next()).instance;
                if ((ovzVar.b & 1) != 0) {
                    this.d.n(ovzVar.c);
                }
            }
            this.d.i();
        } finally {
            this.d.f();
        }
    }

    @Override // defpackage.afrz
    public final synchronized void d() {
        afsa afsaVar = this.d;
        yjk.e();
        SQLiteDatabase writableDatabase = afsaVar.a.getWritableDatabase();
        String str = afsaVar.b;
        writableDatabase.execSQL(str.length() != 0 ? "delete from ".concat(str) : new String("delete from "));
    }

    @Override // defpackage.afrz
    public final synchronized void e(List list) {
        yjk.e();
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j((aone) it.next());
        }
        this.e.addAll(list);
        h();
    }

    @Override // defpackage.afrz
    public final synchronized void f(aone aoneVar) {
        yjk.e();
        j(aoneVar);
        try {
            this.e.add(aoneVar);
        } catch (RuntimeException e) {
            String str = ((ovz) aoneVar.instance).d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("Could not add DelayedEvent of type");
            sb.append(str);
            sb.append(" to bufferQueue.");
            i(sb.toString(), e);
        }
        h();
    }

    @Override // defpackage.afrz
    public final synchronized void g(aone aoneVar) {
        j(aoneVar);
        if (k(aoneVar)) {
            return;
        }
        try {
            this.d.k(yoe.a(((ovz) aoneVar.instance).c, aoneVar), false);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(((ovz) aoneVar.instance).d);
            i(valueOf.length() != 0 ? "Failed to save DelayedEvent to disk with type: ".concat(valueOf) : new String("Failed to save DelayedEvent to disk with type: "), e);
        }
    }

    final void h() {
        if (!this.b.c) {
            b();
            return;
        }
        Future future = this.i;
        if (future == null || future.isDone()) {
            this.i = this.f.b(new afsb(this), this.b.e, TimeUnit.SECONDS);
        }
    }
}
