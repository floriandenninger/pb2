package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import com.google.protos.youtube.api.innertube.PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ioj implements ajom {
    public final Activity a;
    public final Executor b;
    public final ajjs c;
    public final aahd d;
    final LinearLayout f;
    public boolean h;
    public inq i;
    private final akxw j;
    private final afsy l;
    private final akvq m;
    private final ajjz o;
    private final ggt p;
    private ajok q;
    private PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer r;
    private anhy s;
    private final acqz t;
    private final akxu k = new iob(this);
    final Map e = new HashMap();
    public boolean g = false;
    private final ioi n = new ioi(this);

    public ioj(Activity activity, Executor executor, afsy afsyVar, akxw akxwVar, ajjs ajjsVar, akvq akvqVar, aahd aahdVar, ajjz ajjzVar, ajut ajutVar, acqz acqzVar) {
        this.a = activity;
        this.b = executor;
        this.l = afsyVar;
        this.c = ajjsVar;
        this.j = akxwVar;
        this.m = akvqVar;
        this.d = aahdVar;
        this.o = ajjzVar;
        this.p = new ggt(activity, ajutVar);
        this.f = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.reel_upload_bottomsheet_root_view, (ViewGroup) null);
        this.t = acqzVar;
    }

    private final boolean m() {
        return this.f.findViewWithTag("WATCH_STORY_TAG") != null;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.j.c();
        this.j.f(this.k);
        if (this.g) {
            this.g = false;
            if (!this.s.isDone()) {
                this.s.cancel(true);
            }
            this.m.d(this.n);
        }
        ArrayList arrayList = new ArrayList(this.e.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d((String) arrayList.get(i));
        }
        this.f.removeAllViews();
    }

    public final void d(String str) {
        if (((god) this.e.get(str)) != null) {
            this.e.remove(str);
            View findViewWithTag = this.f.findViewWithTag(str);
            ((ImageView) findViewWithTag.findViewById(R.id.reel_upload_thumbnail)).setImageDrawable(null);
            this.f.removeView(findViewWithTag);
        }
    }

    public final void e(final akzs akzsVar) {
        String queryParameter;
        int i;
        akzq a = akzq.a(akzsVar.l);
        if (a == null) {
            a = akzq.UNKNOWN_UPLOAD;
        }
        if (a != akzq.REELS_UPLOAD || this.l.c() == null) {
            return;
        }
        this.l.c().d();
        if (this.l.c().d().equals(akzsVar.e)) {
            String str = akzsVar.k;
            zhq.m(str);
            god godVar = (god) this.e.get(str);
            if (godVar == null) {
                aone createBuilder = atde.a.createBuilder();
                aqyg g = ajcq.g(this.a.getResources().getString(R.string.reel_upload_bottomsheet_delete_upload));
                createBuilder.copyOnWrite();
                atde atdeVar = (atde) createBuilder.instance;
                g.getClass();
                atdeVar.c = g;
                atdeVar.b |= 1;
                aone createBuilder2 = DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.a.createBuilder();
                String str2 = akzsVar.k;
                createBuilder2.copyOnWrite();
                DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) createBuilder2.instance;
                str2.getClass();
                deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.b |= 4;
                deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d = str2;
                DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2 = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) createBuilder2.build();
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2);
                createBuilder.copyOnWrite();
                atde atdeVar2 = (atde) createBuilder.instance;
                apxf apxfVar = (apxf) aongVar.build();
                apxfVar.getClass();
                atdeVar2.e = apxfVar;
                atdeVar2.b |= 8;
                aone createBuilder3 = atda.a.createBuilder();
                createBuilder3.copyOnWrite();
                atda atdaVar = (atda) createBuilder3.instance;
                atde atdeVar3 = (atde) createBuilder.build();
                atdeVar3.getClass();
                atdaVar.d = atdeVar3;
                atdaVar.b |= 2;
                atda atdaVar2 = (atda) createBuilder3.build();
                aone createBuilder4 = atdc.a.createBuilder();
                createBuilder4.copyOnWrite();
                atdc atdcVar = (atdc) createBuilder4.instance;
                atdaVar2.getClass();
                atdcVar.a();
                atdcVar.c.add(atdaVar2);
                god godVar2 = new god(str, (atdc) createBuilder4.build(), akzsVar.f);
                this.e.put(str, godVar2);
                this.j.b(this.l.c(), akzsVar.k, null, akzsVar.X);
                godVar = godVar2;
            }
            akzp akzpVar = akzsVar.f65J;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            godVar.c(akzpVar);
            if (akzsVar.af) {
                godVar.b();
            }
            String str3 = akzsVar.k;
            god godVar3 = (god) this.e.get(str3);
            if (godVar3 != null && this.f.findViewWithTag(str3) == null) {
                RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.a).inflate(R.layout.reel_upload_bottomsheet_cell, (ViewGroup) this.f, false);
                relativeLayout.setTag(str3);
                ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.reel_upload_thumbnail);
                Uri uri = godVar3.a;
                if (uri != null && (queryParameter = uri.getQueryParameter("videoThumbnailFilePath")) != null && new File(queryParameter).exists()) {
                    int dimension = (int) this.a.getResources().getDimension(R.dimen.reel_upload_bottomsheet_circular_thumbnail_size);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(queryParameter, options);
                    int i2 = options.outHeight;
                    int i3 = options.outWidth;
                    if (i2 > dimension || i3 > dimension) {
                        int i4 = i2 / 2;
                        int i5 = i3 / 2;
                        i = 1;
                        while (i4 / i >= dimension && i5 / i >= dimension) {
                            i += i;
                        }
                    } else {
                        i = 1;
                    }
                    options.inSampleSize = i;
                    options.inJustDecodeBounds = false;
                    Bitmap decodeFile = BitmapFactory.decodeFile(queryParameter, options);
                    if (decodeFile != null) {
                        imageView.setImageBitmap(decodeFile);
                        this.h = true;
                    }
                }
                ((ImageView) relativeLayout.findViewById(R.id.reel_upload_delete_button)).setOnClickListener(new View.OnClickListener() { // from class: ins
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ioj iojVar = ioj.this;
                        akzs akzsVar2 = akzsVar;
                        aong aongVar2 = (aong) apxf.a.createBuilder();
                        aonk aonkVar = DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint;
                        aone createBuilder5 = DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.a.createBuilder();
                        String str4 = akzsVar2.k;
                        createBuilder5.copyOnWrite();
                        DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint3 = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) createBuilder5.instance;
                        str4.getClass();
                        deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint3.b |= 4;
                        deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint3.d = str4;
                        aongVar2.e(aonkVar, (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) createBuilder5.build());
                        iojVar.d.c((apxf) aongVar2.build(), null);
                    }
                });
                k(str3);
                this.f.addView(relativeLayout, m() ? 1 : 0);
                l(godVar3);
                this.f.setVisibility(0);
                if (zev.e(this.f.getContext())) {
                    zev.c(this.f.getContext(), relativeLayout, this.f.getContext().getString(R.string.reel_upload_bottomsheet_content_description));
                }
            }
        }
    }

    public final void f() {
        inq inqVar = this.i;
        if (inqVar != null) {
            inqVar.a.z();
        }
        i();
    }

    @Override // defpackage.ajom
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer) {
        this.q = ajokVar;
        this.r = pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;
        this.f.removeAllViews();
        this.t.mM().u(new acqx(pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.f), null);
        afsx c = this.l.c();
        this.j.a(this.k);
        this.m.c(this.n);
        anhy a = this.m.a(c);
        this.s = a;
        this.g = true;
        ynm.k(a, this.b, gwr.j, new ynl() { // from class: inw
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                ioj iojVar = ioj.this;
                List<akzs> list = (List) obj;
                if (iojVar.g) {
                    for (akzs akzsVar : list) {
                        akzr a2 = akzr.a(akzsVar.Z);
                        if (a2 == null) {
                            a2 = akzr.UNKNOWN;
                        }
                        if (a2 == akzr.UNKNOWN || a2 == akzr.NOT_CREATED) {
                            iojVar.e(akzsVar);
                        }
                    }
                }
            }
        });
        PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer2 = this.r;
        boolean z = (pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer2.b & 8) != 0;
        aulq aulqVar = pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer2.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        final apmg V = etx.V(z, aulqVar);
        if (V != null) {
            View inflate = LayoutInflater.from(this.a).inflate(R.layout.reel_upload_bottomsheet_open_camera, (ViewGroup) this.f, false);
            inflate.setTag("ADD_TO_STORY_TAG");
            TextView textView = (TextView) inflate.findViewById(R.id.label_view);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon_view);
            Resources resources = this.a.getResources();
            ggt ggtVar = this.p;
            arfs arfsVar = V.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageDrawable(resources.getDrawable(ggtVar.a(b)));
            aqyg aqygVar = V.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
            inflate.setOnClickListener(new View.OnClickListener() { // from class: inu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ioj iojVar = ioj.this;
                    apmg apmgVar = V;
                    aahd aahdVar = iojVar.d;
                    apxf apxfVar = apmgVar.p;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                    iojVar.f();
                }
            });
            this.f.addView(inflate, 0);
            this.t.mM().u(new acqx(V.t), null);
        }
        aulq aulqVar2 = this.r.d;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        int bl = anaf.bl(((ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer) aulqVar2.pX(ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.channelReelAvatarRenderer)).e);
        if (bl != 0 && bl == 3) {
            return;
        }
        j();
    }

    public final void i() {
        ajwx ajwxVar;
        ajok ajokVar = this.q;
        if (ajokVar == null || (ajwxVar = (ajwx) ajokVar.c("sectionListController")) == null) {
            return;
        }
        ajwxVar.lo();
    }

    public final void j() {
        if (m()) {
            return;
        }
        aone createBuilder = atmc.a.createBuilder();
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 2;
        atmcVar.d = 6827;
        atmc atmcVar2 = (atmc) createBuilder.build();
        aulq aulqVar = this.r.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer = (ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer) ahbj.m(aulqVar);
        if (channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer == null) {
            return;
        }
        this.t.mM().u(new acqx(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.h), null);
        apxf apxfVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, reelWatchEndpointOuterClass$ReelWatchEndpoint);
        aongVar.e(atmb.b, atmcVar2);
        final apxf apxfVar2 = (apxf) aongVar.build();
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.reel_upload_bottomsheet_view_story, (ViewGroup) this.f, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.avatar_view);
        ajjz ajjzVar = this.o;
        avgg avggVar = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.k(imageView, avggVar, null);
        inflate.setTag("WATCH_STORY_TAG");
        inflate.setOnClickListener(new View.OnClickListener() { // from class: inv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ioj iojVar = ioj.this;
                apxf apxfVar3 = apxfVar2;
                iojVar.f();
                iojVar.d.c(apxfVar3, null);
            }
        });
        this.f.addView(inflate, 0);
    }

    public final void k(String str) {
        god godVar = (god) this.e.get(str);
        View findViewWithTag = this.f.findViewWithTag(str);
        if (godVar == null || findViewWithTag == null) {
            return;
        }
        ProgressBar progressBar = (ProgressBar) findViewWithTag.findViewById(R.id.reel_upload_progressbar);
        ((TextView) findViewWithTag.findViewById(R.id.reel_upload_progress_text)).setText(this.a.getResources().getString(R.string.reel_upload_bottomsheet_uploading, NumberFormat.getPercentInstance().format(godVar.a())));
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", (int) (godVar.a() * 95.0d));
        ofInt.setDuration(250L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public final void l(god godVar) {
        View findViewWithTag = this.f.findViewWithTag(godVar.b);
        if (findViewWithTag == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewWithTag.findViewById(R.id.reel_upload_progressbar_layout);
        TextView textView = (TextView) findViewWithTag.findViewById(R.id.reel_upload_status_message);
        if (godVar.c || godVar.i == 3 || godVar.d) {
            viewGroup.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(R.string.reel_upload_bottomsheet_upload_failed);
            return;
        }
        int i = godVar.h;
        if (i == 2) {
            viewGroup.setVisibility(8);
            textView.setText(R.string.reel_upload_bottomsheet_waiting_for_network);
            textView.setVisibility(0);
        } else if (i != 1) {
            textView.setVisibility(8);
            viewGroup.setVisibility(0);
            k(godVar.b);
        } else {
            viewGroup.setVisibility(8);
            textView.setText(R.string.reel_upload_bottomsheet_waiting_for_wifi);
            textView.setVisibility(0);
        }
    }
}
