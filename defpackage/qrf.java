package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrf implements rox {
    @Override // defpackage.rox
    public final /* bridge */ /* synthetic */ Object a(rpt rptVar) {
        if (((Boolean) rptVar.g()).booleanValue()) {
            return null;
        }
        throw new qnx(new Status(13, "listener already unregistered"));
    }
}
