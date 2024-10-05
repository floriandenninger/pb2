package defpackage;

import android.view.View;
import android.widget.ImageButton;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xkn implements View.OnClickListener {
    public xkm a;
    private final ImageButton b;
    private xgs c;
    private final aahd d;

    public xkn(ImageButton imageButton, aahd aahdVar) {
        imageButton.getClass();
        this.b = imageButton;
        this.d = aahdVar;
        imageButton.setOnClickListener(this);
        c();
    }

    public final void a(xgs xgsVar) {
        this.c = xgsVar;
        c();
    }

    public final void b(boolean z) {
        xgs xgsVar = this.c;
        if (xgsVar == null) {
            return;
        }
        xgsVar.b = z;
        c();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xgs xgsVar = this.c;
        if (xgsVar == null) {
            return;
        }
        apxf apxfVar = xgsVar.b ? xgsVar.f : xgsVar.e;
        if (apxfVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c);
        this.d.c(apxfVar, hashMap);
        this.c.b = !r4.b;
        c();
        xkm xkmVar = this.a;
        if (xkmVar != null) {
            xkmVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c() {
        /*
            r5 = this;
            xgs r0 = r5.c
            r1 = 0
            if (r0 == 0) goto L5c
            boolean r2 = r0.b
            if (r2 == 0) goto Lc
            arfs r0 = r0.d
            goto Le
        Lc:
            arfs r0 = r0.c
        Le:
            if (r0 != 0) goto L12
        L10:
            r0 = 0
            goto L3b
        L12:
            java.util.EnumMap r2 = defpackage.xgs.a
            int r3 = r0.c
            arfr r3 = defpackage.arfr.b(r3)
            if (r3 != 0) goto L1e
            arfr r3 = defpackage.arfr.UNKNOWN
        L1e:
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L25
            goto L10
        L25:
            java.util.EnumMap r2 = defpackage.xgs.a
            int r0 = r0.c
            arfr r0 = defpackage.arfr.b(r0)
            if (r0 != 0) goto L31
            arfr r0 = defpackage.arfr.UNKNOWN
        L31:
            java.lang.Object r0 = r2.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L3b:
            if (r0 == 0) goto L42
            android.widget.ImageButton r2 = r5.b
            r2.setImageResource(r0)
        L42:
            android.widget.ImageButton r2 = r5.b
            xgs r3 = r5.c
            boolean r3 = r3.b
            r2.setSelected(r3)
            android.widget.ImageButton r2 = r5.b
            xgs r3 = r5.c
            boolean r4 = r3.b
            if (r4 == 0) goto L56
            java.lang.CharSequence r3 = r3.h
            goto L58
        L56:
            java.lang.CharSequence r3 = r3.g
        L58:
            r2.setContentDescription(r3)
            goto L5d
        L5c:
            r0 = 0
        L5d:
            android.widget.ImageButton r2 = r5.b
            if (r0 == 0) goto L62
            r1 = 1
        L62:
            defpackage.whu.I(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkn.c():void");
    }
}
