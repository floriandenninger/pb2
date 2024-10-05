package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeid implements Runnable {
    private final ysy a;
    private final boolean b;
    private final int c;
    private int d;
    private final aeie e;

    public aeid(aeie aeieVar, ysy ysyVar, boolean z, int i) {
        afki.a(aeieVar);
        this.e = aeieVar;
        afki.a(ysyVar);
        this.a = ysyVar;
        this.d = 1;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long min;
        synchronized (this.e) {
            aeie aeieVar = this.e;
            if (!aeieVar.m) {
                aeieVar.r = false;
                return;
            }
            int a = this.a.a();
            if (a != this.d) {
                this.d = a;
                ArrayList arrayList = this.e.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aeib aeibVar = (aeib) arrayList.get(i);
                    aeibVar.c = 0L;
                    aeibVar.d = aeibVar.g.d.d();
                    if (this.b) {
                        aeibVar.e();
                    }
                }
                this.e.f.c();
            }
            if (this.b && this.c > 0) {
                ArrayList arrayList2 = this.e.j;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    aeib aeibVar2 = (aeib) arrayList2.get(i2);
                    if (this.e.d.d() - aeibVar2.b >= this.c * 1000) {
                        aeibVar2.e();
                    }
                }
            }
            if (!this.e.k.contains(Integer.valueOf(a)) || this.e.n.b()) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = this.e.j;
                int size3 = arrayList4.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    final aeib aeibVar3 = (aeib) arrayList4.get(i3);
                    long j = aeibVar3.d;
                    shf shfVar = this.e.d;
                    if (a != 2 && j - 3000 <= shfVar.d()) {
                        arrayList3.add(this.e.e.submit(new Runnable() { // from class: aeic
                            @Override // java.lang.Runnable
                            public final void run() {
                                aeie.f(aeib.this);
                            }
                        }));
                    }
                }
                int size4 = arrayList3.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    try {
                        ((Future) arrayList3.get(i4)).get();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        afsi.b(1, 8, "InterruptedException when attempting to open Bandaid connection.");
                    } catch (ExecutionException unused2) {
                        afsi.b(1, 8, "ExecutionException when attempting to open Bandaid connection.");
                    }
                }
                if (this.d == 2) {
                    min = 5000;
                } else {
                    ArrayList arrayList5 = this.e.j;
                    int size5 = arrayList5.size();
                    long j2 = Long.MAX_VALUE;
                    for (int i5 = 0; i5 < size5; i5++) {
                        j2 = Math.min(j2, ((aeib) arrayList5.get(i5)).d);
                    }
                    min = Math.min(j2 - this.e.d.d(), 5000L);
                }
            } else {
                min = 1000;
            }
            synchronized (this.e) {
                aeie aeieVar2 = this.e;
                if (aeieVar2.m) {
                    aeieVar2.e.schedule(this, min, TimeUnit.MILLISECONDS);
                } else {
                    aeieVar2.r = false;
                }
            }
        }
    }
}
