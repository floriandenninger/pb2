package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sib extends anhf implements ania {
    public volatile ania a;

    public sib(anhy anhyVar, ania aniaVar) {
        super(anhyVar);
        this.a = aniaVar;
        anhyVar.d(new Runnable() { // from class: sia
            @Override // java.lang.Runnable
            public final void run() {
                sib.this.a.cancel(false);
            }
        }, angq.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
