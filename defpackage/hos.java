package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hos {
    public final azqv a = azqv.ap();
    public final acpz b;
    private final Context c;

    public hos(Context context, acpy acpyVar) {
        this.c = context;
        this.b = acpyVar;
    }

    public final int a(Bundle bundle) {
        hpa hpaVar;
        int i = 0;
        if (bundle != null) {
            Context context = this.c;
            if ("DraftProject".equals(bundle.getString("SHORTS_PROJECT_ACTIVE_PROJECT_ID", ""))) {
                hpaVar = how.b(bundle.getString("SHORTS_PROJECT_ACTIVE_PROJECT_ID"), bundle, context, bundle.getString("SHORTS_PROJECT_FLOW_NONCE_KEY"));
            } else if ("TrimDraft".equals(bundle.getString("SHORTS_PROJECT_ACTIVE_PROJECT_ID", ""))) {
                EditableVideoEdits editableVideoEdits = (EditableVideoEdits) bundle.getParcelable("EDITABLE_VIDEO_EDITS_KEY");
                VideoMetaData videoMetaData = (VideoMetaData) bundle.getParcelable("EDITABLE_VIDEO_METADATA_KEY");
                Uri uri = (Uri) bundle.getParcelable("SOURCE_VIDEO_URI_KEY");
                vsy vsyVar = (editableVideoEdits == null || videoMetaData == null) ? null : new vsy(editableVideoEdits, videoMetaData);
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                hpaVar = new hpb(vsyVar, uri, bundle.getLong("TIMELINE_WINDOW_START_US_KEY", 0L), bundle.getString("SHORTS_PROJECT_FLOW_NONCE_KEY"));
            } else {
                hpaVar = null;
            }
            if (hpaVar != null) {
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("SHORTS_PROJECT_CREATION_SURFACES");
                List list = hpaVar.j;
                list.clear();
                if (integerArrayList != null) {
                    int size = integerArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.add(autl.b(integerArrayList.get(i2).intValue()));
                    }
                }
            }
        } else {
            hpaVar = null;
        }
        if (hpaVar != null) {
            i = 1;
        } else {
            hpaVar = how.b("DraftProject", null, this.c, this.b.a());
            if (hpaVar != null) {
                i = 2;
            } else {
                hpaVar = how.a(this.c, this.b.a());
            }
        }
        this.a.c(hpaVar);
        return i;
    }

    public final hpa b() {
        return (hpa) this.a.ar();
    }

    public final aypy c() {
        return this.a.U();
    }

    public final void d() {
        a(null);
    }

    public final void e() {
        hpa b = b();
        if (b == null) {
            return;
        }
        i(3, b.k, b.j);
    }

    public final void f() {
        hpa b = b();
        if (b == null) {
            return;
        }
        i(5, b.k, b.j);
    }

    public final void g(autl autlVar) {
        hot a = hou.a();
        autlVar.getClass();
        a.b = amru.r(autlVar);
        h(a.a());
    }

    public final void h(hou houVar) {
        String[] list;
        if (!(this.a.ar() instanceof how)) {
            zga.b("reshootProject() called on a non-camera project; abort");
            return;
        }
        how howVar = (how) this.a.ar();
        if (howVar != null) {
            String str = howVar.c;
            if (str.length() != 0) {
                "Delete project: ".concat(str);
            }
            File n = howVar.n();
            if (!howVar.h.isEmpty()) {
                File j = howVar.j(howVar.h);
                if (j.exists() && !j.delete()) {
                    String valueOf = String.valueOf(j);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Failed to delete composed video ");
                    sb.append(valueOf);
                    zga.b(sb.toString());
                }
            }
            if (n.isDirectory() && (list = n.list()) != null) {
                for (String str2 : list) {
                    new File(n, str2).delete();
                }
            }
            if (n.exists()) {
                n.delete();
            }
        }
        String str3 = houVar.a;
        Context context = this.c;
        if (str3 == null) {
            str3 = this.b.a();
        }
        how a = how.a(context, str3);
        amru amruVar = houVar.b;
        if (amruVar != null) {
            a.j = amruVar;
        }
        String str4 = houVar.c;
        if (str4 != null) {
            a.u(str4);
        }
        this.a.c(a);
    }

    public final void i(int i, String str, List list) {
        if (str == null || list == null) {
            return;
        }
        aone createBuilder = autk.a.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            autl autlVar = (autl) it.next();
            createBuilder.copyOnWrite();
            autk autkVar = (autk) createBuilder.instance;
            autlVar.getClass();
            aonu aonuVar = autkVar.b;
            if (!aonuVar.c()) {
                autkVar.b = aonm.mutableCopy(aonuVar);
            }
            autkVar.b.g(autlVar.q);
        }
        acpz acpzVar = this.b;
        acpx acpxVar = new acpx(i - 1, 8);
        aone createBuilder2 = aqwx.a.createBuilder();
        autk autkVar2 = (autk) createBuilder.build();
        createBuilder2.copyOnWrite();
        aqwx aqwxVar = (aqwx) createBuilder2.instance;
        autkVar2.getClass();
        aqwxVar.f = autkVar2;
        aqwxVar.b |= 8;
        acpxVar.a = (aqwx) createBuilder2.build();
        acpxVar.b = aogv.OK.s;
        acpzVar.c(acpxVar, aqxl.FLOW_TYPE_SHORTS_CREATION, str);
    }
}
