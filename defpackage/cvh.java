package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvh implements cqw {
    private final String a;
    private Object b;

    public cvh(String str) {
        this.a = str;
    }

    @Override // defpackage.cqw
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.cqw
    public final void b() {
    }

    @Override // defpackage.cqw
    public final void c() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, indexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            this.b = byteArrayInputStream;
            cqvVar.f(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            cqvVar.g(e);
        }
    }

    @Override // defpackage.cqw
    public final int e() {
        return 1;
    }
}
