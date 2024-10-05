package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wcu implements wcq {
    public final yoi a;
    public final ConditionVariable b;
    public final Executor c;
    private final azrw d;

    public wcu(Context context, Executor executor, azrw azrwVar) {
        this.a = new wdc(context);
        executor.getClass();
        this.c = anaf.E(executor);
        this.d = azrwVar;
        this.b = new ConditionVariable(true);
    }

    public static final AccountIdentity g(Cursor cursor) {
        if (cursor.getInt(3) == 1) {
            return AccountIdentity.s(cursor.getString(0), cursor.getString(1), cursor.getString(4));
        }
        if (cursor.getInt(5) == 1) {
            return AccountIdentity.u(cursor.getString(0), cursor.getString(1), cursor.getString(4), cursor.getInt(7) == 1);
        }
        if (cursor.getInt(6) == 1) {
            return AccountIdentity.q(cursor.getString(0), cursor.getString(1), cursor.getString(4), cursor.getInt(7) == 1);
        }
        return AccountIdentity.n(cursor.getString(0), cursor.getString(1), true ^ cursor.isNull(2) ? cursor.getString(2) : null, cursor.getString(4));
    }

    public static final void h(ContentValues contentValues, String str, aami aamiVar) {
        if (aamiVar == null || !aamiVar.f()) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, aamiVar.e().toByteArray());
        }
    }

    private final Cursor i(String str, String[] strArr, String str2) {
        return this.a.getReadableDatabase().query(str, strArr, "id = ?", new String[]{str2}, null, null, null, "1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        return defpackage.wdk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r0 == null) goto L27;
     */
    @Override // defpackage.wcq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wdk a(com.google.android.libraries.youtube.account.identity.AccountIdentity r7) {
        /*
            r6 = this;
            java.lang.String[] r0 = defpackage.wdb.a
            java.lang.String r1 = r7.d()
            java.lang.String r2 = "profile"
            android.database.Cursor r0 = r6.i(r2, r0, r1)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            if (r1 == 0) goto L7d
            java.lang.String r7 = r7.a()     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r1 = 0
            boolean r2 = r0.isNull(r1)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            if (r2 == 0) goto L36
            wdk r7 = new wdk     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r1 = 3
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r2 = 4
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r3 = 5
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r7.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            goto L77
        L36:
            byte[] r1 = r0.getBlob(r1)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r2 = 1
            byte[] r2 = r0.getBlob(r2)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r3 = 2
            byte[] r3 = r0.getBlob(r3)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            aomw r4 = defpackage.aomw.b()     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            aqyg r5 = defpackage.aqyg.a     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            aonm r1 = defpackage.aonm.parseFrom(r5, r1, r4)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            aqyg r1 = (defpackage.aqyg) r1     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r4 = 0
            if (r2 == 0) goto L61
            avgg r5 = defpackage.avgg.a     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            aonm r2 = defpackage.aonm.parseFrom(r5, r2)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            avgg r2 = (defpackage.avgg) r2     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            aami r5 = new aami     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            goto L62
        L61:
            r5 = r4
        L62:
            if (r3 == 0) goto L71
            avgg r2 = defpackage.avgg.a     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            aonm r2 = defpackage.aonm.parseFrom(r2, r3)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            avgg r2 = (defpackage.avgg) r2     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            aami r4 = new aami     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
        L71:
            wdk r2 = new wdk     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r2.<init>(r7, r1, r5, r4)     // Catch: java.lang.Throwable -> L83 defpackage.aoob -> L85
            r7 = r2
        L77:
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            return r7
        L7d:
            if (r0 == 0) goto L8e
        L7f:
            r0.close()
            goto L8e
        L83:
            r7 = move-exception
            goto L91
        L85:
            r7 = move-exception
            java.lang.String r1 = "Error parsing profile data"
            defpackage.zga.d(r1, r7)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L8e
            goto L7f
        L8e:
            wdk r7 = defpackage.wdk.a
            return r7
        L91:
            if (r0 != 0) goto L94
            goto L97
        L94:
            r0.close()
        L97:
            goto L99
        L98:
            throw r7
        L99:
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcu.a(com.google.android.libraries.youtube.account.identity.AccountIdentity):wdk");
    }

    @Override // defpackage.wcq
    public final afsx b(String str) {
        AccountIdentity accountIdentity = null;
        if (str != null) {
            this.b.block();
            Cursor i = i("identity", wda.a, str);
            try {
                if (i.moveToFirst()) {
                    accountIdentity = g(i);
                    if (i != null) {
                        return accountIdentity;
                    }
                } else if (i != null) {
                    i.close();
                    return null;
                }
            } finally {
                if (i != null) {
                    i.close();
                }
            }
        }
        return accountIdentity;
    }

    @Override // defpackage.wcq
    public final void c(AccountIdentity accountIdentity) {
        if (accountIdentity.g()) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", accountIdentity.d());
        contentValues.put("account", accountIdentity.a());
        contentValues.put("page_id", accountIdentity.e());
        contentValues.put("is_persona", Integer.valueOf(accountIdentity.h() ? 1 : 0));
        contentValues.put(wcy.DATASYNC_ID, accountIdentity.b());
        contentValues.put("is_unicorn", Integer.valueOf(accountIdentity.j() ? 1 : 0));
        contentValues.put("is_griffin", Integer.valueOf(accountIdentity.f() ? 1 : 0));
        contentValues.put("is_teenacorn", Integer.valueOf(accountIdentity.i() ? 1 : 0));
        f("identity", contentValues);
    }

    public final amru d(String str, String str2) {
        this.b.block();
        int i = wda.b;
        amkq.E(true);
        Cursor query = this.a.getReadableDatabase().query("identity", wda.a, str, null, null, null, null, null);
        try {
            if (query.getCount() == 0) {
                amru q = amru.q();
                if (query != null) {
                    query.close();
                }
                return q;
            }
            amrp amrpVar = new amrp();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            while (query.moveToNext()) {
                String string = query.getString(4);
                if (TextUtils.isEmpty(string)) {
                    z = true;
                } else if (!arrayList.contains(string)) {
                    aong aongVar = (aong) alym.a.createBuilder();
                    aongVar.copyOnWrite();
                    alym alymVar = (alym) aongVar.instance;
                    alymVar.b |= 256;
                    alymVar.i = str2;
                    aongVar.copyOnWrite();
                    alym alymVar2 = (alym) aongVar.instance;
                    string.getClass();
                    alymVar2.b |= 1;
                    alymVar2.c = string;
                    amrpVar.h((alym) aongVar.build());
                    arrayList.add(string);
                }
            }
            if (z) {
                afsi.b(2, 34, "[Clockwork][Database] getAccountInfos dropping empty datasyncid");
                acpk acpkVar = (acpk) this.d.get();
                arpn a = arpp.a();
                aone createBuilder = aoux.a.createBuilder();
                createBuilder.copyOnWrite();
                aoux aouxVar = (aoux) createBuilder.instance;
                aouxVar.e = 16;
                aouxVar.b |= 4;
                a.copyOnWrite();
                ((arpp) a.instance).bY((aoux) createBuilder.build());
                acpkVar.a((arpp) a.build());
            }
            amru g = amrpVar.g();
            if (query != null) {
                query.close();
            }
            return g;
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final void e(String str, String str2, String[] strArr) {
        this.b.close();
        this.c.execute(new wcs(this, str, str2, strArr));
    }

    public final void f(String str, ContentValues contentValues) {
        this.b.close();
        this.c.execute(new wct(this, str, contentValues));
    }
}
