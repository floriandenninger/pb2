package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ago {
    float a;
    float b;
    float c;
    float d;
    int e;
    agv f;

    public ago(Context context, XmlPullParser xmlPullParser) {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), agz.j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.e = obtainStyledAttributes.getResourceId(0, this.e);
                String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                context.getResources().getResourceName(this.e);
                if ("layout".equals(resourceTypeName)) {
                    agv agvVar = new agv();
                    this.f = agvVar;
                    agvVar.b(context, this.e);
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(1, this.d);
            } else if (index == 2) {
                this.b = obtainStyledAttributes.getDimension(2, this.b);
            } else if (index == 3) {
                this.c = obtainStyledAttributes.getDimension(3, this.c);
            } else if (index == 4) {
                this.a = obtainStyledAttributes.getDimension(4, this.a);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
