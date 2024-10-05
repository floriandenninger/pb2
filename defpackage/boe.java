package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Set;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class boe extends ArrayAdapter {
    final float a;
    final /* synthetic */ bof b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boe(bof bofVar, Context context, List list) {
        super(context, 0, list);
        this.b = bofVar;
        this.a = ji.s(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            bof bofVar = this.b;
            bof.n((LinearLayout) view.findViewById(R.id.volume_item_container), bofVar.y);
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = bofVar.x;
            layoutParams.height = bofVar.x;
            findViewById.setLayoutParams(layoutParams);
        }
        bpv bpvVar = (bpv) getItem(i);
        if (bpvVar != null) {
            boolean z = bpvVar.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(bpvVar.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            ji.z(viewGroup.getContext(), mediaRouteVolumeSlider, this.b.o);
            mediaRouteVolumeSlider.setTag(bpvVar);
            this.b.B.put(bpvVar, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.a(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (this.b.z(bpvVar)) {
                    mediaRouteVolumeSlider.setMax(bpvVar.o);
                    mediaRouteVolumeSlider.setProgress(bpvVar.n);
                    mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.b.v);
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z ? PrivateKeyType.INVALID : (int) (this.a * 255.0f));
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(true == this.b.t.contains(bpvVar) ? 4 : 0);
            Set set = this.b.r;
            if (set != null && set.contains(bpvVar)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }
}
