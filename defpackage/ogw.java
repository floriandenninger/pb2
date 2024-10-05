package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ogw {
    public final akbv a;
    public final PlaybackLoopShuffleMonitor b;
    public final acra c;
    public final ogv d;
    public final Map e;
    public final TextView f;
    public final View g;
    public aubs h;
    public Integer i;
    private final oip j;
    private final gni k;
    private final List l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final ImageView p;
    private final ImageView q;
    private final int r;
    private final int s;
    private final int t;
    private ayqx u;

    public ogw(PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, akbv akbvVar, gni gniVar, acra acraVar, oip oipVar, View view) {
        this.b = playbackLoopShuffleMonitor;
        this.a = akbvVar;
        this.j = oipVar;
        this.k = gniVar;
        this.c = acraVar;
        ogv ogvVar = new ogv(this);
        this.d = ogvVar;
        this.e = new HashMap();
        this.l = new ArrayList();
        View inflate = ((ViewStub) view.findViewById(R.id.playlist_entry_point_stub)).inflate();
        this.g = inflate;
        this.m = (TextView) inflate.findViewById(R.id.next_video_title);
        this.n = (TextView) inflate.findViewById(R.id.playlist_name);
        this.f = (TextView) inflate.findViewById(R.id.position);
        this.o = (TextView) inflate.findViewById(R.id.next_label);
        this.p = (ImageView) inflate.findViewById(R.id.icon);
        this.q = (ImageView) inflate.findViewById(R.id.chevron);
        this.r = wbs.Q(inflate.getContext(), R.attr.ytTextPrimary);
        this.s = wbs.Q(inflate.getContext(), R.attr.ytTextSecondary);
        this.t = wbs.Q(inflate.getContext(), R.attr.ytBrandBackgroundSecondary);
        playbackLoopShuffleMonitor.g(ogvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.aubs r7) {
        /*
            r6 = this;
            aubs r0 = r6.h
            boolean r0 = defpackage.amkq.b(r0, r7)
            if (r0 == 0) goto L9
            return
        L9:
            r6.h = r7
            java.util.Map r7 = r6.e
            r7.clear()
            java.util.List r7 = r6.l
            r7.clear()
            r7 = 0
            r6.i = r7
            aubs r0 = r6.h
            r1 = 1
            if (r0 != 0) goto L1e
            goto L62
        L1e:
            aony r0 = r0.i
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()
            aubr r2 = (defpackage.aubr) r2
            int r3 = r2.b
            r3 = r3 & r1
            if (r3 == 0) goto L24
            aubw r2 = r2.c
            if (r2 != 0) goto L3b
            aubw r2 = defpackage.aubw.a
        L3b:
            boolean r3 = r2.k
            if (r3 == 0) goto L4b
            java.util.List r3 = r6.l
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.i = r3
        L4b:
            java.lang.String r3 = r2.o
            java.util.Map r4 = r6.e
            java.util.List r5 = r6.l
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r3, r5)
            java.util.List r3 = r6.l
            r3.add(r2)
            goto L24
        L62:
            r6.c()
            aubs r0 = r6.h
            if (r0 == 0) goto L80
            int r2 = r0.c
            r3 = r2 & 2
            if (r3 == 0) goto L7a
            aqyg r0 = r0.h
            if (r0 != 0) goto L75
            aqyg r0 = defpackage.aqyg.a
        L75:
            android.text.Spanned r0 = defpackage.ajcq.b(r0)
            goto L81
        L7a:
            r2 = r2 & r1
            if (r2 == 0) goto L80
            java.lang.String r0 = r0.g
            goto L81
        L80:
            r0 = r7
        L81:
            android.widget.TextView r2 = r6.n
            defpackage.whu.G(r2, r0)
            r6.d()
            aubs r0 = r6.h
            if (r0 != 0) goto L8e
            goto L9e
        L8e:
            android.widget.ImageView r2 = r6.p
            boolean r0 = r0.r
            if (r1 == r0) goto L98
            r0 = 2131233448(0x7f080aa8, float:1.8083034E38)
            goto L9b
        L98:
            r0 = 2131233544(0x7f080b08, float:1.8083228E38)
        L9b:
            r2.setImageResource(r0)
        L9e:
            ayqx r0 = r6.u
            if (r0 == 0) goto La9
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            defpackage.azqb.f(r0)
            r6.u = r7
        La9:
            aubs r7 = r6.h
            if (r7 == 0) goto Ld0
            oip r7 = r6.j
            azqv r7 = r7.c
            aypn r7 = r7.n()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 1
            aypn r7 = r7.l(r2, r0)
            aypr r0 = defpackage.ahbw.e(r1)
            aypn r7 = r7.h(r0)
            ogu r0 = new ogu
            r0.<init>()
            ayqx r7 = r7.X(r0)
            r6.u = r7
        Ld0:
            r6.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogw.a(aubs):void");
    }

    public final void b() {
        int i = this.r;
        int i2 = this.s;
        int i3 = this.t;
        Integer num = this.i;
        if (num != null && num.intValue() >= 0 && num.intValue() < this.l.size()) {
            aubw aubwVar = (aubw) this.l.get(num.intValue());
            gng gngVar = gng.LIGHT;
            int ordinal = this.k.a().ordinal();
            asnf asnfVar = null;
            if (ordinal == 0) {
                avgg avggVar = aubwVar.f;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                if ((avggVar.b & 512) != 0) {
                    avgg avggVar2 = aubwVar.f;
                    if (avggVar2 == null) {
                        avggVar2 = avgg.a;
                    }
                    asnfVar = avggVar2.h;
                    if (asnfVar == null) {
                        asnfVar = asnf.a;
                    }
                } else if ((aubwVar.b & 67108864) != 0 && (asnfVar = aubwVar.x) == null) {
                    asnfVar = asnf.a;
                }
            } else if (ordinal == 1) {
                avgg avggVar3 = aubwVar.f;
                if (avggVar3 == null) {
                    avggVar3 = avgg.a;
                }
                if ((avggVar3.b & 1024) != 0) {
                    avgg avggVar4 = aubwVar.f;
                    if (avggVar4 == null) {
                        avggVar4 = avgg.a;
                    }
                    asnfVar = avggVar4.i;
                    if (asnfVar == null) {
                        asnfVar = asnf.a;
                    }
                } else if ((aubwVar.b & 134217728) != 0 && (asnfVar = aubwVar.y) == null) {
                    asnfVar = asnf.a;
                }
            }
            if (asnfVar != null) {
                i = (asnfVar.e & 16777215) | (-16777216);
                int i4 = (-16777216) | (asnfVar.f & 16777215);
                i3 = (16777215 & asnfVar.d) | (-234881024);
                i2 = i4;
            }
        }
        this.p.setImageTintList(ColorStateList.valueOf(i));
        this.o.setTextColor(i);
        this.m.setTextColor(i);
        this.n.setTextColor(i2);
        this.f.setTextColor(i2);
        this.q.setImageTintList(ColorStateList.valueOf(i));
        this.g.setBackgroundColor(i3);
    }

    public final void d() {
        Integer num = this.i;
        aubs aubsVar = this.h;
        String str = null;
        if (aubsVar != null && !aubsVar.r && !this.l.isEmpty() && num != null) {
            str = this.f.getResources().getString(R.string.playlist_position, Integer.valueOf(num.intValue() + 1), Integer.valueOf(this.h.m));
        }
        whu.G(this.f, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.i
            r1 = 0
            if (r0 != 0) goto L7
        L5:
            r0 = r1
            goto L32
        L7:
            com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor r2 = r5.b
            int r2 = r2.a
            r3 = 2
            if (r2 == r3) goto L32
            int r2 = r0.intValue()
            java.util.List r3 = r5.l
            int r3 = r3.size()
            int r3 = r3 + (-1)
            r4 = 1
            if (r2 >= r3) goto L27
            int r0 = r0.intValue()
            int r0 = r0 + r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L32
        L27:
            com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor r0 = r5.b
            int r0 = r0.a
            if (r0 != r4) goto L5
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L32:
            if (r0 == 0) goto L5c
            int r2 = r0.intValue()
            if (r2 < 0) goto L5c
            int r2 = r0.intValue()
            java.util.List r3 = r5.l
            int r3 = r3.size()
            if (r2 >= r3) goto L5c
            java.util.List r1 = r5.l
            int r2 = r0.intValue()
            java.lang.Object r1 = r1.get(r2)
            aubw r1 = (defpackage.aubw) r1
            aqyg r1 = r1.c
            if (r1 != 0) goto L58
            aqyg r1 = defpackage.aqyg.a
        L58:
            android.text.Spanned r1 = defpackage.ajcq.b(r1)
        L5c:
            android.widget.TextView r2 = r5.m
            defpackage.whu.G(r2, r1)
            android.widget.TextView r1 = r5.o
            if (r0 != 0) goto L69
            r0 = 2132019002(0x7f14073a, float:1.9676327E38)
            goto L6c
        L69:
            r0 = 2132019003(0x7f14073b, float:1.9676329E38)
        L6c:
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogw.c():void");
    }
}
