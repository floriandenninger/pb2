package defpackage;

import android.app.Activity;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akhk implements akkx {
    public static final amrz a = amrz.m(atua.ADDRESS_BOOK, "android.permission.READ_CONTACTS", atua.ANDROID_CAMERA, "android.permission.CAMERA", atua.WRITE_EXTERNAL_STORAGE, "android.permission.WRITE_EXTERNAL_STORAGE");
    public ajdf b;
    private final Activity c;
    private final SparseArray d = new SparseArray();

    public akhk(Activity activity, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.c = activity;
        azrwVar.getClass();
        azrwVar2.getClass();
        azrwVar3.getClass();
    }

    public final akhj a(atua atuaVar) {
        if (this.d.get(atuaVar.m, null) == null) {
            amrz amrzVar = a;
            if (amrzVar.containsKey(atuaVar)) {
                this.d.put(atuaVar.m, new akhj(this.c, atuaVar, (String) amrzVar.get(atuaVar)));
            }
        }
        if (((akhj) this.d.get(atuaVar.m, null)) != null) {
            return (akhj) this.d.get(atuaVar.m);
        }
        throw new IllegalArgumentException("Unsupported Permission Type");
    }

    final akhj b(atub atubVar) {
        amkq.E(atubVar != null);
        atua b = atua.b(atubVar.c);
        if (b == null) {
            b = atua.INVALID;
        }
        return a(b);
    }

    public final boolean c(atub atubVar) {
        akhj b = b(atubVar);
        return b.a.checkSelfPermission(b.c) == 0;
    }

    public final void d(atub atubVar, akkw akkwVar) {
        akhj b = b(atubVar);
        if (akkwVar != null) {
            b.d = akkwVar;
        }
        b.a.requestPermissions(new String[]{b.c}, b.b.m);
    }
}
