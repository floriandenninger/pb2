package defpackage;

import android.os.AsyncTask;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class huq extends AsyncTask {
    public static final /* synthetic */ int a = 0;
    private final WeakReference b;

    public huq(hur hurVar) {
        this.b = new WeakReference(hurVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008f  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r27) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huq.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        hur hurVar = (hur) this.b.get();
        if (hurVar == null || hurVar.m == null) {
            return;
        }
        if (!bool.booleanValue()) {
            hurVar.v.setEnabled(true);
            etx.T(hurVar.m, true != hurVar.n.f ? R.string.reel_video_editor_fail_save_video : R.string.reel_video_editor_fail_save_photo);
        } else {
            hurVar.v.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.quantum_ic_check_circle_white_24, 0, 0);
            etx.T(hurVar.m, R.string.reel_video_editor_succeed_save_media);
            hurVar.d.postDelayed(new hup(hurVar, 0), 2000L);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        hur hurVar = (hur) this.b.get();
        if (hurVar == null || hurVar.m == null) {
            return;
        }
        hurVar.v.setEnabled(false);
    }
}
