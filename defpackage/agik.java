package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agik {
    public agfo a;
    private final String b;
    private final agij c = new agij(this);
    private final aght d;
    private agjc e;
    private final ajyg f;

    public agik(ajyg ajygVar, aght aghtVar, String str, byte[] bArr) {
        this.b = str;
        this.f = ajygVar;
        this.d = aghtVar;
    }

    public final synchronized SQLiteDatabase a() {
        try {
            if (this.e == null) {
                ajyg ajygVar = this.f;
                String str = this.b;
                agij agijVar = this.c;
                shf shfVar = (shf) ajygVar.d.get();
                shfVar.getClass();
                Context context = (Context) ajygVar.b.get();
                context.getClass();
                aadw aadwVar = (aadw) ajygVar.a.get();
                aadwVar.getClass();
                agmm agmmVar = (agmm) ajygVar.c.get();
                agmmVar.getClass();
                agijVar.getClass();
                this.e = new agjc(shfVar, context, aadwVar, agmmVar, str, agijVar);
            }
        } catch (SQLiteException e) {
            e = e;
            for (int i = 0; i < this.d.g; i++) {
                try {
                    return this.e.getWritableDatabase();
                } catch (SQLiteException e2) {
                    zga.d("SQLiteException when retrying to get offline database", e2);
                }
            }
            throw e;
        }
        return this.e.getWritableDatabase();
    }
}
