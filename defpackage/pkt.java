package defpackage;

import android.util.LruCache;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pkt extends LruCache {
    final /* synthetic */ pkv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkt(pkv pkvVar, int i) {
        super(i);
        this.a = pkvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void a(String str, pku pkuVar) {
        Long l;
        afic aficVar = afic.ABR;
        try {
            final pkj pkjVar = pkuVar.a;
            anhy R = anaf.R(new Runnable() { // from class: pks
                @Override // java.lang.Runnable
                public final void run() {
                    pkj.this.d();
                }
            }, this.a.c);
            aqvj aqvjVar = this.a.j.p.b.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45352574L)) {
                aoot aootVar = aqvjVar.b;
                if (aootVar.containsKey(45352574L)) {
                    aqvk aqvkVar = (aqvk) aootVar.get(45352574L);
                    l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                l = 0L;
            }
            int intValue = Long.valueOf(l.longValue()).intValue();
            if (intValue == 0) {
                intValue = 1000;
            }
            R.get(intValue, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            afid.c(afic.CODEC_REUSE, e, "Interrupted while releasing codec %s.", str);
            Thread.currentThread().interrupt();
            this.a.i.b(e);
        } catch (ExecutionException e2) {
            e = e2;
            afid.c(afic.CODEC_REUSE, e, "Failed while releasing codec %s.", str);
            this.a.i.b(e);
        } catch (TimeoutException e3) {
            e = e3;
            afid.c(afic.CODEC_REUSE, e, "Failed while releasing codec %s.", str);
            this.a.i.b(e);
        }
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        a((String) obj, (pku) obj2);
    }
}
