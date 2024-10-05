package defpackage;

import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akeq extends AbstractCursor {
    private static final String[] b = {"_id", "suggest_text_1", "suggest_text_2", "suggest_intent_query"};
    public final ArrayList a = new ArrayList(10);

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String[] getColumnNames() {
        return b;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final double getDouble(int i) {
        return Double.parseDouble(getString(i));
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final float getFloat(int i) {
        return Float.parseFloat(getString(i));
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getInt(int i) {
        return Integer.parseInt(getString(i));
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final long getLong(int i) {
        if (i == 0) {
            return this.mPos;
        }
        return Long.parseLong(getString(i));
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final short getShort(int i) {
        return Short.parseShort(getString(i));
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String getString(int i) {
        if (this.mPos < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        }
        if (this.mPos >= this.a.size()) {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
        if (i == 3 || i == 1) {
            return ((akef) this.a.get(this.mPos)).b;
        }
        return null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final boolean isNull(int i) {
        return getString(i) == null;
    }
}
