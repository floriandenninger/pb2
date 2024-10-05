package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjc extends yon {
    public final shf a;
    public final agmm c;
    private final zgd d;
    private final aadw e;
    private final agij f;

    public agjc(shf shfVar, Context context, aadw aadwVar, agmm agmmVar, String str, agij agijVar) {
        super(context, str, 37);
        this.d = new agiw(this);
        this.a = shfVar;
        this.c = agmmVar;
        this.f = agijVar;
        this.e = aadwVar;
        atoy n = agzr.n(aadwVar);
        if (n == null || !n.e) {
            return;
        }
        setWriteAheadLoggingEnabled(true);
        yny.b(this, 60000L);
    }

    public static void c(Map map, String str, ContentValues contentValues) {
        map.put(str, contentValues);
    }

    @Override // defpackage.yon
    protected final yom a(int i) {
        boolean z = false;
        if (i >= 0 && i < 37) {
            z = true;
        }
        amkq.E(z);
        return (yom) ((List) this.d.get()).get(i);
    }

    @Override // defpackage.yon
    protected final void b(SQLiteDatabase sQLiteDatabase) {
        yoj.f(sQLiteDatabase);
        agij agijVar = this.f;
        if (agijVar != null) {
            agfo agfoVar = agijVar.a.a;
            agmm agmmVar = (agmm) agfoVar.a.s.get();
            agmm.v(agmmVar.a, agmmVar.c, agmmVar.b, agmmVar.d);
            agml agmlVar = agmmVar.e;
            if (agmlVar != null) {
                ((ageh) agmlVar).h();
            }
            agfp agfpVar = agfoVar.a;
            agfpVar.e.a(agfpVar.G);
            agfp agfpVar2 = agfoVar.a;
            agfpVar2.f.a(agfpVar2.G);
            agfp agfpVar3 = agfoVar.a;
            agfpVar3.g.a(agfpVar3.G);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f != null) {
            sQLiteDatabase.delete("playlistsV13", "placeholder = ?", new String[]{yoj.b(true).toString()});
        }
    }
}
