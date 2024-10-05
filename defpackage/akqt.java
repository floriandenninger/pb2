package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akqt implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ akqv b;
    final /* synthetic */ int c;
    final /* synthetic */ aund d;
    final /* synthetic */ aunc e;
    final /* synthetic */ amru f;
    final /* synthetic */ long g;
    final /* synthetic */ akqu h;

    public akqt(akqu akquVar, String str, akqv akqvVar, int i, aund aundVar, aunc auncVar, amru amruVar, long j) {
        this.h = akquVar;
        this.a = str;
        this.b = akqvVar;
        this.c = i;
        this.d = aundVar;
        this.e = auncVar;
        this.f = amruVar;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aune a = aunf.a();
        String str = this.a;
        a.copyOnWrite();
        aunf.c((aunf) a.instance, str);
        long j = this.b.d;
        a.copyOnWrite();
        aunf.g((aunf) a.instance, (int) j);
        int i = this.c;
        a.copyOnWrite();
        aunf.h((aunf) a.instance, i);
        aund aundVar = this.d;
        a.copyOnWrite();
        aunf.i((aunf) a.instance, aundVar);
        aunc auncVar = this.e;
        a.copyOnWrite();
        aunf.d((aunf) a.instance, auncVar);
        a.copyOnWrite();
        aunf.e((aunf) a.instance, false);
        akqu akquVar = this.h;
        akqv akqvVar = this.b;
        amru amruVar = this.f;
        aone createBuilder = aqpo.a.createBuilder();
        long j2 = akqvVar.d;
        createBuilder.copyOnWrite();
        aqpo aqpoVar = (aqpo) createBuilder.instance;
        aqpoVar.b |= 1;
        aqpoVar.d = (int) j2;
        for (int i2 = 0; i2 < 6; i2++) {
            long j3 = akqvVar.c[i2];
            int i3 = (int) (j3 > 0 ? akqvVar.b[i2] / j3 : 0L);
            if (akqvVar.a[i2] > 0 || i3 > 0) {
                aone createBuilder2 = aqpn.a.createBuilder();
                int i4 = akqu.b[i2];
                createBuilder2.copyOnWrite();
                aqpn aqpnVar = (aqpn) createBuilder2.instance;
                aqpnVar.b |= 1;
                aqpnVar.c = i4;
                int i5 = akqvVar.a[i2];
                createBuilder2.copyOnWrite();
                aqpn aqpnVar2 = (aqpn) createBuilder2.instance;
                aqpnVar2.b |= 2;
                aqpnVar2.d = i5;
                createBuilder2.copyOnWrite();
                aqpn aqpnVar3 = (aqpn) createBuilder2.instance;
                aqpnVar3.b |= 4;
                aqpnVar3.e = i3;
                createBuilder.copyOnWrite();
                aqpo aqpoVar2 = (aqpo) createBuilder.instance;
                aqpn aqpnVar4 = (aqpn) createBuilder2.build();
                aqpnVar4.getClass();
                aony aonyVar = aqpoVar2.c;
                if (!aonyVar.c()) {
                    aqpoVar2.c = aonm.mutableCopy(aonyVar);
                }
                aqpoVar2.c.add(aqpnVar4);
            }
        }
        aone createBuilder3 = aqcr.a.createBuilder();
        int i6 = akquVar.r;
        createBuilder3.copyOnWrite();
        aqcr aqcrVar = (aqcr) createBuilder3.instance;
        aqcrVar.b |= 1;
        aqcrVar.d = i6;
        createBuilder3.ac(amruVar);
        createBuilder.copyOnWrite();
        aqpo aqpoVar3 = (aqpo) createBuilder.instance;
        aqcr aqcrVar2 = (aqcr) createBuilder3.build();
        aqcrVar2.getClass();
        aqpoVar3.e = aqcrVar2;
        aqpoVar3.b |= 2;
        aqpo aqpoVar4 = (aqpo) createBuilder.build();
        a.copyOnWrite();
        aunf.f((aunf) a.instance, aqpoVar4);
        aunf aunfVar = (aunf) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dF(aunfVar);
        this.h.o.f((arpp) a2.build(), this.g);
    }
}
