package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayfi implements ayob {
    @Override // defpackage.ayob
    public final void d() {
        aylq aylqVar;
        ayfb ayfbVar;
        if (((aylq) v()).f || (ayfbVar = (aylqVar = (aylq) v()).j) == null || ayfbVar.a() <= 0) {
            return;
        }
        aylqVar.b(false, true);
    }

    @Override // defpackage.ayob
    public final void f() {
        ayfh p = p();
        aylm aylmVar = p.d;
        aylmVar.a = p;
        p.a = aylmVar;
    }

    @Override // defpackage.ayob
    public final void g(int i) {
        ayfh p = p();
        int i2 = aypd.a;
        ayfg ayfgVar = new ayfg(p, i);
        synchronized (((ayix) p).r) {
            ayfgVar.run();
        }
    }

    @Override // defpackage.ayob
    public final void h(ayac ayacVar) {
        ((aylq) v()).b = ayacVar;
    }

    @Override // defpackage.ayob
    public final void n(InputStream inputStream) {
        int a;
        try {
            if (!((aylq) v()).f) {
                ayip v = v();
                if (((aylq) v).f) {
                    throw new IllegalStateException("Framer already closed");
                }
                ((aylq) v).g++;
                int i = ((aylq) v).h + 1;
                ((aylq) v).h = i;
                ((aylq) v).i = 0L;
                ((aylq) v).e.h(i);
                ayac ayacVar = ((aylq) v).b;
                ayab ayabVar = ayaa.a;
                try {
                    int available = inputStream.available();
                    if (available != 0 && ayacVar != ayabVar) {
                        ayln aylnVar = new ayln();
                        try {
                            a = aylq.a(inputStream, aylnVar);
                            aylnVar.close();
                            int i2 = ((aylq) v).a;
                            if (i2 >= 0 && a > i2) {
                                throw Status.j.withDescription(String.format("message too large %d > %d", Integer.valueOf(a), Integer.valueOf(((aylq) v).a))).d();
                            }
                            ((aylq) v).c(aylnVar, true);
                        } catch (Throwable th) {
                            aylnVar.close();
                            throw th;
                        }
                    } else if (available != -1) {
                        ((aylq) v).i = available;
                        int i3 = ((aylq) v).a;
                        if (i3 >= 0 && available > i3) {
                            throw Status.j.withDescription(String.format("message too large %d > %d", Integer.valueOf(available), Integer.valueOf(((aylq) v).a))).d();
                        }
                        ((aylq) v).d.put((byte) 0).putInt(available);
                        if (((aylq) v).j == null) {
                            ((aylq) v).j = ayeq.a(((aylq) v).d.position() + available);
                        }
                        ((aylq) v).d(((aylq) v).d.array(), 0, ((aylq) v).d.position());
                        a = aylq.a(inputStream, ((aylq) v).c);
                    } else {
                        ayln aylnVar2 = new ayln();
                        a = aylq.a(inputStream, aylnVar2);
                        int i4 = ((aylq) v).a;
                        if (i4 >= 0 && a > i4) {
                            throw Status.j.withDescription(String.format("message too large %d > %d", Integer.valueOf(a), Integer.valueOf(((aylq) v).a))).d();
                        }
                        ((aylq) v).c(aylnVar2, false);
                    }
                    if (available != -1 && a != available) {
                        throw Status.n.withDescription(String.format("Message length inaccurate %s != %s", Integer.valueOf(a), Integer.valueOf(available))).d();
                    }
                    long j = a;
                    ((aylq) v).e.j(j);
                    ((aylq) v).e.k(((aylq) v).i);
                    ((aylq) v).e.i(((aylq) v).h, ((aylq) v).i, j);
                } catch (IOException e) {
                    throw Status.n.withDescription("Failed to frame message").c(e).d();
                } catch (RuntimeException e2) {
                    throw Status.n.withDescription("Failed to frame message").c(e2).d();
                }
            }
        } finally {
            ayiu.f(inputStream);
        }
    }

    @Override // defpackage.ayob
    public boolean o() {
        throw null;
    }

    public abstract ayfh p();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ayip v();
}
