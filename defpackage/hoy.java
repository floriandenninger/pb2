package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hoy {
    public final hpa a;
    public ammv b;
    public String c;
    public String d;
    public final zrz e;

    public hoy(hpa hpaVar) {
        this.b = amlr.a;
        this.c = "";
        this.d = "";
        this.a = hpaVar;
        if (hpaVar instanceof how) {
            ammv e = ((how) hpaVar).e();
            if (e.h()) {
                axev axevVar = (axev) e.c();
                if (axevVar.d.size() > 0) {
                    this.b = ammv.j((axet) axevVar.d.get(0));
                }
                this.c = axevVar.e;
                this.d = axevVar.c;
            }
        }
        this.e = new hox(this);
    }

    public final void a() {
        hpa hpaVar = this.a;
        if (hpaVar instanceof how) {
            how howVar = (how) hpaVar;
            aone createBuilder = axev.a.createBuilder();
            if (this.b.h()) {
                axet axetVar = (axet) this.b.c();
                createBuilder.copyOnWrite();
                axev axevVar = (axev) createBuilder.instance;
                aony aonyVar = axevVar.d;
                if (!aonyVar.c()) {
                    axevVar.d = aonm.mutableCopy(aonyVar);
                }
                axevVar.d.add(axetVar);
            }
            String str = this.c;
            createBuilder.copyOnWrite();
            axev axevVar2 = (axev) createBuilder.instance;
            str.getClass();
            axevVar2.b |= 2;
            axevVar2.e = str;
            if (!this.d.isEmpty()) {
                String str2 = this.d;
                createBuilder.copyOnWrite();
                axev axevVar3 = (axev) createBuilder.instance;
                str2.getClass();
                axevVar3.b |= 1;
                axevVar3.c = str2;
            }
            howVar.s((axev) createBuilder.build());
        }
    }
}
