package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ahus;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f extends ahus implements com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b a;
    public boolean b;
    private TextView d;
    private boolean e;

    public f(Context context) {
        super(context);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        e eVar = new e(this, context);
        eVar.setBackgroundColor(-16777216);
        LayoutInflater.from(context).inflate(R.layout.embed_host_app_verification_service_error_overlay, eVar);
        this.d = (TextView) eVar.findViewById(R.id.embed_host_app_verification_error_text_view);
        return eVar;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        if (ab(1) && np()) {
            this.d.setText(true != this.b ? R.string.non_retriable_host_app_verification_service_error_message : R.string.retriable_host_app_verification_service_error_message);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
    public final void k() {
        this.e = false;
        X();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
    public final void m(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
    public final void n(boolean z) {
        this.b = z;
        this.e = true;
        Z(1);
        aa();
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.e;
    }
}
