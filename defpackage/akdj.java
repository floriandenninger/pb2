package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akdj {
    public final SQLiteOpenHelper a;
    public final String[] b = {"0 AS suggest_format", "display1 AS suggest_text_1", "display2 AS suggest_text_2", "query AS suggest_intent_query", "_id"};

    public akdj(Context context) {
        this.a = new akdi(context);
    }
}
