package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hox implements zrz {
    final /* synthetic */ hoy a;

    public hox(hoy hoyVar) {
        this.a = hoyVar;
    }

    @Override // defpackage.zrz
    public final void a(File file, axdu axduVar) {
        if (file != null) {
            hoy hoyVar = this.a;
            String path = file.getPath();
            if (hoyVar.d.equals(path)) {
                return;
            }
            hoyVar.d = path;
            hoyVar.a();
        }
    }
}
