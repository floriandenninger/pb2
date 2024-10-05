package defpackage;

import java.util.ArrayDeque;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ata implements ast {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();
    private final asw[] e;
    private final asy[] f;
    private int g;
    private int h;
    private asw i;
    private asu j;
    private boolean k;
    private boolean l;
    private int m;

    /* JADX INFO: Access modifiers changed from: protected */
    public ata(asw[] aswVarArr, asy[] asyVarArr) {
        this.e = aswVarArr;
        this.g = aswVarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = i();
        }
        this.f = asyVarArr;
        this.h = asyVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = k();
        }
        asz aszVar = new asz(this);
        this.a = aszVar;
        aszVar.start();
    }

    private final void q() {
        if (t()) {
            this.b.notify();
        }
    }

    private final void r() {
        asu asuVar = this.j;
        if (asuVar != null) {
            throw asuVar;
        }
    }

    private final void s(asw aswVar) {
        aswVar.clear();
        asw[] aswVarArr = this.e;
        int i = this.g;
        this.g = i + 1;
        aswVarArr[i] = aswVar;
    }

    private final boolean t() {
        return !this.c.isEmpty() && this.h > 0;
    }

    @Override // defpackage.ast
    public void f() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected abstract asu g(Throwable th);

    protected abstract asu h(asw aswVar, asy asyVar, boolean z);

    protected abstract asw i();

    @Override // defpackage.ast
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final asw a() {
        asw aswVar;
        synchronized (this.b) {
            r();
            pse.g(this.i == null);
            int i = this.g;
            if (i == 0) {
                aswVar = null;
            } else {
                asw[] aswVarArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                aswVar = aswVarArr[i2];
            }
            this.i = aswVar;
        }
        return aswVar;
    }

    protected abstract asy k();

    @Override // defpackage.ast
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final asy b() {
        synchronized (this.b) {
            r();
            if (this.d.isEmpty()) {
                return null;
            }
            return (asy) this.d.removeFirst();
        }
    }

    @Override // defpackage.ast
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void e(asw aswVar) {
        synchronized (this.b) {
            r();
            pse.e(aswVar == this.i);
            this.c.addLast(aswVar);
            q();
            this.i = null;
        }
    }

    public final void n(asy asyVar) {
        synchronized (this.b) {
            asyVar.clear();
            asy[] asyVarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            asyVarArr[i] = asyVar;
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(int i) {
        pse.g(this.g == this.e.length);
        for (asw aswVar : this.e) {
            aswVar.b(i);
        }
    }

    public final boolean p() {
        asu g;
        synchronized (this.b) {
            while (!this.l && !t()) {
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            asw aswVar = (asw) this.c.removeFirst();
            asy[] asyVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            asy asyVar = asyVarArr[i];
            boolean z = this.k;
            this.k = false;
            if (aswVar.isEndOfStream()) {
                asyVar.addFlag(4);
            } else {
                if (aswVar.isDecodeOnly()) {
                    asyVar.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                }
                try {
                    g = h(aswVar, asyVar, z);
                } catch (OutOfMemoryError e) {
                    g = g(e);
                } catch (RuntimeException e2) {
                    g = g(e2);
                }
                if (g != null) {
                    synchronized (this.b) {
                        this.j = g;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    asyVar.release();
                } else if (asyVar.isDecodeOnly()) {
                    this.m++;
                    asyVar.release();
                } else {
                    asyVar.skippedOutputBufferCount = this.m;
                    this.m = 0;
                    this.d.addLast(asyVar);
                }
                s(aswVar);
            }
            return true;
        }
    }

    @Override // defpackage.ast
    public final void d() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            asw aswVar = this.i;
            if (aswVar != null) {
                s(aswVar);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                s((asw) this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                ((asy) this.d.removeFirst()).release();
            }
        }
    }
}
