package defpackage;

import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class phd extends Thread {
    private final Object a = new Object();
    private final LinkedList b = new LinkedList();
    private final LinkedList c = new LinkedList();
    private final phb[] d;
    private final phc[] e;
    private int f;
    private int g;
    private phb h;
    private Exception i;
    private boolean j;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: protected */
    public phd(phb[] phbVarArr, phc[] phcVarArr) {
        this.d = phbVarArr;
        this.f = phbVarArr.length;
        for (int i = 0; i < this.f; i++) {
            this.d[i] = a();
        }
        this.e = phcVarArr;
        this.g = phcVarArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.e[i2] = b();
        }
    }

    private final void e() {
        if (m()) {
            this.a.notify();
        }
    }

    private final void l() {
        Exception exc = this.i;
        if (exc != null) {
            throw exc;
        }
    }

    private final boolean m() {
        return !this.b.isEmpty() && this.g > 0;
    }

    protected abstract phb a();

    protected abstract phc b();

    protected abstract Exception c(phb phbVar, phc phcVar, boolean z);

    public void d() {
        synchronized (this.a) {
            this.k = true;
            this.a.notify();
        }
        try {
            join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final phb f() {
        synchronized (this.a) {
            l();
            opn.k(this.h == null);
            int i = this.f;
            if (i == 0) {
                return null;
            }
            phb[] phbVarArr = this.d;
            int i2 = i - 1;
            this.f = i2;
            phb phbVar = phbVarArr[i2];
            phbVar.reset();
            this.h = phbVar;
            return phbVar;
        }
    }

    public final phc g() {
        synchronized (this.a) {
            l();
            if (this.c.isEmpty()) {
                return null;
            }
            return (phc) this.c.removeFirst();
        }
    }

    public final void h() {
        synchronized (this.a) {
            this.j = true;
            phb phbVar = this.h;
            if (phbVar != null) {
                phb[] phbVarArr = this.d;
                int i = this.f;
                this.f = i + 1;
                phbVarArr[i] = phbVar;
                this.h = null;
            }
            while (!this.b.isEmpty()) {
                phb[] phbVarArr2 = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                phbVarArr2[i2] = (phb) this.b.removeFirst();
            }
            while (!this.c.isEmpty()) {
                ((phc) this.c.removeFirst()).release();
            }
        }
    }

    public final void i(phb phbVar) {
        synchronized (this.a) {
            l();
            opn.i(phbVar == this.h);
            this.b.addLast(phbVar);
            e();
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(phc phcVar) {
        synchronized (this.a) {
            phc[] phcVarArr = this.e;
            int i = this.g;
            this.g = i + 1;
            phcVarArr[i] = phcVar;
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i) {
        int i2 = 0;
        opn.k(this.f == this.d.length);
        while (true) {
            phb[] phbVarArr = this.d;
            if (i2 >= phbVarArr.length) {
                return;
            }
            phbVarArr[i2].a.b(i);
            i2++;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            synchronized (this.a) {
                while (!this.k && !m()) {
                    this.a.wait();
                }
                if (this.k) {
                    return;
                }
                phb phbVar = (phb) this.b.removeFirst();
                phc[] phcVarArr = this.e;
                int i = this.g - 1;
                this.g = i;
                phc phcVar = phcVarArr[i];
                boolean z = this.j;
                this.j = false;
                phcVar.reset();
                if (phbVar.getFlag(1)) {
                    phcVar.setFlag(1);
                } else {
                    if (phbVar.getFlag(2)) {
                        phcVar.setFlag(2);
                    }
                    Exception c = c(phbVar, phcVar, z);
                    this.i = c;
                    if (c != null) {
                        synchronized (this.a) {
                        }
                        return;
                    }
                }
                synchronized (this.a) {
                    if (!this.j && !phcVar.getFlag(2)) {
                        this.c.addLast(phcVar);
                        phb[] phbVarArr = this.d;
                        int i2 = this.f;
                        this.f = i2 + 1;
                        phbVarArr[i2] = phbVar;
                    }
                    phcVar.release();
                    phb[] phbVarArr2 = this.d;
                    int i22 = this.f;
                    this.f = i22 + 1;
                    phbVarArr2[i22] = phbVar;
                }
                throw new IllegalStateException(e);
            }
        }
    }
}
