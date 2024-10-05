package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afnf implements swv {
    public final akpe a;
    public final Executor b;

    public afnf(akpe akpeVar, Executor executor) {
        this.a = akpeVar;
        this.b = executor;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return avsb.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        final avsb avsbVar = (avsb) obj;
        return ayph.j(new aypj() { // from class: afnd
            @Override // defpackage.aypj
            public final void a(final ayue ayueVar) {
                afnf afnfVar = afnf.this;
                avsb avsbVar2 = avsbVar;
                akpe akpeVar = afnfVar.a;
                aone createBuilder = ascy.a.createBuilder();
                ascy ascyVar = avsbVar2.c;
                if (ascyVar == null) {
                    ascyVar = ascy.a;
                }
                createBuilder.mergeFrom((aonm) ascyVar);
                akpd akpdVar = new akpd(akpeVar.f, akpeVar.a.c(), createBuilder, null, null, null);
                akpdVar.k();
                final anhy b = akpeVar.c.b(akpdVar, akpeVar.b);
                b.d(new Runnable() { // from class: afne
                    @Override // java.lang.Runnable
                    public final void run() {
                        anhy anhyVar = anhy.this;
                        ayue ayueVar2 = ayueVar;
                        try {
                            anaf.W(anhyVar);
                        } catch (Exception e) {
                            String.valueOf(String.valueOf(e)).length();
                        }
                        ayueVar2.a();
                    }
                }, afnfVar.b);
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
