package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lpp implements ajom {
    public final Context a;
    public final aahd b;
    public final keg c;
    public final Switch d;
    public aupu e;
    public acra f;
    public ajdf g;
    private final ajop h;
    private final View i;
    private final TextView j;
    private final TextView k;
    private final CompoundButton.OnCheckedChangeListener l;
    private final ajrv m;
    private ahfc n;

    public lpp(Context context, final aahd aahdVar, gma gmaVar, keg kegVar, ajrv ajrvVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = aahdVar;
        this.h = gmaVar;
        this.c = kegVar;
        this.m = ajrvVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.setting_boolean_default_layout, viewGroup, false);
        this.i = inflate;
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.summary);
        this.d = (Switch) inflate.findViewById(R.id.switch_button);
        this.l = new CompoundButton.OnCheckedChangeListener() { // from class: lpm
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                apxf apxfVar;
                lpp lppVar = lpp.this;
                aahd aahdVar2 = aahdVar;
                if (lppVar.e != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.valueOf(z));
                    if (z) {
                        aupu aupuVar = lppVar.e;
                        aupuVar.getClass();
                        apxfVar = aupuVar.h;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                    } else {
                        aupu aupuVar2 = lppVar.e;
                        aupuVar2.getClass();
                        apxfVar = aupuVar2.i;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                    }
                    aahdVar2.c(apxfVar, hashMap);
                }
            }
        };
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.h).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajdf ajdfVar = this.g;
        if (ajdfVar != null) {
            ajdfVar.l();
        }
        this.d.setOnCheckedChangeListener(null);
        ahfc ahfcVar = this.n;
        if (ahfcVar != null) {
            this.c.f(ahfcVar);
        }
        this.n = null;
        this.f = null;
        this.e = null;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        Spanned c;
        aqyg aqygVar;
        lqc lqcVar = (lqc) obj;
        ajdf ajdfVar = this.g;
        if (ajdfVar != null) {
            ajdfVar.l();
        }
        this.f = ajokVar.a;
        aupu aupuVar = lqcVar.a;
        this.e = aupuVar;
        int i = aupuVar.b & 16;
        if (i == 0) {
            this.j.setVisibility(8);
        } else {
            TextView textView = this.j;
            if (i != 0) {
                aqygVar = aupuVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(textView, ajcq.b(aqygVar));
        }
        aupu aupuVar2 = this.e;
        if (aupuVar2.g && (aupuVar2.b & 4096) != 0) {
            aqyg aqygVar2 = aupuVar2.k;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            c = ajcq.c(aqygVar2, this.m);
        } else if (aupuVar2.f || (aupuVar2.b & 2048) == 0) {
            aqyg aqygVar3 = aupuVar2.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            c = ajcq.c(aqygVar3, this.m);
        } else {
            aqyg aqygVar4 = aupuVar2.j;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            c = ajcq.c(aqygVar4, this.m);
        }
        whu.G(this.k, c);
        int bx = aobq.bx(this.e.c);
        if (bx == 0 || bx != 101) {
            aupu aupuVar3 = this.e;
            int i2 = aupuVar3.b;
            if ((i2 & 8192) == 0 || (i2 & 16384) == 0) {
                this.d.setChecked(aupuVar3.f);
                this.d.setOnCheckedChangeListener(this.l);
            } else {
                if (aupuVar3 != null) {
                    this.d.setChecked(aupuVar3.f);
                }
                final int i3 = 0;
                this.i.setOnClickListener(new View.OnClickListener(this) { // from class: lpl
                    public final /* synthetic */ lpp a;

                    {
                        this.a = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onClick(android.view.View r12) {
                        /*
                            r11 = this;
                            int r12 = r2
                            r0 = 0
                            r1 = 3
                            r2 = 262144(0x40000, float:3.67342E-40)
                            if (r12 == 0) goto L39
                            lpp r12 = r11.a
                            keg r3 = r12.c
                            boolean r3 = r3.g()
                            r3 = r3 ^ 1
                            keg r4 = r12.c
                            r4.e(r3)
                            android.widget.Switch r4 = r12.d
                            r4.setChecked(r3)
                            aupu r3 = r12.e
                            if (r3 == 0) goto L38
                            int r4 = r3.b
                            r2 = r2 & r4
                            if (r2 == 0) goto L38
                            acra r12 = r12.f
                            r12.getClass()
                            acqx r2 = new acqx
                            aomf r3 = r3.p
                            byte[] r3 = r3.I()
                            r2.<init>(r3)
                            r12.I(r1, r2, r0)
                        L38:
                            return
                        L39:
                            lpp r12 = r11.a
                            aupu r3 = r12.e
                            if (r3 == 0) goto Lc4
                            android.widget.Switch r3 = r12.d
                            boolean r3 = r3.isChecked()
                            r3 = r3 ^ 1
                            r4 = 64099105(0x3d21321, float:1.23470825E-36)
                            if (r3 == 0) goto L6d
                            aupu r5 = r12.e
                            r5.getClass()
                            int r6 = r5.b
                            r6 = r6 & 8192(0x2000, float:1.148E-41)
                            if (r6 == 0) goto L6d
                            r5.getClass()
                            aupz r5 = r5.l
                            if (r5 != 0) goto L60
                            aupz r5 = defpackage.aupz.a
                        L60:
                            int r6 = r5.b
                            if (r6 != r4) goto L69
                            java.lang.Object r4 = r5.c
                            aqdt r4 = (defpackage.aqdt) r4
                            goto L6b
                        L69:
                            aqdt r4 = defpackage.aqdt.a
                        L6b:
                            r6 = r4
                            goto L8f
                        L6d:
                            if (r3 != 0) goto Lc4
                            aupu r5 = r12.e
                            r5.getClass()
                            int r6 = r5.b
                            r6 = r6 & 16384(0x4000, float:2.2959E-41)
                            if (r6 == 0) goto Lc4
                            r5.getClass()
                            aupz r5 = r5.m
                            if (r5 != 0) goto L83
                            aupz r5 = defpackage.aupz.a
                        L83:
                            int r6 = r5.b
                            if (r6 != r4) goto L8c
                            java.lang.Object r4 = r5.c
                            aqdt r4 = (defpackage.aqdt) r4
                            goto L6b
                        L8c:
                            aqdt r4 = defpackage.aqdt.a
                            goto L6b
                        L8f:
                            android.content.Context r5 = r12.a
                            aahd r7 = r12.b
                            acra r8 = r12.f
                            r8.getClass()
                            lpo r9 = new lpo
                            r9.<init>(r12, r3)
                            r10 = 0
                            ajdf r3 = defpackage.ajdf.c(r5, r6, r7, r8, r9, r10)
                            r12.g = r3
                            aupu r3 = r12.e
                            r3.getClass()
                            int r4 = r3.b
                            r2 = r2 & r4
                            if (r2 == 0) goto Lc4
                            acra r12 = r12.f
                            r12.getClass()
                            acqx r2 = new acqx
                            r3.getClass()
                            aomf r3 = r3.p
                            byte[] r3 = r3.I()
                            r2.<init>(r3)
                            r12.I(r1, r2, r0)
                        Lc4:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpl.onClick(android.view.View):void");
                    }
                });
            }
        } else {
            ahfc ahfcVar = new ahfc() { // from class: lpn
                @Override // defpackage.ahfc
                public final void t(boolean z) {
                    lpp.this.d.setChecked(z);
                }
            };
            this.n = ahfcVar;
            this.c.d(ahfcVar);
            this.d.setChecked(this.c.g());
            final int i4 = 1;
            this.i.setOnClickListener(new View.OnClickListener(this) { // from class: lpl
                public final /* synthetic */ lpp a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        this = this;
                        int r12 = r2
                        r0 = 0
                        r1 = 3
                        r2 = 262144(0x40000, float:3.67342E-40)
                        if (r12 == 0) goto L39
                        lpp r12 = r11.a
                        keg r3 = r12.c
                        boolean r3 = r3.g()
                        r3 = r3 ^ 1
                        keg r4 = r12.c
                        r4.e(r3)
                        android.widget.Switch r4 = r12.d
                        r4.setChecked(r3)
                        aupu r3 = r12.e
                        if (r3 == 0) goto L38
                        int r4 = r3.b
                        r2 = r2 & r4
                        if (r2 == 0) goto L38
                        acra r12 = r12.f
                        r12.getClass()
                        acqx r2 = new acqx
                        aomf r3 = r3.p
                        byte[] r3 = r3.I()
                        r2.<init>(r3)
                        r12.I(r1, r2, r0)
                    L38:
                        return
                    L39:
                        lpp r12 = r11.a
                        aupu r3 = r12.e
                        if (r3 == 0) goto Lc4
                        android.widget.Switch r3 = r12.d
                        boolean r3 = r3.isChecked()
                        r3 = r3 ^ 1
                        r4 = 64099105(0x3d21321, float:1.23470825E-36)
                        if (r3 == 0) goto L6d
                        aupu r5 = r12.e
                        r5.getClass()
                        int r6 = r5.b
                        r6 = r6 & 8192(0x2000, float:1.148E-41)
                        if (r6 == 0) goto L6d
                        r5.getClass()
                        aupz r5 = r5.l
                        if (r5 != 0) goto L60
                        aupz r5 = defpackage.aupz.a
                    L60:
                        int r6 = r5.b
                        if (r6 != r4) goto L69
                        java.lang.Object r4 = r5.c
                        aqdt r4 = (defpackage.aqdt) r4
                        goto L6b
                    L69:
                        aqdt r4 = defpackage.aqdt.a
                    L6b:
                        r6 = r4
                        goto L8f
                    L6d:
                        if (r3 != 0) goto Lc4
                        aupu r5 = r12.e
                        r5.getClass()
                        int r6 = r5.b
                        r6 = r6 & 16384(0x4000, float:2.2959E-41)
                        if (r6 == 0) goto Lc4
                        r5.getClass()
                        aupz r5 = r5.m
                        if (r5 != 0) goto L83
                        aupz r5 = defpackage.aupz.a
                    L83:
                        int r6 = r5.b
                        if (r6 != r4) goto L8c
                        java.lang.Object r4 = r5.c
                        aqdt r4 = (defpackage.aqdt) r4
                        goto L6b
                    L8c:
                        aqdt r4 = defpackage.aqdt.a
                        goto L6b
                    L8f:
                        android.content.Context r5 = r12.a
                        aahd r7 = r12.b
                        acra r8 = r12.f
                        r8.getClass()
                        lpo r9 = new lpo
                        r9.<init>(r12, r3)
                        r10 = 0
                        ajdf r3 = defpackage.ajdf.c(r5, r6, r7, r8, r9, r10)
                        r12.g = r3
                        aupu r3 = r12.e
                        r3.getClass()
                        int r4 = r3.b
                        r2 = r2 & r4
                        if (r2 == 0) goto Lc4
                        acra r12 = r12.f
                        r12.getClass()
                        acqx r2 = new acqx
                        r3.getClass()
                        aomf r3 = r3.p
                        byte[] r3 = r3.I()
                        r2.<init>(r3)
                        r12.I(r1, r2, r0)
                    Lc4:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lpl.onClick(android.view.View):void");
                }
            });
        }
        this.h.e(ajokVar);
    }
}
