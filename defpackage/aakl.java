package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aakl {
    public final aalo a;
    public final afsx b;
    public final amnv c = amkq.x(new amnv() { // from class: aaki
        @Override // defpackage.amnv
        public final Object get() {
            aakl aaklVar = aakl.this;
            amea ameaVar = aaklVar.e;
            afsx afsxVar = aaklVar.b;
            final aalo aaloVar = aaklVar.a;
            vih vihVar = new vih();
            vihVar.a("CREATE TABLE entity_table(_id INTEGER PRIMARY KEY, key TEXT UNIQUE NOT NULL,last_modified_datetime INTEGER DEFAULT 0,data_type INTEGER DEFAULT 0,metadata BLOB,entity BLOB NOT NULL)");
            vihVar.a("ALTER TABLE entity_table ADD batch_update_timestamp INTEGER DEFAULT 0");
            afxg afxgVar = new afxg();
            amkq.J(true, "You should not include the PRAGMA in your statement: %s", "foreign_keys=ON");
            afxgVar.a.add("foreign_keys=ON");
            vihVar.d = afxgVar;
            vihVar.a("CREATE TABLE entity_associations(parent_entity_key TEXT NOT NULL, child_entity_key TEXT NOT NULL, PRIMARY KEY (parent_entity_key, child_entity_key))");
            vihVar.a.h(new vij() { // from class: aakd
                @Override // defpackage.vij
                public final void a(viq viqVar) {
                    aalo aaloVar2 = aalo.this;
                    Cursor b = viqVar.b("SELECT key, entity, metadata FROM entity_table", new String[0]);
                    while (b.moveToNext()) {
                        try {
                            whu.ag(viqVar, aaloVar2.a(b.getString(0), b.getBlob(1)));
                        } catch (Throwable th) {
                            if (b != null) {
                                try {
                                    b.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (b != null) {
                        b.close();
                    }
                }
            });
            if (vihVar.d == null) {
                vihVar.d = new afxg();
            }
            return ameaVar.b(afsxVar, new vik(vihVar.c, vihVar.a.g(), vihVar.b.g(), vihVar.d, null));
        }
    });
    public final amnv d;
    public final amea e;

    public aakl(afsx afsxVar, amea ameaVar, aalo aaloVar, final azrw azrwVar, byte[] bArr, byte[] bArr2) {
        this.b = afsxVar;
        this.e = ameaVar;
        this.a = aaloVar;
        this.d = amkq.x(new amnv() { // from class: aakj
            @Override // defpackage.amnv
            public final Object get() {
                aakl aaklVar = aakl.this;
                return new aaka((vhj) aaklVar.c.get(), (Set) azrwVar.get(), aaklVar.a);
            }
        });
    }

    public static vin a() {
        vin vinVar = new vin();
        vinVar.b("SELECT ");
        vinVar.b("key");
        vinVar.b(", ");
        vinVar.b("entity");
        vinVar.b(", ");
        vinVar.b("metadata");
        vinVar.b(", ");
        vinVar.b("data_type");
        vinVar.b(", ");
        vinVar.b("batch_update_timestamp");
        vinVar.b(" FROM ");
        vinVar.b("entity_table");
        vinVar.b(" WHERE ");
        vinVar.b("key");
        return vinVar;
    }

    private static vim f(String str) {
        vin a = a();
        a.b("=?");
        a.c(str);
        return a.a();
    }

    public final aaln b(Cursor cursor, String str) {
        if (cursor == null) {
            String valueOf = String.valueOf(str);
            throw aaiq.a(new SQLiteException(valueOf.length() != 0 ? "get got null cursor for key ".concat(valueOf) : new String("get got null cursor for key ")), 3);
        }
        amkq.N(cursor.isBeforeFirst());
        if (cursor.getCount() > 1) {
            String valueOf2 = String.valueOf(str);
            throw aaiq.a(new SQLiteException(valueOf2.length() != 0 ? "get expected at most 1 entity w/ key ".concat(valueOf2) : new String("get expected at most 1 entity w/ key ")), 3);
        }
        if (!cursor.moveToNext()) {
            return aaln.a;
        }
        return d(cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aaln c(viq viqVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return aaln.a;
        }
        try {
            Cursor a = viqVar.a(f(str));
            try {
                aaln b = b(a, str);
                if (a != null) {
                    a.close();
                }
                return b;
            } catch (Throwable th) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw aaiq.a(e, 3);
        }
    }

    public final aaln d(Cursor cursor) {
        aoqa aoqaVar;
        aalm a = aaln.a();
        try {
            a.a = this.a.a(cursor.getString(cursor.getColumnIndexOrThrow("key")), cursor.getBlob(cursor.getColumnIndexOrThrow("entity")));
            try {
                byte[] blob = cursor.getBlob(cursor.getColumnIndex("metadata"));
                a.c(blob == null ? aaku.a : aaku.a(blob));
                try {
                    aoqaVar = aora.d(cursor.getLong(cursor.getColumnIndex("batch_update_timestamp")));
                } catch (Exception unused) {
                    aoqaVar = aalj.a;
                }
                a.b(aoqaVar);
                return a.a();
            } catch (Exception e) {
                throw aaiq.b(e, cursor.getInt(cursor.getColumnIndex("data_type")), 3, 6);
            }
        } catch (Exception e2) {
            throw aaiq.b(e2, cursor.getInt(cursor.getColumnIndex("data_type")), 3, 5);
        }
    }

    public final anhy e(String str) {
        vhj vhjVar = (vhj) this.c.get();
        if (TextUtils.isEmpty(str)) {
            return anaf.O(aaln.a);
        }
        final vim f = f(str);
        angk c = vhjVar.a.b().c(amjk.d(new angg() { // from class: vhh
            @Override // defpackage.angg
            public final angk a(angi angiVar, Object obj) {
                vim vimVar = vim.this;
                vhp vhpVar = (vhp) obj;
                String str2 = vimVar.a;
                Object[] objArr = vimVar.b;
                vhpVar.a();
                vho vhoVar = new vho(vhpVar, objArr, str2);
                int i = vig.a;
                vif vifVar = new vif(vhoVar);
                vhpVar.b.execute(amjk.f(vifVar));
                return angk.a(vifVar, angq.a);
            }
        }), angq.a);
        aakk aakkVar = new aakk(this, str);
        angq angqVar = angq.a;
        return c.g((anht) anfq.i(c.c, new angd(c, aakkVar), angqVar)).h();
    }
}
