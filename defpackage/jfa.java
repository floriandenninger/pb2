package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jfa extends jfg implements ypd {
    public final azrw a;
    private View v;

    public jfa(Context context, azrw azrwVar, jgj jgjVar, azrw azrwVar2, jgp jgpVar, ajoy ajoyVar, ajuw ajuwVar, oix oixVar, acun acunVar, aioc aiocVar, azrw azrwVar3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context, azrwVar, jgjVar, oixVar, azrwVar2, ajuwVar, jgpVar, ajoyVar, acunVar, aiocVar, null, null, null);
        this.a = azrwVar3;
    }

    private final String d() {
        adub adubVar = this.s;
        int i = adubVar.e;
        int i2 = adubVar.d;
        if (i >= i2 || i2 == 0) {
            return this.b.getString(R.string.mdx_remote_queue_header_description);
        }
        return this.b.getString(R.string.mdx_remote_queue_header_description_nonempty, String.valueOf(i + 1), String.valueOf(this.s.d));
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adjb.class};
        }
        if (i == 0) {
            adjb adjbVar = adjb.PLAYING_VIDEO;
            aigk aigkVar = aigk.NEW;
            if (((adjb) obj).ordinal() != 2) {
                return null;
            }
            c();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.adue
    public final void oZ(int i, adub adubVar) {
        Optional empty;
        this.s = adubVar;
        if (this.n && i == 5 && this.n) {
            adjb adjbVar = adjb.PLAYING_VIDEO;
            aigk aigkVar = aigk.NEW;
            int ordinal = this.s.h.ordinal();
            if (ordinal == 0) {
                this.p.setVisibility(8);
                if (this.i) {
                    this.k.setVisibility(0);
                }
                this.o.setVisibility(0);
                this.m.setVisibility(8);
                return;
            }
            if (ordinal != 4) {
                return;
            }
            Optional ofNullable = Optional.ofNullable(this.s.g);
            if (this.n && ofNullable.isPresent()) {
                aubs aubsVar = ((WatchNextResponseModel) ofNullable.get()).g;
                if (aubsVar == null) {
                    this.e.a();
                } else {
                    this.p.setVisibility(8);
                    if (this.i) {
                        this.k.setVisibility(0);
                    }
                    this.o.setVisibility(0);
                    this.m.setVisibility(0);
                    this.e.e(aubsVar);
                    jgo jgoVar = this.q;
                    aubs aubsVar2 = ((WatchNextResponseModel) ofNullable.get()).g;
                    jgoVar.f = aubsVar2 != null && adtt.a(aubsVar2.k);
                    jgoVar.a();
                    int i2 = aubsVar.c;
                    atdc atdcVar = null;
                    this.l.setText(((i2 & 128) == 0 && (8 & i2) == 0) ? null : this.b.getString(R.string.mdx_remote_queue_video_count, String.valueOf(aubsVar.j + 1), String.valueOf(aubsVar.m)));
                    ajuw ajuwVar = this.g;
                    ImageView imageView = this.m;
                    atdf atdfVar = aubsVar.z;
                    if (atdfVar == null) {
                        atdfVar = atdf.a;
                    }
                    if ((atdfVar.b & 1) != 0) {
                        atdf atdfVar2 = aubsVar.z;
                        if (atdfVar2 == null) {
                            atdfVar2 = atdf.a;
                        }
                        atdcVar = atdfVar2.c;
                        if (atdcVar == null) {
                            atdcVar = atdc.a;
                        }
                    }
                    ajuwVar.d(imageView, atdcVar, aubsVar, acra.l);
                }
            }
            if (ofNullable.isPresent()) {
                this.g.g(this.m);
                View view = this.v;
                if (view != null) {
                    view.setContentDescription(d());
                }
                aubs aubsVar3 = ((WatchNextResponseModel) ofNullable.get()).g;
                if (aubsVar3 != null && (aubsVar3.c & 4194304) != 0) {
                    atdf atdfVar3 = aubsVar3.z;
                    if (atdfVar3 == null) {
                        atdfVar3 = atdf.a;
                    }
                    if ((atdfVar3.b & 1) != 0) {
                        atdf atdfVar4 = aubsVar3.z;
                        if (atdfVar4 == null) {
                            atdfVar4 = atdf.a;
                        }
                        atdc atdcVar2 = atdfVar4.c;
                        if (atdcVar2 == null) {
                            atdcVar2 = atdc.a;
                        }
                        for (atda atdaVar : atdcVar2.c) {
                            atdb atdbVar = atdaVar.c;
                            if (atdbVar == null) {
                                atdbVar = atdb.a;
                            }
                            if ((atdbVar.b & 4) != 0) {
                                atdb atdbVar2 = atdaVar.c;
                                if (atdbVar2 == null) {
                                    atdbVar2 = atdb.a;
                                }
                                apxf apxfVar = atdbVar2.e;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                if (!apxfVar.pY(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint)) {
                                    atdb atdbVar3 = atdaVar.c;
                                    if (atdbVar3 == null) {
                                        atdbVar3 = atdb.a;
                                    }
                                    apxf apxfVar2 = atdbVar3.e;
                                    if (apxfVar2 == null) {
                                        apxfVar2 = apxf.a;
                                    }
                                    if (apxfVar2.pY(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)) {
                                    }
                                }
                                atdb atdbVar4 = atdaVar.c;
                                if (atdbVar4 == null) {
                                    atdbVar4 = atdb.a;
                                }
                                apxf apxfVar3 = atdbVar4.e;
                                if (apxfVar3 == null) {
                                    apxfVar3 = apxf.a;
                                }
                                empty = Optional.of(apxfVar3);
                                aong aongVar = (aong) apxf.a.createBuilder();
                                aongVar.e(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a);
                                final apxf apxfVar4 = (apxf) empty.orElse((apxf) aongVar.build());
                                this.m.setOnClickListener(new View.OnClickListener() { // from class: jez
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        jfa jfaVar = jfa.this;
                                        ((aahd) jfaVar.a.get()).a(apxfVar4);
                                    }
                                });
                            }
                        }
                        empty = Optional.empty();
                        aong aongVar2 = (aong) apxf.a.createBuilder();
                        aongVar2.e(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a);
                        final apxf apxfVar42 = (apxf) empty.orElse((apxf) aongVar2.build());
                        this.m.setOnClickListener(new View.OnClickListener() { // from class: jez
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                jfa jfaVar = jfa.this;
                                ((aahd) jfaVar.a.get()).a(apxfVar42);
                            }
                        });
                    }
                }
                empty = Optional.empty();
                aong aongVar22 = (aong) apxf.a.createBuilder();
                aongVar22.e(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a);
                final apxf apxfVar422 = (apxf) empty.orElse((apxf) aongVar22.build());
                this.m.setOnClickListener(new View.OnClickListener() { // from class: jez
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        jfa jfaVar = jfa.this;
                        ((aahd) jfaVar.a.get()).a(apxfVar422);
                    }
                });
            }
        }
    }

    @Override // defpackage.jfg
    public final void b(ViewGroup viewGroup) {
        if (this.n) {
            return;
        }
        if (!this.n) {
            adul adulVar = (adul) this.c.get();
            this.s = adulVar.i;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.mdx_playlist_mode);
            viewGroup2.getClass();
            this.k = viewGroup2;
            RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.mdx_remote_queue_list);
            recyclerView.getClass();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.ab(1);
            recyclerView.af(linearLayoutManager);
            recyclerView.setNestedScrollingEnabled(true);
            LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewGroup.findViewById(R.id.mdx_remote_queue_loading_layout);
            loadingFrameLayout.getClass();
            this.o = loadingFrameLayout;
            TextView textView = (TextView) viewGroup.findViewById(R.id.mdx_remote_queue_header_video_count);
            textView.getClass();
            this.l = textView;
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.mdx_remote_queue_header_contextual_menu_anchor);
            imageView.getClass();
            this.m = imageView;
            View findViewById = viewGroup.findViewById(R.id.empty_queue);
            findViewById.getClass();
            this.p = findViewById;
            this.e.f(recyclerView);
            this.e.d(this.o);
            jgj jgjVar = this.d;
            boolean a = jgjVar.a();
            jgjVar.a = viewGroup;
            if (jgjVar.a() != a) {
                jgjVar.c();
            }
            adulVar.a(this);
            if (this.f.get() != null) {
                this.t.g(((jff) this.f.get()).kI(this.j));
            }
            jgp jgpVar = this.h;
            oix oixVar = this.e;
            adlt adltVar = (adlt) jgpVar.a.get();
            adltVar.getClass();
            oixVar.getClass();
            adul adulVar2 = (adul) jgpVar.b.get();
            adulVar2.getClass();
            this.q = new jgo(adltVar, recyclerView, oixVar, adulVar2);
            jgo jgoVar = this.q;
            jgoVar.e = jgoVar.c.g();
            if (((you) jgoVar.b.b).size() == 0) {
                jgoVar.b.c(jgoVar.h);
            }
            jgoVar.d.a(jgoVar.i);
            jgoVar.g = jgoVar.d.i;
            jgoVar.b();
            if (this.i) {
                ajoy ajoyVar = this.u;
                ViewGroup viewGroup3 = this.k;
                adlt adltVar2 = (adlt) ajoyVar.a.get();
                adltVar2.getClass();
                viewGroup3.getClass();
                this.r = new jfe(adltVar2, viewGroup3);
                jfe jfeVar = this.r;
                jfeVar.a.i(jfeVar);
                adlm g = jfeVar.a.g();
                if (g != null) {
                    jfeVar.l(g);
                }
            }
            this.n = true;
        }
        View findViewById2 = viewGroup.findViewById(R.id.mdx_next_gen_fiji_remote_queue_header);
        this.v = findViewById2;
        findViewById2.setContentDescription(d());
        Drawable a2 = aii.a(this.b, R.drawable.yt_outline_library_add_white_24);
        if (a2 != null) {
            a2.mutate();
            a2.setColorFilter(wbs.Q(this.b, R.attr.ytTextPrimary), PorterDuff.Mode.SRC_ATOP);
            this.m.setImageDrawable(a2);
        }
        c();
    }
}
