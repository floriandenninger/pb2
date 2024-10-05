package defpackage;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxm implements oxk {
    public final oxn a;
    public final MediaFormat[][] c;
    public int f;
    private final Handler g;
    private final int[] h;
    public boolean d = false;
    public int e = 1;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public oxm(int i, int i2, int i3) {
        this.c = new MediaFormat[i];
        int[] iArr = new int[i];
        this.h = iArr;
        oxl oxlVar = new oxl(this);
        this.g = oxlVar;
        this.a = new oxn(oxlVar, this.d, iArr, i2, i3);
    }

    @Override // defpackage.oxk
    public final int a() {
        throw null;
    }

    @Override // defpackage.oxk
    public final int b(int i) {
        return this.h[i];
    }

    @Override // defpackage.oxk
    public final long c() {
        oxn oxnVar = this.a;
        return oxnVar.c.get() > 0 ? oxnVar.e : oxnVar.g / 1000;
    }

    @Override // defpackage.oxk
    public final long d() {
        oxn oxnVar = this.a;
        if (oxnVar.f == -1) {
            return -1L;
        }
        return oxnVar.f / 1000;
    }

    @Override // defpackage.oxk
    public final void e(oxj oxjVar) {
        this.b.add(oxjVar);
    }

    @Override // defpackage.oxk
    public final void f(oxi oxiVar, int i, Object obj) {
        this.a.a(oxiVar, i, obj);
    }

    @Override // defpackage.oxk
    public final void g(oyx... oyxVarArr) {
        Arrays.fill(this.c, (Object) null);
        this.a.a.obtainMessage(1, oyxVarArr).sendToTarget();
    }

    @Override // defpackage.oxk
    public final void h() {
        this.a.b();
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.oxk
    public final void i(oxj oxjVar) {
        this.b.remove(oxjVar);
    }

    @Override // defpackage.oxk
    public final void j(long j) {
        oxn oxnVar = this.a;
        oxnVar.e = j;
        oxnVar.c.incrementAndGet();
        oxnVar.a.obtainMessage(6, pgz.e(j), pgz.b(j)).sendToTarget();
    }

    @Override // defpackage.oxk
    public final void k(oxi oxiVar, int i, Object obj) {
        oxn oxnVar = this.a;
        oxnVar.d++;
        oxnVar.a.obtainMessage(9, i, 0, Pair.create(oxiVar, obj)).sendToTarget();
    }

    @Override // defpackage.oxk
    public final void l(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.f++;
            this.a.a.obtainMessage(3, z ? 1 : 0, 0).sendToTarget();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((oxj) it.next()).rD(z, this.e);
            }
        }
    }

    @Override // defpackage.oxk
    public final void m(int i, int i2) {
        int[] iArr = this.h;
        if (iArr[i] != i2) {
            iArr[i] = i2;
            this.a.a.obtainMessage(8, i, i2).sendToTarget();
        }
    }

    @Override // defpackage.oxk
    public final void n() {
        this.a.a.sendEmptyMessage(4);
    }

    @Override // defpackage.oxk
    public final boolean o() {
        throw null;
    }
}
