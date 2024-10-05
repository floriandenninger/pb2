package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class slc {
    private final skw a;
    private final Map b;
    private final skz c;
    private final sjw d;
    private final int e;
    private final int f;
    private final ArrayDeque g;

    public slc(skw skwVar, Map map, skz skzVar, sjw sjwVar, int i, int i2, ArrayDeque arrayDeque) {
        this.a = skwVar;
        this.b = map;
        this.c = skzVar;
        this.d = sjwVar;
        this.e = i;
        this.f = i2;
        this.g = arrayDeque;
    }

    public final void a(aone aoneVar) {
        boolean z;
        if ((((aorj) aoneVar.instance).b & 64) == 0) {
            aoneVar.copyOnWrite();
            aorj aorjVar = (aorj) aoneVar.instance;
            aorjVar.i = amkq.cd(2);
            aorjVar.b |= 64;
        }
        Throwable th = (Throwable) this.d.b.e(new Throwable());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int length = stringWriter2.length();
        long b = axsw.a.get().b();
        if (b < length && b >= 0) {
            length = (int) b;
        }
        String substring = stringWriter2.substring(0, length);
        aoneVar.copyOnWrite();
        aorj aorjVar2 = (aorj) aoneVar.instance;
        substring.getClass();
        aorjVar2.b |= 2048;
        aorjVar2.m = substring;
        aorj aorjVar3 = (aorj) aoneVar.build();
        Long valueOf = Long.valueOf(aorjVar3.e);
        int ce = amkq.ce(aorjVar3.i);
        slb slbVar = new slb(valueOf, ce != 0 ? ce : 2);
        long a = axsw.a.get().a();
        synchronized (this.b) {
            Long l = (Long) this.b.get(slbVar);
            long currentTimeMillis = System.currentTimeMillis();
            z = l == null || a <= 0 || l.longValue() + a < currentTimeMillis;
            if (z) {
                this.b.put(slbVar, Long.valueOf(currentTimeMillis));
            }
        }
        if (z) {
            this.c.a(aorjVar3);
        }
    }

    public final aone b(int i) {
        aone createBuilder = aorj.a.createBuilder();
        String packageName = this.d.a.getPackageName();
        createBuilder.copyOnWrite();
        aorj aorjVar = (aorj) createBuilder.instance;
        packageName.getClass();
        aorjVar.b |= 1;
        aorjVar.c = packageName;
        int a = this.a.a(this.d.a);
        createBuilder.copyOnWrite();
        aorj aorjVar2 = (aorj) createBuilder.instance;
        aorjVar2.b |= 2;
        aorjVar2.d = a;
        int i2 = this.e;
        createBuilder.copyOnWrite();
        aorj aorjVar3 = (aorj) createBuilder.instance;
        aorjVar3.b |= 4;
        aorjVar3.e = i2;
        createBuilder.copyOnWrite();
        aorj aorjVar4 = (aorj) createBuilder.instance;
        aorjVar4.b |= 8;
        aorjVar4.f = -2032180703L;
        int i3 = this.f;
        createBuilder.copyOnWrite();
        aorj aorjVar5 = (aorj) createBuilder.instance;
        aorjVar5.b |= 16;
        aorjVar5.g = i3;
        amrp f = amru.f();
        Iterator descendingIterator = this.g.descendingIterator();
        while (descendingIterator.hasNext()) {
            f.h(Long.valueOf(((skc) descendingIterator.next()).e));
        }
        amru g = f.g();
        createBuilder.copyOnWrite();
        aorj aorjVar6 = (aorj) createBuilder.instance;
        aorjVar6.a();
        aolo.addAll((Iterable) g, (List) aorjVar6.l);
        createBuilder.copyOnWrite();
        aorj aorjVar7 = (aorj) createBuilder.instance;
        aorjVar7.i = amkq.cd(i);
        aorjVar7.b |= 64;
        return createBuilder;
    }
}
