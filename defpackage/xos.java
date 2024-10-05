package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xos {
    public final Context a;
    public final aahd b;
    public final yal c;
    public final zaw d;
    public final ajdh e;
    public final yaq f;

    public xos(Context context, aahd aahdVar, yal yalVar, zaw zawVar, yaq yaqVar, ajdh ajdhVar, byte[] bArr) {
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
        yalVar.getClass();
        this.c = yalVar;
        zawVar.getClass();
        this.d = zawVar;
        yaqVar.getClass();
        this.f = yaqVar;
        ajdhVar.getClass();
        this.e = ajdhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r4 != defpackage.apyk.COMMENT_POLL_STATUS_NO_VOTE) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r9, defpackage.audq r10, com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xos.b(java.lang.String, audq, com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction):void");
    }

    public final void a(xpa xpaVar, audq audqVar, audo audoVar, apyk apykVar, acra acraVar) {
        apxf apxfVar;
        if (audoVar.d) {
            apxfVar = audoVar.j;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = audoVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        if (apxfVar == null && (apxfVar = audoVar.e) == null) {
            apxfVar = apxf.a;
        }
        aone createBuilder = UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.a.createBuilder();
        if ((audqVar.b & 32) != 0) {
            aqyg aqygVar = audqVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            createBuilder.copyOnWrite();
            UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.instance;
            aqygVar.getClass();
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction.d = aqygVar;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction.b |= 4;
        }
        createBuilder.copyOnWrite();
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction2 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.instance;
        updateBackstagePollActionOuterClass$UpdateBackstagePollAction2.b |= 8;
        updateBackstagePollActionOuterClass$UpdateBackstagePollAction2.e = -1;
        int i = 0;
        while (true) {
            if (i >= audqVar.f.size()) {
                break;
            }
            if (((audo) audqVar.f.get(i)).d) {
                createBuilder.copyOnWrite();
                UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction3 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.instance;
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction3.b |= 8;
                updateBackstagePollActionOuterClass$UpdateBackstagePollAction3.e = i;
                break;
            }
            i++;
        }
        if (apykVar != null) {
            createBuilder.copyOnWrite();
            UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction4 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.instance;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction4.c = apykVar.f;
            updateBackstagePollActionOuterClass$UpdateBackstagePollAction4.b |= 2;
        }
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction5 = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) createBuilder.build();
        adz adzVar = new adz(2);
        adzVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new xoq(this, xpaVar, updateBackstagePollActionOuterClass$UpdateBackstagePollAction5, audqVar));
        adzVar.put("com.google.android.libraries.youtube.comment.action_tag", new xor(this, xpaVar, audqVar));
        if (acraVar != null && (audqVar.b & 16) != 0) {
            acraVar.I(3, new acqx(audqVar.g.I()), null);
        }
        this.b.c(apxfVar, adzVar);
    }
}
