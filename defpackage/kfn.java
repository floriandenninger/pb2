package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kfn implements ahxt {
    private static final amru b = amru.t("en_US", "en_CA", "es_MX");
    public final kfo a;
    private final ci c;
    private final ainy d;
    private final kem e;
    private final kfm f;
    private final Context g;
    private boolean h;
    private final aadw i;

    public kfn(Context context, ci ciVar, ainy ainyVar, kfm kfmVar, kfo kfoVar, aadw aadwVar) {
        this.g = context;
        ciVar.getClass();
        this.c = ciVar;
        this.d = ainyVar;
        this.f = kfmVar;
        this.a = kfoVar;
        kem kemVar = new kem(ciVar.getString(R.string.subtitles), new kfl(this));
        this.e = kemVar;
        kemVar.g(true);
        this.i = aadwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(SubtitleTrack subtitleTrack) {
        if (subtitleTrack == null || subtitleTrack.p() || subtitleTrack.l()) {
            return null;
        }
        return subtitleTrack.toString();
    }

    public final kem a() {
        if (evr.aQ(this.i) && !evr.aR(this.i)) {
            this.e.g(false);
        }
        return this.e;
    }

    public final void c() {
        this.d.C(new kfk(this));
    }

    @Override // defpackage.ahxt
    public final void e(boolean z) {
        this.e.e = whu.y(this.g, b.contains(this.c.getResources().getConfiguration().locale.toString()) ? z ? R.drawable.yt_fill_closed_caption_black_24 : R.drawable.yt_outline_closed_caption_black_24 : z ? R.drawable.quantum_ic_subtitles_googblue_24 : R.drawable.quantum_ic_subtitles_grey600_24, R.attr.ytTextPrimary);
    }

    @Override // defpackage.ahxt
    public final void g(boolean z) {
        this.h = z;
    }

    @Override // defpackage.ahxt
    public final void j(SubtitleTrack subtitleTrack) {
        String string;
        this.f.a(subtitleTrack);
        kem kemVar = this.e;
        if (this.h) {
            string = b(subtitleTrack);
        } else {
            string = this.c.getString(R.string.subtitles_unavailable_menu_item_secondary_text);
        }
        kemVar.d(string);
    }

    @Override // defpackage.ahxt
    public final void l(ahxs ahxsVar) {
        this.f.b(ahxsVar);
    }

    @Override // defpackage.ahxt
    public final void q(List list) {
        this.f.c(list);
        this.f.d(this.c);
    }
}
