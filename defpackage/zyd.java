package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zyd extends zya implements View.OnClickListener, ViewTreeObserver.OnScrollChangedListener, vsj, vxb, zyi, zva {
    public ScrollView a;
    private ImageButton ae;
    private EditableVideoControllerView af;
    private VideoTrimView ag;
    private AudioTrackView ah;
    private ImageButton ai;
    private AudioCrossFadeView aj;
    private ChooseFilterView ak;
    private View al;
    private View am;
    private int an = -1;
    private float b;
    private View c;
    private VideoWithPreviewView d;
    private ImageButton e;

    private final void o() {
        View view = this.O;
        if (view == null) {
            return;
        }
        view.postDelayed(new zyc(this), 0L);
    }

    @Override // defpackage.zya, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        this.b = activity.getResources().getDimension(R.dimen.upload_edit_video_fragment_scroll_play_threshold);
    }

    @Override // defpackage.zxz
    protected final View aG() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zxz
    public final View aI() {
        return this.ae;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zxz
    public final View aK() {
        return this.am;
    }

    @Override // defpackage.zxz
    protected final View aN() {
        return this.al;
    }

    @Override // defpackage.zxz
    protected final VideoWithPreviewView aQ() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zxz
    public final VideoTrimView aR() {
        return this.ag;
    }

    @Override // defpackage.zxz
    protected final AudioCrossFadeView aS() {
        return this.aj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zxz
    public final AudioTrackView aT() {
        return this.ah;
    }

    @Override // defpackage.zxz
    protected final ChooseFilterView aU() {
        return this.ak;
    }

    @Override // defpackage.zxz
    protected final EditableVideoControllerView aV() {
        return this.af;
    }

    @Override // defpackage.zxz
    protected final void bF(boolean z, boolean z2, int i, int i2, int i3) {
        AudioCrossFadeView audioCrossFadeView = this.aj;
        int i4 = 8;
        if (z && !z2) {
            i4 = 0;
        }
        audioCrossFadeView.setVisibility(i4);
        this.aj.setPadding(i, 0, i2 + i3, 0);
    }

    @Override // defpackage.zxz
    protected final void bG() {
        ImageButton imageButton = this.e;
        if (imageButton instanceof ImageButton) {
            imageButton.setImageResource(R.drawable.ic_audioswap_button_32dp);
        }
    }

    @Override // defpackage.zxz
    protected final void bH(int i) {
        this.ah.setPadding(0, 0, i, 0);
    }

    @Override // defpackage.zxz
    protected final void bd() {
        this.ak.setBackgroundColor(qX().getColor(R.color.upload_edit_choose_filter_view_background));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zxz
    public final void bi() {
        zou zouVar;
        ImageButton imageButton = this.ae;
        if (imageButton instanceof ImageButton) {
            boolean q = this.ak.c().q();
            int i = R.drawable.ic_filter_button_32dp;
            if (q && (zouVar = this.aS) != null && zouVar.a(avwy.EFFECTS_FEATURE_DOT_ON_FILTER_ICON)) {
                i = R.drawable.ic_filter_button_with_dot_32dp;
            }
            imageButton.setImageResource(i);
        }
    }

    @Override // defpackage.zxz
    protected final boolean bo() {
        return false;
    }

    @Override // defpackage.zxz
    protected final ImageButton br() {
        return this.ai;
    }

    @Override // defpackage.zxz
    protected final void bv(Throwable th) {
        String valueOf = String.valueOf(wcy.K(th));
        afsi.c(2, 6, valueOf.length() != 0 ? "youtubeUploadExoPlayerPreview::".concat(valueOf) : new String("youtubeUploadExoPlayerPreview::"), th);
    }

    @Override // defpackage.zva
    public final void g() {
        this.ae.sendAccessibilityEvent(8);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.upload_edit_video_fragment, viewGroup, false);
        inflate.setWillNotDraw(false);
        inflate.setBackgroundColor(-16777216);
        View findViewById = inflate.findViewById(R.id.video_view_container);
        this.c = findViewById;
        findViewById.setOnClickListener(this);
        VideoWithPreviewView videoWithPreviewView = (VideoWithPreviewView) inflate.findViewById(R.id.video_view);
        this.d = videoWithPreviewView;
        videoWithPreviewView.setOnClickListener(this);
        this.al = inflate.findViewById(R.id.video_loading_indicator);
        this.am = inflate.findViewById(R.id.effect_pending_indicator);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.audio_swap_button);
        this.e = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.choose_filter_button);
        this.ae = imageButton2;
        imageButton2.setOnClickListener(this);
        this.af = (EditableVideoControllerView) inflate.findViewById(R.id.editable_video_controller);
        VideoTrimView videoTrimView = (VideoTrimView) inflate.findViewById(R.id.video_trim);
        this.ag = videoTrimView;
        videoTrimView.j = new vsf(qR(), inflate);
        vsf vsfVar = videoTrimView.j;
        if (vsfVar != null) {
            vsfVar.d = videoTrimView.a;
        }
        this.ah = (AudioTrackView) inflate.findViewById(R.id.audio_track);
        ImageButton imageButton3 = (ImageButton) inflate.findViewById(R.id.audio_mixer_button);
        this.ai = imageButton3;
        imageButton3.setOnClickListener(this);
        this.aj = (AudioCrossFadeView) inflate.findViewById(R.id.audio_cross_fade);
        ChooseFilterView chooseFilterView = (ChooseFilterView) inflate.findViewById(R.id.choose_filter_view);
        this.ak = chooseFilterView;
        yny.z(chooseFilterView.c, yny.p(80), LinearLayout.LayoutParams.class);
        this.ak.i(this);
        return inflate;
    }

    @Override // defpackage.zxz, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.c || view == this.d) {
            ScrollView scrollView = this.a;
            if (scrollView != null) {
                if (scrollView.getScrollY() != this.d.getTop()) {
                    ScrollView scrollView2 = this.a;
                    scrollView2.smoothScrollTo(scrollView2.getScrollX(), this.d.getTop());
                    o();
                }
                if (Math.abs(r4 - this.d.getTop()) < this.b) {
                    this.af.p();
                    return;
                }
                return;
            }
            return;
        }
        super.onClick(view);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        vwm vwmVar;
        ScrollView scrollView = this.a;
        if (scrollView == null) {
            return;
        }
        int scrollY = scrollView.getScrollY();
        if (scrollY != this.an) {
            this.an = scrollY;
            if (scrollY == 0) {
                o();
                scrollY = 0;
            }
        }
        if (Math.abs(scrollY - this.d.getTop()) <= this.b || (vwmVar = this.aH.f) == null) {
            return;
        }
        vwmVar.l(false);
    }

    @Override // defpackage.zxz
    protected final int q() {
        return R.fraction.upload_edit_video_fragment_max_video_height;
    }
}
