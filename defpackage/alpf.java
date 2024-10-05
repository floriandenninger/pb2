package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alpf implements alpw {
    private final /* synthetic */ int e;
    public static final /* synthetic */ alpf d = new alpf(3);
    public static final /* synthetic */ alpf c = new alpf(2);
    public static final /* synthetic */ alpf b = new alpf(1);
    public static final /* synthetic */ alpf a = new alpf(0);

    private /* synthetic */ alpf(int i) {
        this.e = i;
    }

    @Override // defpackage.alpw
    public final Object a(IBinder iBinder) {
        int i = this.e;
        if (i == 0) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.prewarm.protocol.IPrewarmService");
            if (queryLocalInterface instanceof alpi) {
                return (alpi) queryLocalInterface;
            }
            return new alpi(iBinder);
        }
        if (i == 1) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface2 instanceof alos) {
                return (alos) queryLocalInterface2;
            }
            return new alos(iBinder);
        }
        if (i != 2) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            if (queryLocalInterface3 instanceof alrd) {
                return (alrd) queryLocalInterface3;
            }
            return new alrd(iBinder);
        }
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        if (queryLocalInterface4 instanceof alov) {
            return (alov) queryLocalInterface4;
        }
        return new alov(iBinder);
    }
}
