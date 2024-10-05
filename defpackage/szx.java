package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class szx {
    private final FutureTask a;

    public szx(final aoam aoamVar, final syd sydVar) {
        this.a = new FutureTask(new Callable() { // from class: szw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aoam aoamVar2 = aoam.this;
                syd sydVar2 = sydVar;
                if (aoamVar2.U() != 2) {
                    String valueOf = String.valueOf(szz.j(aoamVar2));
                    sydVar2.b(28, valueOf.length() != 0 ? "Command extension: invalid format: ".concat(valueOf) : new String("Command extension: invalid format: "));
                    return awnw.a;
                }
                if (aoamVar2.T() == 0) {
                    String valueOf2 = String.valueOf(szz.j(aoamVar2));
                    sydVar2.b(23, valueOf2.length() != 0 ? "Command extension: invalid identifier: ".concat(valueOf2) : new String("Command extension: invalid identifier: "));
                    return awnw.a;
                }
                byte[] bArr = new byte[aoamVar2.S()];
                if (aoamVar2.S() > 0) {
                    aoamVar2.V().get(bArr);
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    aomp aj = aomp.aj(byteArrayOutputStream);
                    aj.m(aoamVar2.T(), bArr);
                    aj.i();
                    return (awnw) aonm.parseFrom(awnw.a, byteArrayOutputStream.toByteArray(), aomw.b());
                } catch (aoob unused) {
                    String valueOf3 = String.valueOf(szz.j(aoamVar2));
                    sydVar2.b(26, valueOf3.length() != 0 ? "Command extension: invalid data: ".concat(valueOf3) : new String("Command extension: invalid data: "));
                    return awnw.a;
                } catch (IOException unused2) {
                    String valueOf4 = String.valueOf(szz.j(aoamVar2));
                    sydVar2.b(26, valueOf4.length() != 0 ? "Error wrapping Command extension: ".concat(valueOf4) : new String("Error wrapping Command extension: "));
                    return awnw.a;
                }
            }
        });
    }

    public final awnw a() {
        this.a.run();
        try {
            return (awnw) this.a.get();
        } catch (InterruptedException e) {
            throw new syf("CommandFuture interrupted", e);
        } catch (ExecutionException e2) {
            throw new syf("CommandFuture failed", e2);
        }
    }
}
