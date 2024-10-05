package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rdr implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ rdt c;
    private final /* synthetic */ int d;

    public rdr(rdt rdtVar, String str, long j, int i) {
        this.d = i;
        this.c = rdtVar;
        this.a = str;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            rdt rdtVar = this.c;
            String str = this.a;
            long j = this.b;
            rdtVar.n();
            qip.ax(str);
            Integer num = (Integer) rdtVar.b.get(str);
            if (num != null) {
                rij o = rdtVar.k().o();
                int intValue = num.intValue() - 1;
                if (intValue == 0) {
                    rdtVar.b.remove(str);
                    Long l = (Long) rdtVar.a.get(str);
                    if (l == null) {
                        rdtVar.aF().c.a("First ad unit exposure time was never set");
                    } else {
                        long longValue = l.longValue();
                        rdtVar.a.remove(str);
                        rdtVar.d(str, j - longValue, o);
                    }
                    if (rdtVar.b.isEmpty()) {
                        long j2 = rdtVar.c;
                        if (j2 == 0) {
                            rdtVar.aF().c.a("First ad exposure time was never set");
                            return;
                        } else {
                            rdtVar.c(j - j2, o);
                            rdtVar.c = 0L;
                            return;
                        }
                    }
                    return;
                }
                rdtVar.b.put(str, Integer.valueOf(intValue));
                return;
            }
            rdtVar.aF().c.b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        rdt rdtVar2 = this.c;
        String str2 = this.a;
        long j3 = this.b;
        rdtVar2.n();
        qip.ax(str2);
        if (rdtVar2.b.isEmpty()) {
            rdtVar2.c = j3;
        }
        Integer num2 = (Integer) rdtVar2.b.get(str2);
        if (num2 != null) {
            rdtVar2.b.put(str2, Integer.valueOf(num2.intValue() + 1));
            return;
        }
        Map map = rdtVar2.b;
        if (((aeg) map).j >= 100) {
            rdtVar2.aF().f.a("Too many ads visible");
        } else {
            map.put(str2, 1);
            rdtVar2.a.put(str2, Long.valueOf(j3));
        }
    }
}
