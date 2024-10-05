package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.n;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import defpackage.ahus;
import defpackage.ahux;
import defpackage.alta;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrz;
import defpackage.azre;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends ahus {
    public TouchImageView a;
    public RelativeLayout b;
    public final ayqw c;
    public final View.OnClickListener d;
    public Handler e;
    public SelectableItemKey f;
    public SelectableItemKey g;
    public SelectableItemKey h;
    public WeakReference i;
    public long j;
    public int k;
    public MutedAutoplayState l;
    public int m;
    public boolean n;
    private MutedAutoplayIndicator o;
    private TextView p;
    private n q;
    private FrameLayout r;
    private boolean s;
    private final ayqx t;

    public d(Context context, View.OnClickListener onClickListener) {
        super(context);
        this.c = new ayqw();
        this.d = onClickListener;
        this.t = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ai(azre.c()).ab(ayqr.a()).ax(new c(this, 2));
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.r = new FrameLayout(context);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.n) {
            try {
                from.inflate(R.layout.muted_autoplay_overlay, this.r);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Unable to inflate LazyMutedAutoplayOverlay: ");
                sb.append(valueOf);
                alta.B(sb.toString(), new Object[0]);
                return this.r;
            }
        } else {
            from.inflate(R.layout.muted_autoplay_overlay, this.r);
        }
        if (!this.t.e()) {
            ayrz.c((AtomicReference) this.t);
        }
        this.s = true;
        this.o = (MutedAutoplayIndicator) this.r.findViewById(R.id.audio_indicator);
        this.b = (RelativeLayout) this.r.findViewById(R.id.end_screen_layout);
        this.p = (TextView) this.r.findViewById(R.id.end_screen_text);
        this.a = (TouchImageView) this.r.findViewById(R.id.api_youtube_watermark);
        this.q = new n((TouchImageView) this.r.findViewById(R.id.end_screen_play_button));
        this.r.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectableItemKey selectableItemKey;
                d dVar = d.this;
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c cVar = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) dVar.i.get();
                if (cVar == null) {
                    return;
                }
                if (view == dVar.b) {
                    selectableItemKey = dVar.g;
                } else {
                    selectableItemKey = view == dVar.a ? dVar.h : dVar.f;
                }
                if (selectableItemKey != null) {
                    try {
                        cVar.a(selectableItemKey);
                    } catch (RemoteException unused) {
                    }
                    dVar.d.onClick(view);
                    dVar.X();
                }
            }
        });
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectableItemKey selectableItemKey;
                d dVar = d.this;
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c cVar = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) dVar.i.get();
                if (cVar == null) {
                    return;
                }
                if (view == dVar.b) {
                    selectableItemKey = dVar.g;
                } else {
                    selectableItemKey = view == dVar.a ? dVar.h : dVar.f;
                }
                if (selectableItemKey != null) {
                    try {
                        cVar.a(selectableItemKey);
                    } catch (RemoteException unused) {
                    }
                    dVar.d.onClick(view);
                    dVar.X();
                }
            }
        });
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectableItemKey selectableItemKey;
                d dVar = d.this;
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c cVar = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) dVar.i.get();
                if (cVar == null) {
                    return;
                }
                if (view == dVar.b) {
                    selectableItemKey = dVar.g;
                } else {
                    selectableItemKey = view == dVar.a ? dVar.h : dVar.f;
                }
                if (selectableItemKey != null) {
                    try {
                        cVar.a(selectableItemKey);
                    } catch (RemoteException unused) {
                    }
                    dVar.d.onClick(view);
                    dVar.X();
                }
            }
        });
        return this.r;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        if (np()) {
            this.q.a(this.k);
            this.p.setText(this.l.c);
            k(this.l.g);
        }
    }

    public final void k(int i) {
        if (np()) {
            if (i == 1) {
                this.o.setVisibility(0);
                this.a.setVisibility(0);
                this.b.setVisibility(8);
                if (this.e.hasMessages(1)) {
                    this.e.removeMessages(1);
                }
                this.e.sendEmptyMessageDelayed(1, this.j);
                return;
            }
            if (i == 2) {
                this.o.setVisibility(8);
                this.a.setVisibility(8);
                this.b.setVisibility(0);
            } else {
                this.o.setVisibility(8);
                this.a.setVisibility(8);
                this.b.setVisibility(8);
            }
        }
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
        return this.s && super.np();
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.m == 2;
    }
}
