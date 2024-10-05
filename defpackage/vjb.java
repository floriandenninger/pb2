package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vjb {
    public final Object a;
    public final String b;
    public final viy[] c;
    Map d;
    public int e;
    private final vjd f;
    private boolean g = true;

    public vjb(String str, vjd vjdVar, viy... viyVarArr) {
        int length = viyVarArr.length;
        int i = length > 0 ? 10 : 1;
        this.b = str;
        this.c = viyVarArr;
        HashMap hashMap = new HashMap(i);
        this.d = hashMap;
        if (length == 0) {
            hashMap.put(vir.b, a());
        }
        this.e = 0;
        this.f = vjdVar;
        this.a = new Object();
    }

    public abstract vis a();

    public final void c() {
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(Object obj, vir virVar) {
        synchronized (this.a) {
            vis visVar = (vis) this.d.get(virVar);
            if (visVar == null) {
                visVar = a();
                this.d.put(virVar, visVar);
            }
            visVar.b(obj);
            this.e++;
        }
        vjc vjcVar = ((vje) this.f).a;
        if (vjcVar != null) {
            vjj vjjVar = (vjj) vjcVar;
            if (vjjVar.e) {
                if (vjjVar.c > 0 && vjjVar.f.incrementAndGet() >= vjjVar.c) {
                    synchronized (vjjVar.h) {
                        if (((vjj) vjcVar).f.get() >= ((vjj) vjcVar).c) {
                            synchronized (((vjj) vjcVar).h) {
                                ScheduledFuture scheduledFuture = ((vjj) vjcVar).g;
                                if (scheduledFuture != null && !scheduledFuture.isDone() && !((vjj) vjcVar).g.isCancelled()) {
                                    if (((vjj) vjcVar).g.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                        ((vjj) vjcVar).b();
                                        final vjj vjjVar2 = (vjj) vjcVar;
                                        ((vjj) vjcVar).g = ((vjj) vjcVar).a.schedule(new Runnable() { // from class: vji
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                vjj.this.c();
                                            }
                                        }, 1L, TimeUnit.MILLISECONDS);
                                    }
                                }
                                final vjj vjjVar3 = (vjj) vjcVar;
                                ((vjj) vjcVar).g = ((vjj) vjcVar).a.schedule(new Runnable() { // from class: vji
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        vjj.this.c();
                                    }
                                }, 1L, TimeUnit.MILLISECONDS);
                            }
                            return;
                        }
                    }
                }
                synchronized (vjjVar.h) {
                    ScheduledFuture scheduledFuture2 = ((vjj) vjcVar).g;
                    if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((vjj) vjcVar).g.isCancelled()) {
                        final vjj vjjVar4 = (vjj) vjcVar;
                        ((vjj) vjcVar).g = ((vjj) vjcVar).a.schedule(new Runnable() { // from class: vji
                            @Override // java.lang.Runnable
                            public final void run() {
                                vjj.this.c();
                            }
                        }, ((vjj) vjcVar).d, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Object... objArr) {
        amkq.E(this.c.length == objArr.length);
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (!this.c[i].b.isInstance(obj)) {
                        String str = this.b;
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(obj.getClass());
                        viy viyVar = this.c[i];
                        String str2 = viyVar.a;
                        String valueOf3 = String.valueOf(viyVar.b);
                        int length = str.length();
                        int length2 = String.valueOf(valueOf).length();
                        StringBuilder sb = new StringBuilder(length + 92 + length2 + String.valueOf(valueOf2).length() + str2.length() + String.valueOf(valueOf3).length());
                        sb.append("Streamz ");
                        sb.append(str);
                        sb.append(" has parameter {index: ");
                        sb.append(i);
                        sb.append(", value: ");
                        sb.append(valueOf);
                        sb.append(", type: ");
                        sb.append(valueOf2);
                        sb.append("}, but expected: {name: ");
                        sb.append(str2);
                        sb.append(", type: ");
                        sb.append(valueOf3);
                        sb.append("}");
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    String str3 = this.b;
                    String arrays = Arrays.toString(objArr);
                    StringBuilder sb2 = new StringBuilder(str3.length() + 29 + String.valueOf(arrays).length());
                    sb2.append("Streamz ");
                    sb2.append(str3);
                    sb2.append(" has null parameter: ");
                    sb2.append(arrays);
                    throw new NullPointerException(sb2.toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(viy... viyVarArr) {
        if (Arrays.equals(this.c, viyVarArr)) {
            return;
        }
        String str = this.b;
        String arrays = Arrays.toString(this.c);
        String arrays2 = Arrays.toString(viyVarArr);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 32 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append("Streamz ");
        sb.append(str);
        sb.append(" with field diffs: ");
        sb.append(arrays);
        sb.append(" and ");
        sb.append(arrays2);
        throw new vjh(sb.toString());
    }
}
