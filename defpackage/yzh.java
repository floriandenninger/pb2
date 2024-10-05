package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yzh implements Runnable {
    final /* synthetic */ yzi a;
    private final /* synthetic */ int b;

    public yzh(yzi yziVar, int i) {
        this.b = i;
        this.a = yziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            yzi yziVar = this.a;
            yjk.e();
            ArrayList<String> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long c = yziVar.d.c();
            yok b = yziVar.b.b();
            while (b.hasNext()) {
                owj owjVar = (owj) b.next();
                yzg yzgVar = (yzg) yziVar.a.get(owjVar.c);
                if (yzgVar == null) {
                    String valueOf = String.valueOf(owjVar.c);
                    zga.l(valueOf.length() != 0 ? "Missing task factory for task type: ".concat(valueOf) : new String("Missing task factory for task type: "));
                    arrayList.add(owjVar.c);
                } else {
                    yzgVar.a();
                    throw null;
                }
            }
            b.a();
            yziVar.b.d();
            try {
                for (String str : arrayList) {
                    String.format(Locale.US, "Removing task %s", str);
                    yziVar.b.n(str);
                }
                for (int i = 0; i < arrayList2.size(); i++) {
                    aone builder = ((owj) arrayList2.get(i)).toBuilder();
                    String.format(Locale.US, "Updating task %s", ((owj) builder.instance).c);
                    long j = ((owj) builder.instance).e + c;
                    builder.copyOnWrite();
                    owj owjVar2 = (owj) builder.instance;
                    owjVar2.b |= 2;
                    owjVar2.d = j;
                    owj owjVar3 = (owj) builder.build();
                    arrayList2.set(i, owjVar3);
                    yziVar.b.l(((owj) builder.instance).c, owjVar3);
                }
                yziVar.b.i();
                return;
            } finally {
                yziVar.b.f();
            }
        }
        yok b2 = this.a.b.b();
        while (b2.hasNext()) {
            owj owjVar4 = (owj) b2.next();
            yzi yziVar2 = this.a;
            long max = Math.max(owjVar4.d - yziVar2.d.c(), 0L);
            yzh yzhVar = new yzh(yziVar2, 0);
            if (owjVar4.e > 0) {
                String.format(Locale.US, "Scheduling task %s with ScheduledExecutorService for repeating execution.", owjVar4.c);
                yziVar2.c.scheduleAtFixedRate(yzhVar, max, owjVar4.e, TimeUnit.MILLISECONDS);
            } else {
                String.format(Locale.US, "Scheduling task %s with ScheduledExecutorService for one time execution.", owjVar4.c);
                yziVar2.c.schedule(yzhVar, max, TimeUnit.MILLISECONDS);
            }
        }
        b2.a();
    }
}
