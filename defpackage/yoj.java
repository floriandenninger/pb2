package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yoj {
    private static final Integer a = 1;
    private static final Integer b = 0;

    public static long a(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = str2.length() != 0 ? " where ".concat(str2) : new String(" where ");
        }
        StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(str3).length());
        sb.append("select count(*) from ");
        sb.append(str);
        sb.append(str3);
        return DatabaseUtils.longForQuery(sQLiteDatabase, sb.toString(), strArr);
    }

    public static Integer b(boolean z) {
        return z ? a : b;
    }

    public static String c(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(str);
            sb.append('.');
            sb.append(str2);
        }
        return sb.toString();
    }

    public static String d(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(str);
            sb.append('.');
            sb.append(str2);
            sb.append(" as ");
            sb.append(e(str, str2));
        }
        return sb.toString();
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append("__");
        }
        sb.append(str2);
        return sb.toString();
    }

    public static void f(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 16 + String.valueOf(string2).length());
                    sb.append("DROP ");
                    sb.append(string);
                    sb.append(" IF EXISTS ");
                    sb.append(string2);
                    String sb2 = sb.toString();
                    try {
                        sQLiteDatabase.execSQL(sb2);
                    } catch (SQLException e) {
                        String valueOf = String.valueOf(sb2);
                        zga.d(valueOf.length() != 0 ? "Error executing ".concat(valueOf) : new String("Error executing "), e);
                    }
                }
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
        if (query != null) {
            query.close();
        }
    }

    public static boolean g(Cursor cursor, int i, boolean z) {
        return !cursor.isNull(i) ? cursor.getInt(i) == 1 : z;
    }

    public static String h(Cursor cursor, int i) {
        return !cursor.isNull(i) ? cursor.getString(i) : "";
    }
}
