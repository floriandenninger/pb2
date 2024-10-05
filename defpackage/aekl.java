package defpackage;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekl implements Runnable {
    public Future a;
    final /* synthetic */ aeks b;
    public aeky c;
    private final ArrayDeque d = new ArrayDeque();
    private final BlockingQueue e = new LinkedBlockingQueue();
    private boolean f = false;

    public aekl(aeks aeksVar) {
        this.b = aeksVar;
    }

    private final void b(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return;
            }
            if (!Thread.interrupted()) {
                Pair pair = (Pair) this.d.removeFirst();
                aelu aeluVar = (aelu) pair.first;
                int intValue = ((Integer) pair.second).intValue();
                int min = Math.min(intValue, length - i);
                this.b.m(aeluVar, bArr, i, min);
                i += min;
                if (min < intValue) {
                    if (aeluVar.k != aelu.a) {
                        aelt aeltVar = aeluVar.k;
                        aeluVar.k = aelt.a(aeltVar.a + min, aeltVar.b);
                    }
                    this.d.addFirst(new Pair(aeluVar, Integer.valueOf(intValue - min)));
                }
            } else {
                throw new InterruptedException();
            }
        }
    }

    public final void a(aelu aeluVar) {
        try {
            this.e.put(aeluVar);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                aelu aeluVar = (aelu) this.e.take();
                if (!aeluVar.equals(aeks.a)) {
                    aeks aeksVar = this.b;
                    if (aeksVar.p.c && aeluVar.h) {
                        byte[] bArr = aeluVar.b;
                        if (bArr.length == 0) {
                            aeksVar.m(aeluVar, bArr, 0, 0);
                        }
                    }
                    if (!aeluVar.g) {
                        if (!this.f) {
                            b(this.c.a());
                            this.f = true;
                        }
                        aeks aeksVar2 = this.b;
                        byte[] bArr2 = aeluVar.b;
                        aeksVar2.m(aeluVar, bArr2, 0, bArr2.length);
                    } else if (!this.f) {
                        this.d.addLast(new Pair(aeluVar, Integer.valueOf(aeluVar.b.length)));
                        aeky aekyVar = this.c;
                        b(aekyVar.a.update(aeluVar.b));
                    } else {
                        afsi.b(2, 8, "encrypted_data_after_clear_data");
                        this.b.n();
                        return;
                    }
                } else {
                    if (!this.f) {
                        b(this.c.a());
                        this.f = true;
                    }
                    this.b.n();
                    return;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
