package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akdv implements anfy {
    final /* synthetic */ anhy a;
    final /* synthetic */ anhy b;
    final /* synthetic */ anhy c;
    final /* synthetic */ akdw d;

    public akdv(akdw akdwVar, anhy anhyVar, anhy anhyVar2, anhy anhyVar3) {
        this.d = akdwVar;
        this.a = anhyVar;
        this.b = anhyVar2;
        this.c = anhyVar3;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        try {
            akdy akdyVar = (akdy) anaf.W(this.a);
            akmq.g(akdyVar);
            akdyVar.b.size();
            if (akdyVar != null && !akdyVar.b.isEmpty()) {
                return anaf.O(akdyVar);
            }
        } catch (ExecutionException e) {
            if (!(e.getCause() instanceof TimeoutException)) {
                akmq.e("OnlineAndOnDeviceSuggestionSource: Error getting online suggestions.", e);
            }
        }
        final boolean z = false;
        try {
            akdy akdyVar2 = (akdy) anaf.W(this.b);
            akdyVar2.b.size();
            if (akdyVar2.b.size() >= this.d.a.b()) {
                z = this.d.a.l();
                if (this.d.a.k()) {
                    akmq.g(akdyVar2);
                    this.c.cancel(true);
                    return anaf.O(akdyVar2);
                }
            }
        } catch (ExecutionException e2) {
            akmq.e("OnlineAndOnDeviceSuggestionSource: Error getting on device suggestions.", e2);
        }
        return anfq.i(this.c, new anfz() { // from class: akdu
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                boolean z2 = z;
                akdy akdyVar3 = (akdy) obj;
                akmq.g(akdyVar3);
                if (akdyVar3 == null) {
                    return anaf.O(akdy.a);
                }
                if (z2) {
                    akdyVar3.c = true;
                }
                return anaf.O(akdyVar3);
            }
        }, this.d.d);
    }
}
