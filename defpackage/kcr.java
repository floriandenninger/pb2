package defpackage;

import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kcr extends fks {
    private final ypa a;
    private final ayqw b;
    private final aioc c;
    private final Collection d;
    private final Collection e;
    private final Collection f;
    private final Collection g;
    private final Collection h;
    private final Collection i;
    private final Collection j;
    private final aadw k;

    public kcr(ahhc ahhcVar, azrw azrwVar, ypa ypaVar, kfw kfwVar, fln flnVar, xic xicVar, ahvm ahvmVar, ahuq ahuqVar, ahxv ahxvVar, ahyw ahywVar, ahxb ahxbVar, ahxg ahxgVar, kmv kmvVar, xji xjiVar, xiu xiuVar, LiveOverlayPresenter liveOverlayPresenter, ahsl ahslVar, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, ahzg ahzgVar, SubtitlesOverlayPresenter subtitlesOverlayPresenter, ahwu ahwuVar, ahmg ahmgVar, ahmx ahmxVar, ahwy ahwyVar, kec kecVar, kgk kgkVar, MdxOverlaysPresenter mdxOverlaysPresenter, kqy kqyVar, ksm ksmVar, NoSoundMemoOverlay noSoundMemoOverlay, koj kojVar, kmn kmnVar, aadw aadwVar, aioc aiocVar, abje abjeVar) {
        super(flnVar);
        this.a = ypaVar;
        this.k = aadwVar;
        this.c = aiocVar;
        this.b = new ayqw();
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.add(ahhcVar);
        arrayList.add(kfwVar);
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        arrayList2.add(liveOverlayPresenter);
        arrayList2.add(ahmxVar);
        arrayList2.add(ahmgVar);
        arrayList2.add((aioa) azrwVar.get());
        arrayList2.add(ahvmVar.O);
        arrayList2.add(kecVar);
        arrayList2.add(kgkVar);
        ArrayList arrayList3 = new ArrayList();
        this.f = arrayList3;
        arrayList3.add(subtitlesOverlayPresenter);
        arrayList3.add(ahuqVar);
        arrayList3.add(ahwyVar);
        arrayList3.add(ahxvVar);
        arrayList3.add(ahywVar);
        arrayList3.add(ahxbVar);
        arrayList3.add(ahxgVar);
        ArrayList arrayList4 = new ArrayList();
        this.g = arrayList4;
        arrayList4.add(ahwuVar.n);
        arrayList4.add(ahslVar.u);
        arrayList4.add(creatorEndscreenOverlayPresenter.r);
        arrayList4.add(ahzgVar.a);
        ArrayList arrayList5 = new ArrayList();
        this.h = arrayList5;
        arrayList5.add(noSoundMemoOverlay);
        arrayList5.add(kmvVar);
        ArrayList arrayList6 = new ArrayList();
        this.i = arrayList6;
        arrayList6.add(xicVar);
        arrayList6.add(xjiVar);
        arrayList6.add(xiuVar);
        ArrayList arrayList7 = new ArrayList();
        this.j = arrayList7;
        arrayList7.add(ahslVar.b());
        arrayList7.add(creatorEndscreenOverlayPresenter.s);
        arrayList7.add(ahzgVar.b);
        arrayList7.add(ahvmVar.P);
        arrayList7.add(ahwuVar.o);
        arrayList7.add(mdxOverlaysPresenter);
        arrayList7.add(kqyVar);
        arrayList7.add(ksmVar);
        arrayList7.add(kojVar);
        arrayList7.add(kmnVar);
        arrayList7.add(liveOverlayPresenter.h);
        arrayList7.add(abjeVar);
    }

    private final void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ayqx[] kI = ((aioa) it.next()).kI(this.c);
            if (kI != null) {
                this.b.g(kI);
            }
        }
    }

    private final void d(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.b.g(((aioa) it.next()).kI(this.c));
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        this.b.c();
        ArrayList arrayList = new ArrayList();
        if (!evr.au(this.k)) {
            arrayList.addAll(this.h);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.a.m((aioa) arrayList.get(i));
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            this.a.m(it.next());
        }
    }

    @Override // defpackage.flm
    public final void kH() {
        boolean au = evr.au(this.k);
        Collection collection = this.h;
        if (au) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.b.g(((aioa) it.next()).kI(this.c));
            }
        } else {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.a.g((aioa) it2.next());
            }
        }
        d(this.d);
        d(this.i);
        a(this.e);
        a(this.f);
        a(this.g);
        Iterator it3 = this.j.iterator();
        while (it3.hasNext()) {
            this.a.g(it3.next());
        }
    }
}
