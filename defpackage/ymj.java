package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ymj extends ymk {
    private static ymj c;

    private ymj() {
    }

    public static ymk f() {
        if (c == null) {
            ymj ymjVar = new ymj();
            ymjVar.n(qmq.b);
            c = ymjVar;
        }
        return c;
    }

    @Override // defpackage.ymk
    protected final Object g(BufferedInputStream bufferedInputStream) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ymk
    public final void h() {
    }

    @Override // defpackage.ymk
    protected final void i(Object obj, BufferedOutputStream bufferedOutputStream) {
    }
}
