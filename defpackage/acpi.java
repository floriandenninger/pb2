package defpackage;

import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpi implements Runnable {
    final /* synthetic */ arpo a;
    final /* synthetic */ acpj b;
    final /* synthetic */ aone c;

    public acpi(acpj acpjVar, arpo arpoVar, aone aoneVar) {
        this.b = acpjVar;
        this.a = arpoVar;
        this.c = aoneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqjm b;
        acpj acpjVar = this.b;
        acpm acpmVar = acpjVar.b;
        if (acpmVar.f) {
            arpo arpoVar = this.a;
            if (!acpmVar.e.containsKey(arpoVar)) {
                b = aqjm.DELAYED_EVENT_TIER_DEFAULT;
            } else {
                b = aqjm.b(((Integer) acpmVar.e.get(arpoVar)).intValue());
            }
            aquo aquoVar = this.b.b.a;
            if ((aquoVar.b & 256) != 0 && aquoVar.g) {
                b = aqjm.DELAYED_EVENT_TIER_IMMEDIATE;
            }
            this.b.a.l(b, this.c);
        } else {
            acpjVar.a.k(this.c);
        }
        if (this.b.c.isPresent()) {
            ((Consumer) this.b.c.get()).accept((ovz) this.c.build());
        }
    }
}
