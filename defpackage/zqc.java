package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zqc {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final ArrayList b = new ArrayList();
    public zqb c;

    public final void a(String str) {
        axbm a = axbn.a();
        a.copyOnWrite();
        axbn.c((axbn) a.instance, str);
        axbn axbnVar = (axbn) a.build();
        axcl a2 = axcq.a();
        a2.copyOnWrite();
        ((axcq) a2.instance).r(axbnVar);
        this.a.add((axcq) a2.build());
    }

    public final void b(axdk axdkVar) {
        axcl a = axcq.a();
        a.copyOnWrite();
        ((axcq) a.instance).v(axdkVar);
        a.toString();
        this.a.add((axcq) a.build());
    }

    public final void c(long j, long j2, double d, axdq axdqVar) {
        aone createBuilder = axeq.a.createBuilder();
        createBuilder.copyOnWrite();
        axeq axeqVar = (axeq) createBuilder.instance;
        axeqVar.c = 1;
        axeqVar.b = 1;
        axeq axeqVar2 = (axeq) createBuilder.build();
        aone createBuilder2 = axer.a.createBuilder();
        createBuilder2.copyOnWrite();
        axer axerVar = (axer) createBuilder2.instance;
        axerVar.b = 1;
        axerVar.c = Double.valueOf(d);
        axer axerVar2 = (axer) createBuilder2.build();
        axdp b = axdr.b();
        b.copyOnWrite();
        axdr.f((axdr) b.instance, j);
        b.copyOnWrite();
        axdr.h((axdr) b.instance, j2);
        b.copyOnWrite();
        axdr.g((axdr) b.instance, axeqVar2);
        b.copyOnWrite();
        axdr.i((axdr) b.instance, axerVar2);
        b.copyOnWrite();
        axdr.j((axdr) b.instance, axdqVar);
        axdr axdrVar = (axdr) b.build();
        axcl a = axcq.a();
        a.copyOnWrite();
        ((axcq) a.instance).y(axdrVar);
        this.a.add((axcq) a.build());
    }
}
