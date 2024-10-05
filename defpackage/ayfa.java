package defpackage;

import io.grpc.Status;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfa implements aygo {
    public final String a;
    public aylh b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final ayoj g;
    public boolean h;
    public Status i;
    public boolean j;
    public final ayet k;
    private final aybc l;
    private final InetSocketAddress m;
    private final String n;
    private final axzj o;
    private boolean p;
    private boolean q;

    public ayfa(ayet ayetVar, InetSocketAddress inetSocketAddress, String str, String str2, axzj axzjVar, Executor executor, int i, ayoj ayojVar) {
        inetSocketAddress.getClass();
        this.m = inetSocketAddress;
        this.l = aybc.a(getClass(), inetSocketAddress.toString());
        this.n = str;
        this.a = ayiu.i(str2);
        this.f = i;
        this.e = executor;
        this.k = ayetVar;
        this.g = ayojVar;
        axzh a = axzj.a();
        a.b(ayiq.a, aycy.PRIVACY_AND_INTEGRITY);
        a.b(ayiq.b, axzjVar);
        this.o = a.a();
    }

    public final void a(ayex ayexVar, Status status) {
        synchronized (this.c) {
            if (this.d.remove(ayexVar)) {
                boolean z = true;
                if (status.getCode() != Status.Code.CANCELLED && status.getCode() != Status.Code.DEADLINE_EXCEEDED) {
                    z = false;
                }
                ayexVar.p.f(status, z, new aycd());
                b();
            }
        }
    }

    final void b() {
        synchronized (this.c) {
            if (this.h && !this.q && this.d.size() == 0) {
                this.q = true;
                this.b.d();
            }
        }
    }

    @Override // defpackage.aybg
    public final aybc c() {
        return this.l;
    }

    @Override // defpackage.ayli
    public final Runnable d(aylh aylhVar) {
        this.b = aylhVar;
        synchronized (this.c) {
            this.j = true;
        }
        return new ayey(this);
    }

    @Override // defpackage.ayli
    public final void j(Status status) {
        synchronized (this.c) {
            if (this.h) {
                return;
            }
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                this.b.c(status);
                synchronized (this.c) {
                    this.h = true;
                    this.i = status;
                }
                b();
            }
        }
    }

    @Override // defpackage.ayli
    public final void k(Status status) {
        ArrayList arrayList;
        j(status);
        synchronized (this.c) {
            arrayList = new ArrayList(this.d);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((ayex) arrayList.get(i)).c(status);
        }
        b();
    }

    @Override // defpackage.aygg
    public final /* bridge */ /* synthetic */ aygd l(aych aychVar, aycd aycdVar, axzo axzoVar, ayep[] ayepVarArr) {
        aychVar.getClass();
        String str = aychVar.b;
        String concat = str.length() != 0 ? "/".concat(str) : new String("/");
        String str2 = this.n;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 8 + String.valueOf(concat).length());
        sb.append("https://");
        sb.append(str2);
        sb.append(concat);
        return new ayez(this, sb.toString(), aycdVar, aychVar, ayoa.m(ayepVarArr, this.o, aycdVar), axzoVar).a;
    }

    @Override // defpackage.aygo
    public final axzj m() {
        return this.o;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
