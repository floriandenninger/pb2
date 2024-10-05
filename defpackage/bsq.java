package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bsq {
    public static final /* synthetic */ int a = 0;
    private static final Class[] b = {Context.class, AttributeSet.class};
    private static final HashMap c = new HashMap();

    public static final Preference a(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup, Context context, Object[] objArr, bsu bsuVar, String[] strArr) {
        int next;
        synchronized (objArr) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            objArr[0] = context;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        PreferenceGroup preferenceGroup2 = (PreferenceGroup) d(xmlPullParser.getName(), asAttributeSet, context, objArr, strArr);
                        if (preferenceGroup == null) {
                            preferenceGroup2.A(bsuVar);
                            preferenceGroup = preferenceGroup2;
                        }
                        b(xmlPullParser, preferenceGroup, asAttributeSet, context, objArr, bsuVar, strArr);
                    }
                } catch (InflateException e) {
                    throw e;
                } catch (IOException e2) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e2.getMessage());
                    inflateException.initCause(e2);
                    throw inflateException;
                } catch (XmlPullParserException e3) {
                    InflateException inflateException2 = new InflateException(e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
        }
        return preferenceGroup;
    }

    private static final void b(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet, Context context, Object[] objArr, bsu bsuVar, String[] strArr) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                } else {
                    next = 3;
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.t = Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, preference.q());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference d = d(name, attributeSet, context, objArr, strArr);
                    ((PreferenceGroup) preference).ae(d);
                    b(xmlPullParser, d, attributeSet, context, objArr, bsuVar, strArr);
                }
            }
        }
    }

    private static final Preference c(String str, String[] strArr, AttributeSet attributeSet, Context context, Object[] objArr) {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) c.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (strArr != null) {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (int i = 0; i < 2; i++) {
                            try {
                                cls = Class.forName(strArr[i] + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e;
                        }
                    } else {
                        cls = Class.forName(str, false, classLoader);
                    }
                    constructor = cls.getConstructor(b);
                    constructor.setAccessible(true);
                    c.put(str, constructor);
                } catch (Exception e3) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e4) {
                throw e4;
            }
        }
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private static final Preference d(String str, AttributeSet attributeSet, Context context, Object[] objArr, String[] strArr) {
        try {
            if (str.indexOf(46) == -1) {
                return c(str, strArr, attributeSet, context, objArr);
            }
            return c(str, null, attributeSet, context, objArr);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }
}
