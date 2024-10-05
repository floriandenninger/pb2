package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvk implements cqw {
    private final File a;
    private final cvl b;
    private Object c;

    public cvk(File file, cvl cvlVar) {
        this.a = file;
        this.b = cvlVar;
    }

    @Override // defpackage.cqw
    public final Class a() {
        return this.b.a();
    }

    @Override // defpackage.cqw
    public final void b() {
    }

    @Override // defpackage.cqw
    public final void c() {
        Object obj = this.c;
        if (obj != null) {
            try {
                this.b.c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        try {
            Object b = this.b.b(this.a);
            this.c = b;
            cqvVar.f(b);
        } catch (FileNotFoundException e) {
            cqvVar.g(e);
        }
    }

    @Override // defpackage.cqw
    public final int e() {
        return 1;
    }
}
