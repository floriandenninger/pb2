package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DownloadReelItem$DownloadReelItemEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iev implements aaha {
    public final Context a;
    public final ili b;
    public iok c;
    public int d = 0;
    private final afsy e;
    private final afvb f;
    private final ysl g;

    public iev(Context context, afsy afsyVar, afvb afvbVar, ysl yslVar, ili iliVar) {
        this.a = context;
        afsyVar.getClass();
        this.e = afsyVar;
        this.f = afvbVar;
        yslVar.getClass();
        this.g = yslVar;
        iliVar.getClass();
        this.b = iliVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.d = this.b.a();
        DownloadReelItem$DownloadReelItemEndpoint downloadReelItem$DownloadReelItemEndpoint = (DownloadReelItem$DownloadReelItemEndpoint) apxfVar.pX(DownloadReelItem$DownloadReelItemEndpoint.downloadReelItemEndpoint);
        AlertDialog create = new AlertDialog.Builder(this.a).setMessage(R.string.download_reel_item_in_progress).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ies
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                iev ievVar = iev.this;
                ievVar.b.c(ievVar.d);
                ievVar.d = 0;
            }
        });
        create.setButton(-2, this.a.getString(android.R.string.cancel), new DialogInterface.OnClickListener() { // from class: ier
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                iev.this.c.a = true;
            }
        });
        create.show();
        iok iokVar = new iok(downloadReelItem$DownloadReelItemEndpoint.b, this.e.c(), this.f, this.a.getContentResolver(), new ieu(this, create));
        this.c = iokVar;
        this.g.a(iokVar);
    }
}
