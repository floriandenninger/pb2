package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qre {
    public final Feature[] b;
    public final boolean c;
    public final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public qre(Feature[] featureArr, boolean z, int i) {
        this.b = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }

    public static qrd b() {
        return new qrd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(qnq qnqVar, rpv rpvVar);
}
