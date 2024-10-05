package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.youtube.R;
import defpackage.acrb;
import defpackage.ahvo;
import defpackage.ahyf;
import defpackage.aomf;
import defpackage.oba;
import defpackage.opn;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ad implements View.OnClickListener {
    final /* synthetic */ ak a;

    public ad(ak akVar) {
        this.a = akVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ak akVar = this.a;
        if (view == akVar.q) {
            if (akVar.K && akVar.I.u) {
                if (akVar.T()) {
                    akVar.H();
                    akVar.Q(true);
                }
                akVar.b.a();
                return;
            }
            return;
        }
        if (view == akVar.r) {
            if (akVar.L && akVar.I.u) {
                if (akVar.T()) {
                    akVar.H();
                    akVar.Q(true);
                }
                akVar.b.b();
                return;
            }
            return;
        }
        if (view == akVar.p) {
            if (akVar.H.a == ahvo.ENDED) {
                this.a.b.n();
                return;
            } else if (this.a.H.a == ahvo.PLAYING) {
                this.a.b.e();
                return;
            } else {
                if (this.a.H.a == ahvo.PAUSED) {
                    this.a.b.f();
                    return;
                }
                return;
            }
        }
        if (view == akVar.y) {
            akVar.b.l();
            return;
        }
        if (view == akVar.z) {
            akVar.b.m();
            return;
        }
        if (view == akVar.m) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar = akVar.d;
            if (aVar != null) {
                aVar.j();
                ak akVar2 = this.a;
                akVar2.D.a(akVar2.m.a.I());
                return;
            }
            return;
        }
        if (view == akVar.n) {
            if (akVar.P) {
                akVar.e.t();
                return;
            }
            return;
        }
        if (view == akVar.o) {
            com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = akVar.C;
            if (dVar != null) {
                try {
                    dVar.b(acrb.PLAYER_OVERFLOW_BUTTON.Jk);
                } catch (RemoteException unused) {
                }
            }
            final com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b bVar = akVar.E;
            final ArrayList<com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a> arrayList = new ArrayList();
            if (bVar.f()) {
                if (bVar.j == null) {
                    bVar.a();
                }
                arrayList.add(bVar.j);
            }
            if (bVar.n) {
                if (bVar.i == null) {
                    Drawable drawable = bVar.g.getResources().getDrawable(R.drawable.embeds_closed_caption_icon, bVar.g.getTheme());
                    com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar2 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a(bVar.g.getResources().getString(R.string.overflow_captions), 1);
                    aVar2.d = drawable;
                    aVar2.f = bVar.g.getText(R.string.accessibility_closed_captions);
                    aVar2.g = acrb.PLAYER_OVERFLOW_MENU_CC_BUTTON;
                    bVar.i = aVar2;
                }
                arrayList.add(bVar.i);
            }
            if (bVar.o) {
                if (bVar.k == null) {
                    Drawable drawable2 = bVar.g.getResources().getDrawable(R.drawable.quantum_ic_watch_later_grey600_18);
                    String d = bVar.q.d();
                    String c = bVar.q.c();
                    if (bVar.o && d != null && c != null) {
                        com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a(d, 2);
                        aVar3.d = drawable2;
                        aVar3.f = c;
                        aVar3.h = bVar.q.b();
                        bVar.k = aVar3;
                    }
                }
                com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar4 = bVar.k;
                if (aVar4 != null) {
                    arrayList.add(aVar4);
                }
            }
            if (bVar.r) {
                if (bVar.l == null) {
                    Resources resources = bVar.g.getResources();
                    Drawable drawable3 = resources.getDrawable(R.drawable.quantum_ic_googleplus_reshare_grey600_18);
                    com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar5 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a(resources.getString(R.string.share), 3);
                    aVar5.d = drawable3;
                    aVar5.f = bVar.g.getText(R.string.accessibility_share);
                    bVar.l = aVar5;
                }
                com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar6 = bVar.l;
                if (aVar6 != null) {
                    arrayList.add(aVar6);
                }
            }
            AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.a
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                    String string;
                    b bVar2 = b.this;
                    int i2 = ((com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a) arrayList.get(i)).a;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            bVar2.b(acrb.PLAYER_OVERFLOW_MENU_CC_BUTTON);
                            bVar2.e.c();
                            return;
                        }
                        if (i2 != 2) {
                            if (i2 == 3) {
                                bVar2.f.cancel();
                                bVar2.s.t();
                                return;
                            }
                            throw new IllegalArgumentException("Top level list item must have either quality or captions id");
                        }
                        bVar2.f.cancel();
                        bVar2.p.j();
                        try {
                            bVar2.h.c(bVar2.q.b().I());
                            return;
                        } catch (RemoteException e) {
                            oba.B(e);
                            return;
                        }
                    }
                    bVar2.b(acrb.PLAYER_OVERFLOW_MENU_QUALITY_BUTTON);
                    final d dVar2 = bVar2.c;
                    com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e eVar = bVar2.f;
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    for (VideoQuality videoQuality : dVar2.f) {
                        com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b bVar3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b(videoQuality.b);
                        if (dVar2.i) {
                            if (videoQuality.a == -2) {
                                int i4 = dVar2.g;
                                if (i4 > 0 && i4 < dVar2.f.length) {
                                    string = dVar2.c.getResources().getString(R.string.quality_label, dVar2.f[dVar2.g].b);
                                } else {
                                    int i5 = dVar2.h;
                                    string = (i5 <= 0 || i5 >= dVar2.f.length) ? "" : dVar2.c.getResources().getString(R.string.quality_label, dVar2.f[dVar2.h].b);
                                }
                                String valueOf = String.valueOf(string);
                                bVar3.e = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
                                bVar3.c = true;
                                bVar3.b();
                            }
                        } else if (i3 == dVar2.g) {
                            bVar3.b();
                        }
                        arrayList2.add(bVar3);
                        i3++;
                    }
                    dVar2.d = opn.b(R.string.quality_title, arrayList2, new AdapterView.OnItemClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.c
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView2, View view3, int i6, long j2) {
                            d dVar3 = d.this;
                            if (i6 >= 0) {
                                VideoQuality[] videoQualityArr = dVar3.f;
                                if (i6 < videoQualityArr.length) {
                                    dVar3.e.x(videoQualityArr[i6].a);
                                    dVar3.d.cancel();
                                }
                            }
                        }
                    }, dVar2.c, dVar2.a, dVar2.b);
                    eVar.b(dVar2.d);
                }
            };
            opn opnVar = bVar.t;
            bVar.f = opn.b(0, arrayList, onItemClickListener, bVar.g, bVar.a, bVar.b);
            bVar.f.show();
            if (bVar.r && bVar.l != null) {
                bVar.s.u();
            }
            for (com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar7 : arrayList) {
                acrb acrbVar = aVar7.g;
                if (acrbVar != null) {
                    try {
                        bVar.h.h(acrbVar.Jk);
                    } catch (RemoteException e) {
                        oba.B(e);
                    }
                } else {
                    aomf aomfVar = aVar7.h;
                    if (aomfVar != null) {
                        try {
                            bVar.h.i(aomfVar.I());
                        } catch (RemoteException e2) {
                            oba.B(e2);
                        }
                    }
                }
            }
            return;
        }
        if (view == akVar.j) {
            akVar.b.w(!r1.isSelected());
            return;
        }
        if (view == akVar.k) {
            if (akVar.f166J) {
                return;
            }
            akVar.H();
            this.a.Q(true);
            return;
        }
        if (view == akVar.l) {
            long j = akVar.i.a;
            akVar.b.r(j);
            ahyf.K(this.a.i, j);
            this.a.h.P(j);
            this.a.S(true);
        }
    }
}
