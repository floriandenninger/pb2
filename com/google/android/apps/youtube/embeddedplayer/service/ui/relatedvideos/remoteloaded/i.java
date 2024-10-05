package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.youtube.R;
import defpackage.alta;
import defpackage.aomf;
import defpackage.oba;
import defpackage.vw;
import defpackage.wv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class i extends vw {
    private static final List f = new ArrayList();
    public List d = f;
    public final AtomicBoolean e;
    private final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d g;
    private final WeakReference h;
    private final boolean i;
    private final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e j;

    public i(boolean z, com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e eVar, WeakReference weakReference, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar, AtomicBoolean atomicBoolean) {
        this.i = z;
        this.j = eVar;
        this.h = weakReference;
        this.g = dVar;
        this.e = atomicBoolean;
    }

    @Override // defpackage.vw
    public final int b() {
        List list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        View inflate;
        boolean z = this.i;
        com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e eVar = this.j;
        WeakReference weakReference = this.h;
        int i2 = h.B;
        if (z) {
            try {
                inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.related_video_item, viewGroup, false);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Error inflating related videos: ");
                sb.append(valueOf);
                alta.B(sb.toString(), new Object[0]);
                return new h(viewGroup.getContext(), new View(viewGroup.getContext()), eVar, weakReference);
            }
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.related_video_item, viewGroup, false);
        }
        final h hVar = new h(inflate, eVar, weakReference);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectableItemKey selectableItemKey;
                h hVar2 = h.this;
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c cVar = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) hVar2.y.get();
                if (cVar == null || (selectableItemKey = hVar2.u) == null) {
                    return;
                }
                try {
                    cVar.a(selectableItemKey);
                } catch (RemoteException unused) {
                }
            }
        });
        return hVar;
    }

    @Override // defpackage.vw
    public final long mu(int i) {
        if (((RelatedVideoItem) this.d.get(i)).h() != null) {
            return r3.hashCode();
        }
        return 0L;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        h hVar = (h) wvVar;
        RelatedVideoItem relatedVideoItem = (RelatedVideoItem) this.d.get(i);
        hVar.v.setText(relatedVideoItem != null ? relatedVideoItem.g() : "");
        hVar.w.setText(relatedVideoItem != null ? relatedVideoItem.f() : "");
        if (relatedVideoItem == null) {
            hVar.E();
        }
        BitmapKey a = relatedVideoItem.a();
        if (a == null || !a.equals(hVar.t)) {
            hVar.E();
        }
        if (relatedVideoItem == null) {
            a = null;
        }
        hVar.t = a;
        hVar.u = relatedVideoItem != null ? relatedVideoItem.b() : null;
        try {
            aomf c = relatedVideoItem.c();
            if (c == null) {
                alta.C("Unable to log visibility of related video item, tracking params are null", new Object[0]);
            } else {
                this.g.i(c.I());
            }
        } catch (RemoteException e) {
            oba.B(e);
        }
        if (this.e.get()) {
            return;
        }
        hVar.F();
    }
}
