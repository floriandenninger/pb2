package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfx extends ajpc {
    public final aahd a;
    private final ajjz b;
    private final ajop c;
    private final Resources d;
    private final LayoutInflater e;
    private final View f;
    private LinearLayout g;
    private awcp h;
    private boolean i;
    private int j;

    public lfx(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar) {
        ajjzVar.getClass();
        this.b = ajjzVar;
        this.c = gmaVar;
        aahdVar.getClass();
        this.a = aahdVar;
        this.d = context.getResources();
        LayoutInflater from = LayoutInflater.from(context);
        this.e = from;
        View inflate = from.inflate(R.layout.watch_card_list, (ViewGroup) null);
        this.f = inflate;
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.c).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        final apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        final apxf apxfVar2;
        aqyg aqygVar4;
        aqyg aqygVar5;
        aqyg aqygVar6;
        aqyg aqygVar7;
        final apxf apxfVar3;
        aqyg aqygVar8;
        aqyg aqygVar9;
        awcp awcpVar = (awcp) obj;
        final int i = 0;
        if (!awcpVar.equals(this.h)) {
            this.i = false;
        }
        if (!this.i || this.d.getConfiguration().orientation != this.j) {
            this.h = awcpVar;
            final int i2 = 1;
            if (!this.i) {
                this.g = (LinearLayout) this.f.findViewById(R.id.watch_card_items);
                TextView textView = (TextView) this.f.findViewById(R.id.card_title);
                if ((awcpVar.b & 1) != 0) {
                    aqygVar7 = awcpVar.c;
                    if (aqygVar7 == null) {
                        aqygVar7 = aqyg.a;
                    }
                } else {
                    aqygVar7 = null;
                }
                textView.setText(ajcq.b(aqygVar7));
                final int i3 = 2;
                if ((awcpVar.b & 2) != 0) {
                    apxfVar3 = awcpVar.d;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                } else {
                    apxfVar3 = null;
                }
                final int i4 = 3;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: lfw
                    public final /* synthetic */ lfx a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        if (i5 == 0) {
                            lfx lfxVar = this.a;
                            lfxVar.a.c(apxfVar3, null);
                        } else if (i5 == 1) {
                            lfx lfxVar2 = this.a;
                            lfxVar2.a.c(apxfVar3, null);
                        } else if (i5 != 2) {
                            lfx lfxVar3 = this.a;
                            lfxVar3.a.c(apxfVar3, null);
                        } else {
                            lfx lfxVar4 = this.a;
                            lfxVar4.a.c(apxfVar3, null);
                        }
                    }
                });
                TextView textView2 = (TextView) this.f.findViewById(R.id.related_entities_title);
                LinearLayout linearLayout = (LinearLayout) this.f.findViewById(R.id.related_entities);
                ViewGroup viewGroup = (ViewGroup) linearLayout.getParent();
                awct awctVar = awcpVar.f;
                if (awctVar == null) {
                    awctVar = awct.a;
                }
                aony aonyVar = awctVar.d;
                if (aonyVar.isEmpty()) {
                    viewGroup.setVisibility(8);
                    textView2.setVisibility(8);
                } else {
                    awct awctVar2 = awcpVar.f;
                    if (awctVar2 == null) {
                        awctVar2 = awct.a;
                    }
                    if ((awctVar2.b & 1) != 0) {
                        awct awctVar3 = awcpVar.f;
                        if (awctVar3 == null) {
                            awctVar3 = awct.a;
                        }
                        aqygVar8 = awctVar3.c;
                        if (aqygVar8 == null) {
                            aqygVar8 = aqyg.a;
                        }
                    } else {
                        aqygVar8 = null;
                    }
                    textView2.setText(ajcq.b(aqygVar8));
                    viewGroup.setVisibility(0);
                    linearLayout.removeAllViews();
                    int i5 = 0;
                    while (i5 < aonyVar.size()) {
                        awcu awcuVar = (awcu) aonyVar.get(i5);
                        View inflate = this.e.inflate(R.layout.watch_card_related_entity_fixed_width, (ViewGroup) linearLayout, false);
                        TextView textView3 = (TextView) inflate.findViewById(R.id.title);
                        if ((awcuVar.b & 1) != 0) {
                            aqygVar9 = awcuVar.c;
                            if (aqygVar9 == null) {
                                aqygVar9 = aqyg.a;
                            }
                        } else {
                            aqygVar9 = null;
                        }
                        textView3.setText(ajcq.b(aqygVar9));
                        ajjz ajjzVar = this.b;
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
                        avgg avggVar = awcuVar.d;
                        if (avggVar == null) {
                            avggVar = avgg.a;
                        }
                        ajjzVar.h(imageView, avggVar);
                        final apxf apxfVar4 = awcuVar.e;
                        if (apxfVar4 == null) {
                            apxfVar4 = apxf.a;
                        }
                        inflate.setOnClickListener(new View.OnClickListener(this) { // from class: lfw
                            public final /* synthetic */ lfx a;

                            {
                                this.a = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i52 = i3;
                                if (i52 == 0) {
                                    lfx lfxVar = this.a;
                                    lfxVar.a.c(apxfVar4, null);
                                } else if (i52 == 1) {
                                    lfx lfxVar2 = this.a;
                                    lfxVar2.a.c(apxfVar4, null);
                                } else if (i52 != 2) {
                                    lfx lfxVar3 = this.a;
                                    lfxVar3.a.c(apxfVar4, null);
                                } else {
                                    lfx lfxVar4 = this.a;
                                    lfxVar4.a.c(apxfVar4, null);
                                }
                            }
                        });
                        if (i5 == 0) {
                            inflate.setPadding(inflate.getPaddingRight(), inflate.getPaddingTop(), inflate.getPaddingRight(), inflate.getPaddingBottom());
                            i5 = 0;
                        }
                        linearLayout.addView(inflate);
                        i5++;
                    }
                }
            }
            this.g.removeAllViews();
            for (awco awcoVar : awcpVar.e) {
                int i6 = awcoVar.b;
                if (i6 == 63271829) {
                    LinearLayout linearLayout2 = this.g;
                    awcs awcsVar = (awcs) awcoVar.c;
                    View inflate2 = this.e.inflate(R.layout.watch_card_radio, (ViewGroup) linearLayout2, false);
                    if ((awcsVar.b & 32) != 0) {
                        apxfVar = awcsVar.g;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                    } else {
                        apxfVar = null;
                    }
                    inflate2.setOnClickListener(new View.OnClickListener(this) { // from class: lfw
                        public final /* synthetic */ lfx a;

                        {
                            this.a = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52 = i;
                            if (i52 == 0) {
                                lfx lfxVar = this.a;
                                lfxVar.a.c(apxfVar, null);
                            } else if (i52 == 1) {
                                lfx lfxVar2 = this.a;
                                lfxVar2.a.c(apxfVar, null);
                            } else if (i52 != 2) {
                                lfx lfxVar3 = this.a;
                                lfxVar3.a.c(apxfVar, null);
                            } else {
                                lfx lfxVar4 = this.a;
                                lfxVar4.a.c(apxfVar, null);
                            }
                        }
                    });
                    View findViewById = inflate2.findViewById(R.id.radio_item);
                    PlaylistThumbnailView playlistThumbnailView = (PlaylistThumbnailView) findViewById.findViewById(R.id.playlist_thumbnail);
                    avgg avggVar2 = awcsVar.c;
                    if (avggVar2 == null) {
                        avggVar2 = avgg.a;
                    }
                    playlistThumbnailView.d(ahbw.M(avggVar2));
                    this.b.h(playlistThumbnailView.b, avggVar2);
                    TextView textView4 = (TextView) findViewById.findViewById(R.id.title);
                    if ((awcsVar.b & 4) != 0) {
                        aqygVar = awcsVar.d;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    textView4.setText(ajcq.b(aqygVar));
                    TextView textView5 = (TextView) findViewById.findViewById(R.id.owner);
                    if ((awcsVar.b & 16) != 0) {
                        aqygVar2 = awcsVar.f;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    textView5.setText(ajcq.b(aqygVar2));
                    YouTubeTextView youTubeTextView = playlistThumbnailView.c;
                    if ((awcsVar.b & 8) != 0) {
                        aqygVar3 = awcsVar.e;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                    } else {
                        aqygVar3 = null;
                    }
                    youTubeTextView.setText(ajcq.b(aqygVar3));
                    linearLayout2.addView(inflate2);
                } else if (i6 == 63336837) {
                    LinearLayout linearLayout3 = this.g;
                    awcr awcrVar = (awcr) awcoVar.c;
                    View inflate3 = this.e.inflate(R.layout.watch_card_playlist, (ViewGroup) null);
                    if ((awcrVar.b & 32) != 0) {
                        apxfVar2 = awcrVar.g;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                    } else {
                        apxfVar2 = null;
                    }
                    inflate3.setOnClickListener(new View.OnClickListener(this) { // from class: lfw
                        public final /* synthetic */ lfx a;

                        {
                            this.a = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52 = i2;
                            if (i52 == 0) {
                                lfx lfxVar = this.a;
                                lfxVar.a.c(apxfVar2, null);
                            } else if (i52 == 1) {
                                lfx lfxVar2 = this.a;
                                lfxVar2.a.c(apxfVar2, null);
                            } else if (i52 != 2) {
                                lfx lfxVar3 = this.a;
                                lfxVar3.a.c(apxfVar2, null);
                            } else {
                                lfx lfxVar4 = this.a;
                                lfxVar4.a.c(apxfVar2, null);
                            }
                        }
                    });
                    View findViewById2 = inflate3.findViewById(R.id.playlist_item);
                    TextView textView6 = (TextView) findViewById2.findViewById(R.id.title);
                    if ((awcrVar.b & 4) != 0) {
                        aqygVar4 = awcrVar.d;
                        if (aqygVar4 == null) {
                            aqygVar4 = aqyg.a;
                        }
                    } else {
                        aqygVar4 = null;
                    }
                    textView6.setText(ajcq.b(aqygVar4));
                    TextView textView7 = (TextView) findViewById2.findViewById(R.id.owner);
                    if ((awcrVar.b & 16) != 0) {
                        aqygVar5 = awcrVar.f;
                        if (aqygVar5 == null) {
                            aqygVar5 = aqyg.a;
                        }
                    } else {
                        aqygVar5 = null;
                    }
                    whu.G(textView7, ajcq.b(aqygVar5));
                    PlaylistThumbnailView playlistThumbnailView2 = (PlaylistThumbnailView) findViewById2.findViewById(R.id.playlist_thumbnail);
                    YouTubeTextView youTubeTextView2 = playlistThumbnailView2.c;
                    if ((awcrVar.b & 8) != 0) {
                        aqygVar6 = awcrVar.e;
                        if (aqygVar6 == null) {
                            aqygVar6 = aqyg.a;
                        }
                    } else {
                        aqygVar6 = null;
                    }
                    whu.G(youTubeTextView2, ajcq.b(aqygVar6));
                    ajjz ajjzVar2 = this.b;
                    ImageView imageView2 = playlistThumbnailView2.b;
                    avgg avggVar3 = awcrVar.c;
                    if (avggVar3 == null) {
                        avggVar3 = avgg.a;
                    }
                    ajjzVar2.h(imageView2, avggVar3);
                    linearLayout3.addView(inflate3);
                }
            }
            this.i = true;
            this.j = this.d.getConfiguration().orientation;
            this.c.e(ajokVar);
            return;
        }
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        awcp awcpVar = (awcp) obj;
        if ((awcpVar.b & 128) != 0) {
            return awcpVar.g.I();
        }
        return null;
    }

    @Override // defpackage.ajpc
    protected final boolean l() {
        return true;
    }
}
