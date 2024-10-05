package defpackage;

import com.google.protos.youtube.api.innertube.ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction;
import com.google.protos.youtube.api.innertube.ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aauf implements aaha {
    private final axpg a;
    private final /* synthetic */ int b;

    public aauf(axpg axpgVar, int i) {
        this.b = i;
        this.a = axpgVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.b == 0) {
            ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction clearPersistentCacheActionOuterClass$ClearPersistentCacheAction = (ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction) apxfVar.pX(ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.clearPersistentCacheAction);
            if (clearPersistentCacheActionOuterClass$ClearPersistentCacheAction.b != 2 || !((Boolean) clearPersistentCacheActionOuterClass$ClearPersistentCacheAction.c).booleanValue()) {
                ((aadd) this.a.get()).a(clearPersistentCacheActionOuterClass$ClearPersistentCacheAction.b == 1 ? (String) clearPersistentCacheActionOuterClass$ClearPersistentCacheAction.c : "");
                return;
            } else {
                final aadd aaddVar = (aadd) this.a.get();
                aaddVar.b.execute(new Runnable() { // from class: aada
                    @Override // java.lang.Runnable
                    public final void run() {
                        aadd aaddVar2 = aadd.this;
                        synchronized (aaddVar2) {
                            aaddVar2.c = false;
                            aaddVar2.a.b();
                            aaddVar2.b();
                        }
                    }
                });
                return;
            }
        }
        ahzs ahzsVar = (ahzs) this.a.get();
        apxf apxfVar2 = ((ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand) apxfVar.pX(ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand.reelPrefetchWatchCommand)).b;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        ahzsVar.a(apxfVar2);
    }
}
