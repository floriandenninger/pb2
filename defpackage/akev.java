package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akev implements akdg, akdm {
    public final akeg a;
    public final akep b;
    public final afsy c;
    public final ScheduledExecutorService d;
    public final anic e;
    public final shf f;
    final aker g;
    public final akdj h;
    public final akeh i;
    public long j;
    public final AtomicInteger k;
    public final AtomicBoolean l;
    public acsy m;
    private final wco n;
    private final akdz o;
    private final akec p;
    private final akew q;
    private final AtomicBoolean r;
    private final AtomicLong s;
    private final akbc t;

    public akev(akeg akegVar, akep akepVar, afsy afsyVar, wco wcoVar, ScheduledExecutorService scheduledExecutorService, shf shfVar, akbc akbcVar, akdz akdzVar, akec akecVar, akdj akdjVar, aker akerVar, akeh akehVar, akew akewVar, byte[] bArr) {
        this.a = akegVar;
        akepVar.getClass();
        this.b = akepVar;
        this.g = akerVar;
        amkq.E(!TextUtils.isEmpty(akegVar.a()));
        afsyVar.getClass();
        this.c = afsyVar;
        wcoVar.getClass();
        this.n = wcoVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        this.e = anaf.D(scheduledExecutorService);
        shfVar.getClass();
        this.f = shfVar;
        akbcVar.getClass();
        this.t = akbcVar;
        akdzVar.getClass();
        this.o = akdzVar;
        akecVar.getClass();
        this.p = akecVar;
        this.h = akdjVar;
        this.i = akehVar;
        this.q = akewVar;
        this.k = new AtomicInteger();
        this.r = new AtomicBoolean();
        this.s = new AtomicLong();
        this.l = new AtomicBoolean();
        akmq.a = akegVar.j;
    }

    private final List l(String str) {
        ArrayList arrayList = new ArrayList();
        akdj akdjVar = this.h;
        SQLiteDatabase readableDatabase = akdjVar.a.getReadableDatabase();
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("%");
        sb.append(str);
        sb.append("%");
        Cursor query = readableDatabase.query("suggestions", akdjVar.b, "suggest_intent_query LIKE ?", new String[]{sb.toString()}, null, null, "date DESC");
        try {
            if (query.moveToFirst()) {
                int columnIndex = query.getColumnIndex("suggest_intent_query");
                do {
                    arrayList.add(new akef(query.getString(columnIndex), 1, null));
                } while (query.moveToNext());
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    @Override // defpackage.akdg
    public final void a(aksl akslVar) {
        throw null;
    }

    public final int b() {
        return this.k.get();
    }

    @Override // defpackage.akdm
    public final acsy c() {
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022e A[Catch: IOException -> 0x02bd, TryCatch #0 {IOException -> 0x02bd, blocks: (B:114:0x01b6, B:116:0x01bc, B:122:0x01c6, B:124:0x01fe, B:126:0x0207, B:128:0x0212, B:129:0x020d, B:133:0x0228, B:135:0x022e, B:138:0x024a, B:139:0x023b, B:140:0x024e, B:142:0x0254, B:143:0x025f, B:145:0x0263, B:147:0x0269, B:148:0x027c, B:150:0x0284, B:152:0x028c, B:153:0x0294, B:155:0x029a, B:157:0x02a8, B:158:0x02aa, B:160:0x02ae, B:162:0x02b5), top: B:113:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0254 A[Catch: IOException -> 0x02bd, TryCatch #0 {IOException -> 0x02bd, blocks: (B:114:0x01b6, B:116:0x01bc, B:122:0x01c6, B:124:0x01fe, B:126:0x0207, B:128:0x0212, B:129:0x020d, B:133:0x0228, B:135:0x022e, B:138:0x024a, B:139:0x023b, B:140:0x024e, B:142:0x0254, B:143:0x025f, B:145:0x0263, B:147:0x0269, B:148:0x027c, B:150:0x0284, B:152:0x028c, B:153:0x0294, B:155:0x029a, B:157:0x02a8, B:158:0x02aa, B:160:0x02ae, B:162:0x02b5), top: B:113:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029a A[Catch: IOException -> 0x02bd, TryCatch #0 {IOException -> 0x02bd, blocks: (B:114:0x01b6, B:116:0x01bc, B:122:0x01c6, B:124:0x01fe, B:126:0x0207, B:128:0x0212, B:129:0x020d, B:133:0x0228, B:135:0x022e, B:138:0x024a, B:139:0x023b, B:140:0x024e, B:142:0x0254, B:143:0x025f, B:145:0x0263, B:147:0x0269, B:148:0x027c, B:150:0x0284, B:152:0x028c, B:153:0x0294, B:155:0x029a, B:157:0x02a8, B:158:0x02aa, B:160:0x02ae, B:162:0x02b5), top: B:113:0x01b6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aken d(java.lang.String r27, boolean r28, int r29, java.lang.String r30, boolean r31, java.lang.String r32, long r33) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akev.d(java.lang.String, boolean, int, java.lang.String, boolean, java.lang.String, long):aken");
    }

    public final String e() {
        aftg d = this.n.d((AccountIdentity) this.c.c());
        return d.g() ? d.e() : "";
    }

    public final String f() {
        return this.a.a();
    }

    public final String g() {
        afsx c = this.c.c();
        if (c == null || !c.w()) {
            return null;
        }
        return c.e();
    }

    @Deprecated
    public final synchronized Collection h(String str) {
        return k(str);
    }

    public final synchronized void i() {
        if (this.a.d()) {
            akel akelVar = new akel();
            akelVar.a = this.a.a();
            akelVar.b = akbc.c();
            akelVar.c = this.t.a();
            akelVar.j = this.a.b();
            akelVar.d = "";
            akelVar.e();
            akelVar.q = true;
            akeh akehVar = this.i;
            if (akehVar != null) {
                akelVar.r = String.format("%04X", Integer.valueOf((char) akehVar.c.nextInt(65536)));
            }
            akew akewVar = this.q;
            if (akewVar != null && akewVar.c()) {
                akelVar.f();
                akelVar.t = this.q.b();
                akelVar.u = this.q.a();
            }
            if (this.a.e) {
                akelVar.d(e(), g());
            }
            try {
                akep akepVar = this.b;
                if (akepVar.a == null) {
                    return;
                }
                akelVar.d = "";
                akelVar.e();
                akepVar.b(akelVar);
            } catch (IOException e) {
                akmq.e("Could not background-update zero-prefix cache.", e);
                zga.n("Could not background-update zero-prefix cache.", e);
            }
        }
    }

    public final boolean j() {
        return this.a.d();
    }

    @Deprecated
    public final synchronized Collection k(String str) {
        return d(str, false, -1, null, false, null, -1L).c;
    }
}
