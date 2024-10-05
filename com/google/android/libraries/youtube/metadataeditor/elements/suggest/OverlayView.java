package com.google.android.libraries.youtube.metadataeditor.elements.suggest;

import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.afng;
import defpackage.afnl;
import defpackage.afnq;
import defpackage.ajtg;
import defpackage.avuu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OverlayView extends View {
    public View a;
    public afng b;
    private final Point c;

    public OverlayView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.c.set((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (motionEvent.getActionMasked() == 1) {
            Point point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            Point point2 = this.c;
            if (Math.hypot(point2.x - point.x, point2.y - point.y) <= 10.0d) {
                performClick();
            }
        }
        View view = this.a;
        if (view != null) {
            view.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        afng afngVar = this.b;
        if (afngVar != null) {
            float f = this.c.y;
            afnl afnlVar = afngVar.a;
            if (afnlVar.n == 0) {
                if (afnlVar.p.getChildCount() != 0) {
                    afnlVar.n = afnlVar.p.getChildAt(0).getHeight();
                }
            }
            int floor = (int) Math.floor(((f - afnlVar.h) + afnlVar.p.computeVerticalScrollOffset()) / afnlVar.n);
            afnlVar.o = floor;
            if (afnlVar.i.a(floor) != null) {
                afnq a = afnlVar.i.a(afnlVar.o);
                boolean h = afnlVar.i.h();
                if (afnlVar.l != null) {
                    Editable text = afnlVar.b.getText();
                    int spanStart = text.getSpanStart(afnlVar.l);
                    int spanEnd = text.getSpanEnd(afnlVar.l);
                    afnlVar.a();
                    if (h) {
                        String b = a.b();
                        String a2 = a.a();
                        String valueOf = String.valueOf(afnlVar.r.c);
                        String valueOf2 = String.valueOf(b);
                        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        if (afnlVar.j != avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
                            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 2);
                            sb.append((char) 8206);
                            sb.append(concat);
                            sb.append((char) 160);
                            concat = sb.toString();
                        }
                        afnlVar.b.getText().delete(spanStart, spanEnd);
                        afnlVar.b.getText().insert(spanStart, concat);
                        ajtg ajtgVar = new ajtg(a2, afnlVar.e, afnlVar.f, afnlVar.b.getMeasuredWidth() * 0.9f, afnlVar.g);
                        int length = concat.length() + spanStart;
                        if (afnlVar.j == avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
                            afnlVar.b.getText().setSpan(new UnderlineSpan(), spanStart, length, 33);
                            afnlVar.m++;
                        } else {
                            afnlVar.b.getText().setSpan(ajtgVar, spanStart, length, 33);
                        }
                    } else {
                        String b2 = a.b();
                        String valueOf3 = String.valueOf(afnlVar.r.c);
                        String valueOf4 = String.valueOf(b2);
                        String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                        afnlVar.b.getText().delete(spanStart, spanEnd);
                        afnlVar.b.getText().insert(spanStart, concat2);
                    }
                    afnlVar.b.getText().insert(afnlVar.b.getSelectionStart(), " ");
                }
                afnlVar.i.c(afnlVar.o);
            }
        }
        return super.performClick();
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Point();
    }
}
