package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akfl implements aypb {
    final /* synthetic */ akfo a;

    public akfl(akfo akfoVar) {
        this.a = akfoVar;
    }

    @Override // defpackage.aypb
    public final void a() {
        this.a.c.post(new akfi(this, 1));
    }

    @Override // defpackage.aypb
    public final void b(final Throwable th) {
        this.a.c.post(new Runnable() { // from class: akfk
            @Override // java.lang.Runnable
            public final void run() {
                akfl akflVar = akfl.this;
                akflVar.a.e.c(th);
            }
        });
    }

    @Override // defpackage.aypb
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        final amki amkiVar = (amki) obj;
        int i = amkiVar.b;
        final int i2 = 1;
        final int i3 = 0;
        final int i4 = 2;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        if (c != 0 && c == 3) {
            this.a.c.post(new akfi(this, i3));
        }
        this.a.c.post(new Runnable(this) { // from class: akfj
            public final /* synthetic */ akfl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i2;
                if (i5 == 0) {
                    akfl akflVar = this.a;
                    amki amkiVar2 = amkiVar;
                    akfm akfmVar = akflVar.a.e;
                    amks amksVar = amkiVar2.e;
                    if (amksVar == null) {
                        amksVar = amks.a;
                    }
                    akfmVar.d(amksVar.b);
                    return;
                }
                if (i5 == 1) {
                    this.a.a.d.d(amkiVar.d);
                    return;
                }
                akfl akflVar2 = this.a;
                amki amkiVar3 = amkiVar;
                akfm akfmVar2 = akflVar2.a.e;
                amkk amkkVar = amkiVar3.c;
                if (amkkVar == null) {
                    amkkVar = amkk.a;
                }
                akfmVar2.a(amkkVar);
            }
        });
        amks amksVar = amkiVar.e;
        if (amksVar == null) {
            amksVar = amks.a;
        }
        if (amksVar.b.d() > 0) {
            this.a.c.post(new Runnable(this) { // from class: akfj
                public final /* synthetic */ akfl a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i3;
                    if (i5 == 0) {
                        akfl akflVar = this.a;
                        amki amkiVar2 = amkiVar;
                        akfm akfmVar = akflVar.a.e;
                        amks amksVar2 = amkiVar2.e;
                        if (amksVar2 == null) {
                            amksVar2 = amks.a;
                        }
                        akfmVar.d(amksVar2.b);
                        return;
                    }
                    if (i5 == 1) {
                        this.a.a.d.d(amkiVar.d);
                        return;
                    }
                    akfl akflVar2 = this.a;
                    amki amkiVar3 = amkiVar;
                    akfm akfmVar2 = akflVar2.a.e;
                    amkk amkkVar = amkiVar3.c;
                    if (amkkVar == null) {
                        amkkVar = amkk.a;
                    }
                    akfmVar2.a(amkkVar);
                }
            });
        }
        if (amkiVar.c != null) {
            this.a.c.post(new Runnable(this) { // from class: akfj
                public final /* synthetic */ akfl a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i4;
                    if (i5 == 0) {
                        akfl akflVar = this.a;
                        amki amkiVar2 = amkiVar;
                        akfm akfmVar = akflVar.a.e;
                        amks amksVar2 = amkiVar2.e;
                        if (amksVar2 == null) {
                            amksVar2 = amks.a;
                        }
                        akfmVar.d(amksVar2.b);
                        return;
                    }
                    if (i5 == 1) {
                        this.a.a.d.d(amkiVar.d);
                        return;
                    }
                    akfl akflVar2 = this.a;
                    amki amkiVar3 = amkiVar;
                    akfm akfmVar2 = akflVar2.a.e;
                    amkk amkkVar = amkiVar3.c;
                    if (amkkVar == null) {
                        amkkVar = amkk.a;
                    }
                    akfmVar2.a(amkkVar);
                }
            });
        }
    }
}
