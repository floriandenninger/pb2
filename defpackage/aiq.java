package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiq implements air {
    private static final Locale[] a = new Locale[0];
    private static final Locale b = new Locale("en", "XA");
    private static final Locale c = new Locale("ar", "XB");
    private final Locale[] d;

    static {
        aip.d("en-Latn");
    }

    public aiq(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.d = a;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException("list[" + i + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                hashSet.add(locale2);
            }
        }
        this.d = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
    }

    private static String d(Locale locale) {
        String script = locale.getScript();
        return !script.isEmpty() ? script : "";
    }

    private static boolean e(Locale locale) {
        return b.equals(locale) || c.equals(locale);
    }

    @Override // defpackage.air
    public final Object a() {
        return null;
    }

    @Override // defpackage.air
    public final Locale b(String[] strArr) {
        List asList = Arrays.asList(strArr);
        int length = this.d.length;
        int i = 0;
        if (length != 1) {
            if (length == 0) {
                i = -1;
            } else {
                Iterator it = asList.iterator();
                int i2 = Integer.MAX_VALUE;
                while (true) {
                    if (it.hasNext()) {
                        Locale d = aip.d((String) it.next());
                        int i3 = 0;
                        while (true) {
                            Locale[] localeArr = this.d;
                            if (i3 >= localeArr.length) {
                                i3 = Integer.MAX_VALUE;
                                break;
                            }
                            Locale locale = localeArr[i3];
                            if (d.equals(locale)) {
                                break;
                            }
                            if (d.getLanguage().equals(locale.getLanguage()) && !e(d) && !e(locale)) {
                                String d2 = d(d);
                                if (d2.isEmpty()) {
                                    String country = d.getCountry();
                                    if (country.isEmpty() || country.equals(locale.getCountry())) {
                                        break;
                                    }
                                } else if (d2.equals(d(locale))) {
                                    break;
                                }
                            }
                            i3++;
                        }
                        if (i3 == 0) {
                            break;
                        }
                        if (i3 < i2) {
                            i2 = i3;
                        }
                    } else if (i2 != Integer.MAX_VALUE) {
                        i = i2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.d[i];
    }

    @Override // defpackage.air
    public final Locale c() {
        Locale[] localeArr = this.d;
        if (localeArr.length > 0) {
            return localeArr[0];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aiq)) {
            return false;
        }
        Locale[] localeArr = ((aiq) obj).d;
        if (this.d.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.d;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.d;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.d;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.d.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
