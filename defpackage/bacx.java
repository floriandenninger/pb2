package defpackage;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bacx implements Serializable, Comparable {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final bacx b = f(new byte[0]);
    private static final long serialVersionUID = 1;
    final byte[] c;
    transient int d;
    transient String e;

    public bacx(byte[] bArr) {
        this.c = bArr;
    }

    public static bacx e(String str) {
        bacx bacxVar = new bacx(str.getBytes(badi.a));
        bacxVar.e = str;
        return bacxVar;
    }

    public static bacx f(byte... bArr) {
        return new bacx((byte[]) bArr.clone());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read == -1) {
                    throw new EOFException();
                }
                i += read;
            }
            bacx bacxVar = new bacx(bArr);
            try {
                Field declaredField = bacx.class.getDeclaredField("c");
                declaredField.setAccessible(true);
                declaredField.set(this, bacxVar.c);
                return;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
                throw new AssertionError();
            }
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("byteCount < 0: ");
        sb.append(readInt);
        throw new IllegalArgumentException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }

    public byte a(int i) {
        return this.c[i];
    }

    public int b() {
        return this.c.length;
    }

    public String c() {
        byte[] bArr = this.c;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bacx bacxVar = (bacx) obj;
        int b2 = b();
        int b3 = bacxVar.b();
        int min = Math.min(b2, b3);
        int i = 0;
        while (true) {
            if (i < min) {
                int a2 = a(i) & 255;
                int a3 = bacxVar.a(i) & 255;
                if (a2 == a3) {
                    i++;
                } else if (a2 < a3) {
                    return -1;
                }
            } else {
                if (b2 == b3) {
                    return 0;
                }
                if (b2 < b3) {
                    return -1;
                }
            }
        }
        return 1;
    }

    public String d() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, badi.a);
        this.e = str2;
        return str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bacx) {
            bacx bacxVar = (bacx) obj;
            int b2 = bacxVar.b();
            byte[] bArr = this.c;
            int length = bArr.length;
            if (b2 == length && bacxVar.g(0, bArr, 0, length)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && badi.b(bArr2, i, bArr, i2, i3);
    }

    public boolean h(bacx bacxVar, int i) {
        return bacxVar.g(0, this.c, 0, i);
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    public bacx i() {
        byte[] bArr = this.c;
        int length = bArr.length;
        if (length >= 64) {
            if (length == 64) {
                return this;
            }
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new bacx(bArr2);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("endIndex > length(");
        sb.append(length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String d = d();
        int length = d.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = d.length();
                break;
            }
            if (i2 == 64) {
                break;
            }
            int codePointAt = d.codePointAt(i);
            if (Character.isISOControl(codePointAt) && codePointAt != 10) {
                if (codePointAt != 13) {
                    break;
                }
                codePointAt = 13;
            }
            if (codePointAt == 65533) {
                break;
            }
            i2++;
            i += Character.charCount(codePointAt);
        }
        i = -1;
        if (i == -1) {
            int length2 = this.c.length;
            if (length2 <= 64) {
                String c = c();
                StringBuilder sb = new StringBuilder(c.length() + 6);
                sb.append("[hex=");
                sb.append(c);
                sb.append("]");
                return sb.toString();
            }
            String c2 = i().c();
            StringBuilder sb2 = new StringBuilder(c2.length() + 24);
            sb2.append("[size=");
            sb2.append(length2);
            sb2.append(" hex=");
            sb2.append(c2);
            sb2.append("…]");
            return sb2.toString();
        }
        String replace = d.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i < d.length()) {
            int length3 = this.c.length;
            StringBuilder sb3 = new StringBuilder(String.valueOf(replace).length() + 25);
            sb3.append("[size=");
            sb3.append(length3);
            sb3.append(" text=");
            sb3.append(replace);
            sb3.append("…]");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(replace).length() + 7);
        sb4.append("[text=");
        sb4.append(replace);
        sb4.append("]");
        return sb4.toString();
    }
}
