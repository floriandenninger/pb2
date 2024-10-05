package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iz extends je {
    public iz(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.je
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(jq.c(view));
    }
}
