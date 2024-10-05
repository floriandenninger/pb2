package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MediaConstraints {
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class KeyValuePair {
        private final String a;
        private final String b;

        public KeyValuePair(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                KeyValuePair keyValuePair = (KeyValuePair) obj;
                if (this.a.equals(keyValuePair.a) && this.b.equals(keyValuePair.b)) {
                    return true;
                }
            }
            return false;
        }

        public String getKey() {
            return this.a;
        }

        public String getValue() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode() + this.b.hashCode();
        }

        public final String toString() {
            String str = this.a;
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(str.length() + 2 + str2.length());
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            return sb.toString();
        }
    }

    private static String a(List list) {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KeyValuePair keyValuePair = (KeyValuePair) it.next();
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append(keyValuePair.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    List getMandatory() {
        return this.a;
    }

    List getOptional() {
        return this.b;
    }

    public final String toString() {
        String a = a(this.a);
        String a2 = a(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 23 + String.valueOf(a2).length());
        sb.append("mandatory: ");
        sb.append(a);
        sb.append(", optional: ");
        sb.append(a2);
        return sb.toString();
    }
}
