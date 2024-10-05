package defpackage;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ysh extends ysi {
    static final ysh a = new ysh();
    private static final byte[] d = new byte[0];

    private ysh() {
        super(0L, null);
    }

    @Override // defpackage.ysi
    public final InputStream a() {
        return new yvz(d, 0);
    }

    @Override // defpackage.ysi
    public final byte[] c() {
        return d;
    }
}
