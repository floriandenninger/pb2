package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvb implements cuz {
    private final /* synthetic */ int a;

    public cvb(int i) {
        this.a = i;
    }

    @Override // defpackage.cuz
    public final Class a() {
        return this.a != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // defpackage.cuz
    public final /* synthetic */ Object b(byte[] bArr) {
        return this.a != 0 ? ByteBuffer.wrap(bArr) : new ByteArrayInputStream(bArr);
    }
}
