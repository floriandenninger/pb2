package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vhy implements anhh {
    final /* synthetic */ vid a;
    private final /* synthetic */ int b;

    public vhy(vid vidVar, int i) {
        this.b = i;
        this.a = vidVar;
    }

    @Override // defpackage.anhh
    public final /* synthetic */ void b(Object obj) {
        if (this.b == 0) {
            if (new File(((SQLiteDatabase) obj).getPath()).exists()) {
                return;
            }
            synchronized (this.a.h) {
                this.a.d();
            }
            return;
        }
        new File(this.a.b.getDatabasePath((String) obj).getPath().concat(".bak")).delete();
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
    }
}
