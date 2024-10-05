package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amad implements Callable {
    public final /* synthetic */ amae a;
    private final /* synthetic */ int b;

    public /* synthetic */ amad(amae amaeVar, int i) {
        this.b = i;
        this.a = amaeVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            File file = new File(this.a.c.a.getApplicationInfo().dataDir, "shared_prefs/accounts.xml");
            if (!file.exists()) {
                file = new File(String.valueOf(file.getPath()).concat(".bak"));
            }
            return Boolean.valueOf(file.exists());
        }
        amaf amafVar = (amaf) this.a.a.get();
        SharedPreferences.Editor edit = amafVar.a.edit();
        ArrayList arrayList = amafVar.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            edit.remove((String) arrayList.get(i));
        }
        amafVar.b.clear();
        return Boolean.valueOf(edit.commit());
    }
}
