package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahxo implements ahxt {
    private final List a;

    public ahxo(ahxt... ahxtVarArr) {
        List asList = Arrays.asList(ahxtVarArr);
        asList.getClass();
        this.a = asList;
    }

    @Override // defpackage.ahxt
    public final void e(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxt) it.next()).e(z);
        }
    }

    @Override // defpackage.ahxt
    public final void g(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxt) it.next()).g(z);
        }
    }

    @Override // defpackage.ahxt
    public final void j(SubtitleTrack subtitleTrack) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxt) it.next()).j(subtitleTrack);
        }
    }

    @Override // defpackage.ahxt
    public final void l(ahxs ahxsVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxt) it.next()).l(ahxsVar);
        }
    }

    @Override // defpackage.ahxt
    public final void q(List list) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxt) it.next()).q(list);
        }
    }
}
