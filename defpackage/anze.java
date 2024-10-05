package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anze {
    public final SharedPreferences a;
    private final Executor e;
    public final ArrayDeque d = new ArrayDeque();
    public final String b = "topic_operation_queue";
    public final String c = ",";

    public anze(SharedPreferences sharedPreferences, Executor executor) {
        this.a = sharedPreferences;
        this.e = executor;
    }

    public final void a(boolean z) {
        if (z) {
            this.e.execute(new Runnable() { // from class: anzd
                @Override // java.lang.Runnable
                public final void run() {
                    anze anzeVar = anze.this;
                    synchronized (anzeVar.d) {
                        SharedPreferences.Editor edit = anzeVar.a.edit();
                        String str = anzeVar.b;
                        StringBuilder sb = new StringBuilder();
                        Iterator it = anzeVar.d.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                            sb.append(anzeVar.c);
                        }
                        edit.putString(str, sb.toString()).commit();
                    }
                }
            });
        }
    }
}
