package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.GreenScreenMediaThumbnailContainer;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hdi {
    public final Context a;
    public final HorizontalScrollView b;
    public final ViewGroup c;
    public final int d;
    final HashMap e = new HashMap();
    public DeviceLocalFile f;
    public hdg g;
    public List h;
    hdh i;
    public View j;
    public final Executor k;
    public final Executor l;
    public jqr m;

    public hdi(Context context, HorizontalScrollView horizontalScrollView, ViewGroup viewGroup, Executor executor, Executor executor2) {
        this.a = context;
        this.b = horizontalScrollView;
        this.c = viewGroup;
        this.k = executor;
        this.l = executor2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.d = displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final hdh e(View view) {
        return new hdh(view);
    }

    public final View a(int i) {
        LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(i, this.c, false);
        GreenScreenMediaThumbnailContainer greenScreenMediaThumbnailContainer = (GreenScreenMediaThumbnailContainer) inflate.findViewById(R.id.green_screen_media_thumbnail_container);
        greenScreenMediaThumbnailContainer.setOutlineProvider(new hdj(greenScreenMediaThumbnailContainer));
        greenScreenMediaThumbnailContainer.setClipToOutline(true);
        return inflate;
    }

    public final void c(DeviceLocalFile deviceLocalFile) {
        d(deviceLocalFile, true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(DeviceLocalFile deviceLocalFile, boolean z, boolean z2) {
        hdg hdgVar;
        View view;
        DeviceLocalFile deviceLocalFile2 = this.f;
        hdh hdhVar = deviceLocalFile2 == null ? this.i : (hdh) this.e.get(deviceLocalFile2);
        if (hdhVar != null) {
            hdhVar.a();
            hgh hghVar = hdhVar.c;
            if (hghVar != null) {
                hghVar.b();
            }
        }
        if (z2) {
            hdhVar = deviceLocalFile == null ? this.i : (hdh) this.e.get(deviceLocalFile);
            if (hdhVar != null && (view = hdhVar.b) != null) {
                view.setVisibility(0);
            }
        }
        if (true != this.h.contains(deviceLocalFile)) {
            deviceLocalFile = null;
        }
        this.f = deviceLocalFile;
        if (z && (hdgVar = this.g) != null) {
            ((het) hdgVar).f(deviceLocalFile, hdhVar, true);
        }
        if (hdhVar != null) {
            View view2 = hdhVar.a;
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new hdf(this, view2));
        }
    }
}
