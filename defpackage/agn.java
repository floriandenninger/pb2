package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agn {
    public int a;
    public ArrayList b = new ArrayList();
    int c;
    agv d;

    public agn(Context context, XmlPullParser xmlPullParser) {
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), agz.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(0, this.a);
            } else if (index == 1) {
                this.c = obtainStyledAttributes.getResourceId(1, this.c);
                String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                context.getResources().getResourceName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    agv agvVar = new agv();
                    this.d = agvVar;
                    agvVar.b(context, this.c);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
