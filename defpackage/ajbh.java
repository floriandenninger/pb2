package defpackage;

import android.content.res.TypedArray;
import android.opengl.GLES20;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.List;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajbh {
    private static ajbh a;
    public int i;

    public ajbh(int i) {
        this.i = i;
    }

    public ajbh(View view, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, alj.a, i, i2);
            this.i = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }

    public ajbh(byte[] bArr) {
        this.i = 1;
    }

    public ajbh(byte[] bArr, byte[] bArr2) {
    }

    public ajbh(byte[] bArr, char[] cArr) {
    }

    public ajbh(char[] cArr) {
        this.i = 0;
    }

    public ajbh(char[] cArr, byte[] bArr) {
        this.i = -1;
    }

    public ajbh(int[] iArr) {
        this.i = 5;
    }

    public ajbh(short[] sArr) {
        this.i = 1;
    }

    public ajbh(short[] sArr, byte[] bArr) {
    }

    public static String S(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void V(Throwable... thArr) {
        if (thArr.length > 0) {
            Throwable th = thArr[0];
        }
    }

    public static synchronized ajbh X() {
        ajbh ajbhVar;
        synchronized (ajbh.class) {
            if (a == null) {
                a = new ajbh(3);
            }
            ajbhVar = a;
        }
        return ajbhVar;
    }

    public static synchronized void Y(ajbh ajbhVar) {
        synchronized (ajbh.class) {
            a = ajbhVar;
        }
    }

    private static int w(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            int glGetError = GLES20.glGetError();
            StringBuilder sb = new StringBuilder(50);
            sb.append("glCreateShader() failed. GLES20 error: ");
            sb.append(glGetError);
            throw new RuntimeException(sb.toString());
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            StringBuilder sb2 = new StringBuilder(String.valueOf(glGetShaderInfoLog).length() + 26 + String.valueOf(str).length());
            sb2.append("Compile error ");
            sb2.append(glGetShaderInfoLog);
            sb2.append(" in shader:\n");
            sb2.append(str);
            Logging.b("GlShader", sb2.toString());
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        aynu.s("compileShader");
        return glCreateShader;
    }

    private static boolean y(char c) {
        return "\\[]?*(|)^$.{}+".indexOf(c) >= 0;
    }

    public void E(ajat ajatVar) {
    }

    public final boolean G() {
        return this.i != 0;
    }

    public final synchronized void H() {
        this.i = 2;
    }

    public final synchronized void I() {
        this.i = 1;
    }

    public final synchronized void J() {
        this.i = 3;
    }

    public final int K(String str) {
        int i = this.i;
        if (i == -1) {
            throw new RuntimeException("The program has been released");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (glGetAttribLocation >= 0) {
            return glGetAttribLocation;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Could not locate '");
        sb.append(str);
        sb.append("' in program");
        throw new RuntimeException(sb.toString());
    }

    public final int L(String str) {
        int i = this.i;
        if (i == -1) {
            throw new RuntimeException("The program has been released");
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (glGetUniformLocation >= 0) {
            return glGetUniformLocation;
        }
        StringBuilder sb = new StringBuilder(str.length() + 38);
        sb.append("Could not locate uniform '");
        sb.append(str);
        sb.append("' in program");
        throw new RuntimeException(sb.toString());
    }

    public final void M() {
        Logging.a("GlShader", "Deleting shader.");
        int i = this.i;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.i = -1;
        }
    }

    public final void N() {
        if (this.i == -1) {
            throw new RuntimeException("The program has been released");
        }
        synchronized (baom.b) {
            GLES20.glUseProgram(this.i);
        }
        aynu.s("glUseProgram");
    }

    public final void O(Object obj, Object obj2) {
        if (this.i == 0 && obj != obj2) {
            if (obj == null) {
                this.i = -1;
                return;
            }
            if (obj2 == null) {
                this.i = 1;
                return;
            }
            if (obj.getClass().isArray()) {
                int i = 0;
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    long[] jArr2 = (long[]) obj2;
                    if (this.i == 0 && jArr != jArr2) {
                        int length = jArr.length;
                        int length2 = jArr2.length;
                        if (length != length2) {
                            this.i = length >= length2 ? 1 : -1;
                            return;
                        }
                        while (i < jArr.length && this.i == 0) {
                            this.i = (jArr[i] > jArr2[i] ? 1 : (jArr[i] == jArr2[i] ? 0 : -1));
                            i++;
                        }
                        return;
                    }
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int[] iArr2 = (int[]) obj2;
                    if (this.i != 0 || iArr == iArr2) {
                        return;
                    }
                    int length3 = iArr.length;
                    int length4 = iArr2.length;
                    if (length3 != length4) {
                        this.i = length3 >= length4 ? 1 : -1;
                        return;
                    }
                    for (int i2 = 0; i2 < iArr.length && this.i == 0; i2++) {
                        int i3 = iArr[i2];
                        int i4 = iArr2[i2];
                        this.i = i3 == i4 ? 0 : i3 < i4 ? -1 : 1;
                    }
                    return;
                }
                if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    short[] sArr2 = (short[]) obj2;
                    if (this.i != 0 || sArr == sArr2) {
                        return;
                    }
                    int length5 = sArr.length;
                    int length6 = sArr2.length;
                    if (length5 != length6) {
                        this.i = length5 >= length6 ? 1 : -1;
                        return;
                    }
                    while (i < sArr.length && this.i == 0) {
                        this.i = sArr[i] - sArr2[i];
                        i++;
                    }
                    return;
                }
                if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    char[] cArr2 = (char[]) obj2;
                    if (this.i != 0 || cArr == cArr2) {
                        return;
                    }
                    int length7 = cArr.length;
                    int length8 = cArr2.length;
                    if (length7 != length8) {
                        this.i = length7 >= length8 ? 1 : -1;
                        return;
                    }
                    while (i < cArr.length && this.i == 0) {
                        this.i = cArr[i] - cArr2[i];
                        i++;
                    }
                    return;
                }
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    if (this.i != 0 || bArr == bArr2) {
                        return;
                    }
                    int length9 = bArr.length;
                    int length10 = bArr2.length;
                    if (length9 != length10) {
                        this.i = length9 >= length10 ? 1 : -1;
                        return;
                    }
                    while (i < bArr.length && this.i == 0) {
                        this.i = bArr[i] - bArr2[i];
                        i++;
                    }
                    return;
                }
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    double[] dArr2 = (double[]) obj2;
                    if (this.i != 0 || dArr == dArr2) {
                        return;
                    }
                    int length11 = dArr.length;
                    int length12 = dArr2.length;
                    if (length11 != length12) {
                        this.i = length11 >= length12 ? 1 : -1;
                        return;
                    }
                    while (i < dArr.length && this.i == 0) {
                        this.i = Double.compare(dArr[i], dArr2[i]);
                        i++;
                    }
                    return;
                }
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    if (this.i != 0 || fArr == fArr2) {
                        return;
                    }
                    int length13 = fArr.length;
                    int length14 = fArr2.length;
                    if (length13 != length14) {
                        this.i = length13 >= length14 ? 1 : -1;
                        return;
                    }
                    while (i < fArr.length && this.i == 0) {
                        this.i = Float.compare(fArr[i], fArr2[i]);
                        i++;
                    }
                    return;
                }
                if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    boolean[] zArr2 = (boolean[]) obj2;
                    if (this.i != 0 || zArr == zArr2) {
                        return;
                    }
                    int length15 = zArr.length;
                    int length16 = zArr2.length;
                    if (length15 != length16) {
                        this.i = length15 >= length16 ? 1 : -1;
                        return;
                    }
                    while (i < zArr.length && this.i == 0) {
                        boolean z = zArr[i];
                        if (z != zArr2[i]) {
                            if (z) {
                                this.i = 1;
                            } else {
                                this.i = -1;
                            }
                        }
                        i++;
                    }
                    return;
                }
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (this.i != 0 || objArr == objArr2) {
                    return;
                }
                int length17 = objArr.length;
                int length18 = objArr2.length;
                if (length17 != length18) {
                    this.i = length17 >= length18 ? 1 : -1;
                    return;
                }
                while (i < objArr.length && this.i == 0) {
                    O(objArr[i], objArr2[i]);
                    i++;
                }
                return;
            }
            this.i = ((Comparable) obj).compareTo(obj2);
        }
    }

    public final synchronized int P(agcg agcgVar) {
        agcg agcgVar2 = agcg.REGISTRATION;
        int ordinal = agcgVar.ordinal();
        if (ordinal == 0) {
            int i = this.i;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    this.i = 4;
                }
            }
            this.i = 2;
        } else if (ordinal == 1) {
            int i3 = this.i;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    this.i = 5;
                }
            }
            this.i = 3;
        } else if (ordinal == 2) {
            int i5 = this.i;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 1 || i6 == 2) {
                this.i = 1;
            } else {
                if (i6 != 3) {
                    if (i6 != 4) {
                    }
                    this.i = 3;
                }
                this.i = 2;
            }
        }
        return this.i;
    }

    public final float Q(auds audsVar, List list, int i, int i2) {
        if (i != 0) {
            float f = 0.0f;
            while (i2 < list.size()) {
                f += ((Float) list.get(i2)).floatValue() * Q(audsVar, list, i - 1, i2);
                i2++;
            }
            return f;
        }
        int i3 = this.i;
        this.i = i3 + 1;
        return audsVar.d.d(i3);
    }

    public final boolean R(char[] cArr, StringBuilder sb, boolean z) {
        int length = cArr.length;
        loop0: while (true) {
            int i = this.i;
            if (i >= length) {
                return i == length;
            }
            int i2 = i + 1;
            this.i = i2;
            char c = cArr[i];
            if (c == '*') {
                sb.append(".*");
            } else if (c == ',') {
                if (true == z) {
                    c = '|';
                }
                sb.append(c);
            } else if (c == '?') {
                sb.append('.');
            } else if (c == '{') {
                sb.append('(');
                if (!R(cArr, sb, true)) {
                    return false;
                }
            } else if (c != '}') {
                if (c == '[') {
                    sb.append(c);
                    int i3 = this.i;
                    if (i3 == length) {
                        break;
                    }
                    this.i = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == '!') {
                        sb.append('^');
                        int i4 = this.i;
                        if (i4 == length) {
                            break;
                        }
                        this.i = i4 + 1;
                        c2 = cArr[i4];
                    }
                    if (c2 == ']') {
                        sb.append(']');
                        int i5 = this.i;
                        if (i5 != length) {
                            this.i = i5 + 1;
                            c2 = cArr[i5];
                        } else {
                            continue;
                        }
                    }
                    while (c2 != ']') {
                        sb.append(c2);
                        int i6 = this.i;
                        if (i6 == length) {
                            break loop0;
                        }
                        this.i = i6 + 1;
                        c2 = cArr[i6];
                    }
                    sb.append(']');
                } else if (c != '\\') {
                    if (y(c)) {
                        sb.append('\\');
                    }
                    sb.append(c);
                } else {
                    if (i2 == length) {
                        return false;
                    }
                    this.i = i2 + 1;
                    char c3 = cArr[i2];
                    if (y(c3)) {
                        sb.append('\\');
                    }
                    sb.append(c3);
                }
            } else if (!z) {
                sb.append("\\}");
            } else {
                sb.append(')');
                return true;
            }
        }
        return false;
    }

    public final void T(Throwable... thArr) {
        if (this.i > 3 || thArr.length <= 0) {
            return;
        }
        Throwable th = thArr[0];
    }

    public Parcelable ai() {
        return null;
    }

    public void aj(ahef ahefVar) {
    }

    public void ak(ahcr ahcrVar) {
    }

    public void b() {
    }

    public void c(String str) {
    }

    public void e(aheg ahegVar) {
    }

    public void f(Parcelable parcelable, ansv ansvVar) {
    }

    public void g(avzr avzrVar, String str) {
    }

    public void h(aeqq aeqqVar, String str) {
    }

    public void i(aeqq aeqqVar, String str) {
    }

    public void j(String str, afgj afgjVar, String str2) {
    }

    public void k(avzr avzrVar, String str) {
    }

    public void l(String str, String str2) {
    }

    public void m(String str) {
    }

    public void n(afih afihVar, String str) {
    }

    public void o(String str, PlaybackStartDescriptor playbackStartDescriptor) {
    }

    public void p(String str) {
    }

    public void q(String str) {
    }

    public void r(aigr aigrVar) {
    }

    public void s(String str, String str2, String str3) {
    }

    public void t() {
    }

    public void u(aifb aifbVar) {
    }

    public void v(ahej ahejVar) {
    }

    public static void U(String str, String str2, Throwable... thArr) {
        if (thArr.length > 0) {
            Log.e(str, str2, thArr[0]);
        } else {
            Log.e(str, str2);
        }
    }

    public static void W(String str, String str2, Throwable... thArr) {
        if (thArr.length > 0) {
            Log.w(str, str2, thArr[0]);
        } else {
            Log.w(str, str2);
        }
    }

    public ajbh() {
        this(0);
    }

    public ajbh(String str) {
        int w = w(35633, "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n");
        int w2 = w(35632, str);
        int glCreateProgram = GLES20.glCreateProgram();
        this.i = glCreateProgram;
        if (glCreateProgram == 0) {
            int glGetError = GLES20.glGetError();
            StringBuilder sb = new StringBuilder(51);
            sb.append("glCreateProgram() failed. GLES20 error: ");
            sb.append(glGetError);
            throw new RuntimeException(sb.toString());
        }
        GLES20.glAttachShader(glCreateProgram, w);
        GLES20.glAttachShader(this.i, w2);
        GLES20.glLinkProgram(this.i);
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.i, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(this.i));
            Logging.b("GlShader", valueOf.length() != 0 ? "Could not link program: ".concat(valueOf) : new String("Could not link program: "));
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.i));
        }
        GLES20.glDeleteShader(w);
        GLES20.glDeleteShader(w2);
        aynu.s("Creating GlShader");
    }
}
