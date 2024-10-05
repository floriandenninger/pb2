package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpz extends AsyncTask {
    private final zom a;
    private final zpx b;

    public zpz(zom zomVar, zpx zpxVar) {
        this.a = zomVar;
        this.b = zpxVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb.append(valueOf);
        sb.append(".png");
        String sb2 = sb.toString();
        aekb aekbVar = new aekb(null, null);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, aekbVar);
        bitmap.recycle();
        this.a.b(sb2, aekbVar.toByteArray());
        aone createBuilder = zsb.a.createBuilder();
        String a = zoz.a(sb2);
        createBuilder.copyOnWrite();
        zsb zsbVar = (zsb) createBuilder.instance;
        a.getClass();
        zsbVar.b |= 1;
        zsbVar.c = a;
        int width = bitmap.getWidth();
        createBuilder.copyOnWrite();
        zsb zsbVar2 = (zsb) createBuilder.instance;
        zsbVar2.b |= 2;
        zsbVar2.d = width;
        int height = bitmap.getHeight();
        createBuilder.copyOnWrite();
        zsb zsbVar3 = (zsb) createBuilder.instance;
        zsbVar3.b |= 4;
        zsbVar3.e = height;
        return (zsb) createBuilder.build();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.b.a((zsb) obj);
    }
}
