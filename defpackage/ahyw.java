package defpackage;

import android.content.res.Resources;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahyw implements ahyt, aioa, ypd {
    protected final ahyu a;
    private final Resources b;
    private final ainy c;

    public ahyw(Resources resources, ainy ainyVar, ahyu ahyuVar) {
        resources.getClass();
        this.b = resources;
        this.c = ainyVar;
        ahyuVar.getClass();
        this.a = ahyuVar;
        ahyuVar.pz(this);
    }

    public void g(aeqq aeqqVar) {
        if (aeqqVar.f() == null) {
            return;
        }
        this.a.m(aeqqVar.j());
        if (aeqqVar.j()) {
            VideoQuality[] l = aeqqVar.l();
            int length = l.length;
            int i = length + 1;
            VideoQuality[] videoQualityArr = new VideoQuality[i];
            videoQualityArr[0] = new VideoQuality(-2, this.b.getString(R.string.quality_auto), false);
            System.arraycopy(l, 0, videoQualityArr, 1, length);
            int i2 = -1;
            int f = aeqqVar.f() != null ? aeqqVar.f().f() : -1;
            int i3 = 0;
            while (true) {
                if (i3 >= i) {
                    break;
                }
                if (videoQualityArr[i3].a == f) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            this.a.o(videoQualityArr, i2, aeqqVar.g() == null || !aeqqVar.g().d());
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().k.h(ahbw.g(aiocVar.aC(), 4194304L)).h(ahbw.e(0)).Y(new ayrs() { // from class: ahyv
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahyw.this.g((aeqq) obj);
            }
        }, ahwx.h)};
    }

    @Override // defpackage.ypd
    public Class[] kz(Class cls, Object obj, int i) {
        return ahbn.b(this, obj, i);
    }

    @Override // defpackage.ahyt
    public final void x(int i) {
        aiwk aiwkVar = this.c.p.a;
        if (aiwkVar == null) {
            return;
        }
        aiwkVar.O(i);
    }

    @Override // defpackage.ahyt
    public final void y(avzr avzrVar) {
        aiwk aiwkVar = this.c.p.a;
        if (aiwkVar == null) {
            return;
        }
        aiwkVar.P(avzrVar);
    }
}
