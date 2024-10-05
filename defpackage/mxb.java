package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxb extends mxd {
    public final ftw a;
    public final ftw b;
    final /* synthetic */ mxf c;
    private final ViewGroup g;
    private final View h;
    private final ViewGroup i;
    private final ViewGroup j;
    private final ImageView k;
    private final ImageView l;
    private final TextView m;
    private final View n;
    private final View o;
    private final ajyd p;
    private final ajyd q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxb(mxf mxfVar) {
        super(mxfVar, R.layout.video_feed_entry_top_aligned);
        this.c = mxfVar;
        this.g = (ViewGroup) this.d.findViewById(R.id.action_toolbar);
        this.h = this.d.findViewById(R.id.bottom_margin);
        ViewGroup viewGroup = (ViewGroup) this.d.findViewById(R.id.dislike_button);
        this.j = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) this.d.findViewById(R.id.like_button);
        this.i = viewGroup2;
        ImageView imageView = (ImageView) this.d.findViewById(R.id.comment_button);
        this.k = imageView;
        ImageView imageView2 = (ImageView) this.d.findViewById(R.id.live_chat_button);
        this.l = imageView2;
        this.m = (TextView) this.d.findViewById(R.id.comment_count);
        this.n = this.d.findViewById(R.id.contextual_menu_anchor);
        this.o = this.d.findViewById(R.id.down_contextual_menu_anchor);
        this.p = mxfVar.k.c(imageView);
        this.q = mxfVar.k.c(imageView2);
        this.a = mxfVar.l.c(viewGroup2);
        this.b = mxfVar.l.c(viewGroup);
    }

    private final void d(boolean z) {
        int i = true != z ? 4 : 0;
        this.k.setVisibility(i);
        this.k.setClickable(z);
        this.m.setVisibility(i);
    }

    private final void e(boolean z) {
        this.l.setVisibility(true != z ? 4 : 0);
        this.l.setClickable(z);
    }

    @Override // defpackage.mxd
    public final void a(ajok ajokVar) {
        apmg apmgVar;
        aqyg aqygVar;
        String str;
        apmg apmgVar2;
        final apmp apmpVar;
        final apmp apmpVar2;
        int i;
        View view;
        c(ajokVar);
        jal jalVar = this.c.j;
        avzs avzsVar = jalVar.a().B;
        if (avzsVar == null) {
            avzsVar = avzs.a;
        }
        if (avzsVar.b == 65153809) {
            avzs avzsVar2 = jalVar.a().B;
            if (avzsVar2 == null) {
                avzsVar2 = avzs.a;
            }
            if (avzsVar2.b == 65153809) {
                apmgVar = (apmg) avzsVar2.c;
            } else {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        String str2 = "";
        final int i2 = 1;
        final int i3 = 0;
        if (apmgVar == null) {
            d(false);
        } else {
            this.p.b(apmgVar, ajokVar.a);
            TextView textView = this.m;
            if ((apmgVar.b & 256) != 0) {
                aqygVar = apmgVar.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            ImageView imageView = this.k;
            if ((apmgVar.b & 65536) != 0) {
                aots aotsVar = apmgVar.r;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                str = aotsVar.c;
            } else {
                str = "";
            }
            imageView.setContentDescription(str);
            d(true);
        }
        jal jalVar2 = this.c.j;
        avzs avzsVar3 = jalVar2.a().C;
        if (avzsVar3 == null) {
            avzsVar3 = avzs.a;
        }
        if (avzsVar3.b == 65153809) {
            avzs avzsVar4 = jalVar2.a().C;
            if (avzsVar4 == null) {
                avzsVar4 = avzs.a;
            }
            if (avzsVar4.b == 65153809) {
                apmgVar2 = (apmg) avzsVar4.c;
            } else {
                apmgVar2 = apmg.a;
            }
        } else {
            apmgVar2 = null;
        }
        if (apmgVar2 == null) {
            e(false);
        } else {
            this.q.b(apmgVar2, ajokVar.a);
            ImageView imageView2 = this.l;
            if ((65536 & apmgVar2.b) != 0) {
                aots aotsVar2 = apmgVar2.r;
                if (aotsVar2 == null) {
                    aotsVar2 = aots.a;
                }
                str2 = aotsVar2.c;
            }
            imageView2.setContentDescription(str2);
            e(true);
        }
        jal jalVar3 = this.c.j;
        avzs avzsVar5 = jalVar3.a().z;
        if (avzsVar5 == null) {
            avzsVar5 = avzs.a;
        }
        if (avzsVar5.b == 79971800) {
            avzs avzsVar6 = jalVar3.a().z;
            if (avzsVar6 == null) {
                avzsVar6 = avzs.a;
            }
            if (avzsVar6.b == 79971800) {
                apmpVar = (apmp) avzsVar6.c;
            } else {
                apmpVar = apmp.a;
            }
        } else {
            apmpVar = null;
        }
        jal jalVar4 = this.c.j;
        avzs avzsVar7 = jalVar4.a().A;
        if (avzsVar7 == null) {
            avzsVar7 = avzs.a;
        }
        if (avzsVar7.b == 79971800) {
            avzs avzsVar8 = jalVar4.a().A;
            if (avzsVar8 == null) {
                avzsVar8 = avzs.a;
            }
            if (avzsVar8.b == 79971800) {
                apmpVar2 = (apmp) avzsVar8.c;
            } else {
                apmpVar2 = apmp.a;
            }
        } else {
            apmpVar2 = null;
        }
        this.a.b(apmpVar);
        this.b.b(apmpVar2);
        if (apmpVar == null || apmpVar2 == null) {
            ftw ftwVar = this.a;
            ftwVar.e = null;
            this.b.e = null;
            ftwVar.a();
            this.b.a();
        } else {
            this.a.e = new ftv(this) { // from class: mxa
                public final /* synthetic */ mxb a;

                {
                    this.a = this;
                }

                @Override // defpackage.ftv
                public final void a(boolean z) {
                    if (i2 != 0) {
                        mxb mxbVar = this.a;
                        apmp apmpVar3 = apmpVar2;
                        jal jalVar5 = mxbVar.c.j;
                        aone builder = apmpVar3.toBuilder();
                        builder.copyOnWrite();
                        apmp apmpVar4 = (apmp) builder.instance;
                        apmpVar4.b |= 8;
                        apmpVar4.e = false;
                        apmp apmpVar5 = (apmp) builder.build();
                        if ((jalVar5.a().c & 1) != 0) {
                            avzs avzsVar9 = jalVar5.a().A;
                            if (avzsVar9 == null) {
                                avzsVar9 = avzs.a;
                            }
                            aone builder2 = avzsVar9.toBuilder();
                            builder2.copyOnWrite();
                            avzs avzsVar10 = (avzs) builder2.instance;
                            apmpVar5.getClass();
                            avzsVar10.c = apmpVar5;
                            avzsVar10.b = 79971800;
                            avzs avzsVar11 = (avzs) builder2.build();
                            aong aongVar = (aong) jalVar5.a().toBuilder();
                            aongVar.copyOnWrite();
                            avzv avzvVar = (avzv) aongVar.instance;
                            avzsVar11.getClass();
                            avzvVar.A = avzsVar11;
                            avzvVar.c |= 1;
                            jalVar5.b((avzv) aongVar.build());
                        }
                        mxbVar.b.d();
                        return;
                    }
                    mxb mxbVar2 = this.a;
                    apmp apmpVar6 = apmpVar2;
                    jal jalVar6 = mxbVar2.c.j;
                    aone builder3 = apmpVar6.toBuilder();
                    builder3.copyOnWrite();
                    apmp apmpVar7 = (apmp) builder3.instance;
                    apmpVar7.b |= 8;
                    apmpVar7.e = false;
                    apmp apmpVar8 = (apmp) builder3.build();
                    if ((jalVar6.a().b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                        avzs avzsVar12 = jalVar6.a().z;
                        if (avzsVar12 == null) {
                            avzsVar12 = avzs.a;
                        }
                        aone builder4 = avzsVar12.toBuilder();
                        builder4.copyOnWrite();
                        avzs avzsVar13 = (avzs) builder4.instance;
                        apmpVar8.getClass();
                        avzsVar13.c = apmpVar8;
                        avzsVar13.b = 79971800;
                        avzs avzsVar14 = (avzs) builder4.build();
                        aong aongVar2 = (aong) jalVar6.a().toBuilder();
                        aongVar2.copyOnWrite();
                        avzv avzvVar2 = (avzv) aongVar2.instance;
                        avzsVar14.getClass();
                        avzvVar2.z = avzsVar14;
                        avzvVar2.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                        jalVar6.b((avzv) aongVar2.build());
                    }
                    mxbVar2.a.d();
                }
            };
            this.b.e = new ftv(this) { // from class: mxa
                public final /* synthetic */ mxb a;

                {
                    this.a = this;
                }

                @Override // defpackage.ftv
                public final void a(boolean z) {
                    if (i3 != 0) {
                        mxb mxbVar = this.a;
                        apmp apmpVar3 = apmpVar;
                        jal jalVar5 = mxbVar.c.j;
                        aone builder = apmpVar3.toBuilder();
                        builder.copyOnWrite();
                        apmp apmpVar4 = (apmp) builder.instance;
                        apmpVar4.b |= 8;
                        apmpVar4.e = false;
                        apmp apmpVar5 = (apmp) builder.build();
                        if ((jalVar5.a().c & 1) != 0) {
                            avzs avzsVar9 = jalVar5.a().A;
                            if (avzsVar9 == null) {
                                avzsVar9 = avzs.a;
                            }
                            aone builder2 = avzsVar9.toBuilder();
                            builder2.copyOnWrite();
                            avzs avzsVar10 = (avzs) builder2.instance;
                            apmpVar5.getClass();
                            avzsVar10.c = apmpVar5;
                            avzsVar10.b = 79971800;
                            avzs avzsVar11 = (avzs) builder2.build();
                            aong aongVar = (aong) jalVar5.a().toBuilder();
                            aongVar.copyOnWrite();
                            avzv avzvVar = (avzv) aongVar.instance;
                            avzsVar11.getClass();
                            avzvVar.A = avzsVar11;
                            avzvVar.c |= 1;
                            jalVar5.b((avzv) aongVar.build());
                        }
                        mxbVar.b.d();
                        return;
                    }
                    mxb mxbVar2 = this.a;
                    apmp apmpVar6 = apmpVar;
                    jal jalVar6 = mxbVar2.c.j;
                    aone builder3 = apmpVar6.toBuilder();
                    builder3.copyOnWrite();
                    apmp apmpVar7 = (apmp) builder3.instance;
                    apmpVar7.b |= 8;
                    apmpVar7.e = false;
                    apmp apmpVar8 = (apmp) builder3.build();
                    if ((jalVar6.a().b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                        avzs avzsVar12 = jalVar6.a().z;
                        if (avzsVar12 == null) {
                            avzsVar12 = avzs.a;
                        }
                        aone builder4 = avzsVar12.toBuilder();
                        builder4.copyOnWrite();
                        avzs avzsVar13 = (avzs) builder4.instance;
                        apmpVar8.getClass();
                        avzsVar13.c = apmpVar8;
                        avzsVar13.b = 79971800;
                        avzs avzsVar14 = (avzs) builder4.build();
                        aong aongVar2 = (aong) jalVar6.a().toBuilder();
                        aongVar2.copyOnWrite();
                        avzv avzvVar2 = (avzv) aongVar2.instance;
                        avzsVar14.getClass();
                        avzvVar2.z = avzsVar14;
                        avzvVar2.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                        jalVar6.b((avzv) aongVar2.build());
                    }
                    mxbVar2.a.d();
                }
            };
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.g.getChildCount()) {
                i = 8;
                break;
            } else {
                if (this.g.getChildAt(i4).getVisibility() == 0) {
                    i = 0;
                    break;
                }
                i4++;
            }
        }
        this.g.setVisibility(i);
        this.h.setVisibility(i == 0 ? 8 : 0);
        ajok ajokVar2 = new ajok(ajokVar);
        ajokVar2.b = this.c.j.d();
        if (this.g.getVisibility() == 0) {
            this.o.setVisibility(0);
            this.n.setVisibility(8);
            view = this.o;
        } else {
            this.n.setVisibility(0);
            this.o.setVisibility(8);
            view = this.n;
        }
        b(view, ajokVar2);
    }
}
