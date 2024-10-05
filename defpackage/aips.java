package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aips {
    public ammv a = amlr.a;
    public String b;
    private final ywr c;
    private final azqw d;
    private final azqw e;
    private final axzg f;

    public aips(ywr ywrVar, azqw azqwVar, azqw azqwVar2, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.c = ywrVar;
        this.d = azqwVar;
        this.e = azqwVar2;
        this.f = axzgVar;
    }

    public final anhy a() {
        if (this.f.r().booleanValue()) {
            this.d.c(this.a);
            String str = this.b;
            if (str != null) {
                if (!str.isEmpty()) {
                    this.e.c(ammv.j(this.b));
                } else {
                    this.e.c(amlr.a);
                }
            }
            return anhv.a;
        }
        return this.c.b(new amml() { // from class: aipr
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aips aipsVar = aips.this;
                aone builder = ((awwm) obj).toBuilder();
                if (!aipsVar.a.h()) {
                    builder.copyOnWrite();
                    awwm awwmVar = (awwm) builder.instance;
                    awwmVar.b &= -2;
                    awwmVar.c = false;
                } else {
                    boolean booleanValue = ((Boolean) aipsVar.a.c()).booleanValue();
                    builder.copyOnWrite();
                    awwm awwmVar2 = (awwm) builder.instance;
                    awwmVar2.b |= 1;
                    awwmVar2.c = booleanValue;
                }
                String str2 = aipsVar.b;
                if (str2 != null) {
                    if (str2.isEmpty()) {
                        builder.copyOnWrite();
                        awwm awwmVar3 = (awwm) builder.instance;
                        awwmVar3.b &= -3;
                        awwmVar3.d = awwm.a.d;
                    } else {
                        String str3 = aipsVar.b;
                        builder.copyOnWrite();
                        awwm awwmVar4 = (awwm) builder.instance;
                        str3.getClass();
                        awwmVar4.b |= 2;
                        awwmVar4.d = str3;
                    }
                }
                return (awwm) builder.build();
            }
        });
    }

    public final void b(Boolean bool) {
        this.a = ammv.i(bool);
    }
}
