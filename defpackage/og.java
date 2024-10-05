package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class og extends on implements gb {
    private ob d;
    private of e;
    private int f;
    private int g;
    private boolean h;

    public og() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (r13 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
    
        r8 = r19.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        if (r8 == 4) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        if (r8 != 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        if (r19.getName().equals("vector") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
    
        r13 = defpackage.bxu.b(r18, r19, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        r13 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r19.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
    
        if (r13 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
    
        r7 = r4.d;
        r8 = r7.f(r13);
        r7.K[r8] = r5;
        r7.b.k(r8, java.lang.Integer.valueOf(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r19.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017b, code lost:
    
        if (r11 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017d, code lost:
    
        r11 = r19.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:
    
        if (r11 == 4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0184, code lost:
    
        if (r11 != 2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0190, code lost:
    
        if (r19.getName().equals("animated-vector") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0192, code lost:
    
        r11 = defpackage.bxj.b(r17, r18, r19, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        r11 = android.graphics.drawable.Drawable.createFromXmlInner(r18, r19, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r19.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b5, code lost:
    
        if (r11 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
    
        if (r8 == (-1)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b9, code lost:
    
        if (r10 == (-1)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bb, code lost:
    
        r4.d.e(r8, r10, r11, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01db, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r19.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f4, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r19.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.og b(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.b(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):og");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.on
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ob c() {
        return new ob(this.d, this, null);
    }

    @Override // defpackage.on, defpackage.ok
    public final void e(oj ojVar) {
        super.e(ojVar);
        if (ojVar instanceof ob) {
            this.d = (ob) ojVar;
        }
    }

    @Override // defpackage.on, defpackage.ok, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // defpackage.ok, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        of ofVar = this.e;
        if (ofVar != null) {
            ofVar.b();
            this.e = null;
            h(this.f);
            this.f = -1;
            this.g = -1;
        }
    }

    @Override // defpackage.on, defpackage.ok, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.h) {
            super.mutate();
            this.d.d();
            this.h = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        if (h(r2) != false) goto L8;
     */
    @Override // defpackage.on, defpackage.ok, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.onStateChange(int[]):boolean");
    }

    @Override // defpackage.ok, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        of ofVar = this.e;
        if (ofVar != null && (visible || z2)) {
            if (z) {
                ofVar.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public og(ob obVar, Resources resources) {
        super(null);
        this.f = -1;
        this.g = -1;
        e(new ob(obVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
