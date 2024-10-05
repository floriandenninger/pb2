package com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import defpackage.ecq;
import defpackage.ecr;
import defpackage.ykl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends ecq implements f {
    public final HashMap a;
    public c b;
    private final Handler c;

    public e(Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
        this.c = handler;
        this.a = new HashMap();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f
    public final void a(final BitmapKey bitmapKey, final Bitmap bitmap) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.imageclient.remoteloaded.c
            @Override // java.lang.Runnable
            public final void run() {
                e.this.b(bitmapKey, bitmap);
            }
        });
    }

    public final void b(BitmapKey bitmapKey, Bitmap bitmap) {
        Set set = (Set) this.a.get(bitmapKey);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ykl) it.next()).b(bitmapKey, bitmap);
        }
        set.clear();
        this.a.remove(bitmapKey);
    }

    public final void c() {
        this.b = null;
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.imageclient.remoteloaded.a
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                Iterator it = new HashSet(eVar.a.keySet()).iterator();
                while (it.hasNext()) {
                    eVar.b((BitmapKey) it.next(), null);
                }
            }
        });
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        c aVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientService");
                if (queryLocalInterface instanceof c) {
                    aVar = (c) queryLocalInterface;
                } else {
                    aVar = new a(readStrongBinder);
                }
            }
            f(aVar);
        } else {
            if (i != 2) {
                return false;
            }
            a((BitmapKey) ecr.a(parcel, BitmapKey.CREATOR), (Bitmap) ecr.a(parcel, Bitmap.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f
    public final void f(final c cVar) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.imageclient.remoteloaded.b
            @Override // java.lang.Runnable
            public final void run() {
                e.this.b = cVar;
            }
        });
    }

    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
    }
}
