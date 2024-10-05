package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyc implements vym {
    public final VideoMetaData a;
    public final vyk b;
    public final vyb c = new vyb(this);
    public List d;

    public vyc(VideoMetaData videoMetaData) {
        this.a = videoMetaData;
        this.b = new vyk(videoMetaData);
    }

    @Override // defpackage.vym
    public final vya g(long j, boolean z) {
        synchronized (this.b) {
            vya a = this.b.a(j, z);
            if (a == null) {
                return null;
            }
            return a.c();
        }
    }

    @Override // defpackage.vym
    public final vya i(long j) {
        vya b;
        synchronized (this.b) {
            int g = this.a.g(j);
            if (g == -1 || (b = this.b.b(g)) == null) {
                return null;
            }
            return b.c();
        }
    }

    @Override // defpackage.vym
    public final void j() {
        synchronized (this.b) {
            this.b.d();
        }
        List list = this.d;
        if (list != null) {
            list.clear();
        }
    }

    @Override // defpackage.vym
    public final void k(vyl vylVar) {
        if (this.d == null) {
            this.d = new CopyOnWriteArrayList();
        }
        this.d.add(vylVar);
    }

    @Override // defpackage.vym
    public final void l(vyl vylVar) {
        List list = this.d;
        if (list != null) {
            list.remove(vylVar);
        }
    }

    @Override // defpackage.vym
    public final boolean m() {
        synchronized (this.b) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                if (((vya) it.next()).f() == 1) {
                    return false;
                }
            }
            return true;
        }
    }
}
