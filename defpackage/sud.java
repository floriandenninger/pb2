package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sud implements swv {
    public final sxd a;
    public final boolean b;
    private final /* synthetic */ int c;

    public sud(sxd sxdVar, ammv ammvVar, int i, byte[] bArr) {
        this.c = i;
        this.a = sxdVar;
        this.b = ((Boolean) ammvVar.e(false)).booleanValue();
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    public sud(sxd sxdVar, ammv ammvVar, int i) {
        this.c = i;
        this.a = sxdVar;
        this.b = ((Boolean) ammvVar.e(false)).booleanValue();
    }

    @Override // defpackage.swv
    public final aomu a() {
        return this.c != 0 ? awqa.b : awqe.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, final swu swuVar) {
        if (this.c == 0) {
            final awqe awqeVar = (awqe) obj;
            return this.a.a(awqeVar.c).as(amlr.a).c(new ayrv() { // from class: suc
                @Override // defpackage.ayrv
                public final Object a(Object obj2) {
                    sud sudVar = sud.this;
                    awqe awqeVar2 = awqeVar;
                    try {
                        axoc a = EkoProcessor.a(awqeVar2.d.I(), (byte[]) ((ammv) obj2).e(syc.a), sudVar.b);
                        if (!a.a.f()) {
                            String valueOf = String.valueOf(a.a.getDescription());
                            throw new syf(valueOf.length() != 0 ? "Eko processor error: ".concat(valueOf) : new String("Eko processor error: "));
                        }
                        sxd sxdVar = sudVar.a;
                        String str = awqeVar2.c;
                        byte[] bArr = a.b;
                        bArr.getClass();
                        sxdVar.b(str, bArr);
                        return ayph.f();
                    } catch (IOException e) {
                        throw new syf("Invalid eko template", e);
                    }
                }
            });
        }
        final awqa awqaVar = (awqa) obj;
        final byte[] bArr = null;
        return this.a.a(awqaVar.c).as(amlr.a).c(new ayrv(swuVar, awqaVar, bArr) { // from class: sub
            public final /* synthetic */ swu a;
            public final /* synthetic */ awqa b;

            @Override // defpackage.ayrv
            public final Object a(Object obj2) {
                byte[] bArr2;
                sud sudVar = sud.this;
                swu swuVar2 = this.a;
                awqa awqaVar2 = this.b;
                byte[] bArr3 = (byte[]) ((ammv) obj2).e(syc.a);
                try {
                    aone createBuilder = awqc.a.createBuilder();
                    aomf x = aomf.x(bArr3);
                    createBuilder.copyOnWrite();
                    awqc awqcVar = (awqc) createBuilder.instance;
                    awqcVar.b |= 1;
                    awqcVar.c = x;
                    awpu awpuVar = swuVar2.e;
                    if (awpuVar != null) {
                        createBuilder.copyOnWrite();
                        awqc awqcVar2 = (awqc) createBuilder.instance;
                        awqcVar2.d = awpuVar;
                        awqcVar2.b |= 2;
                    }
                    awqb awqbVar = awqaVar2.d;
                    if (awqbVar == null) {
                        awqbVar = awqb.a;
                    }
                    createBuilder.copyOnWrite();
                    awqc awqcVar3 = (awqc) createBuilder.instance;
                    awqbVar.getClass();
                    awqcVar3.e = awqbVar;
                    awqcVar3.b |= 4;
                    aomk O = aomk.O(awqaVar2.toByteArray());
                    while (true) {
                        if (O.E()) {
                            bArr2 = syc.a;
                            break;
                        }
                        int n = O.n();
                        if (aoqp.a(n) != 2) {
                            O.G(n);
                        } else {
                            bArr2 = O.H();
                            break;
                        }
                    }
                    axoc a = EkoProcessor.a(bArr2, ((awqc) createBuilder.build()).toByteArray(), sudVar.b);
                    if (!a.a.f()) {
                        String valueOf = String.valueOf(a.a.getDescription());
                        throw new syf(valueOf.length() != 0 ? "Eko processor error: ".concat(valueOf) : new String("Eko processor error: "));
                    }
                    sxd sxdVar = sudVar.a;
                    String str = awqaVar2.c;
                    byte[] bArr4 = a.b;
                    bArr4.getClass();
                    sxdVar.b(str, bArr4);
                    return ayph.f();
                } catch (IOException e) {
                    throw new syf("Invalid eko template", e);
                }
            }
        });
    }
}
