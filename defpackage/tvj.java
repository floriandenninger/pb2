package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tvj implements tvg {
    private final rbs a;
    private final CallerInfo b;

    public tvj(Context context, rbs rbsVar, String str, amnv amnvVar, amnv amnvVar2) {
        this.a = rbsVar;
        this.b = new CallerInfo(str.length() != 0 ? "profile-".concat(str) : new String("profile-"), 1L);
        context.registerReceiver(new tvh(amnvVar2), new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        context.registerReceiver(new tvi(amnvVar), new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
    }

    @Override // defpackage.tvg
    public final anhy a() {
        Feature[] featureArr;
        Feature[] featureArr2;
        qog qogVar = this.a;
        SyncOptions syncOptions = new SyncOptions();
        final CallerInfo callerInfo = this.b;
        final SyncRequest syncRequest = new SyncRequest(1, new byte[0], syncOptions);
        qrd b = qre.b();
        b.a = new qqu() { // from class: rbv
            @Override // defpackage.qqu
            public final void a(Object obj, Object obj2) {
                SyncRequest syncRequest2 = SyncRequest.this;
                CallerInfo callerInfo2 = callerInfo;
                qdm qdmVar = new qdm((rpv) obj2, 6, (float[]) null);
                rbu rbuVar = (rbu) ((rby) obj).D();
                Parcel pn = rbuVar.pn();
                ecr.i(pn, qdmVar);
                ecr.g(pn, syncRequest2);
                ecr.g(pn, callerInfo2);
                rbuVar.pp(1, pn);
            }
        };
        int i = syncRequest.c - 1;
        if (i == 1 || i == 2 || i == 3) {
            featureArr = new Feature[]{rbr.b};
        } else {
            if (i != 4) {
                featureArr2 = new Feature[0];
                b.b = featureArr2;
                b.c = 15902;
                return amkq.n(rwh.Y(((qob) qogVar).t(b.a())), ufj.a, angq.a);
            }
            featureArr = new Feature[]{rbr.a};
        }
        featureArr2 = featureArr;
        b.b = featureArr2;
        b.c = 15902;
        return amkq.n(rwh.Y(((qob) qogVar).t(b.a())), ufj.a, angq.a);
    }
}
