package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyq implements cqp {
    private final cxx a;
    private final ctk b;

    public cyq(cxx cxxVar, ctk ctkVar) {
        this.a = cxxVar;
        this.b = ctkVar;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        cym cymVar;
        boolean z;
        ddf ddfVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof cym) {
            cymVar = (cym) inputStream;
            z = false;
        } else {
            cymVar = new cym(inputStream, this.b);
            z = true;
        }
        synchronized (ddf.a) {
            ddfVar = (ddf) ddf.a.poll();
        }
        if (ddfVar == null) {
            ddfVar = new ddf();
        }
        ddfVar.b = cymVar;
        ddk ddkVar = new ddk(ddfVar);
        cyp cypVar = new cyp(cymVar, ddfVar);
        try {
            cxx cxxVar = this.a;
            ctd a = cxxVar.a(new cyf(ddkVar, cxxVar.g, cxxVar.f), i, i2, cqnVar, cypVar);
            ddfVar.a();
            if (z) {
                cymVar.b();
            }
            return a;
        } catch (Throwable th) {
            ddfVar.a();
            if (z) {
                cymVar.b();
            }
            throw th;
        }
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        return true;
    }
}
