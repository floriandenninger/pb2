package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.ActionImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anue extends qre implements qpc {
    protected rpv a;
    final /* synthetic */ ActionImpl[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anue(ActionImpl[] actionImplArr) {
        super(null, false, 9004);
        this.e = actionImplArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qre
    public final /* bridge */ /* synthetic */ void a(qnq qnqVar, rpv rpvVar) {
        this.a = rpvVar;
        qcq qcqVar = (qcq) ((qcs) qnqVar).D();
        qct qctVar = new qct(this);
        ActionImpl[] actionImplArr = this.e;
        Parcel pn = qcqVar.pn();
        ecr.i(pn, qctVar);
        pn.writeTypedArray(actionImplArr, 0);
        qcqVar.pp(7, pn);
    }

    @Override // defpackage.qpc
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Status status = (Status) obj;
        if (status.c()) {
            this.a.b(null);
        } else {
            this.a.a(aobq.F(status, "User Action indexing error, please try again."));
        }
    }

    public anue() {
        super(null, false, 9004);
    }
}
