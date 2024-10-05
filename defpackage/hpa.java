package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hpa {
    public List j = new ArrayList();
    public String k;

    public static File I(Context context) {
        File file = new File(context.getExternalFilesDir(null), "shorts_project");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean J(hpa hpaVar) {
        return hpaVar != null && "DraftProject".equals(hpaVar.o());
    }

    public static boolean K(hpa hpaVar) {
        return hpaVar != null && "TrimDraft".equals(hpaVar.o());
    }

    public boolean E() {
        return false;
    }

    public vsy H() {
        return null;
    }

    public ammv c() {
        return amlr.a;
    }

    public abstract ammv d();

    public ammv f() {
        return amlr.a;
    }

    public File n() {
        return null;
    }

    public abstract String o();

    public void p() {
    }

    public void q() {
    }

    public void r(ShortsCreationSelectedTrack shortsCreationSelectedTrack) {
    }

    public void u(String str) {
    }

    public void w(Bundle bundle) {
        bundle.putString("SHORTS_PROJECT_ACTIVE_PROJECT_ID", o());
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((autl) it.next()).q));
        }
        bundle.putIntegerArrayList("SHORTS_PROJECT_CREATION_SURFACES", arrayList);
        bundle.putString("SHORTS_PROJECT_FLOW_NONCE_KEY", this.k);
    }

    public void x(autl autlVar) {
        try {
            this.j.add(autlVar);
        } catch (UnsupportedOperationException unused) {
            afsi.b(1, 6, "[ShortsCreation][Android][ProjectState]recordCreationSurface failed");
        }
    }

    public void y() {
    }
}
