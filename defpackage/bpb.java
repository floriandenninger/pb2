package defpackage;

import android.content.ComponentName;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpb {
    public final ComponentName a;

    public bpb(ComponentName componentName) {
        this.a = componentName;
    }

    public final String a() {
        return this.a.getPackageName();
    }

    public final String toString() {
        return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
    }
}
