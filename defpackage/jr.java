package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class jr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static Cursor e(btl btlVar, bum bumVar, boolean z) {
        Cursor n = btlVar.n(bumVar);
        if (z && (n instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) n;
            int count = abstractWindowedCursor.getCount();
            int numRows = abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count;
            if (Build.VERSION.SDK_INT < 23 || numRows < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i = 0; i < abstractWindowedCursor.getColumnCount(); i++) {
                            int type = abstractWindowedCursor.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(abstractWindowedCursor.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(abstractWindowedCursor.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = abstractWindowedCursor.getString(i);
                            } else if (type == 4) {
                                objArr[i] = abstractWindowedCursor.getBlob(i);
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    return matrixCursor;
                } finally {
                    abstractWindowedCursor.close();
                }
            }
        }
        return n;
    }

    public static void f(buo buoVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        Cursor b = buoVar.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (true) {
            try {
                if (!b.moveToNext()) {
                    break;
                } else {
                    arrayList.add(b.getString(0));
                }
            } catch (Throwable th) {
                b.close();
                throw th;
            }
        }
        b.close();
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (str.startsWith("room_fts_content_sync_")) {
                buoVar.g("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static int g(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + "`");
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        String str2 = "." + str;
        String str3 = "." + str + "`";
        for (int i = 0; i < columnNames.length; i++) {
            String str4 = columnNames[i];
            if (str4.length() >= str.length() + 2 && (str4.endsWith(str2) || (str4.charAt(0) == '`' && str4.endsWith(str3)))) {
                return i;
            }
        }
        return -1;
    }

    public static int h(Cursor cursor, String str) {
        String str2;
        int g = g(cursor, str);
        if (g >= 0) {
            return g;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception unused) {
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public void c(StaticLayout.Builder builder, TextView textView) {
    }

    public boolean d(TextView textView) {
        return ((Boolean) tn.d(textView, "getHorizontallyScrolling", false)).booleanValue();
    }
}
