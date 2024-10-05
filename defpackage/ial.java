package defpackage;

import android.os.AsyncTask;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ial extends AsyncTask {
    final /* synthetic */ File a;
    final /* synthetic */ String b;

    public ial(File file, String str) {
        this.a = file;
        this.b = str;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (!this.a.exists() || !this.a.delete()) {
            String valueOf = String.valueOf(this.b);
            zga.b(valueOf.length() != 0 ? "Failed to delete text asset: ".concat(valueOf) : new String("Failed to delete text asset: "));
            return null;
        }
        String valueOf2 = String.valueOf(this.b);
        if (valueOf2.length() == 0) {
            return null;
        }
        "Successfully deleted text asset: ".concat(valueOf2);
        return null;
    }
}
