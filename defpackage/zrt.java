package defpackage;

import android.content.Context;
import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zrt extends AsyncTask {
    private final shf a;

    public zrt(shf shfVar) {
        this.a = shfVar;
    }

    static final zom a(Context context, String str, long j, shf shfVar) {
        return new zom(context, 1, str, j, shfVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Context[] contextArr = (Context[]) objArr;
        a(contextArr[0], zoz.c, zoz.g, this.a).a(null);
        a(contextArr[0], zoz.d, zoz.h, this.a).a(null);
        return null;
    }
}
