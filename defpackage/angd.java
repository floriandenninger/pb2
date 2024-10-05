package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class angd implements anfz {
    final /* synthetic */ angk a;
    final /* synthetic */ aakk b;

    public angd(angk angkVar, aakk aakkVar) {
        this.a = angkVar;
        this.b = aakkVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        angh anghVar = this.a.b;
        aakk aakkVar = this.b;
        angh anghVar2 = new angh();
        try {
            return anaf.O(aakkVar.a.b((Cursor) obj, aakkVar.b));
        } finally {
            anghVar.a(anghVar2, angq.a);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
