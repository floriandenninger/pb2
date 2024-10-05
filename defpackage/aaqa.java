package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aaqa implements Runnable {
    public final /* synthetic */ aaqg a;
    public final /* synthetic */ aaqe b;
    private final /* synthetic */ int c;

    public /* synthetic */ aaqa(aaqg aaqgVar, aaqe aaqeVar, int i) {
        this.c = i;
        this.a = aaqgVar;
        this.b = aaqeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            aaqg aaqgVar = this.a;
            aaqe aaqeVar = this.b;
            aaqeVar.c.c("pcr");
            aahd aahdVar = aaqgVar.c;
            apxf apxfVar = aaqeVar.a.a.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahc.a(aahdVar, apxfVar);
            if (aaqgVar.d > 0) {
                aaqgVar.f.put(aaqeVar.a.c(), aaqgVar.b.schedule(new aaqa(aaqgVar, aaqeVar, 1), aaqgVar.d, TimeUnit.MILLISECONDS));
                return;
            }
            return;
        }
        this.a.e(this.b.a.c(), new TimeoutException());
    }
}
