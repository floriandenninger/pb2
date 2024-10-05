package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.File;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class php {
    public final pho c;
    public final HashMap a = new HashMap();
    public final SparseArray b = new SparseArray();
    private final SparseBooleanArray d = new SparseBooleanArray();
    private final SparseBooleanArray e = new SparseBooleanArray();

    public php(File file, byte[] bArr, boolean z) {
        this.c = new phn(new File(file, "cached_content_index.exi"), bArr, z);
    }

    public final phm a(String str) {
        return (phm) this.a.get(str);
    }

    public final phm b(String str) {
        phm phmVar = (phm) this.a.get(str);
        if (phmVar != null) {
            return phmVar;
        }
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        phm phmVar2 = new phm(keyAt, str, phr.a);
        this.a.put(str, phmVar2);
        this.b.put(keyAt, str);
        this.e.put(keyAt, true);
        this.c.c();
        return phmVar2;
    }

    public final void c(String str) {
        phm phmVar = (phm) this.a.get(str);
        if (phmVar == null || !phmVar.b() || phmVar.e) {
            return;
        }
        this.a.remove(str);
        int i = phmVar.a;
        boolean z = this.e.get(i);
        ((phn) this.c).a = true;
        if (z) {
            this.b.remove(i);
            this.e.delete(i);
        } else {
            this.b.put(i, null);
            this.d.put(i, true);
        }
    }

    public final void d() {
        pho phoVar = this.c;
        HashMap hashMap = this.a;
        phn phnVar = (phn) phoVar;
        if (phnVar.a) {
            phnVar.a(hashMap);
            phnVar.a = false;
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(this.d.keyAt(i));
        }
        this.d.clear();
        this.e.clear();
    }
}
