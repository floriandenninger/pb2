package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rmm extends rmf {
    final /* synthetic */ rpv a;

    public rmm(rpv rpvVar) {
        this.a = rpvVar;
    }

    @Override // defpackage.rmf
    public final void b(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        qar.o(status, openFileDescriptorResponse, this.a);
    }
}
