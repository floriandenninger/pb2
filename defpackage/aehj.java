package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aehj implements affn {
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    private final afeu b;
    private final afiy c;
    private final ExecutorService d;
    private final Function e;

    public aehj(afix afixVar, afeu afeuVar, afiw afiwVar, ExecutorService executorService, Function function) {
        this.b = afeuVar;
        this.d = executorService;
        this.e = function;
        this.c = afixVar.a(afiwVar, 6);
    }

    public static final void d(affl afflVar, int i, atr atrVar) {
        aone createBuilder = aegq.a.createBuilder();
        createBuilder.copyOnWrite();
        aegq aegqVar = (aegq) createBuilder.instance;
        aegqVar.b |= 1;
        aegqVar.c = i;
        int k = atrVar.k();
        createBuilder.copyOnWrite();
        aegq aegqVar2 = (aegq) createBuilder.instance;
        aegqVar2.b |= 2;
        aegqVar2.d = k;
        Map a = atrVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a.entrySet()) {
            for (String str : (List) entry.getValue()) {
                aone createBuilder2 = aegl.a.createBuilder();
                String str2 = (String) entry.getKey();
                createBuilder2.copyOnWrite();
                aegl aeglVar = (aegl) createBuilder2.instance;
                str2.getClass();
                aeglVar.b |= 1;
                aeglVar.c = str2;
                createBuilder2.copyOnWrite();
                aegl aeglVar2 = (aegl) createBuilder2.instance;
                str.getClass();
                aeglVar2.b |= 2;
                aeglVar2.d = str;
                arrayList.add((aegl) createBuilder2.build());
            }
        }
        createBuilder.copyOnWrite();
        aegq aegqVar3 = (aegq) createBuilder.instance;
        aony aonyVar = aegqVar3.e;
        if (!aonyVar.c()) {
            aegqVar3.e = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) arrayList, (List) aegqVar3.e);
        try {
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public static final void e(affl afflVar, int i, afih afihVar) {
        aone createBuilder = aego.a.createBuilder();
        createBuilder.copyOnWrite();
        aego aegoVar = (aego) createBuilder.instance;
        aegoVar.b |= 1;
        aegoVar.c = i;
        adww b = afihVar.b();
        createBuilder.copyOnWrite();
        aego aegoVar2 = (aego) createBuilder.instance;
        b.getClass();
        aegoVar2.d = b;
        aegoVar2.b |= 2;
        try {
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    @Override // defpackage.affn
    public final aegg a(aegf aegfVar) {
        this.a.remove(Integer.valueOf(aegfVar.b));
        return aegg.a;
    }

    @Override // defpackage.affn
    public final aehl b(final aehk aehkVar) {
        final int i = aehkVar.b;
        int size = this.a.size();
        final affl afflVar = (affl) this.e.apply(aehkVar);
        if (size >= 12) {
            afid.e(afic.NET, "NetworkClient inProgressFetchIds size %d exceeds limit.", Integer.valueOf(size));
            afie afieVar = new afie("net", 0L);
            afieVar.b = "network queue full";
            afieVar.c = new Throwable();
            e(afflVar, i, afieVar.a());
            return aehl.a;
        }
        Set set = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!set.add(valueOf)) {
            afid.e(afic.NET, "Duplicated fetch ID in NetworkClient: %d", valueOf);
        }
        HashMap hashMap = new HashMap();
        for (aegl aeglVar : aehkVar.d) {
            hashMap.put(aeglVar.c, aeglVar.d);
        }
        atg atgVar = new atg();
        atgVar.b(aehkVar.c);
        atgVar.c = 2;
        atgVar.e = hashMap;
        atgVar.d = aehkVar.e.I();
        final ath a = atgVar.a();
        ate ateVar = this.c.a;
        afki.d(ateVar instanceof atr);
        final atr atrVar = (atr) ateVar;
        this.d.submit(new Runnable() { // from class: aehi
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0111, code lost:
            
                r5.a();
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
            
                if ((r5 instanceof defpackage.affl) != false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
            
                if ((r5 instanceof defpackage.affl) != false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0146, code lost:
            
                if ((r5 instanceof defpackage.affl) != false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0114, code lost:
            
                r0.a.remove(java.lang.Integer.valueOf(r3));
                defpackage.pts.N(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0120, code lost:
            
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 375
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aehi.run():void");
            }
        });
        return aehl.a;
    }

    public final afih c(IOException iOException) {
        return this.b.b(iOException);
    }
}
