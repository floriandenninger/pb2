package defpackage;

import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class snf {
    public JSControllerInitializationMode a;
    public Boolean b;
    public Integer c;
    public Boolean d;

    public final void a(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void b(JSControllerInitializationMode jSControllerInitializationMode) {
        if (jSControllerInitializationMode == null) {
            throw new NullPointerException("Null initializationMode");
        }
        this.a = jSControllerInitializationMode;
    }

    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }
}
