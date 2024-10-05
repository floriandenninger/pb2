package defpackage;

import android.util.Log;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psp {
    private final String[] a;
    private boolean b;
    private boolean c;

    public psp(String... strArr) {
        this.a = strArr;
    }

    public final synchronized boolean a() {
        if (this.b) {
            return this.c;
        }
        this.b = true;
        try {
            for (String str : this.a) {
                System.loadLibrary(str);
            }
            this.c = true;
        } catch (UnsatisfiedLinkError unused) {
            String valueOf = String.valueOf(Arrays.toString(this.a));
            Log.w("LibraryLoader", valueOf.length() != 0 ? "Failed to load ".concat(valueOf) : new String("Failed to load "));
        }
        return this.c;
    }
}
