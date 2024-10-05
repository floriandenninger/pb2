package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class buc {
    public Bundle b;
    public boolean c;
    private btz e;
    public final aba a = new aba();
    public boolean d = true;

    public final Bundle a(String str) {
        if (!this.c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.b.remove(str);
        if (this.b.isEmpty()) {
            this.b = null;
        }
        return bundle2;
    }

    public final void b(String str, bub bubVar) {
        if (((bub) this.a.b(str, bubVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void c(Class cls) {
        if (!this.d) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.e == null) {
            this.e = new btz(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.e.a.add(cls.getName());
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
