package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrn implements ajom {
    public final aahd a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final ProgressBar g;
    private final ProgressBar h;
    private final ProgressBar i;
    private final ProgressBar j;
    private final RelativeLayout k;
    private final View l;
    private final msl m;
    private final Context n;
    private final ajjz o;
    private final ajop p;
    private final ajuw q;
    private final axze r;

    public mrn(Context context, aahd aahdVar, ajjz ajjzVar, gma gmaVar, ajuw ajuwVar, axze axzeVar, byte[] bArr) {
        this.n = context;
        this.o = ajjzVar;
        this.a = aahdVar;
        this.r = axzeVar;
        View inflate = View.inflate(context, R.layout.pending_video_upload_item, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.upload_status_message);
        this.e = (TextView) inflate.findViewById(R.id.upload_status_detailed_message);
        this.f = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = (ProgressBar) inflate.findViewById(R.id.transcoding_progressbar);
        this.h = (ProgressBar) inflate.findViewById(R.id.copy_file_progressbar);
        this.i = (ProgressBar) inflate.findViewById(R.id.upload_progressbar);
        this.j = (ProgressBar) inflate.findViewById(R.id.processing_progressbar);
        this.k = (RelativeLayout) inflate.findViewById(R.id.thumbnail_layout);
        this.l = inflate.findViewById(R.id.contextual_menu_anchor);
        this.m = new msl((ViewStub) inflate.findViewById(R.id.privacy_badge), context);
        this.p = gmaVar;
        this.q = ajuwVar;
        gmaVar.c(inflate);
    }

    private final String e(goc gocVar) {
        double d = gocVar.k;
        if (Double.isNaN(d)) {
            return null;
        }
        if (Double.isInfinite(d)) {
            if (gocVar.f()) {
                return this.n.getResources().getString(R.string.upload_waiting_wifi);
            }
            if (gocVar.e()) {
                return this.n.getResources().getString(R.string.upload_waiting_network);
            }
            return this.n.getResources().getString(R.string.upload_transfer_pending);
        }
        int i = (int) d;
        int i2 = i / 60;
        int i3 = i2 / 60;
        if (i <= 1) {
            return null;
        }
        if (i <= 90) {
            return this.n.getResources().getQuantityString(R.plurals.upload_seconds_remaing, i, Integer.valueOf(i));
        }
        if (i2 <= 90) {
            return this.n.getResources().getQuantityString(R.plurals.upload_minutes_remaing, i2, Integer.valueOf(i2));
        }
        if (i3 <= 3) {
            return this.n.getResources().getQuantityString(R.plurals.upload_hours_remaing, i3, Integer.valueOf(i3));
        }
        return null;
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.p).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    final int d(int i) {
        return (int) TypedValue.applyDimension(1, i, this.n.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0230, code lost:
    
        if (r19 != (-1.0d)) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02cc  */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void oB(defpackage.ajok r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrn.oB(ajok, java.lang.Object):void");
    }
}
