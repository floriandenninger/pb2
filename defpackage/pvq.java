package defpackage;

import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class pvq implements qbj {
    private final /* synthetic */ int d;
    public static final /* synthetic */ pvq c = new pvq(2);
    public static final /* synthetic */ pvq b = new pvq(1);
    public static final /* synthetic */ pvq a = new pvq(0);

    private /* synthetic */ pvq(int i) {
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qbj
    public final Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            if (obj == 0) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
            if (queryLocalInterface instanceof qat) {
                return (qat) queryLocalInterface;
            }
            return new qat(obj);
        }
        if (i != 1) {
            if (obj == 0) {
                return null;
            }
            IInterface queryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
            if (queryLocalInterface2 instanceof pwq) {
                return (pwq) queryLocalInterface2;
            }
            return new pwq(obj);
        }
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface3 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface3 instanceof pwu) {
            return (pwu) queryLocalInterface3;
        }
        return new pwu(obj);
    }
}
