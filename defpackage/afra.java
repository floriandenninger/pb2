package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afra implements afri {
    /* JADX INFO: Access modifiers changed from: protected */
    public static final void h(ysq ysqVar) {
        int i = ysqVar.a;
        if (i >= 300) {
            ysr ysrVar = new ysr(i, ysqVar.b);
            try {
                yso ysoVar = ysqVar.d;
                if (ysoVar != null) {
                    ysoVar.f();
                    throw ysrVar;
                }
                throw ysrVar;
            } catch (IOException unused) {
                throw ysrVar;
            }
        }
    }

    @Override // defpackage.afri
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object b(ysq ysqVar) {
        h(ysqVar);
        return f(ysqVar.d);
    }

    protected Object g(InputStream inputStream) {
        try {
            inputStream.close();
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object f(yso ysoVar) {
        if (ysoVar == null) {
            throw new IOException("Empty response body");
        }
        return g(ysoVar.b());
    }
}
