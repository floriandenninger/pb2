package defpackage;

import android.os.AsyncTask;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brf extends AsyncTask {
    final /* synthetic */ brh a;
    final /* synthetic */ brg b;

    public brf(brg brgVar, brh brhVar) {
        this.b = brgVar;
        this.a = brhVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return this.b.b();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.a.a((brj) obj);
    }
}
