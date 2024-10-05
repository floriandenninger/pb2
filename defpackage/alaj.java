package defpackage;

import android.net.Uri;
import android.util.ArrayMap;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alaj {
    private final HashMap a = new HashMap();
    private final Map b = new ArrayMap();

    public final alai a(Uri uri) {
        if (uri == null) {
            throw new FileNotFoundException("Null Uri scheme");
        }
        alai alaiVar = (alai) this.a.get(uri.getScheme());
        if (alaiVar != null) {
            return alaiVar;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unsupported Uri scheme: ");
        sb.append(valueOf);
        throw new FileNotFoundException(sb.toString());
    }

    public final void b(alai alaiVar) {
        this.a.put(alaiVar.a(), alaiVar);
    }

    public final void c() {
        synchronized (this.b) {
            Iterator it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                alaf alafVar = (alaf) ((Map.Entry) it.next()).getValue();
                if (alafVar != null) {
                    alafVar.j();
                }
                it.remove();
            }
        }
    }

    public final alaf d(int i, Uri uri, alae alaeVar) {
        alaf alafVar;
        synchronized (this.b) {
            alafVar = (alaf) this.b.get(uri);
            if (alafVar == null || !alafVar.l()) {
                alafVar = a(uri).b(i, uri, alaeVar);
                this.b.put(uri, alafVar);
            }
        }
        return alafVar;
    }
}
