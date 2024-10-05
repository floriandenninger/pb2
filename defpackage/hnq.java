package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditToolButtonView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hnq {
    public final hmw a;
    public final View b;
    public final acra c;
    public final hrv d;
    public final TextView e;
    public final ImageView f;
    public final ajkj g;
    public final acsc h;
    final hns i;
    private ayqx j;
    private final orr k;

    public hnq(View view, acra acraVar, acsc acscVar, boolean z, ci ciVar, Context context, hmw hmwVar, ajjz ajjzVar, orr orrVar, hrv hrvVar, byte[] bArr) {
        this.a = hmwVar;
        this.b = view;
        this.c = acraVar;
        this.k = orrVar;
        this.h = acscVar;
        this.d = hrvVar;
        view.setOnClickListener(new View.OnClickListener() { // from class: hnm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hnq hnqVar = hnq.this;
                hnqVar.c.I(3, new acqx(hnqVar.h), null);
                if (hnqVar.a.a() == null) {
                    hnqVar.b();
                } else {
                    hnqVar.i.G();
                }
            }
        });
        hns hnsVar = new hns(context, ciVar.getSupportFragmentManager(), new hno(this, hmwVar), hrvVar);
        this.i = hnsVar;
        hnsVar.a.setVisibility(true != z ? 8 : 0);
        TextView textView = (TextView) view.findViewById(R.id.shorts_camera_music_button_title);
        this.e = textView;
        if (textView != null && hrvVar.f()) {
            textView.setText(R.string.camera_add_sounds_button);
        }
        if (!(view instanceof ShortsEditToolButtonView)) {
            this.f = null;
            this.g = null;
            return;
        }
        ImageView imageView = ((ShortsEditToolButtonView) view).c;
        imageView.getClass();
        this.f = imageView;
        this.g = new ajkj(ajjzVar, imageView);
        c();
    }

    public final void a() {
        this.j = this.a.b().ab(ayqr.a()).ax(new ayrs() { // from class: hnn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ajkj ajkjVar;
                hnq hnqVar = hnq.this;
                ammv ammvVar = (ammv) obj;
                if (ammvVar.h() && !ammx.e(((ShortsCreationSelectedTrack) ammvVar.c()).j())) {
                    if (!((ShortsCreationSelectedTrack) ammvVar.c()).l()) {
                        ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack) ammvVar.c();
                        TextView textView = hnqVar.e;
                        if (textView != null) {
                            textView.setText(shortsCreationSelectedTrack.j());
                        }
                        if (hnqVar.f != null && (ajkjVar = hnqVar.g) != null) {
                            ajkjVar.l(shortsCreationSelectedTrack.h(), new hnp(hnqVar));
                            hnqVar.f.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            hnqVar.f.setBackground(hnqVar.b.getContext().getDrawable(R.drawable.shorts_edit_thumbnail_rounded_corner));
                            hnqVar.f.setClipToOutline(true);
                        }
                    }
                } else {
                    TextView textView2 = hnqVar.e;
                    if (textView2 != null) {
                        textView2.setText(true != hnqVar.d.f() ? R.string.camera_add_music_button : R.string.camera_add_sounds_button);
                    }
                    hnqVar.c();
                }
                TextView textView3 = hnqVar.e;
                if (textView3 != null) {
                    textView3.setSelected(true);
                }
            }
        });
    }

    public final void b() {
        this.k.a(this.c, this.h.a);
    }

    public final void c() {
        ajkj ajkjVar;
        if (this.f == null || (ajkjVar = this.g) == null) {
            return;
        }
        ajkjVar.g(R.drawable.ic_shorts_editor_music);
        this.f.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setBackground(null);
        this.f.setClipToOutline(false);
    }

    public final void d() {
        ayrz.c((AtomicReference) this.j);
    }

    public final void e(boolean z) {
        this.b.setEnabled(z);
        TextView textView = this.e;
        if (textView != null) {
            textView.setEnabled(z);
        }
        ImageView imageView = (ImageView) this.b.findViewById(R.id.shorts_camera_music_button_icon);
        if (imageView != null) {
            wcy.x(this.b.getContext(), imageView, z);
        }
    }
}
