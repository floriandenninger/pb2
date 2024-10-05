package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzu implements zfk {
    public final ajtz a;
    public final Map b;
    public final afzt c;
    public final Handler d;
    private final afzq e;
    private final afzs f;

    public afzu(ajtz ajtzVar, afzq afzqVar, afzt afztVar) {
        ajtzVar.getClass();
        this.a = ajtzVar;
        afzqVar.getClass();
        this.e = afzqVar;
        this.f = new afzs(this);
        this.b = new HashMap();
        afztVar.getClass();
        this.c = afztVar;
        this.d = new Handler(Looper.getMainLooper());
    }

    public static String a(asjl asjlVar) {
        if (TextUtils.isEmpty(asjlVar.e)) {
            String valueOf = String.valueOf(Integer.toHexString(asjlVar.c));
            String valueOf2 = String.valueOf(anbp.f.f().i(asjlVar.d.I()));
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return anbp.f.f().i(asjlVar.e.getBytes(Charset.forName("UTF-8")));
    }

    public final void b(ajce ajceVar) {
        asjj asjjVar = (asjj) ahbj.p(ajceVar, asjj.class);
        asjjVar.getClass();
        asjl asjlVar = asjjVar.c;
        if (asjlVar == null) {
            asjlVar = asjl.a;
        }
        String a = a(asjlVar);
        synchronized (this.b) {
            boolean containsKey = this.b.containsKey(a);
            if (containsKey) {
                this.a.Z(a);
            }
            this.b.put(a, ajceVar);
            if (asjjVar.d != 0) {
                this.a.ah(a, ajceVar, new Timer());
            }
            if (!containsKey) {
                this.e.a(asjlVar, this.f);
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                asjj asjjVar = (asjj) ahbj.p((ajce) it.next(), asjj.class);
                asjjVar.getClass();
                asjl asjlVar = asjjVar.c;
                if (asjlVar == null) {
                    asjlVar = asjl.a;
                }
                synchronized (this.b) {
                    this.a.Z(a(asjlVar));
                    this.b.remove(a(asjlVar));
                    this.e.b(asjlVar, this.f);
                }
            }
        }
    }

    @Override // defpackage.zfk
    public final void j() {
        throw null;
    }
}
