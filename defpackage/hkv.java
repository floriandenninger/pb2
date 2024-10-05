package defpackage;

import android.content.res.Resources;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditToolButtonView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hkv implements zsn {
    public final /* synthetic */ hkz a;
    private final /* synthetic */ int b;

    public /* synthetic */ hkv(hkz hkzVar, int i) {
        this.b = i;
        this.a = hkzVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i = this.b;
        final int i2 = 1;
        if (i == 0) {
            final hkz hkzVar = this.a;
            hkzVar.a.runOnUiThread(new Runnable() { // from class: hkw
                @Override // java.lang.Runnable
                public final void run() {
                    ztf ztfVar;
                    int i3 = i2;
                    int i4 = R.drawable.ic_filter_off_stroke;
                    if (i3 == 0) {
                        hkz hkzVar2 = hkzVar;
                        ShortsEditToolButtonView shortsEditToolButtonView = hkzVar2.e;
                        if (shortsEditToolButtonView == null || (ztfVar = hkzVar2.k) == null) {
                            return;
                        }
                        if (true == ztfVar.e()) {
                            i4 = R.drawable.ic_presets_enabled;
                        }
                        ImageView imageView = shortsEditToolButtonView.c;
                        imageView.getClass();
                        imageView.setImageDrawable(shortsEditToolButtonView.a.getResources().getDrawable(i4));
                        return;
                    }
                    hkz hkzVar3 = hkzVar;
                    ztf ztfVar2 = hkzVar3.k;
                    boolean z = false;
                    if (ztfVar2 != null && ztfVar2.e()) {
                        z = true;
                    }
                    EditorButtonView editorButtonView = hkzVar3.c;
                    if (editorButtonView == null || hkzVar3.k == null) {
                        return;
                    }
                    Resources resources = editorButtonView.getResources();
                    if (true == z) {
                        i4 = R.drawable.ic_presets_enabled;
                    }
                    editorButtonView.b(resources.getDrawable(i4));
                }
            });
        } else {
            if (i == 1) {
                hkz hkzVar2 = this.a;
                hkzVar2.j = (FilterMapTable$FilterDescriptor) obj;
                hkzVar2.b();
                return;
            }
            final hkz hkzVar3 = this.a;
            FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) obj;
            if (hkzVar3.e == null || filterMapTable$FilterDescriptor == null) {
                return;
            }
            final int i3 = 0;
            hkzVar3.a.runOnUiThread(new Runnable() { // from class: hkw
                @Override // java.lang.Runnable
                public final void run() {
                    ztf ztfVar;
                    int i32 = i3;
                    int i4 = R.drawable.ic_filter_off_stroke;
                    if (i32 == 0) {
                        hkz hkzVar22 = hkzVar3;
                        ShortsEditToolButtonView shortsEditToolButtonView = hkzVar22.e;
                        if (shortsEditToolButtonView == null || (ztfVar = hkzVar22.k) == null) {
                            return;
                        }
                        if (true == ztfVar.e()) {
                            i4 = R.drawable.ic_presets_enabled;
                        }
                        ImageView imageView = shortsEditToolButtonView.c;
                        imageView.getClass();
                        imageView.setImageDrawable(shortsEditToolButtonView.a.getResources().getDrawable(i4));
                        return;
                    }
                    hkz hkzVar32 = hkzVar3;
                    ztf ztfVar2 = hkzVar32.k;
                    boolean z = false;
                    if (ztfVar2 != null && ztfVar2.e()) {
                        z = true;
                    }
                    EditorButtonView editorButtonView = hkzVar32.c;
                    if (editorButtonView == null || hkzVar32.k == null) {
                        return;
                    }
                    Resources resources = editorButtonView.getResources();
                    if (true == z) {
                        i4 = R.drawable.ic_presets_enabled;
                    }
                    editorButtonView.b(resources.getDrawable(i4));
                }
            });
        }
    }
}
