package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btk {
    public ArrayList a;
    public Executor b;
    public buj c;
    public boolean d;
    public boolean f;
    private final Class g;
    private final String h;
    private final Context i;
    private Executor j;
    private Set k;
    public boolean e = true;
    private final apt l = new apt((byte[]) null);

    public btk(Context context, Class cls, String str) {
        this.i = context;
        this.g = cls;
        this.h = str;
    }

    public final btl a() {
        Executor executor;
        if (this.i == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = this.b;
        if (executor2 == null && this.j == null) {
            Executor executor3 = aar.a;
            this.j = executor3;
            this.b = executor3;
        } else if (executor2 != null && this.j == null) {
            this.j = executor2;
        } else if (executor2 == null && (executor = this.j) != null) {
            this.b = executor;
        }
        buj bujVar = this.c;
        if (bujVar == null) {
            bujVar = new bus();
        }
        buj bujVar2 = bujVar;
        Context context = this.i;
        String str = this.h;
        apt aptVar = this.l;
        ArrayList arrayList = this.a;
        boolean z = this.d;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int i = 2;
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            i = 3;
        }
        bte bteVar = new bte(context, str, bujVar2, aptVar, arrayList, z, i, this.b, this.j, this.e, this.f, null);
        btl btlVar = (btl) jq.g(this.g);
        btlVar.b = btlVar.b(bteVar);
        Set d = btlVar.d();
        BitSet bitSet = new BitSet();
        Iterator it = d.iterator();
        while (true) {
            int i2 = -1;
            if (!it.hasNext()) {
                for (int size = bteVar.f.size() - 1; size >= 0; size--) {
                    if (!bitSet.get(size)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Map map = btlVar.e;
                Iterator it2 = btlVar.m().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    btt bttVar = (btt) it2.next();
                    if (!Collections.unmodifiableMap(bteVar.m.a).containsKey(Integer.valueOf(bttVar.a))) {
                        bteVar.m.d(bttVar);
                    }
                }
                if (((bto) btl.p(bto.class, btlVar.b)) != null) {
                    throw null;
                }
                if (((btd) btl.p(btd.class, btlVar.b)) != null) {
                    throw null;
                }
                boolean z2 = bteVar.l == 3;
                buk bukVar = btlVar.b;
                synchronized (((bur) bukVar).a) {
                    buq buqVar = ((bur) bukVar).b;
                    if (buqVar != null) {
                        buqVar.setWriteAheadLoggingEnabled(z2);
                    }
                    ((bur) bukVar).c = z2;
                }
                btlVar.d = bteVar.d;
                btlVar.a = bteVar.h;
                new btr(bteVar.i);
                btlVar.c = bteVar.g;
                Map c = btlVar.c();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : c.entrySet()) {
                    Class cls = (Class) entry.getKey();
                    for (Class cls2 : (List) entry.getValue()) {
                        int size2 = bteVar.e.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                size2 = -1;
                                break;
                            }
                            if (cls2.isAssignableFrom(bteVar.e.get(size2).getClass())) {
                                bitSet2.set(size2);
                                break;
                            }
                            size2--;
                        }
                        if (size2 < 0) {
                            throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.");
                        }
                        btlVar.f.put(cls2, bteVar.e.get(size2));
                    }
                }
                for (int size3 = bteVar.e.size() - 1; size3 >= 0; size3--) {
                    if (!bitSet2.get(size3)) {
                        throw new IllegalArgumentException("Unexpected type converter " + bteVar.e.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return btlVar;
            }
            Class cls3 = (Class) it.next();
            int size4 = bteVar.f.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (cls3.isAssignableFrom(bteVar.f.get(size4).getClass())) {
                    bitSet.set(size4);
                    i2 = size4;
                    break;
                }
                size4--;
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.");
            }
            btlVar.e.put(cls3, (bts) bteVar.f.get(i2));
        }
    }

    public final void b(btt... bttVarArr) {
        if (this.k == null) {
            this.k = new HashSet();
        }
        for (int i = 0; i <= 0; i++) {
            btt bttVar = bttVarArr[i];
            this.k.add(Integer.valueOf(bttVar.a));
            this.k.add(Integer.valueOf(bttVar.b));
        }
        this.l.d(bttVarArr);
    }
}
