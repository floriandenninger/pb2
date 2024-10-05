package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvf implements cqw {
    private final File a;

    public cvf(File file) {
        this.a = file;
    }

    @Override // defpackage.cqw
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.cqw
    public final void b() {
    }

    @Override // defpackage.cqw
    public final void c() {
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        try {
            cqvVar.f(ddc.b(this.a));
        } catch (IOException e) {
            cqvVar.g(e);
        }
    }

    @Override // defpackage.cqw
    public final int e() {
        return 1;
    }
}
