package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alri implements Runnable {
    public final /* synthetic */ alrm a;
    public final /* synthetic */ long b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    private final /* synthetic */ int e;

    public /* synthetic */ alri(alrm alrmVar, long j, List list, List list2, int i) {
        this.e = i;
        this.a = alrmVar;
        this.b = j;
        this.c = list;
        this.d = list2;
    }

    public /* synthetic */ alri(alrm alrmVar, List list, List list2, long j, int i) {
        this.e = i;
        this.a = alrmVar;
        this.c = list;
        this.d = list2;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e != 0) {
            alrm alrmVar = this.a;
            List list = this.c;
            List list2 = this.d;
            long j = this.b;
            if (alrmVar.g.get()) {
                alrmVar.e(6, -6, null, null, null, null, null);
                return;
            }
            if (alrmVar.d.a() != null) {
                alrmVar.d.a().a();
                return;
            }
            alrmVar.e.addAll(list);
            alrmVar.f.addAll(list2);
            Long valueOf = Long.valueOf(j);
            alrmVar.e(5, 0, valueOf, valueOf, null, null, null);
            return;
        }
        alrm alrmVar2 = this.a;
        long j2 = this.b;
        List list3 = this.c;
        List list4 = this.d;
        long j3 = j2 / 3;
        long j4 = 0;
        int i = 0;
        while (i < 3) {
            j4 = Math.min(j2, j4 + j3);
            int i2 = i;
            alrmVar2.e(2, 0, Long.valueOf(j4), Long.valueOf(j2), null, null, null);
            SystemClock.sleep(alrm.a);
            int i3 = alrmVar2.c().b;
            if (i3 == 9 || i3 == 7 || i3 == 6) {
                return;
            } else {
                i = i2 + 1;
            }
        }
        alrmVar2.c.execute(new alri(alrmVar2, list3, list4, j2, 1));
    }
}
