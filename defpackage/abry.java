package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abry implements abvr {
    final /* synthetic */ abrz a;

    public abry(abrz abrzVar) {
        this.a = abrzVar;
    }

    @Override // defpackage.abvr
    public final void a(Object obj) {
        abrz abrzVar = this.a;
        if (abrzVar.c && (obj instanceof asse)) {
            asse asseVar = (asse) obj;
            abrzVar.a();
            abrz abrzVar2 = this.a;
            asseVar.copyOnWrite();
            assg assgVar = (assg) asseVar.instance;
            assg assgVar2 = assg.a;
            assgVar.d = assg.emptyProtobufList();
            for (absa absaVar : abrzVar2.b) {
                aone createBuilder = assf.a.createBuilder();
                String str = absaVar.a;
                createBuilder.copyOnWrite();
                assf assfVar = (assf) createBuilder.instance;
                str.getClass();
                assfVar.b |= 1;
                assfVar.c = str;
                float f = absaVar.c;
                createBuilder.copyOnWrite();
                assf assfVar2 = (assf) createBuilder.instance;
                assfVar2.b |= 4;
                assfVar2.e = f;
                float f2 = absaVar.d;
                createBuilder.copyOnWrite();
                assf assfVar3 = (assf) createBuilder.instance;
                assfVar3.b |= 8;
                assfVar3.f = f2;
                long j = absaVar.b;
                createBuilder.copyOnWrite();
                assf assfVar4 = (assf) createBuilder.instance;
                assfVar4.b |= 2;
                assfVar4.d = j;
                assf assfVar5 = (assf) createBuilder.build();
                asseVar.copyOnWrite();
                assg assgVar3 = (assg) asseVar.instance;
                assfVar5.getClass();
                aony aonyVar = assgVar3.d;
                if (!aonyVar.c()) {
                    assgVar3.d = aonm.mutableCopy(aonyVar);
                }
                assgVar3.d.add(assfVar5);
            }
            this.a.b.clear();
            this.a.e();
        }
    }
}
