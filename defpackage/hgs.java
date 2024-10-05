package defpackage;

import android.content.DialogInterface;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hgs implements DialogInterface.OnClickListener {
    private final /* synthetic */ int m;
    public static final /* synthetic */ hgs l = new hgs(17);
    public static final /* synthetic */ hgs k = new hgs(16);
    public static final /* synthetic */ hgs j = new hgs(15);
    public static final /* synthetic */ hgs i = new hgs(14);
    public static final /* synthetic */ hgs h = new hgs(9);
    public static final /* synthetic */ hgs g = new hgs(7);
    public static final /* synthetic */ hgs f = new hgs(6);
    public static final /* synthetic */ hgs e = new hgs(5);
    public static final /* synthetic */ hgs d = new hgs(4);
    public static final /* synthetic */ hgs c = new hgs(2);
    public static final /* synthetic */ hgs b = new hgs(1);
    public static final /* synthetic */ hgs a = new hgs(0);

    public /* synthetic */ hgs(int i2) {
        this.m = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.m) {
            case 0:
                dialogInterface.dismiss();
                return;
            case 1:
                return;
            case 2:
                dialogInterface.dismiss();
                return;
            case 3:
                dialogInterface.dismiss();
                return;
            case 4:
                return;
            case 5:
                dialogInterface.dismiss();
                return;
            case 6:
                dialogInterface.dismiss();
                return;
            case 7:
                dialogInterface.dismiss();
                return;
            case 8:
                dialogInterface.cancel();
                return;
            case 9:
                dialogInterface.dismiss();
                return;
            case 10:
                dialogInterface.dismiss();
                return;
            case 11:
                dialogInterface.dismiss();
                return;
            case 12:
                dialogInterface.dismiss();
                return;
            case 13:
                throw null;
            case 14:
                dialogInterface.dismiss();
                return;
            case 15:
                int i3 = DownloadNetworkSelectionDialogPreference.f;
                dialogInterface.dismiss();
                return;
            case 16:
                dialogInterface.cancel();
                return;
            case 17:
            case 18:
                return;
            default:
                dialogInterface.cancel();
                return;
        }
    }
}
