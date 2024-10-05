package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vfi implements Callable {
    public final /* synthetic */ vfn a;
    private final /* synthetic */ int b;

    public /* synthetic */ vfi(vfn vfnVar, int i) {
        this.b = i;
        this.a = vfnVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            vfn vfnVar = this.a;
            vfnVar.e = vfnVar.a.getSharedPreferences(vfnVar.b, 0);
            Set set = vfnVar.c;
            if (set == null) {
                return Boolean.valueOf(!vfnVar.e.getAll().isEmpty());
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (vfnVar.e.contains((String) it.next())) {
                    return true;
                }
            }
            return false;
        }
        vfn vfnVar2 = this.a;
        Set<String> set2 = vfnVar2.c;
        if (set2 == null) {
            set2 = vfnVar2.e.getAll().keySet();
        }
        SharedPreferences.Editor edit = vfnVar2.e.edit();
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            edit.remove(it2.next());
        }
        if (!edit.commit()) {
            String valueOf = String.valueOf(vfnVar2.b);
            throw new IOException(valueOf.length() != 0 ? "Failed to remove migrated SharedPreferences keys: ".concat(valueOf) : new String("Failed to remove migrated SharedPreferences keys: "));
        }
        if (!vfnVar2.d || !vfnVar2.e.getAll().isEmpty()) {
            return null;
        }
        File file = new File(new File(vfnVar2.a.getApplicationInfo().dataDir, "shared_prefs"), String.valueOf(vfnVar2.b).concat(".xml"));
        File file2 = new File(String.valueOf(file.getPath()).concat(".bak"));
        file.delete();
        file2.delete();
        if (!file.exists() && !file2.exists()) {
            return null;
        }
        String valueOf2 = String.valueOf(vfnVar2.b);
        throw new IOException(valueOf2.length() != 0 ? "Failed to delete empty SharedPreferences file: ".concat(valueOf2) : new String("Failed to delete empty SharedPreferences file: "));
    }
}
