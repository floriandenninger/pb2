package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mso extends kwy {
    public final ImageView o;
    final /* synthetic */ msp p;
    private final ajoi q;
    private final int r;
    private final PlaylistThumbnailView s;
    private final PlaylistThumbnailView t;
    private final PlaylistThumbnailView u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mso(msp mspVar, Context context, ajjz ajjzVar, int i, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        super(context, ajjzVar, ajuwVar, i, ajutVar);
        this.p = mspVar;
        this.q = new ajoi(aahdVar, gmaVar);
        this.r = i;
        this.s = (PlaylistThumbnailView) this.c.findViewById(R.id.playlist_thumbnail_start);
        this.t = (PlaylistThumbnailView) this.c.findViewById(R.id.playlist_thumbnail_top_end);
        this.u = (PlaylistThumbnailView) this.c.findViewById(R.id.playlist_thumbnail);
        this.o = (ImageView) this.c.findViewById(R.id.channel_avatar);
    }

    public static final apxf o(apsq apsqVar) {
        apsr apsrVar = apsqVar.c;
        if (apsrVar == null) {
            apsrVar = apsr.a;
        }
        if ((apsrVar.b & 2) == 0) {
            return null;
        }
        apsr apsrVar2 = apsqVar.c;
        if (apsrVar2 == null) {
            apsrVar2 = apsr.a;
        }
        apxf apxfVar = apsrVar2.d;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.kwy, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.q.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    @Override // defpackage.ajom
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oB(defpackage.ajok r11, defpackage.auip r12) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mso.oB(ajok, auip):void");
    }
}
