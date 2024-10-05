package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aisc implements ayrs {
    public final /* synthetic */ aisf a;
    private final /* synthetic */ int b;

    public /* synthetic */ aisc(aisf aisfVar, int i) {
        this.b = i;
        this.a = aisfVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        SubtitleTrack c;
        int i = this.b;
        if (i == 0) {
            aisf aisfVar = this.a;
            if (((ahcu) obj).a()) {
                return;
            }
            aips a = aisfVar.c.a();
            a.b(null);
            a.b = "";
            ynm.m(a.a(), ailg.e);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                this.a.r = ((ahel) obj).a();
                return;
            }
            aisf aisfVar2 = this.a;
            aisfVar2.r = ((ahel) obj).a();
            aisfVar2.s = false;
            return;
        }
        aisf aisfVar3 = this.a;
        aiuj aiujVar = aisfVar3.n;
        FormatStreamModel e = ((aeqq) obj).e();
        if (aiujVar == null || e == null || e.q().isEmpty()) {
            return;
        }
        String q = e.q();
        Iterator it = aiujVar.a.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            atyd atydVar = (atyd) it.next();
            if (TextUtils.equals(q, atydVar.c)) {
                aiujVar.b = atydVar;
                break;
            }
        }
        SubtitleTrack subtitleTrack = aisfVar3.m;
        if (subtitleTrack != null && subtitleTrack.l()) {
            aisfVar3.m = null;
        }
        SubtitleTrack subtitleTrack2 = aisfVar3.m;
        if (subtitleTrack2 != null && (c = aiujVar.c(subtitleTrack2.c())) != null) {
            aisfVar3.m = c;
        }
        aisfVar3.h(aisfVar3.m, false);
    }
}
