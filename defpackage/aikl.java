package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aikl {
    public final aivq a;
    public final Context b;
    public final azrw c;
    public final int d;
    public final azrw e;
    public final aikh f;

    public aikl(Context context, azrw azrwVar, aivq aivqVar, int i, azrw azrwVar2) {
        this(context, azrwVar, aivqVar, i, azrwVar2, aikh.a);
    }

    public final PendingIntent a(String str) {
        return PendingIntent.getBroadcast(this.b, 0, new Intent().setPackage(this.b.getPackageName()).setAction(str), yny.M() | 134217728);
    }

    public final void b(dy dyVar, int i, int i2, PendingIntent pendingIntent, List list, boolean z) {
        dyVar.f(new du(i, this.b.getText(i2), pendingIntent).a());
        if (z) {
            list.add(Integer.valueOf(dyVar.b.size() - 1));
        }
    }

    public aikl(Context context, azrw azrwVar, aivq aivqVar, int i, azrw azrwVar2, aikh aikhVar) {
        this.b = context;
        this.c = azrwVar;
        this.a = aivqVar;
        this.d = i;
        azrwVar2.getClass();
        this.e = azrwVar2;
        this.f = aikhVar;
    }
}
