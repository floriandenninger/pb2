package defpackage;

import com.google.android.libraries.elements.interfaces.JSModuleCache;
import com.google.android.libraries.youtube.blocks.BlocksContainerVersionProvider;
import com.google.android.libraries.youtube.blocks.BlocksRuntimeProxy;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagh {
    public final aagm a;
    public final azrw b;
    public BlocksContainerVersionProvider c;
    private final ConcurrentHashMap d = new ConcurrentHashMap();
    private final amnv e = amkq.x(new amnv() { // from class: aagf
        @Override // defpackage.amnv
        public final Object get() {
            final aagh aaghVar = aagh.this;
            sgf.D();
            aaghVar.c = BlocksContainerVersionProvider.create();
            BlocksRuntimeProxy.setJsModuleCache((JSModuleCache) aaghVar.b.get());
            BlocksRuntimeProxy.setContainerVersionProvider(aaghVar.c);
            aaghVar.c.setPreloader(aaghVar.a.a());
            aaghVar.a.c().ax(new ayrs() { // from class: aagg
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    final aagh aaghVar2 = aagh.this;
                    aafx aafxVar = (aafx) obj;
                    amkq.O(aaghVar2.c != null, "ContainerVersionProvider not initialized");
                    Iterator it = aafxVar.d(awmq.b).iterator();
                    while (it.hasNext()) {
                        for (final awmr awmrVar : ((awmq) it.next()).c) {
                            int H = awxr.H(awmrVar.d);
                            if (H != 0 && H == 5) {
                                amkq.O(aaghVar2.c != null, "ContainerVersionProvider not initialized");
                                ynm.k(aafxVar.f(awmrVar.c), angq.a, lra.r, new ynl() { // from class: aage
                                    @Override // defpackage.ynl, defpackage.zfi
                                    public final void a(Object obj2) {
                                        aagh aaghVar3 = aagh.this;
                                        awmr awmrVar2 = awmrVar;
                                        try {
                                            awkz awkzVar = (awkz) aonm.parseFrom(awkz.a, (byte[]) obj2, aomw.b());
                                            int i = awkzVar.b;
                                            aaghVar3.c.setActiveContainerVersion(i, awkzVar.c, awmrVar2.b);
                                            Integer valueOf = Integer.valueOf(i);
                                            aaghVar3.a(valueOf).c(valueOf);
                                        } catch (Exception e) {
                                            throw new IllegalStateException("Exception while reading Blocks Container Manifest file from DataPush.", e);
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            });
            return null;
        }
    });

    public aagh(aagm aagmVar, azrw azrwVar) {
        this.a = aagmVar;
        this.b = azrwVar;
    }

    public final azrh a(Integer num) {
        return (azrh) ConcurrentMap.EL.computeIfAbsent(this.d, num, opb.o);
    }

    public final aypy b() {
        this.e.get();
        return a(385812508);
    }
}
