package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import defpackage.ayrs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements ayrs {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ x(String str, boolean z, int i) {
        this.c = i;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.c == 0) {
            ((av) obj).l(SimplePlaybackDescriptor.c(this.a, av.a(this.b)));
            return;
        }
        String str = this.a;
        boolean z = this.b;
        com.google.android.apps.youtube.embeddedplayer.service.model.j jVar = new com.google.android.apps.youtube.embeddedplayer.service.model.j();
        jVar.a = 2;
        jVar.c = str;
        jVar.e = av.a(z);
        ((av) obj).l(jVar.a());
    }
}
