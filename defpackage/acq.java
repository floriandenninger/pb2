package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }

    public static final void b(Context context, int i, SparseArray sparseArray, SparseArray sparseArray2) {
        char c;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            agn agnVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    int i2 = 0;
                    int i3 = -1;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    c = 65535;
                    if (c == 2) {
                        agn agnVar2 = new agn(context, xml);
                        sparseArray.put(agnVar2.a, agnVar2);
                        agnVar = agnVar2;
                    } else if (c == 3) {
                        ago agoVar = new ago(context, xml);
                        if (agnVar != null) {
                            agnVar.b.add(agoVar);
                        }
                    } else if (c == 4) {
                        agv agvVar = new agv();
                        int attributeCount = xml.getAttributeCount();
                        while (true) {
                            if (i2 < attributeCount) {
                                String attributeName = xml.getAttributeName(i2);
                                String attributeValue = xml.getAttributeValue(i2);
                                if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                    int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                    if (identifier != -1) {
                                        i3 = identifier;
                                    } else if (attributeValue.length() > 1) {
                                        i3 = Integer.parseInt(attributeValue.substring(1));
                                    } else {
                                        Log.e("ConstraintLayoutStates", "error in parsing id");
                                    }
                                    agvVar.d(context, xml);
                                    sparseArray2.put(i3, agvVar);
                                }
                                i2++;
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
