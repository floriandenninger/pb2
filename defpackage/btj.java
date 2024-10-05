package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btj {
    final HashMap a;
    final String[] b;
    final btl c;
    public bti f;
    volatile buu i;
    jp j = null;
    AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e = false;
    final aba g = new aba();
    Runnable h = new bth(this);

    public btj(btl btlVar, Map map, String... strArr) {
        this.c = btlVar;
        int length = strArr.length;
        this.f = new bti(length);
        this.a = new HashMap();
        Collections.newSetFromMap(new IdentityHashMap());
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str = (String) map.get(strArr[i]);
            if (str != null) {
                this.b[i] = str.toLowerCase(Locale.US);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                HashMap hashMap = this.a;
                hashMap.put(lowerCase3, (Integer) hashMap.get(lowerCase2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(buo buoVar) {
        if (buoVar.i()) {
            return;
        }
        try {
            Lock e = this.c.e();
            e.lock();
            try {
                synchronized (this.f) {
                }
            } finally {
                e.unlock();
            }
        } catch (SQLiteException | IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}
