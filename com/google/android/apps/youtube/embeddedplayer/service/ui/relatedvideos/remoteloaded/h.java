package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.youtube.R;
import defpackage.wv;
import defpackage.ykl;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h extends wv {
    public static final /* synthetic */ int B = 0;
    public int A;
    private final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e C;
    public BitmapKey t;
    public SelectableItemKey u;
    public final TextView v;
    public final TextView w;
    public final ImageView x;
    public final WeakReference y;
    public final ykl z;

    public h(Context context, View view, com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e eVar, WeakReference weakReference) {
        super(view);
        this.C = eVar;
        this.y = weakReference;
        this.v = new TextView(context);
        this.w = new TextView(context);
        this.x = new ImageView(context);
        this.z = new f(0);
    }

    public final void E() {
        BitmapKey bitmapKey = this.t;
        if (bitmapKey != null) {
            com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e eVar = this.C;
            ykl yklVar = this.z;
            Set set = (Set) eVar.a.get(bitmapKey);
            if (set != null) {
                set.remove(yklVar);
                if (set.isEmpty()) {
                    eVar.a.remove(bitmapKey);
                    try {
                        com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.c cVar = eVar.b;
                        if (cVar != null) {
                            cVar.a(bitmapKey);
                        }
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
        this.A = 1;
        this.x.setImageBitmap(null);
    }

    public final void F() {
        BitmapKey bitmapKey;
        int i = this.A;
        if (i == 0) {
            throw null;
        }
        if (i != 1 || (bitmapKey = this.t) == null) {
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e eVar = this.C;
        ykl yklVar = this.z;
        Set set = (Set) eVar.a.get(bitmapKey);
        if (set != null) {
            set.add(yklVar);
        } else {
            HashSet hashSet = new HashSet();
            eVar.a.put(bitmapKey, hashSet);
            hashSet.add(yklVar);
            try {
                com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.c cVar = eVar.b;
                if (cVar != null) {
                    cVar.f(bitmapKey);
                }
            } catch (RemoteException unused) {
            }
        }
        this.A = 2;
    }

    public h(View view, com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e eVar, WeakReference weakReference) {
        super(view);
        this.C = eVar;
        this.y = weakReference;
        this.v = (TextView) view.findViewById(R.id.related_title);
        this.w = (TextView) view.findViewById(R.id.related_timestamp);
        this.x = (ImageView) view.findViewById(R.id.related_thumbnail);
        this.A = 1;
        this.z = new g(this);
    }
}
