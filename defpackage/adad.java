package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adad implements acyp {
    final /* synthetic */ String a;
    final /* synthetic */ ardo b;
    final /* synthetic */ apxf c;
    final /* synthetic */ adah d;
    final /* synthetic */ adae e;

    public adad(adae adaeVar, String str, ardo ardoVar, apxf apxfVar, adah adahVar) {
        this.e = adaeVar;
        this.a = str;
        this.b = ardoVar;
        this.c = apxfVar;
        this.d = adahVar;
    }

    @Override // defpackage.acyp
    public final void a(final adfy adfyVar) {
        String str = adfyVar.g() == null ? "" : adfyVar.g().c;
        int i = adae.g;
        String.format("onDialScreenFound endpointId=%s name=%s id=%s", this.a, adfyVar.d, str);
        if (str.equals(this.a)) {
            this.e.b.f(this);
            aczv aczvVar = this.e.d;
            anhy b = ((vgz) aczvVar.a.get()).b(new wgs(this.b.b, 13), aczvVar.c);
            final apxf apxfVar = this.c;
            final adah adahVar = this.d;
            ynm.i(b, new ynl() { // from class: adab
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    final adad adadVar = adad.this;
                    final adfy adfyVar2 = adfyVar;
                    final apxf apxfVar2 = apxfVar;
                    final adah adahVar2 = adahVar;
                    adadVar.e.c.execute(new Runnable() { // from class: adac
                        @Override // java.lang.Runnable
                        public final void run() {
                            adad adadVar2 = adad.this;
                            adadVar2.e.a.c(adfyVar2, apxfVar2, adahVar2);
                        }
                    });
                }
            });
            this.e.f = null;
        }
    }

    @Override // defpackage.acyp
    public final void b() {
        int i = adae.g;
        this.e.b.f(this);
        this.e.d.c();
        this.e.e.b(this.b.b, 5);
        this.e.f = null;
    }
}
