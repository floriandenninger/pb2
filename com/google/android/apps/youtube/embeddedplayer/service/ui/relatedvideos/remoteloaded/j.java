package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideosScreen;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import defpackage.ahus;
import defpackage.ahux;
import defpackage.alta;
import defpackage.amru;
import defpackage.aqrt;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azre;
import defpackage.ipu;
import defpackage.umy;
import defpackage.yny;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j extends ahus implements com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c {
    public final ayqx a;
    public boolean b;
    private FrameLayout c;
    private RecyclerView d;
    private GridLayoutManager e;
    private TextView f;
    private final AtomicBoolean g;
    private WeakReference h;
    private i i;
    private RelatedVideosScreen j;
    private com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d k;
    private boolean l;
    private com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e m;

    public j(Context context) {
        super(context);
        this.g = new AtomicBoolean(false);
        this.a = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ai(azre.c()).ab(ayqr.a()).ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.b
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                j.this.b = ((aqrt) obj).l;
            }
        });
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.c = new FrameLayout(context);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.b) {
            try {
                from.inflate(R.layout.relateds_overlay, this.c);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Unable to inflate LazyRelatedVideosOverlay: ");
                sb.append(valueOf);
                alta.B(sb.toString(), new Object[0]);
                return this.c;
            }
        } else {
            from.inflate(R.layout.relateds_overlay, this.c);
        }
        this.l = true;
        this.e = new GridLayoutManager(1);
        this.d = new RecyclerView(context);
        d dVar = new d(this.e, this.g);
        this.d.af(this.e);
        this.d.aD(dVar);
        this.d.aB(new c());
        yny.A(this.d, new umy(1), yny.h(yny.y(-1, -1), yny.s(0, 0, 0, 8)), ViewGroup.MarginLayoutParams.class);
        ((FixedAspectRatioRelativeLayout) this.c.findViewById(R.id.related_video_fixed_aspect_ratio_layout)).addView(this.d);
        this.f = (TextView) this.c.findViewById(R.id.related_overlay_title);
        this.c.findViewById(R.id.exit_related_page_button).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.this.kV();
            }
        });
        this.c.setOnClickListener(ipu.h);
        return this.c;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void b(BusSupported$Data busSupported$Data) {
        if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.RELATED_VIDEOS_SCREEN)) {
            RelatedVideosScreen relatedVideosScreen = (RelatedVideosScreen) busSupported$Data;
            amru amruVar = relatedVideosScreen.c;
            if (amruVar == null || relatedVideosScreen.equals(RelatedVideosScreen.a) || amruVar.isEmpty() || ((RelatedVideoItem) amruVar.get(0)).equals(RelatedVideoItem.a)) {
                this.j = null;
                kV();
            } else {
                this.j = relatedVideosScreen;
                kX();
            }
            Y();
        }
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        if (np()) {
            if (this.i == null) {
                i iVar = new i(this.b, this.m, this.h, this.k, this.g);
                this.i = iVar;
                this.d.ac(iVar);
            }
            RelatedVideosScreen relatedVideosScreen = this.j;
            if (relatedVideosScreen != null) {
                this.f.setText(relatedVideosScreen.b);
                i iVar2 = this.i;
                iVar2.d = relatedVideosScreen.c;
                iVar2.e.set(false);
                iVar2.mw();
                this.e.Z(0);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void e() {
    }

    public final void k(com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e eVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar) {
        this.h = new WeakReference(cVar);
        this.m = eVar;
        this.k = dVar;
    }

    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.e = false;
        kU.b();
        kU.a();
        return kU;
    }

    @Override // defpackage.ahus, defpackage.ahuu
    public final boolean np() {
        return this.l && super.np();
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.j != null;
    }
}
