package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acss implements acsx {
    private final acsy a;
    private final shf b;
    private final asmn c;
    private final acsr d;
    private final String e;
    private ammv f;
    private boolean g = false;
    private boolean h;
    private long i;

    public acss(acsy acsyVar, shf shfVar, asmn asmnVar, String str, ammv ammvVar, boolean z) {
        this.a = acsyVar;
        this.b = shfVar;
        this.c = asmnVar;
        this.e = str;
        this.f = ammvVar;
        this.h = false;
        acsr acsrVar = new acsr(z, str);
        this.d = acsrVar;
        if (acsrVar.a) {
            String valueOf = String.valueOf(asmnVar.name());
            acsrVar.b(valueOf.length() != 0 ? "constructor ".concat(valueOf) : new String("constructor "));
        }
        if (this.g) {
            aone createBuilder = asmb.a.createBuilder();
            createBuilder.copyOnWrite();
            asmb asmbVar = (asmb) createBuilder.instance;
            asmbVar.e = asmnVar.bO;
            asmbVar.b |= 1;
            a((asmb) createBuilder.build());
            this.h = true;
        }
        if (ammvVar.h()) {
            String str2 = (String) ammvVar.c();
            if (this.f.h()) {
                ((String) this.f.c()).equals(str2);
            }
            this.f = ammv.j(str2);
            aone createBuilder2 = asmb.a.createBuilder();
            createBuilder2.copyOnWrite();
            asmb asmbVar2 = (asmb) createBuilder2.instance;
            str.getClass();
            asmbVar2.b |= 2;
            asmbVar2.f = str;
            createBuilder2.copyOnWrite();
            asmb asmbVar3 = (asmb) createBuilder2.instance;
            asmbVar3.e = asmnVar.bO;
            asmbVar3.b |= 1;
            createBuilder2.copyOnWrite();
            asmb asmbVar4 = (asmb) createBuilder2.instance;
            asmbVar4.b |= 4;
            asmbVar4.g = str2;
            acsyVar.f((asmb) createBuilder2.build());
            if (acsrVar.a) {
                acsrVar.b(str2.length() != 0 ? "logClientScreenNonce ".concat(str2) : new String("logClientScreenNonce "));
            }
        }
    }

    @Override // defpackage.aftr
    public final void a(asmb asmbVar) {
        if (asmbVar == null) {
            return;
        }
        acsy acsyVar = this.a;
        aone builder = asmbVar.toBuilder();
        String str = this.e;
        builder.copyOnWrite();
        asmb asmbVar2 = (asmb) builder.instance;
        str.getClass();
        asmbVar2.b |= 2;
        asmbVar2.f = str;
        acsyVar.f((asmb) builder.build());
        acsr acsrVar = this.d;
        asmn asmnVar = this.c;
        if (acsrVar.a) {
            String name = asmnVar.name();
            String a = acsr.a(asmbVar);
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 20 + String.valueOf(a).length());
            sb.append("logActionInfo ");
            sb.append(name);
            sb.append(" info ");
            sb.append(a);
            acsrVar.b(sb.toString());
        }
    }

    public final void b(String str, long j) {
        this.a.k(str, this.e, j);
        acsr acsrVar = this.d;
        long j2 = this.i;
        if (acsrVar.a) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(j - j2);
            sb.append(" ms");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(sb2).length());
            sb3.append("logTick ");
            sb3.append(str);
            sb3.append(" ");
            sb3.append(sb2);
            acsrVar.b(sb3.toString());
        }
        if (this.h) {
            return;
        }
        aone createBuilder = asmb.a.createBuilder();
        asmn asmnVar = this.c;
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmbVar.e = asmnVar.bO;
        asmbVar.b |= 1;
        a((asmb) createBuilder.build());
        this.h = true;
    }

    @Override // defpackage.aftr
    public final void c(String str) {
        b(str, this.b.c());
    }

    @Override // defpackage.aftr
    public final void d(String str, long j) {
        b(str, j);
    }

    @Override // defpackage.aftr
    public final void e() {
        f(this.b.c());
    }

    @Override // defpackage.aftr
    public final void f(long j) {
        if (this.g) {
            this.d.b("Attempted to log multiple Baseline Ticks with a single ActionLogger while disallowing multiple Baselines");
            return;
        }
        this.i = j;
        this.a.i(this.e, j);
        this.g = true;
        acsr acsrVar = this.d;
        long j2 = this.i;
        if (acsrVar.a) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("logBaseline ");
            sb.append(j2);
            acsrVar.b(sb.toString());
        }
        if (this.h) {
            return;
        }
        aone createBuilder = asmb.a.createBuilder();
        asmn asmnVar = this.c;
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmbVar.e = asmnVar.bO;
        asmbVar.b |= 1;
        a((asmb) createBuilder.build());
        this.h = true;
    }
}
