package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pw extends MenuInflater {
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public pw(Context context) {
        super(context);
        this.e = context;
        Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (menu instanceof gj) {
            XmlResourceParser xmlResourceParser = null;
            try {
                try {
                    xmlResourceParser = this.e.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    if (xmlResourceParser != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } finally {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        }
        super.inflate(i, menu);
    }
}
