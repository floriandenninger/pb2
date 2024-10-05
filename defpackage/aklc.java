package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aklc implements ajom, ajmt, akiz {
    private final ajmu a;
    private final View b;
    private final akmg c;
    private final TextView d;
    private akkv e;
    private Object f;

    public aklc(Context context, final aahd aahdVar, ajmu ajmuVar, ajjz ajjzVar, ajut ajutVar) {
        aahdVar.getClass();
        ajmuVar.getClass();
        this.a = ajmuVar;
        ajutVar.getClass();
        View inflate = View.inflate(context, R.layout.connection, null);
        this.b = inflate;
        this.c = new akmg(ajjzVar, (ImageView) inflate.findViewById(R.id.connection_thumbnail));
        this.d = (TextView) inflate.findViewById(R.id.user_public_name);
        View findViewById = inflate.findViewById(R.id.content);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: akla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aklc.this.d(aahdVar);
            }
        });
        findViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: aklb
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                aklc.this.d(aahdVar);
                return true;
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.aahd r5) {
        /*
            r4 = this;
            akkv r0 = r4.e
            if (r0 != 0) goto L5
            return
        L5:
            aqdw r1 = r0.b
            r2 = 0
            if (r1 == 0) goto L25
            atdf r1 = r1.e
            if (r1 != 0) goto L10
            atdf r1 = defpackage.atdf.a
        L10:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L25
            aqdw r0 = r0.b
            atdf r0 = r0.e
            if (r0 != 0) goto L1e
            atdf r0 = defpackage.atdf.a
        L1e:
            atdc r0 = r0.c
            if (r0 != 0) goto L26
            atdc r0 = defpackage.atdc.a
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L29
            return
        L29:
            akkv r0 = r4.e
            aqdw r1 = r0.b
            if (r1 == 0) goto L3c
            int r0 = r1.b
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L5d
            apxf r2 = r1.g
            if (r2 != 0) goto L5d
            apxf r2 = defpackage.apxf.a
            goto L5d
        L3c:
            aqdy r1 = r0.c
            if (r1 == 0) goto L4d
            int r0 = r1.b
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L5d
            apxf r2 = r1.f
            if (r2 != 0) goto L5d
            apxf r2 = defpackage.apxf.a
            goto L5d
        L4d:
            aqdz r0 = r0.d
            if (r0 == 0) goto L5d
            int r1 = r0.b
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L5d
            apxf r2 = r0.f
            if (r2 != 0) goto L5d
            apxf r2 = defpackage.apxf.a
        L5d:
            if (r2 != 0) goto L60
            return
        L60:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "com.google.android.libraries.youtube.innertube.endpoint.tag"
            r0.put(r1, r4)
            java.lang.Object r1 = r4.f
            java.lang.String r3 = "contact_menu_source_model"
            r0.put(r3, r1)
            r5.c(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklc.d(aahd):void");
    }

    protected final void e(akkv akkvVar) {
        aqiz aqizVar;
        aqdw aqdwVar = akkvVar.b;
        Spanned spanned = null;
        aqyg aqygVar = null;
        aqyg aqygVar2 = null;
        aqyg aqygVar3 = null;
        if (aqdwVar != null) {
            if ((aqdwVar.b & 2) != 0) {
                aqizVar = aqdwVar.d;
                if (aqizVar == null) {
                    aqizVar = aqiz.a;
                }
            }
            aqizVar = null;
        } else {
            aqdy aqdyVar = akkvVar.c;
            if (aqdyVar != null) {
                if ((aqdyVar.b & 2) != 0) {
                    aqizVar = aqdyVar.d;
                    if (aqizVar == null) {
                        aqizVar = aqiz.a;
                    }
                }
                aqizVar = null;
            } else {
                aqdz aqdzVar = akkvVar.d;
                if (aqdzVar != null && (aqdzVar.b & 2) != 0) {
                    aqizVar = aqdzVar.d;
                    if (aqizVar == null) {
                        aqizVar = aqiz.a;
                    }
                }
                aqizVar = null;
            }
        }
        akmg akmgVar = this.c;
        if (aqizVar == null || (aqizVar.b & 1) == 0) {
            akmgVar.b(4);
        } else {
            avgg avggVar = aqizVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            akmgVar.a(avggVar);
            akmgVar.b(0);
        }
        TextView textView = this.d;
        aqdw aqdwVar2 = akkvVar.b;
        if (aqdwVar2 != null) {
            if ((aqdwVar2.b & 1) != 0 && (aqygVar = aqdwVar2.c) == null) {
                aqygVar = aqyg.a;
            }
            spanned = ajcq.b(aqygVar);
        } else {
            aqdy aqdyVar2 = akkvVar.c;
            if (aqdyVar2 != null) {
                if ((aqdyVar2.b & 1) != 0 && (aqygVar2 = aqdyVar2.c) == null) {
                    aqygVar2 = aqyg.a;
                }
                spanned = ajcq.b(aqygVar2);
            } else {
                aqdz aqdzVar2 = akkvVar.d;
                if (aqdzVar2 != null) {
                    if ((aqdzVar2.b & 1) != 0 && (aqygVar3 = aqdzVar2.c) == null) {
                        aqygVar3 = aqyg.a;
                    }
                    spanned = ajcq.b(aqygVar3);
                }
            }
        }
        textView.setText(spanned);
    }

    @Override // defpackage.ajmt
    public final void kB(Uri uri, Uri uri2) {
        akkv akkvVar = (akkv) this.a.b(uri);
        this.e = akkvVar;
        e(akkvVar);
    }

    @Override // defpackage.ajom
    public final void oB(ajok ajokVar, Object obj) {
        this.f = obj;
        if (this.e != null) {
            this.a.e(this);
        }
        aqdw aqdwVar = (aqdw) obj;
        akkv akkvVar = new akkv((aqdwVar.b & 512) != 0 ? aqdwVar.h : null, aqdwVar, null, null);
        Uri a = akmq.a(akkvVar.b());
        this.e = (akkv) this.a.c(a, akkvVar);
        this.a.h(a, this);
        e(this.e);
    }
}
