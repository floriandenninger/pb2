package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.edit.gallery.MediaGridRecyclerView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zwh extends zwa {
    public zwg ae;
    public ImageView af;
    public FrameLayout ag;
    MediaGridRecyclerView ah;
    public DeviceLocalFile ai;
    private boolean al;
    private int am;
    private boolean an;
    public Executor b;
    public zxk c;
    public int d;
    public zwo e;
    final ayqw a = new ayqw();
    private String ak = null;
    public List aj = amru.q();

    private final boolean aF() {
        return this.am != 0;
    }

    public static zwh o(int i) {
        return s(i, false, false);
    }

    public static zwh s(int i, boolean z, boolean z2) {
        zwh zwhVar = new zwh();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_FILE_TYPE", i);
        bundle.putString("ARG_DIRECTORY_PATH", null);
        bundle.putBoolean("ARG_16_TO_9_RATIO", z);
        bundle.putInt("ARG_HEADER_RES", 0);
        bundle.putBoolean("ARG_USE_MEDIA_VIEW_MODEL", z2);
        zwhVar.af(bundle);
        return zwhVar;
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        if (this.a.b) {
            return;
        }
        this.a.qc();
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        zwo.y(this.ah);
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        if (this.an) {
            return;
        }
        zoj zojVar = new zoj(C());
        List q = amru.q();
        if (r()) {
            if (TextUtils.isEmpty(this.ak)) {
                q = zojVar.c(this.d);
            } else {
                q = (List) zojVar.d(this.d).get(this.ak);
            }
        }
        q(q);
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putParcelable("layout_manager_state", this.ah.n.P());
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        this.d = bundle2.getInt("ARG_FILE_TYPE");
        this.ak = bundle2.getString("ARG_DIRECTORY_PATH");
        this.al = bundle2.getBoolean("ARG_16_TO_9_RATIO", false);
        this.am = bundle2.getInt("ARG_HEADER_RES", 0);
        this.an = bundle2.getBoolean("ARG_USE_MEDIA_VIEW_MODEL", false);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ll zwiVar;
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.media_grid_fragment, viewGroup, false);
        ci C = C();
        this.ah = (MediaGridRecyclerView) inflate.findViewById(R.id.media_grid_recycler_view);
        this.af = (ImageView) inflate.findViewById(R.id.media_grid_zero_state_grid);
        this.ag = (FrameLayout) inflate.findViewById(R.id.media_grid_zero_state);
        this.ah.setFocusableInTouchMode(false);
        Parcelable parcelable = bundle != null ? bundle.getParcelable("layout_manager_state") : null;
        zwo zwoVar = new zwo(C, this.b, this.am);
        this.e = zwoVar;
        zwoVar.e = this.al;
        zwoVar.u(new zwd());
        this.ah.ac(this.e);
        if (parcelable != null) {
            this.ah.n.Y(parcelable);
        }
        if (aF()) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this.ah.n;
            gridLayoutManager.g = new zwf(this, gridLayoutManager);
            this.ah.setBackgroundColor(0);
            this.ah.ae(null);
        }
        MediaGridRecyclerView mediaGridRecyclerView = this.ah;
        Context qR = qR();
        if (aF()) {
            zwiVar = new zvw(qR);
        } else {
            zwiVar = new zwi(qR);
        }
        mediaGridRecyclerView.aB(zwiVar);
        this.e.d = new zwe(this);
        if (this.an) {
            this.a.d(this.c.c.U().ax(new ayrs(this) { // from class: zwb
                public final /* synthetic */ zwh a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i == 0) {
                        this.a.aj = (amru) obj;
                    } else {
                        zwh zwhVar = this.a;
                        zwhVar.q(zxc.a(zwhVar.aj, (zwv) obj));
                    }
                }
            }));
            final int i2 = 1;
            this.a.d(this.c.a().ax(new ayrs(this) { // from class: zwb
                public final /* synthetic */ zwh a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 == 0) {
                        this.a.aj = (amru) obj;
                    } else {
                        zwh zwhVar = this.a;
                        zwhVar.q(zxc.a(zwhVar.aj, (zwv) obj));
                    }
                }
            }));
        }
        return inflate;
    }

    public final void p() {
        this.e.getClass();
    }

    public final void q(List list) {
        DeviceLocalFile deviceLocalFile;
        p();
        if (r() && (deviceLocalFile = this.ai) != null) {
            list.add(0, deviceLocalFile);
        }
        this.e.z(list);
        this.ag.setVisibility(8);
        this.ah.setVisibility(8);
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (aF()) {
            this.ah.setVisibility(0);
            r();
        } else {
            if (z) {
                this.ag.setVisibility(4);
                final View view = this.O;
                if (view != null) {
                    view.post(new Runnable() { // from class: zwc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zwh zwhVar = zwh.this;
                            View view2 = view;
                            if (zwhVar.ar()) {
                                int width = view2.getWidth();
                                int height = view2.getHeight();
                                if (width == 0 || height == 0) {
                                    return;
                                }
                                int dimensionPixelSize = zwhVar.qX().getDimensionPixelSize(R.dimen.gallery_thumb_min_width);
                                int dimensionPixelSize2 = zwhVar.qX().getDimensionPixelSize(R.dimen.gallery_thumb_margin);
                                int max = Math.max(1, width / dimensionPixelSize);
                                int i = width / max;
                                int max2 = Math.max(1, height / i);
                                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                TextView textView = (TextView) view2.findViewById(R.id.media_grid_zero_state_grid_text_primary);
                                TextView textView2 = (TextView) view2.findViewById(R.id.media_grid_zero_state_grid_text_secondary);
                                Paint paint = new Paint();
                                paint.setColor(aih.d(zwhVar.qR(), R.color.gallery_thumb_zero_state_grid_divider_color));
                                paint.setStyle(Paint.Style.FILL);
                                paint.setStrokeWidth(dimensionPixelSize2);
                                int i2 = 1;
                                while (i2 < max) {
                                    float f = i2 * i;
                                    Paint paint2 = paint;
                                    canvas.drawLine(f, 0.0f, f, height, paint2);
                                    i2++;
                                    textView2 = textView2;
                                    canvas = canvas;
                                    paint = paint2;
                                    textView = textView;
                                }
                                Paint paint3 = paint;
                                TextView textView3 = textView2;
                                TextView textView4 = textView;
                                Canvas canvas2 = canvas;
                                int i3 = dimensionPixelSize2 / 2;
                                for (int i4 = 0; i4 <= max2; i4++) {
                                    float f2 = (i4 * i) + i3;
                                    canvas2.drawLine(0.0f, f2, width, f2, paint3);
                                }
                                zwhVar.af.setImageBitmap(createBitmap);
                                int i5 = zwhVar.d;
                                if (i5 == 0) {
                                    textView4.setText(zwhVar.qX().getText(R.string.gallery_thumb_zero_state_text_primary));
                                    textView3.setText(zwhVar.qX().getText(R.string.gallery_thumb_zero_state_text_secondary));
                                } else if (i5 == 3) {
                                    textView4.setText(zwhVar.qX().getText(R.string.gallery_thumb_videos_images_zero_state_text_primary));
                                    textView3.setText(zwhVar.qX().getText(R.string.gallery_thumb_videos_images_zero_state_text_secondary));
                                } else {
                                    textView4.setText(zwhVar.qX().getText(R.string.gallery_thumb_images_zero_state_text_primary));
                                    textView3.setText(zwhVar.qX().getText(R.string.gallery_thumb_images_zero_state_text_secondary));
                                }
                                View findViewById = view2.findViewById(R.id.media_grid_zero_state_grid_text_container);
                                yny.z(findViewById, yny.v(((i3 + ((max2 > 2 ? 1 : 0) * i)) + (i / 2)) - (findViewById.getHeight() / 2)), ViewGroup.MarginLayoutParams.class);
                                zwhVar.ag.setVisibility(0);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            this.ah.setVisibility(0);
        }
    }

    final boolean r() {
        return zxo.e(C(), 0);
    }
}
