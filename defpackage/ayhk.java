package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayhk implements ayli {
    public final aydh b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public aylh f;
    public Status h;
    private final Executor j;
    private aybr k;
    private long l;
    private final aybc i = aybc.a(ayhk.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();

    public ayhk(Executor executor, aydh aydhVar) {
        this.j = executor;
        this.b = aydhVar;
    }

    private final ayhj e(aybn aybnVar, ayep[] ayepVarArr) {
        int size;
        ayhj ayhjVar = new ayhj(this, aybnVar, ayepVarArr, null, null, null);
        this.g.add(ayhjVar);
        synchronized (this.a) {
            size = this.g.size();
        }
        if (size == 1) {
            this.b.c(this.c);
        }
        return ayhjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aybr aybrVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.k = aybrVar;
            this.l++;
            if (aybrVar != null && b()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ayhj ayhjVar = (ayhj) arrayList.get(i);
                    aybn aybnVar = ayhjVar.a;
                    aybm a = aybrVar.a();
                    axzo axzoVar = ayhjVar.a.a;
                    aygg b = ayiu.b(a, axzoVar.f());
                    if (b != null) {
                        Executor executor = this.j;
                        Executor executor2 = axzoVar.c;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        ayai a2 = ayhjVar.b.a();
                        try {
                            aybn aybnVar2 = ayhjVar.a;
                            aygd l = b.l(aybnVar2.c, aybnVar2.b, aybnVar2.a, ayhjVar.d);
                            ayhjVar.b.c(a2);
                            Runnable q = ayhjVar.q(l);
                            if (q != null) {
                                executor.execute(q);
                            }
                            arrayList2.add(ayhjVar);
                        } catch (Throwable th) {
                            ayhjVar.b.c(a2);
                            throw th;
                        }
                    }
                }
                synchronized (this.a) {
                    if (b()) {
                        this.g.removeAll(arrayList2);
                        if (this.g.isEmpty()) {
                            this.g = new LinkedHashSet();
                        }
                        if (!b()) {
                            this.b.c(this.d);
                            if (this.h != null && (runnable = this.e) != null) {
                                this.b.c(runnable);
                                this.e = null;
                            }
                        }
                        this.b.b();
                    }
                }
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.aybg
    public final aybc c() {
        return this.i;
    }

    @Override // defpackage.ayli
    public final Runnable d(aylh aylhVar) {
        throw null;
    }

    @Override // defpackage.ayli
    public final void j(Status status) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h != null) {
                return;
            }
            this.h = status;
            this.b.c(new ayhi(this));
            if (!b() && (runnable = this.e) != null) {
                this.b.c(runnable);
                this.e = null;
            }
            this.b.b();
        }
    }

    @Override // defpackage.ayli
    public final void k(Status status) {
        Collection<ayhj> collection;
        Runnable runnable;
        j(status);
        synchronized (this.a) {
            collection = this.g;
            runnable = this.e;
            this.e = null;
            if (!collection.isEmpty()) {
                this.g = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (ayhj ayhjVar : collection) {
                Runnable q = ayhjVar.q(new ayii(status, ayge.REFUSED, ayhjVar.d, null, null, null));
                if (q != null) {
                    q.run();
                }
            }
            this.b.execute(runnable);
        }
    }

    @Override // defpackage.aygg
    public final aygd l(aych aychVar, aycd aycdVar, axzo axzoVar, ayep[] ayepVarArr) {
        aygd ayiiVar;
        aydh aydhVar;
        try {
            aybn aybnVar = new aybn(aychVar, aycdVar, axzoVar);
            aybr aybrVar = null;
            long j = -1;
            while (true) {
                synchronized (this.a) {
                    Status status = this.h;
                    if (status == null) {
                        aybr aybrVar2 = this.k;
                        if (aybrVar2 != null) {
                            if (aybrVar != null && j == this.l) {
                                ayiiVar = e(aybnVar, ayepVarArr);
                                aydhVar = this.b;
                                break;
                            }
                            j = this.l;
                            aygg b = ayiu.b(aybrVar2.a(), axzoVar.f());
                            if (b != null) {
                                ayiiVar = b.l(aybnVar.c, aybnVar.b, aybnVar.a, ayepVarArr);
                                aydhVar = this.b;
                                break;
                            }
                            aybrVar = aybrVar2;
                        } else {
                            ayiiVar = e(aybnVar, ayepVarArr);
                            aydhVar = this.b;
                            break;
                        }
                    } else {
                        ayiiVar = new ayii(status, ayepVarArr, null, null, null);
                        aydhVar = this.b;
                        break;
                    }
                }
            }
            aydhVar.b();
            return ayiiVar;
        } catch (Throwable th) {
            this.b.b();
            throw th;
        }
    }
}
