package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjn extends AsyncTask {
    private final qjp a;
    private final qjm b;

    static {
        new qkw("FetchBitmapTask");
    }

    public qjn(Context context, int i, int i2, qjm qjmVar) {
        this.b = qjmVar;
        this.a = qhh.e(context.getApplicationContext(), this, new qjq(this), i, i2);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        qjp qjpVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (qjpVar = this.a) == null) {
            return null;
        }
        try {
            return qjpVar.a(uri);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        qjm qjmVar = this.b;
        if (qjmVar != null) {
            qjmVar.b = bitmap;
            qjmVar.c = true;
            qjl qjlVar = qjmVar.d;
            if (qjlVar != null) {
                qjlVar.a(qjmVar.b);
            }
            qjmVar.a = null;
        }
    }
}
