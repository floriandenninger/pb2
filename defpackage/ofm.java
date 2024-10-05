package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ofm implements flg, ypd {
    public final ci a;
    public final acra b;
    public final ypa c;
    public final PlaybackLoopShuffleMonitor d;
    public final aahd e;
    public final ainl f;
    public final ajut g;
    public final aalw h;
    public final View i;
    public final PlaylistLoopButtonView j;
    public final ImageView k;
    public apmp l;
    public boolean m;
    public boolean n;
    public final lru o;
    public final aoae p;
    private final ImageView q;
    private aubs r;
    private boolean s;
    private ghf t;

    public ofm(ci ciVar, final acra acraVar, ypa ypaVar, final ainl ainlVar, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, aahd aahdVar, aoae aoaeVar, ajut ajutVar, aalw aalwVar, lru lruVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = ciVar;
        this.b = acraVar;
        this.c = ypaVar;
        this.d = playbackLoopShuffleMonitor;
        this.e = aahdVar;
        this.f = ainlVar;
        this.p = aoaeVar;
        this.g = ajutVar;
        this.h = aalwVar;
        this.o = lruVar;
        View inflate = LayoutInflater.from(ciVar).inflate(R.layout.compact_playlist_panel_header, (ViewGroup) null);
        this.i = inflate;
        PlaylistLoopButtonView playlistLoopButtonView = (PlaylistLoopButtonView) inflate.findViewById(R.id.repeat);
        this.j = playlistLoopButtonView;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.shuffle);
        this.k = imageView;
        this.q = (ImageView) inflate.findViewById(R.id.three_dots_menu);
        playlistLoopButtonView.setImageResource(R.drawable.playlist_repeat_button);
        playlistLoopButtonView.setOnClickListener(new View.OnClickListener() { // from class: ofi
            /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
            
                if (r7.n == false) goto L14;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r7) {
                /*
                    r6 = this;
                    ofm r7 = defpackage.ofm.this
                    acra r0 = r2
                    ainl r1 = r3
                    com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView r2 = r7.j
                    boolean r2 = r2.isSelected()
                    r3 = 0
                    r4 = 2
                    if (r2 == 0) goto L1e
                    com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView r2 = r7.j
                    int[] r2 = r2.b
                    int[] r5 = com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView.a
                    if (r2 != r5) goto L19
                    goto L25
                L19:
                    boolean r7 = r7.n
                    if (r7 == 0) goto L25
                    goto L24
                L1e:
                    boolean r7 = r7.m
                    if (r7 == 0) goto L24
                    r3 = 1
                    goto L25
                L24:
                    r3 = 2
                L25:
                    if (r3 != r4) goto L38
                    acqx r7 = new acqx
                    r2 = 125879(0x1ebb7, float:1.76394E-40)
                    acsc r2 = defpackage.acsb.c(r2)
                    r7.<init>(r2)
                    r2 = 3
                    r4 = 0
                    r0.I(r2, r7, r4)
                L38:
                    r1.h(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ofi.onClick(android.view.View):void");
            }
        });
        imageView.setOnClickListener(new ofl(this));
    }

    public static boolean c(apmp apmpVar) {
        return (apmpVar == null || (apmpVar.b & 1024) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.aubs r5, defpackage.aama r6) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofm.a(aubs, aama):void");
    }

    public final void b(ghf ghfVar) {
        aubs aubsVar = this.r;
        atdk atdkVar = null;
        if (aubsVar == null || ghfVar == null || !TextUtils.equals(aubsVar.k, ghfVar.b())) {
            this.t = null;
            return;
        }
        int i = 0;
        boolean z = ghfVar.a() == asno.LIKE;
        aubs aubsVar2 = this.r;
        if (aubsVar2 != null) {
            atdf atdfVar = aubsVar2.z;
            if (atdfVar == null) {
                atdfVar = atdf.a;
            }
            atdc atdcVar = atdfVar.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
            Iterator it = atdcVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                atda atdaVar = (atda) it.next();
                if ((atdaVar.b & 8) != 0) {
                    atdk atdkVar2 = atdaVar.f;
                    if (atdkVar2 == null) {
                        atdkVar2 = atdk.a;
                    }
                    apxf apxfVar = atdkVar2.e;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    if (apxfVar.pY(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)) {
                        atdkVar = atdaVar.f;
                        if (atdkVar == null) {
                            atdkVar = atdk.a;
                        }
                    }
                }
                i++;
            }
            if (atdkVar != null) {
                atdf atdfVar2 = aubsVar2.z;
                if (atdfVar2 == null) {
                    atdfVar2 = atdf.a;
                }
                atdc atdcVar2 = atdfVar2.c;
                if (atdcVar2 == null) {
                    atdcVar2 = atdc.a;
                }
                aone builder = atdcVar2.toBuilder();
                aone createBuilder = atda.a.createBuilder();
                aone builder2 = atdkVar.toBuilder();
                builder2.copyOnWrite();
                atdk atdkVar3 = (atdk) builder2.instance;
                atdkVar3.b |= 256;
                atdkVar3.i = z;
                createBuilder.copyOnWrite();
                atda atdaVar2 = (atda) createBuilder.instance;
                atdk atdkVar4 = (atdk) builder2.build();
                atdkVar4.getClass();
                atdaVar2.f = atdkVar4;
                atdaVar2.b |= 8;
                builder.aF(i, createBuilder);
                atdc atdcVar3 = (atdc) builder.build();
                aong aongVar = (aong) aubsVar2.toBuilder();
                aone createBuilder2 = atdf.a.createBuilder();
                createBuilder2.copyOnWrite();
                atdf atdfVar3 = (atdf) createBuilder2.instance;
                atdcVar3.getClass();
                atdfVar3.c = atdcVar3;
                atdfVar3.b |= 1;
                aongVar.copyOnWrite();
                aubs aubsVar3 = (aubs) aongVar.instance;
                atdf atdfVar4 = (atdf) createBuilder2.build();
                atdfVar4.getClass();
                aubsVar3.z = atdfVar4;
                aubsVar3.c |= 4194304;
                this.r = (aubs) aongVar.build();
            }
        }
        this.t = ghfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // defpackage.flg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r6, boolean r7) {
        /*
            r5 = this;
            com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView r0 = r5.j
            r1 = 0
            r2 = 1
            r3 = 2
            if (r6 == r2) goto Lc
            if (r6 != r3) goto Lb
            r6 = 2
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r0.setSelected(r2)
            com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView r0 = r5.j
            int[] r2 = r0.b
            if (r2 != 0) goto L1f
            if (r6 != r3) goto L1f
            int[] r6 = com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView.a
            r0.b = r6
        L1b:
            r0.refreshDrawableState()
            goto L29
        L1f:
            int[] r4 = com.google.android.apps.youtube.app.watch.panel.ui.PlaylistLoopButtonView.a
            if (r2 != r4) goto L29
            if (r6 == r3) goto L29
            r6 = 0
            r0.b = r6
            goto L1b
        L29:
            apmp r6 = r5.l
            boolean r6 = c(r6)
            if (r6 != 0) goto L37
            android.widget.ImageView r6 = r5.k
            r6.setSelected(r7)
            return
        L37:
            android.widget.ImageView r6 = r5.k
            r6.setSelected(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofm.g(int, boolean):void");
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ghf.class};
        }
        if (i == 0) {
            b((ghf) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
