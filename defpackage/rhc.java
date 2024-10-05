package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rhc implements Runnable {
    final /* synthetic */ UserAttributeParcel a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ rff c;

    public rhc(rff rffVar, UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        this.c = rffVar;
        this.a = userAttributeParcel;
        this.b = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.w();
        if (this.a.a() == null) {
            this.c.a.G(this.a, this.b);
        } else {
            this.c.a.L(this.a, this.b);
        }
    }
}
