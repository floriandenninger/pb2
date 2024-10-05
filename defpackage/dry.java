package defpackage;

import android.os.SystemClock;
import java.util.Deque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dry implements Runnable {
    final /* synthetic */ Deque a;
    final /* synthetic */ boolean b;

    public dry(Deque deque, boolean z) {
        this.a = deque;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!this.a.isEmpty()) {
            dpo dpoVar = (dpo) this.a.pollFirst();
            boolean z = this.b;
            dpt dptVar = dpoVar.c;
            dpi dpiVar = dpoVar.b;
            boolean z2 = dpoVar.a;
            did didVar = dpoVar.d;
            if (dpiVar != null) {
                dptVar.m(dpiVar, z2, z, uptimeMillis, didVar, 0);
            }
        }
    }
}
