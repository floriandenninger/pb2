package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uuy implements uvb {
    public final ContentResolver b;
    public final Uri c;
    private final ContentObserver e;
    private final Object f;
    private volatile Map g;
    private final List h;
    private static final Map d = new adz();
    public static final String[] a = {"key", "value"};

    private uuy(ContentResolver contentResolver, Uri uri) {
        uux uuxVar = new uux(this);
        this.e = uuxVar;
        this.f = new Object();
        this.h = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.b = contentResolver;
        this.c = uri;
        contentResolver.registerContentObserver(uri, false, uuxVar);
    }

    public static uuy a(ContentResolver contentResolver, Uri uri) {
        uuy uuyVar;
        synchronized (uuy.class) {
            Map map = d;
            uuyVar = (uuy) map.get(uri);
            if (uuyVar == null) {
                try {
                    uuy uuyVar2 = new uuy(contentResolver, uri);
                    try {
                        map.put(uri, uuyVar2);
                    } catch (SecurityException unused) {
                    }
                    uuyVar = uuyVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return uuyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (uuy.class) {
            for (uuy uuyVar : d.values()) {
                uuyVar.b.unregisterContentObserver(uuyVar.e);
            }
            d.clear();
        }
    }

    public static void f(Uri uri) {
        synchronized (uuy.class) {
            uuy uuyVar = (uuy) d.get(uri);
            if (uuyVar != null) {
                uuyVar.e();
            }
        }
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return (String) c().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map c() {
        Map map;
        Map map2;
        Map map3 = this.g;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f) {
                Map map5 = this.g;
                map = map5;
                if (map5 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map2 = (Map) uqw.d(new uva() { // from class: uuw
                                @Override // defpackage.uva
                                public final Object a() {
                                    Map hashMap;
                                    uuy uuyVar = uuy.this;
                                    Cursor query = uuyVar.b.query(uuyVar.c, uuy.a, null, null, null);
                                    if (query == null) {
                                        return Collections.emptyMap();
                                    }
                                    try {
                                        int count = query.getCount();
                                        if (count == 0) {
                                            return Collections.emptyMap();
                                        }
                                        if (count <= 256) {
                                            hashMap = new adz(count);
                                        } else {
                                            hashMap = new HashMap(count, 1.0f);
                                        }
                                        while (query.moveToNext()) {
                                            hashMap.put(query.getString(0), query.getString(1));
                                        }
                                        query.close();
                                        return hashMap;
                                    } finally {
                                        query.close();
                                    }
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map2 = null;
                    }
                    this.g = map2;
                    allowThreadDiskReads = map2;
                    map = allowThreadDiskReads;
                }
            }
            map4 = map;
        }
        return map4 != null ? map4 : Collections.emptyMap();
    }

    public final void e() {
        synchronized (this.f) {
            this.g = null;
            uvr.f();
        }
        synchronized (this) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((uuz) it.next()).a();
            }
        }
    }
}
