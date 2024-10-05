package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded;

import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k;
import defpackage.rql;
import defpackage.whu;
import j$.util.function.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e {
    public boolean a;
    private final Map b = new HashMap();
    private final View.OnClickListener c;
    private final rql d;

    public e(final rql rqlVar, byte[] bArr) {
        this.d = rqlVar;
        final byte[] bArr2 = null;
        this.c = new View.OnClickListener(bArr2) { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rql.this.c(view.getId());
            }
        };
    }

    public final void a(Consumer consumer) {
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            consumer.accept((View) it.next());
        }
    }

    public final void b(final View view) {
        if (view == null) {
            return;
        }
        k kVar = new k() { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.d
            @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k
            public final void a(boolean z) {
                e eVar = e.this;
                View view2 = view;
                boolean z2 = false;
                if (z && !eVar.a) {
                    z2 = true;
                }
                whu.I(view2, z2);
            }
        };
        this.b.put(view, kVar);
        this.d.b(view.getId(), kVar);
        view.setOnClickListener(this.c);
    }

    public final void c(boolean z) {
        if (z == this.a) {
            return;
        }
        this.a = z;
        for (View view : this.b.keySet()) {
            boolean z2 = false;
            if (this.d.e(view.getId()) && !z) {
                z2 = true;
            }
            whu.I(view, z2);
        }
    }
}
