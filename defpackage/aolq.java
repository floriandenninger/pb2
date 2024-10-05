package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aolq implements aopf {
    private static final aomw a = aomw.a();

    private static final void r(aooy aooyVar) {
        if (aooyVar != null && !aooyVar.isInitialized()) {
            throw ((aolo) aooyVar).newUninitializedMessageException().a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aooy, java.lang.Object] */
    @Override // defpackage.aopf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aooy k(aomf aomfVar, aomw aomwVar) {
        try {
            aomk l = aomfVar.l();
            ?? q = q(l, aomwVar);
            try {
                l.B(0);
                r(q);
                return q;
            } catch (aoob e) {
                throw e;
            }
        } catch (aoob e2) {
            throw e2;
        }
    }

    @Override // defpackage.aopf
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aooy m(InputStream inputStream, aomw aomwVar) {
        aooy e = e(inputStream, aomwVar);
        r(e);
        return e;
    }

    @Override // defpackage.aopf
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aooy n(byte[] bArr, aomw aomwVar) {
        return p(bArr, 0, bArr.length, aomwVar);
    }

    @Override // defpackage.aopf
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aooy p(byte[] bArr, int i, int i2, aomw aomwVar) {
        aooy f = f(bArr, i, i2, aomwVar);
        r(f);
        return f;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aooy, java.lang.Object] */
    public final aooy e(InputStream inputStream, aomw aomwVar) {
        aomk M = aomk.M(inputStream);
        ?? q = q(M, aomwVar);
        try {
            M.B(0);
            return q;
        } catch (aoob e) {
            throw e;
        }
    }

    public aooy f(byte[] bArr, int i, int i2, aomw aomwVar) {
        throw null;
    }

    @Override // defpackage.aopf
    public final /* bridge */ /* synthetic */ Object g(InputStream inputStream, aomw aomwVar) {
        try {
            int read = inputStream.read();
            aooy e = read == -1 ? null : e(new aolm(inputStream, aomk.K(read, inputStream)), aomwVar);
            r(e);
            return e;
        } catch (IOException e2) {
            throw new aoob(e2);
        }
    }

    @Override // defpackage.aopf
    public final /* bridge */ /* synthetic */ Object h(aomf aomfVar) {
        return k(aomfVar, a);
    }

    @Override // defpackage.aopf
    public final /* bridge */ /* synthetic */ Object i(InputStream inputStream) {
        return m(inputStream, a);
    }

    @Override // defpackage.aopf
    public final /* bridge */ /* synthetic */ Object j(byte[] bArr) {
        return n(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aooy, java.lang.Object] */
    @Override // defpackage.aopf
    public final /* bridge */ /* synthetic */ Object l(aomk aomkVar, aomw aomwVar) {
        ?? q = q(aomkVar, aomwVar);
        r(q);
        return q;
    }

    @Override // defpackage.aopf
    public final /* bridge */ /* synthetic */ Object o(byte[] bArr, int i, int i2) {
        return p(bArr, i, i2, a);
    }
}
