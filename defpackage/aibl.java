package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aibl {
    private final aibt a;
    private final SparseArray e;
    private final aibn f;
    private final fnv i;
    private final Set b = new CopyOnWriteArraySet();
    private final Set c = new CopyOnWriteArraySet();
    private final Set d = new CopyOnWriteArraySet();
    private final aibk g = new aibk();
    private volatile aibi h = new aibb();

    static {
        zga.a("PlaybackQueueManager");
    }

    public aibl(aibt aibtVar, fnv fnvVar) {
        this.i = fnvVar;
        this.a = aibtVar;
        aibn aibnVar = new aibn();
        this.f = aibnVar;
        aibnVar.c(this.h);
        this.e = new SparseArray(2);
        int[] iArr = aibi.b;
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            aibr aibrVar = new aibr(i2);
            aibrVar.b(this.h);
            this.e.put(i2, aibrVar);
        }
        c(aibtVar);
        c(this.g);
        aibk aibkVar = this.g;
        this.c.add(aibkVar);
        this.h.m(aibkVar);
    }

    public final int a() {
        return this.h.j();
    }

    public final synchronized aimt b(PlaybackStartDescriptor playbackStartDescriptor) {
        aibc aiazVar;
        aibp aibpVar;
        if (this.h instanceof aibc) {
            aiazVar = (aibc) this.h;
        } else {
            aiazVar = new aiaz(this.h, this.i);
        }
        aibpVar = new aibp(aiazVar, this.a);
        aims c = this.h.t(playbackStartDescriptor) ? null : aibpVar.c(playbackStartDescriptor, null);
        if (c != null) {
            aibpVar.f(c, aibpVar.a(c));
        }
        return aibpVar;
    }

    public final void c(aibg aibgVar) {
        this.d.add(aibgVar);
        this.h.l(aibgVar);
    }

    public final fnt d() {
        aibi aibiVar = this.h;
        int j = aibiVar.j();
        if (j != -1) {
            return aibiVar.y(0, j);
        }
        return null;
    }

    public final synchronized void e(aibi aibiVar) {
        if (this.h == aibiVar) {
            return;
        }
        Object b = this.a.b();
        aibi aibiVar2 = this.h;
        int a = a();
        fnt d = d();
        this.h = aibiVar;
        this.f.c(this.h);
        int[] iArr = aibi.b;
        for (int i = 0; i < 2; i++) {
            ((aibr) this.e.get(iArr[i])).b(this.h);
        }
        int a2 = a();
        fnt d2 = d();
        for (aibh aibhVar : this.c) {
            aibiVar2.s(aibhVar);
            aibiVar.m(aibhVar);
            if (a != a2) {
                aibhVar.d();
            }
        }
        boolean z = !amkq.b(d, d2);
        for (aibg aibgVar : this.d) {
            aibiVar2.r(aibgVar);
            aibiVar.l(aibgVar);
            if (z) {
                aibgVar.a(d2);
            }
        }
        this.a.d(d(), null, true);
        this.a.c(b);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aibj) it.next()).a();
        }
    }
}
