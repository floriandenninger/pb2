package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agek {
    private final SharedPreferences a;
    private final Map b = new HashMap();
    private final ajkn c;

    public agek(SharedPreferences sharedPreferences, ajkn ajknVar, byte[] bArr) {
        this.a = sharedPreferences;
        this.c = ajknVar;
    }

    public final synchronized phg a(File file) {
        String absolutePath = file.getAbsolutePath();
        if (!this.b.containsKey(absolutePath)) {
            phy phyVar = new phy(file, new phv(), this.c.e(this.a).getEncoded(), true);
            this.b.put(absolutePath, phyVar);
            return phyVar;
        }
        return (phg) this.b.get(absolutePath);
    }

    public final synchronized void b() {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((phg) it.next()).i();
        }
        this.b.clear();
    }
}
