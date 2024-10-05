package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.MutateRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anub extends qre {
    final /* synthetic */ anuc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anub(anuc anucVar) {
        super(null, false, 9002);
        this.a = anucVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qre
    public final /* bridge */ /* synthetic */ void a(qnq qnqVar, rpv rpvVar) {
        anuf anufVar = (anuf) ((anty) qnqVar).D();
        anua anuaVar = new anua(this, rpvVar);
        MutateRequest mutateRequest = this.a.a;
        Parcel pn = anufVar.pn();
        ecr.i(pn, anuaVar);
        ecr.g(pn, mutateRequest);
        Parcel po = anufVar.po(8, pn);
        CallStatus callStatus = (CallStatus) ecr.a(po, CallStatus.CREATOR);
        po.recycle();
        int i = callStatus == null ? 2 : callStatus.a;
        boolean z = true;
        anuc anucVar = null;
        if (i != 3) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("API call failed. Status code: ");
                sb.append(i);
                String sb2 = sb.toString();
                if (Log.isLoggable("FirebaseAppIndex", 6) || Log.isLoggable("FirebaseAppIndex", 6)) {
                    Log.e("FirebaseAppIndex", sb2);
                }
                if (rpvVar.d(null)) {
                    this.a.b.a(new antq("Indexing error."));
                }
            }
            synchronized (this.a.c.b) {
                if (((anuc) this.a.c.b.poll()) != this.a) {
                    z = false;
                }
                qip.av(z);
                anucVar = (anuc) this.a.c.b.peek();
                this.a.c.c = 0;
            }
        } else if (rpvVar.d(null)) {
            synchronized (this.a.c.b) {
                anud anudVar = this.a.c;
                if (anudVar.c == 0) {
                    anuc anucVar2 = (anuc) anudVar.b.peek();
                    qip.av(anucVar2 == this.a);
                    anucVar = anucVar2;
                } else {
                    anudVar.c = 2;
                }
            }
        }
        if (anucVar != null) {
            anucVar.a();
        }
    }
}
