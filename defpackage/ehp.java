package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ehp implements ynl {
    final /* synthetic */ ehq a;

    public ehp(ehq ehqVar) {
        this.a = ehqVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        File[] listFiles;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue() || (listFiles = ((File) this.a.aR.get()).listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            file.delete();
        }
    }
}
