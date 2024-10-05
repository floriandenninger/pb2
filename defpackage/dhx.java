package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhx {
    public static final Object a = new Object();
    public static final Map b = new HashMap(4);
    public static final WeakHashMap c = new WeakHashMap();
    private static final WeakHashMap d = new WeakHashMap();
    private static dhw e;

    public static dkt a(Context context, dhk dhkVar) {
        synchronized (a) {
            Map map = b;
            SparseArray sparseArray = (SparseArray) map.get(context);
            if (sparseArray == null) {
                if (c.containsKey(did.a(context))) {
                    return null;
                }
                if (!d.containsKey(context) && e == null) {
                    e = new dhw();
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(e);
                }
                sparseArray = new SparseArray();
                map.put(context, sparseArray);
            }
            dkt dktVar = (dkt) sparseArray.get(dhkVar.u);
            if (dktVar == null) {
                dktVar = dhkVar.I();
                sparseArray.put(dhkVar.u, dktVar);
            }
            return dktVar;
        }
    }
}
