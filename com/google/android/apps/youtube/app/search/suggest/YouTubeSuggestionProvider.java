package com.google.android.apps.youtube.app.search.suggest;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import defpackage.akef;
import defpackage.akeq;
import defpackage.akev;
import defpackage.alta;
import defpackage.lhi;
import defpackage.zga;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeSuggestionProvider extends ContentProvider {
    private final akev a() {
        return ((lhi) alta.t(getContext(), lhi.class)).ao().a();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "vnd.android.cursor.dir/vnd.android.search.suggest";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        akev a = a();
        if (!a.a.f || a.c.c().g()) {
            return null;
        }
        a.h.a.getWritableDatabase().insert("suggestions", "query", contentValues);
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String lowerCase = (uri.getPathSegments() == null || uri.getLastPathSegment() == null || uri.getPathSegments().size() <= 1) ? "" : uri.getLastPathSegment().toLowerCase(Locale.getDefault());
        akeq akeqVar = new akeq();
        try {
            Collection h = a().h(lowerCase);
            akeqVar.a.clear();
            Iterator it = h.iterator();
            while (it.hasNext()) {
                akeqVar.a.add((akef) it.next());
            }
        } catch (IOException e) {
            zga.n("error fetching suggestions", e);
        }
        return akeqVar;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
