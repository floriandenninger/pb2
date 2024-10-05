package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqg implements zgi {
    private final akqn a;
    private final acpk b;
    private final axzf c;

    public akqg(acpk acpkVar, axzf axzfVar, akqn akqnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = acpkVar;
        this.c = axzfVar;
        this.a = akqnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Throwable] */
    private final void c(String str, String str2, String str3, Exception exc) {
        Boolean bool;
        aqvj aqvjVar = this.c.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45353231L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353231L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353231L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            if (str2 == null || "rpc-v1-browse".equals(this.a.a(str2))) {
                if (exc != null) {
                    String valueOf = String.valueOf(exc);
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 12 + String.valueOf(valueOf).length());
                    sb.append(str3);
                    sb.append(" Exception: ");
                    sb.append(valueOf);
                    str3 = sb.toString();
                }
                String format = String.format(Locale.US, "[%s] %s", str, str3);
                aone createBuilder = aptu.a.createBuilder();
                aone createBuilder2 = aptv.a.createBuilder();
                createBuilder2.copyOnWrite();
                aptv aptvVar = (aptv) createBuilder2.instance;
                aptvVar.c = 28;
                aptvVar.b |= 1;
                aptv aptvVar2 = (aptv) createBuilder2.build();
                createBuilder.copyOnWrite();
                aptu aptuVar = (aptu) createBuilder.instance;
                aptvVar2.getClass();
                aptuVar.c = aptvVar2;
                aptuVar.b |= 1;
                aone createBuilder3 = aptx.a.createBuilder();
                createBuilder3.copyOnWrite();
                aptx aptxVar = (aptx) createBuilder3.instance;
                aptxVar.d = 1;
                aptxVar.b |= 2;
                createBuilder3.copyOnWrite();
                aptx aptxVar2 = (aptx) createBuilder3.instance;
                format.getClass();
                aptxVar2.b |= 1;
                aptxVar2.c = format;
                aptx aptxVar3 = (aptx) createBuilder3.build();
                createBuilder.copyOnWrite();
                aptu aptuVar2 = (aptu) createBuilder.instance;
                aptxVar3.getClass();
                aptuVar2.e = aptxVar3;
                aptuVar2.b |= 4;
                if (exc != null) {
                    boolean b = afsn.b(exc);
                    Exception exc2 = exc;
                    if (b) {
                        exc2 = afsn.a(exc);
                    }
                    aone createBuilder4 = aptw.a.createBuilder();
                    aone createBuilder5 = apts.a.createBuilder();
                    aomf byteString = ((andu) anaf.av(exc2).build()).toByteString();
                    createBuilder5.copyOnWrite();
                    apts aptsVar = (apts) createBuilder5.instance;
                    aptsVar.b |= 1;
                    aptsVar.c = byteString;
                    apts aptsVar2 = (apts) createBuilder5.build();
                    createBuilder4.copyOnWrite();
                    aptw aptwVar = (aptw) createBuilder4.instance;
                    aptsVar2.getClass();
                    aptwVar.c = aptsVar2;
                    aptwVar.b = 2;
                    createBuilder.copyOnWrite();
                    aptu aptuVar3 = (aptu) createBuilder.instance;
                    aptw aptwVar2 = (aptw) createBuilder4.build();
                    aptwVar2.getClass();
                    aptuVar3.d = aptwVar2;
                    aptuVar3.b |= 2;
                }
                this.b.d((aptu) createBuilder.build());
            }
        }
    }

    @Override // defpackage.zgi
    public final void a(String str, String str2, String str3, Exception exc) {
        c(str, str2, str3, exc);
    }

    @Override // defpackage.zgi
    public final void b(String str) {
        c(null, null, str, null);
    }
}
