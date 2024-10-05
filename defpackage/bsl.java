package defpackage;

import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsl implements Runnable {
    final /* synthetic */ PreferenceGroup a;

    public bsl(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
