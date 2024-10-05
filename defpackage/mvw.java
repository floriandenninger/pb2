package defpackage;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvw {
    public final View a;
    public final View b;
    public final TextView c;
    public final ftm d;
    public final hbb e;
    public final aahd f;
    public apxf g;
    private final Handler h;
    private final ajjz i;
    private final View j;
    private final ImageView k;
    private final View l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final View q;
    private final TextView r;
    private final TextView s;
    private final eqw t;
    private final ajyf u;

    public mvw(Handler handler, ajjz ajjzVar, final aahd aahdVar, fvf fvfVar, ajyg ajygVar, ftn ftnVar, fvf fvfVar2, hbb hbbVar, View view, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.h = handler;
        this.i = ajjzVar;
        this.a = view;
        this.e = hbbVar;
        this.f = aahdVar;
        View findViewById = view.findViewById(R.id.channel_navigation_container);
        this.j = findViewById;
        this.k = (ImageView) view.findViewById(R.id.channel_owner_avatar);
        this.b = view.findViewById(R.id.channel_reel_avatar_ring);
        this.l = view.findViewById(R.id.channel_reel_avatar_ring_button);
        view.findViewById(R.id.channel_title_container);
        this.m = (TextView) view.findViewById(R.id.channel_title);
        this.n = (TextView) view.findViewById(R.id.header_text);
        this.o = (TextView) view.findViewById(R.id.channel_subscribers);
        this.p = (TextView) view.findViewById(R.id.channel_subscribers_long);
        TextView textView = (TextView) view.findViewById(R.id.subscribe_button);
        this.c = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.sponsor_button);
        this.s = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.purchase_button);
        this.r = textView3;
        View findViewById2 = view.findViewById(R.id.subscription_notification_view);
        this.q = findViewById2;
        ftm a = ftnVar.a(textView, fvfVar.b(findViewById2));
        this.d = a;
        if (textView2 != null) {
            this.t = fvfVar2.d(textView2);
        } else {
            a.k(2);
            this.t = null;
        }
        if (textView3 == null) {
            this.u = null;
        } else {
            this.u = ajygVar.a(textView3);
        }
        (findViewById != null ? findViewById : view).setOnClickListener(new View.OnClickListener() { // from class: mvr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mvw mvwVar = mvw.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar = mvwVar.g;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
            }
        });
    }

    public final void a() {
        this.d.d();
    }

    public final void b() {
        View view = this.b;
        if (view != null) {
            whu.I(view, false);
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.setOnClickListener(null);
            this.l.setClickable(false);
            whu.I(this.l, false);
        }
    }

    public final boolean c(ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer) {
        int bl = anaf.bl(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.e);
        if ((bl == 0 || bl == 1) && (channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.b & 2) != 0) {
            hbb hbbVar = this.e;
            apxf apxfVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)) {
                atdf atdfVar = ((MenuEndpointOuterClass$MenuEndpoint) apxfVar.pX(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c;
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
                    atdb atdbVar = atdaVar.c;
                    if (atdbVar == null) {
                        atdbVar = atdb.a;
                    }
                    if ((atdbVar.b & 4) != 0) {
                        atdb atdbVar2 = atdaVar.c;
                        if (atdbVar2 == null) {
                            atdbVar2 = atdb.a;
                        }
                        apxf apxfVar2 = atdbVar2.e;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        if (apxfVar2.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                            apxfVar = apxfVar2;
                            break;
                        }
                    }
                }
            }
            if (!hbbVar.f(apxfVar)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0085, code lost:
    
        if (r8 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0094, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0092, code lost:
    
        if (r8 == 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.auvs d(final defpackage.aone r12, boolean r13, final defpackage.acra r14, final defpackage.ajwx r15) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvw.d(aone, boolean, acra, ajwx):auvs");
    }
}
