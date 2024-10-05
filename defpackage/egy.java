package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class egy implements ynl {
    final /* synthetic */ ehb a;

    public egy(ehb ehbVar) {
        this.a = ehbVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        File[] listFiles;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue() || (listFiles = ((File) this.a.ar.get()).listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            file.delete();
        }
    }
}
